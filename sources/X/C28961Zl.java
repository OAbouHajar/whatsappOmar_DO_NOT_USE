package X;

import com.AssemMods.translator.Language;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.1Zl  reason: invalid class name and case insensitive filesystem */
public class C28961Zl {
    public static CharSequence A00(AnonymousClass013 r5, long j2) {
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = C42681yF.A00(currentTimeMillis, j2);
        if (A00 == 0) {
            i2 = R.string.str1b7e;
        } else if (A00 == 1) {
            i2 = R.string.str1b7f;
        } else {
            return r5.A0C(R.string.str1b7d, C42681yF.A05(r5, C42681yF.A0B(currentTimeMillis, j2) ? C28891Zc.A01(r5, j2) : C28891Zc.A05(r5, j2), C47672Jx.A00(r5, j2)));
        }
        return yo.elapsedTime(j2, C47672Jx.A01(r5, r5.A0C(i2, C47672Jx.A00(r5, j2)), j2));
    }

    public static CharSequence A01(AnonymousClass013 r8, long j2) {
        String str;
        Locale locale;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = C42681yF.A00(currentTimeMillis, j2);
        if (A00 == 0) {
            int i3 = (int) ((currentTimeMillis - j2) / 60000);
            if (i3 < 1) {
                return r8.A09(R.string.str0beb);
            }
            if (i3 < 60) {
                return r8.A0I(new Object[]{String.format(AnonymousClass013.A00(r8.A00), "%d", new Object[]{Integer.valueOf(i3)})}, 269, (long) i3);
            }
            locale = AnonymousClass013.A00(r8.A00);
            i2 = 270;
        } else if (A00 == 1) {
            locale = AnonymousClass013.A00(r8.A00);
            i2 = 294;
        } else {
            str = C42681yF.A0B(currentTimeMillis, j2) ? C28891Zc.A01(r8, j2) : C28891Zc.A05(r8, j2);
            return C42681yF.A05(r8, str, C47672Jx.A00(r8, j2));
        }
        str = C28891Zc.A06(locale, r8.A08(i2));
        return C42681yF.A05(r8, str, C47672Jx.A00(r8, j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        return r8.A0I(new java.lang.Object[]{java.lang.String.format(X.AnonymousClass013.A00(r8.A00), "%d", new java.lang.Object[]{java.lang.Integer.valueOf(r9)})}, r7, (long) r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.AnonymousClass013 r8, int r9, int r10) {
        /*
            r0 = 7
            if (r10 != r0) goto L_0x000e
            r0 = -1
            if (r9 != r0) goto L_0x0011
            r0 = 2131889567(0x7f120d9f, float:1.9413801E38)
            java.lang.String r0 = r8.A09(r0)
            return r0
        L_0x000e:
            switch(r10) {
                case 0: goto L_0x002b;
                case 1: goto L_0x0028;
                case 2: goto L_0x0025;
                case 3: goto L_0x0022;
                case 4: goto L_0x001f;
                case 5: goto L_0x001c;
                case 6: goto L_0x0019;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r1 = "Invalid duration unit"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0019:
            r7 = 292(0x124, float:4.09E-43)
            goto L_0x002d
        L_0x001c:
            r7 = 284(0x11c, float:3.98E-43)
            goto L_0x002d
        L_0x001f:
            r7 = 290(0x122, float:4.06E-43)
            goto L_0x002d
        L_0x0022:
            r7 = 273(0x111, float:3.83E-43)
            goto L_0x002d
        L_0x0025:
            r7 = 276(0x114, float:3.87E-43)
            goto L_0x002d
        L_0x0028:
            r7 = 281(0x119, float:3.94E-43)
            goto L_0x002d
        L_0x002b:
            r7 = 287(0x11f, float:4.02E-43)
        L_0x002d:
            long r1 = (long) r9
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]
            android.content.Context r0 = r8.A00
            java.util.Locale r5 = X.AnonymousClass013.A00(r0)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3 = 0
            r4[r3] = r0
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r5, r0, r4)
            r6[r3] = r0
            java.lang.String r0 = r8.A0I(r6, r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28961Zl.A02(X.013, int, int):java.lang.String");
    }

    public static String A03(AnonymousClass013 r6, int i2, long j2) {
        int i3;
        Object[] objArr;
        String A02;
        String str;
        String A06 = r6.A06();
        if (Language.ENGLISH.equals(A06) || Language.GERMAN.equals(A06) || Language.SPANISH.equals(A06)) {
            if (i2 <= 30) {
                i3 = R.string.str17a6;
                objArr = new Object[1];
                A02 = C28891Zc.A02(r6, j2);
            } else {
                if (C28891Zc.A01 == null) {
                    C28891Zc.A01 = DateFormat.getDateInstance(2, AnonymousClass013.A00(r6.A00));
                }
                return r6.A0C(R.string.str063a, ((DateFormat) C28891Zc.A01.clone()).format(new Date(j2)));
            }
        } else if (i2 <= 30) {
            i3 = R.string.str17a6;
            objArr = new Object[1];
            A02 = C28891Zc.A05(r6, j2);
        } else {
            i3 = R.string.str063a;
            objArr = new Object[1];
            str = C28891Zc.A05(r6, j2);
            objArr[0] = str;
            return r6.A0C(i3, objArr);
        }
        str = C42681yF.A05(r6, A02, C47672Jx.A00(r6, j2));
        objArr[0] = str;
        return r6.A0C(i3, objArr);
    }

    public static String A04(AnonymousClass013 r18, long j2) {
        long j3;
        long j4;
        String str;
        Object[] objArr;
        Long valueOf;
        if (j2 >= 3600) {
            j3 = j2 / 3600;
            j2 -= 3600 * j3;
        } else {
            j3 = 0;
        }
        if (j2 >= 60) {
            j4 = j2 / 60;
            j2 -= 60 * j4;
        } else {
            j4 = 0;
        }
        int i2 = 221;
        if (j3 > 0) {
            i2 = 220;
        }
        AnonymousClass013 r1 = r18;
        String A08 = r1.A08(i2);
        int length = A08.length();
        StringBuilder sb = new StringBuilder(length);
        Locale A00 = AnonymousClass013.A00(r1.A00);
        int i3 = 0;
        while (i3 < length) {
            char charAt = A08.charAt(i3);
            if (charAt == 'h' || charAt == 'm' || charAt == 's') {
                int i4 = i3 + 1;
                if (i4 >= length || A08.charAt(i4) != charAt) {
                    str = "%d";
                    i4 = i3;
                } else {
                    str = "%02d";
                }
                if (charAt == 'h') {
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j3);
                } else if (charAt != 'm') {
                    if (charAt == 's') {
                        objArr = new Object[1];
                        valueOf = Long.valueOf(j2);
                    }
                    i3 = i4;
                } else {
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j4);
                }
                objArr[0] = valueOf;
                sb.append(String.format(A00, str, objArr));
                i3 = i4;
            } else {
                sb.append(charAt);
            }
            i3++;
        }
        return sb.toString();
    }

    public static String A05(AnonymousClass013 r9, long j2) {
        boolean z2 = false;
        if (j2 >= 0) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        long j3 = (j2 + 60000) - 1;
        long j4 = j3 / 3600000;
        return j4 == 0 ? A02(r9, (int) (j3 / 60000), 1) : A02(r9, (int) j4, 2);
    }

    public static String A06(AnonymousClass013 r10, long j2) {
        boolean z2 = false;
        if (j2 >= 0) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        int i2 = (int) (j2 / 3600000);
        long j3 = j2 % 3600000;
        int i3 = (int) (j3 / 60000);
        String A02 = A02(r10, (int) ((j3 % 60000) / 1000), 0);
        if (i2 > 0) {
            return r10.A0B(237, r10.A0B(242, A02(r10, i2, 2), A02(r10, i3, 1)), A02);
        } else if (i3 <= 0) {
            return A02;
        } else {
            return r10.A0B(243, A02(r10, i3, 1), A02);
        }
    }

    public static String A07(AnonymousClass013 r17, long j2) {
        String A0B;
        int i2;
        int i3;
        boolean z2 = false;
        if (j2 >= 0) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        long j3 = j2 / 3600000;
        long j4 = j2 - (3600000 * j3);
        long j5 = j4 / 60000;
        if (j4 - (60000 * j5) > 0) {
            j5++;
        }
        if (j5 == 60) {
            j3++;
            j5 = 0;
        }
        AnonymousClass013 r11 = r17;
        if (j3 == 0) {
            i3 = (int) j5;
            A0B = A02(r11, i3, 1);
            i2 = R.plurals.plurals016e;
        } else {
            int i4 = (int) j3;
            int i5 = (int) j5;
            Object[] objArr = {String.format(AnonymousClass013.A00(r11.A00), "%d", new Object[]{Integer.valueOf(i5)})};
            A0B = r11.A0B(238, r11.A0I(new Object[]{String.format(AnonymousClass013.A00(r11.A00), "%d", new Object[]{Integer.valueOf(i4)})}, 278, (long) i4), r11.A0I(objArr, 283, (long) i5));
            i2 = R.plurals.plurals016e;
            i3 = (int) (j3 + j5);
        }
        long j6 = (long) i3;
        return r11.A0J(new Object[]{A0B}, i2, j6);
    }

    public static String A08(AnonymousClass013 r12, long j2) {
        long j3 = j2 / 3600000;
        long j4 = (j2 - (3600000 * j3)) / 60000;
        if (j3 == 0) {
            return j4 == 0 ? A02(r12, (int) (j2 / 1000), 0) : A02(r12, (int) j4, 1);
        }
        if (j4 == 0) {
            return A02(r12, (int) j3, 2);
        }
        return r12.A0B(243, A02(r12, (int) j3, 2), A02(r12, (int) j4, 1));
    }

    public static String A09(AnonymousClass013 r3, long j2) {
        Locale A00;
        int i2;
        int A002 = C42681yF.A00(System.currentTimeMillis(), j2);
        if (A002 == 0) {
            A00 = AnonymousClass013.A00(r3.A00);
            i2 = 270;
        } else if (A002 == 1) {
            A00 = AnonymousClass013.A00(r3.A00);
            i2 = 294;
        } else if (A002 >= 7) {
            return C28891Zc.A04(r3, j2);
        } else {
            Calendar instance = Calendar.getInstance(AnonymousClass013.A00(r3.A00));
            instance.setTimeInMillis(j2);
            return C28891Zc.A00(r3, instance.get(7));
        }
        return C28891Zc.A06(A00, r3.A08(i2));
    }

    public static String A0A(AnonymousClass013 r2, long j2, boolean z2) {
        int A00 = C42681yF.A00(System.currentTimeMillis(), j2);
        return A00 == 0 ? C47672Jx.A00(r2, j2) : A00 == 1 ? C28891Zc.A06(AnonymousClass013.A00(r2.A00), r2.A08(294)) : z2 ? C28891Zc.A08(r2, 0).format(new Date(j2)) : C28891Zc.A05(r2, j2);
    }

    public static String A0B(AnonymousClass013 r5, Object[] objArr, int i2, int i3, int i4, long j2, boolean z2) {
        int A00 = C42681yF.A00(System.currentTimeMillis(), j2);
        int length = objArr.length;
        Object[] copyOf = length == 0 ? new String[1] : Arrays.copyOf(objArr, length + 1);
        if (A00 == 0 || A00 == 1) {
            copyOf[length] = r5.A0G(C47672Jx.A00(r5, j2));
            if (A00 != 0) {
                i2 = i3;
            }
            return yo.elapsedTime(j2, C47672Jx.A01(r5, r5.A0C(i2, copyOf), j2));
        }
        copyOf[length] = r5.A0G((A00 > 30 || !z2) ? C28891Zc.A05(r5, j2) : C42681yF.A05(r5, C28891Zc.A05(r5, j2), C47672Jx.A00(r5, j2)));
        return r5.A0C(i4, copyOf);
    }
}
