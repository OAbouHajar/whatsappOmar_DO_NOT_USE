package X;

import java.util.List;

/* renamed from: X.4VS  reason: invalid class name */
public final class AnonymousClass4VS {
    public final List A00;

    public AnonymousClass4VS(List list) {
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4VS) && C18450wi.A0R(this.A00, ((AnonymousClass4VS) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.A00, AnonymousClass000.A0r("LinkedAccountMedia(posts="));
    }
}
