package com.obwhatsapp.payments.ui;

import X.C1220267z;
import android.content.Intent;

public class IndiaUpiQuickBuyActivity extends IndiaUpiCheckOrderDetailsActivity implements C1220267z {
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == 0 || i3 == 252 || i3 == 251 || i3 == 250) {
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
