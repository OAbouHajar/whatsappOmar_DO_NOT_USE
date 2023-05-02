package X;

/* renamed from: X.66W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66W implements Runnable {
    public final /* synthetic */ C30671cl A00;
    public final /* synthetic */ AnonymousClass5xB A01;
    public final /* synthetic */ C110645ea A02;

    public /* synthetic */ AnonymousClass66W(C30671cl r1, AnonymousClass5xB r2, C110645ea r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C110645ea r3 = this.A02;
        AnonymousClass5xB r1 = this.A01;
        C30671cl r0 = this.A00;
        if (r1 != null) {
            r1.A08 = "ACCEPT";
            r1.A09 = "PENDING";
        } else {
            if (r0 != null) {
                AnonymousClass1Vt r2 = r3.A08;
                r2.A0H = r0.A0A;
                r2.A06 = r3.A04.A00();
                r2.A02 = 401;
            }
            r3.A0C.A0K(new C1211964o(r3));
        }
        C18290wS r02 = r3.A0H;
        r02.A06();
        r02.A08.A0j(r3.A08);
        r3.A0C.A0K(new C1211964o(r3));
    }
}
