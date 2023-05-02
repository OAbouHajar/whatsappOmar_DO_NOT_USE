package X;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.obwhatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.4jz  reason: invalid class name and case insensitive filesystem */
public class C93924jz implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ MessageGifVideoPlayer A00;

    public C93924jz(MessageGifVideoPlayer messageGifVideoPlayer) {
        this.A00 = messageGifVideoPlayer;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        MessageGifVideoPlayer messageGifVideoPlayer = this.A00;
        messageGifVideoPlayer.A03 = new Surface(surfaceTexture);
        MessageGifVideoPlayer.A00(messageGifVideoPlayer);
        MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(messageGifVideoPlayer.A03);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        MessageGifVideoPlayer messageGifVideoPlayer = this.A00;
        MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface((Surface) null);
            messageGifVideoPlayer.A04();
        }
        Surface surface = messageGifVideoPlayer.A03;
        AnonymousClass00B.A06(surface);
        surface.release();
        messageGifVideoPlayer.A03 = null;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        MessageGifVideoPlayer.A00(this.A00);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
