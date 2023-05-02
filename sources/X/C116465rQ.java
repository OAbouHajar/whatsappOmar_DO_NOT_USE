package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5rQ  reason: invalid class name and case insensitive filesystem */
public final class C116465rQ {
    public final C28371Vv A00;

    public C116465rQ(UserJid userJid, C118015tv r6) {
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0S = AnonymousClass3K4.A0S("account");
        C32461gQ.A00(A0S, "action", "request-merchant-payment-account-status");
        if (C32271fx.A0C(userJid, "account->merchant")) {
            A0S.A02(new C35081lL((Jid) userJid, "merchant"));
        }
        this.A00 = C118015tv.A00(A0S, A0X, r6);
    }
}
