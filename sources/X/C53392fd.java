package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.2fd  reason: invalid class name and case insensitive filesystem */
public final class C53392fd {
    public final C28371Vv A00;

    public C53392fd(AnonymousClass2BJ r12, Long l2, String str) {
        C32461gQ r2 = new C32461gQ("iq");
        r2.A02(new C35081lL((Jid) C34791ks.A00, "to"));
        r2.A02(new C35081lL("xmlns", "w:pay"));
        C32461gQ r3 = new C32461gQ("account");
        r3.A02(new C35081lL("action", "get-offer"));
        if (C32271fx.A0B(l2, 1, false)) {
            r3.A02(new C35081lL("offer_id", l2.longValue()));
        }
        String str2 = str;
        if (str != null && C32271fx.A0D(str2, 1, 100, true)) {
            r3.A02(new C35081lL("device_locale", str));
        }
        r2.A03(r3.A01());
        r2.A05(r12.A00, new ArrayList());
        r12.A00(r2, Collections.EMPTY_LIST);
        this.A00 = r2.A01();
    }
}
