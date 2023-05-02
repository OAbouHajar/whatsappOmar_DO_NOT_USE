package X;

/* renamed from: X.3wG  reason: invalid class name and case insensitive filesystem */
public final class C77663wG extends AnonymousClass47F {
    public final int A00;
    public final String A01;
    public final String A02;

    public C77663wG(int i2, String str, String str2) {
        this.A00 = i2;
        this.A02 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77663wG) {
                C77663wG r5 = (C77663wG) obj;
                if (this.A00 != r5.A00 || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0G = ((this.A00 * 31) + AnonymousClass000.A0G(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A0G + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("EventShowError(errorCode=");
        A0r.append(this.A00);
        A0r.append(", errorTitle=");
        A0r.append(this.A02);
        A0r.append(", errorMessage=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
