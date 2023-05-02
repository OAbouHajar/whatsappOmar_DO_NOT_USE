package com.obwhatsapp.payments.ui;

import X.AnonymousClass1MA;
import X.AnonymousClass1TU;
import X.AnonymousClass1Vo;
import X.AnonymousClass5ko;
import X.C110105dW;
import X.C111345g2;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import android.os.Bundle;
import com.obwhatsapp.R;

public class IndiaUpiPaymentsAccountSetupActivity extends AnonymousClass5ko {
    public AnonymousClass1TU A00;
    public AnonymousClass1MA A01;
    public boolean A02;
    public final AnonymousClass1Vo A03;

    public IndiaUpiPaymentsAccountSetupActivity() {
        this(0);
        this.A03 = C110105dW.A0P("IndiaUpiPaymentsAccountSetupActivity");
    }

    public IndiaUpiPaymentsAccountSetupActivity(int i2) {
        this.A02 = false;
        C110105dW.A0t(this, 63);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A01 = (AnonymousClass1MA) r1.AHr.get();
            this.A00 = (AnonymousClass1TU) r1.AHw.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0033, code lost:
        if (r0.equals(r1) != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3S(boolean r5) {
        /*
            r4 = this;
            X.1Vo r1 = r4.A03
            java.lang.String r0 = "showCompleteAndFinish "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r5)
            X.C110105dW.A1L(r1, r0)
            r4.Ac1()
            X.1TU r1 = r4.A00
            X.60q r0 = new X.60q
            r0.<init>(r4)
            r1.A00(r0)
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity.class
            android.content.Intent r3 = X.C110105dW.A04(r4, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r2 = "referral_screen"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = "setup_pin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
        L_0x0035:
            r3.putExtra(r2, r1)
            r4.A3M(r3)
            java.lang.String r1 = r4.A0L
            java.lang.String r0 = "extra_previous_screen"
            X.C110115dX.A0p(r3, r4, r0, r1)
            return
        L_0x0043:
            java.lang.String r1 = "nav_select_account"
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.A3S(boolean):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1104);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x016d, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x016f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r6 = this;
            super.onResume()
            X.1Vo r2 = r6.A03
            java.lang.String r0 = "onResume payment setup with mode: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r6.A03
            r1.append(r0)
            X.C110105dW.A1L(r2, r1)
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0075
            X.0rz r0 = r6.A09
            r5 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "payments_onboarding_banner_registration_started"
            X.C13680ns.A0z(r1, r0, r5)
            X.175 r0 = r6.A0I
            X.1tS r3 = r0.A00()
            boolean r0 = r6.A0S
            if (r0 == 0) goto L_0x005f
            boolean r0 = r6.A0U
            if (r0 != 0) goto L_0x005f
            X.0wT r0 = r6.A0D
            boolean r0 = r0.A0P()
            if (r0 != 0) goto L_0x005f
            X.0pd r1 = r6.A0C
            r0 = 2974(0xb9e, float:4.167E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0138
            int r1 = r6.A02
            r0 = 2
            if (r1 == r0) goto L_0x0138
            r0 = 3
            if (r1 == r0) goto L_0x0138
            r0 = 6
            if (r1 == r0) goto L_0x0138
            r0 = 7
            if (r1 == r0) goto L_0x0138
            r0 = 8
            if (r1 == r0) goto L_0x0138
            r0 = 10
            if (r1 == r0) goto L_0x0138
            r0 = 11
            if (r1 == r0) goto L_0x0138
        L_0x005f:
            if (r3 != 0) goto L_0x0076
            java.lang.String r0 = "showNextStep is already complete"
            r2.A06(r0)
            X.0wT r0 = r6.A0D
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C110105dW.A06(r0)
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            X.C13680ns.A0z(r1, r0, r2)
            r6.A3S(r5)
        L_0x0075:
            return
        L_0x0076:
            java.lang.String r0 = "showNextStep: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)
            r2.A06(r0)
            X.1tS r0 = X.AnonymousClass176.A05
            if (r3 != r0) goto L_0x008d
            r1 = 0
            java.lang.String r0 = "Unset step"
            r2.A0A(r0, r1)
            r6.finish()
            return
        L_0x008d:
            java.lang.String r0 = "tos_with_wallet"
            java.lang.String r1 = r3.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = "tos_no_wallet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = "add_card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "showAddCard not implemented"
            r2.A06(r0)
            return
        L_0x00ad:
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiPaymentsTosActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiPaymentsTosActivity.class
            android.content.Intent r2 = X.C110105dW.A04(r6, r0)
            java.lang.String r0 = "stepName"
            r2.putExtra(r0, r1)
            int r1 = r6.A03
            java.lang.String r0 = "extra_setup_mode"
            r2.putExtra(r0, r1)
            goto L_0x00ea
        L_0x00c0:
            java.lang.String r0 = "add_bank"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0113
            X.0wT r0 = r6.A0D
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x00e2
            X.60V r2 = r6.A0C
            java.lang.String r1 = r2.A08()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r2.A0T(r1)
            if (r0 == 0) goto L_0x00f8
        L_0x00e2:
            r6.A0R = r5
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity.class
        L_0x00e6:
            android.content.Intent r2 = X.C110105dW.A04(r6, r0)
        L_0x00ea:
            r6.A3M(r2)
            java.lang.String r1 = r6.A0L
            java.lang.String r0 = "extra_previous_screen"
            r2.putExtra(r0, r1)
            r6.A2X(r2, r5)
            return
        L_0x00f8:
            X.0pd r1 = r6.A0C
            r0 = 1644(0x66c, float:2.304E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x00e2
            int r1 = r6.A02
            r0 = 2
            if (r1 == r0) goto L_0x0110
            r0 = 3
            if (r1 == r0) goto L_0x0110
            r0 = 6
            if (r1 == r0) goto L_0x0110
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiProvideMoreInfoActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiProvideMoreInfoActivity.class
            goto L_0x00e6
        L_0x0110:
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity.class
            goto L_0x00e6
        L_0x0113:
            java.lang.String r0 = "2fa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0075
            X.0wT r0 = r6.A0D
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C110105dW.A06(r0)
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            X.C13680ns.A0z(r1, r0, r2)
            int r0 = r6.A03
            if (r0 != r5) goto L_0x0134
            r6.A0R = r5
            X.1m4 r0 = r6.A04
            android.content.Intent r2 = com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A02(r6, r0, r2)
            goto L_0x00ea
        L_0x0134:
            r6.A3S(r2)
            return
        L_0x0138:
            int r1 = r6.A02
            r0 = 2
            if (r1 == r0) goto L_0x01d3
            r0 = 3
            if (r1 == r0) goto L_0x01d3
            r0 = 6
            if (r1 == r0) goto L_0x01d3
            r0 = 7
            if (r1 == r0) goto L_0x01d3
            r0 = 8
            if (r1 == r0) goto L_0x01d3
            r0 = 10
            if (r1 == r0) goto L_0x01d3
            r0 = 11
            if (r1 == r0) goto L_0x01d3
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity.class
        L_0x0154:
            android.content.Intent r4 = X.C110105dW.A04(r6, r0)
            int r1 = r6.A03
            java.lang.String r0 = "extra_setup_mode"
            r4.putExtra(r0, r1)
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x01b1
            java.lang.String r1 = X.C110115dX.A0a(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01b1
        L_0x016f:
            X.C110115dX.A0r(r4, r1)
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x0185
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "extra_deep_link_url"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            r4.putExtra(r1, r0)
        L_0x0185:
            r6.A3M(r4)
            java.lang.String r1 = r6.A0L
            java.lang.String r0 = "extra_previous_screen"
            r4.putExtra(r0, r1)
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x01ad
            android.content.Intent r3 = r6.getIntent()
            r0 = -1
            java.lang.String r2 = "perf_start_time_ns"
            long r0 = r3.getLongExtra(r2, r0)
            r4.putExtra(r2, r0)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "perf_origin"
            X.C110115dX.A0n(r1, r4, r0)
        L_0x01ad:
            r6.A2X(r4, r5)
            return
        L_0x01b1:
            int r0 = r6.A02
            switch(r0) {
                case 1: goto L_0x01d0;
                case 2: goto L_0x01cd;
                case 3: goto L_0x01cd;
                case 4: goto L_0x01ca;
                case 5: goto L_0x01ca;
                case 6: goto L_0x01c7;
                case 7: goto L_0x01c4;
                case 8: goto L_0x01c1;
                case 9: goto L_0x01be;
                case 10: goto L_0x01bb;
                case 11: goto L_0x01b8;
                case 12: goto L_0x01ca;
                case 13: goto L_0x01ca;
                default: goto L_0x01b6;
            }
        L_0x01b6:
            r1 = 0
            goto L_0x016f
        L_0x01b8:
            java.lang.String r1 = "order_details"
            goto L_0x016f
        L_0x01bb:
            java.lang.String r1 = "payment_composer_icon"
            goto L_0x016f
        L_0x01be:
            java.lang.String r1 = "deeplink"
            goto L_0x016f
        L_0x01c1:
            java.lang.String r1 = "qr_code_scan_prompt"
            goto L_0x016f
        L_0x01c4:
            java.lang.String r1 = "payment_bank_account_details"
            goto L_0x016f
        L_0x01c7:
            java.lang.String r1 = "new_payment"
            goto L_0x016f
        L_0x01ca:
            java.lang.String r1 = "payment_home"
            goto L_0x016f
        L_0x01cd:
            java.lang.String r1 = "chat"
            goto L_0x016f
        L_0x01d0:
            java.lang.String r1 = "in_app_banner"
            goto L_0x016f
        L_0x01d3:
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity.class
            goto L_0x0154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.onResume():void");
    }
}
