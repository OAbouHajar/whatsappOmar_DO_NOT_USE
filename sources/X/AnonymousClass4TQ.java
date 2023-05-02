package X;

/* renamed from: X.4TQ  reason: invalid class name */
public class AnonymousClass4TQ {
    public boolean A00;
    public final C31241dn A01;

    public AnonymousClass4TQ(C31241dn r1, boolean z2) {
        this.A01 = r1;
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AnonymousClass4TQ)) {
            AnonymousClass4TQ r4 = (AnonymousClass4TQ) obj;
            if (this.A00 == r4.A00) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A01;
        return AnonymousClass3K2.A08(Boolean.valueOf(this.A00), A1Z);
    }
}
