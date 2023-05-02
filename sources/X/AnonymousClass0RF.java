package X;

/* renamed from: X.0RF  reason: invalid class name */
public final class AnonymousClass0RF {
    public final int A00;
    public final int A01;
    public final String A02;

    public AnonymousClass0RF(int i2, String str, int i3) {
        C18450wi.A0H(str, 1);
        this.A02 = str;
        this.A00 = i2;
        this.A01 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0RF) {
                AnonymousClass0RF r5 = (AnonymousClass0RF) obj;
                if (!(C18450wi.A0R(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("SystemIdInfo(workSpecId=");
        A0r.append(this.A02);
        A0r.append(", generation=");
        A0r.append(this.A00);
        A0r.append(", systemId=");
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
