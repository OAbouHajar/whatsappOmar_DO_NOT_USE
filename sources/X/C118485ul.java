package X;

import com.obwhatsapp.payments.IDxRCallbackShape19S0200000_3_I0;

/* renamed from: X.5ul  reason: invalid class name and case insensitive filesystem */
public class C118485ul {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C16440t3 A02;
    public final C16980tz A03;
    public final C17190ug A04;
    public final C18340wX A05;
    public final AnonymousClass17O A06;
    public final C18290wS A07;
    public final C16320sq A08;

    public C118485ul(C14870pt r1, C16040sK r2, C16440t3 r3, C16980tz r4, C17190ug r5, C18340wX r6, AnonymousClass17O r7, C18290wS r8, C16320sq r9) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A08 = r9;
        this.A07 = r8;
        this.A05 = r6;
        this.A06 = r7;
    }

    public void A00(AnonymousClass1TV r12) {
        String A0f = C110105dW.A0f(this.A01, this.A02);
        C17190ug r3 = this.A04;
        String A022 = r3.A02();
        C51812cK r6 = new C51812cK(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "br-remove-merchant-account");
        if (C110105dW.A1W(A0f, 1, false)) {
            C32461gQ.A00(A0Y, "nonce", A0f);
        }
        C110105dW.A1H(r3, new IDxRCallbackShape19S0200000_3_I0(this.A03.A00, this.A05, this.A00, this, r12, 0), C110105dW.A0T(A0Y, A0X, r6), A022);
    }
}
