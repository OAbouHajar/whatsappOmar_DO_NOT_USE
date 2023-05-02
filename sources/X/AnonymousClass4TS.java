package X;

/* renamed from: X.4TS  reason: invalid class name */
public class AnonymousClass4TS {
    public final int A00;
    public final Object A01;

    public AnonymousClass4TS(int i2, Object obj) {
        this.A00 = i2;
        this.A01 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4TS r5 = (AnonymousClass4TS) obj;
            if (this.A00 != r5.A00 || !AnonymousClass45Q.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass000.A1K(A1Z, this.A00);
        return AnonymousClass3K2.A08(this.A01, A1Z);
    }
}
