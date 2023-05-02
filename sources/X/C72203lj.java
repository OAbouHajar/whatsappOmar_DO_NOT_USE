package X;

import java.util.List;

/* renamed from: X.3lj  reason: invalid class name and case insensitive filesystem */
public final class C72203lj extends C31301dt {
    public final List A00;
    public final AnonymousClass22J A01;

    public C72203lj(List list, AnonymousClass22J r3) {
        super(AnonymousClass428.A0d);
        this.A00 = list;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72203lj) {
                C72203lj r5 = (C72203lj) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A01, AnonymousClass000.A0E(this.A00, 0));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("SuggestedSearchListItem(suggestionType=");
        A0r.append(0);
        A0r.append(", suggestedSearch=");
        A0r.append(this.A00);
        A0r.append(", clickListener=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
