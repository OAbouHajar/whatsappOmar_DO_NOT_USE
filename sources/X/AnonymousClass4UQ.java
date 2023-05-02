package X;

import com.facebook.redex.IDxNFunctionShape43S0200000_2_I1;

/* renamed from: X.4UQ  reason: invalid class name */
public final class AnonymousClass4UQ {
    public final C28371Vv A00;
    public final C109045Qm A01;
    public final AnonymousClass4UT A02;

    public AnonymousClass4UQ(C16300so r6, C28371Vv r7, C28371Vv r8) {
        AnonymousClass3K3.A1G(r7);
        this.A02 = (AnonymousClass4UT) C32271fx.A03(r7, new IDxNFunctionShape43S0200000_2_I1(r6, r8, 6), new String[0]);
        C32261fw[] r2 = new C32261fw[4];
        r2[0] = AnonymousClass3K3.A0X(r6, 49);
        r2[1] = AnonymousClass3K3.A0X(r6, 50);
        r2[2] = AnonymousClass3K3.A0X(r6, 52);
        this.A01 = (C109045Qm) C32271fx.A04(r7, "IQErrorInternalServerError|IQErrorServiceUnavailable|IQErrorPartialServerError|IQErrorFallbackServer", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r6, 51), r2, 3), new String[]{"error"});
        this.A00 = r7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UQ.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UQ r5 = (AnonymousClass4UQ) obj;
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
