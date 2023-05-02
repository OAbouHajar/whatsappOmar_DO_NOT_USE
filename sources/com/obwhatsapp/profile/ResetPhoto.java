package com.obwhatsapp.profile;

import X.AnonymousClass29T;
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

public class ResetPhoto extends C14570pP {
    public boolean A00;

    public class ConfirmDialogFragment extends Hilt_ResetPhoto_ConfirmDialogFragment {
        public Dialog A1B(Bundle bundle) {
            Bundle bundle2 = this.A05;
            int i2 = 0;
            if (bundle2 != null) {
                i2 = bundle2.getInt("photo_type", 0);
            }
            C32241fu A0R = AnonymousClass3K2.A0R(this);
            if (i2 == 1) {
                throw C13680ns.A0m();
            }
            A0R.A01(R.string.str13f7);
            A0R.A07(true);
            C13690nt.A1H(A0R, this, 85, R.string.str13f8);
            C13680ns.A1H(A0R, this, 86, R.string.str13f9);
            return A0R.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            C001000l A0C = A0C();
            if (A0C != null && !AnonymousClass29T.A03(A0C)) {
                A0C.finish();
                A0C.overridePendingTransition(17432576, 17432577);
            }
        }
    }

    public ResetPhoto() {
        this(0);
    }

    public ResetPhoto(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 97);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            this.A05 = C16150sX.A1B(((C49132Rg) ((AnonymousClass2Rf) generatedComponent())).A1s);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("photo_type", 0);
        if (intExtra == 1) {
            throw C13680ns.A0m();
        }
        setTitle(R.string.str13f6);
        if (bundle == null) {
            ConfirmDialogFragment confirmDialogFragment = new ConfirmDialogFragment();
            Bundle A0D = C13690nt.A0D();
            A0D.putInt("photo_type", intExtra);
            confirmDialogFragment.A0T(A0D);
            C13680ns.A1J(confirmDialogFragment, this);
        }
    }
}
