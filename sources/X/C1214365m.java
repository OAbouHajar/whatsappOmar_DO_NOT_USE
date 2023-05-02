package X;

import com.obwhatsapp.payments.ui.PaymentSettingsFragment;

/* renamed from: X.65m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1214365m implements Runnable {
    public final /* synthetic */ PaymentSettingsFragment A00;
    public final /* synthetic */ C119225wk A01;

    public /* synthetic */ C1214365m(PaymentSettingsFragment paymentSettingsFragment, C119225wk r2) {
        this.A00 = paymentSettingsFragment;
        this.A01 = r2;
    }

    public final void run() {
        PaymentSettingsFragment paymentSettingsFragment = this.A00;
        C119225wk r0 = this.A01;
        C110695eg r5 = paymentSettingsFragment.A0u;
        if (r5 != null) {
            AnonymousClass5xP.A01(AnonymousClass5xP.A00(r5.A05, (C28401Vy) null, paymentSettingsFragment.A0n, r0.A01 == 1 ? "incentive_banner" : paymentSettingsFragment.A1P(), false), r5.A0B, 9, "payment_home", (String) null, 1);
        }
    }
}
