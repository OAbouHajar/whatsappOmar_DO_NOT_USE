package X;

/* renamed from: X.65w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1215365w implements Runnable {
    public final /* synthetic */ C111855hW A00;
    public final /* synthetic */ C110645ea A01;

    public /* synthetic */ C1215365w(C111855hW r1, C110645ea r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C110645ea r2 = this.A01;
        AnonymousClass5x8 r1 = this.A00.A0B.A0B;
        if (r1 != null) {
            r1.A02 = "RESUME";
            r1.A03 = "PENDING";
        }
        C18290wS r0 = r2.A0H;
        r0.A06();
        r0.A08.A0j(r2.A08);
        r2.A0C.A0K(new C1212364s(r2));
    }
}
