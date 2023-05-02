package X;

import java.util.List;

/* renamed from: X.2Xc  reason: invalid class name */
public final class AnonymousClass2Xc extends AnonymousClass2XV {
    public final List A00;

    public AnonymousClass2Xc(List list) {
        super(list);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2Xc) && C18450wi.A0R(this.A00, ((AnonymousClass2Xc) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SuccessContinueSearch(successItems=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
