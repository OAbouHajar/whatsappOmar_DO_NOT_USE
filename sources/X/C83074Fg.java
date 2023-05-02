package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4Fg  reason: invalid class name and case insensitive filesystem */
public final class C83074Fg {
    public final C28371Vv A00;

    public C83074Fg(AnonymousClass4J8 r6, AnonymousClass53S r7) {
        C32461gQ A0S = AnonymousClass3K4.A0S("iq");
        C32461gQ A0S2 = AnonymousClass3K4.A0S("leave");
        A0S2.A05(r7.A00, AnonymousClass000.A0u());
        List list = Collections.EMPTY_LIST;
        r7.Aaf(A0S2, list);
        AnonymousClass3K4.A0s(A0S2, A0S);
        C28371Vv r1 = r6.A00;
        A0S.A05(r1, AnonymousClass000.A0u());
        A0S.A07(r1, list, AnonymousClass000.A0u());
        ArrayList A0n = C13680ns.A0n(Arrays.asList(new String[0]));
        A0n.addAll(0, list);
        r6.A01.A00(A0S, A0n);
        this.A00 = A0S.A01();
    }
}
