package X;

import com.facebook.redex.IDxRCallbackShape14S0300000_2_I1;
import com.whatsapp.util.Log;

/* renamed from: X.3w2  reason: invalid class name and case insensitive filesystem */
public final class C77593w2 extends C116635rh {
    public final C23401Bv A00;
    public final C17190ug A01;
    public final C18280wR A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77593w2(C23401Bv r2, C17190ug r3, C119365wy r4, C18310wU r5, C18280wR r6) {
        super(r4.A03(), r5);
        C18450wi.A0L(r6, r3, r2, r4, r5);
        this.A02 = r6;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void A00(C35301lh r22, C35301lh r23, C35301lh r24, C35301lh r25, AnonymousClass4W0 r26, AnonymousClass4IR r27, String str) {
        Log.i("PAY: activateInternationalPayments called");
        C17190ug r14 = this.A01;
        String A022 = r14.A02();
        C18450wi.A0B(A022);
        AnonymousClass4W0 r2 = r26;
        C83124Fl r6 = new C83124Fl((String) C39841t9.A02(r22), str, r2.A02, this.A02.A01(), (String) C39841t9.A02(r23), (String) C39841t9.A02(r24), (String) C39841t9.A02(r25));
        C83114Fk r28 = new C83114Fk(new AnonymousClass4QV(A022), r6, (String) C39841t9.A02(r2.A01), (String) C39841t9.A02(r2.A00));
        r14.A0A(new IDxRCallbackShape14S0300000_2_I1(this, r27, r28, 0), r28.A00, A022, 204, 0);
    }
}
