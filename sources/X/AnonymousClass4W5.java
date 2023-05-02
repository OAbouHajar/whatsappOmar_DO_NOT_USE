package X;

/* renamed from: X.4W5  reason: invalid class name */
public final class AnonymousClass4W5 {
    public final long A00;
    public final String A01;
    public final String A02;

    public AnonymousClass4W5(String str, String str2, long j2) {
        this.A00 = j2;
        this.A02 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4W5) {
                AnonymousClass4W5 r8 = (AnonymousClass4W5) obj;
                if (this.A00 != r8.A00 || !C18450wi.A0R(this.A02, r8.A02) || !C18450wi.A0R(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A04 = ((AnonymousClass3K2.A04(this.A00) * 31) + AnonymousClass000.A0G(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A04 + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ErrorMessage(errorCode=");
        A0r.append(this.A00);
        A0r.append(", errorTitle=");
        A0r.append(this.A02);
        A0r.append(", errorMessage=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
