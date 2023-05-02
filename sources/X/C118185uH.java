package X;

import com.facebook.redex.IDxSListenerShape50S0200000_3_I1;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.5uH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118185uH {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C118185uH(AnonymousClass1Z7 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void A00(AnonymousClass2HJ r12) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        String str = this.A02;
        AnonymousClass1Z7 r4 = this.A00;
        if (r12 != null) {
            int i2 = r12.A01;
            HashMap A0x = AnonymousClass000.A0x();
            A0x.put("remaining_retries", String.valueOf(i2));
            C110105dW.A1I(r12, A0x);
            if (i2 >= 0) {
                C42511xv A012 = brazilPayBloksActivity.A0G.A01();
                AnonymousClass606 r5 = new AnonymousClass606(i2);
                IDxSListenerShape50S0200000_3_I1 iDxSListenerShape50S0200000_3_I1 = new IDxSListenerShape50S0200000_3_I1(A0x, 11, r4);
                C16320sq r9 = A012.A03;
                C13680ns.A1U(new C111735hK(r5, iDxSListenerShape50S0200000_3_I1, A012.A01, A012.A02, r9, str), r9);
                return;
            }
            r4.A01("on_failure", A0x);
            return;
        }
        r4.A00("on_success");
    }
}
