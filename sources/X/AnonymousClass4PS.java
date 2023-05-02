package X;

import java.math.BigDecimal;

/* renamed from: X.4PS  reason: invalid class name */
public class AnonymousClass4PS {
    public AnonymousClass4K9 A00(C28371Vv r9) {
        String A0L;
        String A0L2;
        if (r9 == null) {
            return null;
        }
        C28371Vv A0J = r9.A0J("subtotal");
        C28371Vv A0J2 = r9.A0J("total");
        C28371Vv A0J3 = r9.A0J("currency");
        C28371Vv A0J4 = r9.A0J("price_status");
        String A0L3 = A0J4 == null ? null : A0J4.A0L();
        C39651sq r3 = (A0J3 == null || AnonymousClass1ZW.A0E(A0J3.A0L())) ? null : new C39651sq(A0J3.A0L());
        BigDecimal bigDecimal = null;
        if (!(A0J2 == null || (A0L2 = A0J2.A0L()) == null || r3 == null)) {
            bigDecimal = C39641sp.A00(r3, Long.parseLong(A0L2));
        }
        BigDecimal bigDecimal2 = null;
        if (!(A0J == null || (A0L = A0J.A0L()) == null || r3 == null)) {
            bigDecimal2 = C39641sp.A00(r3, Long.parseLong(A0L));
        }
        if (A0L3 == null || r3 == null || bigDecimal == null || bigDecimal2 == null) {
            return null;
        }
        return new AnonymousClass4K9(r3, bigDecimal2, bigDecimal);
    }
}
