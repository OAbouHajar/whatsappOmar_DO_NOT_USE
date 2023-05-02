package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.1dU  reason: invalid class name and case insensitive filesystem */
public final class C31111dU {
    public static final FileFilter A00 = new AnonymousClass54Z();

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x00d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x00da */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00() {
        /*
            r9 = 0
            r5 = -1
            r8 = 0
            r6 = -1
        L_0x0004:
            int r0 = A01()     // Catch:{ IOException -> 0x00dc }
            if (r8 >= r0) goto L_0x0062
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00dc }
            r1.<init>()     // Catch:{ IOException -> 0x00dc }
            java.lang.String r0 = "/sys/devices/system/cpu/cpu"
            r1.append(r0)     // Catch:{ IOException -> 0x00dc }
            r1.append(r8)     // Catch:{ IOException -> 0x00dc }
            java.lang.String r0 = "/cpufreq/cpuinfo_max_freq"
            r1.append(r0)     // Catch:{ IOException -> 0x00dc }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00dc }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x00dc }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00dc }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x00dc }
            if (r0 == 0) goto L_0x005f
            r0 = 128(0x80, float:1.794E-43)
            byte[] r7 = new byte[r0]     // Catch:{ IOException -> 0x00dc }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ NumberFormatException -> 0x005f }
            r4.<init>(r1)     // Catch:{ NumberFormatException -> 0x005f }
            int r3 = r4.read(r7)     // Catch:{ all -> 0x005a }
            r2 = 0
        L_0x0039:
            byte r1 = r7[r2]     // Catch:{ all -> 0x005a }
            r0 = 48
            if (r1 < r0) goto L_0x004a
            byte r1 = r7[r2]     // Catch:{ all -> 0x005a }
            r0 = 57
            if (r1 > r0) goto L_0x004a
            if (r2 >= r3) goto L_0x004a
            int r2 = r2 + 1
            goto L_0x0039
        L_0x004a:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x005a }
            r0.<init>(r7, r9, r2)     // Catch:{ all -> 0x005a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x005a }
            if (r0 <= r6) goto L_0x0056
            r6 = r0
        L_0x0056:
            r4.close()     // Catch:{ NumberFormatException -> 0x005f }
            goto L_0x005f
        L_0x005a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0     // Catch:{ NumberFormatException -> 0x005f }
        L_0x005f:
            int r8 = r8 + 1
            goto L_0x0004
        L_0x0062:
            if (r6 != r5) goto L_0x00db
            java.lang.String r0 = "/proc/cpuinfo"
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00dc }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00dc }
            java.lang.String r11 = "cpu MHz"
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r9]     // Catch:{ all -> 0x00d6 }
            int r10 = r4.read(r8)     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            r3 = 0
        L_0x0076:
            if (r3 >= r10) goto L_0x00d2
            byte r0 = r8[r3]     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            r1 = 10
            if (r0 == r1) goto L_0x0080
            if (r3 != 0) goto L_0x009e
        L_0x0080:
            byte r0 = r8[r3]     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            if (r0 != r1) goto L_0x0086
            int r3 = r3 + 1
        L_0x0086:
            r7 = r3
        L_0x0087:
            if (r7 >= r10) goto L_0x009e
            int r2 = r7 - r3
            byte r1 = r8[r7]     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            char r0 = r11.charAt(r2)     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            if (r1 != r0) goto L_0x009e
            int r0 = r11.length()     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            int r0 = r0 + -1
            if (r2 == r0) goto L_0x00a1
            int r7 = r7 + 1
            goto L_0x0087
        L_0x009e:
            int r3 = r3 + 1
            goto L_0x0076
        L_0x00a1:
            if (r7 >= r9) goto L_0x00d2
            byte r1 = r8[r7]     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            r0 = 10
            if (r1 == r0) goto L_0x00d2
            r3 = 48
            if (r1 < r3) goto L_0x00c0
            r2 = 57
            if (r1 > r2) goto L_0x00c0
            int r1 = r7 + 1
        L_0x00b3:
            if (r1 >= r9) goto L_0x00c3
            byte r0 = r8[r1]     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            if (r0 < r3) goto L_0x00c3
            byte r0 = r8[r1]     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            if (r0 > r2) goto L_0x00c3
            int r1 = r1 + 1
            goto L_0x00b3
        L_0x00c0:
            int r7 = r7 + 1
            goto L_0x00a1
        L_0x00c3:
            int r1 = r1 - r7
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            r0.<init>(r8, r7, r1)     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | NumberFormatException -> 0x00d2 }
            int r0 = r0 * 1000
            if (r0 <= r6) goto L_0x00d2
            r6 = r0
        L_0x00d2:
            r4.close()     // Catch:{ IOException -> 0x00dc }
            return r6
        L_0x00d6:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00da }
        L_0x00da:
            throw r0     // Catch:{ IOException -> 0x00dc }
        L_0x00db:
            return r6
        L_0x00dc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31111dU.A00():int");
    }

    public static int A01() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(A00).length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(java.lang.String r6) {
        /*
            java.lang.String r1 = "/proc/cpuinfo"
            java.lang.String r2 = "DeviceInfo/searchFileForText bufferedReader.close failed"
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r0)
            r5 = 0
            r4 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0059 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x001e }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x001e }
            r0.<init>(r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x001e }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x001e }
            r1.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x001e }
            goto L_0x002f
        L_0x001e:
            r1 = move-exception
            java.lang.String r0 = "searchFileForText/unsupported-encoding: UTF-8"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0054 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0054 }
            r0.<init>(r3)     // Catch:{ all -> 0x0054 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0054 }
            r1.<init>(r0)     // Catch:{ all -> 0x0054 }
        L_0x002f:
            r5 = r1
        L_0x0030:
            java.lang.String r1 = r5.readLine()     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0050
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ all -> 0x0054 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0030
            r1 = 1
            r3.close()     // Catch:{ Exception -> 0x0059 }
            r5.close()     // Catch:{ Exception -> 0x004a }
            goto L_0x004f
        L_0x004a:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r1
        L_0x004f:
            return r1
        L_0x0050:
            r3.close()     // Catch:{ Exception -> 0x0059 }
            goto L_0x0061
        L_0x0054:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0     // Catch:{ Exception -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            java.lang.String r0 = "DeviceInfo/searchFileForText read failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x006a }
            if (r5 == 0) goto L_0x0069
        L_0x0061:
            r5.close()     // Catch:{ Exception -> 0x0065 }
            return r4
        L_0x0065:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
        L_0x0069:
            return r4
        L_0x006a:
            r1 = move-exception
            if (r5 == 0) goto L_0x0075
            r5.close()     // Catch:{ Exception -> 0x0071 }
            throw r1
        L_0x0071:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
        L_0x0075:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31111dU.A02(java.lang.String):boolean");
    }
}
