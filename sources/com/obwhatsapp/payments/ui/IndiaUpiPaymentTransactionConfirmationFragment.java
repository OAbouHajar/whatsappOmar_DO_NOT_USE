package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass174;
import X.AnonymousClass1ZW;
import X.AnonymousClass2St;
import X.AnonymousClass5u5;
import X.AnonymousClass61W;
import X.C004601z;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C111805hR;
import X.C111855hW;
import X.C112285iF;
import X.C119425xq;
import X.C13680ns;
import X.C16440t3;
import X.C28401Vy;
import X.C28411Vz;
import X.C30671cl;
import X.C35301lh;
import X.C35481m0;
import X.C35491m1;
import X.C39901tF;
import X.C53842gO;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.redex.IDxVCallbackShape454S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.obwhatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationViewModel;
import java.util.HashMap;

public class IndiaUpiPaymentTransactionConfirmationFragment extends Hilt_IndiaUpiPaymentTransactionConfirmationFragment {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public LottieAnimationView A04;
    public Button A05;
    public Button A06;
    public C16440t3 A07;
    public AnonymousClass013 A08;
    public C28411Vz A09;
    public C28401Vy A0A;
    public C35301lh A0B;
    public AnonymousClass174 A0C;
    public AnonymousClass61W A0D;
    public AnonymousClass5u5 A0E;
    public IndiaUpiPaymentTransactionConfirmationViewModel A0F;
    public String A0G;
    public String A0H;

    public void A0k() {
        super.A0k();
        this.A0E = null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IndiaUpiPaymentTransactionConfirmationViewModel indiaUpiPaymentTransactionConfirmationViewModel = (IndiaUpiPaymentTransactionConfirmationViewModel) new C006602z(this).A01(IndiaUpiPaymentTransactionConfirmationViewModel.class);
        this.A0F = indiaUpiPaymentTransactionConfirmationViewModel;
        C110115dX.A0w(A0H(), indiaUpiPaymentTransactionConfirmationViewModel.A00, this, 32);
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout033a);
    }

    public void A18(Bundle bundle, View view) {
        C111805hR r9;
        Bundle bundle2 = this.A05;
        View view2 = view;
        this.A04 = (LottieAnimationView) C004601z.A0E(view2, R.id.lottie_animation);
        this.A00 = C13680ns.A0L(view2, R.id.amount);
        this.A03 = C13680ns.A0L(view2, R.id.status);
        this.A02 = C13680ns.A0L(view2, R.id.name);
        this.A06 = (Button) C004601z.A0E(view2, R.id.view_details_button);
        this.A05 = (Button) C004601z.A0E(view2, R.id.done_button);
        this.A01 = C13680ns.A0L(view2, R.id.date);
        if (bundle2 != null) {
            this.A09 = C35481m0.A05;
            C111855hW r5 = (C111855hW) bundle2.getParcelable("extra_country_transaction_data");
            this.A0A = (C28401Vy) bundle2.getParcelable("extra_transaction_send_amount");
            C30671cl r8 = (C30671cl) bundle2.getParcelable("extra_payment_method");
            String string = bundle2.getString("extra_encrypted_interop_description");
            this.A0B = (C35301lh) bundle2.getParcelable("extra_payee_name");
            C35301lh r4 = (C35301lh) bundle2.getParcelable("extra_receiver_vpa");
            C35301lh r3 = (C35301lh) bundle2.getParcelable("extra_payment_upi_number");
            String string2 = bundle2.getString("extra_merchant_code");
            String string3 = bundle2.getString("extra_transaction_ref");
            String string4 = bundle2.getString("extra_transaction_ref_url");
            String string5 = bundle2.getString("extra_purpose_code");
            String string6 = bundle2.getString("extra_initiation_mode");
            this.A0H = bundle2.getString("extra_transaction_id");
            String string7 = bundle2.getString("extra_transaction_type");
            this.A0G = bundle2.getString("referral_screen");
            if (r8 != null) {
                C39901tF r92 = r8.A08;
                AnonymousClass00B.A06(r92);
                r9 = (C111805hR) r92;
            } else {
                r9 = null;
            }
            C110105dW.A0r(this.A06, this, 61);
            C110105dW.A0r(this.A05, this, 60);
            C110105dW.A0r(C004601z.A0E(view2, R.id.close), this, 59);
            if (this.A0A != null && r9 != null && r8 != null) {
                this.A04.setAnimation("transaction_confirmation_lottie_animation.json");
                LottieAnimationView lottieAnimationView = this.A04;
                lottieAnimationView.A0F.A0K.addListener(new C119425xq(this));
                this.A00.setText(this.A09.A9H(this.A08, this.A0A, 0));
                IndiaUpiPaymentTransactionConfirmationViewModel indiaUpiPaymentTransactionConfirmationViewModel = this.A0F;
                C35301lh r15 = r9.A06;
                String str = r8.A0A;
                C28401Vy r14 = this.A0A;
                String str2 = ((C35491m1) this.A09).A04;
                C35301lh r1 = this.A0B;
                boolean equals = "p2m".equals(string7);
                String str3 = this.A0H;
                indiaUpiPaymentTransactionConfirmationViewModel.A07 = r5;
                indiaUpiPaymentTransactionConfirmationViewModel.A04 = r14;
                indiaUpiPaymentTransactionConfirmationViewModel.A0A = string;
                indiaUpiPaymentTransactionConfirmationViewModel.A05 = r1;
                indiaUpiPaymentTransactionConfirmationViewModel.A06 = r4;
                C112285iF r13 = indiaUpiPaymentTransactionConfirmationViewModel.A0I;
                HashMap hashMap = indiaUpiPaymentTransactionConfirmationViewModel.A0E.A08;
                C35301lh r17 = r3;
                C35301lh r16 = r1;
                r13.A00(r14, r15, r16, r17, r5, indiaUpiPaymentTransactionConfirmationViewModel.A0H, new IDxVCallbackShape454S0100000_3_I1(indiaUpiPaymentTransactionConfirmationViewModel, 1), str, str2, string3, string2, string4, string5, string6, str3, string, hashMap, equals);
            }
        }
    }

    public final void A1A(int i2, String str, int i3) {
        C53842gO A7M = this.A0D.A7M();
        C110115dX.A10(A7M, i2);
        A7M.A0X = "payment_confirm_prompt";
        A7M.A0a = "payments_transaction_confirmation";
        A7M.A0Z = this.A0G;
        if (!AnonymousClass1ZW.A0E(str)) {
            AnonymousClass2St A0N = C110105dW.A0N();
            A0N.A01("transaction_status", str);
            A7M.A0Y = A0N.toString();
        }
        if (i2 == 1) {
            A7M.A07 = Integer.valueOf(i3);
        }
        this.A0D.AKR(A7M);
    }
}
