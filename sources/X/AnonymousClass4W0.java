package X;

/* renamed from: X.4W0  reason: invalid class name */
public final class AnonymousClass4W0 {
    public final C35301lh A00;
    public final C35301lh A01;
    public final String A02;

    public AnonymousClass4W0(C35301lh r1, C35301lh r2, String str) {
        this.A02 = str;
        this.A01 = r1;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4W0) {
                AnonymousClass4W0 r5 = (AnonymousClass4W0) obj;
                if (!C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A00, AnonymousClass000.A0E(this.A01, AnonymousClass3K4.A07(this.A02)));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("InternationalActivationDateRange(credentialId=");
        A0r.append(this.A02);
        A0r.append(", startDate=");
        A0r.append(this.A01);
        A0r.append(", endDate=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
