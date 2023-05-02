package com.obwhatsapp.payments.ui;

import X.AnonymousClass00T;
import X.AnonymousClass090;
import X.AnonymousClass61W;
import X.C110105dW;
import X.C14570pP;
import X.C16150sX;
import X.C16320sq;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.obwhatsapp.R;

public class IndiaUpiPaymentsBlockScreenShareActivity extends C14570pP {
    public AnonymousClass61W A00;
    public boolean A01;

    public IndiaUpiPaymentsBlockScreenShareActivity() {
        this(0);
    }

    public IndiaUpiPaymentsBlockScreenShareActivity(int i2) {
        this.A01 = false;
        C110105dW.A0t(this, 64);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C16150sX r1 = C110105dW.A0C(this).A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A00 = C110105dW.A0O(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(2);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setDimAmount(0.8f);
        int A002 = AnonymousClass00T.A00(this, R.color.color046f);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(67108864);
            int A03 = AnonymousClass090.A03(0.3f, A002, AnonymousClass00T.A00(this, R.color.color04f1));
            Window window = getWindow();
        }
        setContentView((int) R.layout.layout0330);
        C110105dW.A0r(findViewById(R.id.close), this, 65);
        this.A00.AKS(0, (Integer) null, "block_screen_share", (String) null);
    }
}
