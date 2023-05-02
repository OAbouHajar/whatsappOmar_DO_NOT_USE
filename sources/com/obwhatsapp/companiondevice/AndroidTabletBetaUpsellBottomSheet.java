package com.obwhatsapp.companiondevice;

import X.C004601z;
import X.C13680ns;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;

public class AndroidTabletBetaUpsellBottomSheet extends RoundedBottomSheetDialogFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout006f, viewGroup, true);
    }

    public void A18(Bundle bundle, View view) {
        C13680ns.A17(C004601z.A0E(view, R.id.close), this, 6);
    }
}
