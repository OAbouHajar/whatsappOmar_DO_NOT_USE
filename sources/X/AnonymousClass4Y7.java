package X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.ScaleAnimation;

/* renamed from: X.4Y7  reason: invalid class name */
public class AnonymousClass4Y7 {
    public static void A00(View view, int i2, boolean z2, boolean z3) {
        int visibility = view.getVisibility();
        if (z2) {
            if (visibility != 0) {
                view.setVisibility(0);
                if (z3) {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setDuration((long) i2);
                    scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                    scaleAnimation.setFillBefore(true);
                    view.startAnimation(scaleAnimation);
                }
            }
        } else if (visibility == 0) {
            if (z3) {
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration((long) i2);
                scaleAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleAnimation2.setFillBefore(true);
                view.startAnimation(scaleAnimation2);
            }
            view.setVisibility(4);
        }
    }

    public static void A01(View view, boolean z2, boolean z3) {
        A00(view, 125, z2, z3);
    }
}
