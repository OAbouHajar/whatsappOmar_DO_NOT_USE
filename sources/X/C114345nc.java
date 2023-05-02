package X;

import com.facebook.redex.IDxCallbackShape250S0100000_3_I1;
import java.util.List;

/* renamed from: X.5nc  reason: invalid class name and case insensitive filesystem */
public class C114345nc extends C16690tT {
    public final C18290wS A00;
    public final C116175qw A01;

    public C114345nc(C14530pL r1, C18290wS r2, C116175qw r3) {
        super(r1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A0i = C110105dW.A0i(this.A00);
        if (A0i.isEmpty()) {
            return null;
        }
        C39901tF r1 = C110115dX.A0G(A0i, C119405xi.A01(A0i)).A08;
        if (r1 instanceof C111805hR) {
            return r1;
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C111805hR r5 = (C111805hR) obj;
        C112805jS r3 = this.A01.A00;
        if (r5 != null) {
            r3.Ac1();
            r3.A3U(r5);
            return;
        }
        r3.A0M.A08(new IDxCallbackShape250S0100000_3_I1(r3, 0));
    }
}
