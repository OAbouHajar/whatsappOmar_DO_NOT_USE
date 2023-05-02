package X;

import java.util.List;

/* renamed from: X.4WA  reason: invalid class name */
public final class AnonymousClass4WA {
    public final List A00;
    public final List A01;
    public final List A02;

    public AnonymousClass4WA(List list, List list2, List list3) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = list3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WA) {
                AnonymousClass4WA r5 = (AnonymousClass4WA) obj;
                if (!C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A00, AnonymousClass000.A0E(this.A01, AnonymousClass3K3.A0H(this.A02)));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("XFamilyCrosspostRequestResult(successUniqueIds=");
        A0r.append(this.A02);
        A0r.append(", failureUnknownIds=");
        A0r.append(this.A01);
        A0r.append(", failureDuplicateIds=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
