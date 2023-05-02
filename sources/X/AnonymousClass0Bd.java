package X;

import android.animation.Animator;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.0Bd  reason: invalid class name */
public final class AnonymousClass0Bd extends GestureDetector.SimpleOnGestureListener {
    public final AnonymousClass0CB A00;

    public AnonymousClass0Bd(AnonymousClass0CB r1) {
        this.A00 = r1;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        AnonymousClass0CB r3 = this.A00;
        if (r3.getContext() == null) {
            return false;
        }
        float translationY = r3.getTranslationY();
        if (f3 > 0.0f) {
            r3.A01((int) Math.abs(((((float) r3.getHeight()) - translationY) / f3) * 1000.0f));
        } else {
            r3.A02((Animator.AnimatorListener) null, (int) Math.abs((translationY / (-f3)) * 1000.0f));
        }
        r3.A0B = true;
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        AnonymousClass0CB r3 = this.A00;
        if (r3.getTranslationY() <= 0.0f && f3 > 0.0f) {
            return false;
        }
        r3.A0B = false;
        return true;
    }
}
