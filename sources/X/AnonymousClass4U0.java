package X;

/* renamed from: X.4U0  reason: invalid class name */
public final class AnonymousClass4U0 {
    public final C28371Vv A00;
    public final AnonymousClass4T1 A01;

    public AnonymousClass4U0(C16300so r5, C28371Vv r6) {
        C28371Vv.A06(r6, "membership_approval_mode");
        this.A01 = (AnonymousClass4T1) C32271fx.A03(r6, AnonymousClass3K3.A0X(r5, 116), new String[]{"group_join"});
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass4U0.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((AnonymousClass4U0) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
