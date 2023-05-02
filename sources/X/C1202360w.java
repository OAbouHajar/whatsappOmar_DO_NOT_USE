package X;

import com.obwhatsapp.payments.IDxRCallbackShape8S0300000_3_I1;

/* renamed from: X.60w  reason: invalid class name and case insensitive filesystem */
public class C1202360w implements C1222368u {
    public final /* synthetic */ C118575uu A00;
    public final /* synthetic */ C117915tl A01;
    public final /* synthetic */ C118185uH A02;

    public C1202360w(C118575uu r1, C117915tl r2, C118185uH r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void AQW(AnonymousClass2HJ r2) {
        this.A02.A00(r2);
    }

    public void AYF(String[] strArr) {
        C118575uu r7 = this.A00;
        C18310wU r0 = r7.A04;
        C35081lL[] r4 = new C35081lL[4];
        r4[1] = new C35081lL("token", strArr[C35081lL.A03("action", "reset-payment-pin", r4)]);
        C35081lL.A01("credential-id", r7.A0B, r4);
        r4[3] = new C35081lL("device-id", r7.A0A.A01());
        AnonymousClass5wR r1 = r7.A09;
        C117915tl r8 = this.A01;
        C28371Vv r12 = new C28371Vv(r8.A01(AnonymousClass5wR.A00((Boolean) null, (Object) null, "RESET", strArr[1], (byte[]) null, new Object[0], C110105dW.A03(r1.A01))), "account", r4);
        C118185uH r9 = this.A02;
        C18310wU r2 = r0;
        r2.A0H(new IDxRCallbackShape8S0300000_3_I1(r7.A00, r7.A03, r7.A01, r7, r8, r9, 3), r12, "set", AnonymousClass1NO.A0L);
    }
}
