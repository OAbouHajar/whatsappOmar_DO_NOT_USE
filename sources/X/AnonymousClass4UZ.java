package X;

import com.facebook.redex.IDxNFunctionShape43S0200000_2_I1;

/* renamed from: X.4UZ  reason: invalid class name */
public final class AnonymousClass4UZ {
    public final C28371Vv A00;
    public final AnonymousClass5NH A01;
    public final C86764Ub A02;

    public AnonymousClass4UZ(C16300so r5, C28371Vv r6, AnonymousClass38K r7) {
        AnonymousClass3K3.A1G(r6);
        this.A02 = (C86764Ub) C32271fx.A03(r6, new IDxNFunctionShape43S0200000_2_I1(r5, r7.A00, 13), new String[0]);
        C32261fw[] r2 = new C32261fw[2];
        r2[0] = AnonymousClass3K3.A0X(r5, 147);
        this.A01 = (AnonymousClass5NH) C32271fx.A04(r6, "IQErrorBadRequest|IQErrorFeatureNotImplemented", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r5, 146), r2, 1), new String[]{"error"});
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UZ.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UZ r5 = (AnonymousClass4UZ) obj;
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
