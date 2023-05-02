package com.facebook.redex;

import X.C14550pN;
import android.app.Activity;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;

public class ViewOnClickCListenerShape21S0100000_I1_6 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape21S0100000_I1_6(AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity, int i2) {
        this.A01 = i2;
        this.A00 = accountLinkingNativeAuthActivity;
    }

    public final void onClick(View view) {
        if (this.A01 != 0) {
            Activity activity = (Activity) this.A00;
            activity.setResult(0);
            activity.finish();
            return;
        }
        C14550pN r3 = (C14550pN) this.A00;
        r3.A05.A08(0, R.string.str0092);
        r3.A05.Acl(new RunnableRunnableShape20S0100000_I1_3(r3, 23));
    }
}
