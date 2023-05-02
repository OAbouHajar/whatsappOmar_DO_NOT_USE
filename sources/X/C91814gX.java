package X;

import android.media.MediaPlayer;
import com.obwhatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.4gX  reason: invalid class name and case insensitive filesystem */
public class C91814gX implements MediaPlayer.OnBufferingUpdateListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public C91814gX(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.A00.A01 = i2;
    }
}
