package X;

/* renamed from: X.540  reason: invalid class name */
public final class AnonymousClass540 implements C109065Qo, C109085Qq {
    public final C28371Vv A00;
    public final AnonymousClass4T6 A01;

    public AnonymousClass540(C16300so r2, C28371Vv r3) {
        AnonymousClass3K3.A1G(r3);
        this.A01 = (AnonymousClass4T6) AnonymousClass3K2.A0b(r2, r3, 145);
        this.A00 = r3;
    }

    public void A4K(AnonymousClass4HW r2) {
        r2.A00 = "403";
        r2.A01 = "forbidden";
    }

    public void A4Q(AnonymousClass4QD r1) {
        r1.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass540.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((AnonymousClass540) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
