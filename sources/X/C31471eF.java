package X;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: X.1eF  reason: invalid class name and case insensitive filesystem */
public final class C31471eF implements Closeable {
    public FileOutputStream A00;
    public FileLock A01;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 == null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31471eF(java.io.File r3, boolean r4) {
        /*
            r2 = this;
            r2.<init>()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            r2.A00 = r0
            if (r4 == 0) goto L_0x0017
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x0015 }
            java.nio.channels.FileLock r1 = r0.tryLock()     // Catch:{ IOException -> 0x0015 }
            goto L_0x001f
        L_0x0015:
            r1 = 0
            goto L_0x0021
        L_0x0017:
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ all -> 0x0029 }
            java.nio.channels.FileLock r1 = r0.lock()     // Catch:{ all -> 0x0029 }
        L_0x001f:
            if (r1 != 0) goto L_0x0026
        L_0x0021:
            java.io.FileOutputStream r0 = r2.A00
            r0.close()
        L_0x0026:
            r2.A01 = r1
            return
        L_0x0029:
            r1 = move-exception
            java.io.FileOutputStream r0 = r2.A00
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31471eF.<init>(java.io.File, boolean):void");
    }

    public void close() {
        try {
            FileLock fileLock = this.A01;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.A00.close();
        }
    }
}
