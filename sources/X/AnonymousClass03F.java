package X;

import java.util.Set;

/* renamed from: X.03F  reason: invalid class name */
public final class AnonymousClass03F extends AnonymousClass039 {
    public final Set A00;

    public AnonymousClass03F(Set set) {
        this.A00 = C003101j.A0F(set);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass03F) && C18450wi.A0R(this.A00, ((AnonymousClass03F) obj).A00));
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + 1231;
    }
}
