package X;

/* renamed from: X.5v4  reason: invalid class name and case insensitive filesystem */
public final class C118675v4 {
    public Runnable A00;
    public final C16320sq A01;

    public C118675v4(C16320sq r1) {
        this.A01 = r1;
    }

    public synchronized void A00() {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A01.Ac3(runnable);
            this.A00 = null;
        }
    }

    public synchronized void A01(long j2) {
        A00();
        this.A00 = this.A01.Ad4(new AnonymousClass65C(this, j2), "LiteCameraView/GarbageCollector", j2);
    }
}
