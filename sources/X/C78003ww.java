package X;

import java.util.List;

/* renamed from: X.3ww  reason: invalid class name and case insensitive filesystem */
public final class C78003ww extends AnonymousClass2SP {
    public final List list;

    public C78003ww(List list2) {
        this.list = list2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C78003ww) && C18450wi.A0R(this.list, ((C78003ww) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.list, AnonymousClass000.A0r("MultipleErrors(list="));
    }
}
