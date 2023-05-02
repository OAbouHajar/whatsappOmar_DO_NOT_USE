package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass175;
import X.AnonymousClass17O;
import X.AnonymousClass60U;
import X.C110105dW;
import X.C110115dX;
import X.C111385g6;
import X.C112655iq;
import X.C112775jP;
import X.C118605ux;
import X.C119165we;
import X.C1200860g;
import X.C1204661t;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

public class BrazilDyiReportActivity extends C112775jP {
    public AnonymousClass60U A00;
    public C1200860g A01;
    public C1204661t A02;
    public AnonymousClass175 A03;
    public AnonymousClass17O A04;
    public C119165we A05;
    public boolean A06;

    public BrazilDyiReportActivity() {
        this(0);
    }

    public BrazilDyiReportActivity(int i2) {
        this.A06 = false;
        C110105dW.A0t(this, 13);
    }

    public void A1q() {
        if (!this.A06) {
            this.A06 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A0Q = C111385g6.A02(r1, this, C111385g6.A03(r1, this));
            this.A00 = (AnonymousClass60U) r1.A2G.get();
            this.A02 = C110115dX.A0J(r1);
            this.A01 = A0C.A0N();
            this.A04 = (AnonymousClass17O) r1.AHe.get();
            this.A05 = A0C.A0T();
            this.A03 = (AnonymousClass175) r1.AH5.get();
        }
    }

    public void A3C(String str) {
        String str2 = this.A0Y;
        String str3 = str;
        if (str2.equals("business")) {
            this.A0U.A0B(str3);
        } else if (!str2.equals("personal")) {
            Log.e(AnonymousClass000.A0h(str2, AnonymousClass000.A0r("PAY: DyiReportBaseActivity/dyiReportButtonContainer::onClick - This payment account type is not supported. PaymentAccount = ")));
        } else {
            PinBottomSheetDialogFragment A002 = C118605ux.A00();
            FingerprintBottomSheet fingerprintBottomSheet = null;
            if (Build.VERSION.SDK_INT >= 23) {
                fingerprintBottomSheet = C110115dX.A09();
            }
            this.A0U.A06(this, fingerprintBottomSheet, new C112655iq(this.A01, this.A05, this.A0J, this.A0Q, this, str3), A002, str3, "DYIREPORT", this.A0Z);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A08.setText(R.string.str1092);
    }

    public Dialog onCreateDialog(int i2) {
        Dialog A012 = this.A05.A01((Bundle) null, this, i2);
        return A012 == null ? super.onCreateDialog(i2) : A012;
    }
}
