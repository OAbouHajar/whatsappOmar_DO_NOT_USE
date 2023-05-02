package X;

import android.widget.FrameLayout;
import com.obwhatsapp.payments.ui.BrazilPaymentSettingsFragment;

/* renamed from: X.60H  reason: invalid class name */
public class AnonymousClass60H implements C1222068r {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ BrazilPaymentSettingsFragment A01;

    public AnonymousClass60H(FrameLayout frameLayout, BrazilPaymentSettingsFragment brazilPaymentSettingsFragment) {
        this.A01 = brazilPaymentSettingsFragment;
        this.A00 = frameLayout;
    }

    public void AOX(AnonymousClass2KI r2) {
        C119345ww r0 = this.A01.A0s;
        if (r0 != null) {
            r0.A05(r2);
        }
    }

    public void APu(AnonymousClass2KI r8) {
        BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = this.A01;
        if (brazilPaymentSettingsFragment.A04.A0C(1724)) {
            C1222969a r1 = brazilPaymentSettingsFragment.A06;
            Integer A0Y = C13680ns.A0Y();
            r1.AKI(r8, A0Y, A0Y, "payment_home", brazilPaymentSettingsFragment.A13);
        }
        this.A00.setVisibility(8);
    }
}
