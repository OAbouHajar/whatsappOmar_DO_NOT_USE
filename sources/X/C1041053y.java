package X;

/* renamed from: X.53y  reason: invalid class name and case insensitive filesystem */
public final class C1041053y implements C109065Qo, C109085Qq {
    public final C28371Vv A00;
    public final AnonymousClass54C A01;

    public C1041053y(C16300so r2, C28371Vv r3) {
        AnonymousClass3K3.A1G(r3);
        this.A01 = (AnonymousClass54C) AnonymousClass3K2.A0b(r2, r3, 97);
        this.A00 = r3;
    }

    public void A4K(AnonymousClass4HW r2) {
        r2.A00 = "400";
        r2.A01 = "bad-request";
    }

    public void A4Q(AnonymousClass4QD r1) {
        r1.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1041053y.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C1041053y) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}