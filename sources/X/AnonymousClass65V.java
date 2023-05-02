package X;

/* renamed from: X.65V  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65V implements Runnable {
    public final /* synthetic */ AnonymousClass1Vt A00;
    public final /* synthetic */ AnonymousClass5kl A01;

    public /* synthetic */ AnonymousClass65V(AnonymousClass1Vt r1, AnonymousClass5kl r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass5kl r2 = this.A01;
        AnonymousClass1Vt r1 = this.A00;
        C30671cl r0 = r2.A02;
        if (r0 == null) {
            r2.Ac1();
            r2.A2X(r2.A3j(), true);
            return;
        }
        C111805hR r02 = (C111805hR) r0.A08;
        if (r02 == null || AnonymousClass000.A1X(r02.A05.A00)) {
            r2.A3m(r1);
            return;
        }
        r2.Ac1();
        r2.A3p(r2.A08);
    }
}
