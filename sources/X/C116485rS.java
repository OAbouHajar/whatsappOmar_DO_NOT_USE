package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5rS  reason: invalid class name and case insensitive filesystem */
public final class C116485rS {
    public final C28371Vv A00;

    public C116485rS(UserJid userJid) {
        C32461gQ A0S = AnonymousClass3K4.A0S("contact");
        if (C32271fx.A0C(userJid, "user")) {
            A0S.A02(new C35081lL((Jid) userJid, "user"));
        }
        this.A00 = A0S.A01();
    }
}
