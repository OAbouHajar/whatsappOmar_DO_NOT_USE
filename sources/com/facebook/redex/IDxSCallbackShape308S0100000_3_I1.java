package com.facebook.redex;

import X.AnonymousClass1N7;
import X.AnonymousClass2WW;
import X.C109465Sf;
import X.C119105vx;
import X.C1201560n;
import X.C14870pt;
import X.C86844Uj;
import android.os.Vibrator;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiQrCodeScanActivity;
import com.obwhatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.obwhatsapp.payments.ui.IndiaUpiScanQrCodeFragment;
import com.whatsapp.util.Log;

public class IDxSCallbackShape308S0100000_3_I1 implements C109465Sf {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape308S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ANz(int i2) {
        C14870pt r1;
        int i3;
        C14870pt r12;
        int i4;
        if (this.A01 != 0) {
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = (IndiaUpiScanQrCodeFragment) this.A00;
            if (indiaUpiScanQrCodeFragment.A05.A02()) {
                r12 = indiaUpiScanQrCodeFragment.A04;
                i4 = R.string.str083d;
            } else if (i2 != 2) {
                r12 = indiaUpiScanQrCodeFragment.A04;
                i4 = R.string.str03aa;
            } else {
                return;
            }
            r12.A09(i4, 1);
            return;
        }
        AnonymousClass2WW r3 = (AnonymousClass2WW) this.A00;
        if (r3.A03.A02()) {
            r1 = r3.A05;
            i3 = R.string.str083d;
        } else {
            if (i2 != 2) {
                r1 = r3.A05;
                i3 = R.string.str03aa;
            }
            r3.finish();
        }
        r1.A09(i3, 1);
        r3.finish();
    }

    public void AVG() {
        AnonymousClass1N7 r1;
        if (this.A01 != 0) {
            Log.i("qractivity/previewready");
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = (IndiaUpiScanQrCodeFragment) this.A00;
            indiaUpiScanQrCodeFragment.A0A = null;
            indiaUpiScanQrCodeFragment.A1A();
            r1 = indiaUpiScanQrCodeFragment.A08;
        } else {
            IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = (IndiaUpiQrCodeScanActivity) this.A00;
            indiaUpiQrCodeScanActivity.A02.A06("indiaupiqractivity/previewready");
            indiaUpiQrCodeScanActivity.A08 = true;
            r1 = indiaUpiQrCodeScanActivity.A00;
        }
        r1.A00("payments_camera");
    }

    public void AVV(C86844Uj r9) {
        C1201560n r2;
        IDxSCallbackShape456S0100000_3_I1 iDxSCallbackShape456S0100000_3_I1;
        String str;
        String str2;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = (IndiaUpiScanQrCodeFragment) obj;
            indiaUpiScanQrCodeFragment.A08.A01(2);
            String str3 = r9.A02;
            if (str3 == null || str3.equals(indiaUpiScanQrCodeFragment.A0A)) {
                indiaUpiScanQrCodeFragment.A09.AcJ();
                return;
            }
            indiaUpiScanQrCodeFragment.A0A = str3;
            IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) indiaUpiScanQrCodeFragment.A0D();
            Vibrator A0K = indiaUpiQrTabActivity.A08.A0K();
            if (A0K != null) {
                A0K.vibrate(75);
            }
            if (!C119105vx.A00(indiaUpiQrTabActivity.A0C, indiaUpiQrTabActivity.A04.A08()) || !C119105vx.A01(indiaUpiQrTabActivity.A0C, str3)) {
                boolean A0C = indiaUpiQrTabActivity.A0C.A0C(1354);
                r2 = indiaUpiQrTabActivity.A03;
                if (A0C) {
                    iDxSCallbackShape456S0100000_3_I1 = new IDxSCallbackShape456S0100000_3_I1(indiaUpiQrTabActivity, 1);
                    str = "SCANNED_QR_CODE";
                    str2 = "payments_camera";
                } else {
                    indiaUpiQrTabActivity.Afb(r2.AFI(str3, "payments_camera", 4), "SCANNED_QR_CODE");
                    return;
                }
            } else if (indiaUpiQrTabActivity.A05.A0C()) {
                r2 = indiaUpiQrTabActivity.A03;
                iDxSCallbackShape456S0100000_3_I1 = null;
                str = "SCANNED_QR_CODE";
                str2 = "payments_camera_gallery";
            } else {
                return;
            }
            r2.A00(indiaUpiQrTabActivity, iDxSCallbackShape456S0100000_3_I1, str3, str, str2);
            return;
        }
        IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = (IndiaUpiQrCodeScanActivity) obj;
        indiaUpiQrCodeScanActivity.A00.A01(2);
        indiaUpiQrCodeScanActivity.A37(r9);
    }
}
