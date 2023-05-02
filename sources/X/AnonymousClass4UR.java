package X;

/* renamed from: X.4UR  reason: invalid class name */
public final class AnonymousClass4UR {
    public final C28371Vv A00;
    public final C86734Ty A01;
    public final AnonymousClass4T5 A02;

    public AnonymousClass4UR(C16300so r4, C28371Vv r5) {
        Object obj;
        C28371Vv.A06(r5, "participant");
        this.A01 = (C86734Ty) C32271fx.A03(r5, AnonymousClass3K3.A0X(r4, 86), new String[0]);
        try {
            obj = C32271fx.A03(r5, AnonymousClass3K3.A0X(r4, 85), new String[0]);
        } catch (AnonymousClass1W9 unused) {
            obj = null;
        }
        this.A02 = (AnonymousClass4T5) obj;
        this.A00 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UR.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UR r5 = (AnonymousClass4UR) obj;
            if (!this.A01.equals(r5.A01) || !C34901l3.A00(this.A02, r5.A02)) {
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
