package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* renamed from: X.4Fi  reason: invalid class name and case insensitive filesystem */
public final class C83094Fi {
    public final C28371Vv A00;

    public C83094Fi(C612438d r7, List list) {
        C32461gQ A0S = AnonymousClass3K4.A0S("iq");
        C32461gQ A0S2 = AnonymousClass3K4.A0S("remove");
        C32461gQ.A00(A0S2, "linked_groups", "true");
        if (C32271fx.A0E(list, 1, FileUtils.ONE_KB)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0S2.A03(((C83104Fj) it.next()).A00);
            }
        }
        AnonymousClass3K4.A0s(A0S2, A0S);
        A0S.A05(r7.A00, AnonymousClass000.A0u());
        r7.A00(A0S, Collections.EMPTY_LIST);
        this.A00 = A0S.A01();
    }
}
