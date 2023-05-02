package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.38J  reason: invalid class name */
public final class AnonymousClass38J {
    public final C28371Vv A00;

    public AnonymousClass38J(AnonymousClass4FW r11, AnonymousClass2BJ r12, Long l2, String str) {
        C32461gQ r2 = new C32461gQ("iq");
        C32461gQ.A00(r2, "xmlns", "avatars");
        r2.A02(new C35081lL("smax_id", 101));
        r2.A02(C35081lL.A00());
        C32461gQ r4 = new C32461gQ("encryption_metadata");
        C28371Vv r1 = r11.A00;
        r4.A05(r1, AnonymousClass000.A0u());
        List list = Collections.EMPTY_LIST;
        r4.A07(r1, list, AnonymousClass000.A0u());
        r2.A03(r4.A01());
        C32461gQ r13 = new C32461gQ("timestamp");
        if (C32271fx.A0B(l2, 1, false)) {
            r13.A08(String.valueOf(l2));
        }
        r2.A03(r13.A01());
        C32461gQ r14 = new C32461gQ("fbid");
        if (C32271fx.A0D(str, 1, 20, false)) {
            r14.A08(str);
        }
        r2.A03(r14.A01());
        r2.A05(r12.A00, AnonymousClass000.A0u());
        r12.A00(r2, list);
        this.A00 = r2.A01();
    }
}
