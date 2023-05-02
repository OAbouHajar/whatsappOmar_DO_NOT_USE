package X;

import java.util.List;

/* renamed from: X.5tw  reason: invalid class name and case insensitive filesystem */
public final class C118025tw {
    public final C28371Vv A00;

    public C118025tw(String str, String str2, String str3) {
        C32461gQ A0S = AnonymousClass3K4.A0S("smax:any");
        C32461gQ A0S2 = AnonymousClass3K4.A0S("money");
        if (C32271fx.A0D(str, 1, 100, false)) {
            C32461gQ.A00(A0S2, "value", str);
        }
        if (C32271fx.A0D(str2, 1, 100, false)) {
            C32461gQ.A00(A0S2, "offset", str2);
        }
        if (C32271fx.A0D(str3, 1, 100, false)) {
            C32461gQ.A00(A0S2, "currency", str3);
        }
        AnonymousClass3K4.A0s(A0S2, A0S);
        this.A00 = A0S.A01();
    }

    public void A00(C32461gQ r3, List list) {
        r3.A07(this.A00, list, AnonymousClass000.A0u());
    }
}
