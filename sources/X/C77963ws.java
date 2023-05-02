package X;

import java.util.List;

/* renamed from: X.3ws  reason: invalid class name and case insensitive filesystem */
public final class C77963ws extends AnonymousClass2SJ {
    public final List list;

    public C77963ws(List list2) {
        this.list = list2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77963ws) && C18450wi.A0R(this.list, ((C77963ws) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.list, AnonymousClass000.A0r("MultipleErrors(list="));
    }
}
