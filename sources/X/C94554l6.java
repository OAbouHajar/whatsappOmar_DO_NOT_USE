package X;

import android.view.animation.Animation;
import com.obwhatsapp.components.CircularRevealView;

/* renamed from: X.4l6  reason: invalid class name and case insensitive filesystem */
public class C94554l6 implements Animation.AnimationListener {
    public final /* synthetic */ CircularRevealView A00;

    public C94554l6(CircularRevealView circularRevealView) {
        this.A00 = circularRevealView;
    }

    public void onAnimationEnd(Animation animation) {
        this.A00.A0C = false;
    }

    public void onAnimationRepeat(Animation animation) {
        this.A00.A0C = true;
    }

    public void onAnimationStart(Animation animation) {
        this.A00.A0C = true;
    }
}
