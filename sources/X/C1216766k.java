package X;

import com.obwhatsapp.payments.IDxRCallbackShape8S0300000_3_I1;
import java.util.Collections;

/* renamed from: X.66k  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1216766k implements Runnable {
    public final /* synthetic */ AnonymousClass1Vt A00;
    public final /* synthetic */ C111855hW A01;
    public final /* synthetic */ C1222969a A02;
    public final /* synthetic */ C114175nF A03;

    public /* synthetic */ C1216766k(AnonymousClass1Vt r1, C111855hW r2, C1222969a r3, C114175nF r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void run() {
        C114175nF r4 = this.A03;
        AnonymousClass1Vt r2 = this.A00;
        C111855hW r1 = this.A01;
        C1222969a r0 = this.A02;
        C112225i9 r6 = r4.A0B;
        String str = r2.A0K;
        String str2 = r1.A0E;
        AnonymousClass5u6 r8 = new AnonymousClass5u6(r0, r4);
        C18310wU r10 = r6.A03;
        String A022 = r10.A08.A02();
        AnonymousClass4QV r22 = new AnonymousClass4QV(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0S = AnonymousClass3K4.A0S("account");
        C32461gQ.A00(A0S, "action", "upi-raise-complaint");
        if (C32271fx.A0D(str, 1, 100, false)) {
            C32461gQ.A00(A0S, "transaction-id", str);
        }
        if (C32271fx.A0D(str2, 1, 100, false)) {
            C32461gQ.A00(A0S, "device-id", str2);
        }
        AnonymousClass3K4.A0s(A0S, A0X);
        A0X.A05(r22.A00, AnonymousClass000.A0u());
        r22.A00(A0X, Collections.EMPTY_LIST);
        C28371Vv A012 = A0X.A01();
        C1222969a ACC = r6.A04.A05("UPI").ACC();
        r10.A0G(new IDxRCallbackShape8S0300000_3_I1(r6.A01.A00, r6.A02, r6.A00, r6, ACC, r8, 1), A012, A022, 0);
    }
}
