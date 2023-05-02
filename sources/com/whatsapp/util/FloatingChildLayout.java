package com.whatsapp.util;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.C15450qv;
import X.C52662eE;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;

public class FloatingChildLayout extends FrameLayout implements AnonymousClass006 {
    public static final boolean A0C = C15450qv.A03();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ValueAnimator A06;
    public Rect A07;
    public View.OnTouchListener A08;
    public View A09;
    public C52662eE A0A;
    public boolean A0B;

    public FloatingChildLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.A07 = new Rect();
        this.A02 = 0;
        this.A06 = null;
        this.A03 = 0;
        Resources resources = getResources();
        this.A05 = -1;
        this.A01 = (resources.getInteger(17694720) * 11) / 10;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 127});
        this.A06 = ofInt;
        ofInt.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 28));
        super.setBackgroundDrawable(new ColorDrawable(0));
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A0B) {
            this.A0B = true;
            generatedComponent();
        }
    }

    private Rect getTargetInWindow() {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect(this.A07);
        rect2.offset(-rect.left, -rect.top);
        return rect2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r13.A04 == 0) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r13.A04 == 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.Runnable r14, boolean r15) {
        /*
            r13 = this;
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r15 == 0) goto L_0x011a
            android.graphics.Rect r0 = r13.A07
            int r0 = r0.width()
            float r6 = (float) r0
            android.view.View r0 = r13.A09
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0015:
            r9 = 17563654(0x10c0006, float:2.5713956E-38)
            boolean r12 = A0C
            if (r12 == 0) goto L_0x0021
            int r2 = r13.A04
            r0 = 1
            if (r2 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r10 = 2
            r8 = 1
            if (r0 == 0) goto L_0x007e
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.sqrt(r2)
            android.view.View r0 = r13.A09
            int r2 = r0.getWidth()
            android.view.View r0 = r13.A09
            int r0 = r0.getHeight()
            int r0 = java.lang.Math.max(r2, r0)
            double r2 = (double) r0
            double r4 = r4 * r2
            float r11 = (float) r4
            r3 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r3
            android.view.View r0 = r13.A09
            int r2 = r0.getWidth()
            android.view.View r0 = r13.A09
            int r0 = r0.getHeight()
            int r0 = java.lang.Math.min(r2, r0)
            float r4 = (float) r0
            int r0 = r13.A04
            if (r0 != r8) goto L_0x0058
            float r4 = r4 / r3
        L_0x0058:
            if (r15 != 0) goto L_0x005d
            r0 = r4
            r4 = r11
            r11 = r0
        L_0x005d:
            android.view.View r3 = r13.A09
            int r2 = r3.getWidth()
            int r2 = r2 / r10
            android.view.View r0 = r13.A09
            int r0 = r0.getWidth()
            int r0 = r0 / r10
            android.animation.Animator r3 = android.view.ViewAnimationUtils.createCircularReveal(r3, r2, r0, r11, r4)
            if (r15 == 0) goto L_0x007b
            r2 = 26
            com.facebook.redex.IDxLAdapterShape3S0100000_2_I0 r0 = new com.facebook.redex.IDxLAdapterShape3S0100000_2_I0
            r0.<init>(r13, r2)
            r3.addListener(r0)
        L_0x007b:
            r3.start()
        L_0x007e:
            int[] r4 = new int[r10]
            android.view.View r0 = r13.A09
            r0.getLocationOnScreen(r4)
            r5 = 0
            r11 = 0
            android.graphics.Rect r2 = r13.A07
            int r3 = r2.left
            r0 = r4[r11]
            int r3 = r3 - r0
            int r10 = r2.top
            r0 = r4[r8]
            int r10 = r10 - r0
            if (r15 != 0) goto L_0x0117
            if (r12 != 0) goto L_0x009c
            android.view.View r0 = r13.A09
            r0.setAlpha(r5)
        L_0x009c:
            r11 = r3
            r2 = 0
            r3 = 0
        L_0x009f:
            if (r12 == 0) goto L_0x00a6
            int r4 = r13.A04
            r0 = 1
            if (r4 != 0) goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x0111
            if (r15 != 0) goto L_0x0111
            android.view.View r4 = r13.A09
            float r0 = r13.A00
            r4.setAlpha(r0)
        L_0x00b3:
            android.view.View r4 = r13.A09
            float r0 = (float) r11
            r4.setTranslationX(r0)
            android.view.View r4 = r13.A09
            float r0 = (float) r10
            r4.setTranslationY(r0)
            android.view.View r0 = r13.A09
            r0.setPivotX(r5)
            android.view.View r0 = r13.A09
            r0.setPivotY(r5)
            android.view.View r0 = r13.A09
            r0.setScaleX(r1)
            android.view.View r0 = r13.A09
            r0.setScaleY(r1)
            android.view.View r0 = r13.A09
            android.view.ViewPropertyAnimator r4 = r0.animate()
            int r0 = r13.A01
            long r0 = (long) r0
            android.view.ViewPropertyAnimator r1 = r4.setDuration(r0)
            android.content.Context r0 = r13.getContext()
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r0, r9)
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r6)
            android.view.ViewPropertyAnimator r1 = r0.scaleY(r6)
            float r0 = (float) r3
            android.view.ViewPropertyAnimator r1 = r1.translationX(r0)
            float r0 = (float) r2
            android.view.ViewPropertyAnimator r0 = r1.translationY(r0)
            if (r8 == 0) goto L_0x0104
            if (r15 == 0) goto L_0x0104
            float r7 = r13.A00
        L_0x0104:
            android.view.ViewPropertyAnimator r1 = r0.alpha(r7)
            com.facebook.redex.IDxLAdapterShape0S0210000_2_I0 r0 = new com.facebook.redex.IDxLAdapterShape0S0210000_2_I0
            r0.<init>(r13, r14, r15)
            r1.setListener(r0)
            return
        L_0x0111:
            android.view.View r0 = r13.A09
            r0.setAlpha(r7)
            goto L_0x00b3
        L_0x0117:
            r2 = r10
            r10 = 0
            goto L_0x009f
        L_0x011a:
            r6 = 1065353216(0x3f800000, float:1.0)
            android.graphics.Rect r0 = r13.A07
            int r0 = r0.width()
            float r1 = (float) r0
            android.view.View r0 = r13.A09
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.FloatingChildLayout.A00(java.lang.Runnable, boolean):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0A;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public View getChild() {
        return this.A09;
    }

    public int getTopPosition() {
        return this.A05;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(16908290);
        this.A09 = findViewById;
        findViewById.setDuplicateParentStateEnabled(true);
        if (!A0C) {
            this.A09.setAlpha(0.0f);
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int height;
        int centerX;
        int centerY;
        View view = this.A09;
        Rect targetInWindow = getTargetInWindow();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = this.A05;
        if (i6 >= 0) {
            centerX = (getWidth() - measuredWidth) >> 1;
            centerY = this.A05;
        } else if (i6 == -1) {
            centerX = targetInWindow.centerX() - (measuredWidth >> 1);
            centerY = targetInWindow.centerY() - Math.round(((float) measuredHeight) * 0.75f);
        } else if (i6 == -2) {
            width = (getWidth() - measuredWidth) >> 1;
            height = (getHeight() - measuredHeight) >> 1;
            view.layout(width, height, view.getMeasuredWidth() + width, view.getMeasuredHeight() + height);
        } else {
            return;
        }
        int width2 = getWidth();
        width = measuredWidth > width2 ? (width2 - measuredWidth) >> 1 : Math.min(Math.max(centerX, 0), width2 - measuredWidth);
        int height2 = getHeight();
        height = measuredHeight > height2 ? (height2 - measuredHeight) >> 1 : Math.min(Math.max(centerY, 0), height2 - measuredHeight);
        view.layout(width, height, view.getMeasuredWidth() + width, view.getMeasuredHeight() + height);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.A08;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    public void setBackground(Drawable drawable) {
        AnonymousClass00B.A0B("don't setBackground(), it is managed internally", false);
    }

    public void setBackgroundColorAlpha(int i2) {
        setBackgroundColor(i2 << 24);
    }

    public void setChildTargetScreen(Rect rect) {
        this.A07 = rect;
        requestLayout();
    }

    public void setOnOutsideTouchListener(View.OnTouchListener onTouchListener) {
        this.A08 = onTouchListener;
    }

    public void setRevealAnimation(int i2) {
        this.A04 = i2;
    }

    public void setStartingAlpha(float f2) {
        this.A00 = f2;
    }

    public void setTopPosition(int i2) {
        this.A05 = i2;
    }
}
