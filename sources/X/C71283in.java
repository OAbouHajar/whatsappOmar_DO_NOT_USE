package X;

/* renamed from: X.3in  reason: invalid class name and case insensitive filesystem */
public class C71283in extends AnonymousClass45p {
    public final long A00;
    public final long A01;

    public C71283in(long j2, long j3) {
        this.A00 = j2;
        this.A01 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C71283in r7 = (C71283in) obj;
            if (!(this.A00 == r7.A00 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = Long.valueOf(this.A00);
        return AnonymousClass3K2.A08(Long.valueOf(this.A01), A1Z);
    }
}
