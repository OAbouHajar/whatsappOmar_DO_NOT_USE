package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: X.09o  reason: invalid class name and case insensitive filesystem */
public class C020609o extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final View A01;

    public C020609o(View view) {
        this.A01 = view;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.A01;
        C06430Vt.A02.A06(view, 1.0f);
        if (this.A00) {
            view.setLayerType(0, (Paint) null);
        }
    }

    public void onAnimationStart(Animator animator) {
        View view = this.A01;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.A00 = true;
            view.setLayerType(2, (Paint) null);
        }
    }
}
