package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5vg  reason: invalid class name and case insensitive filesystem */
public class C118955vg {
    public final C16980tz A00;
    public final C14710pd A01;
    public final AnonymousClass175 A02;
    public final AnonymousClass17O A03;
    public final C18300wT A04;
    public final C18090w8 A05;
    public final C118915vc A06;

    public C118955vg(C16980tz r1, C14710pd r2, AnonymousClass175 r3, AnonymousClass17O r4, C18300wT r5, C18090w8 r6, C118915vc r7) {
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A01 = r2;
    }

    public Intent A00(Context context, C35391lr r5) {
        Intent A042 = C110105dW.A04(context, BrazilPayBloksActivity.class);
        A042.putExtra("screen_params", A03(r5, (AnonymousClass638) null, (String) null, -1));
        A042.putExtra("screen_name", "brpay_p_card_verified");
        return A042;
    }

    public Intent A01(Context context, C35391lr r5, AnonymousClass638 r6, String str, int i2) {
        Intent A042 = C110105dW.A04(context, BrazilPayBloksActivity.class);
        A042.putExtra("screen_params", A03(r5, r6, str, i2));
        A042.putExtra("screen_name", "brpay_p_card_verify_options");
        A042.putExtra("payment_method_credential_id", r5.A0A);
        return A042;
    }

    public String A02(boolean z2) {
        C40031tS A002;
        if (z2) {
            C40031tS A003 = this.A02.A00();
            if (A003 == null) {
                return null;
            }
            String str = A003.A03;
            if (str.equals("tos_no_wallet")) {
                return A05() ? "brpay_p_account_recovery_eligibility_screen" : "brpay_p_tos";
            }
            if (!this.A06.A03()) {
                return "brpay_p_pin_nux_create";
            }
            if (str.equals("add_card")) {
                return (!this.A04.A0P() || !this.A01.A0C(2000)) ? "brpay_p_compliance_kyc_next_screen_router" : "brpay_p_add_card";
            }
            return null;
        } else if (!this.A05.A05() || (A002 = this.A03.A00()) == null) {
            return null;
        } else {
            String str2 = A002.A03;
            if (str2.equals("tos_merchant")) {
                return "brpay_m_tos";
            }
            if (str2.equals("add_business")) {
                return "brpay_m_enter_taxid";
            }
            return null;
        }
    }

    public HashMap A03(C35391lr r4, AnonymousClass638 r5, String str, int i2) {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("credential_id", r4.A0A);
        if (str != null) {
            A0x.put("verify_methods", str);
            if (!(!this.A01.A0C(2443) || i2 == -1 || r5 == null)) {
                A0x.put("default_selected_position", String.valueOf(i2));
                BrazilPayBloksActivity.A0T(r5, A0x);
            }
        }
        A0x.put("source", "pay_flow");
        A0x.put("network_name", C35391lr.A06(r4.A01));
        C39891tE r1 = (C39891tE) r4.A08;
        if (r1 != null && !TextUtils.isEmpty(r1.A0E)) {
            A0x.put("card_image_url", r1.A0E);
        }
        A0x.put("readable_name", C119405xi.A02(this.A00.A00, r4));
        A0x.put("verified_state", ((C39891tE) r4.A08).A0a ? "1" : "0");
        return A0x;
    }

    public void A04(Intent intent, String str) {
        if (this.A01.A0C(1519)) {
            C111675hA.A03(intent, "onboarding_context", str);
        }
    }

    public boolean A05() {
        C18300wT r6 = this.A04;
        if (C110115dX.A17(r6.A01(), "payment_account_recoverable")) {
            C14710pd r5 = this.A01;
            return r6.A01.A00() - C13680ns.A08(r6.A01(), "payment_account_recoverable_time_ms") <= TimeUnit.DAYS.toMillis((long) r5.A02(2267)) && !r6.A0P() && r5.A0C(2000);
        }
    }
}
