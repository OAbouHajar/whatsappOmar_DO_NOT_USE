package X;

/* renamed from: X.53X  reason: invalid class name */
public final class AnonymousClass53X implements AnonymousClass5N9 {
    public final C28371Vv A00;
    public final C89044bV A01;

    public AnonymousClass53X(C16300so r2, C28371Vv r3) {
        C28371Vv.A06(r3, "card");
        this.A01 = (C89044bV) AnonymousClass3K2.A0c(r2, r3, 16);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass53X.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((AnonymousClass53X) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
