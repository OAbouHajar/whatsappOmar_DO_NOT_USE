package X;

/* renamed from: X.65C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65C implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C118675v4 A01;

    public /* synthetic */ AnonymousClass65C(C118675v4 r1, long j2) {
        this.A01 = r1;
        this.A00 = j2;
    }

    public final void run() {
        C118675v4 r3 = this.A01;
        long j2 = this.A00;
        synchronized (r3) {
            Runtime.getRuntime().gc();
            r3.A01(j2);
        }
    }
}
