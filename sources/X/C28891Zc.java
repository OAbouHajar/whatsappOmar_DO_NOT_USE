package X;

import android.os.Build;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.1Zc  reason: invalid class name and case insensitive filesystem */
public final class C28891Zc {
    public static volatile DateFormat A00;
    public static volatile DateFormat A01;
    public static volatile DateFormat[] A02;

    public static String A00(AnonymousClass013 r3, int i2) {
        int i3;
        switch (i2) {
            case 1:
                i3 = 204;
                break;
            case 2:
                i3 = 202;
                break;
            case 3:
                i3 = 206;
                break;
            case 4:
                i3 = 207;
                break;
            case 5:
                i3 = 205;
                break;
            case 6:
                i3 = 201;
                break;
            case 7:
                i3 = 203;
                break;
            default:
                throw new AssertionError("Unreachable code");
        }
        String A08 = r3.A08(i3);
        return "titlecase-firstword".equals(r3.A08(272)) ? A06(AnonymousClass013.A00(r3.A00), A08) : A08;
    }

    public static String A01(AnonymousClass013 r1, long j2) {
        return A07(r1).format(new Date(j2));
    }

    public static String A02(AnonymousClass013 r3, long j2) {
        DateFormat dateFormat = r3.A03;
        if (dateFormat == null) {
            Locale A002 = AnonymousClass013.A00(r3.A00);
            dateFormat = new SimpleDateFormat(Build.VERSION.SDK_INT >= 18 ? android.text.format.DateFormat.getBestDateTimePattern(A002, "MMMd") : r3.A08(170), A002);
            r3.A03 = dateFormat;
        }
        return ((DateFormat) dateFormat.clone()).format(new Date(j2));
    }

    public static String A03(AnonymousClass013 r2, long j2) {
        if (A01 == null) {
            A01 = DateFormat.getDateInstance(2, AnonymousClass013.A00(r2.A00));
        }
        return ((DateFormat) A01.clone()).format(new Date(j2));
    }

    public static String A04(AnonymousClass013 r1, long j2) {
        return A08(r1, 0).format(new Date(j2));
    }

    public static String A05(AnonymousClass013 r2, long j2) {
        if (A00 == null) {
            A00 = DateFormat.getDateInstance(3, AnonymousClass013.A00(r2.A00));
        }
        return ((DateFormat) A00.clone()).format(new Date(j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r3 == 105) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A06(java.util.Locale r4, java.lang.String r5) {
        /*
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0007
            return r5
        L_0x0007:
            java.lang.String r4 = r4.getLanguage()
            r0 = 0
            int r3 = r5.codePointAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r3 != r0) goto L_0x003f
            java.lang.String r0 = "tr"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "az"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0041
        L_0x0025:
            r0 = 304(0x130, float:4.26E-43)
        L_0x0027:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.appendCodePoint(r0)
            int r0 = java.lang.Character.charCount(r3)
            java.lang.String r0 = r5.substring(r0)
        L_0x0037:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x003f:
            if (r3 != r0) goto L_0x0061
        L_0x0041:
            r2 = 2
            if (r1 < r2) goto L_0x0061
            r0 = 1
            char r1 = r5.charAt(r0)
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 != r0) goto L_0x0061
            java.lang.String r0 = "nl"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "IJ"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.substring(r2)
            goto L_0x0037
        L_0x0061:
            int r0 = java.lang.Character.toTitleCase(r3)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28891Zc.A06(java.util.Locale, java.lang.String):java.lang.String");
    }

    public static DateFormat A07(AnonymousClass013 r5) {
        String[] A002;
        SimpleDateFormat simpleDateFormat;
        DateFormat dateFormat = r5.A02;
        SimpleDateFormat simpleDateFormat2 = dateFormat;
        if (dateFormat == null) {
            Locale A003 = AnonymousClass013.A00(r5.A00);
            String A08 = r5.A08(173);
            if (A08.contains("MMMM")) {
                A002 = C28931Zg.A01(r5, 0);
            } else if (A08.contains("LLLL")) {
                A08 = A08.replace("LLLL", "MMMM");
                A002 = C28931Zg.A00(r5);
            } else {
                simpleDateFormat = new SimpleDateFormat(A08, A003);
                r5.A02 = simpleDateFormat;
                simpleDateFormat2 = simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(A08, A003);
            DateFormatSymbols dateFormatSymbols = simpleDateFormat3.getDateFormatSymbols();
            dateFormatSymbols.setMonths(A002);
            simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols);
            simpleDateFormat = simpleDateFormat3;
            r5.A02 = simpleDateFormat;
            simpleDateFormat2 = simpleDateFormat;
        }
        return (DateFormat) simpleDateFormat2.clone();
    }

    public static DateFormat A08(AnonymousClass013 r7, int i2) {
        if (A02 == null) {
            Locale A002 = AnonymousClass013.A00(r7.A00);
            String A08 = r7.A08(169);
            String[] A012 = C28931Zg.A01(r7, 0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(A08, A002);
            DateFormatSymbols dateFormatSymbols = simpleDateFormat.getDateFormatSymbols();
            dateFormatSymbols.setMonths(A012);
            simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
            String[] A013 = C28931Zg.A01(r7, 1);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(A08, A002);
            DateFormatSymbols dateFormatSymbols2 = simpleDateFormat2.getDateFormatSymbols();
            dateFormatSymbols2.setMonths(A013);
            simpleDateFormat2.setDateFormatSymbols(dateFormatSymbols2);
            String[] A014 = C28931Zg.A01(r7, 2);
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(A08, A002);
            DateFormatSymbols dateFormatSymbols3 = simpleDateFormat3.getDateFormatSymbols();
            dateFormatSymbols3.setMonths(A014);
            simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols3);
            A02 = new SimpleDateFormat[]{simpleDateFormat, simpleDateFormat2, simpleDateFormat3};
        }
        return (DateFormat) A02[i2].clone();
    }

    public static void A09() {
        A00 = null;
        A01 = null;
        A02 = null;
    }
}
