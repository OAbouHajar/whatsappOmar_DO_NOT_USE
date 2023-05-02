package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass29D;
import X.C13680ns;
import android.media.MediaPlayer;
import com.obwhatsapp.videoplayback.VideoSurfaceView;
import com.whatsapp.util.Log;

public class IDxEListenerShape349S0100000_2_I1 implements MediaPlayer.OnErrorListener {
    public Object A00;
    public final int A01;

    public IDxEListenerShape349S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        AnonymousClass29D r3;
        String str;
        String str2;
        switch (this.A01) {
            case 0:
                r3 = (AnonymousClass29D) this.A00;
                StringBuilder A0r = AnonymousClass000.A0r("VideoPlayerOnSurfaceView/error ");
                A0r.append(i2);
                str = " ";
                Log.e(C13680ns.A0i(str, A0r, i3));
                str2 = "VideoPlayerOnSurfaceView ";
                break;
            case 1:
                r3 = (AnonymousClass29D) this.A00;
                StringBuilder A0r2 = AnonymousClass000.A0r("VideoPlayerOnTextureView/error ");
                A0r2.append(i2);
                str = " ";
                Log.e(C13680ns.A0i(str, A0r2, i3));
                str2 = "VideoPlayerOnTextureView ";
                break;
            default:
                StringBuilder A0r3 = AnonymousClass000.A0r("videoview/ Error: ");
                A0r3.append(i2);
                Log.w(C13680ns.A0i(",", A0r3, i3));
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
                videoSurfaceView.A02 = -1;
                videoSurfaceView.A06 = -1;
                MediaPlayer.OnErrorListener onErrorListener = videoSurfaceView.A0A;
                if (onErrorListener == null) {
                    return true;
                }
                onErrorListener.onError(videoSurfaceView.A0C, i2, i3);
                return true;
        }
        StringBuilder A0r4 = AnonymousClass000.A0r(str2);
        A0r4.append(i2);
        r3.A02((String) null, C13680ns.A0i(str, A0r4, i3), true);
        return false;
    }
}
