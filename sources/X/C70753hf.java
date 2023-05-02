package X;

import android.transition.Transition;
import android.view.animation.AlphaAnimation;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;
import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.3hf  reason: invalid class name and case insensitive filesystem */
public class C70753hf extends C93824jp {
    public final /* synthetic */ MediaViewBaseFragment A00;
    public final /* synthetic */ AnonymousClass29A A01;

    public C70753hf(MediaViewBaseFragment mediaViewBaseFragment, AnonymousClass29A r2) {
        this.A00 = mediaViewBaseFragment;
        this.A01 = r2;
    }

    public void onTransitionEnd(Transition transition) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A00;
        C001000l A0C = mediaViewBaseFragment.A0C();
        if (A0C != null && !mediaViewBaseFragment.A0g && !A0C.isFinishing()) {
            mediaViewBaseFragment.A03.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(600);
            mediaViewBaseFragment.A03.startAnimation(alphaAnimation);
            mediaViewBaseFragment.A1P(true, true);
            PhotoView A1A = mediaViewBaseFragment.A1A(mediaViewBaseFragment.A1D(mediaViewBaseFragment.A09.getCurrentItem()));
            if (A1A != null) {
                A1A.A09(true);
            }
            this.A01.AZA(true);
        }
    }
}
