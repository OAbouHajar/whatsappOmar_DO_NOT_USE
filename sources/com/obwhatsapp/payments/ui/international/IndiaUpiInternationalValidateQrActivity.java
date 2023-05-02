package com.obwhatsapp.payments.ui.international;

import X.AnonymousClass3Ph;
import X.AnonymousClass5EW;
import X.C111405g8;
import X.C115185pJ;
import X.C13680ns;
import X.C15220qW;
import X.C32521gW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape45S0000000_2_I1;
import com.obwhatsapp.R;

public final class IndiaUpiInternationalValidateQrActivity extends C111405g8 {
    public final C15220qW A00 = C32521gW.A01(new AnonymousClass5EW(this));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(8192);
        }
        setContentView((int) R.layout.layout0317);
        C115185pJ.A00(this, R.drawable.onboarding_actionbar_home_back);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar);
        TextView textView = (TextView) C13680ns.A0H(LayoutInflater.from(this), viewGroup, R.layout.layout0425);
        C13680ns.A0v(this, textView, R.color.color069a);
        textView.setText(R.string.str10d2);
        viewGroup.addView(textView);
        ((AnonymousClass3Ph) this.A00.getValue()).A00.A0A(this, new IDxObserverShape45S0000000_2_I1(1));
    }
}
