package X;

/* renamed from: X.5ts  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117985ts {
    public final /* synthetic */ C110575eS A00;

    public /* synthetic */ C117985ts(C110575eS r1) {
        this.A00 = r1;
    }

    public final void A00(C28401Vy r7, C28401Vy r8, AnonymousClass2HJ r9) {
        C110575eS r5 = this.A00;
        AnonymousClass027 r1 = r5.A01;
        C116815rz r0 = new C116815rz();
        r0.A01 = true;
        r1.A0B(r0);
        if (r9 != null || r7 == null || r8 == null) {
            r5.A06.A04(AnonymousClass000.A0h(r9.A08, AnonymousClass000.A0r("error: ")));
            C117295sl r12 = new C117295sl(1);
            r12.A00 = r9;
            r5.A07.A0B(r12);
            return;
        }
        C117295sl r4 = new C117295sl(0);
        C28411Vz r3 = C35481m0.A05;
        AnonymousClass013 r2 = r5.A03;
        r4.A01 = r3.A9H(r2, r7, 0);
        r4.A02 = r3.A9H(r2, r8, 0);
        r5.A07.A0B(r4);
    }
}
