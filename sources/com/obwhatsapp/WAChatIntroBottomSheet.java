package com.obwhatsapp;

import X.C004601z;
import X.C13680ns;
import X.C34811ku;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;

public class WAChatIntroBottomSheet extends RoundedBottomSheetDialogFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0604);
        ViewOnClickCListenerShape4S0100000_I1 viewOnClickCListenerShape4S0100000_I1 = new ViewOnClickCListenerShape4S0100000_I1(this, 1);
        C004601z.A0E(A0H, R.id.close_button).setOnClickListener(viewOnClickCListenerShape4S0100000_I1);
        C004601z.A0E(A0H, R.id.continue_button).setOnClickListener(viewOnClickCListenerShape4S0100000_I1);
        C13680ns.A0L(A0H, R.id.header).setText(C34811ku.A05(A0u(), R.string.str1b34));
        C13680ns.A0L(A0H, R.id.bodyLineItemText2).setText(C34811ku.A05(A0u(), R.string.str1b32));
        return A0H;
    }

    public int A19() {
        return R.style.style03b8;
    }
}
