package X;

import android.view.View;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.4ka  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94234ka implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ ExoPlaybackControlView A01;
    public final /* synthetic */ AnonymousClass29C A02;

    public /* synthetic */ C94234ka(MediaViewFragment mediaViewFragment, ExoPlaybackControlView exoPlaybackControlView, AnonymousClass29C r3) {
        this.A00 = mediaViewFragment;
        this.A02 = r3;
        this.A01 = exoPlaybackControlView;
    }

    public final void onSystemUiVisibilityChange(int i2) {
        MediaViewFragment.A06(this.A00, this.A01, this.A02, i2);
    }
}
