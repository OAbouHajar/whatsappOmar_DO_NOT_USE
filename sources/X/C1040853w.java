package X;

/* renamed from: X.53w  reason: invalid class name and case insensitive filesystem */
public final class C1040853w implements C109065Qo, C109085Qq {
    public final C28371Vv A00;
    public final AnonymousClass4US A01;

    public C1040853w(C16300so r2, C28371Vv r3) {
        AnonymousClass3K3.A1G(r3);
        this.A01 = (AnonymousClass4US) AnonymousClass3K2.A0b(r2, r3, 53);
        this.A00 = r3;
    }

    public void A4K(AnonymousClass4HW r4) {
        AnonymousClass4US r2 = this.A01;
        r4.A00 = String.valueOf(r2.A01.longValue());
        String str = r2.A02;
        C18450wi.A0B(str);
        r4.A01 = str;
    }

    public void A4Q(AnonymousClass4QD r1) {
        r1.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1040853w.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C1040853w) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
