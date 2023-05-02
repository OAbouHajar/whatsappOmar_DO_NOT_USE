package X;

import android.os.CancellationSignal;

/* renamed from: X.024  reason: invalid class name */
public final class AnonymousClass024 {
    public C12370kH A00;
    public Object A01;
    public boolean A02;
    public boolean A03;

    public Object A00() {
        Object obj;
        synchronized (this) {
            if (this.A01 == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.A01 = cancellationSignal;
                if (this.A03) {
                    C04070Lb.A00(cancellationSignal);
                }
            }
            obj = this.A01;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.AO4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        X.C04070Lb.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.A02 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0029, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.A02 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002f, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r2 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A03     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0007:
            r0 = 1
            r3.A03 = r0     // Catch:{ all -> 0x0034 }
            r3.A02 = r0     // Catch:{ all -> 0x0034 }
            X.0kH r2 = r3.A00     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0034 }
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            r1 = 0
            if (r2 == 0) goto L_0x0017
            r2.AO4()     // Catch:{ all -> 0x001d }
        L_0x0017:
            if (r0 == 0) goto L_0x0029
            X.C04070Lb.A00(r0)     // Catch:{ all -> 0x001d }
            goto L_0x0029
        L_0x001d:
            r0 = move-exception
            monitor-enter(r3)
            r3.A02 = r1     // Catch:{ all -> 0x0026 }
            r3.notifyAll()     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r0 = move-exception
            goto L_0x0024
        L_0x0028:
            throw r0
        L_0x0029:
            monitor-enter(r3)
            r3.A02 = r1     // Catch:{ all -> 0x0031 }
            r3.notifyAll()     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0
        L_0x0034:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass024.A01():void");
    }

    public void A02() {
        if (A04()) {
            throw new AnonymousClass057();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:20:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C12370kH r2) {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            boolean r0 = r1.A02     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0009
            r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0009:
            X.0kH r0 = r1.A00     // Catch:{ all -> 0x001a }
            if (r0 == r2) goto L_0x0018
            r1.A00 = r2     // Catch:{ all -> 0x001a }
            boolean r0 = r1.A03     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0018
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            r2.AO4()
            return
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass024.A03(X.0kH):void");
    }

    public boolean A04() {
        boolean z2;
        synchronized (this) {
            z2 = this.A03;
        }
        return z2;
    }
}
