package com.facebook.redex;

import X.AnonymousClass29D;
import X.C108955Qd;
import android.media.MediaPlayer;
import com.obwhatsapp.videoplayback.VideoSurfaceView;

public class IDxCListenerShape294S0100000_2_I1 implements MediaPlayer.OnCompletionListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape294S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (2 - this.A01 != 0) {
            AnonymousClass29D r1 = (AnonymousClass29D) this.A00;
            C108955Qd r0 = r1.A01;
            if (r0 != null) {
                r0.AOy(r1);
                return;
            }
            return;
        }
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
        videoSurfaceView.A02 = 5;
        videoSurfaceView.A06 = 5;
        MediaPlayer.OnCompletionListener onCompletionListener = videoSurfaceView.A09;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(videoSurfaceView.A0C);
        }
    }
}
