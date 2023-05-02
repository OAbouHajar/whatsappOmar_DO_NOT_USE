package X;

import android.content.Intent;
import com.facebook.redex.IDxNConsumerShape42S0200000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.obwhatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.62x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1207662x implements AnonymousClass1WE {
    public final /* synthetic */ C28401Vy A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C1207662x(C28401Vy r1, BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void accept(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        C28401Vy r3 = this.A00;
        String str = this.A02;
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C39931tI r0 = (C39931tI) C110115dX.A0F(it).A08;
                if (r0 != null && (r0.A00 & 1) > 0) {
                    brazilPaymentActivity.A3A(r3);
                    return;
                }
            }
        }
        if (str == null) {
            brazilPaymentActivity.A02.A00(new IDxNConsumerShape42S0200000_3_I1(r3, 4, brazilPaymentActivity));
        } else if ("brpay_p_account_recovery_eligibility_screen".equals(str)) {
            AnonymousClass5xF r32 = brazilPaymentActivity.A0X;
            BrazilAccountRecoveryEligibilityBottomSheet A012 = BrazilAccountRecoveryEligibilityBottomSheet.A01("request_flow");
            A012.A04 = new C117125sU(brazilPaymentActivity, r32, "request_flow");
            brazilPaymentActivity.Afc(A012);
        } else {
            String string = brazilPaymentActivity.A01.getString(R.string.str00ae);
            String string2 = brazilPaymentActivity.A01.getString(R.string.str00ad);
            String string3 = brazilPaymentActivity.A01.getString(R.string.str00ac);
            Intent A04 = C110105dW.A04(brazilPaymentActivity, BrazilPayBloksActivity.class);
            A04.putExtra("screen_name", str);
            A04.putExtra("hide_send_payment_cta", true);
            C111675hA.A03(A04, "referral_screen", "get_started");
            HashMap A0x = AnonymousClass000.A0x();
            A0x.put("verification_needed", "0");
            A0x.put("add_debit_only", "1");
            A04.putExtra("screen_params", A0x);
            brazilPaymentActivity.A0T.A04(A04, "p2p_context");
            C117265si r2 = new C117265si(A04, string, string2, string3);
            AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = new AddPaymentMethodBottomSheet();
            addPaymentMethodBottomSheet.A0T(C13690nt.A0D());
            addPaymentMethodBottomSheet.A04 = r2;
            addPaymentMethodBottomSheet.A05 = new AnonymousClass65Q(r3, brazilPaymentActivity);
            brazilPaymentActivity.Afc(addPaymentMethodBottomSheet);
        }
    }
}
