package X;

/* renamed from: X.4WR  reason: invalid class name */
public final class AnonymousClass4WR {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AnonymousClass4WR(int i2, int i3, int i4, int i5) {
        this.A00 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = i5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WR) {
                AnonymousClass4WR r5 = (AnonymousClass4WR) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A03) * 31) + this.A02) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BadgeIconSize(extraSmall=");
        A0r.append(this.A00);
        A0r.append(", small=");
        A0r.append(this.A03);
        A0r.append(", medium=");
        A0r.append(this.A02);
        A0r.append(", large=");
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
