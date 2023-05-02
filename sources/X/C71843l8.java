package X;

/* renamed from: X.3l8  reason: invalid class name and case insensitive filesystem */
public class C71843l8 extends AnonymousClass4TO {
    public final C87224Vx A00;

    public C71843l8(C109185Ra r1, C87224Vx r2, boolean z2) {
        super(r1, z2);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C71843l8 r5 = (C71843l8) obj;
            if (!this.A00.equals(r5.A00) || r5.A01 != this.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
