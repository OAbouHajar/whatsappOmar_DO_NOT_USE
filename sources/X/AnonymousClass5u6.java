package X;

/* renamed from: X.5u6  reason: invalid class name */
public class AnonymousClass5u6 {
    public final /* synthetic */ C1222969a A00;
    public final /* synthetic */ C114175nF A01;

    public AnonymousClass5u6(C1222969a r1, C114175nF r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(AnonymousClass1Vt r4, AnonymousClass2HJ r5) {
        if (r5 != null || r4 == null) {
            C114175nF r2 = this.A01;
            r2.A0f.A06(AnonymousClass000.A0g("send UpiRaiseComplaint: onRequestError: ", r5));
            C1222969a r1 = this.A00;
            if (r1 != null) {
                r1.AKK(r5, 18);
            }
            C110755em.A01(r2, new C114125nA(AnonymousClass2EA.A03));
            r2.A0S(false);
            return;
        }
        C114175nF r12 = this.A01;
        C18290wS r0 = r12.A0c;
        r0.A06();
        r0.A08.A0j(r4);
        r12.A0H.A0K(new C1215665z(r4, this));
    }
}
