package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape163S0100000_3_I1;
import com.facebook.redex.IDxSCallbackShape456S0100000_3_I1;
import com.facebook.redex.IDxUCallbackShape448S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.international.IndiaUpiInternationalValidateQrActivity;

/* renamed from: X.60n  reason: invalid class name and case insensitive filesystem */
public class C1201560n implements C54722i6 {
    public final C15900s5 A00;
    public final C14710pd A01;
    public final AnonymousClass60V A02;
    public final AnonymousClass61W A03;
    public final AnonymousClass5xN A04;

    public C1201560n(C15900s5 r1, C14710pd r2, AnonymousClass60V r3, AnonymousClass61W r4, AnonymousClass5xN r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
    }

    public void A00(Activity activity, C1222168s r12, String str, String str2, String str3) {
        C119395xh r6;
        int i2;
        String str4;
        C14710pd r2 = this.A01;
        AnonymousClass60V r1 = this.A02;
        Activity activity2 = activity;
        String str5 = str3;
        if (!C119105vx.A00(r2, r1.A08()) || !C119105vx.A01(r2, str)) {
            if (str == null || (r6 = C119395xh.A00(Uri.parse(str), str2)) == null) {
                r6 = null;
            } else {
                r6.A08 = str;
            }
            String A002 = AnonymousClass60V.A00(r1);
            if (r6 != null && (str4 = r6.A0O) != null && str4.equalsIgnoreCase(A002)) {
                i2 = R.string.str1016;
            } else if (r12 != null && str != null && str.startsWith("upi://mandate") && r2.A0C(2211)) {
                this.A04.A07(activity2, r6, new IDxUCallbackShape448S0100000_3_I1(r12, 0), str5, true);
                return;
            } else if (AnonymousClass5xQ.A03(r6)) {
                i2 = R.string.str1017;
            } else {
                Intent A042 = C110105dW.A04(activity, IndiaUpiSendPaymentActivity.class);
                C15900s5 r3 = this.A00;
                AnonymousClass5xQ.A01(A042, r3, r6);
                C110115dX.A0r(A042, str3);
                A042.putExtra("extra_is_pay_money_only", !TextUtils.isEmpty(r6.A0A));
                A042.putExtra("return-after-pay", "DEEP_LINK".equals(r6.A02));
                A042.putExtra("verify-vpa-in-background", true);
                if (AnonymousClass5xQ.A04(str3)) {
                    A042.putExtra("extra_payment_preset_max_amount", String.valueOf(r3.A02(C15910s6.A1q)));
                }
                A042.addFlags(33554432);
                activity.startActivity(A042);
                if (r12 != null) {
                    IDxSCallbackShape456S0100000_3_I1 iDxSCallbackShape456S0100000_3_I1 = (IDxSCallbackShape456S0100000_3_I1) r12;
                    if (iDxSCallbackShape456S0100000_3_I1.A01 == 0) {
                        AnonymousClass3K4.A0y(iDxSCallbackShape456S0100000_3_I1.A00);
                        return;
                    }
                    return;
                }
                return;
            }
            String string = activity.getString(i2);
            this.A03.AKS(C13680ns.A0X(), (Integer) null, "qr_code_scan_error", str3);
            C32241fu A003 = C32241fu.A00(activity);
            C110105dW.A0w(A003, r12, 0, R.string.str0e87);
            A003.A06(string);
            A003.A03(new IDxCListenerShape163S0100000_3_I1(r12, 0));
            C13690nt.A1G(A003);
            return;
        }
        Intent A043 = C110105dW.A04(activity, IndiaUpiInternationalValidateQrActivity.class);
        A043.putExtra("INTERNATIONAL_QR_PAYLOAD", str);
        C110115dX.A0r(A043, str3);
        activity.startActivity(A043);
    }

    public DialogFragment AFI(String str, String str2, int i2) {
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A01 = IndiaUpiQrCodeScannedDialogFragment.A01(str, (i2 == 3 || i2 == 9) ? "GALLERY_QR_CODE" : "SCANNED_QR_CODE", str2);
        return paymentBottomSheet;
    }

    public boolean AJr(String str) {
        C119395xh A002 = C119395xh.A00(Uri.parse(str), "SCANNED_QR_CODE");
        if (!AnonymousClass000.A1O(str.startsWith("upi://mandate") ? 1 : 0) ? A002 != null : !(!this.A01.A0C(2211) || A002 == null || A002.A0L != null)) {
            if (!TextUtils.isEmpty(A002.A0O)) {
                return true;
            }
        }
        return false;
    }

    public void Aft(Activity activity, String str, String str2) {
        A00(activity, (C1222168s) null, str, "SCANNED_QR_CODE", str2);
    }
}
