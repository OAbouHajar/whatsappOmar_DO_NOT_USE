package X;

/* renamed from: X.53p  reason: invalid class name and case insensitive filesystem */
public final class C1040153p implements AnonymousClass5NC, AnonymousClass5NG {
    public final C28371Vv A00;
    public final C1040053o A01;
    public final AnonymousClass4U3 A02;

    public C1040153p(C16300so r4, C28371Vv r5) {
        C28371Vv.A06(r5, "participant");
        this.A01 = (C1040053o) C32271fx.A03(r5, AnonymousClass3K3.A0X(r4, 122), new String[0]);
        this.A02 = (AnonymousClass4U3) AnonymousClass3K2.A0d(r4, r5, 121, 0);
        this.A00 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1040153p.class != obj.getClass()) {
                return false;
            }
            C1040153p r5 = (C1040153p) obj;
            if (!this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A01;
        return AnonymousClass3K2.A08(this.A02, A1Z);
    }
}
