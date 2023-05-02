package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;

/* renamed from: X.0M9  reason: invalid class name */
public class AnonymousClass0M9 {
    public static void A00(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }
}
