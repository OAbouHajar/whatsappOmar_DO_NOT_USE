package X;

import java.util.List;

/* renamed from: X.2XX  reason: invalid class name */
public final class AnonymousClass2XX extends AnonymousClass2XV {
    public final List A00;

    public AnonymousClass2XX(List list) {
        super(list);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2XX) && C18450wi.A0R(this.A00, ((AnonymousClass2XX) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadingContinueSearch(loadingItems=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
