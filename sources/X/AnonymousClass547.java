package X;

/* renamed from: X.547  reason: invalid class name */
public final class AnonymousClass547 implements C109085Qq {
    public final C28371Vv A00;
    public final AnonymousClass4T3 A01;

    public AnonymousClass547(C16300so r2, C28371Vv r3) {
        AnonymousClass3K3.A1G(r3);
        this.A01 = (AnonymousClass4T3) AnonymousClass3K2.A0b(r2, r3, 142);
        this.A00 = r3;
    }

    public void A4K(AnonymousClass4HW r2) {
        r2.A00 = "413";
        r2.A01 = "payload-too-large";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass547.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((AnonymousClass547) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
