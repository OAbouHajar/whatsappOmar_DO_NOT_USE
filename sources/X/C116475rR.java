package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5rR  reason: invalid class name and case insensitive filesystem */
public final class C116475rR {
    public final C28371Vv A00;

    public C116475rR(C118015tv r7, List list) {
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0S = AnonymousClass3K4.A0S("account");
        C32461gQ.A00(A0S, "action", "get-contacts-payment-status");
        if (C32271fx.A0E(list, 0, Long.MAX_VALUE)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0S.A03(((C116485rS) it.next()).A00);
            }
        }
        this.A00 = C118015tv.A00(A0S, A0X, r7);
    }
}
