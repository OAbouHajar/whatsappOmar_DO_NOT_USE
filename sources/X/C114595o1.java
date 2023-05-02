package X;

import com.facebook.redex.IDxCCallbackShape392S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5o1  reason: invalid class name and case insensitive filesystem */
public class C114595o1 extends C16690tT {
    public final boolean A00;
    public final /* synthetic */ IndiaUpiSendPaymentActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114595o1(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, boolean z2) {
        super(indiaUpiSendPaymentActivity, true);
        this.A01 = indiaUpiSendPaymentActivity;
        this.A00 = z2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        C111765hN r4 = (C111765hN) C110115dX.A0H(indiaUpiSendPaymentActivity.A0P).A05(indiaUpiSendPaymentActivity.A0C);
        indiaUpiSendPaymentActivity.A0t.A06(AnonymousClass000.A0g("got contact vpa: ", r4));
        if (r4 == null || C39841t9.A03(r4.A02)) {
            A0B(indiaUpiSendPaymentActivity.A0C, new IDxCCallbackShape392S0100000_3_I1(indiaUpiSendPaymentActivity, 1));
            indiaUpiSendPaymentActivity.A0r = true;
            indiaUpiSendPaymentActivity.Afq(R.string.str13db);
            return null;
        }
        if (C39841t9.A03(r4.A01)) {
            A0B(indiaUpiSendPaymentActivity.A0C, new IDxCCallbackShape392S0100000_3_I1(indiaUpiSendPaymentActivity, 2));
        }
        return r4;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C111765hN r3 = (C111765hN) obj;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        if (r3 != null) {
            indiaUpiSendPaymentActivity.A09 = r3.A02;
            indiaUpiSendPaymentActivity.A0Q = r3.A03;
            if (!C39841t9.A03(r3.A01)) {
                indiaUpiSendPaymentActivity.A07 = r3.A01;
            }
        } else {
            indiaUpiSendPaymentActivity.A09 = null;
            indiaUpiSendPaymentActivity.A0Q = null;
        }
        indiaUpiSendPaymentActivity.A4F(this.A00);
    }

    public final void A0B(UserJid userJid, C1222668x r9) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        indiaUpiSendPaymentActivity.A0t.A06(AnonymousClass000.A0g("sendGetContactInfoForJid: ", userJid));
        indiaUpiSendPaymentActivity.A08.A00(indiaUpiSendPaymentActivity, userJid, indiaUpiSendPaymentActivity.A06, r9, indiaUpiSendPaymentActivity.A0D.A03());
    }
}
