package X;

/* renamed from: X.4TT  reason: invalid class name */
public class AnonymousClass4TT {
    public final int A00;
    public final C85534Ov A01;

    public AnonymousClass4TT(C85534Ov r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4TT r5 = (AnonymousClass4TT) obj;
            if (this.A00 != r5.A00 || !AnonymousClass45Q.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A01;
        return AnonymousClass3K2.A08(Integer.valueOf(this.A00), A1Z);
    }
}
