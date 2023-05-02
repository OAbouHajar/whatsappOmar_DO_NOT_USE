package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1;
import com.obwhatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity;
import com.obwhatsapp.payments.ui.IndiaUpiSimVerificationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5jS  reason: invalid class name and case insensitive filesystem */
public abstract class C112805jS extends AnonymousClass5k7 implements AnonymousClass68O {
    public AnonymousClass173 A00;
    public AnonymousClass4XO A01;
    public AnonymousClass5xE A02;
    public C112235iA A03;
    public C1200960h A04;

    public void A3S() {
        Afq(R.string.str13db);
        this.A0E.AKS(C13680ns.A0Y(), C13690nt.A0U(), this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity ? "notify_verification_prompt" : "notify_verification_screen", this.A0O);
        C112235iA r11 = this.A03;
        Log.i("PAY: IndiaUpiPaymentSetup sendGetPspRoutingAndListKeys called");
        C17190ug r5 = r11.A04;
        String A022 = r5.A02();
        C118015tv r6 = new C118015tv(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0S = AnonymousClass3K4.A0S("account");
        C32461gQ.A00(A0S, "action", "upi-get-psp-routing-and-list-keys");
        C110105dW.A1H(r5, new IDxNCallbackShape95S0100000_3_I1(r11.A01, r11.A02, r11.A07, r11.A00, r11), C118015tv.A00(A0S, A0X, r6), A022);
    }

    public void A3T() {
        Ac1();
        AnonymousClass5xE.A00(this, (DialogInterface.OnDismissListener) null, getString(R.string.str1031)).show();
    }

    public void A3U(C111805hR r4) {
        Intent A042 = C110105dW.A04(this, IndiaUpiSimVerificationActivity.class);
        A3M(A042);
        A042.putExtra("extra_in_setup", true);
        A042.putExtra("extra_selected_bank", r4);
        A042.putExtra("extra_referral_screen", this.A0O);
        startActivity(A042);
        finish();
    }

    public void AVU(AnonymousClass2HJ r4) {
        if (!C1200960h.A02(this, "upi-get-psp-routing-and-list-keys", r4.A00, false)) {
            AnonymousClass1Vo r2 = this.A0V;
            StringBuilder A0r = AnonymousClass000.A0r("onPspRoutingAndListKeysError: ");
            A0r.append(r4);
            r2.A06(AnonymousClass000.A0h("; showGenericError", A0r));
            A3T();
        }
    }

    public void onBackPressed() {
        this.A0E.AKS(C13680ns.A0Y(), C13680ns.A0a(), this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity ? "notify_verification_prompt" : "notify_verification_screen", this.A0O);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C119365wy r5 = this.A0B;
        this.A01 = r5.A04;
        C14870pt r2 = this.A05;
        C17190ug r4 = this.A0H;
        C18290wS r9 = this.A0P;
        this.A03 = new C112235iA(this, r2, this.A00, r4, r5, this.A0C, this.A0K, this.A0M, r9, this);
        onConfigurationChanged(C13700nu.A03(this));
        this.A0E.AKS(C13680ns.A0X(), (Integer) null, this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity ? "notify_verification_prompt" : "notify_verification_screen", this.A0O);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A0E.AKS(C13680ns.A0Y(), C13680ns.A0a(), this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity ? "notify_verification_prompt" : "notify_verification_screen", this.A0O);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onStop() {
        super.onStop();
        if (isFinishing()) {
            this.A03.A00 = null;
        }
    }
}
