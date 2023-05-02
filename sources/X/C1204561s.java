package X;

import com.facebook.redex.IDxSListenerShape310S0100000_3_I1;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.61s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1204561s implements AnonymousClass5QA {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public /* synthetic */ C1204561s(AnonymousClass1Z7 r1, BrazilPayBloksActivity brazilPayBloksActivity) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
    }

    public final void Aas(C28371Vv r7) {
        C28371Vv A0J;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        AnonymousClass1Z7 r4 = this.A00;
        C28371Vv A0J2 = r7.A0J("pay");
        if (A0J2 != null && (A0J = A0J2.A0J("card")) != null) {
            brazilPayBloksActivity.A0G.A01().A02(new IDxSListenerShape310S0100000_3_I1(r4, 0), C110115dX.A0E(brazilPayBloksActivity.A03, new C111815hS(), A0J));
        }
    }
}
