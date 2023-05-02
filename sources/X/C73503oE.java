package X;

/* renamed from: X.3oE  reason: invalid class name and case insensitive filesystem */
public final class C73503oE extends C73523oG {
    public final Object A00;
    public final Object A01;

    public C73503oE(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73503oE) {
                C73503oE r5 = (C73503oE) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
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
        StringBuilder A0r = AnonymousClass000.A0r("Error(request=");
        A0r.append(this.A00);
        A0r.append(", response=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
