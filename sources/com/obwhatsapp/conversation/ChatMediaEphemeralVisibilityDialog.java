package com.obwhatsapp.conversation;

import X.C001000l;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape45S0000000_2_I1;
import com.obwhatsapp.R;

public class ChatMediaEphemeralVisibilityDialog extends Hilt_ChatMediaEphemeralVisibilityDialog {
    public Dialog A1B(Bundle bundle) {
        C001000l A0D = A0D();
        C32241fu A00 = C32241fu.A00(A0D);
        TextView textView = (TextView) A0D.getLayoutInflater().inflate(R.layout.layout0207, (ViewGroup) null);
        textView.setText(R.string.str0806);
        A00.A01.A0B = textView;
        A00.A01(R.string.str0805);
        A00.A0H(this, new IDxObserverShape45S0000000_2_I1(0), A0J(R.string.str0e87));
        return A00.create();
    }
}
