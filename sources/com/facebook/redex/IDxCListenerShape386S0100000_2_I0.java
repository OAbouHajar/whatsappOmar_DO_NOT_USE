package com.facebook.redex;

import X.AnonymousClass29D;
import X.C108955Qd;
import X.C46202Cw;
import android.view.animation.AlphaAnimation;
import com.obwhatsapp.mediacomposer.VideoComposerFragment;

public class IDxCListenerShape386S0100000_2_I0 implements C108955Qd {
    public Object A00;
    public final int A01;

    public IDxCListenerShape386S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AOy(AnonymousClass29D r6) {
        if (this.A01 != 0) {
            ((C46202Cw) this.A00).A0V(r6);
            return;
        }
        VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A00;
        videoComposerFragment.A01 = videoComposerFragment.A0L.A04;
        videoComposerFragment.A0I.invalidate();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200);
        videoComposerFragment.A07.startAnimation(alphaAnimation);
        videoComposerFragment.A07.setVisibility(0);
        if (videoComposerFragment.A0Q) {
            if (videoComposerFragment.A0M.A0C()) {
                videoComposerFragment.A1I();
            }
            videoComposerFragment.A0M.A0A((int) videoComposerFragment.A02);
            videoComposerFragment.A1D();
        }
    }
}
