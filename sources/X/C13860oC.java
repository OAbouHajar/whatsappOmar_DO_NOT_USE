package X;

/* renamed from: X.0oC  reason: invalid class name and case insensitive filesystem */
public class C13860oC {
    public static int A00;
    public static String A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.io.Reader] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051 A[SYNTHETIC, Splitter:B:24:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00() {
        /*
            java.lang.String r3 = A01
            if (r3 != 0) goto L_0x005d
            int r2 = A00
            if (r2 != 0) goto L_0x000e
            int r2 = android.os.Process.myPid()
            A00 = r2
        L_0x000e:
            r3 = 0
            if (r2 <= 0) goto L_0x005b
            r0 = 25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0055, all -> 0x004b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0055, all -> 0x004b }
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch:{ IOException -> 0x0055, all -> 0x004b }
            r1.append(r2)     // Catch:{ IOException -> 0x0055, all -> 0x004b }
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch:{ IOException -> 0x0055, all -> 0x004b }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0055, all -> 0x004b }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0055, all -> 0x004b }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0046 }
            r0.<init>(r1)     // Catch:{ all -> 0x0046 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0046 }
            r1.<init>(r0)     // Catch:{ all -> 0x0046 }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0055, all -> 0x004b }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0056, all -> 0x004d }
            X.C13710nw.A01(r0)     // Catch:{ IOException -> 0x0056, all -> 0x004d }
            java.lang.String r3 = r0.trim()     // Catch:{ IOException -> 0x0056, all -> 0x004d }
            goto L_0x0056
        L_0x0046:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0055, all -> 0x004b }
            throw r0     // Catch:{ IOException -> 0x0055, all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r3 = r1
        L_0x004f:
            if (r3 == 0) goto L_0x0054
            r3.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            throw r0
        L_0x0055:
            r1 = r3
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            A01 = r3
        L_0x005d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13860oC.A00():java.lang.String");
    }
}
