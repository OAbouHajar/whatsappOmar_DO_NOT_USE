package X;

import java.util.Set;

/* renamed from: X.037  reason: invalid class name */
public final class AnonymousClass037 extends AnonymousClass038 {
    public final Set A00;

    public AnonymousClass037(Set set, int i2, int i3) {
        super(i2, i3);
        this.A00 = C003101j.A0F(set);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass037) && super.equals(obj) && C18450wi.A0R(this.A00, ((AnonymousClass037) obj).A00));
    }

    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.A00.hashCode()) * 31) + 1237) * 31) + 1231) * 31) + 1231;
    }
}
