package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxDConsumerShape388S0100000_3_I1;
import com.facebook.redex.IDxNConsumerShape19S0300000_3_I1;
import com.facebook.redex.IDxNConsumerShape8S1100000_3_I1;
import com.facebook.redex.IDxRCallbackShape249S0100000_3_I1;
import com.facebook.redex.IDxTCallbackShape452S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentTypePickerFragment;
import com.obwhatsapp.payments.ui.ConfirmPaymentFragment;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.PaymentRailPickerFragment;
import com.obwhatsapp.payments.ui.PaymentTypePickerFragment;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.626  reason: invalid class name */
public class AnonymousClass626 implements AnonymousClass69Z {
    public final /* synthetic */ AnonymousClass1WD A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ C53322fW A02;
    public final /* synthetic */ BrazilPaymentActivity A03;
    public final /* synthetic */ ConfirmPaymentFragment A04;
    public final /* synthetic */ PaymentBottomSheet A05;

    public AnonymousClass626(AnonymousClass1WD r1, C28401Vy r2, C53322fW r3, BrazilPaymentActivity brazilPaymentActivity, ConfirmPaymentFragment confirmPaymentFragment, PaymentBottomSheet paymentBottomSheet) {
        this.A03 = brazilPaymentActivity;
        this.A00 = r1;
        this.A05 = paymentBottomSheet;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = confirmPaymentFragment;
    }

    public final void A00(C35511m3 r20, C30671cl r21, AnonymousClass1XP r22, PaymentBottomSheet paymentBottomSheet) {
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        C53322fW r1 = this.A02;
        C28401Vy r12 = this.A01;
        AnonymousClass5xP.A01(AnonymousClass5xP.A00(brazilPaymentActivity.A05, r12, r1, (String) null, true), brazilPaymentActivity.A0L, 47, "payment_confirm_prompt", (String) null, 1);
        C35511m3 r4 = r20;
        C30671cl r13 = r21;
        if (r20 != null) {
            int A052 = r4.A05();
            if (BrazilPaymentActivity.A09(r13, A052)) {
                PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
                if (paymentBottomSheet != null) {
                    AUW(paymentBottomSheet2, A052);
                    return;
                }
                return;
            }
            brazilPaymentActivity.A05.Acl(new AnonymousClass65T(r4, this));
        }
        C39901tF r0 = r13.A08;
        AnonymousClass00B.A06(r0);
        if (((C39891tE) r0).A0a) {
            brazilPaymentActivity.A0P.A01().A02((AnonymousClass2HF) null, r13);
            this.A05.A1C();
            AnonymousClass1XP r6 = r22;
            if (Build.VERSION.SDK_INT < 23 || !brazilPaymentActivity.A0P.A05() || brazilPaymentActivity.A0P.A01() != 1) {
                BrazilPaymentActivity.A03(r12, r13, r6, brazilPaymentActivity, r12.toString(), brazilPaymentActivity.A0n);
                return;
            }
            brazilPaymentActivity.A3K(r12, r13, r6, r12.toString(), brazilPaymentActivity.A0n);
            return;
        }
        boolean A0C = brazilPaymentActivity.A0C.A0C(1927);
        String str = r13.A0A;
        if (A0C) {
            brazilPaymentActivity.Afq(R.string.str0f5c);
            brazilPaymentActivity.A0Y.A00(new IDxRCallbackShape249S0100000_3_I1(brazilPaymentActivity, 0), new IDxDConsumerShape388S0100000_3_I1(brazilPaymentActivity, 0), new IDxTCallbackShape452S0100000_3_I1(brazilPaymentActivity, 0), str, "payment_method_details").A00(new IDxNConsumerShape8S1100000_3_I1(1, str, brazilPaymentActivity));
            return;
        }
        brazilPaymentActivity.Afq(R.string.str0f5c);
        C16440t3 r9 = brazilPaymentActivity.A05;
        C14870pt r62 = brazilPaymentActivity.A05;
        C16040sK r7 = brazilPaymentActivity.A01;
        C17190ug r11 = brazilPaymentActivity.A0H;
        C18280wR r2 = brazilPaymentActivity.A0Z;
        C18290wS r15 = brazilPaymentActivity.A0P;
        C18310wU r14 = brazilPaymentActivity.A0M;
        C118335uW r16 = brazilPaymentActivity.A0N;
        new C118565ut(brazilPaymentActivity, r62, r7, brazilPaymentActivity.A07, r9, brazilPaymentActivity.A05, r11, brazilPaymentActivity.A09, brazilPaymentActivity.A0K, r14, r15, r16, r2, str).A00(new AnonymousClass610(brazilPaymentActivity, str));
    }

    public void AP0(View view, View view2, C35511m3 r9, C30671cl r10, PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass1WD r5 = this.A00;
        if (r5 != null) {
            BrazilPaymentActivity brazilPaymentActivity = this.A03;
            brazilPaymentActivity.Afq(R.string.str13db);
            AnonymousClass5xV r3 = brazilPaymentActivity.A0V;
            r5.A01(new IDxNConsumerShape19S0300000_3_I1(brazilPaymentActivity, new AnonymousClass62H(r9, r10, this, paymentBottomSheet), r3, 1), r3.A00.A06);
            return;
        }
        A00(r9, r10, (AnonymousClass1XP) null, paymentBottomSheet);
    }

    public void AUW(PaymentBottomSheet paymentBottomSheet, int i2) {
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        C53322fW r2 = this.A02;
        C28401Vy r1 = this.A01;
        AnonymousClass5xP.A01(AnonymousClass5xP.A00(brazilPaymentActivity.A05, r1, r2, (String) null, true), brazilPaymentActivity.A0L, 84, "payment_confirm_prompt", (String) null, 1);
        brazilPaymentActivity.A02.A00(new C1207862z(this, this.A04, paymentBottomSheet, i2));
    }

    public void AUZ(C30671cl r1, PaymentMethodRow paymentMethodRow) {
    }

    public void AUc(PaymentBottomSheet paymentBottomSheet, int i2, int i3) {
        PaymentRailPickerFragment A012 = PaymentRailPickerFragment.A01(i2, "p2p".equals(this.A03.A0n));
        A012.A0W(this.A04, 0);
        paymentBottomSheet.A1O(A012);
    }

    public void AUg(PaymentBottomSheet paymentBottomSheet, int i2) {
        Bundle A012 = PaymentTypePickerFragment.A01(i2);
        BrazilPaymentTypePickerFragment brazilPaymentTypePickerFragment = new BrazilPaymentTypePickerFragment();
        brazilPaymentTypePickerFragment.A0T(A012);
        brazilPaymentTypePickerFragment.A0W(this.A04, 0);
        paymentBottomSheet.A1O(brazilPaymentTypePickerFragment);
    }

    public void AUh(int i2) {
        this.A03.A0n = i2 == 1 ? "p2p" : "p2m";
    }

    public void AZ9(PaymentBottomSheet paymentBottomSheet) {
    }
}
