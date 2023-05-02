package X;

import java.util.List;

/* renamed from: X.4Ve  reason: invalid class name and case insensitive filesystem */
public final class C87054Ve {
    public final AnonymousClass42O A00;
    public final List A01;

    public C87054Ve(AnonymousClass42O r2, List list) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87054Ve) {
                C87054Ve r5 = (C87054Ve) obj;
                if (this.A00 != r5.A00 || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A01, AnonymousClass3K3.A0H(this.A00));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("UserProblemData(userProblemCategory=");
        A0r.append(this.A00);
        A0r.append(", userProblems=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
