package X;

import android.content.Context;
import android.icu.text.DateTimePatternGenerator;
import android.os.Build;
import android.text.format.Time;
import com.whatsapp.util.IDxTLocalShape13S0000000_2_I0;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.1yF  reason: invalid class name and case insensitive filesystem */
public final class C42681yF {
    public static final C86444Ss A00 = new IDxTLocalShape13S0000000_2_I0(3);
    public static final C86444Ss A01 = new IDxTLocalShape13S0000000_2_I0(0);
    public static final C86444Ss A02 = new IDxTLocalShape13S0000000_2_I0(4);
    public static final C86444Ss A03 = new IDxTLocalShape13S0000000_2_I0(2);
    public static final C86444Ss A04 = new IDxTLocalShape13S0000000_2_I0(1);

    public static int A00(long j2, long j3) {
        Time time = new Time();
        time.set(j2);
        time.set(j3);
        return ((int) ((j2 + (time.gmtoff * 1000)) / 86400000)) - ((int) ((j3 + (time.gmtoff * 1000)) / 86400000));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A01(long r9) {
        /*
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            r5 = 0
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
            r3 = 60000(0xea60, double:2.9644E-319)
        L_0x0011:
            long r7 = r7 / r3
            long r7 = r7 * r3
            long r9 = r9 + r7
            long r9 = r9 + r3
        L_0x0015:
            java.util.GregorianCalendar r2 = new java.util.GregorianCalendar
            r2.<init>()
            r1 = 5
            r0 = 1
            r2.add(r1, r0)
            r0 = 11
            r1 = 0
            r2.set(r0, r1)
            r0 = 12
            r2.set(r0, r1)
            r0 = 13
            r2.set(r0, r1)
            long r1 = r2.getTimeInMillis()
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
        L_0x003b:
            return r1
        L_0x003c:
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0011
            r9 = 0
            goto L_0x0015
        L_0x0046:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42681yF.A01(long):long");
    }

    public static String A02(long j2) {
        return ((DateFormat) A01.A01()).format(new Date(j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        switch(r1) {
            case 1: goto L_0x00d3;
            case 2: goto L_0x00d3;
            case 3: goto L_0x00ca;
            case 4: goto L_0x005f;
            case 5: goto L_0x0062;
            case 6: goto L_0x005c;
            default: goto L_0x0021;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        if (r6.equals(r0) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r0 = 168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        r0 = 173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        r6 = X.C28911Ze.A01(r5, r8, 175);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (r6.isEmpty() == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        r6 = X.C28911Ze.A01(r5, r8, 172);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        if (r6.isEmpty() != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0082, code lost:
        if (r6.contains("MMMM") != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        r6 = r6.replace("MMM", "MMMM");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        r2 = "LLL";
        r1 = "LLLL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        if (r6.contains(r1) != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        r6 = r6.replace(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0097, code lost:
        r6 = X.C28911Ze.A01(r5, r8, 174);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        if (r6.isEmpty() == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
        r6 = X.C28911Ze.A01(r5, r8, 171);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        if (r6.contains("MMMM") != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b3, code lost:
        r6 = r6.replace("MMM", "MMMM");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bf, code lost:
        if (r6.contains("LLLL") != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c1, code lost:
        r6 = r6.replace("LLL", "LLLL");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        r2 = "E";
        r1 = "EEEE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r0 = 169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        r6 = X.C28911Ze.A01(r5, r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        if (r6 != null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d3, code lost:
        r4 = new java.text.SimpleDateFormat(r6, r8).format(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (r9 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00de, code lost:
        r3 = java.text.DateFormat.getTimeInstance(3, r8).format(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f9, code lost:
        return java.text.MessageFormat.format(X.C28911Ze.A01(r5, r8, 179), new java.lang.Object[]{r3, r4});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.content.Context r5, java.lang.String r6, java.util.Date r7, java.util.Locale r8, boolean r9) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x000b
            java.lang.String r4 = A07(r6, r7, r8, r9)
        L_0x000a:
            return r4
        L_0x000b:
            r0 = 18
            if (r1 < r0) goto L_0x0014
            java.lang.String r4 = A06(r6, r7, r8, r9)
            return r4
        L_0x0014:
            int r0 = r6.hashCode()
            r3 = 3
            r1 = -1
            switch(r0) {
                case 2124096: goto L_0x0053;
                case 2370368: goto L_0x0050;
                case 3724864: goto L_0x004c;
                case 24399588: goto L_0x0041;
                case 73481508: goto L_0x0037;
                case 1234596964: goto L_0x002d;
                case 2135598628: goto L_0x0022;
                default: goto L_0x001d;
            }
        L_0x001d:
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00d3;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00ca;
                case 4: goto L_0x005f;
                case 5: goto L_0x0062;
                case 6: goto L_0x005c;
                default: goto L_0x0021;
            }
        L_0x0021:
            return r4
        L_0x0022:
            java.lang.String r0 = "yyyyMMMMdEEEE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 6
            goto L_0x001d
        L_0x002d:
            java.lang.String r0 = "MMMMdEEEE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 5
            goto L_0x001d
        L_0x0037:
            java.lang.String r0 = "MMMMd"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001d
        L_0x0041:
            java.lang.String r0 = "yyyyMMMMd"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = 3
            goto L_0x001d
        L_0x004c:
            java.lang.String r0 = "yyyy"
            goto L_0x0055
        L_0x0050:
            java.lang.String r0 = "MMMM"
            goto L_0x0055
        L_0x0053:
            java.lang.String r0 = "EEEE"
        L_0x0055:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x001d
        L_0x005c:
            r0 = 168(0xa8, float:2.35E-43)
            goto L_0x00cc
        L_0x005f:
            r0 = 173(0xad, float:2.42E-43)
            goto L_0x00cc
        L_0x0062:
            r0 = 175(0xaf, float:2.45E-43)
            java.lang.String r6 = X.C28911Ze.A01(r5, r8, r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00d3
            r0 = 172(0xac, float:2.41E-43)
            java.lang.String r6 = X.C28911Ze.A01(r5, r8, r0)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0097
            java.lang.String r2 = "MMM"
            java.lang.String r1 = "MMMM"
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x0088
            java.lang.String r6 = r6.replace(r2, r1)
        L_0x0088:
            java.lang.String r2 = "LLL"
            java.lang.String r1 = "LLLL"
        L_0x008c:
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x00d3
            java.lang.String r6 = r6.replace(r2, r1)
            goto L_0x00d0
        L_0x0097:
            r0 = 174(0xae, float:2.44E-43)
            java.lang.String r6 = X.C28911Ze.A01(r5, r8, r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00c5
            r0 = 171(0xab, float:2.4E-43)
            java.lang.String r6 = X.C28911Ze.A01(r5, r8, r0)
            java.lang.String r2 = "MMM"
            java.lang.String r1 = "MMMM"
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x00b7
            java.lang.String r6 = r6.replace(r2, r1)
        L_0x00b7:
            java.lang.String r2 = "LLL"
            java.lang.String r1 = "LLLL"
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x00c5
            java.lang.String r6 = r6.replace(r2, r1)
        L_0x00c5:
            java.lang.String r2 = "E"
            java.lang.String r1 = "EEEE"
            goto L_0x008c
        L_0x00ca:
            r0 = 169(0xa9, float:2.37E-43)
        L_0x00cc:
            java.lang.String r6 = X.C28911Ze.A01(r5, r8, r0)
        L_0x00d0:
            if (r6 != 0) goto L_0x00d3
            return r4
        L_0x00d3:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r6, r8)
            java.lang.String r4 = r0.format(r7)
            if (r9 == 0) goto L_0x000a
            java.text.DateFormat r0 = java.text.DateFormat.getTimeInstance(r3, r8)
            java.lang.String r3 = r0.format(r7)
            r0 = 179(0xb3, float:2.51E-43)
            java.lang.String r2 = X.C28911Ze.A01(r5, r8, r0)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r3
            r0 = 1
            r1[r0] = r4
            java.lang.String r4 = java.text.MessageFormat.format(r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42681yF.A03(android.content.Context, java.lang.String, java.util.Date, java.util.Locale, boolean):java.lang.String");
    }

    public static String A04(Context context, Date date, Locale locale) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return A09(date, locale);
        }
        if (i2 >= 18) {
            return A08(date, locale);
        }
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 3, locale);
        TimeZone timeZone = dateTimeInstance.getTimeZone();
        String format = dateTimeInstance.format(date);
        String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(date), 0, locale);
        return MessageFormat.format(C28911Ze.A01(context, locale, 0), new Object[]{format, displayName});
    }

    public static String A05(AnonymousClass013 r2, String str, String str2) {
        return MessageFormat.format(r2.A08(179), new Object[]{str2, str});
    }

    public static String A06(String str, Date date, Locale locale, boolean z2) {
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("jjmm");
            str = sb.toString();
        }
        return new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, str), locale).format(date);
    }

    public static String A07(String str, Date date, Locale locale, boolean z2) {
        DateTimePatternGenerator instance = DateTimePatternGenerator.getInstance(locale);
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("jjmm");
            str = sb.toString();
        }
        return new android.icu.text.SimpleDateFormat(instance.getBestPattern(str), locale).format(date);
    }

    public static String A08(Date date, Locale locale) {
        return new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, "yyyyMMMMdEEEEjjmmz"), locale).format(date);
    }

    public static String A09(Date date, Locale locale) {
        return new android.icu.text.SimpleDateFormat(DateTimePatternGenerator.getInstance(locale).getBestPattern("yyyyMMMMdEEEEjjmmz"), locale).format(date);
    }

    public static boolean A0A(long j2, long j3) {
        Calendar calendar = (Calendar) A04.A01();
        calendar.setTimeInMillis(j2);
        Calendar calendar2 = (Calendar) A03.A01();
        calendar2.setTimeInMillis(j3);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static boolean A0B(long j2, long j3) {
        Calendar calendar = (Calendar) A04.A01();
        calendar.setTimeInMillis(j2);
        Calendar calendar2 = (Calendar) A03.A01();
        calendar2.setTimeInMillis(j3);
        return calendar.get(1) == calendar2.get(1);
    }
}
