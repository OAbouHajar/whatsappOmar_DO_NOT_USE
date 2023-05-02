package X;

/* renamed from: X.5v8  reason: invalid class name and case insensitive filesystem */
public class C118715v8 {
    public final int A00;
    public final int A01;
    public final AnonymousClass5zQ A02;

    public C118715v8(C116935sB r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A02 = r2.A02;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C118715v8 r5 = (C118715v8) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
