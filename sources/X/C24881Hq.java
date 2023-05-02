package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;

/* renamed from: X.1Hq  reason: invalid class name and case insensitive filesystem */
public class C24881Hq {
    public boolean A00 = false;
    public boolean A01 = true;
    public final C14870pt A02;
    public final C15860rz A03;
    public final AnonymousClass1T2 A04;
    public final C14710pd A05;

    public C24881Hq(C14870pt r2, C15860rz r3, AnonymousClass1T2 r4, C14710pd r5) {
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
    }

    public int A00() {
        AnonymousClass01D r1 = this.A03.A01;
        if (((SharedPreferences) r1.get()).contains("tos_2016_opt_out_state")) {
            return ((SharedPreferences) r1.get()).getBoolean("tos_2016_opt_out_state", false) ? 3 : 2;
        }
        return 1;
    }

    public boolean A01() {
        this.A02.Acq(new RunnableRunnableShape8S0100000_I0_7(this, 33));
        return !this.A05.A0E(C16620tM.A02, 1624) || A00() == 2;
    }
}
