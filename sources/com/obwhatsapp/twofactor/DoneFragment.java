package com.obwhatsapp.twofactor;

import X.C004601z;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;

public class DoneFragment extends Hilt_DoneFragment {
    public String A00;

    public static DoneFragment A01(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("primaryCTA", str);
        DoneFragment doneFragment = new DoneFragment();
        doneFragment.A0T(bundle);
        return doneFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout02a6, viewGroup, false);
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A00 = A04().getString("primaryCTA", "DONE");
    }

    public void A18(Bundle bundle, View view) {
        boolean equals = this.A00.equals("CONTINUE");
        int i2 = R.string.str07ab;
        if (equals) {
            i2 = R.string.str0693;
        }
        String A0J = A0J(i2);
        TextView textView = (TextView) C004601z.A0E(view, R.id.done_button);
        textView.setText(A0J);
        textView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 31));
        TwoFactorAuthActivity twoFactorAuthActivity = (TwoFactorAuthActivity) A0C();
        twoFactorAuthActivity.A36(view, twoFactorAuthActivity.A08.length);
    }
}
