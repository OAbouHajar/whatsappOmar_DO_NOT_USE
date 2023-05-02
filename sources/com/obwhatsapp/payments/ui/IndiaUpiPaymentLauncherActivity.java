package com.obwhatsapp.payments.ui;

import X.AnonymousClass1Vo;
import X.AnonymousClass5ko;
import X.C110105dW;
import X.C111345g2;
import X.C1201560n;
import X.C1220167y;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import android.content.DialogInterface;

public class IndiaUpiPaymentLauncherActivity extends AnonymousClass5ko implements DialogInterface.OnDismissListener, C1220167y {
    public C1201560n A00;
    public boolean A01;
    public final AnonymousClass1Vo A02;

    public IndiaUpiPaymentLauncherActivity() {
        this(0);
        this.A02 = C110105dW.A0P("IndiaUpiPaymentLauncherActivity");
    }

    public IndiaUpiPaymentLauncherActivity(int i2) {
        this.A01 = false;
        C110105dW.A0t(this, 59);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (X.C13690nt.A0E(r15).getBoolean("intent_source") == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r10 = r15
            r0 = r16
            super.onCreate(r0)
            X.0w8 r1 = r15.A0O
            r0 = 0
            boolean r0 = r1.A0C(r0)
            r3 = 0
            if (r0 != 0) goto L_0x001b
            X.1Vo r1 = r15.A02
            java.lang.String r0 = "payment feature is not enabled."
            r1.A0A(r0, r3)
        L_0x0017:
            r15.finish()
            return
        L_0x001b:
            android.content.Intent r0 = r15.getIntent()
            if (r0 == 0) goto L_0x0017
            android.content.Intent r0 = r15.getIntent()
            android.net.Uri r0 = r0.getData()
            if (r0 == 0) goto L_0x0017
            android.content.Intent r0 = r15.getIntent()
            android.net.Uri r1 = r0.getData()
            android.os.Bundle r0 = X.C13690nt.A0E(r15)
            if (r0 == 0) goto L_0x0046
            android.os.Bundle r2 = X.C13690nt.A0E(r15)
            java.lang.String r0 = "intent_source"
            boolean r0 = r2.getBoolean(r0)
            r14 = 1
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            r14 = 0
        L_0x0047:
            X.1Vo r2 = r15.A02
            java.lang.String r0 = "received payment intent: isFromQrCode "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r14)
            X.C110105dW.A1L(r2, r0)
            if (r14 == 0) goto L_0x0096
            java.lang.String r2 = "SCANNED_QR_CODE"
            java.lang.String r13 = "payments_camera"
        L_0x005b:
            X.60V r7 = r15.A0C
            X.0s5 r5 = r15.A06
            X.61W r8 = r15.A0E
            X.0pd r6 = r15.A0C
            X.5xN r9 = r15.A0H
            X.60n r4 = new X.60n
            r4.<init>(r5, r6, r7, r8, r9)
            r15.A00 = r4
            X.5xh r11 = X.C119395xh.A00(r1, r2)
            if (r11 == 0) goto L_0x009b
            java.lang.String r4 = r1.toString()
            if (r4 == 0) goto L_0x009b
            java.lang.String r0 = "upi://mandate"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x009b
            X.0pd r4 = r15.A0C
            r0 = 2211(0x8a3, float:3.098E-42)
            boolean r0 = r4.A0C(r0)
            if (r0 == 0) goto L_0x009b
            X.5xN r9 = r15.A0H
            r0 = 1
            com.facebook.redex.IDxUCallbackShape448S0100000_3_I1 r12 = new com.facebook.redex.IDxUCallbackShape448S0100000_3_I1
            r12.<init>(r15, r0)
            r9.A07(r10, r11, r12, r13, r14)
            return
        L_0x0096:
            java.lang.String r2 = "DEEP_LINK"
            java.lang.String r13 = "deeplink"
            goto L_0x005b
        L_0x009b:
            if (r14 == 0) goto L_0x00ba
            X.0pd r4 = r15.A0C
            r0 = 1354(0x54a, float:1.897E-42)
            boolean r0 = r4.A0C(r0)
            if (r0 == 0) goto L_0x00ba
            X.60n r3 = r15.A00
            java.lang.String r6 = r1.toString()
            r0 = 0
            com.facebook.redex.IDxSCallbackShape456S0100000_3_I1 r5 = new com.facebook.redex.IDxSCallbackShape456S0100000_3_I1
            r5.<init>(r15, r0)
            r4 = r15
            r7 = r2
            r8 = r13
            r3.A00(r4, r5, r6, r7, r8)
            return
        L_0x00ba:
            java.lang.String r0 = r1.toString()
            com.obwhatsapp.payments.ui.PaymentBottomSheet r1 = new com.obwhatsapp.payments.ui.PaymentBottomSheet
            r1.<init>()
            r1.A00 = r15
            com.obwhatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r0 = com.obwhatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment.A01(r0, r2, r13)
            r1.A01 = r0
            r15.Afb(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiPaymentLauncherActivity.onCreate(android.os.Bundle):void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }
}
