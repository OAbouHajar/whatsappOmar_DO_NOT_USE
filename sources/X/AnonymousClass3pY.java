package X;

/* renamed from: X.3pY  reason: invalid class name */
public class AnonymousClass3pY extends C86394Sn {
    public final AnonymousClass4TW A00;
    public final C107985Mf A01;

    public AnonymousClass3pY(AnonymousClass4TW r2, C107985Mf r3) {
        super(2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass3pY) obj).A00);
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass000.A1K(A1Z, super.hashCode());
        return AnonymousClass3K2.A08(this.A00, A1Z);
    }
}
