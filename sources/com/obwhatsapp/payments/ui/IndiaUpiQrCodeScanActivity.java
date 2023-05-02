package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass1N7;
import X.AnonymousClass1Vo;
import X.AnonymousClass2WW;
import X.C005402i;
import X.C110105dW;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import X.C54932iV;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.ViewGroup;
import com.facebook.redex.IDxSCallbackShape308S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.WaQrScannerView;

public final class IndiaUpiQrCodeScanActivity extends AnonymousClass2WW {
    public AnonymousClass1N7 A00;
    public boolean A01;
    public final AnonymousClass1Vo A02;

    public IndiaUpiQrCodeScanActivity() {
        this(0);
        this.A02 = AnonymousClass1Vo.A00("IndiaUpiQrCodeScanActivity", "payment", "IN");
    }

    public IndiaUpiQrCodeScanActivity(int i2) {
        this.A01 = false;
        C110105dW.A0t(this, 74);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A03 = C16150sX.A0J(r1);
            this.A04 = C16150sX.A0X(r1);
            this.A00 = (AnonymousClass1N7) r1.AKY.get();
        }
    }

    public void A36() {
        Vibrator A0K = this.A08.A0K();
        if (A0K != null) {
            A0K.vibrate(75);
        }
        Intent A04 = C110105dW.A04(this, IndiaUpiPaymentLauncherActivity.class);
        A04.putExtra("intent_source", true);
        A04.setData(Uri.parse(this.A06));
        startActivity(A04);
        finish();
    }

    public void A38(C54932iV r6) {
        int[] iArr = {R.string.str1cf7};
        r6.A06 = R.string.str11a5;
        r6.A0I = iArr;
        int[] iArr2 = {R.string.str1cf7};
        r6.A09 = R.string.str11a6;
        r6.A0G = iArr2;
    }

    public void onCreate(Bundle bundle) {
        A1X(5);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(R.layout.layout0348, (ViewGroup) null, false));
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0B(R.string.str0d0a);
            x2.A0N(true);
        }
        C005402i x3 = x();
        AnonymousClass00B.A06(x3);
        x3.A0N(true);
        WaQrScannerView waQrScannerView = (WaQrScannerView) findViewById(R.id.qr_scanner_view);
        this.A05 = waQrScannerView;
        waQrScannerView.setQrScannerCallback(new IDxSCallbackShape308S0100000_3_I1(this, 0));
        C13680ns.A1I(this, R.id.overlay, 0);
        A35();
    }

    public void onPause() {
        super.onPause();
        this.A00.A01(4);
    }
}
