package X;

import java.util.List;

/* renamed from: X.3wm  reason: invalid class name and case insensitive filesystem */
public final class C77903wm extends AnonymousClass2SG {
    public final List list;

    public C77903wm(List list2) {
        this.list = list2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77903wm) && C18450wi.A0R(this.list, ((C77903wm) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.list, AnonymousClass000.A0r("MultipleErrors(list="));
    }
}
