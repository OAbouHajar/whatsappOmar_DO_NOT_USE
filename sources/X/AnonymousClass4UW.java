package X;

/* renamed from: X.4UW  reason: invalid class name */
public final class AnonymousClass4UW {
    public final C28371Vv A00;
    public final C109075Qp A01;
    public final AnonymousClass4U1 A02;

    public AnonymousClass4UW(C16300so r5, C28371Vv r6) {
        Object obj;
        C28371Vv.A06(r6, "linked_groups");
        this.A02 = (AnonymousClass4U1) C32271fx.A03(r6, AnonymousClass3K3.A0X(r5, 114), new String[0]);
        C32261fw[] r2 = new C32261fw[3];
        r2[0] = AnonymousClass3K3.A0X(r5, 111);
        r2[1] = AnonymousClass3K3.A0X(r5, 113);
        try {
            obj = C32271fx.A04(r6, "LeaveLinkedGroupsBadRequest|LeaveLinkedGroupsNotAllowed|LeaveLinkedGroupsServerError", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r5, 112), r2, 2), new String[0]);
        } catch (AnonymousClass1W9 unused) {
            obj = null;
        }
        this.A01 = (C109075Qp) obj;
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UW.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UW r5 = (AnonymousClass4UW) obj;
            if (!this.A02.equals(r5.A02) || !C34901l3.A00(this.A01, r5.A01)) {
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
