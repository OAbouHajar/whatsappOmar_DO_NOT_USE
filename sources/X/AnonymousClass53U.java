package X;

/* renamed from: X.53U  reason: invalid class name */
public final class AnonymousClass53U implements AnonymousClass5N7 {
    public final C28371Vv A00;
    public final AnonymousClass3AU A01;

    public AnonymousClass53U(C16300so r5, C28371Vv r6) {
        C28371Vv.A06(r6, "pay");
        this.A01 = (AnonymousClass3AU) C32271fx.A03(r6, AnonymousClass3K3.A0X(r5, 5), new String[]{"merchant"});
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass53U.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((AnonymousClass53U) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
