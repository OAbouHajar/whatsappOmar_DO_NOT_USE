package X;

import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;

/* renamed from: X.1VY  reason: invalid class name */
public class AnonymousClass1VY {
    public final C221116r A00;
    public final C18300wT A01;
    public final C18090w8 A02;
    public final C16320sq A03;

    public AnonymousClass1VY(C221116r r1, C18300wT r2, C18090w8 r3, C16320sq r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public boolean A00() {
        C14710pd r3 = this.A02.A03;
        C16620tM r2 = C16620tM.A02;
        boolean z2 = true;
        if (!r3.A0E(r2, 2055) || r3.A03(r2, 1486) == 1) {
            z2 = false;
        }
        if (z2) {
            C18300wT r22 = this.A01;
            if (r22.A01().contains("payments_has_unseen_requests")) {
                boolean z3 = r22.A01().getBoolean("payments_has_unseen_requests", false);
                if (Boolean.valueOf(z3) != null) {
                    return z3;
                }
            }
            this.A03.Acl(new RunnableRunnableShape12S0100000_I0_11((Object) this, 9));
        }
        return false;
    }
}
