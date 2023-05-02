package X;

import com.facebook.redex.IDxNFunctionShape43S0200000_2_I1;

/* renamed from: X.4UO  reason: invalid class name */
public final class AnonymousClass4UO {
    public final C28371Vv A00;
    public final AnonymousClass4V2 A01;
    public final C86774Uc A02;

    public AnonymousClass4UO(C16300so r5, C28371Vv r6, C28371Vv r7) {
        AnonymousClass3K3.A1G(r6);
        this.A01 = (AnonymousClass4V2) C32271fx.A03(r6, AnonymousClass3K3.A0X(r5, 28), new String[]{"fds"});
        this.A02 = (C86774Uc) C32271fx.A03(r6, new IDxNFunctionShape43S0200000_2_I1(r5, r7, 3), new String[0]);
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UO.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UO r5 = (AnonymousClass4UO) obj;
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
