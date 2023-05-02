package X;

/* renamed from: X.5vR  reason: invalid class name */
public final class AnonymousClass5vR {
    public final int A00;
    public final C1222068r A01;
    public final AnonymousClass2KI A02;

    public AnonymousClass5vR(C1222068r r2, AnonymousClass2KI r3, int i2) {
        C18450wi.A0H(r3, 2);
        this.A00 = i2;
        this.A02 = r3;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5vR) {
                AnonymousClass5vR r5 = (AnonymousClass5vR) obj;
                if (this.A00 != r5.A00 || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AlertBannerConfiguration(count=");
        A0r.append(this.A00);
        A0r.append(", alert=");
        A0r.append(this.A02);
        A0r.append(", onAlertClickListener=");
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
