package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* renamed from: X.3KD  reason: invalid class name */
public class AnonymousClass3KD extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FabTransformationScrimBehavior A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass3KD(View view, FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z2) {
        this.A01 = fabTransformationScrimBehavior;
        this.A02 = z2;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A02) {
            this.A00.setVisibility(4);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02) {
            this.A00.setVisibility(0);
        }
    }
}
