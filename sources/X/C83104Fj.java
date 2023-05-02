package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Fj  reason: invalid class name and case insensitive filesystem */
public final class C83104Fj {
    public final C28371Vv A00;

    public C83104Fj(UserJid userJid) {
        C32461gQ A0S = AnonymousClass3K4.A0S("participant");
        if (C32271fx.A0C(userJid, "jid")) {
            A0S.A02(new C35081lL((Jid) userJid, "jid"));
        }
        this.A00 = A0S.A01();
    }
}
