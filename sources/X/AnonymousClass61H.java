package X;

import android.content.DialogInterface;
import com.facebook.redex.IDxCListenerShape30S0200000_3_I1;
import com.facebook.redex.IDxDListenerShape160S0100000_3_I1;
import com.facebook.redex.IDxDListenerShape68S0200000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.61H  reason: invalid class name */
public class AnonymousClass61H implements C1223569g {
    public final /* synthetic */ C1205261z A00;

    public AnonymousClass61H(C1205261z r1) {
        this.A00 = r1;
    }

    public void AKJ(AnonymousClass2HJ r3, Integer num) {
        this.A00.A04.A0O.A07(r3, num, "pay-precheck");
        AQX(r3, num);
    }

    public Integer AKM() {
        return this.A00.A04.A0O.A02("pay-precheck");
    }

    public void AKW(AnonymousClass2HJ r3, Integer num) {
        this.A00.A04.A0O.A07(r3, num, "get-provider-key");
    }

    public void AKX(Integer num) {
        this.A00.A04.A0O.A0A(num, "get-provider-key", 2);
    }

    public void AQX(AnonymousClass2HJ r13, Integer num) {
        C35281lf A002;
        C005702l A003;
        C1205261z r0 = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = r0.A03;
        pinBottomSheetDialogFragment.A1N();
        BrazilPaymentActivity brazilPaymentActivity = r0.A04;
        brazilPaymentActivity.A0O.A05(brazilPaymentActivity.A00, "error_code", (long) r13.A00);
        int i2 = r13.A00;
        switch (i2) {
            case 454:
                C28371Vv r02 = r13.A05;
                if (!(r02 == null || (A002 = C35281lf.A00(r02)) == null)) {
                    brazilPaymentActivity.A0D.A04(C115275pU.A00(brazilPaymentActivity.A07, A002));
                }
                BrazilPaymentActivity.A02(pinBottomSheetDialogFragment, brazilPaymentActivity);
                return;
            case 1440:
                pinBottomSheetDialogFragment.A1P(r13.A01, R.plurals.plurals0102);
                return;
            case 1441:
                C110115dX.A12(pinBottomSheetDialogFragment, r13.A02);
                return;
            case 2826048:
                IDxCListenerShape30S0200000_3_I1 iDxCListenerShape30S0200000_3_I1 = new IDxCListenerShape30S0200000_3_I1(pinBottomSheetDialogFragment, 6, this);
                IDxDListenerShape160S0100000_3_I1 iDxDListenerShape160S0100000_3_I1 = new IDxDListenerShape160S0100000_3_I1(pinBottomSheetDialogFragment, 6);
                String string = brazilPaymentActivity.getString(R.string.str029a);
                String string2 = brazilPaymentActivity.getString(R.string.str0299);
                C32241fu A004 = C32241fu.A00(brazilPaymentActivity);
                A004.setPositiveButton(R.string.str1032, iDxCListenerShape30S0200000_3_I1);
                A004.A0C(iDxDListenerShape160S0100000_3_I1);
                if (string2 == null) {
                    A004.A06(string);
                } else {
                    A004.setTitle(string);
                    A004.A06(string2);
                }
                C13690nt.A1G(A004);
                String string3 = brazilPaymentActivity.A01.getString(R.string.str0299);
                C1222969a r4 = brazilPaymentActivity.A0L;
                AnonymousClass2St A0N = C110105dW.A0N();
                A0N.A01("product_flow", "p2m");
                A0N.A01("dialog_text", string3);
                AnonymousClass5xP.A01(A0N, r4, (Integer) null, "payment_disabled_alert", (String) null, 0);
                return;
            case 2896003:
            case 2896004:
                AnonymousClass5xP.A02(AnonymousClass5xP.A00(brazilPaymentActivity.A05, (C28401Vy) null, brazilPaymentActivity.A0U, (String) null, false), brazilPaymentActivity.A0L, "incentive_unavailable", "payment_confirm_prompt");
                A003 = brazilPaymentActivity.A08.A00(brazilPaymentActivity, (DialogInterface.OnDismissListener) null, new IDxDListenerShape68S0200000_3_I1(pinBottomSheetDialogFragment, 0, this), (DialogInterface.OnDismissListener) null, (String) null, r13.A00);
                break;
            default:
                if (i2 == 444 || i2 == 478) {
                    brazilPaymentActivity.A0K.A01.A01("FB", "PIN");
                }
                C1200860g r5 = brazilPaymentActivity.A08;
                int i3 = r13.A00;
                A003 = r5.A00(brazilPaymentActivity, new IDxDListenerShape68S0200000_3_I1(pinBottomSheetDialogFragment, 1, this), new IDxDListenerShape160S0100000_3_I1(pinBottomSheetDialogFragment, 4), new IDxDListenerShape160S0100000_3_I1(pinBottomSheetDialogFragment, 5), brazilPaymentActivity.A03.A08(brazilPaymentActivity.A08.A01(brazilPaymentActivity.A0G)), i3);
                break;
        }
        A003.show();
    }

    public void AWR(String str, Integer num) {
        C1205261z r3 = this.A00;
        r3.A03.A1N();
        BrazilPaymentActivity brazilPaymentActivity = r3.A04;
        brazilPaymentActivity.A0O.A0A(num, "pay-precheck", 2);
        String str2 = r3.A05;
        C28401Vy r5 = r3.A00;
        C30671cl r6 = r3.A01;
        String str3 = r3.A06;
        int i2 = 1;
        if (brazilPaymentActivity.A3H(r5, brazilPaymentActivity.A01) == null) {
            i2 = 0;
        }
        brazilPaymentActivity.A3L(r5, r6, r3.A02, str2, str, str3, i2);
    }
}
