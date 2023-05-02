package X;

import com.facebook.redex.IDxNFunctionShape43S0200000_2_I1;

/* renamed from: X.4Ua  reason: invalid class name and case insensitive filesystem */
public final class C86754Ua {
    public final C28371Vv A00;
    public final C86774Uc A01;
    public final String A02;

    public C86754Ua(C16300so r12, C28371Vv r13, AnonymousClass38K r14) {
        AnonymousClass3K3.A1G(r13);
        C28371Vv r2 = r14.A00;
        this.A02 = (String) C32271fx.A01((C16300so) null, r13, String.class, AnonymousClass3K2.A0a(), AnonymousClass3K2.A0Y(), (Object) null, new String[]{"result", "#elementValue"}, false);
        this.A01 = (C86774Uc) C32271fx.A03(r13, new IDxNFunctionShape43S0200000_2_I1(r12, r2, 15), new String[0]);
        this.A00 = r13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C86754Ua.class != obj.getClass()) {
                return false;
            }
            C86754Ua r5 = (C86754Ua) obj;
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
