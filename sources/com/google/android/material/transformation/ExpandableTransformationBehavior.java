package com.google.android.material.transformation;

import X.AnonymousClass000;
import X.AnonymousClass3KD;
import X.C53672g5;
import X.C53702g8;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import com.facebook.redex.IDxLAdapterShape4S0100000_2_I1;
import java.util.ArrayList;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet A00;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A0I(View view, View view2, boolean z2, boolean z3) {
        AnimatorSet animatorSet = this.A00;
        boolean z4 = false;
        if (animatorSet != null) {
            z4 = true;
            animatorSet.cancel();
        }
        AnimatorSet A0J = A0J(view, view2, z2, z4);
        this.A00 = A0J;
        A0J.addListener(new IDxLAdapterShape4S0100000_2_I1(this, 1));
        this.A00.start();
        if (!z3) {
            this.A00.end();
        }
        return true;
    }

    public AnimatorSet A0J(View view, View view2, boolean z2, boolean z3) {
        Property property;
        float[] fArr;
        FabTransformationScrimBehavior fabTransformationScrimBehavior = (FabTransformationScrimBehavior) this;
        ArrayList A0u = AnonymousClass000.A0u();
        C53672g5 r4 = z2 ? fabTransformationScrimBehavior.A01 : fabTransformationScrimBehavior.A00;
        float f2 = 0.0f;
        if (z2) {
            if (!z3) {
                view2.setAlpha(0.0f);
            }
            property = View.ALPHA;
            fArr = new float[1];
            f2 = 1.0f;
        } else {
            property = View.ALPHA;
            fArr = new float[1];
        }
        fArr[0] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, fArr);
        r4.A00(ofFloat);
        A0u.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C53702g8.A00(animatorSet, A0u);
        animatorSet.addListener(new AnonymousClass3KD(view2, fabTransformationScrimBehavior, z2));
        return animatorSet;
    }
}
