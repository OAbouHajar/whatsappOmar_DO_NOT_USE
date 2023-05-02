package X;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;

/* renamed from: X.2PQ  reason: invalid class name */
public final class AnonymousClass2PQ extends C30211bx {
    public final MediaPlayer A00;
    public final Handler A01;

    public AnonymousClass2PQ(int i2) {
        Looper myLooper = Looper.myLooper();
        this.A01 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.A00 = mediaPlayer;
        mediaPlayer.setAudioStreamType(i2);
    }

    public boolean A0E(C16300so r7, float f2) {
        try {
            MediaPlayer mediaPlayer = this.A00;
            PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
            playbackParams.allowDefaults();
            if (Math.abs(playbackParams.getSpeed() - f2) >= 0.1f) {
                mediaPlayer.setPlaybackParams(playbackParams.setSpeed(f2));
            }
            return true;
        } catch (IllegalArgumentException | IllegalStateException e2) {
            StringBuilder sb = new StringBuilder("audioplayer/setPlaybackSpeed failed: currSpeed: ");
            sb.append(-1.0f);
            sb.append(" newSpeed: ");
            sb.append(f2);
            sb.append(" ");
            sb.append(e2.toString());
            Log.e(sb.toString());
            return false;
        }
    }
}
