package com.obwhatsapp.status.playback.fragment;

import X.C41811wh;
import X.C41821wi;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.whatsapp.util.Log;

public abstract class StatusPlaybackFragment extends Hilt_StatusPlaybackFragment {
    public boolean A00;
    public final Rect A01 = new Rect();

    public void A0w() {
        super.A0w();
        StringBuilder sb = new StringBuilder("playbackFragment/onPause ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public void A12() {
        super.A12();
        StringBuilder sb = new StringBuilder("playbackFragment/onDestroy ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public void A14() {
        super.A14();
        StringBuilder sb = new StringBuilder("playbackFragment/onResume ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public void A1A() {
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this;
        for (C41821wi r1 : statusPlaybackContactFragment.A0p.A04().values()) {
            r1.A02 = statusPlaybackContactFragment.A1F();
            C41811wh r12 = (C41811wh) r1;
            if (r12.A02) {
                r12.A0C();
            } else {
                r12.A0D();
            }
        }
    }

    public void A1B() {
        this.A00 = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onViewActive ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public void A1C() {
        this.A00 = false;
        StringBuilder sb = new StringBuilder("playbackFragment/onViewInactive ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public void A1D(int i2) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this;
        if (statusPlaybackContactFragment.A0k == null) {
            statusPlaybackContactFragment.A01 = i2;
            return;
        }
        C41821wi A1J = statusPlaybackContactFragment.A1J();
        if (A1J != null && !A1J.A05) {
            C41811wh r1 = (C41811wh) A1J;
            r1.A05 = true;
            r1.A0K(i2, r1.A06);
        }
    }

    public void A1E(Rect rect) {
        this.A01.set(rect);
    }

    public boolean A1F() {
        if (!(this instanceof StatusPlaybackBaseFragment)) {
            return false;
        }
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) this;
        if (!(statusPlaybackBaseFragment instanceof StatusPlaybackContactFragment)) {
            return statusPlaybackBaseFragment.A07;
        }
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) statusPlaybackBaseFragment;
        return statusPlaybackContactFragment.A07 || statusPlaybackContactFragment.A0m;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        StringBuilder sb = new StringBuilder("playbackFragment/onConfigurationChanged ");
        sb.append(this);
        Log.i(sb.toString());
    }
}
