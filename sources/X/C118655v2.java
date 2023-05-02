package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.5v2  reason: invalid class name and case insensitive filesystem */
public class C118655v2 {
    public int A00 = 0;
    public final ReentrantLock A01 = new ReentrantLock();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r1 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00() {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r2 = r3.A01
            r2.lock()
            r2.lock()     // Catch:{ all -> 0x0032 }
            int r0 = r3.A00     // Catch:{ all -> 0x002d }
            r1 = 2
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1R(r0, r1)
            r2.unlock()     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x0028
            r2.lock()     // Catch:{ all -> 0x0032 }
            int r0 = r3.A00     // Catch:{ all -> 0x002d }
            r1 = 4
            r0 = r0 & 4
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            r2.unlock()     // Catch:{ all -> 0x0032 }
            r0 = 0
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            r2.unlock()
            return r0
        L_0x002d:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118655v2.A00():boolean");
    }

    public boolean A01() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            return AnonymousClass000.A1P(this.A00);
        } finally {
            reentrantLock.unlock();
        }
    }
}
