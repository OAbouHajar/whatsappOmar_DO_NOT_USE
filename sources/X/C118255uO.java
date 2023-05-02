package X;

import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape93S0100000_3_I0;

/* renamed from: X.5uO  reason: invalid class name and case insensitive filesystem */
public class C118255uO {
    public C14870pt A00;
    public C18340wX A01;
    public C18300wT A02;
    public C18310wU A03;

    public void A00(Context context) {
        String A022 = this.A03.A08.A02();
        AnonymousClass2BJ r4 = new AnonymousClass2BJ(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ.A00(A0X, "xmlns", "w:pay");
        C32461gQ A0Z = C110105dW.A0Z(A0X);
        C32461gQ.A00(A0Z, "action", "get-is-account-recoverable");
        C28371Vv A0S = C110105dW.A0S(A0Z, A0X, r4);
        C18310wU r7 = this.A03;
        C14870pt r42 = this.A00;
        Context context2 = context;
        r7.A0G(new IDxRCallbackShape93S0100000_3_I0(context2, this.A01, r42, this, 1), A0S, A022, 0);
    }
}
