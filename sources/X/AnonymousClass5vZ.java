package X;

import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape19S0200000_3_I0;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.5vZ  reason: invalid class name */
public class AnonymousClass5vZ {
    public final Context A00;
    public final C14870pt A01;
    public final C18260wP A02;
    public final C16460t6 A03;
    public final C18340wX A04;
    public final C18300wT A05;
    public final C18310wU A06;
    public final C18320wV A07;
    public final C18290wS A08;
    public final C18280wR A09;
    public final C16320sq A0A;

    public AnonymousClass5vZ(Context context, C14870pt r2, C18260wP r3, C16460t6 r4, C18340wX r5, C18300wT r6, C18310wU r7, C18320wV r8, C18290wS r9, C18280wR r10, C16320sq r11) {
        this.A00 = context;
        this.A01 = r2;
        this.A0A = r11;
        this.A09 = r10;
        this.A08 = r9;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A02 = r3;
        this.A04 = r5;
    }

    public void A00(AnonymousClass1TV r17) {
        C18310wU r10 = this.A06;
        String A022 = r10.A08.A02();
        String A012 = this.A09.A01();
        AnonymousClass4QV r5 = new AnonymousClass4QV(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0S = AnonymousClass3K4.A0S("account");
        C32461gQ.A00(A0S, "action", "delete");
        if (A012 != null && C110105dW.A1V(A012, 1, true)) {
            C32461gQ.A00(A0S, "device-id", A012);
        }
        AnonymousClass3K4.A0s(A0S, A0X);
        A0X.A05(r5.A00, AnonymousClass000.A0u());
        r5.A00(A0X, Collections.EMPTY_LIST);
        C28371Vv A013 = A0X.A01();
        C13680ns.A0z(C110105dW.A06(this.A05), "is_payment_account_created", false);
        r10.A0G(new IDxRCallbackShape19S0200000_3_I0(this.A00, this.A04, this.A01, this, r17, 2), A013, A022, AnonymousClass1NO.A0L);
    }

    public void A01(C118345uX r9, C28371Vv r10, String str, String str2, byte[] bArr) {
        ArrayList A0u = AnonymousClass000.A0u();
        if (r10 != null) {
            A0u.add(r10);
        }
        if (bArr != null) {
            A0u.add(new C28371Vv("password", bArr, new C35081lL[0]));
        }
        C18310wU r3 = this.A06;
        C35081lL[] r4 = new C35081lL[4];
        C35081lL.A02("action", "generate-payments-dyi-report", r4, 0);
        C35081lL.A02("version", "1", r4, 1);
        C35081lL.A02("nonce", str, r4, 2);
        C35081lL.A02("type", str2, r4, 3);
        r3.A0F(new IDxRCallbackShape19S0200000_3_I0(this.A00, this.A04, this.A01, this, r9, 3), new C28371Vv("account", r4, (C28371Vv[]) A0u.toArray(new C28371Vv[0])), "get");
    }
}
