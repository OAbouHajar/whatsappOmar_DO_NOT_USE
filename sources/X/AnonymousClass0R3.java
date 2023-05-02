package X;

import java.util.List;

/* renamed from: X.0R3  reason: invalid class name */
public final class AnonymousClass0R3 {
    public final List A00;
    public final boolean A01;

    public AnonymousClass0R3(List list, boolean z2) {
        this.A00 = list;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0R3)) {
            return false;
        }
        AnonymousClass0R3 r4 = (AnonymousClass0R3) obj;
        return !C18450wi.A0R(this.A00, r4.A00) && this.A01 != r4.A01;
    }

    public int hashCode() {
        return ((this.A01 ? 1 : 0) * true) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ActivityStack{");
        A0r.append(C18450wi.A06("activities=", this.A00));
        StringBuilder A0r2 = AnonymousClass000.A0r("isEmpty=");
        A0r2.append(this.A01);
        String A0h = AnonymousClass000.A0h(AnonymousClass000.A0k(A0r2), A0r);
        C18450wi.A0B(A0h);
        return A0h;
    }
}
