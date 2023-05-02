package X;

/* renamed from: X.4VY  reason: invalid class name */
public final class AnonymousClass4VY {
    public final String A00;
    public final String A01;

    public AnonymousClass4VY(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VY) {
                AnonymousClass4VY r5 = (AnonymousClass4VY) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.A01, AnonymousClass3K4.A07(this.A00));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BlockReason(code=");
        A0r.append(this.A00);
        A0r.append(", reason=");
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
