package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.payments.IDxRCallbackShape94S0100000_3_I1;
import java.util.ArrayList;

/* renamed from: X.5uf  reason: invalid class name and case insensitive filesystem */
public class C118425uf {
    public final Context A00;
    public final C14870pt A01;
    public final C18260wP A02;
    public final C18340wX A03;
    public final C18310wU A04;
    public final AnonymousClass68U A05;
    public final AnonymousClass1Vo A06 = C110105dW.A0Q("PaymentGetTokenIdAction", "network");

    public C118425uf(Context context, C14870pt r4, C18260wP r5, C18340wX r6, C18310wU r7, AnonymousClass68U r8) {
        this.A00 = context;
        this.A01 = r4;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = r8;
    }

    public void A00(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A05.AWV((AnonymousClass2HJ) null, (String) null);
            return;
        }
        this.A06.A06("starts to fetch token id");
        ArrayList A0u = AnonymousClass000.A0u();
        C110105dW.A1P("action", "get-token-id", A0u);
        C110105dW.A1P("credential-id", str, A0u);
        C28371Vv A0V = C110105dW.A0V(A0u);
        this.A04.A0H(new IDxRCallbackShape94S0100000_3_I1(this.A00, this.A03, this.A01, this, 8), A0V, "get", 0);
    }
}
