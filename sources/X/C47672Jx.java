package X;

import com.AssemMods.translator.Language;
import com.obwhatsapp.youbasha.ui.YoSettings.HideMedia;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2Jx  reason: invalid class name and case insensitive filesystem */
public abstract class C47672Jx {
    public static final Pattern A00 = Pattern.compile("à\\(s\\)");
    public static final Pattern A01 = Pattern.compile("la\\(s\\)");

    public static String A00(AnonymousClass013 r1, long j2) {
        Calendar instance = Calendar.getInstance(AnonymousClass013.A00(r1.A00));
        instance.setTimeInMillis(j2);
        return A03(r1, instance);
    }

    public static String A01(AnonymousClass013 r3, String str, long j2) {
        Matcher matcher;
        String str2;
        String A06 = r3.A06();
        if (A06.equals(Language.SPANISH)) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            int i2 = instance.get(11);
            if (i2 == 1 || (i2 == 13 && !r3.A04().A00)) {
                matcher = A01.matcher(str);
                str2 = "la";
            } else {
                matcher = A01.matcher(str);
                str2 = "las";
            }
        } else if (!A06.equals(Language.PORTUGUESE)) {
            return str;
        } else {
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j2);
            int i3 = instance2.get(11);
            boolean z2 = true;
            if (i3 == 0) {
                z2 = r3.A04().A00;
            } else if (i3 != 1) {
                z2 = i3 != 13 ? false : true ^ r3.A04().A00;
            }
            matcher = A00.matcher(str);
            str2 = z2 ? "à" : "às";
        }
        return matcher.replaceAll(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.AnonymousClass013 r10, java.lang.String r11, java.util.Calendar r12) {
        /*
            int r6 = r11.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r3 = 0
            r9 = 0
        L_0x000b:
            if (r3 >= r6) goto L_0x0106
            char r2 = r11.charAt(r3)
            r0 = 39
            if (r2 != r0) goto L_0x001a
            r9 = r9 ^ 1
        L_0x0017:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x001a:
            if (r9 != 0) goto L_0x0101
            java.lang.String r0 = "aBhHKm"
            int r1 = r0.indexOf(r2)
            r0 = -1
            if (r1 == r0) goto L_0x0101
            r4 = r3
        L_0x0026:
            if (r4 >= r6) goto L_0x0031
            char r0 = r11.charAt(r4)
            if (r0 != r2) goto L_0x0031
            int r4 = r4 + 1
            goto L_0x0026
        L_0x0031:
            int r1 = r4 - r3
            r0 = 66
            if (r2 == r0) goto L_0x00a7
            r0 = 72
            if (r2 == r0) goto L_0x0093
            r0 = 75
            if (r2 == r0) goto L_0x0077
            r0 = 97
            if (r2 == r0) goto L_0x00c7
            r0 = 104(0x68, float:1.46E-43)
            if (r2 == r0) goto L_0x0072
            r0 = 109(0x6d, float:1.53E-43)
            if (r2 != r0) goto L_0x006c
            android.content.Context r0 = r10.A00
            java.util.Locale r7 = X.AnonymousClass013.A00(r0)
            r0 = 1
            if (r1 != r0) goto L_0x006f
            java.lang.String r3 = "%d"
        L_0x0056:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            r0 = 12
        L_0x005b:
            int r0 = r12.get(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0063:
            r2[r1] = r0
            java.lang.String r0 = java.lang.String.format(r7, r3, r2)
        L_0x0069:
            r5.append(r0)
        L_0x006c:
            int r3 = r4 + -1
            goto L_0x0017
        L_0x006f:
            java.lang.String r3 = "%02d"
            goto L_0x0056
        L_0x0072:
            java.lang.String r0 = A04(r10, r12, r1)
            goto L_0x0069
        L_0x0077:
            r0 = 10
            int r8 = r12.get(r0)
            android.content.Context r0 = r10.A00
            java.util.Locale r7 = X.AnonymousClass013.A00(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0090
            java.lang.String r3 = "%d"
        L_0x0088:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x0063
        L_0x0090:
            java.lang.String r3 = "%02d"
            goto L_0x0088
        L_0x0093:
            android.content.Context r0 = r10.A00
            java.util.Locale r7 = X.AnonymousClass013.A00(r0)
            r0 = 1
            if (r1 != r0) goto L_0x00a4
            java.lang.String r3 = "%d"
        L_0x009e:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            r0 = 11
            goto L_0x005b
        L_0x00a4:
            java.lang.String r3 = "%02d"
            goto L_0x009e
        L_0x00a7:
            android.content.Context r0 = r10.A00
            java.util.Locale r2 = X.AnonymousClass013.A00(r0)
            java.lang.String r0 = X.AnonymousClass1WH.A05(r2)
            X.00N r1 = X.AnonymousClass38G.A00
            java.lang.Object r8 = r1.get(r0)
            X.4KV r8 = (X.AnonymousClass4KV) r8
            if (r8 != 0) goto L_0x00d8
            java.lang.String r0 = r2.getLanguage()
            java.lang.Object r8 = r1.get(r0)
            X.4KV r8 = (X.AnonymousClass4KV) r8
            if (r8 != 0) goto L_0x00d8
        L_0x00c7:
            r0 = 9
            int r1 = r12.get(r0)
            r0 = 219(0xdb, float:3.07E-43)
            if (r1 != 0) goto L_0x00d3
            r0 = 210(0xd2, float:2.94E-43)
        L_0x00d3:
            java.lang.String r0 = r10.A08(r0)
            goto L_0x0069
        L_0x00d8:
            r0 = 11
            int r7 = r12.get(r0)
            r0 = 12
            int r0 = r12.get(r0)
            if (r0 != 0) goto L_0x00fc
            int[] r3 = r8.A00
            if (r3 == 0) goto L_0x00fc
            int[] r2 = r8.A01
            if (r2 == 0) goto L_0x00fc
            r1 = 0
        L_0x00ef:
            int r0 = r3.length
            if (r1 >= r0) goto L_0x00fc
            r0 = r3[r1]
            if (r0 != r7) goto L_0x00f9
            r0 = r2[r1]
            goto L_0x00d3
        L_0x00f9:
            int r1 = r1 + 1
            goto L_0x00ef
        L_0x00fc:
            int[] r0 = r8.A02
            r0 = r0[r7]
            goto L_0x00d3
        L_0x0101:
            r5.append(r2)
            goto L_0x0017
        L_0x0106:
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47672Jx.A02(X.013, java.lang.String, java.util.Calendar):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1 == 3) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(X.AnonymousClass013 r3, java.util.Calendar r4) {
        /*
            X.1Zd r0 = r3.A04()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0013
            r2 = 224(0xe0, float:3.14E-43)
        L_0x000a:
            java.lang.String r0 = r3.A08(r2)
            java.lang.String r0 = A02(r3, r0, r4)
            return r0
        L_0x0013:
            android.content.Context r0 = r3.A00
            java.util.Locale r0 = X.AnonymousClass013.A00(r0)
            int r1 = X.AnonymousClass1WH.A00(r0)
            r0 = 2
            if (r1 == r0) goto L_0x0025
            r0 = 3
            r2 = 223(0xdf, float:3.12E-43)
            if (r1 != r0) goto L_0x000a
        L_0x0025:
            r2 = 222(0xde, float:3.11E-43)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47672Jx.A03(X.013, java.util.Calendar):java.lang.String");
    }

    public static String A04(AnonymousClass013 r4, Calendar calendar, int i2) {
        int i3 = calendar.get(10);
        if (i3 == 0) {
            i3 = 12;
        }
        return String.format(AnonymousClass013.A00(r4.A00), i2 == 1 ? "%d" : "%02d", new Object[]{Integer.valueOf(i3)});
    }

    public static String A05(AnonymousClass013 r14, Calendar calendar, Calendar calendar2) {
        int i2;
        String str;
        Locale locale;
        String str2;
        Object[] objArr;
        char c2;
        Integer num;
        AnonymousClass013 r5 = r14;
        Calendar calendar3 = calendar2;
        Calendar calendar4 = calendar;
        if (r14.A04().A00) {
            i2 = 228;
            if (calendar.get(11) == calendar3.get(11)) {
                i2 = 229;
            }
        } else {
            int A002 = AnonymousClass1WH.A00(AnonymousClass013.A00(r14.A00));
            if (A002 == 2 || A002 == 3) {
                String A08 = r14.A08(HideMedia.IMAGES);
                return r14.A0B(230, A02(r14, A08, calendar), A02(r14, A08, calendar3));
            }
            i2 = 227;
            if (calendar.get(11) != calendar3.get(11)) {
                i2 = 225;
                if (calendar.get(9) == calendar3.get(9)) {
                    i2 = 226;
                }
            }
        }
        String A082 = r14.A08(i2);
        int length = A082.length();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (i3 < length) {
            char charAt = A082.charAt(i3);
            if (charAt == '\'') {
                z2 = !z2;
            } else if (z2 || "ahHKm".indexOf(charAt) == -1) {
                sb.append(charAt);
            } else {
                int i4 = i3;
                while (i4 < length && A082.charAt(i4) == charAt) {
                    i4++;
                }
                int i5 = i4 - i3;
                if (charAt == 'H') {
                    Calendar calendar5 = calendar3;
                    if (!z4) {
                        calendar5 = calendar4;
                    }
                    locale = AnonymousClass013.A00(r5.A00);
                    str2 = i5 == 1 ? "%d" : "%02d";
                    objArr = new Object[1];
                    c2 = 0;
                    num = Integer.valueOf(calendar5.get(11));
                    objArr[c2] = num;
                    str = String.format(locale, str2, objArr);
                    sb.append(str);
                    z4 = true;
                } else if (charAt == 'K') {
                    Calendar calendar6 = calendar3;
                    if (!z4) {
                        calendar6 = calendar4;
                    }
                    int i6 = calendar6.get(10);
                    locale = AnonymousClass013.A00(r5.A00);
                    str2 = i5 == 1 ? "%d" : "%02d";
                    objArr = new Object[1];
                    c2 = 0;
                    num = Integer.valueOf(i6);
                    objArr[c2] = num;
                    str = String.format(locale, str2, objArr);
                    sb.append(str);
                    z4 = true;
                } else if (charAt == 'a') {
                    Calendar calendar7 = calendar3;
                    if (!z3) {
                        calendar7 = calendar4;
                    }
                    int i7 = 219;
                    if (calendar7.get(9) == 0) {
                        i7 = 210;
                    }
                    sb.append(r5.A08(i7));
                    z3 = true;
                } else if (charAt == 'h') {
                    Calendar calendar8 = calendar3;
                    if (!z4) {
                        calendar8 = calendar4;
                    }
                    str = A04(r5, calendar8, i5);
                    sb.append(str);
                    z4 = true;
                } else if (charAt == 'm') {
                    Calendar calendar9 = calendar3;
                    if (!z5) {
                        calendar9 = calendar4;
                    }
                    sb.append(String.format(AnonymousClass013.A00(r5.A00), i5 == 1 ? "%d" : "%02d", new Object[]{Integer.valueOf(calendar9.get(12))}));
                    z5 = true;
                }
                i3 = i4 - 1;
            }
            i3++;
        }
        return sb.toString();
    }
}
