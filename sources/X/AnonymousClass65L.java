package X;

/* renamed from: X.65L  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65L implements Runnable {
    public final /* synthetic */ AnonymousClass5wW A00;
    public final /* synthetic */ C117385su A01;

    public /* synthetic */ AnonymousClass65L(AnonymousClass5wW r1, C117385su r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass5wW r3 = this.A00;
        C117385su r2 = this.A01;
        AnonymousClass1Vo r1 = r3.A0A;
        StringBuilder A0r = AnonymousClass000.A0r("onPayRequestFromNonWa; request is expired; transaction id: ");
        String str = r2.A03;
        r1.A06(AnonymousClass000.A0h(str, A0r));
        C221116r r12 = r3.A03;
        r12.A0e(r12.A0M((String) null, str));
    }
}
