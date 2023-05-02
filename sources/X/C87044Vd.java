package X;

/* renamed from: X.4Vd  reason: invalid class name and case insensitive filesystem */
public final class C87044Vd {
    public final int A00;
    public final AnonymousClass425 A01;

    public C87044Vd(AnonymousClass425 r2, int i2) {
        C18450wi.A0H(r2, 1);
        this.A01 = r2;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87044Vd) {
                C87044Vd r5 = (C87044Vd) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K3.A0H(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("UserProblem(userProblemReason=");
        A0r.append(this.A01);
        A0r.append(", strResourceId=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
