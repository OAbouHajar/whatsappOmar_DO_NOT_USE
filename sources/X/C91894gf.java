package X;

import android.media.MediaPlayer;
import com.obwhatsapp.videoplayback.VideoSurfaceView;
import com.whatsapp.util.Log;

/* renamed from: X.4gf  reason: invalid class name and case insensitive filesystem */
public class C91894gf implements MediaPlayer.OnVideoSizeChangedListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public C91894gf(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        VideoSurfaceView videoSurfaceView = this.A00;
        videoSurfaceView.A08 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        videoSurfaceView.A07 = videoHeight;
        StringBuilder A0r = AnonymousClass000.A0r("videoview/onVideoSizeChanged: ");
        A0r.append(videoSurfaceView.A08);
        Log.i(C13680ns.A0i("x", A0r, videoHeight));
        if (videoSurfaceView.A08 != 0 && videoSurfaceView.A07 != 0) {
            videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A08, videoSurfaceView.A07);
            videoSurfaceView.requestLayout();
        }
    }
}
