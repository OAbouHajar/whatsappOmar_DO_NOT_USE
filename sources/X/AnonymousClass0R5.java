package X;

/* renamed from: X.0R5  reason: invalid class name */
public final class AnonymousClass0R5 {
    public final int A00;
    public final String A01;

    public AnonymousClass0R5(String str, int i2) {
        C18450wi.A0H(str, 1);
        this.A01 = str;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0R5) {
                AnonymousClass0R5 r5 = (AnonymousClass0R5) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WorkGenerationalId(workSpecId=");
        A0r.append(this.A01);
        A0r.append(", generation=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
