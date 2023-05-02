package X;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;

/* renamed from: X.3KN  reason: invalid class name */
public class AnonymousClass3KN extends LayoutTransition {
    public AnonymousClass3KN() {
        setAnimator(2, A00(true));
        setAnimator(3, A00(false));
        setDuration(100);
        setStartDelay(2, 0);
        setStartDelay(0, 0);
        setStartDelay(1, 0);
    }

    public static final Animator A00(boolean z2) {
        float f2 = z2 ^ true ? 1.0f : 0.0f;
        float f3 = z2 ? 1.0f : 0.0f;
        return ObjectAnimator.ofPropertyValuesHolder((Object) null, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{f2, f3}), PropertyValuesHolder.ofFloat("scaleY", new float[]{f2, f3})});
    }
}
