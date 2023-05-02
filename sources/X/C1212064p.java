package X;

/* renamed from: X.64p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1212064p implements Runnable {
    public final /* synthetic */ C110645ea A00;

    public /* synthetic */ C1212064p(C110645ea r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass5xC r0;
        AnonymousClass5xB r1;
        C110645ea r2 = this.A00;
        AnonymousClass1Vt r3 = r2.A08;
        AnonymousClass1W2 r12 = r3.A0A;
        if (!(r12 instanceof C111855hW) || (r0 = ((C111855hW) r12).A0B) == null || (r1 = r0.A0C) == null) {
            C18290wS r02 = r2.A0H;
            r02.A06();
            r02.A08.A0g(r3.A0K, 40, 15, r3.A05, r3.A06);
        } else {
            r1.A08 = "REJECT";
            r1.A09 = "SUCCESS";
            C18290wS r03 = r2.A0H;
            r03.A06();
            r03.A08.A0j(r3);
        }
        r2.A0C.A0K(new C1212464t(r2));
    }
}
