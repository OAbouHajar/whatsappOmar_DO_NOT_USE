package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass2Ut;
import X.C13680ns;
import X.C45902Bo;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.calling.callgrid.view.PipViewContainer;

public class IDxUListenerShape0S0204000_2_I0 implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public final int A06 = 0;

    public IDxUListenerShape0S0204000_2_I0(View view, PipViewContainer pipViewContainer, int i2, int i3) {
        this.A05 = pipViewContainer;
        this.A04 = view;
        this.A01 = i2;
        this.A00 = i3;
    }

    public IDxUListenerShape0S0204000_2_I0(ViewGroup.LayoutParams layoutParams, AnonymousClass2Ut r3, int i2, int i3, int i4, int i5) {
        this.A04 = r3;
        this.A05 = layoutParams;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A06 != 0) {
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.A05;
            int i2 = this.A00;
            int i3 = this.A01;
            int i4 = this.A02;
            int i5 = this.A03;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float f2 = 1.0f - animatedFraction;
            layoutParams.width = (int) ((((float) i2) * animatedFraction) + (((float) i3) * f2));
            layoutParams.height = (int) ((animatedFraction * ((float) i4)) + (f2 * ((float) i5)));
            ((AnonymousClass2Ut) this.A04).A04.setLayoutParams(layoutParams);
            return;
        }
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        PipViewContainer pipViewContainer = (PipViewContainer) this.A05;
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(pipViewContainer);
        AnonymousClass013 r6 = pipViewContainer.A07;
        AnonymousClass00B.A06(r6);
        if (animatedFraction2 == 0.0f) {
            this.A03 = A0O.topMargin;
            this.A02 = C13680ns.A1Z(r6) ? A0O.leftMargin : A0O.rightMargin;
            pipViewContainer.getWidth();
            pipViewContainer.getHeight();
        }
        C45902Bo.A09((View) this.A04, r6, ((int) (((float) this.A01) * animatedFraction2)) + this.A02, A0O.topMargin, C13680ns.A1Z(r6) ? A0O.rightMargin : A0O.leftMargin, A0O.bottomMargin);
        ViewGroup.MarginLayoutParams A0O2 = AnonymousClass000.A0O(pipViewContainer);
        A0O2.topMargin = this.A03 + ((int) (((float) this.A00) * animatedFraction2));
        pipViewContainer.setLayoutParams(A0O2);
    }
}
