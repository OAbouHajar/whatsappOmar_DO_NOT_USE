package X;

/* renamed from: X.4Tb  reason: invalid class name */
public final class AnonymousClass4Tb {
    public final C28371Vv A00;
    public final C86904Up A01;

    public AnonymousClass4Tb(C16300so r2, C28371Vv r3) {
        C28371Vv.A06(r3, "min_amount");
        this.A01 = (C86904Up) AnonymousClass3K2.A0c(r2, r3, 2);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass4Tb.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((AnonymousClass4Tb) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
