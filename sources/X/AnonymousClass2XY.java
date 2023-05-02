package X;

import java.util.List;

/* renamed from: X.2XY  reason: invalid class name */
public final class AnonymousClass2XY extends AnonymousClass2XV {
    public final List A00;

    public AnonymousClass2XY(List list) {
        super(list);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2XY) && C18450wi.A0R(this.A00, ((AnonymousClass2XY) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SuccessStartSearch(successItems=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
