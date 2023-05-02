package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1DU;
import X.C004601z;
import X.C13690nt;
import X.C18450wi;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.calling.callgrid.view.FocusViewContainer;
import com.obwhatsapp.components.AutoScrollView;

public class IDxCListenerShape83S0200000_1_I0 implements View.OnLayoutChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape83S0200000_1_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        View view2 = view;
        if (this.A02 != 0) {
            C18450wi.A0H(view2, 0);
            view2.removeOnLayoutChangeListener(this);
            AutoScrollView autoScrollView = (AutoScrollView) this.A01;
            boolean A1P = AnonymousClass000.A1P(C004601z.A06(autoScrollView.getRootView()));
            autoScrollView.A03 = A1P;
            HorizontalScrollView horizontalScrollView = autoScrollView.A00;
            C004601z.A0f(horizontalScrollView, A1P ^ true ? 1 : 0);
            WaTextView waTextView = autoScrollView.A0A;
            int width = waTextView.getWidth() + autoScrollView.A06;
            int i10 = 1;
            if (autoScrollView.A03) {
                i10 = -1;
            }
            int i11 = -i10;
            int i12 = autoScrollView.A04;
            int i13 = autoScrollView.A07;
            int i14 = i12 + width + i13;
            int i15 = autoScrollView.A05;
            if (i14 < i15) {
                ViewGroup.LayoutParams layoutParams = waTextView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i14;
                    waTextView.setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = horizontalScrollView.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = -2;
                        horizontalScrollView.setLayoutParams(layoutParams2);
                        waTextView.setTranslationX((float) (i13 * i11));
                        autoScrollView.A0B.setVisibility(8);
                    }
                }
                throw AnonymousClass000.A0W("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            autoScrollView.A02 = true;
            ViewGroup.LayoutParams layoutParams3 = horizontalScrollView.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = i15;
                horizontalScrollView.setLayoutParams(layoutParams3);
                float f2 = (float) ((i12 + i13) * i11);
                long j2 = autoScrollView.A08 * ((long) (width / i15));
                waTextView.setTranslationX(f2);
                autoScrollView.A0B.setTranslationX(waTextView.getTranslationX() + ((float) (width * i11)));
                AutoScrollView.A00(autoScrollView, f2, width, i10, i11, j2);
                if (i12 > 0) {
                    horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
                    horizontalScrollView.setFadingEdgeLength(i12);
                    horizontalScrollView.requestLayout();
                }
            }
            throw AnonymousClass000.A0W("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            horizontalScrollView.post(new RunnableRunnableShape6S0100000_I0_5(autoScrollView, 45));
            ((AnonymousClass1DU) this.A00).AIT();
            return;
        }
        FocusViewContainer focusViewContainer = (FocusViewContainer) this.A00;
        Rect rect = focusViewContainer.A00;
        view2.getGlobalVisibleRect(rect);
        Rect rect2 = (Rect) this.A01;
        int i16 = rect2.top - rect.top;
        int i17 = rect2.left - rect.left;
        float width2 = ((float) rect2.width()) / ((float) rect.width());
        float height = ((float) rect2.height()) / ((float) rect.height());
        focusViewContainer.A03.setAlpha(0.0f);
        focusViewContainer.A02.setAlpha(0.0f);
        FrameLayout frameLayout = focusViewContainer.A01;
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        frameLayout.setScaleX(width2);
        frameLayout.setScaleY(height);
        frameLayout.setTranslationX((float) i17);
        frameLayout.setTranslationY((float) i16);
        C13690nt.A0L(frameLayout.animate().setDuration(250)).setListener(new IDxLAdapterShape4S0100000_2_I1(this, 3)).setInterpolator(new DecelerateInterpolator(1.5f));
        frameLayout.removeOnLayoutChangeListener(this);
    }
}
