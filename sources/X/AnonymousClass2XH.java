package X;

/* renamed from: X.2XH  reason: invalid class name */
public class AnonymousClass2XH {
    public final int A00;
    public final AnonymousClass2XG A01;
    public final C34651kc A02;
    public final boolean A03;

    public AnonymousClass2XH(AnonymousClass2XG r1, C34651kc r2, int i2, boolean z2) {
        this.A02 = r2;
        this.A03 = z2;
        this.A01 = r1;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2XH r5 = (AnonymousClass2XH) obj;
            if (this.A03 != r5.A03 || !this.A02.equals(r5.A02) || !this.A01.equals(r5.A01) || this.A00 != r5.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A02.hashCode() * 31) + (this.A03 ? 1 : 0)) * 31) + this.A00) * 31) + this.A01.hashCode();
    }
}
