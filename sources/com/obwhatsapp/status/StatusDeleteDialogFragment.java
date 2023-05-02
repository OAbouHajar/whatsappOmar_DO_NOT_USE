package com.obwhatsapp.status;

import X.AnonymousClass01D;
import X.AnonymousClass1yL;
import X.AnonymousClass3K3;
import X.AnonymousClass47W;
import X.C001000l;
import X.C1035051q;
import X.C14870pt;
import X.C16460t6;
import X.C16740tZ;
import X.C16760tb;
import X.C17250um;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Collections;
import java.util.Set;

public class StatusDeleteDialogFragment extends Hilt_StatusDeleteDialogFragment {
    public C14870pt A00;
    public C16760tb A01;
    public C16460t6 A02;
    public C17250um A03;
    public StatusPlaybackContactFragment A04;
    public AnonymousClass01D A05;

    public void A17(Bundle bundle) {
        super.A17(bundle);
        try {
            this.A04 = (StatusPlaybackContactFragment) A0A();
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }

    public Dialog A1B(Bundle bundle) {
        this.A04.APj(this, true);
        C16740tZ A032 = this.A02.A0K.A03(AnonymousClass1yL.A03(A04(), ""));
        Set set = null;
        C001000l A0C = A0C();
        C14870pt r2 = this.A00;
        C17250um r4 = this.A03;
        C16760tb r3 = this.A01;
        if (A032 != null) {
            set = Collections.singleton(A032);
        }
        Dialog A002 = AnonymousClass47W.A00(A0C, r2, r3, r4, new C1035051q(A032), set);
        if (A002 != null) {
            return A002;
        }
        C32241fu A0c = AnonymousClass3K3.A0c(this);
        A0c.A01(R.string.str1682);
        return A0c.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.A04.APj(this, false);
    }
}
