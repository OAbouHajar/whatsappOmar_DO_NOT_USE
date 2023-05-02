package X;

import java.io.Serializable;
import java.util.List;

/* renamed from: X.4tN  reason: invalid class name and case insensitive filesystem */
public class C99034tN implements AnonymousClass5OH, Serializable {
    public static final long serialVersionUID = 0;
    public final List components;

    public C99034tN(List list) {
        this.components = list;
    }

    public boolean A55(Object obj) {
        for (int i2 = 0; i2 < this.components.size(); i2++) {
            if (!((AnonymousClass5OH) this.components.get(i2)).A55(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C99034tN) {
            return this.components.equals(((C99034tN) obj).components);
        }
        return false;
    }

    public int hashCode() {
        return this.components.hashCode() + 306654252;
    }

    public String toString() {
        List list = this.components;
        StringBuilder A0r = AnonymousClass000.A0r("Predicates.");
        A0r.append("and");
        A0r.append('(');
        boolean z2 = true;
        for (Object next : list) {
            if (!z2) {
                A0r.append(',');
            }
            A0r.append(next);
            z2 = false;
        }
        return AnonymousClass000.A0j(A0r);
    }
}
