package X;

import android.os.SystemClock;

/* renamed from: X.1DX  reason: invalid class name */
public class AnonymousClass1DX {
    public int A00 = 1;
    public int A01 = -1;
    public long A02;
    public final C16490t9 A03;

    public AnonymousClass1DX(C16490t9 r2) {
        this.A03 = r2;
    }

    public void A00() {
        if (this.A01 == 1) {
            this.A01 = 0;
            this.A00 = 1;
        }
    }

    public void A01(String str) {
        if (this.A01 != 1) {
            this.A01 = -1;
            return;
        }
        AnonymousClass2KV r2 = new AnonymousClass2KV();
        r2.A01 = Long.valueOf(SystemClock.elapsedRealtime() - this.A02);
        r2.A02 = str;
        r2.A00 = Integer.valueOf(this.A00);
        this.A03.A07(r2, 650);
        this.A01 = -1;
        this.A00 = 1;
    }
}
