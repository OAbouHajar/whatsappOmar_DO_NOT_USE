package com.obwhatsapp.mediaview;

import X.C16730tY;
import X.C94264kd;
import android.view.MotionEvent;
import com.obwhatsapp.InteractiveAnnotation;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;

public class IDxSListenerShape6S0300000_2_I1 extends C94264kd {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSListenerShape6S0300000_2_I1(MediaViewFragment mediaViewFragment, PhotoView photoView, PhotoView photoView2, C16730tY r4, ExoPlaybackControlView exoPlaybackControlView, int i2) {
        super(photoView, r4);
        this.A03 = i2;
        this.A00 = mediaViewFragment;
        this.A02 = photoView2;
        this.A01 = exoPlaybackControlView;
    }

    public void A00(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ExoPlaybackControlView exoPlaybackControlView = (ExoPlaybackControlView) this.A01;
            if (exoPlaybackControlView.A07()) {
                exoPlaybackControlView.A00();
                return;
            }
            exoPlaybackControlView.A01();
            exoPlaybackControlView.A06(3000);
        }
    }

    public void A01(InteractiveAnnotation interactiveAnnotation) {
        MediaViewFragment.A04(interactiveAnnotation, (MediaViewFragment) this.A00, (PhotoView) this.A02);
    }
}
