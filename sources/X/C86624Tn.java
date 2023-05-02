package X;

/* renamed from: X.4Tn  reason: invalid class name and case insensitive filesystem */
public final class C86624Tn {
    public final C28371Vv A00;
    public final AnonymousClass4UP A01;

    public C86624Tn(C16300so r2, C28371Vv r3) {
        C28371Vv.A06(r3, "states");
        this.A01 = (AnonymousClass4UP) AnonymousClass3K2.A0c(r2, r3, 37);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86624Tn.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86624Tn) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
