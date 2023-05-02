package X;

import android.graphics.Bitmap;

/* renamed from: X.0eV  reason: invalid class name and case insensitive filesystem */
public class C08870eV implements C13340ls {
    public int A00 = -1;
    public C09110ev A01;

    public final synchronized void A00() {
        C09110ev r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
        this.A01 = null;
        this.A00 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (X.C09110ev.A01(r2.A01) == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A6d(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0011 }
            if (r3 != r0) goto L_0x000e
            X.0ev r0 = r2.A01     // Catch:{ all -> 0x0011 }
            boolean r1 = X.C09110ev.A01(r0)     // Catch:{ all -> 0x0011 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08870eV.A6d(int):boolean");
    }

    public synchronized C09110ev AA5(int i2, int i3, int i4) {
        C09110ev A03;
        try {
            C09110ev r0 = this.A01;
            A03 = r0 != null ? r0.A03() : null;
            A00();
        } catch (Throwable th) {
            A00();
            throw th;
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0005, code lost:
        r0 = r1.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C09110ev AAK(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.A00     // Catch:{ all -> 0x0011 }
            if (r0 != r2) goto L_0x000e
            X.0ev r0 = r1.A01     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            X.0ev r0 = r0.A03()     // Catch:{ all -> 0x0011 }
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r1)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08870eV.AAK(int):X.0ev");
    }

    public synchronized C09110ev ACA(int i2) {
        C09110ev r0;
        r0 = this.A01;
        return r0 != null ? r0.A03() : null;
    }

    public void ARc(C09110ev r1, int i2, int i3) {
    }

    public synchronized void ARe(C09110ev r3, int i2, int i3) {
        if (this.A01 == null || !((Bitmap) r3.A04()).equals(this.A01.A04())) {
            C09110ev r0 = this.A01;
            if (r0 != null) {
                r0.close();
            }
            this.A01 = r3.A03();
            this.A00 = i2;
        }
    }

    public synchronized void clear() {
        A00();
    }
}
