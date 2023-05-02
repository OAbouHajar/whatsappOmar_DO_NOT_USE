package X;

import android.view.View;
import com.obwhatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.4k0  reason: invalid class name and case insensitive filesystem */
public class C93934k0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ VideoComposerFragment A00;

    public C93934k0(VideoComposerFragment videoComposerFragment) {
        this.A00 = videoComposerFragment;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        if (view != null) {
            VideoComposerFragment videoComposerFragment = this.A00;
            view.removeCallbacks(videoComposerFragment.A0U);
            view.removeOnAttachStateChangeListener(videoComposerFragment.A0T);
        }
    }
}
