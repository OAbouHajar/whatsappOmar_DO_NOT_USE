package X;

/* renamed from: X.4Vp  reason: invalid class name and case insensitive filesystem */
public final class C87154Vp {
    public final C797541d A00;
    public final Exception A01;

    public C87154Vp(C797541d r2, Exception exc) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
        this.A01 = exc;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87154Vp) {
                C87154Vp r5 = (C87154Vp) obj;
                if (this.A00 != r5.A00 || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0H = AnonymousClass3K3.A0H(this.A00) * 31;
        Exception exc = this.A01;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return A0H + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Resource(status=");
        A0r.append(this.A00);
        A0r.append(", data=");
        A0r.append((Object) null);
        A0r.append(", error=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
