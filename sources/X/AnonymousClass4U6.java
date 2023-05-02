package X;

import com.facebook.redex.IDxNFunctionShape43S0200000_2_I1;

/* renamed from: X.4U6  reason: invalid class name */
public final class AnonymousClass4U6 {
    public final C28371Vv A00;
    public final C87004Uz A01;

    public AnonymousClass4U6(C16300so r4, C28371Vv r5, C83114Fk r6) {
        AnonymousClass3K3.A1G(r5);
        this.A01 = (C87004Uz) C32271fx.A03(r5, new IDxNFunctionShape43S0200000_2_I1(r4, r6.A00, 16), new String[0]);
        this.A00 = r5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass4U6.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((AnonymousClass4U6) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
