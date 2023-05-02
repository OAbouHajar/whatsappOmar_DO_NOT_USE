package X;

import android.view.View;
import com.facebook.redex.IDxDListenerShape455S0100000_3_I1;
import com.facebook.redex.IDxNConsumerShape19S0300000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.ConfirmPaymentFragment;
import com.obwhatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.625  reason: invalid class name */
public class AnonymousClass625 implements AnonymousClass69Z {
    public final /* synthetic */ AnonymousClass1WD A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ C53322fW A02;
    public final /* synthetic */ ConfirmPaymentFragment A03;
    public final /* synthetic */ C112825ja A04;

    public AnonymousClass625(AnonymousClass1WD r1, C28401Vy r2, C53322fW r3, ConfirmPaymentFragment confirmPaymentFragment, C112825ja r5) {
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = confirmPaymentFragment;
    }

    public void AP0(View view, View view2, C35511m3 r9, C30671cl r10, PaymentBottomSheet paymentBottomSheet) {
        C112825ja r5 = this.A04;
        if (C111345g2.A20(r10, r5)) {
            AUW(paymentBottomSheet, 0);
            return;
        }
        AnonymousClass1WD r4 = this.A00;
        if (r4 != null) {
            r5.Afq(R.string.str13db);
            AnonymousClass5xV r3 = r5.A0V;
            r4.A01(new IDxNConsumerShape19S0300000_3_I1(r5, new AnonymousClass62G(this, paymentBottomSheet), r3, 1), r3.A00.A06);
            return;
        }
        r5.A3v(paymentBottomSheet);
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1C();
        }
        r5.A3x(this.A01);
    }

    public void AUW(PaymentBottomSheet paymentBottomSheet, int i2) {
        C112825ja r2 = this.A04;
        boolean A022 = r2.A0Y.A02(r2.A0B, r2.A0n);
        AnonymousClass61W r3 = r2.A0E;
        Integer A0Y = C13680ns.A0Y();
        String str = A022 ? "add_credential_prompt" : "payment_confirm_prompt";
        r3.AKV(C112825ja.A02(this.A01, this.A02, r2), A0Y, 84, str, r2.A0g, r2.A0g, r2.A0f, false, C112765jH.A23(r2));
        PaymentMethodsListPickerFragment A012 = PaymentMethodsListPickerFragment.A01(r2.A0j);
        A012.A08 = new AnonymousClass62B(r2, A012);
        A012.A06 = new AnonymousClass627(r2);
        A012.A0W(this.A03, 0);
        paymentBottomSheet.A1O(A012);
    }

    public void AUZ(C30671cl r2, PaymentMethodRow paymentMethodRow) {
        C112825ja.A09(r2, this.A04);
    }

    public void AUc(PaymentBottomSheet paymentBottomSheet, int i2, int i3) {
    }

    public void AUg(PaymentBottomSheet paymentBottomSheet, int i2) {
    }

    public void AUh(int i2) {
        this.A04.A0n = i2 == 1 ? "p2p" : "p2m";
    }

    public void AZ9(PaymentBottomSheet paymentBottomSheet) {
        C112825ja r3 = this.A04;
        IndiaUpiEditTransactionDescriptionFragment A012 = IndiaUpiEditTransactionDescriptionFragment.A01(r3.A0c);
        r3.A3t(64, "payment_confirm_prompt");
        A012.A08 = new IDxDListenerShape455S0100000_3_I1(this, 0);
        paymentBottomSheet.A1O(A012);
    }
}
