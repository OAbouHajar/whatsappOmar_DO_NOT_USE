package X;

import java.util.List;

/* renamed from: X.3nX  reason: invalid class name and case insensitive filesystem */
public final class C73223nX extends C82594Dk {
    public final List A00;

    public C73223nX(List list) {
        super(list);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C73223nX) && C18450wi.A0R(this.A00, ((C73223nX) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.A00, AnonymousClass000.A0r("Loading(loadingItems="));
    }
}
