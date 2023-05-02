package com.facebook.redex;

import X.AnonymousClass000;
import X.C001000l;
import X.C13680ns;
import X.C19980zJ;
import X.C52302dW;
import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;

public class ViewOnClickCListenerShape0S0000000_I1 implements View.OnClickListener {
    public final int A00;

    public ViewOnClickCListenerShape0S0000000_I1(int i2) {
        this.A00 = i2;
    }

    public final void onClick(View view) {
        if (this.A00 == 0) {
            try {
                C13680ns.A1J(VoipErrorDialogFragment.A02(new C52302dW(), 9), (C001000l) C19980zJ.A01(view.getContext(), C001000l.class));
            } catch (IllegalStateException e2) {
                Log.w(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("CallInfoButtonViewHolder/showCallIsFullDialog/Context not an activity: ")));
            }
        }
    }
}
