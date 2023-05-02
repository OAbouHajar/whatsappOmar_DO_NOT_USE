package com.facebook.redex;

import X.C13680ns;
import android.media.AudioManager;
import com.whatsapp.util.Log;

public class IDxCListenerShape42S0000000_2_I0 implements AudioManager.OnAudioFocusChangeListener {
    public final int A00;

    public IDxCListenerShape42S0000000_2_I0(int i2) {
        this.A00 = i2;
    }

    public final void onAudioFocusChange(int i2) {
        if (this.A00 == 0) {
            Log.i(C13680ns.A0c(i2, "voip audio focus changed: "));
        }
    }
}
