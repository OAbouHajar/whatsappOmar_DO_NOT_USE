package X;

import java.util.Collections;

/* renamed from: X.38K  reason: invalid class name */
public final class AnonymousClass38K {
    public final C28371Vv A00;

    public AnonymousClass38K(AnonymousClass2BJ r10, String str) {
        C32461gQ r2 = new C32461gQ("iq");
        r2.A02(C35081lL.A00());
        C32461gQ.A00(r2, "xmlns", "w:mex");
        C32461gQ r1 = new C32461gQ("query");
        if (C32271fx.A0D(str, 1, 8448000, false)) {
            r1.A08(str);
        }
        r2.A03(r1.A01());
        r2.A05(r10.A00, AnonymousClass000.A0u());
        r10.A00(r2, Collections.EMPTY_LIST);
        this.A00 = r2.A01();
    }
}
