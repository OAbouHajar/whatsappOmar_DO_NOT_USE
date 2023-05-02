package com.obwhatsapp.group;

import X.C004601z;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;

public class GroupJoinRequestInfoBottomSheetFragment extends RoundedBottomSheetDialogFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout02da, viewGroup);
        C004601z.A0E(inflate, R.id.ok_btn).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 15));
        return inflate;
    }
}
