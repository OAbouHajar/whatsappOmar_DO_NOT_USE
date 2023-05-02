package com.obwhatsapp.profile;

import X.AnonymousClass2Rf;
import X.AnonymousClass3K2;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C14570pP;
import X.C16150sX;
import X.C32241fu;
import X.C49132Rg;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.R;

public class ResetGroupPhoto extends C14570pP {
    public boolean A00;

    public class ConfirmDialogFragment extends Hilt_ResetGroupPhoto_ConfirmDialogFragment {
        public static ConfirmDialogFragment A01(boolean z2) {
            ConfirmDialogFragment confirmDialogFragment = new ConfirmDialogFragment();
            Bundle A0D = C13690nt.A0D();
            A0D.putBoolean("IS_COMMUNITY_KEY", z2);
            confirmDialogFragment.A0T(A0D);
            return confirmDialogFragment;
        }

        public Dialog A1B(Bundle bundle) {
            boolean z2 = A04().getBoolean("IS_COMMUNITY_KEY", false);
            int i2 = R.string.str13ed;
            if (z2) {
                i2 = R.string.str13e8;
            }
            C32241fu A0R = AnonymousClass3K2.A0R(this);
            A0R.A01(i2);
            A0R.A07(true);
            C13690nt.A1H(A0R, this, 83, R.string.str0394);
            C13680ns.A1H(A0R, this, 84, R.string.str13e4);
            return A0R.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            C001000l A0C = A0C();
            if (A0C != null) {
                A0C.finish();
                A0C.overridePendingTransition(17432576, 17432577);
            }
        }
    }

    public ResetGroupPhoto() {
        this(0);
    }

    public ResetGroupPhoto(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 96);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            this.A05 = C16150sX.A1B(((C49132Rg) ((AnonymousClass2Rf) generatedComponent())).A1s);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str13f5);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_COMMUNITY_KEY", false);
        if (bundle == null) {
            C13680ns.A1J(ConfirmDialogFragment.A01(booleanExtra), this);
        }
    }
}
