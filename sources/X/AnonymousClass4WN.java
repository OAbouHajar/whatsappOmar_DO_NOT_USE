package X;

/* renamed from: X.4WN  reason: invalid class name */
public final class AnonymousClass4WN {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AnonymousClass4WN(String str, String str2, String str3, String str4) {
        AnonymousClass3K2.A1I(str3, str4);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WN) {
                AnonymousClass4WN r5 = (AnonymousClass4WN) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.A02, AnonymousClass3K2.A09(this.A03, AnonymousClass3K2.A09(this.A00, AnonymousClass3K4.A07(this.A01))));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("InternationalPaymentState(credentialId=");
        A0r.append(this.A01);
        A0r.append(", activationStatus=");
        A0r.append(this.A00);
        A0r.append(", startTime=");
        A0r.append(this.A03);
        A0r.append(", endTime=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }
}
