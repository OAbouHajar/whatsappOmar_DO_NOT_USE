package X;

/* renamed from: X.66O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66O implements Runnable {
    public final /* synthetic */ AnonymousClass5kl A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass66O(AnonymousClass5kl r1, Runnable runnable, boolean z2) {
        this.A00 = r1;
        this.A02 = z2;
        this.A01 = runnable;
    }

    public final void run() {
        AnonymousClass5kl r2 = this.A00;
        boolean z2 = this.A02;
        Runnable runnable = this.A01;
        if (z2) {
            r2.Ac1();
        }
        runnable.run();
    }
}
