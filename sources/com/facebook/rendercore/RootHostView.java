package com.facebook.rendercore;

import X.AnonymousClass3AI;
import X.C49832Wc;
import X.C61753Ae;
import X.C85034Mv;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class RootHostView extends C49832Wc {
    public static final int[] A01 = new int[2];
    public final C85034Mv A00;

    public RootHostView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RootHostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new C85034Mv(this);
    }

    public void offsetLeftAndRight(int i2) {
        super.offsetLeftAndRight(i2);
    }

    public void offsetTopAndBottom(int i2) {
        super.offsetTopAndBottom(i2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00.A04.A01();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.A04.A02();
    }

    public void onMeasure(int i2, int i3) {
        C85034Mv r7 = this.A00;
        int[] iArr = A01;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (View.MeasureSpec.getMode(i2) == 1073741824 && View.MeasureSpec.getMode(i3) == 1073741824) {
            r7.A02 = true;
            iArr[0] = size;
            iArr[1] = size2;
        } else {
            C61753Ae r0 = r7.A00;
            if (r0 != null) {
                r0.A01(i2, iArr, i3);
                r7.A02 = false;
            } else {
                super.onMeasure(i2, i3);
                return;
            }
        }
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    public void setRenderState(C61753Ae r4) {
        AnonymousClass3AI r1;
        C85034Mv r2 = this.A00;
        C61753Ae r12 = r2.A00;
        if (r12 != r4) {
            if (r12 != null) {
                r12.A09 = null;
            }
            r2.A00 = r4;
            if (r4 != null) {
                C85034Mv r0 = r4.A09;
                if (r0 == null || r0 == r2) {
                    r4.A09 = r2;
                    r1 = r4.A08;
                } else {
                    throw new RuntimeException("Must detach from previous host listener first");
                }
            } else {
                r1 = null;
            }
            if (r2.A01 != r1) {
                if (r1 == null) {
                    r2.A04.A03();
                }
                r2.A01 = r1;
                r2.A03.requestLayout();
            }
        }
    }

    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
    }
}
