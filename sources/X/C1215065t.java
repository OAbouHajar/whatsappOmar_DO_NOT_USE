package X;

/* renamed from: X.65t  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1215065t implements Runnable {
    public final /* synthetic */ AnonymousClass1Vt A00;
    public final /* synthetic */ C110645ea A01;

    public /* synthetic */ C1215065t(AnonymousClass1Vt r1, C110645ea r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C110645ea r4 = this.A01;
        AnonymousClass1Vt r3 = this.A00;
        C18290wS r0 = r4.A0H;
        r0.A06();
        r0.A08.A0l(r3, (AnonymousClass1Vt) null, r3.A0L);
        C13680ns.A0z(C110105dW.A06(r4.A0F), "payment_has_received_upi_mandate_request", true);
        r4.A0C.A0K(new C1214965s(r3, r4));
    }
}
