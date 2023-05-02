package X;

import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.whatsapp.util.RunnableTRunnableShape1S0200000_I0;

/* renamed from: X.1D1  reason: invalid class name */
public class AnonymousClass1D1 implements AnonymousClass1D2 {
    public final C16040sK A00;
    public final C18930xU A01;
    public final C217515h A02;
    public final C16320sq A03;

    public AnonymousClass1D1(C16040sK r1, C18930xU r2, C217515h r3, C16320sq r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00() {
        Object A022;
        if (!this.A00.A0G() && (A022 = this.A02.A02("time_format")) != null) {
            this.A03.Acl(new RunnableRunnableShape4S0200000_I0_2(this, 24, A022));
        }
    }

    public void AT2() {
        if (!this.A00.A0G()) {
            A00();
            AnonymousClass1WG r2 = (AnonymousClass1WG) this.A02.A02("setting_locale");
            if (r2 != null) {
                this.A03.Acl(new RunnableTRunnableShape1S0200000_I0(this, r2));
            }
        }
    }
}
