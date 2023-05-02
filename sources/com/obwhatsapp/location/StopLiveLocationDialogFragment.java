package com.obwhatsapp.location;

import X.AnonymousClass00B;
import X.C15830rv;
import X.C16320sq;
import X.C19430yQ;
import X.C32241fu;
import X.C91294fg;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.R;

public class StopLiveLocationDialogFragment extends Hilt_StopLiveLocationDialogFragment {
    public C19430yQ A00;
    public C16320sq A01;

    public static StopLiveLocationDialogFragment A01(C15830rv r4, String str) {
        StopLiveLocationDialogFragment stopLiveLocationDialogFragment = new StopLiveLocationDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", r4.getRawString());
        bundle.putString("id", str);
        stopLiveLocationDialogFragment.A0T(bundle);
        return stopLiveLocationDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        String string = A04().getString("id");
        AnonymousClass00B.A06(string);
        String string2 = A04().getString("jid");
        AnonymousClass00B.A06(string2);
        C32241fu r2 = new C32241fu(A0C());
        r2.A01(R.string.str0c85);
        r2.setPositiveButton(R.string.str0c83, new C91294fg(this, string, string2));
        r2.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        return r2.create();
    }
}
