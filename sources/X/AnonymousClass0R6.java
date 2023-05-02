package X;

/* renamed from: X.0R6  reason: invalid class name */
public final class AnonymousClass0R6 {
    public AnonymousClass0KV A00;
    public String A01;

    public AnonymousClass0R6(AnonymousClass0KV r2, String str) {
        C18450wi.A0H(str, 1);
        C18450wi.A0H(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0R6) {
                AnonymousClass0R6 r5 = (AnonymousClass0R6) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("IdAndState(id=");
        A0r.append(this.A01);
        A0r.append(", state=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
