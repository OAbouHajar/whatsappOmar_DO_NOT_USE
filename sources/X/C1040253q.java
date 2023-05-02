package X;

/* renamed from: X.53q  reason: invalid class name and case insensitive filesystem */
public final class C1040253q implements AnonymousClass5NC, AnonymousClass5NG {
    public final C28371Vv A00;
    public final C86654Tq A01;
    public final C1040153p A02;

    public C1040253q(C16300so r4, C28371Vv r5) {
        C28371Vv.A06(r5, "participant");
        this.A02 = (C1040153p) C32271fx.A03(r5, AnonymousClass3K3.A0X(r4, 124), new String[0]);
        this.A01 = (C86654Tq) AnonymousClass3K2.A0d(r4, r5, 125, 0);
        this.A00 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1040253q.class != obj.getClass()) {
                return false;
            }
            C1040253q r5 = (C1040253q) obj;
            if (!this.A02.equals(r5.A02) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A02;
        return AnonymousClass3K2.A08(this.A01, A1Z);
    }
}
