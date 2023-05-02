package X;

/* renamed from: X.4Tc  reason: invalid class name */
public final class AnonymousClass4Tc {
    public final C28371Vv A00;
    public final AnonymousClass5N8 A01;

    public AnonymousClass4Tc(C16300so r5, C28371Vv r6) {
        C28371Vv.A06(r6, "payout");
        C32261fw[] r2 = new C32261fw[2];
        r2[0] = AnonymousClass3K3.A0X(r5, 8);
        this.A01 = (AnonymousClass5N8) C32271fx.A04(r6, "PayoutBank|PayoutPrepaidCard", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r5, 9), r2, 1), new String[0]);
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass4Tc.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((AnonymousClass4Tc) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
