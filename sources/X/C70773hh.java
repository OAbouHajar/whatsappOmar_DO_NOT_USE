package X;

import android.transition.Transition;
import android.view.animation.AlphaAnimation;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.3hh  reason: invalid class name and case insensitive filesystem */
public class C70773hh extends C93824jp {
    public final /* synthetic */ MediaComposerActivity A00;

    public C70773hh(MediaComposerActivity mediaComposerActivity) {
        this.A00 = mediaComposerActivity;
    }

    public void onTransitionEnd(Transition transition) {
        MediaComposerActivity mediaComposerActivity = this.A00;
        if (mediaComposerActivity.A06.getVisibility() != 8) {
            mediaComposerActivity.A06.setVisibility(8);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(200);
            mediaComposerActivity.A06.startAnimation(alphaAnimation);
        }
        MediaComposerFragment A37 = mediaComposerActivity.A37();
        if (A37 != null) {
            A37.A1B();
        }
    }

    public void onTransitionStart(Transition transition) {
        MediaComposerFragment A37 = this.A00.A37();
        if (A37 != null) {
            A37.A1C();
        }
    }
}
