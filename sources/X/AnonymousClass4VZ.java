package X;

import java.util.List;

/* renamed from: X.4VZ  reason: invalid class name */
public final class AnonymousClass4VZ {
    public final String A00;
    public final List A01;

    public AnonymousClass4VZ(String str, List list) {
        this.A01 = list;
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VZ) {
                AnonymousClass4VZ r5 = (AnonymousClass4VZ) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K3.A0H(this.A01) + AnonymousClass000.A0G(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BusinessApiSearchResult(businesses=");
        A0r.append(this.A01);
        A0r.append(", pageId=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
