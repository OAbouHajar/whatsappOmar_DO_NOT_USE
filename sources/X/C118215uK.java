package X;

/* renamed from: X.5uK  reason: invalid class name and case insensitive filesystem */
public class C118215uK {
    public final C118655v2 A00 = new C118655v2();
    public final C118855vM A01 = new C118855vM();
    public final C118855vM A02 = new C118855vM();
    public volatile C115075p4 A03;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(boolean r4, android.hardware.Camera r5) {
        /*
            r3 = this;
            X.5v2 r1 = r3.A00
            java.util.concurrent.locks.ReentrantLock r2 = r1.A01
            r2.lock()
            if (r5 == 0) goto L_0x003c
            boolean r0 = r1.A01()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x003c
            r5.stopPreview()     // Catch:{ all -> 0x0037 }
            r2.lock()     // Catch:{ all -> 0x0037 }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0032 }
            r2.unlock()     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x003c
            X.5vM r1 = r3.A02     // Catch:{ all -> 0x0037 }
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x0037 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x003c
            java.util.List r1 = r1.A00     // Catch:{ all -> 0x0037 }
            X.658 r0 = new X.658     // Catch:{ all -> 0x0037 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0037 }
            X.AnonymousClass5xT.A00(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x003c
        L_0x0032:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x003c:
            r2.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118215uK.A00(boolean, android.hardware.Camera):void");
    }
}
