package X;

/* renamed from: X.0R8  reason: invalid class name */
public final class AnonymousClass0R8 {
    public final int A00;
    public final AnonymousClass0R9 A01;

    public AnonymousClass0R8(AnonymousClass0R9 r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0R8) {
                AnonymousClass0R8 r5 = (AnonymousClass0R8) obj;
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
        StringBuilder A0r = AnonymousClass000.A0r("CdsBorderData(color=");
        A0r.append(this.A01);
        A0r.append(", width=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
