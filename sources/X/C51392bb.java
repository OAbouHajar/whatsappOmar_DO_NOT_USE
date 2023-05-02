package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.2bb  reason: invalid class name and case insensitive filesystem */
public final class C51392bb {
    public final C28371Vv A00;

    public C51392bb(AnonymousClass2BJ r10, String str) {
        C32461gQ r2 = new C32461gQ("iq");
        r2.A02(new C35081lL("xmlns", "urn:xmpp:whatsapp:push"));
        r2.A02(new C35081lL((Jid) C34791ks.A00, "to"));
        C32461gQ r1 = new C32461gQ("pn");
        if (C32271fx.A0D(str, 0, 300, false)) {
            r1.A08(str);
        }
        r2.A03(r1.A01());
        r2.A05(r10.A00, new ArrayList());
        r10.A00(r2, Collections.EMPTY_LIST);
        this.A00 = r2.A01();
    }
}
