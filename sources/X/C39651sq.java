package X;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.1sq  reason: invalid class name and case insensitive filesystem */
public class C39651sq {
    public static final C39651sq A01 = new C39651sq("USD");
    public static final C39651sq A02 = new C39651sq("XXX");
    public final String A00;

    public C39651sq(String str) {
        if (str.length() == 3) {
            this.A00 = str.toUpperCase(Locale.US);
            return;
        }
        StringBuilder sb = new StringBuilder("invalid currency code; currencyCode=");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int A00(String str) {
        Number number = (Number) AnonymousClass38I.A01.get(str.toUpperCase(Locale.US));
        if (number == null) {
            return 2;
        }
        return number.intValue();
    }

    public final C39751t0 A01(AnonymousClass013 r7, int i2, boolean z2) {
        String A08 = r7.A08(C39751t0.A00(AnonymousClass1WH.A03(AnonymousClass013.A00(r7.A00))));
        if (A08.isEmpty()) {
            A08 = C39751t0.A0A;
        }
        C39781t3 r5 = new C39781t3(A08, z2);
        Locale A002 = AnonymousClass013.A00(r7.A00);
        String str = r5.A01.A00;
        String str2 = r5.A00.A00;
        if (!str.equals(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(";");
            sb.append(str2);
            str = sb.toString();
        }
        C39751t0 r1 = new C39751t0(r5, new C39761t1(str, A002), r7);
        r1.A00 = this.A00;
        r1.A01 = A02(r7);
        r1.A07.A03(i2);
        return r1;
    }

    public String A02(AnonymousClass013 r3) {
        HashMap hashMap = AnonymousClass38I.A02;
        String str = this.A00;
        Number number = (Number) hashMap.get(str);
        return number == null ? str : A04(r3.A08(number.intValue()));
    }

    public String A03(AnonymousClass013 r5, BigDecimal bigDecimal, boolean z2) {
        C39751t0 A012 = A01(r5, bigDecimal.scale(), z2);
        String A022 = A012.A07.A02(bigDecimal);
        if (!A012.A02.A02) {
            return A022;
        }
        boolean z3 = false;
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            z3 = true;
        }
        return A012.A01(A022, z3);
    }

    public final String A04(String str) {
        if (str.isEmpty()) {
            return this.A00;
        }
        C88944bL r8 = C88944bL.A03;
        if (r8.A00(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2);
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            String[] strArr = (String[]) AnonymousClass38F.A00.get(Integer.valueOf(codePointAt));
            if (strArr != null && strArr.length != 0) {
                if (strArr.length != 1) {
                    int length2 = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        }
                        String str2 = strArr[i3];
                        if (!r8.A00(str2)) {
                            i3++;
                        } else if (str2 != null) {
                            sb.append(str2);
                        }
                    }
                } else {
                    sb.append(strArr[0]);
                }
                i2 += Character.charCount(codePointAt);
            }
            sb.appendCodePoint(codePointAt);
            i2 += Character.charCount(codePointAt);
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C39651sq) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
