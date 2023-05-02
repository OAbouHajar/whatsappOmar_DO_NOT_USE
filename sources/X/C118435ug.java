package X;

import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1;
import java.util.ArrayList;

/* renamed from: X.5ug  reason: invalid class name and case insensitive filesystem */
public class C118435ug {
    public final Context A00;
    public final C14870pt A01;
    public final C18340wX A02;
    public final C18310wU A03;
    public final C119285wq A04;
    public final AnonymousClass1Vo A05 = C110105dW.A0Q("PaymentProviderKeyAction", "network");
    public final String A06;

    public C118435ug(Context context, C14870pt r4, C18340wX r5, C18310wU r6, C119285wq r7, String str) {
        this.A00 = context;
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = r7;
        this.A06 = str;
    }

    public void A00(AnonymousClass692 r14, String str) {
        ArrayList A0u = AnonymousClass000.A0u();
        C110105dW.A1P("action", "get-provider-key", A0u);
        C110105dW.A1P("provider", str, A0u);
        C110105dW.A1P("key-scope", this.A06, A0u);
        C28371Vv A0V = C110105dW.A0V(A0u);
        C18310wU r7 = this.A03;
        Context context = this.A00;
        C14870pt r3 = this.A01;
        r7.A0H(new IDxRCallbackShape20S0200000_3_I1(context, this.A02, r3, r14, this, 12), A0V, "get", 0);
    }
}
