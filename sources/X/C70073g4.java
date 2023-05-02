package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3g4  reason: invalid class name and case insensitive filesystem */
public class C70073g4 extends C99364tu {
    public List A00;
    public final C801542t A01;

    public C70073g4(C801542t r2, Collection collection) {
        ArrayList A0u = AnonymousClass000.A0u();
        this.A00 = A0u;
        A0u.addAll(collection);
        this.A01 = r2;
    }

    public C70073g4(C99364tu r3, C801542t r4) {
        ArrayList A0u = AnonymousClass000.A0u();
        this.A00 = A0u;
        A0u.add(r3);
        A0u.add((Object) null);
        this.A01 = r4;
    }

    public boolean A54(C84634Lh r6) {
        C801542t r4 = this.A01;
        if (r4 == C801542t.OR) {
            for (C99364tu A54 : this.A00) {
                if (A54.A54(r6)) {
                }
            }
            return false;
        }
        C801542t r1 = C801542t.AND;
        List<C99364tu> list = this.A00;
        if (r4 != r1) {
            return !((C99364tu) list.get(0)).A54(r6);
        }
        for (C99364tu A542 : list) {
            if (!A542.A54(r6)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("(");
        StringBuilder A0r2 = AnonymousClass000.A0r(" ");
        A0r2.append(this.A01.operatorString);
        A0r.append(C90264dr.A00(this.A00, AnonymousClass000.A0h(" ", A0r2), ""));
        return AnonymousClass000.A0h(")", A0r);
    }
}
