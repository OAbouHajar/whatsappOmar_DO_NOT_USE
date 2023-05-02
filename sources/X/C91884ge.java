package X;

import android.media.MediaPlayer;
import com.obwhatsapp.videoplayback.VideoSurfaceView;
import com.whatsapp.util.Log;

/* renamed from: X.4ge  reason: invalid class name and case insensitive filesystem */
public class C91884ge implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public C91884ge(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        VideoSurfaceView videoSurfaceView = this.A00;
        videoSurfaceView.A02 = 2;
        videoSurfaceView.A0I = true;
        videoSurfaceView.A0H = true;
        videoSurfaceView.A0G = true;
        MediaPlayer.OnPreparedListener onPreparedListener = videoSurfaceView.A0B;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(videoSurfaceView.A0C);
        }
        videoSurfaceView.A08 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        videoSurfaceView.A07 = videoHeight;
        StringBuilder A0r = AnonymousClass000.A0r("videoview/onPrepare: ");
        A0r.append(videoSurfaceView.A08);
        Log.i(C13680ns.A0i("x", A0r, videoHeight));
        int i2 = videoSurfaceView.A03;
        if (i2 >= 0) {
            videoSurfaceView.seekTo(i2);
        }
        if (!(videoSurfaceView.A08 == 0 || videoSurfaceView.A07 == 0)) {
            videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A08, videoSurfaceView.A07);
            if (!(videoSurfaceView.A05 == videoSurfaceView.A08 && videoSurfaceView.A04 == videoSurfaceView.A07)) {
                return;
            }
        }
        if (videoSurfaceView.A06 == 3) {
            videoSurfaceView.start();
        }
    }
}
