package X;

/* renamed from: X.1dt  reason: invalid class name and case insensitive filesystem */
public class C31301dt extends C31311du {
    public final AnonymousClass428 A00;
    public final C798541o A01;

    public C31301dt(AnonymousClass428 r2) {
        C798541o r0 = C798541o.NON_UTILITY;
        this.A00 = r2;
        this.A01 = r0;
    }

    public C31301dt(AnonymousClass428 r1, C798541o r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C31301dt) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.ordinal();
    }
}
