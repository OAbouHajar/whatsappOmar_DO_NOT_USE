package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.3gD  reason: invalid class name and case insensitive filesystem */
public class C70163gD extends C89494cI {
    public final Object A00;
    public final boolean A01 = false;

    public C70163gD(CharSequence charSequence) {
        this.A00 = charSequence.toString();
    }

    public C70163gD(Object obj) {
        this.A00 = obj;
    }

    public static C89494cI A00(C89494cI r1) {
        C70163gD A02 = r1.A02();
        return !(A02.A07() instanceof List) ? AnonymousClass5TX.A03 : new C70183gF(Collections.unmodifiableList((List) A02.A07()));
    }

    public Object A07() {
        try {
            if (this.A01) {
                return this.A00;
            }
            return new C107215Gw(-1).A0A(this.A00.toString(), C89774ct.A02.A00);
        } catch (C804343v e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C70163gD)) {
                return false;
            }
            Object obj2 = this.A00;
            Object obj3 = ((C70163gD) obj).A00;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (!obj2.equals(obj3)) {
                return false;
            }
        }
    }

    public String toString() {
        return this.A00.toString();
    }
}
