package com.facebook.redex;

import X.C05230Pu;
import X.C12260k6;
import X.C62233Cm;
import android.view.ViewTreeObserver;
import com.obwhatsapp.account.delete.DeleteAccountFeedback;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

public class IDxDListenerShape411S0100000_2_I1 implements C12260k6 {
    public Object A00;
    public final int A01;

    public IDxDListenerShape411S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void APt(C05230Pu r4) {
        if (this.A01 != 0) {
            C62233Cm r2 = (C62233Cm) this.A00;
            ViewTreeObserver viewTreeObserver = r2.A00;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    r2.A00.removeGlobalOnLayoutListener(r2.A02);
                }
                r2.A00 = null;
            }
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = r2.A04;
            statusPlaybackBaseFragment.A07 = false;
            statusPlaybackBaseFragment.A1A();
            return;
        }
        ((DeleteAccountFeedback) this.A00).A07 = false;
    }
}
