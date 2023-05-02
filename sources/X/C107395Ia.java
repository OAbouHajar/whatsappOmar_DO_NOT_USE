package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: X.5Ia  reason: invalid class name and case insensitive filesystem */
public class C107395Ia extends C32051fZ {
    public byte[] A00;

    public C107395Ia(String str) {
        this.A00 = C32941ha.A03(str);
        try {
            A0C();
        } catch (ParseException e2) {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("invalid date string: ")));
        }
    }

    public C107395Ia(byte[] bArr) {
        String str;
        if (bArr.length >= 4) {
            this.A00 = bArr;
            if (!A0G(0) || !A0G(1) || !A0G(2) || !A0G(3)) {
                str = "illegal characters in GeneralizedTime string";
            } else {
                return;
            }
        } else {
            str = "GeneralizedTime string too short";
        }
        throw AnonymousClass000.A0T(str);
    }

    public static final String A00(String str) {
        StringBuilder A0o;
        String str2;
        String substring = str.substring(14);
        int i2 = 1;
        while (i2 < substring.length() && '0' <= (r1 = substring.charAt(i2)) && r1 <= '9') {
            i2++;
        }
        int i3 = i2 - 1;
        if (i3 > 3) {
            A0o = AnonymousClass000.A0o();
            str2 = substring.substring(0, 4);
        } else if (i3 == 1) {
            A0o = AnonymousClass000.A0o();
            AnonymousClass3K3.A1M(substring, A0o, 0, i2);
            str2 = "00";
        } else if (i3 != 2) {
            return str;
        } else {
            A0o = AnonymousClass000.A0o();
            AnonymousClass3K3.A1M(substring, A0o, 0, i2);
            str2 = "0";
        }
        A0o.append(str2);
        String A0h = AnonymousClass000.A0h(substring.substring(i2), A0o);
        StringBuilder A0o2 = AnonymousClass000.A0o();
        AnonymousClass3K3.A1M(str, A0o2, 0, 14);
        return AnonymousClass000.A0h(A0h, A0o2);
    }

    public static C107395Ia A01(Object obj) {
        if (obj == null || (obj instanceof C107395Ia)) {
            return (C107395Ia) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C107395Ia) C32051fZ.A02((byte[]) obj);
            } catch (Exception e2) {
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("encoding error in getInstance: ")));
            }
        } else {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(obj), AnonymousClass000.A0r("illegal object in getInstance: ")));
        }
    }

    public int A03() {
        int length = (this instanceof C107265Hb ? ((C107265Hb) this).A0H() : this.A00).length;
        return C32551gZ.A00(length) + 1 + length;
    }

    public C32051fZ A05() {
        return new C107265Hb(this.A00);
    }

    public C32051fZ A06() {
        return new C107265Hb(this.A00);
    }

    public void A07(C33061hs r3, boolean z2) {
        r3.A06(this instanceof C107265Hb ? ((C107265Hb) this).A0H() : this.A00, 24, z2);
    }

    public boolean A08() {
        return false;
    }

    public boolean A09(C32051fZ r3) {
        if (!(r3 instanceof C107395Ia)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C107395Ia) r3).A00);
    }

    public String A0A() {
        StringBuilder sb;
        String str;
        StringBuilder A0q;
        String str2;
        String A0h;
        String A02 = C32941ha.A02(this.A00);
        int length = A02.length();
        int i2 = length - 1;
        if (A02.charAt(i2) == 'Z') {
            A0q = AnonymousClass000.A0o();
            AnonymousClass3K3.A1M(A02, A0q, 0, i2);
            A0h = "GMT+00:00";
        } else {
            int i3 = length - 6;
            char charAt = A02.charAt(i3);
            if ((charAt == '-' || charAt == '+') && A02.indexOf("GMT") == i3 - 3) {
                return A02;
            }
            int i4 = length - 5;
            char charAt2 = A02.charAt(i4);
            if (charAt2 == '-' || charAt2 == '+') {
                sb = AnonymousClass000.A0o();
                AnonymousClass3K3.A1M(A02, sb, 0, i4);
                sb.append("GMT");
                int i5 = i4 + 3;
                AnonymousClass3K3.A1M(A02, sb, i4, i5);
                sb.append(":");
                str = A02.substring(i5);
            } else {
                int i6 = length - 3;
                char charAt3 = A02.charAt(i6);
                if (charAt3 == '-' || charAt3 == '+') {
                    sb = AnonymousClass000.A0o();
                    AnonymousClass3K3.A1M(A02, sb, 0, i6);
                    sb.append("GMT");
                    sb.append(A02.substring(i6));
                    str = ":00";
                } else {
                    A0q = AnonymousClass000.A0q(A02);
                    TimeZone timeZone = TimeZone.getDefault();
                    int rawOffset = timeZone.getRawOffset();
                    if (rawOffset < 0) {
                        rawOffset = -rawOffset;
                        str2 = "-";
                    } else {
                        str2 = "+";
                    }
                    int i7 = rawOffset / 3600000;
                    int i8 = (rawOffset - (((i7 * 60) * 60) * 1000)) / 60000;
                    try {
                        if (timeZone.useDaylightTime()) {
                            if (A0D()) {
                                A02 = A00(A02);
                            }
                            SimpleDateFormat A0B = A0B();
                            StringBuilder A0q2 = AnonymousClass000.A0q(A02);
                            A0q2.append("GMT");
                            A0q2.append(str2);
                            A0q2.append(i7 < 10 ? C13680ns.A0c(i7, "0") : Integer.toString(i7));
                            A0q2.append(":");
                            if (timeZone.inDaylightTime(A0B.parse(AnonymousClass000.A0h(i8 < 10 ? C13680ns.A0c(i8, "0") : Integer.toString(i8), A0q2)))) {
                                int i9 = -1;
                                if (str2.equals("+")) {
                                    i9 = 1;
                                }
                                i7 += i9;
                            }
                        }
                    } catch (ParseException unused) {
                    }
                    StringBuilder A0q3 = AnonymousClass000.A0q("GMT");
                    A0q3.append(str2);
                    A0q3.append(i7 < 10 ? C13680ns.A0c(i7, "0") : Integer.toString(i7));
                    A0q3.append(":");
                    A0h = AnonymousClass000.A0h(i8 < 10 ? C13680ns.A0c(i8, "0") : Integer.toString(i8), A0q3);
                }
            }
            return AnonymousClass000.A0h(str, sb);
        }
        return AnonymousClass000.A0h(A0h, A0q);
    }

    public final SimpleDateFormat A0B() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(A0D() ? "yyyyMMddHHmmss.SSSz" : A0F() ? "yyyyMMddHHmmssz" : A0E() ? "yyyyMMddHHmmz" : "yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date A0C() {
        /*
            r5 = this;
            byte[] r0 = r5.A00
            java.lang.String r2 = X.C32941ha.A02(r0)
            java.lang.String r4 = "Z"
            boolean r0 = r2.endsWith(r4)
            r3 = 0
            if (r0 == 0) goto L_0x004c
            boolean r0 = r5.A0D()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "yyyyMMddHHmmss.SSS'Z'"
        L_0x0017:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
        L_0x001c:
            java.util.SimpleTimeZone r0 = new java.util.SimpleTimeZone
            r0.<init>(r3, r4)
            r1.setTimeZone(r0)
        L_0x0024:
            boolean r0 = r5.A0D()
            if (r0 == 0) goto L_0x002e
            java.lang.String r2 = A00(r2)
        L_0x002e:
            java.util.Date r0 = r1.parse(r2)
            java.util.Date r0 = X.AnonymousClass4Z8.A00(r0)
            return r0
        L_0x0037:
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "yyyyMMddHHmmss'Z'"
            goto L_0x0017
        L_0x0040:
            boolean r0 = r5.A0E()
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "yyyyMMddHHmm'Z'"
            goto L_0x0017
        L_0x0049:
            java.lang.String r0 = "yyyyMMddHH'Z'"
            goto L_0x0017
        L_0x004c:
            r0 = 45
            int r0 = r2.indexOf(r0)
            if (r0 > 0) goto L_0x0087
            r0 = 43
            int r0 = r2.indexOf(r0)
            if (r0 > 0) goto L_0x0087
            boolean r0 = r5.A0D()
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "yyyyMMddHHmmss.SSS"
        L_0x0064:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r4 = r0.getID()
            goto L_0x001c
        L_0x0072:
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "yyyyMMddHHmmss"
            goto L_0x0064
        L_0x007b:
            boolean r0 = r5.A0E()
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "yyyyMMddHHmm"
            goto L_0x0064
        L_0x0084:
            java.lang.String r0 = "yyyyMMddHH"
            goto L_0x0064
        L_0x0087:
            java.lang.String r2 = r5.A0A()
            java.text.SimpleDateFormat r1 = r5.A0B()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107395Ia.A0C():java.util.Date");
    }

    public boolean A0D() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.A00;
            if (i2 == bArr.length) {
                return false;
            }
            if (bArr[i2] == 46 && i2 == 14) {
                return true;
            }
            i2++;
        }
    }

    public boolean A0E() {
        return A0G(10) && A0G(11);
    }

    public boolean A0F() {
        return A0G(12) && A0G(13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r1[r4];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0G(int r4) {
        /*
            r3 = this;
            byte[] r1 = r3.A00
            int r0 = r1.length
            if (r0 <= r4) goto L_0x0010
            byte r2 = r1[r4]
            r0 = 48
            if (r2 < r0) goto L_0x0010
            r1 = 57
            r0 = 1
            if (r2 <= r1) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107395Ia.A0G(int):boolean");
    }

    public int hashCode() {
        return C33111hx.A00(this.A00);
    }
}
