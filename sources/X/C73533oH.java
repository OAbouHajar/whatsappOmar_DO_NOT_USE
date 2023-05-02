package X;

/* renamed from: X.3oH  reason: invalid class name and case insensitive filesystem */
public final class C73533oH extends AnonymousClass46O {
    public final Object A00;
    public final Object A01;

    public C73533oH(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73533oH) {
                C73533oH r5 = (C73533oH) obj;
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
        StringBuilder A0r = AnonymousClass000.A0r("Success(request=");
        A0r.append(this.A00);
        A0r.append(", response=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
