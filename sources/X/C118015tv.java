package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5tv  reason: invalid class name and case insensitive filesystem */
public final class C118015tv {
    public final C28371Vv A00;

    public C118015tv(String str) {
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ.A00(A0X, "type", "get");
        A0X.A02(new C35081lL((Jid) C34791ks.A00, "to"));
        C32461gQ.A00(A0X, "xmlns", "w:pay");
        if (C110115dX.A1D(str, false)) {
            C32461gQ.A00(A0X, "id", str);
        }
        this.A00 = A0X.A01();
    }

    public static C28371Vv A00(C32461gQ r1, C32461gQ r2, C118015tv r3) {
        r2.A03(r1.A01());
        r2.A05(r3.A00, new ArrayList());
        r3.A01(r2, Collections.EMPTY_LIST);
        return r2.A01();
    }

    public void A01(C32461gQ r3, List list) {
        r3.A07(this.A00, list, AnonymousClass000.A0u());
    }
}
