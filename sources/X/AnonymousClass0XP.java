package X;

import android.support.v4.view.MotionEventCompat;
import com.AssemMods.translator.Language;
import com.mod.bomfab.R$styleable;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xml.sax.Attributes;

/* renamed from: X.0XP  reason: invalid class name */
public class AnonymousClass0XP {
    public int A00;
    public C13170la A01 = null;
    public AnonymousClass0Rz A02 = null;
    public AnonymousClass0K7 A03 = null;
    public StringBuilder A04 = null;
    public StringBuilder A05 = null;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;

    public static float A00(float f2, float f3, float f4) {
        float f5;
        if (f4 < 0.0f) {
            f4 += 6.0f;
        }
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        if (f4 < 1.0f) {
            f5 = (f3 - f2) * f4;
        } else if (f4 < 3.0f) {
            return f3;
        } else {
            if (f4 >= 4.0f) {
                return f2;
            }
            f5 = (f3 - f2) * (4.0f - f4);
        }
        return f5 + f2;
    }

    public static float A01(String str, int i2) {
        float A002 = new AnonymousClass0UR().A00(str, 0, i2);
        if (!Float.isNaN(A002)) {
            return A002;
        }
        throw C11550ix.A00(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Invalid float value: ")));
    }

    public static int A02(float f2) {
        if (f2 >= 0.0f) {
            return f2 > 255.0f ? MotionEventCompat.ACTION_MASK : Math.round(f2);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r7 <= 0.5f) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(float r5, float r6, float r7) {
        /*
            r1 = 1135869952(0x43b40000, float:360.0)
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            float r5 = r5 % r1
            if (r0 >= 0) goto L_0x0009
            float r5 = r5 + r1
        L_0x0009:
            r0 = 1114636288(0x42700000, float:60.0)
            float r5 = r5 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            float r7 = r7 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            r6 = 0
        L_0x0017:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L_0x0055
            r2 = r7
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0055
        L_0x0028:
            float r6 = r6 + r1
            float r6 = r6 * r2
        L_0x002a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r1
            float r2 = r2 - r6
            float r0 = r5 + r1
            float r0 = A00(r2, r6, r0)
            float r4 = A00(r2, r6, r5)
            float r5 = r5 - r1
            float r3 = A00(r2, r6, r5)
            r2 = 1132462080(0x43800000, float:256.0)
            float r0 = r0 * r2
            int r0 = A02(r0)
            int r1 = r0 << 16
            float r4 = r4 * r2
            int r0 = A02(r4)
            int r0 = r0 << 8
            r1 = r1 | r0
            float r3 = r3 * r2
            int r0 = A02(r3)
            r0 = r0 | r1
            return r0
        L_0x0055:
            float r0 = r2 + r6
            float r6 = r6 * r2
            float r6 = r0 - r6
            goto L_0x002a
        L_0x005b:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XP.A03(float, float, float):int");
    }

    public static int A04(C11060i8 r0, int i2) {
        C03830Ka r02 = (C03830Ka) C03830Ka.A00.get(r0.getLocalName(i2));
        if (r02 == null) {
            r02 = C03830Ka.A03;
        }
        return r02.ordinal();
    }

    public static int A05(Attributes attributes, int i2) {
        C03830Ka r0 = (C03830Ka) C03830Ka.A00.get(attributes.getLocalName(i2));
        if (r0 == null) {
            r0 = C03830Ka.A03;
        }
        return r0.ordinal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a8, code lost:
        if (X.AnonymousClass000.A1R(r5.A01, r5.A00) != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01aa, code lost:
        r5.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01af, code lost:
        r0 = X.AnonymousClass000.A0q("Invalid transform list: ");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Matrix A06(java.lang.String r20) {
        /*
            android.graphics.Matrix r6 = X.AnonymousClass000.A0H()
            X.0VC r5 = new X.0VC
            r2 = r20
            r5.<init>(r2)
            r5.A0C()
        L_0x000e:
            int r1 = r5.A01
            int r0 = r5.A00
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)
            if (r0 != 0) goto L_0x0210
            int r7 = r5.A01
            java.lang.String r4 = r5.A03
            char r3 = r4.charAt(r7)
        L_0x0020:
            r0 = 97
            if (r3 < r0) goto L_0x0202
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 <= r0) goto L_0x020a
        L_0x0028:
            int r1 = r5.A01
        L_0x002a:
            boolean r0 = X.AnonymousClass0VC.A01(r3)
            if (r0 == 0) goto L_0x0035
            int r3 = r5.A05()
            goto L_0x002a
        L_0x0035:
            r0 = 40
            if (r3 != r0) goto L_0x01f6
            int r0 = r5.A01
            int r0 = r0 + 1
            r5.A01 = r0
            java.lang.String r1 = r4.substring(r7, r1)
            if (r1 == 0) goto L_0x01f6
            r3 = -1
            int r0 = r1.hashCode()
            r20 = 5
            r19 = 4
            r18 = 3
            r17 = 2
            r16 = 1
            r15 = 0
            switch(r0) {
                case -1081239615: goto L_0x01b4;
                case -925180581: goto L_0x01bf;
                case 109250890: goto L_0x01ca;
                case 109493390: goto L_0x01d5;
                case 109493391: goto L_0x01e0;
                case 1052832078: goto L_0x01eb;
                default: goto L_0x0058;
            }
        L_0x0058:
            r11 = 0
            r13 = 41
            java.lang.String r14 = "Invalid transform list: "
            switch(r3) {
                case 0: goto L_0x009e;
                case 1: goto L_0x00ff;
                case 2: goto L_0x0131;
                case 3: goto L_0x0159;
                case 4: goto L_0x017d;
                case 5: goto L_0x0074;
                default: goto L_0x0060;
            }
        L_0x0060:
            java.lang.String r0 = "Invalid transform list fn: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r2.append(r1)
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
        L_0x006f:
            X.0ix r0 = X.C11550ix.A00(r0)
            throw r0
        L_0x0074:
            r5.A0C()
            float r3 = r5.A02()
            float r1 = r5.A03()
            r5.A0C()
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x01af
            boolean r0 = r5.A0E(r13)
            if (r0 == 0) goto L_0x01af
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x0099
            r6.preTranslate(r3, r11)
            goto L_0x01a0
        L_0x0099:
            r6.preTranslate(r3, r1)
            goto L_0x01a0
        L_0x009e:
            r5.A0C()
            float r12 = r5.A02()
            r5.A0D()
            float r10 = r5.A02()
            r5.A0D()
            float r9 = r5.A02()
            r5.A0D()
            float r8 = r5.A02()
            r5.A0D()
            float r7 = r5.A02()
            r5.A0D()
            float r1 = r5.A02()
            r5.A0C()
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x01af
            boolean r0 = r5.A0E(r13)
            if (r0 == 0) goto L_0x01af
            android.graphics.Matrix r4 = X.AnonymousClass000.A0H()
            r0 = 9
            float[] r3 = new float[r0]
            r3[r15] = r12
            r3[r16] = r9
            r3[r17] = r7
            r3[r18] = r10
            r3[r19] = r8
            r3[r20] = r1
            r0 = 6
            r3[r0] = r11
            r0 = 7
            r3[r0] = r11
            r1 = 8
            r0 = 1065353216(0x3f800000, float:1.0)
            r3[r1] = r0
            r4.setValues(r3)
            r6.preConcat(r4)
            goto L_0x01a0
        L_0x00ff:
            r5.A0C()
            float r4 = r5.A02()
            float r3 = r5.A03()
            float r1 = r5.A03()
            r5.A0C()
            boolean r0 = java.lang.Float.isNaN(r4)
            if (r0 != 0) goto L_0x01af
            boolean r0 = r5.A0E(r13)
            if (r0 == 0) goto L_0x01af
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto L_0x0127
            r6.preRotate(r4)
            goto L_0x01a0
        L_0x0127:
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x01af
            r6.preRotate(r4, r3, r1)
            goto L_0x01a0
        L_0x0131:
            r5.A0C()
            float r3 = r5.A02()
            float r1 = r5.A03()
            r5.A0C()
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x01af
            boolean r0 = r5.A0E(r13)
            if (r0 == 0) goto L_0x01af
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x0155
            r6.preScale(r3, r3)
            goto L_0x01a0
        L_0x0155:
            r6.preScale(r3, r1)
            goto L_0x01a0
        L_0x0159:
            r5.A0C()
            float r1 = r5.A02()
            r5.A0C()
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x01af
            boolean r0 = r5.A0E(r13)
            if (r0 == 0) goto L_0x01af
            double r0 = (double) r1
            double r0 = java.lang.Math.toRadians(r0)
            double r3 = java.lang.Math.tan(r0)
            float r0 = (float) r3
            r6.preSkew(r0, r11)
            goto L_0x01a0
        L_0x017d:
            r5.A0C()
            float r1 = r5.A02()
            r5.A0C()
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x01af
            boolean r0 = r5.A0E(r13)
            if (r0 == 0) goto L_0x01af
            double r0 = (double) r1
            double r0 = java.lang.Math.toRadians(r0)
            double r3 = java.lang.Math.tan(r0)
            float r0 = (float) r3
            r6.preSkew(r11, r0)
        L_0x01a0:
            int r1 = r5.A01
            int r0 = r5.A00
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)
            if (r0 != 0) goto L_0x0210
            r5.A0D()
            goto L_0x000e
        L_0x01af:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r14)
            goto L_0x01fc
        L_0x01b4:
            java.lang.String r0 = "matrix"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            r3 = 0
            goto L_0x0058
        L_0x01bf:
            java.lang.String r0 = "rotate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            r3 = 1
            goto L_0x0058
        L_0x01ca:
            java.lang.String r0 = "scale"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            r3 = 2
            goto L_0x0058
        L_0x01d5:
            java.lang.String r0 = "skewX"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            r3 = 3
            goto L_0x0058
        L_0x01e0:
            java.lang.String r0 = "skewY"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            r3 = 4
            goto L_0x0058
        L_0x01eb:
            java.lang.String r0 = "translate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            r3 = 5
            goto L_0x0058
        L_0x01f6:
            java.lang.String r0 = "Bad transform function encountered in transform list: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
        L_0x01fc:
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            goto L_0x006f
        L_0x0202:
            r0 = 65
            if (r3 < r0) goto L_0x0028
            r0 = 90
            if (r3 > r0) goto L_0x0028
        L_0x020a:
            int r3 = r5.A05()
            goto L_0x0020
        L_0x0210:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XP.A06(java.lang.String):android.graphics.Matrix");
    }

    public static AnonymousClass0I5 A07(String str) {
        String str2;
        StringBuilder sb;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str3;
        int A022;
        long j2;
        int i7;
        String str4 = str;
        int i8 = 5;
        if (str.charAt(0) == '#') {
            int length = str4.length();
            C06010Tw r8 = null;
            if (1 < length) {
                long j3 = 0;
                int i9 = 1;
                while (true) {
                    char charAt = str4.charAt(i9);
                    if (charAt >= '0') {
                        if (charAt <= '9') {
                            j3 = (j3 * 16) + ((long) (charAt - '0'));
                        } else if (charAt < 'A') {
                            break;
                        } else {
                            if (charAt > 'F') {
                                if (charAt < 'a' || charAt > 'f') {
                                    break;
                                }
                                j2 = j3 * 16;
                                i7 = charAt - 'a';
                            } else {
                                j2 = j3 * 16;
                                i7 = charAt - 'A';
                            }
                            j3 = j2 + ((long) i7) + 10;
                        }
                        if (j3 <= 4294967295L) {
                            i9++;
                            if (i9 >= length) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i9 != 1) {
                    r8 = new C06010Tw(j3, i9);
                }
            }
            if (r8 != null) {
                int i10 = r8.A00;
                if (i10 == 4) {
                    int i11 = (int) r8.A01;
                    int i12 = i11 & 3840;
                    int i13 = i11 & 240;
                    int i14 = i11 & 15;
                    i3 = i14 | (i12 << 8) | -16777216 | (i12 << 12) | (i13 << 8) | (i13 << 4) | (i14 << 4);
                    return new AnonymousClass0I5(i3);
                } else if (i10 == 5) {
                    int i15 = (int) r8.A01;
                    int i16 = 61440 & i15;
                    int i17 = i15 & 3840;
                    int i18 = i15 & 240;
                    int i19 = i15 & 15;
                    i2 = (i19 << 24) | (i19 << 28) | (i16 << 8) | (i16 << 4) | (i17 << 4) | i17 | i18 | (i18 >> 4);
                    return new AnonymousClass0I5(i2);
                } else if (i10 == 7) {
                    i6 = (int) r8.A01;
                } else if (i10 == 9) {
                    int i20 = (int) r8.A01;
                    i5 = i20 << 24;
                    i4 = i20 >>> 8;
                    i3 = i4 | i5;
                    return new AnonymousClass0I5(i3);
                }
            }
            sb = AnonymousClass000.A0q("Bad hex colour value: ");
            str2 = AnonymousClass000.A0h(str4, sb);
            throw C11550ix.A00(str2);
        }
        String lowerCase = str4.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (!startsWith) {
            if (lowerCase.startsWith("rgb(")) {
                i8 = 4;
            } else {
                boolean startsWith2 = lowerCase.startsWith("hsla(");
                if (!startsWith2) {
                    if (lowerCase.startsWith("hsl(")) {
                        i8 = 4;
                    } else {
                        Number number = (Number) AnonymousClass0N5.A00.get(lowerCase);
                        if (number != null) {
                            i2 = number.intValue();
                            return new AnonymousClass0I5(i2);
                        }
                        str2 = AnonymousClass000.A0h(lowerCase, AnonymousClass000.A0r("Invalid colour keyword: "));
                        throw C11550ix.A00(str2);
                    }
                }
                AnonymousClass0VC r6 = new AnonymousClass0VC(str4.substring(i8));
                r6.A0C();
                float A023 = r6.A02();
                float A042 = r6.A04(A023);
                if (!Float.isNaN(A042)) {
                    r6.A0E('%');
                }
                float A043 = r6.A04(A042);
                boolean isNaN = Float.isNaN(A043);
                if (!isNaN) {
                    r6.A0E('%');
                }
                if (startsWith2) {
                    float A044 = r6.A04(A043);
                    r6.A0C();
                    if (Float.isNaN(A044) || !r6.A0E(')')) {
                        str3 = "Bad hsla() colour value: ";
                    } else {
                        i4 = A02(A044 * 256.0f) << 24;
                        i5 = A03(A023, A042, A043);
                        i3 = i4 | i5;
                        return new AnonymousClass0I5(i3);
                    }
                } else {
                    r6.A0C();
                    if (isNaN || !r6.A0E(')')) {
                        str3 = "Bad hsl() colour value: ";
                    } else {
                        i6 = A03(A023, A042, A043);
                    }
                }
                sb = AnonymousClass000.A0r(str3);
                str2 = AnonymousClass000.A0h(str4, sb);
                throw C11550ix.A00(str2);
            }
        }
        AnonymousClass0VC r62 = new AnonymousClass0VC(str4.substring(i8));
        r62.A0C();
        float A024 = r62.A02();
        if (!Float.isNaN(A024) && r62.A0E('%')) {
            A024 = (A024 * 256.0f) / 100.0f;
        }
        float A045 = r62.A04(A024);
        if (!Float.isNaN(A045) && r62.A0E('%')) {
            A045 = (A045 * 256.0f) / 100.0f;
        }
        float A046 = r62.A04(A045);
        if (!Float.isNaN(A046) && r62.A0E('%')) {
            A046 = (A046 * 256.0f) / 100.0f;
        }
        if (startsWith) {
            float A047 = r62.A04(A046);
            r62.A0C();
            if (Float.isNaN(A047) || !r62.A0E(')')) {
                str3 = "Bad rgba() colour value: ";
                sb = AnonymousClass000.A0r(str3);
                str2 = AnonymousClass000.A0h(str4, sb);
                throw C11550ix.A00(str2);
            }
            A022 = (A02(A047 * 256.0f) << 24) | (A02(A024) << 16);
        } else {
            r62.A0C();
            if (Float.isNaN(A046) || !r62.A0E(')')) {
                str3 = "Bad rgb() colour value: ";
                sb = AnonymousClass000.A0r(str3);
                str2 = AnonymousClass000.A0h(str4, sb);
                throw C11550ix.A00(str2);
            }
            A022 = (A02(A024) << 16) | -16777216;
        }
        i4 = A022 | (A02(A045) << 8);
        i5 = A02(A046);
        i3 = i4 | i5;
        return new AnonymousClass0I5(i3);
        i3 = i6 | -16777216;
        return new AnonymousClass0I5(i3);
    }

    public static C09150f1 A08(AnonymousClass0VC r1) {
        return r1.A0F(Language.AUTO_DETECT) ? new C09150f1(0.0f) : r1.A06();
    }

    public static C09150f1 A09(String str) {
        int length = str.length();
        if (length != 0) {
            C03770Ju r3 = C03770Ju.px;
            int i2 = length - 1;
            char charAt = str.charAt(i2);
            if (charAt == '%') {
                length = i2;
                r3 = C03770Ju.percent;
            } else if (length > 2 && Character.isLetter(charAt)) {
                int i3 = length - 2;
                if (Character.isLetter(str.charAt(i3))) {
                    length = i3;
                    try {
                        r3 = C03770Ju.valueOf(str.substring(i3).toLowerCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        throw C11550ix.A00(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Invalid length unit specifier: ")));
                    }
                }
            }
            try {
                return new C09150f1(r3, A01(str, length));
            } catch (NumberFormatException e2) {
                throw new C11550ix(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Invalid length value: ")), e2);
            }
        } else {
            throw C11550ix.A00("Invalid length value (empty string)");
        }
    }

    public static C03720Jp A0A(String str) {
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    return C03720Jp.Oblique;
                }
                return null;
            case -1178781136:
                if (str.equals("italic")) {
                    return C03720Jp.Italic;
                }
                return null;
            case -1039745817:
                if (str.equals("normal")) {
                    return C03720Jp.Normal;
                }
                return null;
            default:
                return null;
        }
    }

    public static AnonymousClass0ez A0B(String str) {
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            AnonymousClass0ez r3 = null;
            if (indexOf == -1) {
                return new AnonymousClass0I3((AnonymousClass0ez) null, str.substring(4).trim());
            }
            String trim = str.substring(4, indexOf).trim();
            String trim2 = str.substring(indexOf + 1).trim();
            if (trim2.length() > 0) {
                if (trim2.equals("none")) {
                    r3 = AnonymousClass0I5.A02;
                } else if (!trim2.equals("currentColor")) {
                    try {
                        r3 = A07(trim2);
                    } catch (C11550ix unused) {
                    }
                } else {
                    r3 = AnonymousClass0I4.A00;
                }
            }
            return new AnonymousClass0I3(r3, trim);
        } else if (str.equals("none")) {
            return AnonymousClass0I5.A02;
        } else {
            if (str.equals("currentColor")) {
                return AnonymousClass0I4.A00;
            }
            try {
                return A07(str);
            } catch (C11550ix unused2) {
                return null;
            }
        }
    }

    public static C11550ix A0C() {
        return new C11550ix("Invalid document. Root element must be <svg>");
    }

    public static Float A0D(String str) {
        try {
            int length = str.length();
            if (length != 0) {
                float A012 = A01(str, length);
                if (A012 < 0.0f) {
                    A012 = 0.0f;
                } else if (A012 > 1.0f) {
                    A012 = 1.0f;
                }
                return Float.valueOf(A012);
            }
            throw C11550ix.A00("Invalid float value (empty string)");
        } catch (C11550ix unused) {
            return null;
        }
    }

    public static String A0E(C11060i8 r0, int i2) {
        return r0.getValue(i2).trim();
    }

    public static String A0F(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        return (str.endsWith(")") ? str.substring(4, str.length() - 1) : str.substring(4)).trim();
    }

    public static List A0G(String str) {
        AnonymousClass0VC r3 = new AnonymousClass0VC(str);
        ArrayList arrayList = null;
        do {
            String A0A = r3.A0A();
            if (A0A == null && (A0A = r3.A0B(',', true)) == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = AnonymousClass000.A0u();
            }
            arrayList.add(A0A);
            r3.A0D();
        } while (!AnonymousClass000.A1R(r3.A01, r3.A00));
        return arrayList;
    }

    public static List A0H(String str) {
        String str2;
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            AnonymousClass0VC r4 = new AnonymousClass0VC(str);
            r4.A0C();
            while (!AnonymousClass000.A1R(r4.A01, r4.A00)) {
                float A022 = r4.A02();
                if (!Float.isNaN(A022)) {
                    C03770Ju A072 = r4.A07();
                    if (A072 == null) {
                        A072 = C03770Ju.px;
                    }
                    arrayList.add(new C09150f1(A072, A022));
                    r4.A0D();
                } else {
                    StringBuilder A0r = AnonymousClass000.A0r("Invalid length list value: ");
                    int i2 = r4.A01;
                    int i3 = i2;
                    while (!AnonymousClass000.A1R(i3, r4.A00) && !AnonymousClass0VC.A01(r4.A03.charAt(i3))) {
                        i3 = r4.A01 + 1;
                        r4.A01 = i3;
                    }
                    str2 = AnonymousClass000.A0h(r4.A03.substring(i2, r4.A01), A0r);
                }
            }
            return arrayList;
        }
        str2 = "Invalid length list (empty string)";
        throw C11550ix.A00(str2);
    }

    public static final void A0I(C03150Hk r7, String str, Attributes attributes) {
        StringBuilder A0q;
        String str2;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            C03830Ka r1 = (C03830Ka) C03830Ka.A00.get(attributes.getLocalName(i2));
            if (r1 == null) {
                r1 = C03830Ka.A03;
            }
            if (r1 == C03830Ka.A0o) {
                AnonymousClass0VC r6 = new AnonymousClass0VC(attributes.getValue(i2));
                ArrayList A0u = AnonymousClass000.A0u();
                r6.A0C();
                while (!AnonymousClass000.A1R(r6.A01, r6.A00)) {
                    float A022 = r6.A02();
                    if (!Float.isNaN(A022)) {
                        r6.A0D();
                        float A023 = r6.A02();
                        if (!Float.isNaN(A023)) {
                            r6.A0D();
                            A0u.add(Float.valueOf(A022));
                            A0u.add(Float.valueOf(A023));
                        } else {
                            A0q = AnonymousClass000.A0q("Invalid <");
                            A0q.append(str);
                            str2 = "> points attribute. There should be an even number of coordinates.";
                        }
                    } else {
                        A0q = AnonymousClass000.A0q("Invalid <");
                        A0q.append(str);
                        str2 = "> points attribute. Non-coordinate content found in list.";
                    }
                    throw C11550ix.A00(AnonymousClass000.A0h(str2, A0q));
                }
                r7.A00 = new float[A0u.size()];
                Iterator it = A0u.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    r7.A00[i3] = AnonymousClass000.A04(it.next());
                    i3++;
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x043d, code lost:
        r8.A0M = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x043f, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0441, code lost:
        r0 = r8.A00;
        r6 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0451, code lost:
        if (r10.equals(r0) == false) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0453, code lost:
        r0 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x045f, code lost:
        if (r10.equals(r0) == false) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0461, code lost:
        r0 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x04f9, code lost:
        r8.A00 = r0 | r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0511, code lost:
        r8.A00 = r2 | r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x055f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0J(X.AnonymousClass0f0 r8, java.lang.String r9, java.lang.String r10) {
        /*
            int r5 = r10.length()
            if (r5 == 0) goto L_0x0560
            java.lang.String r0 = "inherit"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0560
            java.util.Map r0 = X.C03830Ka.A00
            java.lang.Object r0 = r0.get(r9)
            X.0Ka r0 = (X.C03830Ka) r0
            if (r0 != 0) goto L_0x001a
            X.0Ka r0 = X.C03830Ka.A03
        L_0x001a:
            int r4 = r0.ordinal()
            java.lang.String r3 = "none"
            java.lang.String r2 = "SVGParser"
            java.lang.String r0 = "currentColor"
            r1 = 124(0x7c, float:1.74E-43)
            switch(r4) {
                case 1: goto L_0x0464;
                case 2: goto L_0x01fe;
                case 4: goto L_0x04c0;
                case 5: goto L_0x002a;
                case 8: goto L_0x03dd;
                case 14: goto L_0x0181;
                case 15: goto L_0x0050;
                case 16: goto L_0x02a0;
                case 17: goto L_0x005e;
                case 18: goto L_0x0319;
                case 19: goto L_0x0119;
                case 20: goto L_0x0036;
                case 21: goto L_0x0127;
                case 22: goto L_0x013a;
                case 27: goto L_0x026a;
                case 28: goto L_0x0149;
                case 29: goto L_0x015a;
                case 30: goto L_0x0167;
                case 31: goto L_0x0174;
                case 35: goto L_0x020b;
                case 40: goto L_0x010d;
                case 42: goto L_0x0435;
                case 58: goto L_0x0218;
                case 59: goto L_0x0232;
                case 62: goto L_0x01d9;
                case 63: goto L_0x01f1;
                case 64: goto L_0x006c;
                case 65: goto L_0x0094;
                case 66: goto L_0x0101;
                case 67: goto L_0x02c1;
                case 68: goto L_0x02ed;
                case 69: goto L_0x0503;
                case 70: goto L_0x007a;
                case 71: goto L_0x0088;
                case 74: goto L_0x0401;
                case 75: goto L_0x0395;
                case 78: goto L_0x04df;
                case 88: goto L_0x0241;
                case 89: goto L_0x025b;
                case 90: goto L_0x01ad;
                default: goto L_0x0029;
            }
        L_0x0029:
            return
        L_0x002a:
            X.0I5 r0 = A07(r10)     // Catch:{ 0ix -> 0x0029 }
            r8.A02 = r0     // Catch:{ 0ix -> 0x0029 }
            long r2 = r8.A00     // Catch:{ 0ix -> 0x0029 }
            r0 = 4096(0x1000, double:2.0237E-320)
            goto L_0x0511
        L_0x0036:
            java.util.Map r0 = X.AnonymousClass0N6.A00     // Catch:{ 0ix -> 0x0045 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ 0ix -> 0x0045 }
            X.0f1 r0 = (X.C09150f1) r0     // Catch:{ 0ix -> 0x0045 }
            if (r0 != 0) goto L_0x0046
            X.0f1 r0 = A09(r10)     // Catch:{ 0ix -> 0x0045 }
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            r8.A03 = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 16384(0x4000, double:8.0948E-320)
            goto L_0x04f9
        L_0x0050:
            X.0ez r0 = A0B(r10)
            r8.A0G = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 1
            goto L_0x04f9
        L_0x005e:
            java.lang.Float r0 = A0D(r10)
            r8.A0O = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 4
            goto L_0x04f9
        L_0x006c:
            X.0ez r0 = A0B(r10)
            r8.A0J = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 8
            goto L_0x04f9
        L_0x007a:
            java.lang.Float r0 = A0D(r10)
            r8.A0T = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 16
            goto L_0x04f9
        L_0x0088:
            X.0f1 r0 = A09(r10)     // Catch:{ 0ix -> 0x0029 }
            r8.A05 = r0     // Catch:{ 0ix -> 0x0029 }
            long r2 = r8.A00     // Catch:{ 0ix -> 0x0029 }
            r0 = 32
            goto L_0x0511
        L_0x0094:
            boolean r0 = r3.equals(r10)
            r6 = 512(0x200, double:2.53E-321)
            if (r0 == 0) goto L_0x00a3
            r0 = 0
            r8.A0c = r0
        L_0x009f:
            long r0 = r8.A00
            goto L_0x04f9
        L_0x00a3:
            X.0VC r5 = new X.0VC
            r5.<init>(r10)
            r5.A0C()
            int r1 = r5.A01
            int r0 = r5.A00
            boolean r1 = X.AnonymousClass000.A1R(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x00fc
            X.0f1 r2 = r5.A06()
            if (r2 == 0) goto L_0x00fc
            boolean r1 = r2.A05()
            if (r1 != 0) goto L_0x00fc
            float r4 = r2.A00
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            r3.add(r2)
        L_0x00cb:
            int r2 = r5.A01
            int r1 = r5.A00
            boolean r1 = X.AnonymousClass000.A1R(r2, r1)
            if (r1 != 0) goto L_0x00eb
            r5.A0D()
            X.0f1 r2 = r5.A06()
            if (r2 == 0) goto L_0x00fc
            boolean r1 = r2.A05()
            if (r1 != 0) goto L_0x00fc
            r3.add(r2)
            float r1 = r2.A00
            float r4 = r4 + r1
            goto L_0x00cb
        L_0x00eb:
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00fc
            int r0 = r3.size()
            X.0f1[] r0 = new X.C09150f1[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            X.0f1[] r0 = (X.C09150f1[]) r0
        L_0x00fc:
            r8.A0c = r0
            if (r0 == 0) goto L_0x0029
            goto L_0x009f
        L_0x0101:
            X.0f1 r0 = A09(r10)     // Catch:{ 0ix -> 0x0029 }
            r8.A04 = r0     // Catch:{ 0ix -> 0x0029 }
            long r2 = r8.A00     // Catch:{ 0ix -> 0x0029 }
            r0 = 1024(0x400, double:5.06E-321)
            goto L_0x0511
        L_0x010d:
            java.lang.Float r0 = A0D(r10)
            r8.A0P = r0
            long r0 = r8.A00
            r6 = 2048(0x800, double:1.0118E-320)
            goto L_0x04f9
        L_0x0119:
            java.util.List r0 = A0G(r10)
            r8.A0b = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 8192(0x2000, double:4.0474E-320)
            goto L_0x04f9
        L_0x0127:
            java.util.Map r0 = X.AnonymousClass0N7.A00
            java.lang.Object r0 = r0.get(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0V = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 32768(0x8000, double:1.61895E-319)
            goto L_0x04f9
        L_0x013a:
            X.0Jp r0 = A0A(r10)
            r8.A08 = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 65536(0x10000, double:3.2379E-319)
            goto L_0x04f9
        L_0x0149:
            java.lang.String r0 = A0F(r10)
            r8.A0Z = r0
            r8.A0Y = r0
            r8.A0X = r0
            long r0 = r8.A00
            r6 = 14680064(0xe00000, double:7.2529153E-317)
            goto L_0x04f9
        L_0x015a:
            java.lang.String r0 = A0F(r10)
            r8.A0Z = r0
            long r0 = r8.A00
            r6 = 2097152(0x200000, double:1.0361308E-317)
            goto L_0x04f9
        L_0x0167:
            java.lang.String r0 = A0F(r10)
            r8.A0Y = r0
            long r0 = r8.A00
            r6 = 4194304(0x400000, double:2.0722615E-317)
            goto L_0x04f9
        L_0x0174:
            java.lang.String r0 = A0F(r10)
            r8.A0X = r0
            long r0 = r8.A00
            r6 = 8388608(0x800000, double:4.144523E-317)
            goto L_0x04f9
        L_0x0181:
            int r0 = r10.indexOf(r1)
            if (r0 >= 0) goto L_0x0029
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0o()
            r0.append(r1)
            java.lang.String r1 = X.AnonymousClass000.A0i(r10, r0, r1)
            java.lang.String r0 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0029
            boolean r0 = r10.equals(r3)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A0L = r0
            long r0 = r8.A00
            r6 = 16777216(0x1000000, double:8.289046E-317)
            goto L_0x04f9
        L_0x01ad:
            int r0 = r10.indexOf(r1)
            if (r0 >= 0) goto L_0x0029
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0o()
            r0.append(r1)
            java.lang.String r1 = X.AnonymousClass000.A0i(r10, r0, r1)
            java.lang.String r0 = "|visible|hidden|collapse|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "visible"
            boolean r0 = r10.equals(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A0N = r0
            long r0 = r8.A00
            r6 = 33554432(0x2000000, double:1.6578092E-316)
            goto L_0x04f9
        L_0x01d9:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x01ea
            X.0I4 r0 = X.AnonymousClass0I4.A00
            r8.A0I = r0
        L_0x01e3:
            long r0 = r8.A00
            r6 = 67108864(0x4000000, double:3.31561842E-316)
            goto L_0x04f9
        L_0x01ea:
            X.0I5 r0 = A07(r10)     // Catch:{ 0ix -> 0x0515 }
            r8.A0I = r0     // Catch:{ 0ix -> 0x0515 }
            goto L_0x01e3
        L_0x01f1:
            java.lang.Float r0 = A0D(r10)
            r8.A0R = r0
            long r0 = r8.A00
            r6 = 134217728(0x8000000, double:6.63123685E-316)
            goto L_0x04f9
        L_0x01fe:
            java.lang.String r0 = A0F(r10)
            r8.A0W = r0
            long r0 = r8.A00
            r6 = 268435456(0x10000000, double:1.32624737E-315)
            goto L_0x04f9
        L_0x020b:
            java.lang.String r0 = A0F(r10)
            r8.A0a = r0
            long r0 = r8.A00
            r6 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x04f9
        L_0x0218:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x022b
            X.0I4 r0 = X.AnonymousClass0I4.A00
            r8.A0H = r0
        L_0x0222:
            long r0 = r8.A00
            r6 = 2147483648(0x80000000, double:1.0609978955E-314)
            goto L_0x04f9
        L_0x022b:
            X.0I5 r0 = A07(r10)     // Catch:{ 0ix -> 0x0515 }
            r8.A0H = r0     // Catch:{ 0ix -> 0x0515 }
            goto L_0x0222
        L_0x0232:
            java.lang.Float r0 = A0D(r10)
            r8.A0Q = r0
            long r0 = r8.A00
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L_0x04f9
        L_0x0241:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0254
            X.0I4 r0 = X.AnonymousClass0I4.A00
            r8.A0K = r0
        L_0x024b:
            long r0 = r8.A00
            r6 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x04f9
        L_0x0254:
            X.0I5 r0 = A07(r10)     // Catch:{ 0ix -> 0x0515 }
            r8.A0K = r0     // Catch:{ 0ix -> 0x0515 }
            goto L_0x024b
        L_0x025b:
            java.lang.Float r0 = A0D(r10)
            r8.A0U = r0
            long r0 = r8.A00
            r6 = 17179869184(0x400000000, double:8.4879831639E-314)
            goto L_0x04f9
        L_0x026a:
            int r0 = r10.hashCode()
            switch(r0) {
                case -933002398: goto L_0x0295;
                case 3005871: goto L_0x028a;
                case 362741610: goto L_0x027f;
                default: goto L_0x0271;
            }
        L_0x0271:
            r0 = 0
        L_0x0272:
            r8.A0B = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 137438953472(0x2000000000, double:6.7903865311E-313)
            goto L_0x04f9
        L_0x027f:
            java.lang.String r0 = "optimizeSpeed"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0271
            X.0Js r0 = X.C03750Js.optimizeSpeed
            goto L_0x0272
        L_0x028a:
            java.lang.String r0 = "auto"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0271
            X.0Js r0 = X.C03750Js.auto
            goto L_0x0272
        L_0x0295:
            java.lang.String r0 = "optimizeQuality"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0271
            X.0Js r0 = X.C03750Js.optimizeQuality
            goto L_0x0272
        L_0x02a0:
            java.lang.String r0 = "nonzero"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x02b4
            X.0Jf r0 = X.C03620Jf.NonZero
        L_0x02aa:
            r8.A07 = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 2
            goto L_0x04f9
        L_0x02b4:
            java.lang.String r0 = "evenodd"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x02bf
            X.0Jf r0 = X.C03620Jf.EvenOdd
            goto L_0x02aa
        L_0x02bf:
            r0 = 0
            goto L_0x02aa
        L_0x02c1:
            java.lang.String r0 = "butt"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x02d5
            X.0Jq r0 = X.C03730Jq.Butt
        L_0x02cb:
            r8.A09 = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 64
            goto L_0x04f9
        L_0x02d5:
            java.lang.String r0 = "round"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x02e0
            X.0Jq r0 = X.C03730Jq.Round
            goto L_0x02cb
        L_0x02e0:
            java.lang.String r0 = "square"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x02eb
            X.0Jq r0 = X.C03730Jq.Square
            goto L_0x02cb
        L_0x02eb:
            r0 = 0
            goto L_0x02cb
        L_0x02ed:
            java.lang.String r0 = "miter"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0301
            X.0Jr r0 = X.C03740Jr.Miter
        L_0x02f7:
            r8.A0A = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 128(0x80, double:6.32E-322)
            goto L_0x04f9
        L_0x0301:
            java.lang.String r0 = "round"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x030c
            X.0Jr r0 = X.C03740Jr.Round
            goto L_0x02f7
        L_0x030c:
            java.lang.String r0 = "bevel"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0317
            X.0Jr r0 = X.C03740Jr.Bevel
            goto L_0x02f7
        L_0x0317:
            r0 = 0
            goto L_0x02f7
        L_0x0319:
            java.lang.String r0 = "|"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0i(r10, r0, r1)
            java.lang.String r0 = "|caption|icon|menu|message-box|small-caption|status-bar|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0029
            X.0VC r5 = new X.0VC
            r5.<init>(r10)
            r4 = 0
            r2 = r4
            r3 = r4
        L_0x0333:
            r6 = 47
            r0 = 0
            java.lang.String r1 = r5.A0B(r6, r0)
            r5.A0C()
            if (r1 == 0) goto L_0x0029
            if (r4 == 0) goto L_0x0344
            if (r2 == 0) goto L_0x0344
            goto L_0x036e
        L_0x0344:
            java.lang.String r0 = "normal"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0333
            if (r4 != 0) goto L_0x0359
            java.util.Map r0 = X.AnonymousClass0N7.A00
            java.lang.Object r4 = r0.get(r1)
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x0359
            goto L_0x0333
        L_0x0359:
            if (r2 != 0) goto L_0x0362
            X.0Jp r2 = A0A(r1)
            if (r2 == 0) goto L_0x0362
            goto L_0x0333
        L_0x0362:
            if (r3 != 0) goto L_0x036e
            java.lang.String r0 = "small-caps"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x036e
            r3 = r1
            goto L_0x0333
        L_0x036e:
            java.util.Map r0 = X.AnonymousClass0N6.A00     // Catch:{ 0ix -> 0x037d }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ 0ix -> 0x037d }
            X.0f1 r3 = (X.C09150f1) r3     // Catch:{ 0ix -> 0x037d }
            if (r3 != 0) goto L_0x037e
            X.0f1 r3 = A09(r1)     // Catch:{ 0ix -> 0x037d }
            goto L_0x037e
        L_0x037d:
            r3 = 0
        L_0x037e:
            boolean r0 = r5.A0E(r6)
            if (r0 == 0) goto L_0x0521
            r5.A0C()
            r1 = 32
            r0 = 0
            java.lang.String r0 = r5.A0B(r1, r0)
            if (r0 == 0) goto L_0x051e
            A09(r0)     // Catch:{ 0ix -> 0x0029 }
            goto L_0x051e
        L_0x0395:
            int r0 = r10.hashCode()
            switch(r0) {
                case -1171789332: goto L_0x03d2;
                case -1026963764: goto L_0x03c7;
                case 3387192: goto L_0x03be;
                case 93826908: goto L_0x03b3;
                case 529818312: goto L_0x03a8;
                default: goto L_0x039c;
            }
        L_0x039c:
            r0 = 0
        L_0x039d:
            r8.A0D = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 131072(0x20000, double:6.47582E-319)
            goto L_0x04f9
        L_0x03a8:
            java.lang.String r0 = "overline"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x039c
            X.0K6 r0 = X.AnonymousClass0K6.Overline
            goto L_0x039d
        L_0x03b3:
            java.lang.String r0 = "blink"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x039c
            X.0K6 r0 = X.AnonymousClass0K6.Blink
            goto L_0x039d
        L_0x03be:
            boolean r0 = r10.equals(r3)
            if (r0 == 0) goto L_0x039c
            X.0K6 r0 = X.AnonymousClass0K6.None
            goto L_0x039d
        L_0x03c7:
            java.lang.String r0 = "underline"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x039c
            X.0K6 r0 = X.AnonymousClass0K6.Underline
            goto L_0x039d
        L_0x03d2:
            java.lang.String r0 = "line-through"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x039c
            X.0K6 r0 = X.AnonymousClass0K6.LineThrough
            goto L_0x039d
        L_0x03dd:
            java.lang.String r0 = "ltr"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x03fe
            java.lang.String r0 = "rtl"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x03fb
            r0 = 0
        L_0x03ee:
            r8.A0E = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 68719476736(0x1000000000, double:3.39519326554E-313)
            goto L_0x04f9
        L_0x03fb:
            X.0Jg r0 = X.C03630Jg.RTL
            goto L_0x03ee
        L_0x03fe:
            X.0Jg r0 = X.C03630Jg.LTR
            goto L_0x03ee
        L_0x0401:
            int r0 = r10.hashCode()
            switch(r0) {
                case -1074341483: goto L_0x042a;
                case 100571: goto L_0x041f;
                case 109757538: goto L_0x0414;
                default: goto L_0x0408;
            }
        L_0x0408:
            r0 = 0
        L_0x0409:
            r8.A0C = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 262144(0x40000, double:1.295163E-318)
            goto L_0x04f9
        L_0x0414:
            java.lang.String r0 = "start"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0408
            X.0Jt r0 = X.C03760Jt.Start
            goto L_0x0409
        L_0x041f:
            java.lang.String r0 = "end"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0408
            X.0Jt r0 = X.C03760Jt.End
            goto L_0x0409
        L_0x042a:
            java.lang.String r0 = "middle"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0408
            X.0Jt r0 = X.C03760Jt.Middle
            goto L_0x0409
        L_0x0435:
            int r0 = r10.hashCode()
            switch(r0) {
                case -1217487446: goto L_0x0459;
                case -907680051: goto L_0x0456;
                case 3005871: goto L_0x044b;
                case 466743410: goto L_0x0448;
                default: goto L_0x043c;
            }
        L_0x043c:
            r0 = 0
        L_0x043d:
            r8.A0M = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 524288(0x80000, double:2.590327E-318)
            goto L_0x04f9
        L_0x0448:
            java.lang.String r0 = "visible"
            goto L_0x044d
        L_0x044b:
            java.lang.String r0 = "auto"
        L_0x044d:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x043c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x043d
        L_0x0456:
            java.lang.String r0 = "scroll"
            goto L_0x045b
        L_0x0459:
            java.lang.String r0 = "hidden"
        L_0x045b:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x043c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x043d
        L_0x0464:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r10)
            r7 = 0
            if (r0 != 0) goto L_0x04b0
            java.lang.String r0 = "rect("
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L_0x04b0
            r0 = 5
            java.lang.String r0 = r10.substring(r0)
            X.0VC r6 = new X.0VC
            r6.<init>(r0)
            r6.A0C()
            X.0f1 r5 = A08(r6)
            r6.A0D()
            X.0f1 r4 = A08(r6)
            r6.A0D()
            X.0f1 r3 = A08(r6)
            r6.A0D()
            X.0f1 r2 = A08(r6)
            r6.A0C()
            r0 = 41
            boolean r0 = r6.A0E(r0)
            if (r0 != 0) goto L_0x04ba
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)
            if (r0 != 0) goto L_0x04ba
        L_0x04b0:
            r8.A01 = r7
            if (r7 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 1048576(0x100000, double:5.180654E-318)
            goto L_0x04f9
        L_0x04ba:
            X.0Ol r7 = new X.0Ol
            r7.<init>(r5, r4, r3, r2)
            goto L_0x04b0
        L_0x04c0:
            java.lang.String r0 = "nonzero"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x04d2
            X.0Jf r0 = X.C03620Jf.NonZero
        L_0x04ca:
            r8.A06 = r0
            long r0 = r8.A00
            r6 = 536870912(0x20000000, double:2.652494739E-315)
            goto L_0x04f9
        L_0x04d2:
            java.lang.String r0 = "evenodd"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x04dd
            X.0Jf r0 = X.C03620Jf.EvenOdd
            goto L_0x04ca
        L_0x04dd:
            r0 = 0
            goto L_0x04ca
        L_0x04df:
            boolean r0 = r10.equals(r3)
            if (r0 != 0) goto L_0x0500
            java.lang.String r0 = "non-scaling-stroke"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04fd
            r0 = 0
        L_0x04ee:
            r8.A0F = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r8.A00
            r6 = 34359738368(0x800000000, double:1.69759663277E-313)
        L_0x04f9:
            long r0 = r0 | r6
            r8.A00 = r0
            return
        L_0x04fd:
            X.0Jh r0 = X.C03640Jh.NonScalingStroke
            goto L_0x04ee
        L_0x0500:
            X.0Jh r0 = X.C03640Jh.None
            goto L_0x04ee
        L_0x0503:
            float r0 = A01(r10, r5)     // Catch:{ 0ix -> 0x0029 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ 0ix -> 0x0029 }
            r8.A0S = r0     // Catch:{ 0ix -> 0x0029 }
            long r2 = r8.A00     // Catch:{ 0ix -> 0x0029 }
            r0 = 256(0x100, double:1.265E-321)
        L_0x0511:
            long r2 = r2 | r0
            r8.A00 = r2     // Catch:{ 0ix -> 0x0029 }
            goto L_0x055f
        L_0x0515:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.w(r2, r0)
            return
        L_0x051e:
            r5.A0C()
        L_0x0521:
            int r1 = r5.A01
            int r0 = r5.A00
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)
            if (r0 == 0) goto L_0x0552
            r0 = 0
        L_0x052c:
            java.util.List r0 = A0G(r0)
            r8.A0b = r0
            r8.A03 = r3
            if (r4 != 0) goto L_0x054d
            r0 = 400(0x190, float:5.6E-43)
        L_0x0538:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0V = r0
            if (r2 != 0) goto L_0x0542
            X.0Jp r2 = X.C03720Jp.Normal
        L_0x0542:
            r8.A08 = r2
            long r2 = r8.A00
            r0 = 122880(0x1e000, double:6.0711E-319)
            long r2 = r2 | r0
            r8.A00 = r2
            return
        L_0x054d:
            int r0 = r4.intValue()
            goto L_0x0538
        L_0x0552:
            int r1 = r5.A01
            int r0 = r5.A00
            r5.A01 = r0
            java.lang.String r0 = r5.A03
            java.lang.String r0 = r0.substring(r1)
            goto L_0x052c
        L_0x055f:
            return
        L_0x0560:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XP.A0J(X.0f0, java.lang.String, java.lang.String):void");
    }

    public static final void A0K(C13380lw r7, Attributes attributes) {
        HashSet hashSet;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (A05(attributes, i2)) {
                case 52:
                    AnonymousClass0VC r5 = new AnonymousClass0VC(trim);
                    HashSet hashSet2 = new HashSet();
                    while (!AnonymousClass000.A1R(r5.A01, r5.A00)) {
                        String A0B = r5.A0B(' ', false);
                        hashSet2.add(A0B.startsWith("http://www.w3.org/TR/SVG11/feature#") ? A0B.substring(35) : "UNSUPPORTED");
                        r5.A0C();
                    }
                    r7.AeW(hashSet2);
                    break;
                case 53:
                    r7.AeV(trim);
                    break;
                case 54:
                    AnonymousClass0VC r52 = new AnonymousClass0VC(trim);
                    HashSet hashSet3 = new HashSet();
                    while (!AnonymousClass000.A1R(r52.A01, r52.A00)) {
                        hashSet3.add(r52.A0B(' ', false));
                        r52.A0C();
                    }
                    r7.AeY(hashSet3);
                    break;
                case 55:
                    List A0G = A0G(trim);
                    if (A0G == null) {
                        hashSet = new HashSet(0);
                    }
                    r7.AeX(hashSet);
                    break;
                case 73:
                    AnonymousClass0VC r6 = new AnonymousClass0VC(trim);
                    HashSet hashSet4 = new HashSet();
                    while (!AnonymousClass000.A1R(r6.A01, r6.A00)) {
                        String A0B2 = r6.A0B(' ', false);
                        int indexOf = A0B2.indexOf(45);
                        if (indexOf != -1) {
                            A0B2 = A0B2.substring(0, indexOf);
                        }
                        hashSet4.add(new Locale(A0B2, "", "").getLanguage());
                        r6.A0C();
                    }
                    r7.Aeo(hashSet4);
                    break;
            }
        }
    }

    public static void A0L(C13170la r1, AnonymousClass0IL r2, AnonymousClass0XP r3, Attributes attributes) {
        r2.A01 = r3.A02;
        r2.A00 = r1;
        A0M(r2, attributes);
        A0N(r2, attributes);
    }

    public static final void A0M(AnonymousClass0IL r3, Attributes attributes) {
        Boolean bool;
        int i2 = 0;
        while (i2 < attributes.getLength()) {
            String qName = attributes.getQName(i2);
            if (qName.equals("id") || qName.equals("xml:id")) {
                r3.A03 = attributes.getValue(i2).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i2).trim();
                if (CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID.equals(trim)) {
                    bool = Boolean.FALSE;
                } else if ("preserve".equals(trim)) {
                    bool = Boolean.TRUE;
                } else {
                    throw C11550ix.A00(AnonymousClass000.A0h(trim, AnonymousClass000.A0r("Invalid value for \"xml:space\" attribute: ")));
                }
                r3.A02 = bool;
                return;
            } else {
                i2++;
            }
        }
    }

    public static final void A0N(AnonymousClass0IL r7, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (trim.length() != 0) {
                switch (A05(attributes, i2)) {
                    case 0:
                        AnonymousClass0IR r3 = new AnonymousClass0IR(trim);
                        ArrayList arrayList = null;
                        while (!AnonymousClass000.A1R(r3.A01, r3.A00)) {
                            String A0B = r3.A0B(' ', false);
                            if (A0B != null) {
                                if (arrayList == null) {
                                    arrayList = AnonymousClass000.A0u();
                                }
                                arrayList.add(A0B);
                                r3.A0C();
                            }
                        }
                        r7.A04 = arrayList;
                        break;
                    case AnonymousClass2EA.A02 /*72*/:
                        AnonymousClass0VC r5 = new AnonymousClass0VC(trim.replaceAll("/\\*.*?\\*/", ""));
                        while (true) {
                            String A0B2 = r5.A0B(':', false);
                            r5.A0C();
                            if (!r5.A0E(':')) {
                                break;
                            } else {
                                r5.A0C();
                                String A0B3 = r5.A0B(';', true);
                                if (A0B3 == null) {
                                    break;
                                } else {
                                    r5.A0C();
                                    if (AnonymousClass000.A1R(r5.A01, r5.A00) || r5.A0E(';')) {
                                        AnonymousClass0f0 r0 = r7.A01;
                                        if (r0 == null) {
                                            r0 = new AnonymousClass0f0();
                                            r7.A01 = r0;
                                        }
                                        A0J(r0, A0B2, A0B3);
                                        r5.A0C();
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        AnonymousClass0f0 r2 = r7.A00;
                        if (r2 == null) {
                            r2 = new AnonymousClass0f0();
                            r7.A00 = r2;
                        }
                        A0J(r2, attributes.getLocalName(i2), attributes.getValue(i2).trim());
                        break;
                }
            }
        }
    }

    public static void A0O(AnonymousClass0PV r1, AnonymousClass0XP r2) {
        r2.A01.A4Y(r1);
    }

    public static void A0P(AnonymousClass0ID r5, String str) {
        AnonymousClass0VC r4 = new AnonymousClass0VC(str);
        r4.A0C();
        String A0B = r4.A0B(' ', false);
        if ("defer".equals(A0B)) {
            r4.A0C();
            A0B = r4.A0B(' ', false);
        }
        AnonymousClass0KG r3 = (AnonymousClass0KG) AnonymousClass0N4.A00.get(A0B);
        C03600Jd r2 = null;
        r4.A0C();
        if (!AnonymousClass000.A1R(r4.A01, r4.A00)) {
            String A0B2 = r4.A0B(' ', false);
            if (A0B2.equals("meet")) {
                r2 = C03600Jd.meet;
            } else if (A0B2.equals("slice")) {
                r2 = C03600Jd.slice;
            } else {
                throw C11550ix.A00(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Invalid preserveAspectRatio definition: ")));
            }
        }
        r5.A00 = new C06170Uo(r3, r2);
    }

    public static final void A0Q(AnonymousClass0IB r7, Attributes attributes) {
        String str;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (A05(attributes, i2)) {
                case 48:
                    A0P(r7, trim);
                    break;
                case 80:
                    AnonymousClass0VC r0 = new AnonymousClass0VC(trim);
                    r0.A0C();
                    float A022 = r0.A02();
                    r0.A0D();
                    float A023 = r0.A02();
                    r0.A0D();
                    float A024 = r0.A02();
                    r0.A0D();
                    float A025 = r0.A02();
                    if (Float.isNaN(A022) || Float.isNaN(A023) || Float.isNaN(A024) || Float.isNaN(A025)) {
                        str = "Invalid viewBox definition - should have four numbers";
                    } else if (A024 < 0.0f) {
                        str = "Invalid viewBox. width cannot be negative";
                    } else if (A025 >= 0.0f) {
                        r7.A00 = new AnonymousClass0UX(A022, A023, A024, A025);
                        break;
                    } else {
                        str = "Invalid viewBox. height cannot be negative";
                    }
                    throw C11550ix.A00(str);
            }
        }
    }

    public static final void A0R(AnonymousClass0IG r3, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (A05(attributes, i2)) {
                case 9:
                    r3.A00 = A0H(trim);
                    break;
                case 10:
                    r3.A01 = A0H(trim);
                    break;
                case 82:
                    r3.A02 = A0H(trim);
                    break;
                case 83:
                    r3.A03 = A0H(trim);
                    break;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04d3, code lost:
        r4 = r4 + r13;
        r3 = r3 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04d5, code lost:
        r6.A7g(r2, r14, r4, r3, r1, r32);
        r13 = r1;
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0535, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0537, code lost:
        r13 = r2;
        r12 = r1;
        r6.AbD(r4, r3, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x053c, code lost:
        r7.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0547, code lost:
        if (X.AnonymousClass000.A1R(r7.A01, r7.A00) != false) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0549, code lost:
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x054d, code lost:
        if (r1 == r7.A00) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x054f, code lost:
        r1 = r7.A03.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0557, code lost:
        if (r1 < 'a') goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x055c, code lost:
        if (r1 < 'A') goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0560, code lost:
        if (r1 > 'Z') goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0565, code lost:
        if (r1 <= 'z') goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x056b, code lost:
        r5 = r7.A09().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0732, code lost:
        A0O(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0161, code lost:
        r0.setLength(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c2, code lost:
        r11.A06 = true;
        r11.A00 = 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0Rz A0S(java.io.InputStream r36) {
        /*
            r35 = this;
            r34 = r36
            java.lang.String r23 = "Exception thrown closing input stream"
            java.lang.String r24 = "SVGParser"
            boolean r0 = r34.markSupported()
            if (r0 != 0) goto L_0x0015
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r0 = r34
            r1.<init>(r0)
            r34 = r1
        L_0x0015:
            r1 = 3
            r0 = r34
            r0.mark(r1)     // Catch:{ IOException -> 0x003c }
            int r1 = r34.read()     // Catch:{ IOException -> 0x003c }
            int r0 = r34.read()     // Catch:{ IOException -> 0x003c }
            int r0 = r0 << 8
            int r1 = r1 + r0
            r34.reset()     // Catch:{ IOException -> 0x003c }
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r1 != r0) goto L_0x003c
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x003c }
            r0 = r34
            r1.<init>(r0)     // Catch:{ IOException -> 0x003c }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x003c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x003c }
            r34 = r0
        L_0x003c:
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r34
            r0.mark(r1)     // Catch:{ all -> 0x0df9 }
            org.xmlpull.v1.XmlPullParser r25 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11 = r35
            X.0i8 r10 = new X.0i8     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = r25
            r10.<init>(r11, r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-docdecl"
            r9 = 0
            r0.setFeature(r1, r9)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r8 = 1
            r0.setFeature(r1, r8)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = 0
            r1 = r0
            r0 = r34
            r1.setInput(r0, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r2 = r25.getEventType()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0067:
            if (r2 == r8) goto L_0x0dd9
            if (r2 == 0) goto L_0x0c91
            r0 = 8
            if (r2 == r0) goto L_0x0c50
            r0 = 10
            if (r2 == r0) goto L_0x0cb7
            r4 = 58
            r1 = 2
            if (r2 == r1) goto L_0x0166
            r0 = 3
            if (r2 == r0) goto L_0x00c7
            r0 = 4
            if (r2 == r0) goto L_0x0083
            r0 = 5
            if (r2 != r0) goto L_0x0cb7
            goto L_0x0c99
        L_0x0083:
            int[] r1 = new int[r1]     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = r25
            char[] r3 = r0.getTextCharacters(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = r1[r9]     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1 = r1[r8]     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r11.A06     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0cb7
            boolean r0 = r11.A07     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x00a7
            java.lang.StringBuilder r0 = r11.A04     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x00a2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A04 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x00a2:
            r0.append(r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x00a7:
            boolean r0 = r11.A08     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x00b7
            java.lang.StringBuilder r0 = r11.A05     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x00a2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A05 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x00a2
        L_0x00b7:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0 instanceof X.C03250Hu     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0cb7
            java.lang.String r0 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>(r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0V(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x00c7:
            java.lang.String r2 = r25.getName()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = r25.getPrefix()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x00e3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = r25.getPrefix()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.append(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x00e3:
            java.lang.String r3 = r25.getNamespace()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r1 = r25.getName()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r11.A06     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x00fa
            int r0 = r11.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = r0 - r8
            r11.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x00fa
            r11.A06 = r9     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x00fa:
            java.lang.String r0 = "http://www.w3.org/2000/svg"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x010c
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x010c
            goto L_0x0cb7
        L_0x010c:
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 > 0) goto L_0x0113
            r1 = r2
        L_0x0113:
            java.util.Map r0 = X.AnonymousClass0K7.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0K7 r0 = (X.AnonymousClass0K7) r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x011f
            X.0K7 r0 = X.AnonymousClass0K7.A03     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x011f:
            int r0 = r0.ordinal()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 0: goto L_0x0128;
                case 1: goto L_0x0126;
                case 2: goto L_0x0126;
                case 3: goto L_0x0128;
                case 4: goto L_0x0128;
                case 5: goto L_0x0132;
                case 6: goto L_0x0126;
                case 7: goto L_0x0128;
                case 8: goto L_0x0128;
                case 9: goto L_0x0126;
                case 10: goto L_0x0128;
                case 11: goto L_0x0128;
                case 12: goto L_0x0128;
                case 13: goto L_0x0126;
                case 14: goto L_0x0128;
                case 15: goto L_0x0126;
                case 16: goto L_0x0126;
                case 17: goto L_0x0128;
                case 18: goto L_0x0126;
                case 19: goto L_0x0128;
                case 20: goto L_0x0128;
                case 21: goto L_0x0139;
                case 22: goto L_0x0128;
                case 23: goto L_0x0128;
                case 24: goto L_0x0128;
                case 25: goto L_0x0128;
                case 26: goto L_0x0132;
                case 27: goto L_0x0126;
                case 28: goto L_0x0128;
                case 29: goto L_0x0128;
                case 30: goto L_0x0128;
                default: goto L_0x0126;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0126:
            goto L_0x0cb7
        L_0x0128:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0PV r0 = (X.AnonymousClass0PV) r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0la r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0132:
            r11.A07 = r9     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.StringBuilder r0 = r11.A04     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0cb7
            goto L_0x0161
        L_0x0139:
            java.lang.StringBuilder r0 = r11.A05     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0cb7
            r11.A08 = r9     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r3 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0Jb r2 = X.C03580Jb.screen     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0Jc r0 = X.C03590Jc.Document     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0XF r1 = new X.0XF     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.<init>(r2, r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0Rz r2 = r11.A02     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0IR r0 = new X.0IR     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0Qu r1 = r1.A06(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0Qu r0 = r2.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.A01(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.StringBuilder r0 = r11.A05     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0161:
            r0.setLength(r9)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0166:
            java.lang.String r3 = r25.getName()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = r25.getPrefix()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0182
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = r25.getPrefix()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.append(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r3 = X.AnonymousClass000.A0h(r3, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0182:
            java.lang.String r2 = r25.getNamespace()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r1 = r25.getName()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r11.A06     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0196
            int r0 = r11.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = r0 + 1
            r11.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0196:
            java.lang.String r0 = "http://www.w3.org/2000/svg"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x01a8
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x01a8
            goto L_0x0cb7
        L_0x01a8:
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 > 0) goto L_0x01af
            r1 = r3
        L_0x01af:
            java.util.Map r0 = X.AnonymousClass0K7.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0K7 r1 = (X.AnonymousClass0K7) r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 != 0) goto L_0x01bb
            X.0K7 r1 = X.AnonymousClass0K7.A03     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x01bb:
            int r0 = r1.ordinal()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 0: goto L_0x0219;
                case 1: goto L_0x028e;
                case 2: goto L_0x060a;
                case 3: goto L_0x09a1;
                case 4: goto L_0x02a7;
                case 5: goto L_0x0213;
                case 6: goto L_0x0659;
                case 7: goto L_0x028e;
                case 8: goto L_0x0b00;
                case 9: goto L_0x06bb;
                case 10: goto L_0x08a2;
                case 11: goto L_0x080c;
                case 12: goto L_0x0ba2;
                case 13: goto L_0x033c;
                case 14: goto L_0x0a45;
                case 15: goto L_0x071b;
                case 16: goto L_0x0703;
                case 17: goto L_0x08e9;
                case 18: goto L_0x057f;
                case 19: goto L_0x0c3b;
                case 20: goto L_0x0944;
                case 21: goto L_0x01c8;
                case 22: goto L_0x07da;
                case 23: goto L_0x07f3;
                case 24: goto L_0x0737;
                case 25: goto L_0x09e7;
                case 26: goto L_0x0213;
                case 27: goto L_0x0781;
                case 28: goto L_0x0753;
                case 29: goto L_0x02bd;
                case 30: goto L_0x0b83;
                default: goto L_0x01c2;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x01c2:
            r11.A06 = r8     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A00 = r8     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x01c8:
            r3 = 0
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0dcf
            java.lang.String r4 = "all"
            r2 = 1
        L_0x01d0:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r3 >= r0) goto L_0x01ed
            java.lang.String r1 = A0E(r10, r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 38: goto L_0x01e9;
                case 77: goto L_0x01e2;
                default: goto L_0x01e1;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x01e1:
            goto L_0x01ea
        L_0x01e2:
            java.lang.String r0 = "text/css"
            boolean r2 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x01ea
        L_0x01e9:
            r4 = r1
        L_0x01ea:
            int r3 = r3 + 1
            goto L_0x01d0
        L_0x01ed:
            if (r2 == 0) goto L_0x01c2
            X.0Jb r3 = X.C03580Jb.screen     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0IR r0 = new X.0IR     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.util.List r0 = X.AnonymousClass0XF.A01(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0201:
            boolean r0 = r2.hasNext()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x01c2
            java.lang.Object r1 = r2.next()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0Jb r0 = X.C03580Jb.all     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == r0) goto L_0x0c4d
            if (r1 != r3) goto L_0x0201
            goto L_0x0c4d
        L_0x0213:
            r11.A07 = r8     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A03 = r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0219:
            X.0I6 r2 = new X.0I6     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0Rz r0 = r11.A02     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0M(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0N(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0Q(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3 = 0
        L_0x0233:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r3 >= r0) goto L_0x027e
            java.lang.String r1 = A0E(r10, r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 25: goto L_0x0245;
                case 81: goto L_0x0267;
                case 82: goto L_0x0259;
                case 83: goto L_0x0260;
                default: goto L_0x0244;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0244:
            goto L_0x027b
        L_0x0245:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x027b
            java.lang.String r0 = "Invalid <svg> element. height cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0259:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x027b
        L_0x0260:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x027b
        L_0x0267:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x027b
            java.lang.String r0 = "Invalid <svg> element. width cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x027b:
            int r3 = r3 + 1
            goto L_0x0233
        L_0x027e:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x028a
            X.0Rz r0 = r11.A02     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.A01 = r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0286:
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x028a:
            r0.A4Y(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0286
        L_0x028e:
            X.0la r1 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0cdb
            X.0Hv r0 = new X.0Hv     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r1, r0, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0O(r0, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x02a7:
            X.0la r1 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0ce1
            X.0Hr r0 = new X.0Hr     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r1, r0, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0O(r0, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x02bd:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0ce7
            X.0Hq r3 = new X.0Hq     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r3, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = 0
        L_0x02d0:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r2 >= r0) goto L_0x0335
            java.lang.String r4 = A0E(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 25: goto L_0x0304;
                case 26: goto L_0x0318;
                case 81: goto L_0x02f0;
                case 82: goto L_0x02e2;
                case 83: goto L_0x02e9;
                default: goto L_0x02e1;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x02e1:
            goto L_0x0332
        L_0x02e2:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0332
        L_0x02e9:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0332
        L_0x02f0:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0332
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0304:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0332
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0318:
            java.lang.String r1 = r10.getURI(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0330
            java.lang.String r1 = r10.getURI(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0332
        L_0x0330:
            r3.A04 = r4     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0332:
            int r2 = r2 + 1
            goto L_0x02d0
        L_0x0335:
            A0O(r3, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r3     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x033c:
            X.0la r1 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0cf4
            X.0Hj r22 = new X.0Hj     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r22.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = r22
            A0L(r1, r0, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r15 = 0
        L_0x0351:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r15 >= r0) goto L_0x0578
            java.lang.String r1 = A0E(r10, r15)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r15)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 13: goto L_0x037b;
                case 43: goto L_0x0364;
                default: goto L_0x0362;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0362:
            goto L_0x0574
        L_0x0364:
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0ced
            float r1 = A01(r1, r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0574
            java.lang.String r0 = "Invalid <path> element. pathLength cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x037b:
            X.0VC r7 = new X.0VC     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r7.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0eD r6 = new X.0eD     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r1 = r7.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x03b6
            java.lang.Integer r0 = r7.A09()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r5 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = 77
            r1 = 109(0x6d, float:1.53E-43)
            if (r5 == r0) goto L_0x03a0
            if (r5 == r1) goto L_0x03a0
            goto L_0x03b6
        L_0x03a0:
            r13 = 0
            r4 = 0
            r12 = 0
            r3 = 0
            r21 = 0
            r20 = 0
        L_0x03a8:
            r7.A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = 108(0x6c, float:1.51E-43)
            r14 = 1073741824(0x40000000, float:2.0)
            java.lang.String r19 = " path segment"
            java.lang.String r18 = "Bad path coords for "
            switch(r5) {
                case 65: goto L_0x03e5;
                case 67: goto L_0x03bc;
                case 72: goto L_0x043d;
                case 76: goto L_0x0452;
                case 77: goto L_0x046b;
                case 81: goto L_0x0491;
                case 83: goto L_0x04b1;
                case 84: goto L_0x04e8;
                case 86: goto L_0x0504;
                case 90: goto L_0x052d;
                case 97: goto L_0x03e5;
                case 99: goto L_0x03bc;
                case 104: goto L_0x043d;
                case 108: goto L_0x0452;
                case 109: goto L_0x046b;
                case 113: goto L_0x0491;
                case 115: goto L_0x04b1;
                case 116: goto L_0x04e8;
                case 118: goto L_0x0504;
                case 122: goto L_0x052d;
                default: goto L_0x03b6;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x03b6:
            r0 = r22
            r0.A00 = r6     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0574
        L_0x03bc:
            float r2 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r14 = r7.A04(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r4 = r7.A04(r14)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r3 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r1 = r7.A04(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r32 = r7.A04(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = java.lang.Float.isNaN(r32)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0518
            r0 = 99
            if (r5 != r0) goto L_0x04d5
            float r1 = r1 + r13
            float r32 = r32 + r12
            float r2 = r2 + r13
            float r14 = r14 + r12
            goto L_0x04d3
        L_0x03e5:
            float r1 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r0 = r7.A04(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r29 = r7.A04(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.Float r2 = java.lang.Float.valueOf(r29)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.Boolean r17 = r7.A08(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = r17
            java.lang.Boolean r16 = r7.A08(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r16 != 0) goto L_0x0404
            r4 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x040b
        L_0x0404:
            r7.A0D()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x040b:
            float r3 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r2 = java.lang.Float.isNaN(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r2 != 0) goto L_0x0518
            r14 = 0
            int r2 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0518
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0518
            r2 = 97
            if (r5 != r2) goto L_0x0424
            float r4 = r4 + r13
            float r3 = r3 + r12
        L_0x0424:
            boolean r32 = r17.booleanValue()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r33 = r16.booleanValue()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r26 = r6
            r27 = r1
            r28 = r0
            r30 = r4
            r31 = r3
            r26.A58(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r13 = r4
            r12 = r3
            goto L_0x053c
        L_0x043d:
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = java.lang.Float.isNaN(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0518
            r0 = 104(0x68, float:1.46E-43)
            if (r5 != r0) goto L_0x044c
            float r4 = r4 + r13
        L_0x044c:
            r13 = r4
            r6.AK9(r4, r12)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x053c
        L_0x0452:
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r1 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0518
            if (r5 != r2) goto L_0x0464
            float r4 = r4 + r13
            float r1 = r1 + r12
        L_0x0464:
            r13 = r4
            r12 = r1
            r6.AK9(r4, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0535
        L_0x046b:
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r3 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = java.lang.Float.isNaN(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0518
            if (r5 != r1) goto L_0x0481
            int r0 = r6.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0481
            float r4 = r4 + r13
            float r3 = r3 + r12
        L_0x0481:
            r13 = r4
            r12 = r3
            r6.ALb(r4, r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r5 == r1) goto L_0x048a
            r2 = 76
        L_0x048a:
            r21 = r4
            r20 = r3
            r5 = r2
            goto L_0x053c
        L_0x0491:
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r3 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r2 = r7.A04(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r1 = r7.A04(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0518
            r0 = 113(0x71, float:1.58E-43)
            if (r5 != r0) goto L_0x0537
            float r2 = r2 + r13
            float r1 = r1 + r12
            float r4 = r4 + r13
            float r3 = r3 + r12
            goto L_0x0537
        L_0x04b1:
            float r2 = r13 * r14
            float r2 = r2 - r4
            float r14 = r14 * r12
            float r14 = r14 - r3
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r3 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r1 = r7.A04(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r32 = r7.A04(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = java.lang.Float.isNaN(r32)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0518
            r0 = 115(0x73, float:1.61E-43)
            if (r5 != r0) goto L_0x04d5
            float r1 = r1 + r13
            float r32 = r32 + r12
        L_0x04d3:
            float r4 = r4 + r13
            float r3 = r3 + r12
        L_0x04d5:
            r26 = r6
            r27 = r2
            r28 = r14
            r29 = r4
            r30 = r3
            r31 = r1
            r26.A7g(r27, r28, r29, r30, r31, r32)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r13 = r1
            r12 = r32
            goto L_0x053c
        L_0x04e8:
            float r0 = r13 * r14
            float r4 = r0 - r4
            float r14 = r14 * r12
            float r3 = r14 - r3
            float r2 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            float r1 = r7.A04(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0518
            r0 = 116(0x74, float:1.63E-43)
            if (r5 != r0) goto L_0x0537
            float r2 = r2 + r13
            float r1 = r1 + r12
            goto L_0x0537
        L_0x0504:
            float r1 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0518
            r0 = 118(0x76, float:1.65E-43)
            if (r5 != r0) goto L_0x0513
            float r1 = r1 + r12
        L_0x0513:
            r12 = r1
            r6.AK9(r13, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0535
        L_0x0518:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r18)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            char r0 = (char) r5     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = r19
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = r24
            android.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x03b6
        L_0x052d:
            r6.close()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r13 = r21
            r4 = r13
            r12 = r20
        L_0x0535:
            r3 = r12
            goto L_0x053c
        L_0x0537:
            r13 = r2
            r12 = r1
            r6.AbD(r4, r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x053c:
            r7.A0D()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r1 = r7.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x03b6
            int r1 = r7.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == r0) goto L_0x0567
            java.lang.String r0 = r7.A03     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            char r1 = r0.charAt(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = 97
            if (r1 < r0) goto L_0x055a
            goto L_0x0563
        L_0x055a:
            r0 = 65
            if (r1 < r0) goto L_0x0567
            r0 = 90
            if (r1 > r0) goto L_0x0567
            goto L_0x056b
        L_0x0563:
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L_0x056b
        L_0x0567:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x03a8
        L_0x056b:
            java.lang.Integer r0 = r7.A09()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r5 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0567
        L_0x0574:
            int r15 = r15 + 1
            goto L_0x0351
        L_0x0578:
            r0 = r22
            A0O(r0, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x057f:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0cfa
            X.0Ho r2 = new X.0Ho     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r2, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1 = 0
        L_0x0592:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 >= r0) goto L_0x0605
            java.lang.String r3 = A0E(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 25: goto L_0x05c6;
                case 56: goto L_0x05da;
                case 57: goto L_0x05ee;
                case 81: goto L_0x05b2;
                case 82: goto L_0x05a4;
                case 83: goto L_0x05ab;
                default: goto L_0x05a3;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x05a3:
            goto L_0x0602
        L_0x05a4:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0602
        L_0x05ab:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A05 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0602
        L_0x05b2:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0602
            java.lang.String r0 = "Invalid <rect> element. width cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x05c6:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0602
            java.lang.String r0 = "Invalid <rect> element. height cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x05da:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0602
            java.lang.String r0 = "Invalid <rect> element. rx cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x05ee:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0602
            java.lang.String r0 = "Invalid <rect> element. ry cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0602:
            int r1 = r1 + 1
            goto L_0x0592
        L_0x0605:
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x060a:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d00
            X.0Hl r3 = new X.0Hl     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r3, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = 0
        L_0x061d:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r2 >= r0) goto L_0x0654
            java.lang.String r1 = A0E(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 6: goto L_0x062f;
                case 7: goto L_0x0636;
                case 49: goto L_0x063d;
                default: goto L_0x062e;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x062e:
            goto L_0x0651
        L_0x062f:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0651
        L_0x0636:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0651
        L_0x063d:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0651
            java.lang.String r0 = "Invalid <circle> element. r cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0651:
            int r2 = r2 + 1
            goto L_0x061d
        L_0x0654:
            A0O(r3, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0659:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d06
            X.0Hm r3 = new X.0Hm     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r3, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = 0
        L_0x066c:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r2 >= r0) goto L_0x06b6
            java.lang.String r1 = A0E(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 6: goto L_0x06a6;
                case 7: goto L_0x06ad;
                case 56: goto L_0x067e;
                case 57: goto L_0x0692;
                default: goto L_0x067d;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x067d:
            goto L_0x06b3
        L_0x067e:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x06b3
            java.lang.String r0 = "Invalid <ellipse> element. rx cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0692:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x06b3
            java.lang.String r0 = "Invalid <ellipse> element. ry cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x06a6:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x06b3
        L_0x06ad:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x06b3:
            int r2 = r2 + 1
            goto L_0x066c
        L_0x06b6:
            A0O(r3, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x06bb:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d0c
            X.0Hn r3 = new X.0Hn     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r3, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = 0
        L_0x06ce:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r2 >= r0) goto L_0x06fe
            java.lang.String r1 = A0E(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 84: goto L_0x06e0;
                case 85: goto L_0x06e7;
                case 86: goto L_0x06ee;
                case 87: goto L_0x06f5;
                default: goto L_0x06df;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x06df:
            goto L_0x06fb
        L_0x06e0:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x06fb
        L_0x06e7:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x06fb
        L_0x06ee:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x06fb
        L_0x06f5:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x06fb:
            int r2 = r2 + 1
            goto L_0x06ce
        L_0x06fe:
            A0O(r3, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0703:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d12
            X.0Hk r1 = new X.0Hk     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r1, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r1, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r1, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = "polyline"
            A0I(r1, r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0732
        L_0x071b:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d18
            X.0Ht r1 = new X.0Ht     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r1, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r1, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r1, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = "polygon"
            A0I(r1, r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0732:
            A0O(r1, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0737:
            X.0la r1 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0d1e
            X.0IE r0 = new X.0IE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r1, r0, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0R(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0O(r0, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0753:
            X.0la r1 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0d2c
            boolean r0 = r1 instanceof X.C03250Hu     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d24
            X.0IF r2 = new X.0IF     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r1, r2, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0R(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0la r1 = r2.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r1 instanceof X.AnonymousClass0IE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x077a
            X.0IE r1 = (X.AnonymousClass0IE) r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0776:
            r2.A00 = r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x077a:
            X.0kv r1 = (X.C12760kv) r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0IE r1 = r1.AGX()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0776
        L_0x0781:
            X.0la r1 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0d3a
            boolean r0 = r1 instanceof X.C03250Hu     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d32
            X.0IH r2 = new X.0IH     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r1, r2, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r4 = 0
        L_0x0795:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r4 >= r0) goto L_0x07c4
            java.lang.String r3 = A0E(r10, r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r1 = A04(r10, r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = 26
            if (r1 != r0) goto L_0x07c1
            java.lang.String r1 = r10.getURI(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x07bf
            java.lang.String r1 = r10.getURI(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x07c1
        L_0x07bf:
            r2.A01 = r3     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x07c1:
            int r4 = r4 + 1
            goto L_0x0795
        L_0x07c4:
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0la r1 = r2.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r1 instanceof X.AnonymousClass0IE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x07d3
            X.0IE r1 = (X.AnonymousClass0IE) r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x07cf:
            r2.A00 = r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x07d3:
            X.0kv r1 = (X.C12760kv) r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0IE r1 = r1.AGX()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x07cf
        L_0x07da:
            X.0la r1 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0d40
            X.0Hp r0 = new X.0Hp     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r1, r0, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0O(r0, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x07f3:
            X.0la r1 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0d46
            X.0I7 r0 = new X.0I7     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r1, r0, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0Q(r0, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0O(r0, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x080c:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d5b
            X.0I9 r2 = new X.0I9     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r2, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0Q(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1 = 0
        L_0x081f:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 >= r0) goto L_0x089b
            java.lang.String r3 = A0E(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 32: goto L_0x0853;
                case 33: goto L_0x0867;
                case 34: goto L_0x083f;
                case 41: goto L_0x087d;
                case 50: goto L_0x0831;
                case 51: goto L_0x0838;
                default: goto L_0x0830;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0830:
            goto L_0x0898
        L_0x0831:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0898
        L_0x0838:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0898
        L_0x083f:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0898
            java.lang.String r0 = "Invalid <marker> element. markerWidth cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0853:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0898
            java.lang.String r0 = "Invalid <marker> element. markerHeight cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0867:
            java.lang.String r0 = "strokeWidth"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0872
            r2.A05 = r9     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0898
        L_0x0872:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d4c
            r2.A05 = r8     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0898
        L_0x087d:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0888
            r0 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0892
        L_0x0888:
            int r0 = r3.length()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d54
            float r0 = A01(r3, r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0892:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0898:
            int r1 = r1 + 1
            goto L_0x081f
        L_0x089b:
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x08a2:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d60
            X.0Hh r3 = new X.0Hh     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r3, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0T(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = 0
        L_0x08b2:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r2 >= r0) goto L_0x08e2
            java.lang.String r1 = A0E(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 84: goto L_0x08c4;
                case 85: goto L_0x08cb;
                case 86: goto L_0x08d2;
                case 87: goto L_0x08d9;
                default: goto L_0x08c3;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x08c3:
            goto L_0x08df
        L_0x08c4:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x08df
        L_0x08cb:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x08df
        L_0x08d2:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x08df
        L_0x08d9:
            X.0f1 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x08df:
            int r2 = r2 + 1
            goto L_0x08b2
        L_0x08e2:
            A0O(r3, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r3     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x08e9:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d65
            X.0Hi r2 = new X.0Hi     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r2, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0T(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1 = 0
        L_0x08f9:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 >= r0) goto L_0x093d
            java.lang.String r3 = A0E(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 6: goto L_0x090b;
                case 7: goto L_0x0912;
                case 11: goto L_0x092d;
                case 12: goto L_0x0934;
                case 49: goto L_0x0919;
                default: goto L_0x090a;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x090a:
            goto L_0x093a
        L_0x090b:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x093a
        L_0x0912:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x093a
        L_0x0919:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x093a
            java.lang.String r0 = "Invalid <radialGradient> element. r cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x092d:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x093a
        L_0x0934:
            X.0f1 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x093a:
            int r1 = r1 + 1
            goto L_0x08f9
        L_0x093d:
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0944:
            X.0la r1 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0d89
            boolean r0 = r1 instanceof X.C03300Hz     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d82
            X.0I1 r5 = new X.0I1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r1, r5, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r4 = 0
        L_0x0955:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r4 >= r0) goto L_0x099a
            java.lang.String r3 = A0E(r10, r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r1 = A04(r10, r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = 39
            if (r1 != r0) goto L_0x0997
            int r2 = r3.length()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r2 == 0) goto L_0x0d7b
            r6 = 1
            int r0 = r2 - r8
            char r1 = r3.charAt(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = 37
            if (r1 != r0) goto L_0x097b
            int r2 = r2 + -1
            goto L_0x097c
        L_0x097b:
            r6 = 0
        L_0x097c:
            float r2 = A01(r3, r2)     // Catch:{ NumberFormatException -> 0x0d6a }
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r6 == 0) goto L_0x0985
            float r2 = r2 / r1
        L_0x0985:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x098c
            r1 = 0
            goto L_0x0991
        L_0x098c:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0991
            r1 = r2
        L_0x0991:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0d6a }
            r5.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0997:
            int r4 = r4 + 1
            goto L_0x0955
        L_0x099a:
            A0O(r5, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r5     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x09a1:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d95
            X.0Hs r3 = new X.0Hs     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r3, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r3, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = 0
        L_0x09b4:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r2 >= r0) goto L_0x09e0
            java.lang.String r4 = A0E(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r1 = A04(r10, r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = 3
            if (r1 != r0) goto L_0x09dd
            java.lang.String r0 = "objectBoundingBox"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x09d2
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x09cf:
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x09dd
        L_0x09d2:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d8e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x09cf
        L_0x09dd:
            int r2 = r2 + 1
            goto L_0x09b4
        L_0x09e0:
            A0O(r3, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r3     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x09e7:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d9a
            X.0II r2 = new X.0II     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r2, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3 = 0
        L_0x09f7:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r3 >= r0) goto L_0x0a2d
            java.lang.String r4 = A0E(r10, r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 26: goto L_0x0a09;
                case 61: goto L_0x0a24;
                default: goto L_0x0a08;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0a08:
            goto L_0x0a2a
        L_0x0a09:
            java.lang.String r1 = r10.getURI(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0a21
            java.lang.String r1 = r10.getURI(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0a2a
        L_0x0a21:
            r2.A02 = r4     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0a2a
        L_0x0a24:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0a2a:
            int r3 = r3 + 1
            goto L_0x09f7
        L_0x0a2d:
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0la r1 = r2.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r1 instanceof X.AnonymousClass0IE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0a3e
            X.0IE r1 = (X.AnonymousClass0IE) r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0a3a:
            r2.A01 = r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0a3e:
            X.0kv r1 = (X.C12760kv) r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0IE r1 = r1.AGX()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0a3a
        L_0x0a45:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0dad
            X.0IA r2 = new X.0IA     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r2, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0Q(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1 = 0
        L_0x0a58:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 >= r0) goto L_0x0af9
            java.lang.String r4 = A0E(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int[] r3 = X.AnonymousClass0N3.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r5 = r3[r0]     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 25: goto L_0x0ac7;
                case 26: goto L_0x0adb;
                case 81: goto L_0x0ab3;
                case 82: goto L_0x0aa5;
                case 83: goto L_0x0aac;
                default: goto L_0x0a6d;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0a6d:
            java.lang.String r3 = "userSpaceOnUse"
            java.lang.String r0 = "objectBoundingBox"
            switch(r5) {
                case 40: goto L_0x0a76;
                case 41: goto L_0x0a8a;
                case 42: goto L_0x0a9e;
                default: goto L_0x0a74;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0a74:
            goto L_0x0af5
        L_0x0a76:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0a81
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0a7e:
            r2.A06 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0af5
        L_0x0a81:
            boolean r0 = r3.equals(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0d9f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0a7e
        L_0x0a8a:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0a95
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0a92:
            r2.A05 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0af5
        L_0x0a95:
            boolean r0 = r3.equals(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0da6
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0a92
        L_0x0a9e:
            android.graphics.Matrix r0 = A06(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0af5
        L_0x0aa5:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0af5
        L_0x0aac:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0af5
        L_0x0ab3:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0af5
            java.lang.String r0 = "Invalid <pattern> element. width cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0ac7:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0af5
            java.lang.String r0 = "Invalid <pattern> element. height cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0adb:
            java.lang.String r3 = r10.getURI(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0af3
            java.lang.String r3 = r10.getURI(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0af5
        L_0x0af3:
            r2.A07 = r4     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0af5:
            int r1 = r1 + 1
            goto L_0x0a58
        L_0x0af9:
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0b00:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0db2
            X.0IC r2 = new X.0IC     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r2, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A0U(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1 = 0
        L_0x0b13:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 >= r0) goto L_0x0b7c
            java.lang.String r4 = A0E(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 25: goto L_0x0b47;
                case 26: goto L_0x0b5b;
                case 48: goto L_0x0b76;
                case 81: goto L_0x0b33;
                case 82: goto L_0x0b25;
                case 83: goto L_0x0b2c;
                default: goto L_0x0b24;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0b24:
            goto L_0x0b79
        L_0x0b25:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0b79
        L_0x0b2c:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0b79
        L_0x0b33:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0b79
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0b47:
            X.0f1 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0b79
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0b5b:
            java.lang.String r3 = r10.getURI(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0b73
            java.lang.String r3 = r10.getURI(r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0b79
        L_0x0b73:
            r2.A05 = r4     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0b79
        L_0x0b76:
            A0P(r2, r4)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0b79:
            int r1 = r1 + 1
            goto L_0x0b13
        L_0x0b7c:
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0b83:
            X.0la r2 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r2 == 0) goto L_0x0db7
            X.0I8 r1 = new X.0I8     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0Rz r0 = r11.A02     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.A00 = r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0M(r1, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r1, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0Q(r1, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0O(r1, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0ba2:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0dca
            X.0Hw r2 = new X.0Hw     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r0, r2, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0K(r2, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1 = 0
        L_0x0bb2:
            int r0 = r10.getLength()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 >= r0) goto L_0x0c35
            java.lang.String r5 = A0E(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int[] r3 = X.AnonymousClass0N3.A00     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            int r0 = A04(r10, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r6 = r3[r0]     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            switch(r0) {
                case 25: goto L_0x0c1d;
                case 81: goto L_0x0c09;
                case 82: goto L_0x0bfb;
                case 83: goto L_0x0c02;
                default: goto L_0x0bc7;
            }     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0bc7:
            r0 = 43
            java.lang.String r4 = "userSpaceOnUse"
            java.lang.String r3 = "objectBoundingBox"
            if (r6 == r0) goto L_0x0be7
            r0 = 44
            if (r6 != r0) goto L_0x0c31
            boolean r0 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0bde
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0bdb:
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0c31
        L_0x0bde:
            boolean r0 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0dbc
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0bdb
        L_0x0be7:
            boolean r0 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0bf2
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0bef:
            r2.A05 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0c31
        L_0x0bf2:
            boolean r0 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0dc3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0bef
        L_0x0bfb:
            X.0f1 r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0c31
        L_0x0c02:
            X.0f1 r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0c31
        L_0x0c09:
            X.0f1 r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0c31
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0c1d:
            X.0f1 r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0.A05()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0c31
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0c31:
            int r1 = r1 + 1
            goto L_0x0bb2
        L_0x0c35:
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0c3b:
            X.0la r1 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0dd4
            X.0I0 r0 = new X.0I0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0L(r1, r0, r11, r10)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            A0O(r0, r11)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A01 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0c4d:
            r11.A08 = r8     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0c50:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = "PROC INSTR: "
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = r25.getText()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = r24
            android.util.Log.d(r0, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = r25.getText()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0VC r4 = new X.0VC     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r4.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0 = 32
            r4.A0B(r0, r9)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.util.HashMap r3 = X.AnonymousClass000.A0x()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r4.A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2 = 61
        L_0x0c7d:
            java.lang.String r1 = r4.A0B(r2, r9)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 == 0) goto L_0x0cb7
            r4.A0E(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = r4.A0A()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r3.put(r1, r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r4.A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0c7d
        L_0x0c91:
            X.0Rz r0 = new X.0Rz     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A02 = r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0c99:
            java.lang.String r2 = r25.getText()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r11.A06     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 != 0) goto L_0x0cb7
            boolean r0 = r11.A07     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0cbd
            java.lang.StringBuilder r1 = r11.A04     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 != 0) goto L_0x0cb4
            int r0 = r2.length()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A04 = r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0cb4:
            r1.append(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0cb7:
            int r2 = r25.nextToken()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0067
        L_0x0cbd:
            boolean r0 = r11.A08     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0cd1
            java.lang.StringBuilder r1 = r11.A05     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r1 != 0) goto L_0x0cb4
            int r0 = r2.length()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r11.A05 = r1     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb4
        L_0x0cd1:
            X.0la r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            boolean r0 = r0 instanceof X.C03250Hu     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            if (r0 == 0) goto L_0x0cb7
            r11.A0V(r2)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0cb7
        L_0x0cdb:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0ce1:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0ce7:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0ced:
            java.lang.String r0 = "Invalid float value (empty string)"
            X.0ix r0 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0cf4:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0cfa:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d00:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d06:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d0c:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d12:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d18:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d1e:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d24:
            java.lang.String r0 = "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d2c:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d32:
            java.lang.String r0 = "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d3a:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d40:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d46:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d4c:
            java.lang.String r0 = "Invalid value for attribute markerUnits"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d54:
            java.lang.String r0 = "Invalid float value (empty string)"
            X.0ix r0 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0d5b:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d60:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d65:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d6a:
            r1 = move-exception
            java.lang.String r0 = "Invalid offset value in <stop>: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            X.0ix r2 = new X.0ix     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            r2.<init>(r0, r1)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d7b:
            java.lang.String r0 = "Invalid offset value in <stop> (empty string)"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d82:
            java.lang.String r0 = "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d89:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d8e:
            java.lang.String r0 = "Invalid value for attribute clipPathUnits"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d95:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d9a:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0d9f:
            java.lang.String r0 = "Invalid value for attribute patternUnits"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0da6:
            java.lang.String r0 = "Invalid value for attribute patternContentUnits"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0dad:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0db2:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0db7:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0dbc:
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0dc3:
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            X.0ix r2 = X.C11550ix.A00(r0)     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0dca:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0dcf:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
            goto L_0x0dd8
        L_0x0dd4:
            X.0ix r2 = A0C()     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0dd8:
            throw r2     // Catch:{ XmlPullParserException -> 0x0de7, IOException -> 0x0df0 }
        L_0x0dd9:
            r34.close()     // Catch:{ IOException -> 0x0ddd }
            goto L_0x0de4
        L_0x0ddd:
            r1 = r24
            r0 = r23
            android.util.Log.e(r1, r0)
        L_0x0de4:
            X.0Rz r0 = r11.A02
            return r0
        L_0x0de7:
            r1 = move-exception
            java.lang.String r0 = "XML parser problem"
            X.0ix r2 = new X.0ix     // Catch:{ all -> 0x0df9 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0df9 }
            goto L_0x0df8
        L_0x0df0:
            r1 = move-exception
            java.lang.String r0 = "Stream error"
            X.0ix r2 = new X.0ix     // Catch:{ all -> 0x0df9 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0df9 }
        L_0x0df8:
            throw r2     // Catch:{ all -> 0x0df9 }
        L_0x0df9:
            r2 = move-exception
            r34.close()     // Catch:{ IOException -> 0x0dfe }
            throw r2
        L_0x0dfe:
            r1 = r24
            r0 = r23
            android.util.Log.e(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XP.A0S(java.io.InputStream):X.0Rz");
    }

    public final void A0T(C03300Hz r5, Attributes attributes) {
        Boolean bool;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (A05(attributes, i2)) {
                case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                    r5.A00 = A06(trim);
                    break;
                case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                    if ("objectBoundingBox".equals(trim)) {
                        bool = Boolean.FALSE;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        bool = Boolean.TRUE;
                    } else {
                        throw C11550ix.A00("Invalid value for attribute gradientUnits");
                    }
                    r5.A02 = bool;
                    break;
                case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                    if (!"".equals(attributes.getURI(i2)) && !"http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                        break;
                    } else {
                        r5.A03 = trim;
                        break;
                    }
                    break;
                case 60:
                    try {
                        r5.A01 = C03610Je.valueOf(trim);
                        break;
                    } catch (IllegalArgumentException unused) {
                        StringBuilder A0r = AnonymousClass000.A0r("Invalid spreadMethod attribute. \"");
                        A0r.append(trim);
                        throw C11550ix.A00(AnonymousClass000.A0h("\" is not a valid value.", A0r));
                    }
            }
        }
    }

    public final void A0U(C12750ku r4, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            C03830Ka r1 = (C03830Ka) C03830Ka.A00.get(attributes.getLocalName(i2));
            if (r1 == null) {
                r1 = C03830Ka.A03;
            }
            if (r1 == C03830Ka.A1H) {
                r4.Aeu(A06(attributes.getValue(i2)));
            }
        }
    }

    public final void A0V(String str) {
        AnonymousClass0IJ r1 = (AnonymousClass0IJ) this.A01;
        int size = r1.A01.size();
        AnonymousClass0PV r2 = size == 0 ? null : (AnonymousClass0PV) r1.A01.get(size - 1);
        if (r2 instanceof AnonymousClass0I2) {
            StringBuilder A0o = AnonymousClass000.A0o();
            AnonymousClass0I2 r22 = (AnonymousClass0I2) r2;
            A0o.append(r22.A00);
            r22.A00 = AnonymousClass000.A0h(str, A0o);
            return;
        }
        this.A01.A4Y(new AnonymousClass0I2(str));
    }
}
