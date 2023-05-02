package X;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.02N  reason: invalid class name */
public class AnonymousClass02N {
    public static String A00(File file, String str, Date date) {
        String A03 = A03(file.getName(), date);
        String A02 = A02(file.getName(), str);
        File[] listFiles = file.getParentFile().listFiles();
        File file2 = null;
        if (listFiles != null) {
            int i2 = 0;
            for (File file3 : listFiles) {
                String name = file3.getName();
                if (name.startsWith(A03) && name.endsWith(A02)) {
                    int length = A03.length() + 1;
                    int length2 = name.length();
                    int length3 = length2 - A02.length();
                    if (length3 < length2 && length < length3) {
                        try {
                            int parseInt = Integer.parseInt(name.substring(length, length3));
                            if (parseInt > i2) {
                                file2 = file3;
                                i2 = parseInt;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        if (file2 != null) {
            return file2.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A03);
        sb.append(".1");
        sb.append(A02);
        return sb.toString();
    }

    public static String A01(String str) {
        return A03(str, new Date()).substring(0, str.indexOf(46) + 1);
    }

    public static String A02(String str, String str2) {
        String substring = str.substring(str.indexOf(46));
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append(str2);
        return sb.toString();
    }

    public static String A03(String str, Date date) {
        String substring = str.substring(0, str.indexOf(46));
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append("-");
        sb.append(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(date));
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        r2 = r7.length();
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(java.io.File r16, java.lang.String r17, int r18, boolean r19) {
        /*
            r16.getAbsolutePath()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat
            r9.<init>(r0, r1)
            java.util.Date r15 = new java.util.Date
            r15.<init>()
            java.lang.String r14 = r9.toPattern()
            java.lang.String r0 = r16.getName()
            r1 = r17
            java.lang.String r8 = A02(r0, r1)
            java.lang.String r0 = r16.getName()
            java.lang.String r7 = A01(r0)
            r6 = 0
            r10 = r18
            if (r18 >= 0) goto L_0x00ae
            java.lang.String r1 = r16.getName()
            r0 = 46
            int r1 = r1.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x00b0
            java.lang.String r0 = r16.getName()
            java.lang.String r5 = r0.substring(r6, r1)
        L_0x0041:
            java.io.File r0 = r16.getParentFile()
            java.io.File[] r4 = r0.listFiles()
            if (r4 == 0) goto L_0x00b0
            int r3 = r4.length
        L_0x004c:
            if (r6 >= r3) goto L_0x00b0
            r13 = r4[r6]
            java.lang.String r11 = r13.getName()
            if (r18 >= 0) goto L_0x0060
            boolean r0 = r11.startsWith(r5)
            if (r0 == 0) goto L_0x00ab
            r13.delete()     // Catch:{  }
            goto L_0x00ab
        L_0x0060:
            boolean r0 = r11.startsWith(r7)
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r11.endsWith(r8)
            if (r0 == 0) goto L_0x00ab
            int r2 = r7.length()
            int r0 = r14.length()
            int r1 = r2 + r0
            int r0 = r11.length()
            if (r1 > r0) goto L_0x00ab
            java.lang.String r0 = r11.substring(r2, r1)
            java.util.Date r0 = r9.parse(r0)     // Catch:{ SecurityException -> 0x00ab }
            long r11 = r15.getTime()     // Catch:{ SecurityException -> 0x00ab }
            long r0 = r0.getTime()     // Catch:{ SecurityException -> 0x00ab }
            long r11 = r11 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ SecurityException -> 0x00ab }
            r0 = 1
            long r0 = r2.toMillis(r0)     // Catch:{ SecurityException -> 0x00ab }
            long r11 = r11 / r0
            if (r19 == 0) goto L_0x009c
            long r11 = java.lang.Math.abs(r11)     // Catch:{ SecurityException -> 0x00ab }
        L_0x009c:
            long r1 = (long) r10     // Catch:{ SecurityException -> 0x00ab }
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00a5
            r13.getAbsolutePath()     // Catch:{ SecurityException -> 0x00ab }
            goto L_0x00ab
        L_0x00a5:
            r13.getAbsolutePath()     // Catch:{ SecurityException -> 0x00ab }
            r13.delete()     // Catch:{ SecurityException -> 0x00ab }
        L_0x00ab:
            int r6 = r6 + 1
            goto L_0x004c
        L_0x00ae:
            r5 = 0
            goto L_0x0041
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02N.A04(java.io.File, java.lang.String, int, boolean):void");
    }
}
