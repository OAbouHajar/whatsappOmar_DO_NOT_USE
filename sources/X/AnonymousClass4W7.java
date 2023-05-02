package X;

/* renamed from: X.4W7  reason: invalid class name */
public final class AnonymousClass4W7 {
    public final int A00;
    public final int A01;
    public final int A02;

    public AnonymousClass4W7(int i2, int i3, int i4) {
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4W7) {
                AnonymousClass4W7 r5 = (AnonymousClass4W7) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WDSButtonState(normal=");
        A0r.append(this.A01);
        A0r.append(", pressed=");
        A0r.append(this.A02);
        A0r.append(", disabled=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
