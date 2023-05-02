package X;

/* renamed from: X.2CF  reason: invalid class name */
public final class AnonymousClass2CF {
    public final int A00;
    public final int A01;
    public final int A02;

    public AnonymousClass2CF(int i2, int i3, int i4) {
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2CF) {
                AnonymousClass2CF r5 = (AnonymousClass2CF) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PhysicalScreenDimensions(width=");
        sb.append(this.A02);
        sb.append(", height=");
        sb.append(this.A01);
        sb.append(", diagonal=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
