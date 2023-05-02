package com.obwhatsapp.qrcode;

import X.AnonymousClass01A;
import X.C13680ns;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.contactqr.QrScanCodeFragment;

public class QrEducationDialogFragment extends Hilt_QrEducationDialogFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout04e0, viewGroup, false);
        ((QrEducationView) inflate.findViewById(R.id.education)).A0E = false;
        C13680ns.A15(inflate.findViewById(R.id.ok), this, 18);
        return inflate;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A1E(2, R.style.style02f5);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass01A r1 = this.A0D;
        if (r1 instanceof QrScanCodeFragment) {
            ((QrScanCodeFragment) r1).A1B();
        }
    }
}
