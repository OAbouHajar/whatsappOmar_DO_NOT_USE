package X;

import android.view.animation.AlphaAnimation;
import com.obwhatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.3um  reason: invalid class name and case insensitive filesystem */
public class C76843um extends AnonymousClass4XG {
    public final /* synthetic */ VideoComposerFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76843um(VideoComposerFragment videoComposerFragment) {
        super(videoComposerFragment);
        this.A00 = videoComposerFragment;
    }

    public void A03() {
        super.A03();
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300);
        VideoComposerFragment videoComposerFragment = this.A00;
        videoComposerFragment.A09.setVisibility(4);
        videoComposerFragment.A09.startAnimation(alphaAnimation);
    }

    public void A04() {
        super.A04();
        VideoComposerFragment videoComposerFragment = this.A00;
        if (videoComposerFragment.A09.getVisibility() != 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            videoComposerFragment.A09.setVisibility(0);
            videoComposerFragment.A09.startAnimation(alphaAnimation);
        }
    }
}
