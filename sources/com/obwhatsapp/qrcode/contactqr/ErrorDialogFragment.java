package com.obwhatsapp.qrcode.contactqr;

import X.C14650pX;
import X.C32241fu;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.R;

public class ErrorDialogFragment extends Hilt_ErrorDialogFragment {
    public C14650pX A00;

    public static ErrorDialogFragment A01(int i2) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_ERROR_CODE", i2);
        errorDialogFragment.A0T(bundle);
        return errorDialogFragment;
    }

    public void A0k() {
        super.A0k();
        this.A00 = null;
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof C14650pX) {
            this.A00 = (C14650pX) context;
        }
    }

    public Dialog A1B(Bundle bundle) {
        int i2;
        int i3 = A04().getInt("ARG_ERROR_CODE");
        C32241fu r2 = new C32241fu(A02());
        r2.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
        switch (i3) {
            case 2:
                r2.A02(R.string.str058e);
                r2.A06(A0J(R.string.str058c));
                break;
            case 3:
                i2 = R.string.str0583;
                break;
            case 4:
                i2 = R.string.str1332;
                break;
            case 5:
                i2 = R.string.str1331;
                break;
            case 6:
                i2 = R.string.str0584;
                break;
            case 7:
                i2 = R.string.str0ba5;
                break;
            default:
                i2 = R.string.str0582;
                break;
        }
        r2.A01(i2);
        return r2.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C14650pX r0 = this.A00;
        if (r0 != null) {
            r0.AVW();
        }
    }
}
