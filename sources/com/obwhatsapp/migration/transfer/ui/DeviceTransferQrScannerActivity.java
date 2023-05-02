package com.obwhatsapp.migration.transfer.ui;

import X.AnonymousClass2WW;
import X.C13680ns;
import X.C54932iV;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;

public class DeviceTransferQrScannerActivity extends AnonymousClass2WW {
    public void A36() {
        Intent A09 = C13680ns.A09();
        A09.putExtra("qr_code_key", this.A06);
        C13680ns.A0r(this, A09);
    }

    public void A38(C54932iV r6) {
        int[] iArr = {R.string.str1cf7};
        r6.A06 = R.string.device_transfer_camera_permission_request_explanation;
        r6.A0I = iArr;
        int[] iArr2 = {R.string.str1cf7};
        r6.A09 = R.string.device_transfer_camera_permission_denial_explanation;
        r6.A0G = iArr2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02.setText(getString(R.string.str1c73));
        this.A02.setVisibility(0);
    }
}
