package X;

/* renamed from: X.4W1  reason: invalid class name */
public final class AnonymousClass4W1 {
    public final long A00;
    public final long A01;
    public final String A02;

    public AnonymousClass4W1(String str, long j2, long j3) {
        this.A02 = str;
        this.A01 = j2;
        this.A00 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4W1) {
                AnonymousClass4W1 r8 = (AnonymousClass4W1) obj;
                if (!(C18450wi.A0R(this.A02, r8.A02) && this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass3K4.A07(this.A02) + AnonymousClass3K2.A04(this.A01)) * 31) + AnonymousClass3K2.A04(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("InternationalActivationDetails(activationStatus=");
        A0r.append(this.A02);
        A0r.append(", startDate=");
        A0r.append(this.A01);
        A0r.append(", endDate=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
