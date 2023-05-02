package X;

/* renamed from: X.53r  reason: invalid class name and case insensitive filesystem */
public final class C1040353r implements AnonymousClass5ND {
    public final C28371Vv A00;
    public final AnonymousClass4U2 A01;

    public C1040353r(C16300so r2, C28371Vv r3) {
        C28371Vv.A06(r3, "participant");
        this.A01 = (AnonymousClass4U2) AnonymousClass3K2.A0c(r2, r3, 92);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1040353r.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C1040353r) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
