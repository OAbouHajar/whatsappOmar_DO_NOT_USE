package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* renamed from: X.3KJ  reason: invalid class name */
public class AnonymousClass3KJ extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FabTransformationBehavior A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass3KJ(View view, View view2, FabTransformationBehavior fabTransformationBehavior, boolean z2) {
        this.A02 = fabTransformationBehavior;
        this.A03 = z2;
        this.A00 = view;
        this.A01 = view2;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A03) {
            this.A00.setVisibility(4);
            View view = this.A01;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A03) {
            this.A00.setVisibility(0);
            View view = this.A01;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
