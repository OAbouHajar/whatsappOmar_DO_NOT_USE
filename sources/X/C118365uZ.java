package X;

import java.util.ArrayList;

/* renamed from: X.5uZ  reason: invalid class name and case insensitive filesystem */
public class C118365uZ {
    public final C18260wP A00;
    public final C18300wT A01;
    public final C18310wU A02;
    public final C116325rC A03;
    public final AnonymousClass0y5 A04;
    public final C16320sq A05;

    public C118365uZ(C18260wP r1, C18300wT r2, C18310wU r3, C116325rC r4, AnonymousClass0y5 r5, C16320sq r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A00(C1222268t r12, C117915tl r13, String str) {
        C1222268t r6 = r12;
        if ("token".equals(r13.A00.A03)) {
            ArrayList A0u = AnonymousClass000.A0u();
            C13680ns.A1W("fbpay_pin", str, A0u);
            C16320sq r0 = this.A05;
            C116325rC r7 = this.A03;
            C18300wT r3 = this.A01;
            AnonymousClass0y5 r8 = this.A04;
            C13700nu.A0W(new C112105hx(this.A00, r3, this.A02, (C118245uN) null, r6, r7, r8, A0u, 0), r0);
            return;
        }
        r12.AYC(str);
    }
}
