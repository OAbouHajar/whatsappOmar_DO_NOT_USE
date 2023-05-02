package X;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2PH  reason: invalid class name */
public class AnonymousClass2PH implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ AnonymousClass2PI A00;

    public AnonymousClass2PH(AnonymousClass2PI r1) {
        this.A00 = r1;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        AnonymousClass2PI r3 = this.A00;
        if (r3.A09 != null) {
            Surface surface = new Surface(surfaceTexture);
            r3.A0A = surface;
            r3.A09.setSurface(surface);
            if (r3.A00 == 0) {
                try {
                    r3.A09.setDataSource(r3.A0B);
                    r3.A09.prepareAsync();
                    r3.A00 = 1;
                } catch (IOException e2) {
                    r3.A00 = -1;
                    r3.A03 = -1;
                    if (r3.A07 != null) {
                        r3.post(new RunnableRunnableShape16S0100000_I0_15(this, 18));
                    }
                    Log.e("mediaview/unable-to-play", e2);
                }
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass2PI r2 = this.A00;
        MediaPlayer mediaPlayer = r2.A09;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface((Surface) null);
        }
        Surface surface = r2.A0A;
        if (surface != null) {
            surface.release();
            r2.A0A = null;
        }
        r2.A0H = false;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        AnonymousClass2PI r6 = this.A00;
        if (!r6.A0H) {
            boolean z2 = false;
            if (surfaceTexture.getTimestamp() > 0) {
                z2 = true;
            }
            r6.A0H = z2;
        }
    }
}
