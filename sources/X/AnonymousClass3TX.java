package X;

import android.graphics.Bitmap;

/* renamed from: X.3TX  reason: invalid class name */
public class AnonymousClass3TX extends AnonymousClass3TY {
    public C09110ev A00;
    public final C88824b9 A01;
    public volatile Bitmap A02;

    public AnonymousClass3TX(C09110ev r2, C88824b9 r3) {
        C09110ev A03 = r2.A03();
        this.A00 = A03;
        this.A02 = (Bitmap) A03.A04();
        this.A01 = r3;
    }

    public int A00() {
        return C89624cY.A01(this.A02);
    }

    public synchronized boolean A01() {
        return AnonymousClass000.A1W(this.A00);
    }

    public synchronized C09110ev A02() {
        C09110ev r0;
        r0 = this.A00;
        return r0 != null ? r0.A03() : null;
    }

    public void close() {
        C09110ev r1;
        synchronized (this) {
            r1 = this.A00;
            this.A00 = null;
            this.A02 = null;
        }
        if (r1 != null) {
            r1.close();
        }
    }
}
