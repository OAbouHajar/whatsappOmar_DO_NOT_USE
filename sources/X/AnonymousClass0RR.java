package X;

/* renamed from: X.0RR  reason: invalid class name */
public final class AnonymousClass0RR {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass0RR(boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = z2;
        this.A03 = z3;
        this.A01 = z4;
        this.A02 = z5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0RR) {
                AnonymousClass0RR r5 = (AnonymousClass0RR) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z2 = this.A00;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int i3 = (z2 ? 1 : 0) * true;
        boolean z3 = this.A03;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A01;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        if (!this.A02) {
            i2 = 0;
        }
        return i5 + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("NetworkState(isConnected=");
        A0r.append(this.A00);
        A0r.append(", isValidated=");
        A0r.append(this.A03);
        A0r.append(", isMetered=");
        A0r.append(this.A01);
        A0r.append(", isNotRoaming=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }
}
