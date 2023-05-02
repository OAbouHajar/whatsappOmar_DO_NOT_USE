package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.obwhatsapp.Conversation;

/* renamed from: X.22O  reason: invalid class name */
public class AnonymousClass22O {
    public static Animation A00(boolean z2, boolean z3, boolean z4) {
        AlphaAnimation alphaAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        float f2 = 1.0f;
        if (z4) {
            if (!z3) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(100);
            animationSet.addAnimation(alphaAnimation);
        }
        if (!z2) {
            f2 = -1.0f;
        }
        float f3 = 0.0f;
        if (z3) {
            f3 = f2;
            f2 = 0.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f3, 1, f2, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(100);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(100);
        return animationSet;
    }

    public static AnonymousClass1yP A01(Context context) {
        Activity A00 = AnonymousClass22N.A00(context);
        if (A00 == null || !(A00 instanceof AnonymousClass1yP)) {
            return null;
        }
        return (AnonymousClass1yP) A00;
    }

    public static AnonymousClass1yP A02(View view) {
        return A01(view.getContext());
    }

    public static void A03(AnonymousClass12E r1, C15830rv r2) {
        AnonymousClass1yO A00 = r1.A00();
        if (!A00.A02) {
            AnonymousClass1yP r12 = A00.A00;
            if (r12 != null && !r12.isFinishing()) {
                if (r2 == null || r2.equals(((Conversation) r12).A00.A33)) {
                    ((Activity) r12).finish();
                }
            }
        } else if (r2 == null || r2.equals(((Conversation) A00.A00()).A00.A33)) {
            ((Activity) A00.A00()).finish();
        }
    }
}
