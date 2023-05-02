package X;

/* renamed from: X.4TG  reason: invalid class name */
public final class AnonymousClass4TG {
    public final int A00;
    public final boolean A01;

    public AnonymousClass4TG(int i2, boolean z2) {
        this.A00 = i2;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4TG.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4TG r5 = (AnonymousClass4TG) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + (this.A01 ? 1 : 0);
    }
}
