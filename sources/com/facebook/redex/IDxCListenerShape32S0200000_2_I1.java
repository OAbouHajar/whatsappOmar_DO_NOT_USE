package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape32S0200000_2_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape32S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        r5.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0108, code lost:
        throw X.C18450wi.A03(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x0093;
                case 1: goto L_0x009f;
                case 2: goto L_0x0011;
                case 3: goto L_0x00ca;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A00
            com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity r1 = (com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity) r1
            java.lang.Object r0 = r14.A01
            android.content.Intent r0 = (android.content.Intent) r0
            com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.A02(r0, r1)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r3 = r14.A00
            com.obwhatsapp.payments.ui.ConfirmLegalNameBottomSheetFragment r3 = (com.obwhatsapp.payments.ui.ConfirmLegalNameBottomSheetFragment) r3
            java.lang.Object r5 = r14.A01
            com.obwhatsapp.payments.ui.PaymentBottomSheet r5 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r5
            r4 = 0
            r2 = 1
            X.C18450wi.A0H(r5, r2)
            X.00l r1 = r3.A0C()
            if (r1 != 0) goto L_0x008c
            r1 = 0
        L_0x0025:
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            if (r1 == 0) goto L_0x0034
            com.obwhatsapp.WaButton r0 = r3.A02
            if (r0 == 0) goto L_0x00ff
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r4)
        L_0x0034:
            r1 = 0
            java.lang.String r0 = "confirm_legal_name_in_progress_prompt"
            java.lang.String r12 = "enter_name"
            r3.A1B(r1, r0, r12, r4)
            r3.A1C(r4)
            com.obwhatsapp.WaEditText r0 = r3.A03
            if (r0 == 0) goto L_0x00fc
            r1 = 4
            r0.setVisibility(r1)
            com.obwhatsapp.TextEmojiLabel r0 = r3.A01
            if (r0 == 0) goto L_0x0102
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r3.A00
            if (r0 == 0) goto L_0x00f9
            r0.setVisibility(r4)
            X.4dM r1 = r3.A09
            if (r1 == 0) goto L_0x0010
            com.obwhatsapp.WaEditText r0 = r3.A03
            if (r0 == 0) goto L_0x00fc
            android.text.Editable r0 = r0.getText()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            X.C18450wi.A0H(r7, r2)
            com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity r3 = r1.A01
            java.lang.Integer r11 = X.C13690nt.A0U()
            java.lang.String r13 = r1.A05
            X.0ti r6 = r1.A03
            X.2St r8 = X.C49382Ss.A00()
            r9 = r3
            r10 = r6
            r9.A38(r8, r10, r11, r12, r13, 1)
            X.0sq r0 = r3.A05
            java.lang.String r8 = r1.A04
            com.obwhatsapp.payments.ui.ConfirmLegalNameBottomSheetFragment r2 = r1.A00
            com.obwhatsapp.payments.ui.PaymentBottomSheet r4 = r1.A02
            X.56P r1 = new X.56P
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.Acl(r1)
            return
        L_0x008c:
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r0)
            goto L_0x0025
        L_0x0093:
            java.lang.Object r1 = r14.A00
            X.2Ta r1 = (X.C49402Ta) r1
            java.lang.Object r0 = r14.A01
            com.obwhatsapp.payments.ui.BusinessHubActivity r0 = (com.obwhatsapp.payments.ui.BusinessHubActivity) r0
            com.obwhatsapp.payments.ui.BusinessHubActivity.A02(r1, r0)
            return
        L_0x009f:
            java.lang.Object r4 = r14.A00
            com.obwhatsapp.payments.ui.ConfirmDateOfBirthBottomSheetFragment r4 = (com.obwhatsapp.payments.ui.ConfirmDateOfBirthBottomSheetFragment) r4
            java.lang.Object r5 = r14.A01
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            android.widget.ProgressBar r0 = r4.A00
            if (r0 == 0) goto L_0x00f9
            int r0 = r0.getVisibility()
            r3 = 1
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.String r2 = "enter_dob"
            java.lang.Integer r1 = X.C13680ns.A0a()
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = "confirm_dob_in_progress_prompt"
            r4.A1C(r1, r0, r2, r3)
        L_0x00c1:
            if (r5 != 0) goto L_0x00ef
            return
        L_0x00c4:
            java.lang.String r0 = "confirm_legal_name_in_progress_prompt"
            r4.A1C(r1, r2, r0, r3)
            goto L_0x00c1
        L_0x00ca:
            java.lang.Object r4 = r14.A00
            com.obwhatsapp.payments.ui.ConfirmLegalNameBottomSheetFragment r4 = (com.obwhatsapp.payments.ui.ConfirmLegalNameBottomSheetFragment) r4
            java.lang.Object r5 = r14.A01
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            r3 = 1
            X.C18450wi.A0H(r5, r3)
            android.widget.ProgressBar r0 = r4.A00
            if (r0 == 0) goto L_0x00f9
            int r0 = r0.getVisibility()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.String r2 = "enter_name"
            java.lang.Integer r1 = X.C13680ns.A0a()
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = "confirm_legal_name_in_progress_prompt"
            r4.A1B(r1, r0, r2, r3)
        L_0x00ef:
            r5.A1C()
            return
        L_0x00f3:
            java.lang.String r0 = "order_details"
            r4.A1B(r1, r2, r0, r3)
            goto L_0x00ef
        L_0x00f9:
            java.lang.String r0 = "progressBar"
            goto L_0x0104
        L_0x00fc:
            java.lang.String r0 = "nameEditText"
            goto L_0x0104
        L_0x00ff:
            java.lang.String r0 = "continueButton"
            goto L_0x0104
        L_0x0102:
            java.lang.String r0 = "descText"
        L_0x0104:
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape32S0200000_2_I1.onClick(android.view.View):void");
    }
}
