package X;

/* renamed from: X.4UV  reason: invalid class name */
public final class AnonymousClass4UV {
    public final C16050sL A00;
    public final C28371Vv A01;
    public final AnonymousClass5NF A02;

    public AnonymousClass4UV(C16300so r12, C28371Vv r13) {
        Object obj;
        C28371Vv.A06(r13, "group");
        C16300so r3 = r12;
        this.A00 = (C16050sL) C32271fx.A01(r3, r13, C16050sL.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, new String[]{"id"}, false);
        C32261fw[] r1 = new C32261fw[2];
        r1[0] = AnonymousClass3K3.A0X(r12, 109);
        try {
            obj = C32271fx.A04(r13, "LeaveGroupNotAllowed|LeaveGroupServerError", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r12, 110), r1, 1), new String[0]);
        } catch (AnonymousClass1W9 unused) {
            obj = null;
        }
        this.A02 = (AnonymousClass5NF) obj;
        this.A01 = r13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UV.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UV r5 = (AnonymousClass4UV) obj;
            if (!this.A00.equals(r5.A00) || !C34901l3.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A00;
        return AnonymousClass3K2.A08(this.A02, A1Z);
    }
}
