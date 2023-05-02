package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilPaymentSettingsFragment;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.obwhatsapp.payments.ui.PaymentSettingsFragment;

/* renamed from: X.5jy  reason: invalid class name and case insensitive filesystem */
public abstract class C112895jy extends C111395g7 {
    public C18090w8 A00;
    public PaymentSettingsFragment A01;
    public final AnonymousClass1Vo A02 = C110105dW.A0Q("PaymentSettingsActivity", "payment-settings");

    public PaymentSettingsFragment A35() {
        return this instanceof IndiaUpiPaymentSettingsActivity ? new IndiaUpiPaymentSettingsFragment() : new BrazilPaymentSettingsFragment();
    }

    public boolean A36() {
        if (!isTaskRoot()) {
            return false;
        }
        Intent A022 = C14750ph.A02(this);
        if (Build.VERSION.SDK_INT >= 21) {
            finishAndRemoveTask();
            startActivity(A022);
            return true;
        }
        startActivity(A022);
        return false;
    }

    public void onBackPressed() {
        C110695eg r7;
        PaymentSettingsFragment paymentSettingsFragment = this.A01;
        if (!(paymentSettingsFragment == null || (r7 = paymentSettingsFragment.A0u) == null)) {
            C53322fW r6 = paymentSettingsFragment.A0n;
            if (r7 instanceof C114105n8) {
                C114105n8 r72 = (C114105n8) r7;
                C1222969a r5 = r72.A0B;
                if (r5 instanceof AnonymousClass61W) {
                    AnonymousClass61W r52 = (AnonymousClass61W) r5;
                    Integer A0Y = C13680ns.A0Y();
                    boolean A0I = r72.A0I();
                    AnonymousClass61W.A01(r52.A03(A0Y, A0Y, "payment_home", (String) null), AnonymousClass5xP.A00(r72.A05, (C28401Vy) null, r6, (String) null, false), r52, A0I);
                }
            } else {
                AnonymousClass5xP.A01(AnonymousClass5xP.A00(r7.A05, (C28401Vy) null, r6, (String) null, false), r7.A0B, 1, "payment_home", (String) null, 1);
            }
        }
        if (!A36()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0463);
        if (this.A00.A09() || this.A00.A07()) {
            C005402i x2 = x();
            if (x2 != null) {
                C110105dW.A0u(x2, R.string.str0fdf);
            }
            Intent intent = getIntent();
            this.A01 = A35();
            if (bundle == null) {
                if (!(intent == null || intent.getExtras() == null)) {
                    Bundle bundle2 = new Bundle(intent.getExtras());
                    Bundle bundle3 = this.A01.A05;
                    if (bundle3 != null) {
                        bundle2.putAll(bundle3);
                    }
                    this.A01.A0T(bundle2);
                }
                AnonymousClass050 r3 = new AnonymousClass050(AGM());
                r3.A0D(this.A01, (String) null, R.id.payment_settings_fragment_container);
                r3.A01();
                return;
            }
            return;
        }
        this.A02.A06("onCreate payment is not enabled; finish");
        finish();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PaymentSettingsFragment paymentSettingsFragment = this.A01;
        if (paymentSettingsFragment != null) {
            paymentSettingsFragment.A1U(intent);
        }
    }
}
