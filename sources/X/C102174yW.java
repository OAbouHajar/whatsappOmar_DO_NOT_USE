package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.obwhatsapp.mediacomposer.VideoComposerFragment;
import com.obwhatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.4yW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C102174yW implements AnonymousClass2OW {
    public final /* synthetic */ VideoComposerFragment A00;
    public final /* synthetic */ VideoSurfaceView A01;

    public /* synthetic */ C102174yW(VideoComposerFragment videoComposerFragment, VideoSurfaceView videoSurfaceView) {
        this.A00 = videoComposerFragment;
        this.A01 = videoSurfaceView;
    }

    public /* synthetic */ void A5K() {
    }

    public /* synthetic */ void AQs() {
    }

    public final void AY3(Bitmap bitmap, boolean z2) {
        VideoComposerFragment videoComposerFragment = this.A00;
        VideoSurfaceView videoSurfaceView = this.A01;
        videoSurfaceView.A03(bitmap.getWidth(), bitmap.getHeight());
        videoSurfaceView.setBackground(new BitmapDrawable(videoComposerFragment.A03(), bitmap));
    }
}
