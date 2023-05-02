package X;

/* renamed from: X.5Ay  reason: invalid class name */
public class AnonymousClass5Ay extends ThreadLocal {
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        /*
            r5 = this;
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.String r0 = "/dev/urandom"
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002d }
            r3.<init>(r0)     // Catch:{ IOException -> 0x002d }
            r0 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0028 }
            byte[] r0 = r1.array()     // Catch:{ all -> 0x0028 }
            r3.read(r0)     // Catch:{ all -> 0x0028 }
            long r1 = r1.getLong()     // Catch:{ all -> 0x0028 }
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x0028 }
            r0.<init>(r1)     // Catch:{ all -> 0x0028 }
            r3.close()     // Catch:{ IOException -> 0x002d }
            android.os.StrictMode.setThreadPolicy(r4)
            return r0
        L_0x0028:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r2 = move-exception
            java.lang.String r1 = "Cannot read from /dev/urandom"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0036 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Ay.initialValue():java.lang.Object");
    }
}
