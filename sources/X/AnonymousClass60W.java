package X;

import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.60W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass60W implements AnonymousClass68L {
    public final /* synthetic */ AnonymousClass5kl A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass60W(AnonymousClass5kl r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void AWU(UserJid userJid, C35301lh r11, C35301lh r12, C35301lh r13, AnonymousClass2HJ r14, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass5kl r3 = this.A00;
        String str4 = this.A01;
        r3.Ac1();
        if (!z2 || r14 != null) {
            C110105dW.A1C(r3, R.string.str0f5d);
            return;
        }
        r3.A0B = (String) C110105dW.A0d(r11);
        r3.A0C = str4;
        r3.A0F = z3;
        if (z4) {
            r3.A06.A00(r3, r3, (UserJid) null, C110105dW.A0K(str4), r3 instanceof IndiaUpiMandatePaymentActivity, false);
            return;
        }
        r3.A3n(r3.A08);
    }
}
