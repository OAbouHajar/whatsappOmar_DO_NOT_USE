package X;

/* renamed from: X.5w1  reason: invalid class name */
public class AnonymousClass5w1 {
    public static final String[] A00 = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0030 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00() {
        /*
            r4 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = "mount"
            java.lang.Process r3 = r1.exec(r0)     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0039
            java.io.InputStream r2 = r3.getInputStream()     // Catch:{ IOException | NoSuchElementException -> 0x0031, all -> 0x0036 }
            if (r2 == 0) goto L_0x0036
            java.util.Scanner r1 = new java.util.Scanner     // Catch:{ all -> 0x002c }
            r1.<init>(r2)     // Catch:{ all -> 0x002c }
            java.lang.String r0 = "\\A"
            java.util.Scanner r0 = r1.useDelimiter(r0)     // Catch:{ all -> 0x002c }
            java.lang.String r1 = r0.next()     // Catch:{ all -> 0x002c }
            java.lang.String r0 = "\n"
            java.lang.String[] r10 = r1.split(r0)     // Catch:{ all -> 0x002c }
            r2.close()     // Catch:{ IOException | NoSuchElementException -> 0x0031, all -> 0x0036 }
            goto L_0x003b
        L_0x002c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ IOException | NoSuchElementException -> 0x0031, all -> 0x0036 }
        L_0x0031:
            r3.destroy()
            r10 = r4
            goto L_0x003e
        L_0x0036:
            r3.destroy()
        L_0x0039:
            r10 = r4
            goto L_0x003e
        L_0x003b:
            r3.destroy()
        L_0x003e:
            r0 = 0
            if (r10 != 0) goto L_0x0042
            return r0
        L_0x0042:
            int r9 = android.os.Build.VERSION.SDK_INT
            int r8 = r10.length
            r7 = 0
            r14 = 0
        L_0x0047:
            if (r7 >= r8) goto L_0x00a5
            r1 = r10[r7]
            java.lang.String r0 = " "
            java.lang.String[] r3 = r1.split(r0)
            r1 = 23
            int r2 = r3.length
            if (r9 > r1) goto L_0x009a
            r0 = 4
            if (r2 < r0) goto L_0x00a2
            r0 = 1
            r12 = r3[r0]
            r0 = 3
        L_0x005d:
            r13 = r3[r0]
            java.lang.String[] r11 = A00
            int r6 = r11.length
            r5 = 0
        L_0x0063:
            if (r5 >= r6) goto L_0x00a2
            r0 = r11[r5]
            boolean r0 = r12.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0092
            if (r9 <= r1) goto L_0x007d
            java.lang.String r0 = "("
            java.lang.String r2 = ""
            java.lang.String r1 = r13.replace(r0, r2)
            java.lang.String r0 = ")"
            java.lang.String r13 = r1.replace(r0, r2)
        L_0x007d:
            java.lang.String r0 = ","
            java.lang.String[] r4 = r13.split(r0)
            int r3 = r4.length
            r2 = 0
        L_0x0085:
            if (r2 >= r3) goto L_0x0092
            r1 = r4[r2]
            java.lang.String r0 = "rw"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0097
            r14 = 1
        L_0x0092:
            int r5 = r5 + 1
            r1 = 23
            goto L_0x0063
        L_0x0097:
            int r2 = r2 + 1
            goto L_0x0085
        L_0x009a:
            r0 = 6
            if (r2 < r0) goto L_0x00a2
            r0 = 2
            r12 = r3[r0]
            r0 = 5
            goto L_0x005d
        L_0x00a2:
            int r7 = r7 + 1
            goto L_0x0047
        L_0x00a5:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5w1.A00():boolean");
    }
}
