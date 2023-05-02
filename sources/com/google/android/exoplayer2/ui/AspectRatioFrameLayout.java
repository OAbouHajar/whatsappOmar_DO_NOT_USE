package com.google.android.exoplayer2.ui;

import X.AnonymousClass55S;
import X.AnonymousClass5LU;
import X.C814748l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout {
    public float A00;
    public int A01;
    public AnonymousClass5LU A02;
    public final AnonymousClass55S A03;

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C814748l.A00, 0, 0);
            try {
                this.A01 = obtainStyledAttributes.getInt(1, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A03 = new AnonymousClass55S(this);
    }

    public int getResizeMode() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r8 > 0.0f) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r8 > 0.0f) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            super.onMeasure(r11, r12)
            float r0 = r10.A00
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            int r4 = r10.getMeasuredWidth()
            int r3 = r10.getMeasuredHeight()
            float r7 = (float) r4
            float r6 = (float) r3
            float r0 = r7 / r6
            float r5 = r10.A00
            float r8 = r5 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 - r0
            float r1 = java.lang.Math.abs(r8)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0037
            X.55S r1 = r10.A03
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0036
            r0 = 1
            r1.A00 = r0
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r1.A01
            r0.post(r1)
        L_0x0036:
            return
        L_0x0037:
            int r1 = r10.A01
            r2 = 1
            if (r1 == 0) goto L_0x0065
            if (r1 == r2) goto L_0x0069
            r0 = 2
            if (r1 == r0) goto L_0x0048
            r0 = 4
            if (r1 != r0) goto L_0x004a
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
        L_0x0048:
            float r6 = r6 * r5
            int r4 = (int) r6
        L_0x004a:
            X.55S r1 = r10.A03
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0057
            r1.A00 = r2
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r1.A01
            r0.post(r1)
        L_0x0057:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r1, r0)
            return
        L_0x0065:
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0048
        L_0x0069:
            float r7 = r7 / r5
            int r3 = (int) r7
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f2) {
        if (this.A00 != f2) {
            this.A00 = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(AnonymousClass5LU r1) {
        this.A02 = r1;
    }

    public void setResizeMode(int i2) {
        if (this.A01 != i2) {
            this.A01 = i2;
            requestLayout();
        }
    }
}
