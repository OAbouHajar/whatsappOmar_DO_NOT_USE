package X;

import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.61F  reason: invalid class name */
public final class AnonymousClass61F implements AnonymousClass691 {
    public final /* synthetic */ C110715ei A00;

    public AnonymousClass61F(C110715ei r1) {
        this.A00 = r1;
    }

    public void AQW(AnonymousClass2HJ r13) {
        C18450wi.A0H(r13, 0);
        C110105dW.A1O("PaymentCheckoutOrderViewModel", C18450wi.A06("init/getMerchantStatus : failed. Error code = ", Integer.valueOf(r13.A00)));
        C110715ei r0 = this.A00;
        AnonymousClass027 r5 = r0.A03;
        AnonymousClass5wL r6 = r0.A0B;
        C114855oi r4 = C114855oi.GET_MERCHANT_STATUS_FAILED;
        C18450wi.A0H(r4, 0);
        int A01 = C110115dX.A01(r4, C115495pq.A00);
        int i2 = R.string.str0ea5;
        int i3 = R.string.str0ea4;
        if (A01 != 1) {
            i2 = R.string.str0854;
            i3 = R.string.str1664;
        }
        r5.A09(r6.A00((UserJid) null, new AnonymousClass5yZ(r4, i2, i3), (C797441c) null, (C16830ti) null, (Boolean) null));
    }

    public void AY8(C797441c r9) {
        C18450wi.A0H(r9, 0);
        C110715ei r0 = this.A00;
        r0.A03.A09(r0.A0B.A00((UserJid) null, (AnonymousClass5yZ) null, r9, (C16830ti) null, (Boolean) null));
    }
}
