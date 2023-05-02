package com.obwhatsapp.calling.callrating;

import X.AnonymousClass3K4;
import X.AnonymousClass42C;
import X.AnonymousClass5DZ;
import X.C13680ns;
import X.C15220qW;
import X.C18450wi;
import X.C32521gW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape422S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.StarRatingBar;
import com.obwhatsapp.base.WaFragment;
import com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel;

public final class CallRatingFragment extends WaFragment {
    public TextView A00;
    public final C15220qW A01 = C32521gW.A00(new AnonymousClass5DZ(this));

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View A0K = AnonymousClass3K4.A0K(layoutInflater, viewGroup, R.layout.layout00d9);
        this.A00 = C13680ns.A0M(A0K, R.id.rating_description);
        ((StarRatingBar) A0K.findViewById(R.id.rating_bar)).A01 = new IDxCListenerShape422S0100000_2_I1(this, 1);
        C15220qW r2 = this.A01;
        C13680ns.A1O(((CallRatingViewModel) r2.getValue()).A09, AnonymousClass42C.A01.titleRes);
        C13680ns.A1N(A0H(), ((CallRatingViewModel) r2.getValue()).A0C, this, 52);
        return A0K;
    }

    public void A13() {
        super.A13();
        this.A00 = null;
    }
}
