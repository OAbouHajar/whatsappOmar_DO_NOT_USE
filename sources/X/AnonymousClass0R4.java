package X;

/* renamed from: X.0R4  reason: invalid class name */
public final class AnonymousClass0R4 {
    public final Long A00;
    public final String A01;

    public AnonymousClass0R4(String str, Long l2) {
        this.A01 = str;
        this.A00 = l2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0R4) {
                AnonymousClass0R4 r5 = (AnonymousClass0R4) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + AnonymousClass000.A0C(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Preference(key=");
        A0r.append(this.A01);
        A0r.append(", value=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
