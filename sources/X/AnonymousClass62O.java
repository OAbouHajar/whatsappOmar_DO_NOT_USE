package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxNConsumerShape42S0200000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.ConfirmPaymentFragment;
import com.obwhatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment;
import com.obwhatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.PaymentIncentiveViewFragment;
import com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.obwhatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/* renamed from: X.62O  reason: invalid class name */
public class AnonymousClass62O implements C1223969k {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public AnonymousClass62O(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void AM9() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A3t(57, "available_payment_methods_prompt");
        indiaUpiSendPaymentActivity.A3u(indiaUpiSendPaymentActivity, false);
    }

    public void AMQ(String str) {
        C114255nS r2 = this.A00.A03;
        boolean z2 = !str.isEmpty();
        r2.A00.setEnabled(z2);
        r2.A00.setClickable(z2);
    }

    public void AQb(String str) {
        String str2;
        String str3;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0E.AKS(C13680ns.A0X(), 51, "max_amount_shake", indiaUpiSendPaymentActivity.A0g);
        if (indiaUpiSendPaymentActivity.A0C.A0C(1933)) {
            if (indiaUpiSendPaymentActivity.A04.A00.A00.compareTo(new BigDecimal(indiaUpiSendPaymentActivity.A06.A02(C15910s6.A1p))) == 0) {
                str2 = "-10022";
                str3 = "MAX_AMOUNT_2K_INLINE";
            } else {
                str2 = "-10020";
                str3 = "MAX_AMOUNT_100K";
            }
            indiaUpiSendPaymentActivity.A4D(str2, str3);
        }
    }

    public void ART(String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && !z2) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
            indiaUpiSendPaymentActivity.A3D(indiaUpiSendPaymentActivity.A0E, indiaUpiSendPaymentActivity.A0U);
        }
    }

    public void ARu() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        C53322fW r0 = indiaUpiSendPaymentActivity.A0U;
        if (r0 != null && r0.A01 != null) {
            indiaUpiSendPaymentActivity.overridePendingTransition(0, 0);
            C53322fW r3 = indiaUpiSendPaymentActivity.A0U;
            AnonymousClass61W r2 = indiaUpiSendPaymentActivity.A0E;
            Bundle A0D = C13690nt.A0D();
            PaymentIncentiveViewFragment paymentIncentiveViewFragment = new PaymentIncentiveViewFragment(r2, r3);
            paymentIncentiveViewFragment.A0T(A0D);
            paymentIncentiveViewFragment.A03 = new C116125qr(paymentIncentiveViewFragment);
            indiaUpiSendPaymentActivity.Afc(paymentIncentiveViewFragment);
        }
    }

    public void AUU() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (C16030sJ.A0L(indiaUpiSendPaymentActivity.A0E) && indiaUpiSendPaymentActivity.A00 == 0) {
            indiaUpiSendPaymentActivity.A39((Bundle) null);
        } else if (!indiaUpiSendPaymentActivity.A48()) {
        } else {
            if (!indiaUpiSendPaymentActivity.A47()) {
                indiaUpiSendPaymentActivity.startActivity(C110105dW.A04(indiaUpiSendPaymentActivity, IndiaUpiInteropSendToUpiActivity.class));
            } else {
                AnonymousClass29T.A01(indiaUpiSendPaymentActivity, 34);
            }
        }
    }

    public void AUV() {
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        PaymentMethodsListPickerFragment A01 = PaymentMethodsListPickerFragment.A01(indiaUpiSendPaymentActivity.A0j);
        A01.A08 = new AnonymousClass62B(indiaUpiSendPaymentActivity, A01);
        A01.A06 = new AnonymousClass627(indiaUpiSendPaymentActivity);
        paymentBottomSheet.A01 = A01;
        indiaUpiSendPaymentActivity.Afb(paymentBottomSheet, "18");
    }

    public void AUa() {
        this.A00.A3t(64, "enter_user_payment_id");
    }

    public void AWE(C28401Vy r14, String str) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0F.AL3("request_payment", 123);
        if (indiaUpiSendPaymentActivity.A0B == null || indiaUpiSendPaymentActivity.A0C.A0R()) {
            AM9();
            return;
        }
        indiaUpiSendPaymentActivity.A0A = r14;
        if (indiaUpiSendPaymentActivity.A47()) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            ConfirmPaymentFragment A01 = ConfirmPaymentFragment.A01(indiaUpiSendPaymentActivity.A0B, (UserJid) null, indiaUpiSendPaymentActivity.A0n, indiaUpiSendPaymentActivity.A0p ^ true ? 1 : 0);
            A01.A0L = new AnonymousClass621(indiaUpiSendPaymentActivity.A02.A01("INR"), indiaUpiSendPaymentActivity, paymentBottomSheet);
            A01.A0M = new AnonymousClass624(indiaUpiSendPaymentActivity);
            paymentBottomSheet.A01 = A01;
            indiaUpiSendPaymentActivity.Afc(paymentBottomSheet);
            return;
        }
        AnonymousClass1Vo r7 = indiaUpiSendPaymentActivity.A0t;
        C40001tP[] r5 = new C40001tP[1];
        UserJid userJid = indiaUpiSendPaymentActivity.A0G;
        r5[0] = new C40001tP("receiver_jid", userJid != null ? userJid.toString() : "");
        C16740tZ r10 = null;
        r7.A09((String) null, "requesting payment ", r5);
        PaymentView A35 = indiaUpiSendPaymentActivity.A35();
        if (A35 == null || A35.getStickerIfSelected() == null) {
            indiaUpiSendPaymentActivity.A05.Acl(new AnonymousClass64T(this));
            indiaUpiSendPaymentActivity.Ac1();
            indiaUpiSendPaymentActivity.A3H();
            indiaUpiSendPaymentActivity.A37(1);
            return;
        }
        indiaUpiSendPaymentActivity.Afq(R.string.str13db);
        C18270wQ r6 = indiaUpiSendPaymentActivity.A0S;
        PaymentView paymentView = indiaUpiSendPaymentActivity.A0X;
        AnonymousClass00B.A04(paymentView);
        C34151jm stickerIfSelected = paymentView.getStickerIfSelected();
        AnonymousClass00B.A06(stickerIfSelected);
        C15830rv r8 = indiaUpiSendPaymentActivity.A0E;
        AnonymousClass00B.A06(r8);
        UserJid userJid2 = indiaUpiSendPaymentActivity.A0G;
        long j2 = indiaUpiSendPaymentActivity.A02;
        if (j2 != 0) {
            r10 = indiaUpiSendPaymentActivity.A09.A0K.A00(j2);
        }
        PaymentView paymentView2 = indiaUpiSendPaymentActivity.A0X;
        r6.A01(paymentView2.getPaymentBackground(), r8, userJid2, r10, stickerIfSelected, paymentView2.getStickerSendOrigin()).A01(new IDxNConsumerShape42S0200000_3_I1(r14, 5, this), indiaUpiSendPaymentActivity.A05.A06);
    }

    public void AWz(C28401Vy r10) {
        BigDecimal bigDecimal;
        int i2;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0F.AL3("send_payment", 123);
        indiaUpiSendPaymentActivity.A3t(5, "new_payment");
        if (indiaUpiSendPaymentActivity.A0B == null || indiaUpiSendPaymentActivity.A0C.A0R()) {
            AM9();
            return;
        }
        boolean z2 = true;
        if (indiaUpiSendPaymentActivity.A09) {
            if (indiaUpiSendPaymentActivity.A00 != 5) {
                indiaUpiSendPaymentActivity.A08 = true;
                indiaUpiSendPaymentActivity.A4B();
                return;
            }
            String A1d = C111345g2.A1d(indiaUpiSendPaymentActivity);
            if (!AnonymousClass1ZW.A0E(A1d) && r10.A00.compareTo(new BigDecimal(A1d)) > 0) {
                i2 = 41;
                if (indiaUpiSendPaymentActivity.A0p) {
                    i2 = 40;
                }
            } else if (!indiaUpiSendPaymentActivity.A0p && (bigDecimal = indiaUpiSendPaymentActivity.A06) != null && r10.A00.compareTo(bigDecimal) > 0) {
                i2 = 39;
            }
            AnonymousClass29T.A01(indiaUpiSendPaymentActivity, i2);
            return;
        }
        C30671cl r1 = indiaUpiSendPaymentActivity.A0B;
        C111805hR r0 = (C111805hR) r1.A08;
        if (r0 == null || AnonymousClass000.A1X(r0.A05.A00)) {
            if (indiaUpiSendPaymentActivity.A0D.A01().getBoolean("payments_upi_pin_primer_dialog_shown", false)) {
                C13680ns.A0z(C110105dW.A06(indiaUpiSendPaymentActivity.A0D), "payments_upi_pin_primer_dialog_shown", false);
            } else {
                int A02 = indiaUpiSendPaymentActivity.A0C.A02(1124);
                String[] split = indiaUpiSendPaymentActivity.A0D.A05().split(";");
                int length = split.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (split[i3].equalsIgnoreCase(indiaUpiSendPaymentActivity.A0B.A0A)) {
                            break;
                        }
                        i3++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!(!indiaUpiSendPaymentActivity.A05.A01().isEmpty()) && z2 && A02 > 0 && indiaUpiSendPaymentActivity.A0D.A01().getInt("payments_two_factor_nudge_count", 0) < A02) {
                    C18300wT r12 = indiaUpiSendPaymentActivity.A0D;
                    if (r12.A01.A00() - C13680ns.A08(r12.A01(), "payments_last_two_factor_nudge_time") > TimeUnit.HOURS.toMillis(24)) {
                        IndiaUpiPaymentTwoFactorNudgeFragment indiaUpiPaymentTwoFactorNudgeFragment = new IndiaUpiPaymentTwoFactorNudgeFragment();
                        indiaUpiPaymentTwoFactorNudgeFragment.A05 = indiaUpiSendPaymentActivity;
                        indiaUpiSendPaymentActivity.Afc(indiaUpiPaymentTwoFactorNudgeFragment);
                        return;
                    }
                }
            }
            if (indiaUpiSendPaymentActivity.A4G()) {
                indiaUpiSendPaymentActivity.A0A = r10;
                indiaUpiSendPaymentActivity.Afq(R.string.str13db);
                indiaUpiSendPaymentActivity.A05.Acl(new C1213565e(r10, indiaUpiSendPaymentActivity));
                return;
            }
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            paymentBottomSheet.A01 = indiaUpiSendPaymentActivity.A3m(r10, paymentBottomSheet);
            indiaUpiSendPaymentActivity.Afc(paymentBottomSheet);
            return;
        }
        IndiaUpiPinPrimerDialogFragment A0T = C110115dX.A0T(r1, indiaUpiSendPaymentActivity);
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        paymentBottomSheet2.A01 = A0T;
        indiaUpiSendPaymentActivity.Afb(paymentBottomSheet2, "IndiaUpiPinPrimerDialogFragment");
        C13680ns.A0z(C110105dW.A06(indiaUpiSendPaymentActivity.A0D), "payments_upi_pin_primer_dialog_shown", true);
    }

    public void AX0() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        C112765jH.A22(indiaUpiSendPaymentActivity, indiaUpiSendPaymentActivity.A0E, indiaUpiSendPaymentActivity.A0U, 47);
    }

    public void AX2() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        Object[] A1b = C13680ns.A1b();
        A1b[0] = indiaUpiSendPaymentActivity.A03.A0E(indiaUpiSendPaymentActivity.A08);
        indiaUpiSendPaymentActivity.Afj(A1b, 0, R.string.str0ffb);
    }

    public void AYk(boolean z2) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        C112765jH.A22(indiaUpiSendPaymentActivity, indiaUpiSendPaymentActivity.A0E, indiaUpiSendPaymentActivity.A0U, z2 ? 49 : 48);
        indiaUpiSendPaymentActivity.A3q();
    }
}
