package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Qd  reason: invalid class name and case insensitive filesystem */
public final class C48972Qd implements C46642Fg {
    public final C28371Vv A00;

    public C48972Qd(UserJid userJid) {
        C32461gQ r2 = new C32461gQ("receipt");
        if (C32271fx.A0C(userJid, "to")) {
            r2.A02(new C35081lL((Jid) userJid, "to"));
        }
        this.A00 = r2.A01();
    }

    public C28371Vv ADy() {
        return this.A00;
    }

    public void Aaf(C32461gQ r3, List list) {
        r3.A07(this.A00, list, new ArrayList());
    }
}
