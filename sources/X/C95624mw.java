package X;

/* renamed from: X.4mw  reason: invalid class name and case insensitive filesystem */
public class C95624mw implements C13600me {
    public C09110ev A00;
    public final int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4 > ((X.AnonymousClass5TH) r3.A04()).AG6()) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95624mw(X.C09110ev r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r4 < 0) goto L_0x0012
            java.lang.Object r0 = r3.A04()
            X.5TH r0 = (X.AnonymousClass5TH) r0
            int r1 = r0.AG6()
            r0 = 1
            if (r4 <= r1) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            X.AnonymousClass0T3.A00(r0)
            X.0ev r0 = r3.clone()
            r2.A00 = r0
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95624mw.<init>(X.0ev, int):void");
    }

    public synchronized void A00() {
        if (isClosed()) {
            throw new C11120iE();
        }
    }

    public synchronized byte AbM(int i2) {
        A00();
        boolean z2 = true;
        AnonymousClass0T3.A00(C13700nu.A0f(i2));
        if (i2 >= this.A01) {
            z2 = false;
        }
        AnonymousClass0T3.A00(z2);
        return ((AnonymousClass5TH) this.A00.A04()).AbM(i2);
    }

    public synchronized int AbS(byte[] bArr, int i2, int i3, int i4) {
        A00();
        boolean z2 = false;
        if (i2 + i4 <= this.A01) {
            z2 = true;
        }
        AnonymousClass0T3.A00(z2);
        return ((AnonymousClass5TH) this.A00.A04()).AbS(bArr, i2, i3, i4);
    }

    public synchronized void close() {
        C09110ev r0 = this.A00;
        if (r0 != null) {
            r0.close();
        }
        this.A00 = null;
    }

    public synchronized boolean isClosed() {
        return !C09110ev.A01(this.A00);
    }

    public synchronized int size() {
        A00();
        return this.A01;
    }
}
