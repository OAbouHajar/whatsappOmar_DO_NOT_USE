package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape135S0100000_3_I1 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape135S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        r0.onClick(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0ac3, code lost:
        r4.AKS(r3, r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0ac6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014f, code lost:
        r0 = (com.obwhatsapp.payments.ui.ConfirmPaymentFragment) r2.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0155, code lost:
        if (r0 == null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0157, code lost:
        r0.A1A(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015a, code lost:
        r0 = r2.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0163, code lost:
        r0 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a1, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a3, code lost:
        r0.A1N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0ea2;
                case 1: goto L_0x0e9a;
                case 2: goto L_0x0e92;
                case 3: goto L_0x0e7b;
                case 4: goto L_0x0e5e;
                case 5: goto L_0x03ec;
                case 6: goto L_0x0df1;
                case 7: goto L_0x0de6;
                case 8: goto L_0x0ddb;
                case 9: goto L_0x0dc6;
                case 10: goto L_0x03c8;
                case 11: goto L_0x039d;
                case 12: goto L_0x0daf;
                case 13: goto L_0x0d9f;
                case 14: goto L_0x0d6c;
                case 15: goto L_0x0d5e;
                case 16: goto L_0x0ccb;
                case 17: goto L_0x0cb6;
                case 18: goto L_0x0379;
                case 19: goto L_0x0c9e;
                case 20: goto L_0x0c62;
                case 21: goto L_0x0c1e;
                case 22: goto L_0x0be6;
                case 23: goto L_0x0bb9;
                case 24: goto L_0x0b9f;
                case 25: goto L_0x0b9f;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x0b8b;
                case 29: goto L_0x0005;
                case 30: goto L_0x0b80;
                case 31: goto L_0x0005;
                case 32: goto L_0x0b1a;
                case 33: goto L_0x0b12;
                case 34: goto L_0x0b04;
                case 35: goto L_0x0afa;
                case 36: goto L_0x0ae9;
                case 37: goto L_0x0ae1;
                case 38: goto L_0x0acf;
                case 39: goto L_0x0ac7;
                case 40: goto L_0x02e4;
                case 41: goto L_0x029b;
                case 42: goto L_0x0aab;
                case 43: goto L_0x0a93;
                case 44: goto L_0x0a78;
                case 45: goto L_0x0a58;
                case 46: goto L_0x088a;
                case 47: goto L_0x0a43;
                case 48: goto L_0x0a37;
                case 49: goto L_0x0a2f;
                case 50: goto L_0x0276;
                case 51: goto L_0x0a23;
                case 52: goto L_0x0a13;
                case 53: goto L_0x09cd;
                case 54: goto L_0x09b5;
                case 55: goto L_0x099b;
                case 56: goto L_0x0239;
                case 57: goto L_0x0992;
                case 58: goto L_0x095e;
                case 59: goto L_0x0948;
                case 60: goto L_0x0931;
                case 61: goto L_0x091a;
                case 62: goto L_0x0900;
                case 63: goto L_0x08e8;
                case 64: goto L_0x08bd;
                case 65: goto L_0x08b5;
                case 66: goto L_0x0892;
                case 67: goto L_0x088a;
                case 68: goto L_0x088a;
                case 69: goto L_0x0870;
                case 70: goto L_0x0856;
                case 71: goto L_0x0823;
                case 72: goto L_0x0808;
                case 73: goto L_0x0214;
                case 74: goto L_0x01df;
                case 75: goto L_0x07f8;
                case 76: goto L_0x0800;
                case 77: goto L_0x07f8;
                case 78: goto L_0x07bf;
                case 79: goto L_0x01cc;
                case 80: goto L_0x01a7;
                case 81: goto L_0x07b7;
                case 82: goto L_0x07af;
                case 83: goto L_0x018b;
                case 84: goto L_0x07a7;
                case 85: goto L_0x078b;
                case 86: goto L_0x0179;
                case 87: goto L_0x0783;
                case 88: goto L_0x0783;
                case 89: goto L_0x0166;
                case 90: goto L_0x0779;
                case 91: goto L_0x0770;
                case 92: goto L_0x0767;
                case 93: goto L_0x015d;
                case 94: goto L_0x075e;
                case 95: goto L_0x0755;
                case 96: goto L_0x0732;
                case 97: goto L_0x0728;
                case 98: goto L_0x0720;
                case 99: goto L_0x015d;
                case 100: goto L_0x014a;
                case 101: goto L_0x0144;
                case 102: goto L_0x0708;
                case 103: goto L_0x0700;
                case 104: goto L_0x06d0;
                case 105: goto L_0x06ca;
                case 106: goto L_0x06ca;
                case 107: goto L_0x06c1;
                case 108: goto L_0x06b4;
                case 109: goto L_0x0117;
                case 110: goto L_0x06aa;
                case 111: goto L_0x00ea;
                case 112: goto L_0x0698;
                case 113: goto L_0x067d;
                case 114: goto L_0x066d;
                case 115: goto L_0x065d;
                case 116: goto L_0x00c7;
                case 117: goto L_0x0649;
                case 118: goto L_0x0639;
                case 119: goto L_0x009f;
                case 120: goto L_0x062d;
                case 121: goto L_0x061d;
                case 122: goto L_0x0649;
                case 123: goto L_0x05e9;
                case 124: goto L_0x05b5;
                case 125: goto L_0x05ad;
                case 126: goto L_0x059e;
                case 127: goto L_0x0596;
                case 128: goto L_0x0584;
                case 129: goto L_0x057c;
                case 130: goto L_0x0573;
                case 131: goto L_0x0569;
                case 132: goto L_0x0555;
                case 133: goto L_0x0541;
                case 134: goto L_0x0528;
                case 135: goto L_0x0501;
                case 136: goto L_0x0093;
                case 137: goto L_0x0093;
                case 138: goto L_0x04f4;
                case 139: goto L_0x04ea;
                case 140: goto L_0x04df;
                case 141: goto L_0x04bd;
                case 142: goto L_0x04ab;
                case 143: goto L_0x044f;
                case 144: goto L_0x042d;
                case 145: goto L_0x0070;
                case 146: goto L_0x0419;
                case 147: goto L_0x0402;
                case 148: goto L_0x03f8;
                case 149: goto L_0x005e;
                case 150: goto L_0x0046;
                case 151: goto L_0x002f;
                case 152: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r0 = (com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r0
            r0.A3U()
            r0.finish()
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r0 = r12.A00
            org.npci.commonlibrary.widget.Keypad r0 = (org.npci.commonlibrary.widget.Keypad) r0
            X.68m r0 = r0.A04
            if (r0 == 0) goto L_0x000f
            r3 = 66
            X.67K r0 = (X.AnonymousClass67K) r0
            org.npci.commonlibrary.GetCredential r2 = r0.A00
            r1 = 0
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r0.<init>(r1, r3)
            r2.dispatchKeyEvent(r0)
            org.npci.commonlibrary.NPCIFragment r0 = r2.A0D
            if (r0 == 0) goto L_0x000f
            r0.A1A()
            return
        L_0x002f:
            java.lang.Object r0 = r12.A00
            org.npci.commonlibrary.widget.Keypad r0 = (org.npci.commonlibrary.widget.Keypad) r0
            X.68m r0 = r0.A04
            if (r0 == 0) goto L_0x000f
            r3 = 7
            X.67K r0 = (X.AnonymousClass67K) r0
            org.npci.commonlibrary.GetCredential r2 = r0.A00
            r1 = 0
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r0.<init>(r1, r3)
            r2.dispatchKeyEvent(r0)
            return
        L_0x0046:
            java.lang.Object r0 = r12.A00
            org.npci.commonlibrary.widget.Keypad r0 = (org.npci.commonlibrary.widget.Keypad) r0
            X.68m r0 = r0.A04
            if (r0 == 0) goto L_0x000f
            r3 = 67
            X.67K r0 = (X.AnonymousClass67K) r0
            org.npci.commonlibrary.GetCredential r2 = r0.A00
            r1 = 0
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r0.<init>(r1, r3)
            r2.dispatchKeyEvent(r0)
            return
        L_0x005e:
            java.lang.Object r1 = r12.A00
            org.npci.commonlibrary.widget.FormItemEditText r1 = (org.npci.commonlibrary.widget.FormItemEditText) r1
            android.text.Editable r0 = r1.getText()
            int r0 = r0.length()
            r1.setSelection(r0)
            android.view.View$OnClickListener r0 = r1.A0D
            goto L_0x0099
        L_0x0070:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment r2 = (com.obwhatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment) r2
            X.5qW r0 = r2.A02
            if (r0 == 0) goto L_0x000f
            r0 = 6
            com.facebook.redex.IDxEWrapperShape176S0100000_3_I1 r1 = new com.facebook.redex.IDxEWrapperShape176S0100000_3_I1
            r1.<init>(r12, r0)
            r0 = 0
            r2.A1D(r1, r0)
            X.01A r1 = r2.A0D
            boolean r0 = r1 instanceof com.obwhatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment
            if (r0 == 0) goto L_0x000f
            java.lang.String r2 = r2.A05
            X.02C r1 = r1.A0F()
            r0 = 1
            r1.A0h(r2, r0)
            return
        L_0x0093:
            java.lang.Object r0 = r12.A00
            X.62c r0 = (X.C1205562c) r0
            android.view.View$OnClickListener r0 = r0.A00
        L_0x0099:
            if (r0 == 0) goto L_0x000f
            r0.onClick(r13)
            return
        L_0x009f:
            java.lang.Object r3 = r12.A00
            X.5eb r3 = (X.C110655eb) r3
            X.1lw r0 = r3.A01
            X.1tF r2 = r0.A08
            X.1tI r2 = (X.C39931tI) r2
            if (r2 == 0) goto L_0x000f
            java.lang.String r0 = r2.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000f
            r0 = 2
            X.5tL r1 = new X.5tL
            r1.<init>(r0)
            java.lang.String r0 = r2.A05
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.A03 = r0
            X.1cy r0 = r3.A03
            r0.A0B(r1)
            return
        L_0x00c7:
            java.lang.Object r2 = r12.A00
            X.5mN r2 = (X.C113635mN) r2
            r0 = 8
            r13.setVisibility(r0)
            android.widget.ListView r1 = r2.A01
            r0 = 0
            r1.setVisibility(r0)
            r0 = 1
            r2.A02 = r0
            X.69a r3 = r2.A05
            if (r3 == 0) goto L_0x000f
            r0 = 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "payment_transaction_details"
            X.C110105dW.A1K(r3, r2, r0, r1)
            return
        L_0x00ea:
            java.lang.Object r0 = r12.A00
            X.62d r0 = (X.C1205662d) r0
            com.obwhatsapp.payments.ui.invites.PaymentInviteFragment r2 = r0.A0A
            boolean r0 = r2 instanceof com.obwhatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment
            if (r0 == 0) goto L_0x0eaa
            com.obwhatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r2 = (com.obwhatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment) r2
            X.01A r1 = r2.A0D
            boolean r0 = r1 instanceof com.obwhatsapp.payments.ui.PaymentBottomSheet
            if (r0 == 0) goto L_0x000f
            X.00l r3 = r2.A0D()
            X.00l r4 = r2.A0D()
            X.0pS r4 = (X.C14600pS) r4
            java.lang.String r7 = r2.A0A
            X.19g r6 = r2.A0D
            X.19h r5 = r2.A0A
            X.5ui r2 = new X.5ui
            r2.<init>(r3, r4, r5, r6, r7)
            com.obwhatsapp.payments.ui.PaymentBottomSheet r1 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r1
            r2.A00(r1)
            return
        L_0x0117:
            java.lang.Object r5 = r12.A00
            com.obwhatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet r5 = (com.obwhatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet) r5
            X.00l r4 = r5.A0C()
            boolean r0 = r4 instanceof X.AnonymousClass681
            if (r0 == 0) goto L_0x000f
            X.681 r4 = (X.AnonymousClass681) r4
            X.0rv r3 = r5.A00
            X.AnonymousClass00B.A06(r3)
            com.obwhatsapp.payments.ui.BrazilOrderDetailsActivity r4 = (com.obwhatsapp.payments.ui.BrazilOrderDetailsActivity) r4
            X.5ei r2 = r4.A09
            X.AnonymousClass00B.A06(r3)
            X.0ti r1 = r4.A0E
            r0 = 2
            r2.A07(r3, r1, r0)
            r4.finish()
            r1 = 1
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A1N(r0, r1)
            return
        L_0x0144:
            java.lang.Object r2 = r12.A00
            X.01A r2 = (X.AnonymousClass01A) r2
            r1 = 1
            goto L_0x014f
        L_0x014a:
            java.lang.Object r2 = r12.A00
            X.01A r2 = (X.AnonymousClass01A) r2
            r1 = 0
        L_0x014f:
            X.01A r0 = r2.A09()
            com.obwhatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.obwhatsapp.payments.ui.ConfirmPaymentFragment) r0
            if (r0 == 0) goto L_0x015a
            r0.A1A(r1)
        L_0x015a:
            X.01A r0 = r2.A0D
            goto L_0x0163
        L_0x015d:
            java.lang.Object r0 = r12.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.01A r0 = r0.A0D
        L_0x0163:
            com.obwhatsapp.payments.ui.PaymentBottomSheet r0 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r0
            goto L_0x01a1
        L_0x0166:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment r0 = (com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment) r0
            X.01A r1 = r0.A0D
            com.obwhatsapp.payments.ui.PaymentBottomSheet r1 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r1
            if (r1 == 0) goto L_0x000f
            X.69b r0 = r0.A08
            r0.ANA()
            r1.A1N()
            return
        L_0x0179:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.PaymentBottomSheet r1 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r1
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x000f
            r1.A1C()
            X.5yC r1 = r1.A02
            r0 = 0
            r1.onDismiss(r0)
            return
        L_0x018b:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment r4 = (com.obwhatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment) r4
            X.61W r3 = r4.A0N
            java.lang.Integer r2 = X.C13680ns.A0Y()
            java.lang.String r1 = "enter_user_payment_id"
            r0 = 0
            r3.AKS(r2, r2, r1, r0)
            X.5ui r0 = r4.A0O
            if (r0 == 0) goto L_0x000f
            com.obwhatsapp.payments.ui.PaymentBottomSheet r0 = r0.A01
        L_0x01a1:
            if (r0 == 0) goto L_0x000f
            r0.A1N()
            return
        L_0x01a7:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiScanQrCodeFragment r1 = (com.obwhatsapp.payments.ui.IndiaUpiScanQrCodeFragment) r1
            X.00l r3 = r1.A0C()
            boolean r0 = r3 instanceof com.obwhatsapp.payments.ui.IndiaUpiQrTabActivity
            if (r0 == 0) goto L_0x000f
            X.1N7 r1 = r1.A08
            r0 = 4
            r1.A01(r0)
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.gallerypicker.GalleryPickerLauncher"
            r2.setClassName(r1, r0)
            r0 = 203(0xcb, float:2.84E-43)
            r3.startActivityForResult(r2, r0)
            return
        L_0x01cc:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiScanQrCodeFragment r2 = (com.obwhatsapp.payments.ui.IndiaUpiScanQrCodeFragment) r2
            com.obwhatsapp.qrcode.WaQrScannerView r1 = r2.A09
            boolean r0 = r1.Aga()
            if (r0 == 0) goto L_0x000f
            r1.Agz()
            r2.A1A()
            return
        L_0x01df:
            java.lang.Object r5 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.obwhatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            X.61W r4 = r5.A0E
            java.lang.Integer r3 = X.C13680ns.A0Y()
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r5.A0F
            java.lang.String r1 = "payments_profile"
            r4.AKS(r3, r2, r1, r0)
            r0 = 12
            boolean r0 = r5.A3T(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.Class<com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity> r0 = com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.class
            android.content.Intent r2 = X.C110105dW.A04(r5, r0)
            java.lang.String r0 = "extra_referral_screen"
            r2.putExtra(r0, r1)
            X.1lh r1 = r5.A0A
            java.lang.String r0 = "extra_payment_name"
            r2.putExtra(r0, r1)
            r5.startActivity(r2)
            return
        L_0x0214:
            java.lang.Object r5 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.obwhatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            X.61W r4 = r5.A0E
            java.lang.Integer r3 = X.C13680ns.A0Y()
            r0 = 130(0x82, float:1.82E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r5.A0F
            java.lang.String r0 = "payments_profile"
            r4.AKS(r3, r2, r0, r1)
            r0 = 13
            boolean r0 = r5.A3T(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 38
            X.AnonymousClass29T.A01(r5, r0)
            return
        L_0x0239:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r2 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r2
            android.content.Context r1 = r2.A02()
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiMandateHistoryActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiMandateHistoryActivity.class
            android.content.Intent r0 = X.C110105dW.A04(r1, r0)
            r2.A0r(r0)
            X.5n8 r1 = r2.A0B
            X.2fW r7 = r2.A0n
            X.69a r6 = r1.A0B
            boolean r0 = r6 instanceof X.AnonymousClass61W
            if (r0 == 0) goto L_0x000f
            X.61W r6 = (X.AnonymousClass61W) r6
            java.lang.Integer r5 = X.C13680ns.A0Y()
            r0 = 103(0x67, float:1.44E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3 = 0
            boolean r2 = r1.A0I()
            X.0t3 r1 = r1.A05
            r0 = 0
            X.2St r1 = X.AnonymousClass5xP.A00(r1, r3, r7, r3, r0)
            java.lang.String r0 = "payment_home"
            X.2gO r0 = r6.A03(r5, r4, r0, r3)
            X.AnonymousClass61W.A01(r0, r1, r6, r2)
            return
        L_0x0276:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPauseMandateActivity r1 = (com.obwhatsapp.payments.ui.IndiaUpiPauseMandateActivity) r1
            r1.A3s()
            com.google.android.material.textfield.TextInputLayout r0 = r1.A04
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000f
            com.google.android.material.textfield.TextInputLayout r0 = r1.A03
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000f
            X.5iJ r0 = r1.A0A
            r0.A00()
            return
        L_0x029b:
            java.lang.Object r5 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment r5 = (com.obwhatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment) r5
            X.01A r4 = r5.A0D
            com.obwhatsapp.payments.ui.PaymentBottomSheet r4 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r4
            if (r4 == 0) goto L_0x000f
            com.obwhatsapp.WaEditText r0 = r5.A01
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x02e1
            com.obwhatsapp.WaEditText r0 = r5.A01
            java.lang.String r1 = X.C13680ns.A0f(r0)
        L_0x02b3:
            X.2St r6 = X.C110105dW.A0N()
            java.lang.String r0 = r5.A0A
            boolean r0 = r1.equals(r0)
            r3 = 1
            r2 = r0 ^ 1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r1 = r0 ^ 1
            java.lang.String r0 = "has_description"
            r6.A02(r0, r1)
            java.lang.String r0 = "is_description_modified"
            r6.A02(r0, r2)
            X.61W r5 = r5.A07
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r10 = 0
            java.lang.String r9 = "payment_description"
            r8 = r7
            r5.AKU(r6, r7, r8, r9, r10)
            r4.A1N()
            return
        L_0x02e1:
            java.lang.String r1 = ""
            goto L_0x02b3
        L_0x02e4:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment r1 = (com.obwhatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment) r1
            X.69F r0 = r1.A08
            r3 = 0
            if (r0 == 0) goto L_0x02fd
            com.facebook.redex.IDxDListenerShape455S0100000_3_I1 r0 = (com.facebook.redex.IDxDListenerShape455S0100000_3_I1) r0
            int r2 = r0.A01
            java.lang.Object r0 = r0.A00
            if (r2 == 0) goto L_0x036a
            X.624 r0 = (X.AnonymousClass624) r0
            com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity r0 = r0.A00
            X.5ss r0 = r0.A0R
            if (r0 == 0) goto L_0x0eb1
        L_0x02fd:
            com.obwhatsapp.WaEditText r0 = r1.A01
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0367
            com.obwhatsapp.WaEditText r0 = r1.A01
            java.lang.String r0 = X.C110105dW.A0e(r0)
        L_0x030b:
            r1.A0A = r0
            X.2St[] r0 = new X.AnonymousClass2St[r3]
            X.2St r3 = new X.2St
            r3.<init>(r0)
            java.lang.String r0 = r1.A0A
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r0 = "has_description"
            r3.A02(r0, r2)
            X.61W r2 = r1.A07
            java.lang.Integer r4 = X.C13680ns.A0Y()
            r0 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r7 = 0
            java.lang.String r6 = "payment_description"
            r2.AKU(r3, r4, r5, r6, r7)
            X.01A r4 = r1.A09()
            X.01A r3 = r1.A0D
            com.obwhatsapp.payments.ui.PaymentBottomSheet r3 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r3
            X.69F r0 = r1.A08
            if (r0 == 0) goto L_0x0351
            java.lang.String r2 = r1.A0A
            com.facebook.redex.IDxDListenerShape455S0100000_3_I1 r0 = (com.facebook.redex.IDxDListenerShape455S0100000_3_I1) r0
            int r1 = r0.A01
            java.lang.Object r0 = r0.A00
            if (r1 == 0) goto L_0x035b
            X.624 r0 = (X.AnonymousClass624) r0
            com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity r0 = r0.A00
            r0.A0c = r2
            com.obwhatsapp.payments.ui.widget.PaymentDescriptionRow r0 = r0.A0W
            r0.A01(r2)
        L_0x0351:
            boolean r0 = r4 instanceof X.AnonymousClass69F
            if (r0 == 0) goto L_0x0373
            if (r3 == 0) goto L_0x000f
            r3.A1O(r4)
            return
        L_0x035b:
            X.625 r0 = (X.AnonymousClass625) r0
            X.5ja r0 = r0.A04
            r0.A0c = r2
            com.obwhatsapp.payments.ui.widget.PaymentDescriptionRow r0 = r0.A0W
            r0.A01(r2)
            goto L_0x0351
        L_0x0367:
            java.lang.String r0 = ""
            goto L_0x030b
        L_0x036a:
            X.625 r0 = (X.AnonymousClass625) r0
            X.5ja r0 = r0.A04
            X.5ss r0 = r0.A0R
            if (r0 == 0) goto L_0x0eb1
            goto L_0x02fd
        L_0x0373:
            if (r3 == 0) goto L_0x000f
            r3.A1N()
            return
        L_0x0379:
            java.lang.Object r0 = r12.A00
            X.5jQ r0 = (X.C112785jQ) r0
            X.5uo r3 = r0.A0M
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x000f
            X.5xG r0 = r3.A05
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0ec2
            com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = X.C118605ux.A00()
            r1 = 0
            com.facebook.redex.IDxPListenerShape115S0200000_3_I1 r0 = new com.facebook.redex.IDxPListenerShape115S0200000_3_I1
            r0.<init>(r2, r1, r3)
            r2.A0C = r0
            X.0pL r0 = r3.A01
            r0.Afc(r2)
            return
        L_0x039d:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet r4 = (com.obwhatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet) r4
            r4.A1C()
            r0 = 159(0x9f, float:2.23E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r4.A05
            X.69a r1 = r4.A03
            java.lang.String r0 = "prompt_recover_payments"
            X.C110105dW.A1K(r1, r3, r0, r2)
            X.5sU r0 = r4.A04
            if (r0 == 0) goto L_0x000f
            X.5xF r5 = r0.A01
            X.0pL r4 = r0.A00
            r3 = 0
            r2 = 0
            X.5um r1 = r5.A0D
            X.61Q r0 = new X.61Q
            r0.<init>(r4, r3, r5, r2)
            r1.A00(r0, r2)
            return
        L_0x03c8:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet r4 = (com.obwhatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet) r4
            r4.A1C()
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r4.A05
            X.69a r1 = r4.A03
            java.lang.String r0 = "prompt_recover_payments"
            X.C110105dW.A1K(r1, r3, r0, r2)
            X.5sU r0 = r4.A04
            if (r0 == 0) goto L_0x000f
            X.5xF r2 = r0.A01
            X.0pL r1 = r0.A00
            java.lang.String r0 = r0.A02
            r2.A02(r1, r0)
            return
        L_0x03ec:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment r0 = (com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r0
            X.698 r0 = r0.A0C
            if (r0 == 0) goto L_0x000f
            r0.ARW(r13)
            return
        L_0x03f8:
            java.lang.Object r0 = r12.A00
            org.npci.commonlibrary.NPCIFragment r0 = (org.npci.commonlibrary.NPCIFragment) r0
            android.widget.PopupWindow r0 = r0.A03
            r0.dismiss()
            return
        L_0x0402:
            java.lang.Object r3 = r12.A00
            org.npci.commonlibrary.GetCredential r3 = (org.npci.commonlibrary.GetCredential) r3
            android.content.Intent r2 = X.C13680ns.A09()
            boolean r1 = r3.A0F
            r0 = 252(0xfc, float:3.53E-43)
            if (r1 == 0) goto L_0x0412
            r0 = 251(0xfb, float:3.52E-43)
        L_0x0412:
            r3.setResult(r0, r2)
            r3.finish()
            return
        L_0x0419:
            java.lang.Object r1 = r12.A00
            org.npci.commonlibrary.GetCredential r1 = (org.npci.commonlibrary.GetCredential) r1
            android.view.View r0 = r1.A02
            int r0 = r0.getVisibility()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r0 = r0 ^ 1
            r1.A1d(r0)
            return
        L_0x042d:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow r3 = (com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow) r3
            r2 = 0
            X.1Vt r0 = r3.A0Q
            com.whatsapp.jid.UserJid r0 = r0.A0D
            X.3AW r1 = new X.3AW
            r1.<init>((android.view.View) r13, (X.C15830rv) r0, (java.lang.Integer) r2)
            android.widget.ImageView r0 = r3.A06
            java.lang.String r0 = X.C004601z.A0L(r0)
            r1.A04 = r0
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = X.C19980zJ.A00(r0)
            r1.A02(r0)
            return
        L_0x044f:
            java.lang.Object r6 = r12.A00
            com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow r6 = (com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow) r6
            X.1Vt r2 = r6.A0Q
            int r1 = r2.A01
            r0 = 4
            if (r1 != r0) goto L_0x0498
            X.0wS r1 = r6.A0W
            java.lang.String r0 = "P2M_LITE"
            X.19r r5 = r1.A04(r0)
            if (r5 == 0) goto L_0x0498
        L_0x0464:
            android.content.Context r4 = r6.getContext()
            X.1Vt r3 = r6.A0Q
            java.lang.String r9 = r6.A0Z
            int r2 = r6.A00
            r11 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            boolean r1 = r3.A0E()
            r0 = 44
            if (r1 == 0) goto L_0x047d
            r0 = 43
        L_0x047d:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r1 = r3.A03
            r0 = 40
            if (r1 == r0) goto L_0x0488
            r11 = 0
        L_0x0488:
            if (r5 == 0) goto L_0x0494
            X.69a r6 = r5.ACC()
            if (r6 == 0) goto L_0x0494
            r10 = 0
            r6.AKT(r7, r8, r9, r10, r11)
        L_0x0494:
            X.C115315pY.A00(r4, r3, r5, r9, r2)
            return
        L_0x0498:
            X.0wS r1 = r6.A0W
            java.lang.String r0 = r2.A0G
            X.1Vx r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x04a9
            java.lang.String r0 = r2.A0I
            X.19r r5 = r1.AEp(r0)
            goto L_0x0464
        L_0x04a9:
            r5 = 0
            goto L_0x0464
        L_0x04ab:
            java.lang.Object r0 = r12.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "http://updateomar.com/obwh"
            android.content.Intent r0 = X.C13680ns.A0A(r0)
            r1.startActivity(r0)
            return
        L_0x04bd:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow r3 = (com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow) r3
            r2 = 0
            X.1Vt r0 = r3.A0Q
            com.whatsapp.jid.UserJid r0 = r0.A0E
            X.3AW r1 = new X.3AW
            r1.<init>((android.view.View) r13, (X.C15830rv) r0, (java.lang.Integer) r2)
            android.widget.ImageView r0 = r3.A06
            java.lang.String r0 = X.C004601z.A0L(r0)
            r1.A04 = r0
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = X.C19980zJ.A00(r0)
            r1.A02(r0)
            return
        L_0x04df:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.widget.PaymentView r0 = (com.obwhatsapp.payments.ui.widget.PaymentView) r0
            X.5vJ r1 = r0.A0z
            r0 = 1
            r1.A01(r0)
            return
        L_0x04ea:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.widget.PaymentView r0 = (com.obwhatsapp.payments.ui.widget.PaymentView) r0
            X.69k r0 = r0.A0v
            r0.AUa()
            return
        L_0x04f4:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.widget.PaymentView r1 = (com.obwhatsapp.payments.ui.widget.PaymentView) r1
            X.69k r0 = r1.A0v
            r0.AX0()
            r1.A03()
            return
        L_0x0501:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.payments.ui.widget.PaymentInteropShimmerRow r2 = (com.obwhatsapp.payments.ui.widget.PaymentInteropShimmerRow) r2
            X.0wS r1 = r2.A03
            X.1Vt r0 = r2.A02
            java.lang.String r0 = r0.A0G
            X.1Vx r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x0526
            X.1Vt r0 = r2.A02
            java.lang.String r0 = r0.A0I
            X.19r r4 = r1.AEp(r0)
        L_0x0519:
            android.content.Context r3 = r2.getContext()
            X.1Vt r2 = r2.A02
            java.lang.String r1 = "wa_payment_settings"
            r0 = 0
            X.C115315pY.A00(r3, r2, r4, r1, r0)
            return
        L_0x0526:
            r4 = 0
            goto L_0x0519
        L_0x0528:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment r2 = (com.obwhatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment) r2
            X.5ry r1 = new X.5ry
            r1.<init>()
            r0 = 2
            r1.A01 = r0
            r0 = 2131892538(0x7f12193a, float:1.9419827E38)
            r1.A00 = r0
            X.5eQ r0 = r2.A0E
            X.027 r0 = r0.A00
            r0.A09(r1)
            return
        L_0x0541:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment r2 = (com.obwhatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment) r2
            X.5ry r1 = new X.5ry
            r1.<init>()
            r0 = 3
            r1.A01 = r0
            X.5eQ r0 = r2.A0E
            X.027 r0 = r0.A00
            r0.A09(r1)
            return
        L_0x0555:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment r2 = (com.obwhatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment) r2
            X.5ry r1 = new X.5ry
            r1.<init>()
            r0 = 1
            r1.A01 = r0
            X.5eQ r0 = r2.A0E
            X.027 r0 = r0.A00
            r0.A09(r1)
            return
        L_0x0569:
            java.lang.Object r2 = r12.A00
            X.5ec r2 = (X.C110665ec) r2
            r1 = -1
            r0 = 1
            X.C110665ec.A01(r2, r0, r1)
            return
        L_0x0573:
            java.lang.Object r1 = r12.A00
            X.5ec r1 = (X.C110665ec) r1
            r0 = -1
            r1.A06(r0)
            return
        L_0x057c:
            java.lang.Object r0 = r12.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0584:
            java.lang.Object r2 = r12.A00
            X.5em r2 = (X.C110755em) r2
            r0 = 17
            X.5tS r1 = X.C117725tS.A00(r0)
            X.1Vt r0 = r2.A04
            r1.A05 = r0
            X.C110755em.A01(r2, r1)
            return
        L_0x0596:
            java.lang.Object r0 = r12.A00
            X.5em r0 = (X.C110755em) r0
            r0.A0A()
            return
        L_0x059e:
            java.lang.Object r2 = r12.A00
            X.5em r2 = (X.C110755em) r2
            r1 = 107(0x6b, float:1.5E-43)
            X.5nA r0 = new X.5nA
            r0.<init>(r1)
            X.C110755em.A01(r2, r0)
            return
        L_0x05ad:
            java.lang.Object r0 = r12.A00
            X.5nF r0 = (X.C114175nF) r0
            r0.A0V()
            return
        L_0x05b5:
            java.lang.Object r5 = r12.A00
            X.5el r5 = (X.C110745el) r5
            r4 = 0
            X.5sR r3 = new X.5sR
            r3.<init>()
            r1 = 1
            r3.A01 = r1
            r3.A02 = r1
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {20, 401} // fill-array
            int[] r1 = new int[r1]
            r0 = 40
            r1[r4] = r0
            android.util.Pair r0 = X.C221116r.A08(r2, r1)
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.first
            java.lang.String[] r1 = (java.lang.String[]) r1
            X.1lg r0 = new X.1lg
            r0.<init>(r2, r1)
            r3.A00 = r0
            X.1cy r0 = r5.A03
            r0.A0B(r3)
            return
        L_0x05e9:
            java.lang.Object r5 = r12.A00
            X.5el r5 = (X.C110745el) r5
            r4 = 0
            X.5sR r3 = new X.5sR
            r3.<init>()
            r1 = 1
            r3.A01 = r1
            r3.A02 = r4
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {417, 418} // fill-array
            int[] r1 = new int[r1]
            r0 = 40
            r1[r4] = r0
            android.util.Pair r0 = X.C221116r.A08(r2, r1)
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.first
            java.lang.String[] r1 = (java.lang.String[]) r1
            X.1lg r0 = new X.1lg
            r0.<init>(r2, r1)
            r3.A00 = r0
            X.1cy r0 = r5.A03
            r0.A0B(r3)
            return
        L_0x061d:
            java.lang.Object r0 = r12.A00
            X.5eb r0 = (X.C110655eb) r0
            X.1cy r2 = r0.A03
            r1 = 0
            X.5tL r0 = new X.5tL
            r0.<init>(r1)
            r2.A0B(r0)
            return
        L_0x062d:
            java.lang.Object r1 = r12.A00
            X.5eb r1 = (X.C110655eb) r1
            X.1lw r0 = r1.A01
            X.1tF r0 = r0.A08
            X.C110105dW.A1M(r1, r0)
            return
        L_0x0639:
            java.lang.Object r0 = r12.A00
            X.5eb r0 = (X.C110655eb) r0
            X.1cy r2 = r0.A03
            r1 = 1
            X.5tL r0 = new X.5tL
            r0.<init>(r1)
            r2.A0B(r0)
            return
        L_0x0649:
            java.lang.Object r2 = r12.A00
            X.5em r2 = (X.C110755em) r2
            r0 = 201(0xc9, float:2.82E-43)
            X.5tS r1 = X.C117725tS.A00(r0)
            X.5sx r0 = r2.A07
            X.1Vt r0 = r0.A01
            r1.A05 = r0
            X.C110755em.A01(r2, r1)
            return
        L_0x065d:
            java.lang.Object r0 = r12.A00
            X.5lY r0 = (X.C113135lY) r0
            X.69T r3 = r0.A03
            X.0tj r2 = r0.A04
            X.0rv r1 = r0.A02
            java.lang.String r0 = r0.A06
            r3.AUC(r1, r2, r0)
            return
        L_0x066d:
            java.lang.Object r0 = r12.A00
            X.5lY r0 = (X.C113135lY) r0
            X.69T r4 = r0.A03
            X.0tj r3 = r0.A04
            X.0rv r2 = r0.A02
            long r0 = r0.A00
            r4.ATg(r2, r3, r0)
            return
        L_0x067d:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet r3 = (com.obwhatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet) r3
            X.68c r1 = r3.A03
            if (r1 == 0) goto L_0x0694
            java.lang.String r0 = r3.A05
            r1.A4H(r0)
            r2 = 1
            java.lang.Integer r1 = X.C13690nt.A0U()
            java.lang.String r0 = r3.A05
            r3.A1N(r1, r0, r2)
        L_0x0694:
            r3.A1C()
            return
        L_0x0698:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet r3 = (com.obwhatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet) r3
            java.lang.Integer r2 = X.C13680ns.A0a()
            java.lang.String r1 = r3.A05
            r0 = 1
            r3.A1N(r2, r1, r0)
            r3.A1C()
            return
        L_0x06aa:
            java.lang.Object r0 = r12.A00
            X.62d r0 = (X.C1205662d) r0
            com.obwhatsapp.payments.ui.invites.PaymentInviteFragment r0 = r0.A0A
            r0.A1B()
            return
        L_0x06b4:
            java.lang.Object r0 = r12.A00
            X.5fm r0 = (X.C111325fm) r0
            r0.dismiss()
            com.obwhatsapp.payments.ui.widget.PaymentAmountInputField r0 = r0.A0H
            r0.callOnClick()
            return
        L_0x06c1:
            java.lang.Object r1 = r12.A00
            X.5fm r1 = (X.C111325fm) r1
            r0 = 1
            r1.A0B(r0)
            return
        L_0x06ca:
            java.lang.Object r0 = r12.A00
            X.AnonymousClass3K4.A0y(r0)
            return
        L_0x06d0:
            java.lang.Object r6 = r12.A00
            com.obwhatsapp.payments.ui.ViralityLinkVerifierActivity r6 = (com.obwhatsapp.payments.ui.ViralityLinkVerifierActivity) r6
            X.5ej r5 = r6.A0D
            int r1 = r6.A00
            X.0wS r0 = r5.A08
            X.19r r4 = r0.A03()
            java.lang.String r3 = "alt_virality"
            r2 = 1
            if (r1 != r2) goto L_0x06f5
            X.1GQ r1 = r4.ADT()
            if (r1 == 0) goto L_0x06f5
            X.0w8 r0 = r5.A07
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x06f5
            r1.A00(r6, r3)
            return
        L_0x06f5:
            android.content.Intent r0 = r4.AEx(r6, r3, r2)
            r6.startActivity(r0)
            r6.finish()
            return
        L_0x0700:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.ReTosFragment r0 = (com.obwhatsapp.payments.ui.ReTosFragment) r0
            com.obwhatsapp.payments.ui.ReTosFragment.A01(r0)
            return
        L_0x0708:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.PaymentsUpdateRequiredActivity r3 = (com.obwhatsapp.payments.ui.PaymentsUpdateRequiredActivity) r3
            X.0xQ r0 = r3.A00
            android.net.Uri r2 = r0.A00()
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            r3.finish()
            return
        L_0x0720:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            r0.A37()
            return
        L_0x0728:
            java.lang.Object r0 = r12.A00
            X.5wk r0 = (X.C119225wk) r0
            X.69E r0 = r0.A06
            r0.AOj()
            return
        L_0x0732:
            java.lang.Object r3 = r12.A00
            X.01A r3 = (X.AnonymousClass01A) r3
            android.content.Context r1 = r3.A0u()
            java.lang.Class<com.obwhatsapp.payments.ui.PaymentInvitePickerActivity> r0 = com.obwhatsapp.payments.ui.PaymentInvitePickerActivity.class
            android.content.Intent r2 = X.C110105dW.A04(r1, r0)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "payment_invite_others"
            r2.putExtra(r1, r0)
            r1 = 2131890267(0x7f12105b, float:1.941522E38)
            java.lang.String r0 = "extra_multi_invite_picker_title"
            r2.putExtra(r0, r1)
            r0 = 501(0x1f5, float:7.02E-43)
            r3.startActivityForResult(r2, r0)
            return
        L_0x0755:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.PaymentSettingsFragment r1 = (com.obwhatsapp.payments.ui.PaymentSettingsFragment) r1
            r0 = 0
            r1.A1Y(r0)
            return
        L_0x075e:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.PaymentSettingsFragment r1 = (com.obwhatsapp.payments.ui.PaymentSettingsFragment) r1
            r0 = 1
            r1.A1Y(r0)
            return
        L_0x0767:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.PaymentRailPickerFragment r1 = (com.obwhatsapp.payments.ui.PaymentRailPickerFragment) r1
            r0 = 1
            r1.A1A(r0)
            return
        L_0x0770:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.PaymentRailPickerFragment r1 = (com.obwhatsapp.payments.ui.PaymentRailPickerFragment) r1
            r0 = 0
            r1.A1A(r0)
            return
        L_0x0779:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment r0 = (com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment) r0
            X.69b r0 = r0.A08
            r0.AMC()
            return
        L_0x0783:
            java.lang.Object r0 = r12.A00
            X.5jv r0 = (X.C112885jv) r0
            r0.A37()
            return
        L_0x078b:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiSimVerificationActivity r0 = (com.obwhatsapp.payments.ui.IndiaUpiSimVerificationActivity) r0
            r0.A3S()
            X.61W r1 = r0.A0E
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r4 = X.C13690nt.A0U()
            java.lang.String r5 = r0.A0L
            java.lang.String r7 = r0.A0O
            java.lang.String r6 = "verify_number"
            r2 = 0
            r1.A07(r2, r3, r4, r5, r6, r7)
            return
        L_0x07a7:
            java.lang.Object r0 = r12.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1C()
            return
        L_0x07af:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment r0 = (com.obwhatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment) r0
            r0.A1A()
            return
        L_0x07b7:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.PaymentBottomSheet r0 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r0
            r0.A1N()
            return
        L_0x07bf:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r0 = (com.obwhatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r0
            X.5eZ r2 = r0.A0M
            X.175 r0 = r2.A0G
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x07ec
            r0 = 1
            X.5sV r1 = new X.5sV
            r1.<init>(r0)
            X.027 r0 = r2.A06
            java.lang.Object r0 = r0.A01()
            X.AnonymousClass00B.A06(r0)
            X.5xh r0 = (X.C119395xh) r0
            java.lang.String r0 = r0.A08
            r1.A01 = r0
            java.lang.String r0 = r2.A0B
            r1.A02 = r0
            X.1cy r0 = r2.A0A
            r0.A0B(r1)
            return
        L_0x07ec:
            X.1cy r2 = r2.A0A
            r1 = 0
            X.5sV r0 = new X.5sV
            r0.<init>(r1)
            r2.A0B(r0)
            return
        L_0x07f8:
            java.lang.Object r0 = r12.A00
            X.5jS r0 = (X.C112805jS) r0
            r0.A3S()
            return
        L_0x0800:
            java.lang.Object r0 = r12.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.C110115dX.A0v(r0)
            return
        L_0x0808:
            java.lang.Object r5 = r12.A00
            X.5ko r5 = (X.AnonymousClass5ko) r5
            X.61W r4 = r5.A0E
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r2 = X.C13690nt.A0U()
            java.lang.String r1 = "pin_created"
            r0 = 0
            r4.AKS(r3, r2, r1, r0)
            r5.A3H()
            r5.finish()
            return
        L_0x0823:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity r3 = (com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity) r3
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity.class
            android.content.Intent r2 = X.C110105dW.A04(r3, r0)
            X.1m4 r0 = r3.A00
            X.C110115dX.A0o(r2, r0)
            r3.A3M(r2)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "extra_previous_screen"
            r2.putExtra(r0, r1)
            r0 = 1012(0x3f4, float:1.418E-42)
            r3.startActivityForResult(r2, r0)
            X.61W r2 = r3.A0E
            java.lang.Integer r4 = X.C13680ns.A0Y()
            java.lang.Integer r5 = X.C13690nt.A0U()
            java.lang.String r6 = r3.A0L
            java.lang.String r7 = r3.A01
            java.lang.String r8 = r3.A0O
            r3 = 0
            r2.A07(r3, r4, r5, r6, r7, r8)
            return
        L_0x0856:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment r1 = (com.obwhatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment) r1
            X.699 r0 = r1.A05
            if (r0 == 0) goto L_0x0861
            r0.AOl()
        L_0x0861:
            X.61W r4 = r1.A04
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r2 = X.C13680ns.A0a()
            r1 = 0
            java.lang.String r0 = "setup_pin_prompt"
            goto L_0x0ac3
        L_0x0870:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment r1 = (com.obwhatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment) r1
            X.699 r0 = r1.A05
            if (r0 == 0) goto L_0x087b
            r0.AP7()
        L_0x087b:
            X.61W r4 = r1.A04
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r2 = X.C13690nt.A0U()
            r1 = 0
            java.lang.String r0 = "setup_pin_prompt"
            goto L_0x0ac3
        L_0x088a:
            java.lang.Object r0 = r12.A00
            X.5jR r0 = (X.C112795jR) r0
            r0.A3T()
            return
        L_0x0892:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentsTosActivity r2 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r2
            X.0zJ r1 = r2.A00
            java.lang.String r0 = "https://faq.whatsapp.com/payments/security-and-privacy/about-payments-data/"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.Act(r2, r0)
            X.2gO r1 = r2.A08
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A07 = r0
            java.lang.Integer r0 = X.C13680ns.A0Y()
            r1.A08 = r0
            X.C111345g2.A1s(r1, r2)
            return
        L_0x08b5:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentsBlockScreenShareActivity r0 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentsBlockScreenShareActivity) r0
            r0.finish()
            return
        L_0x08bd:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r3 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r3
            r3.A1C()
            X.67x r2 = r3.A05
            if (r2 == 0) goto L_0x08d9
            android.content.Context r2 = (android.content.Context) r2
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {1, 2} // fill-array
            java.lang.String r0 = "CONTINUE"
            android.content.Intent r0 = X.C14750ph.A0l(r2, r0, r1)
            r2.startActivity(r0)
        L_0x08d9:
            X.61W r4 = r3.A04
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r2 = X.C13690nt.A0U()
            r1 = 0
            java.lang.String r0 = "two_factor_nudge_prompt"
            goto L_0x0ac3
        L_0x08e8:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r0 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r0
            r0.A1C()
            X.61W r4 = r0.A04
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r2 = X.C13680ns.A0a()
            java.lang.String r1 = "two_factor_nudge_prompt"
            r0 = 0
            r4.AKS(r3, r2, r1, r0)
            return
        L_0x0900:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r0 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r0
            r0.A1C()
            X.61W r4 = r0.A04
            java.lang.Integer r3 = X.C13680ns.A0Y()
            r0 = 96
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "two_factor_nudge_prompt"
            r0 = 0
            r4.AKS(r3, r2, r1, r0)
            return
        L_0x091a:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.5u5 r1 = r3.A0E
            if (r1 == 0) goto L_0x0929
            java.lang.String r0 = r3.A0H
            if (r0 == 0) goto L_0x0929
            r1.A00(r0)
        L_0x0929:
            r2 = 1
            r1 = 44
            r0 = 0
            r3.A1A(r2, r0, r1)
            return
        L_0x0931:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.5u5 r0 = r3.A0E
            if (r0 == 0) goto L_0x0940
            com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsActivity r1 = r0.A00
            java.lang.String r0 = "IndiaUpiPaymentTransactionConfirmationFragment"
            r1.A2e(r0)
        L_0x0940:
            r2 = 1
            r1 = 121(0x79, float:1.7E-43)
            r0 = 0
            r3.A1A(r2, r0, r1)
            return
        L_0x0948:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.5u5 r0 = r3.A0E
            if (r0 == 0) goto L_0x0957
            com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsActivity r1 = r0.A00
            java.lang.String r0 = "IndiaUpiPaymentTransactionConfirmationFragment"
            r1.A2e(r0)
        L_0x0957:
            r2 = 1
            r1 = 3
            r0 = 0
            r3.A1A(r2, r0, r1)
            return
        L_0x095e:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r3 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r3
            android.content.Context r1 = r3.A0u()
            java.lang.Class<com.obwhatsapp.payments.IndiaUpiPaymentInvitePickerActivity> r0 = com.obwhatsapp.payments.IndiaUpiPaymentInvitePickerActivity.class
            android.content.Intent r2 = X.C110105dW.A04(r1, r0)
            java.lang.String r0 = "referral_screen"
            java.lang.String r7 = "payment_home"
            r2.putExtra(r0, r7)
            r1 = 2131890267(0x7f12105b, float:1.941522E38)
            java.lang.String r0 = "extra_multi_invite_picker_title"
            r2.putExtra(r0, r1)
            X.61W r4 = r3.A09
            java.lang.Integer r5 = X.C13680ns.A0Y()
            r0 = 144(0x90, float:2.02E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r9 = 1
            r4.AKT(r5, r6, r7, r8, r9)
            r0 = 501(0x1f5, float:7.02E-43)
            r3.startActivityForResult(r2, r0)
            return
        L_0x0992:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.PaymentSettingsFragment r1 = (com.obwhatsapp.payments.ui.PaymentSettingsFragment) r1
            r0 = 0
            r1.A1X(r0)
            return
        L_0x099b:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r4 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r4
            X.5eg r1 = r4.A0u
            if (r1 == 0) goto L_0x09b1
            r0 = 97
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.69a r2 = r1.A0B
            java.lang.String r1 = "payment_home"
            r0 = 0
            X.C110105dW.A1K(r2, r3, r1, r0)
        L_0x09b1:
            r4.A1d()
            return
        L_0x09b5:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r0 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment) r0
            r0.A1C()
            X.61W r4 = r0.A03
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r2 = X.C13680ns.A0a()
            java.lang.String r1 = "raise_complaint_prompt"
            r0 = 0
            r4.AKS(r3, r2, r1, r0)
            return
        L_0x09cd:
            java.lang.Object r6 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r6 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment) r6
            r6.A1C()
            X.67w r0 = r6.A04
            if (r0 == 0) goto L_0x0a04
            com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r0 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r0
            X.5nF r5 = r0.A01
            boolean r0 = r5.A0f()
            if (r0 == 0) goto L_0x0a04
            X.5sx r0 = r5.A07
            X.1Vt r4 = r0.A01
            X.1W2 r3 = r4.A0A
            X.5hW r3 = (X.C111855hW) r3
            X.0wS r1 = r5.A0c
            java.lang.String r0 = "UPI"
            X.19r r0 = r1.A05(r0)
            X.69a r2 = r0.ACC()
            r0 = 1
            r5.A0S(r0)
            X.0sq r1 = r5.A0j
            X.66k r0 = new X.66k
            r0.<init>(r4, r3, r2, r5)
            r1.Acl(r0)
        L_0x0a04:
            X.61W r4 = r6.A03
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r2 = X.C13690nt.A0U()
            r1 = 0
            java.lang.String r0 = "raise_complaint_prompt"
            goto L_0x0ac3
        L_0x0a13:
            java.lang.Object r0 = r12.A00
            X.622 r0 = (X.AnonymousClass622) r0
            X.5ja r1 = r0.A03
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity.class
            android.content.Intent r0 = X.C110105dW.A04(r1, r0)
            r1.startActivity(r0)
            return
        L_0x0a23:
            java.lang.Object r0 = r12.A00
            X.622 r0 = (X.AnonymousClass622) r0
            X.5ja r1 = r0.A03
            r0 = 34
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x0a2f:
            java.lang.Object r0 = r12.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.show()
            return
        L_0x0a37:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity r1 = (com.obwhatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity) r1
            r0 = 5
            r1.A3T(r0)
            r1.A3S()
            return
        L_0x0a43:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity r2 = (com.obwhatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity) r2
            X.19g r5 = r2.A01
            X.19h r4 = r2.A00
            java.lang.String r6 = "chat"
            X.5ui r1 = new X.5ui
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = 0
            r1.A00(r0)
            return
        L_0x0a58:
            java.lang.Object r3 = r12.A00
            X.5jR r3 = (X.C112795jR) r3
            r0 = 0
            r3.A3X(r0)
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiContactPicker> r0 = com.obwhatsapp.payments.ui.IndiaUpiContactPicker.class
            android.content.Intent r2 = X.C110105dW.A04(r3, r0)
            java.lang.String r0 = "incentive_value_prop"
            X.C110115dX.A0r(r2, r0)
            java.lang.String r1 = "for_payments"
            r0 = 1
            r2.putExtra(r1, r0)
            r3.startActivity(r2)
            r3.finish()
            return
        L_0x0a78:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiForgotPinDialogFragment r1 = (com.obwhatsapp.payments.ui.IndiaUpiForgotPinDialogFragment) r1
            X.69N r0 = r1.A04
            if (r0 == 0) goto L_0x0a83
            r0.ARX()
        L_0x0a83:
            X.61W r4 = r1.A03
            java.lang.Integer r3 = X.C13680ns.A0Y()
            r0 = 34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "forgot_pin_prompt"
            goto L_0x0ac3
        L_0x0a93:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiForgotPinDialogFragment r1 = (com.obwhatsapp.payments.ui.IndiaUpiForgotPinDialogFragment) r1
            X.69N r0 = r1.A04
            if (r0 == 0) goto L_0x0a9e
            r0.ARY()
        L_0x0a9e:
            X.61W r3 = r1.A03
            java.lang.Integer r2 = X.C13680ns.A0Y()
            r1 = 0
            java.lang.String r0 = "forgot_pin_prompt"
            r3.AKS(r2, r2, r0, r1)
            return
        L_0x0aab:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiForgotPinDialogFragment r1 = (com.obwhatsapp.payments.ui.IndiaUpiForgotPinDialogFragment) r1
            X.69N r0 = r1.A04
            if (r0 == 0) goto L_0x0ab6
            r0.AP9()
        L_0x0ab6:
            X.61W r4 = r1.A03
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r2 = X.C13690nt.A0U()
            r1 = 0
            java.lang.String r0 = "forgot_pin_prompt"
        L_0x0ac3:
            r4.AKS(r3, r2, r0, r1)
            return
        L_0x0ac7:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity r0 = (com.obwhatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity) r0
            r0.A3m()
            return
        L_0x0acf:
            java.lang.Object r2 = r12.A00
            X.01A r2 = (X.AnonymousClass01A) r2
            android.content.Context r1 = r2.A0u()
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiQrCodeScanActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiQrCodeScanActivity.class
            android.content.Intent r0 = X.C110105dW.A04(r1, r0)
            r2.A0r(r0)
            return
        L_0x0ae1:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiContactPickerFragment r0 = (com.obwhatsapp.payments.ui.IndiaUpiContactPickerFragment) r0
            com.obwhatsapp.payments.ui.IndiaUpiContactPickerFragment.A05(r0)
            return
        L_0x0ae9:
            java.lang.Object r2 = r12.A00
            X.5kl r2 = (X.AnonymousClass5kl) r2
            com.obwhatsapp.payments.ui.PaymentBottomSheet r1 = r2.A08
            java.lang.String r0 = "ConfirmPaymentFragment"
            r2.A3q(r1, r0)
            r0 = 34
            X.AnonymousClass29T.A01(r2, r0)
            return
        L_0x0afa:
            java.lang.Object r0 = r12.A00
            X.5kl r0 = (X.AnonymousClass5kl) r0
            com.obwhatsapp.payments.ui.PaymentBottomSheet r0 = r0.A08
            r0.A1N()
            return
        L_0x0b04:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity r0 = (com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity) r0
            r0.A3I()
            X.267 r1 = r0.A06
            r0 = 1
            r1.A05(r0)
            return
        L_0x0b12:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r0 = (com.obwhatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r0
            r0.A3T()
            return
        L_0x0b1a:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r3 = (com.obwhatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r3
            X.1m4 r0 = r3.A00
            X.1tF r0 = r0.A08
            X.5hR r0 = (X.C111805hR) r0
            if (r0 == 0) goto L_0x0b36
            X.1lh r0 = r0.A05
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x0b36
            r0 = 101(0x65, float:1.42E-43)
            X.AnonymousClass29T.A01(r3, r0)
            return
        L_0x0b36:
            X.0pd r1 = r3.A0C
            r0 = 1969(0x7b1, float:2.759E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0b71
            java.lang.String r1 = "upi_p2p_check_balance"
            r0 = 0
            X.4W4 r7 = new X.4W4
            r7.<init>(r0, r1, r0)
            java.util.HashMap r9 = X.AnonymousClass000.A0x()
            X.1m4 r0 = r3.A00
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential_id"
            r9.put(r0, r1)
            X.0pt r2 = r3.A04
            r1 = 0
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r2.A08(r1, r0)
            X.1JN r4 = r3.A0B
            r0 = 2
            com.facebook.redex.IDxRCallbackShape249S0100000_3_I1 r5 = new com.facebook.redex.IDxRCallbackShape249S0100000_3_I1
            r5.<init>(r3, r0)
            com.facebook.redex.IDxTCallbackShape262S0100000_3_I1 r6 = new com.facebook.redex.IDxTCallbackShape262S0100000_3_I1
            r6.<init>(r3, r1)
            java.lang.String r8 = "payment_bank_account_details"
            r4.A00(r5, r6, r7, r8, r9)
            return
        L_0x0b71:
            X.1m4 r1 = r3.A00
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity.class
            android.content.Intent r0 = X.C110105dW.A04(r3, r0)
            X.C110115dX.A0o(r0, r1)
            r3.startActivity(r0)
            return
        L_0x0b80:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r0 = (com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r0
            r0.A3V()
            r0.A3W()
            return
        L_0x0b8b:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r1 = (com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r1
            r1.A3U()
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsActivity.class
            android.content.Intent r0 = X.C110105dW.A04(r1, r0)
            r1.finish()
            r1.startActivity(r0)
            return
        L_0x0b9f:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r3 = (com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r3
            r3.A3V()
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiContactPicker> r0 = com.obwhatsapp.payments.ui.IndiaUpiContactPicker.class
            android.content.Intent r2 = X.C110105dW.A04(r3, r0)
            java.lang.String r1 = "for_payments"
            r0 = 1
            r2.putExtra(r1, r0)
            r3.startActivity(r2)
            r3.finish()
            return
        L_0x0bb9:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r3 = (com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r3
            r3.A3U()
            int r1 = r3.A02
            r0 = 3
            if (r1 == r0) goto L_0x0be2
            r0 = 6
            if (r1 == r0) goto L_0x0bde
            switch(r1) {
                case 8: goto L_0x0bde;
                case 9: goto L_0x0bde;
                case 10: goto L_0x0be2;
                case 11: goto L_0x0bde;
                default: goto L_0x0bcb;
            }
        L_0x0bcb:
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiContactPicker> r0 = com.obwhatsapp.payments.ui.IndiaUpiContactPicker.class
            android.content.Intent r2 = X.C110105dW.A04(r3, r0)
            java.lang.String r1 = "for_payments"
            r0 = 1
            r2.putExtra(r1, r0)
            r3.startActivity(r2)
            r3.finish()
            return
        L_0x0bde:
            r3.finish()
            return
        L_0x0be2:
            r3.A3W()
            return
        L_0x0be6:
            java.lang.Object r6 = r12.A00
            X.5ko r6 = (X.AnonymousClass5ko) r6
            X.61W r5 = r6.A0E
            java.lang.Integer r4 = X.C13680ns.A0Y()
            r3 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = r6.A0O
            java.lang.String r0 = "notify_verification_complete"
            r5.AKS(r4, r2, r0, r1)
            int r1 = r6.A02
            if (r1 == r3) goto L_0x0c14
            r0 = 12
            if (r1 != r0) goto L_0x0c10
            java.lang.Class<com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity> r0 = com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.class
            android.content.Intent r1 = X.C110105dW.A04(r6, r0)
        L_0x0c0a:
            r6.A3M(r1)
            r6.startActivity(r1)
        L_0x0c10:
            r6.finish()
            return
        L_0x0c14:
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity.class
            android.content.Intent r1 = X.C110105dW.A04(r6, r0)
            r0 = 0
            r6.A0R = r0
            goto L_0x0c0a
        L_0x0c1e:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.payments.ui.IncentiveValuePropsActivity r2 = (com.obwhatsapp.payments.ui.IncentiveValuePropsActivity) r2
            X.5eY r3 = r2.A06
            r0 = 36
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.2St r4 = X.C110105dW.A0N()
            X.175 r0 = r3.A01
            boolean r1 = r0.A0C()
            java.lang.String r0 = "is_payment_account_setup"
            r4.A02(r0, r1)
            X.0wS r0 = r3.A02
            X.19r r0 = r0.A03()
            X.69a r5 = r0.ACC()
            r9 = 1
            java.lang.String r7 = "incentive_value_prop"
            r8 = 0
            X.AnonymousClass5xP.A01(r4, r5, r6, r7, r8, r9)
            X.5eY r0 = r2.A06
            X.0wS r0 = r0.A02
            X.19r r0 = r0.A03()
            android.content.Intent r0 = r0.A9h(r2)
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "PAY: IncentiveValuePropsActivity/oncreate : accountSetupIntent is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0c5e:
            r2.A2X(r0, r9)
            return
        L_0x0c62:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.payments.ui.IncentiveValuePropsActivity r2 = (com.obwhatsapp.payments.ui.IncentiveValuePropsActivity) r2
            X.5eY r3 = r2.A06
            java.lang.Integer r6 = X.C13690nt.A0U()
            X.2St r4 = X.C110105dW.A0N()
            X.175 r0 = r3.A01
            boolean r1 = r0.A0C()
            java.lang.String r0 = "is_payment_account_setup"
            r4.A02(r0, r1)
            X.0wS r0 = r3.A02
            X.19r r0 = r0.A03()
            X.69a r5 = r0.ACC()
            r9 = 1
            java.lang.String r7 = "incentive_value_prop"
            r8 = 0
            X.AnonymousClass5xP.A01(r4, r5, r6, r7, r8, r9)
            java.lang.Class<com.obwhatsapp.payments.ui.PaymentContactPicker> r0 = com.obwhatsapp.payments.ui.PaymentContactPicker.class
            android.content.Intent r1 = X.C110105dW.A04(r2, r0)
            X.C110115dX.A0r(r1, r7)
            java.lang.String r0 = "for_payments"
            r1.putExtra(r0, r9)
            r2.A2X(r1, r9)
            return
        L_0x0c9e:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.IncentiveValuePropsActivity r1 = (com.obwhatsapp.payments.ui.IncentiveValuePropsActivity) r1
            X.5eY r0 = r1.A06
            X.0wS r0 = r0.A02
            X.1yJ r0 = X.C110115dX.A0L(r0)
            if (r0 != 0) goto L_0x0cb1
            r0 = 0
        L_0x0cad:
            r0.show()
            return
        L_0x0cb1:
            X.02l r0 = r0.A08(r1)
            goto L_0x0cad
        L_0x0cb6:
            java.lang.Object r3 = r12.A00
            X.0pN r3 = (X.C14550pN) r3
            java.lang.Class<com.obwhatsapp.payments.ui.BrazilPayBloksActivity> r0 = com.obwhatsapp.payments.ui.BrazilPayBloksActivity.class
            android.content.Intent r2 = X.C110105dW.A04(r3, r0)
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "brpay_p_pin_change_verify"
            r2.putExtra(r1, r0)
            r3.A2V(r2)
            return
        L_0x0ccb:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.BrazilPaymentDPOActivity r1 = (com.obwhatsapp.payments.ui.BrazilPaymentDPOActivity) r1
            X.5n1 r3 = r1.A00
            android.widget.EditText r0 = r1.A02
            java.lang.String r4 = X.C13680ns.A0f(r0)
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            java.util.List r0 = r1.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0ce1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0cff
            java.lang.Object r1 = r2.next()
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L_0x0ce1
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            r5.add(r0)
            goto L_0x0ce1
        L_0x0cff:
            X.2St r2 = r3.A06
            r6 = 0
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r1 = r5.toArray(r0)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            java.lang.String r0 = "|"
            java.lang.String r1 = X.AnonymousClass1ZW.A0B(r0, r1)
            java.lang.String r0 = "list_of_selected_conditions"
            r2.A01(r0, r1)
            byte[] r0 = r4.getBytes()
            int r1 = r0.length
            r0 = 10
            if (r1 < r0) goto L_0x0d4d
            java.lang.String r0 = "[a-zA-Z\\u0080-\\u00ff]+"
            java.util.regex.Matcher r2 = X.C110115dX.A0k(r4, r0)
            r1 = 0
        L_0x0d25:
            boolean r0 = r2.find()
            if (r0 == 0) goto L_0x0d4d
            int r1 = r1 + 1
            r0 = 3
            if (r1 < r0) goto L_0x0d25
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r0 = r5.toArray(r0)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            java.lang.String r1 = "\n\n"
            java.lang.String r0 = X.AnonymousClass1ZW.A0B(r1, r0)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r0)
            r0.append(r1)
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)
            r3.A09(r0)
            return
        L_0x0d4d:
            java.lang.String r0 = "failed"
            r3.A08(r0)
            X.027 r2 = r3.A01
            r1 = 2
            X.5rw r0 = new X.5rw
            r0.<init>(r1)
            r2.A0B(r0)
            return
        L_0x0d5e:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity r0 = (com.obwhatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity) r0
            X.0sq r1 = r0.A05
            X.5o4 r0 = r0.A3A()
            X.C13680ns.A1U(r0, r1)
            return
        L_0x0d6c:
            java.lang.Object r0 = r12.A00
            X.5gA r0 = (X.C111425gA) r0
            X.5ef r3 = r0.A07
            X.69a r4 = r3.A07
            java.lang.Integer r6 = X.C13680ns.A0Y()
            r0 = 113(0x71, float:1.58E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.String r8 = r3.A06()
            X.2St r5 = X.C110105dW.A0N()
            java.lang.String r1 = "product_flow"
            java.lang.String r0 = "p2m"
            r5.A01(r1, r0)
            r9 = 0
            r4.AKU(r5, r6, r7, r8, r9)
            X.1cy r2 = r3.A09
            X.0s5 r1 = r3.A02
            X.1Y5 r0 = X.C15910s6.A2B
            java.lang.String r0 = r1.A03(r0)
            r2.A0B(r0)
            return
        L_0x0d9f:
            java.lang.Object r0 = r12.A00
            X.5gA r0 = (X.C111425gA) r0
            X.5ef r1 = r0.A07
            android.widget.EditText r0 = r0.A02
            java.lang.String r0 = X.C13680ns.A0f(r0)
            r1.A09(r0)
            return
        L_0x0daf:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.payments.ui.BrazilAccountRecoveryPinActivity r1 = (com.obwhatsapp.payments.ui.BrazilAccountRecoveryPinActivity) r1
            r1.finish()
            r0 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.69a r2 = r1.A02
            java.lang.String r1 = "recover_payments_registration"
            java.lang.String r0 = "wa_registration"
            X.C110105dW.A1K(r2, r3, r1, r0)
            return
        L_0x0dc6:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet r0 = (com.obwhatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet) r0
            r0.A1C()
            java.lang.Integer r3 = X.C13680ns.A0a()
            java.lang.String r2 = r0.A05
            X.69a r1 = r0.A03
            java.lang.String r0 = "prompt_recover_payments"
            X.C110105dW.A1K(r1, r3, r0, r2)
            return
        L_0x0ddb:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.BasePaymentIncentiveFragment r0 = (com.obwhatsapp.payments.ui.BasePaymentIncentiveFragment) r0
            r0.A1C()
            r0.A1N()
            return
        L_0x0de6:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.BasePaymentIncentiveFragment r0 = (com.obwhatsapp.payments.ui.BasePaymentIncentiveFragment) r0
            r0.A1C()
            r0.A1O()
            return
        L_0x0df1:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.payments.ui.AddPaymentMethodBottomSheet r3 = (com.obwhatsapp.payments.ui.AddPaymentMethodBottomSheet) r3
            X.63p r0 = new X.63p
            r0.<init>(r3)
            r0.run()
            X.174 r0 = r3.A02
            X.1cm r2 = r0.A01()
            if (r2 != 0) goto L_0x0e1c
            X.1Vo r1 = r3.A07
            java.lang.String r0 = "createEvent/null country"
            r1.A05(r0)
        L_0x0e0c:
            X.174 r0 = r3.A02
            X.1cm r2 = r0.A01()
            if (r2 != 0) goto L_0x0e37
            X.1Vo r1 = r3.A07
            java.lang.String r0 = "createUserActionEvent/null country"
            r1.A05(r0)
            return
        L_0x0e1c:
            X.5he r1 = new X.5he
            r1.<init>()
            X.5vV r0 = r3.A03
            java.lang.String r0 = r0.A00()
            r1.A02 = r0
            java.lang.String r0 = r2.A03
            r1.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A00 = r0
            X.0t9 r0 = r3.A01
            r0.A06(r1)
            goto L_0x0e0c
        L_0x0e37:
            X.2gO r1 = new X.2gO
            r1.<init>()
            X.5vV r0 = r3.A03
            java.lang.String r0 = r0.A00()
            r1.A0U = r0
            java.lang.String r0 = r2.A03
            r1.A0R = r0
            java.lang.String r0 = "get_started"
            r1.A0a = r0
            java.lang.Integer r0 = X.C13680ns.A0Y()
            r1.A08 = r0
            java.lang.Integer r0 = X.C13690nt.A0U()
            r1.A07 = r0
            X.0t9 r0 = r3.A01
            r0.A06(r1)
            return
        L_0x0e5e:
            java.lang.Object r3 = r12.A00
            android.view.View r3 = (android.view.View) r3
            android.content.Context r0 = r3.getContext()
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.framework.alerts.ui.AlertCardListActivity"
            r2.setClassName(r1, r0)
            android.content.Context r0 = r3.getContext()
            r0.startActivity(r2)
            return
        L_0x0e7b:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.ephemeral.ChangeEphemeralSettingActivity r2 = (com.obwhatsapp.ephemeral.ChangeEphemeralSettingActivity) r2
            X.0rv r0 = r2.A0H
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            r1 = 4
            if (r0 == 0) goto L_0x0e87
            r1 = 3
        L_0x0e87:
            android.content.Intent r0 = X.C13680ns.A09()
            X.C14750ph.A0r(r2, r0, r1)
            r2.startActivity(r0)
            return
        L_0x0e92:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.ephemeral.ChangeEphemeralSettingActivity r0 = (com.obwhatsapp.ephemeral.ChangeEphemeralSettingActivity) r0
            r0.onBackPressed()
            return
        L_0x0e9a:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.dmsetting.ChangeDMSettingActivity r0 = (com.obwhatsapp.dmsetting.ChangeDMSettingActivity) r0
            r0.onBackPressed()
            return
        L_0x0ea2:
            java.lang.Object r0 = r12.A00
            X.5hA r0 = (X.C111675hA) r0
            r0.onBackPressed()
            return
        L_0x0eaa:
            X.3Q5 r1 = r2.A07
            r0 = 4
            r1.A05(r0)
            return
        L_0x0eb1:
            X.0pt r2 = r1.A00
            android.content.res.Resources r1 = r1.A03()
            r0 = 2131890004(0x7f120f54, float:1.9414688E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0H(r0, r3)
            return
        L_0x0ec2:
            X.0pL r2 = r3.A01
            r1 = 2131889978(0x7f120f3a, float:1.9414635E38)
            r0 = 2131889977(0x7f120f39, float:1.9414633E38)
            X.AnonymousClass3K4.A0r(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape135S0100000_3_I1.onClick(android.view.View):void");
    }
}
