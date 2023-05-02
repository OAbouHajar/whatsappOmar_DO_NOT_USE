package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.50N  reason: invalid class name */
public final class AnonymousClass50N implements C109735Tj {
    public static final C1033350z A01 = new C1033350z();
    public final List A00;

    public AnonymousClass50N(List list) {
        this.A00 = list;
    }

    public boolean A8i(AnonymousClass4QM r4) {
        C18450wi.A0H(r4, 0);
        List<C109735Tj> list = this.A00;
        if (!(!list.isEmpty())) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C109735Tj A8i : list) {
            if (A8i.A8i(r4)) {
                return true;
            }
        }
        return false;
    }
}
