package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.50L  reason: invalid class name */
public final class AnonymousClass50L implements C109735Tj {
    public static final C1033150x A01 = new C1033150x();
    public final List A00;

    public AnonymousClass50L(List list) {
        this.A00 = list;
    }

    public boolean A8i(AnonymousClass4QM r4) {
        C18450wi.A0H(r4, 0);
        List<C109735Tj> list = this.A00;
        if (!(!list.isEmpty())) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C109735Tj A8i : list) {
                if (!A8i.A8i(r4)) {
                    return false;
                }
            }
        }
        return true;
    }
}
