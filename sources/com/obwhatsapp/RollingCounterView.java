package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.C13680ns;
import X.C13690nt;
import X.C84684Lm;
import X.C91164fT;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class RollingCounterView extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C84684Lm A05;
    public C84684Lm A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public final ValueAnimator A09 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public final ValueAnimator A0A = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public final Rect A0B = AnonymousClass000.A0J();

    public RollingCounterView(Context context) {
        super(context);
        A00();
    }

    public RollingCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public RollingCounterView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    private void A00() {
        this.A07 = new TextEmojiLabel(getContext());
        this.A08 = new TextEmojiLabel(getContext());
        super.addView(this.A07);
        super.addView(this.A08);
        C13690nt.A0o(this.A09, this, 2);
    }

    private void setupWidthAnimator(int i2) {
        int measuredWidth = this.A07.getMeasuredWidth();
        int measuredHeight = this.A07.getMeasuredHeight();
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(this);
        int i3 = A0O.leftMargin;
        int i4 = A0O.rightMargin;
        ValueAnimator valueAnimator = this.A0A;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.addUpdateListener(new C91164fT(this, i2 - measuredWidth, measuredWidth, measuredHeight, i3, i4));
    }

    public String A01(int i2) {
        return Integer.toString(i2);
    }

    public final void A02() {
        C84684Lm r0 = this.A05;
        if (r0 == null) {
            AnonymousClass00B.A0E(AnonymousClass000.A0V("finishedAnimationl called when currentAnimationInfo is null! This should never occur."));
            return;
        }
        int i2 = r0.A00;
        this.A00 = i2;
        this.A07.setText(A01(i2));
        this.A07.requestLayout();
        this.A08.requestLayout();
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(this);
        A0O.leftMargin = this.A01;
        A0O.rightMargin = this.A02;
        setLayoutParams(A0O);
        C84684Lm r1 = this.A06;
        if (r1 != null) {
            this.A06 = null;
            A03(r1);
            return;
        }
        this.A05 = null;
    }

    public final void A03(C84684Lm r9) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A05 = r9;
        this.A08.setText(A01(r9.A00));
        C13680ns.A12(this.A07);
        C13680ns.A12(this.A08);
        long j2 = r9.A02;
        if (j2 == 0 && r9.A03 == 0) {
            int measuredWidth = this.A08.getMeasuredWidth();
            int measuredHeight = this.A08.getMeasuredHeight();
            int i2 = this.A01;
            int i3 = this.A02;
            ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(this);
            A0O.width = measuredWidth;
            A0O.height = measuredHeight;
            A0O.leftMargin = i2;
            A0O.rightMargin = i3;
            this.A0B.set(0, 0, measuredWidth, measuredHeight);
            setLayoutParams(A0O);
            A02();
            return;
        }
        int measuredWidth2 = this.A08.getMeasuredWidth() - this.A07.getMeasuredWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        if (measuredWidth2 != 0) {
            setupWidthAnimator(this.A08.getMeasuredWidth());
            Animator[] animatorArr = new Animator[2];
            if (measuredWidth2 > 0) {
                animatorArr[0] = this.A0A;
                valueAnimator2 = this.A09;
                valueAnimator = valueAnimator2;
            } else {
                valueAnimator = this.A09;
                animatorArr[0] = valueAnimator;
                valueAnimator2 = this.A0A;
            }
            animatorArr[1] = valueAnimator2;
            animatorSet.playSequentially(animatorArr);
        } else {
            valueAnimator = this.A09;
            animatorSet.play(valueAnimator);
        }
        this.A0A.setDuration(r9.A03);
        valueAnimator.setDuration(j2);
        animatorSet.start();
    }

    @Deprecated
    public void addView(View view) {
        super.addView(view);
    }

    @Deprecated
    public void addView(View view, int i2) {
        super.addView(view, i2);
    }

    @Deprecated
    public void addView(View view, int i2, int i3) {
        super.addView(view, i2, i3);
    }

    @Deprecated
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    @Deprecated
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        if (view == this.A07 || view == this.A08) {
            C84684Lm r0 = this.A05;
            int i2 = r0 == null ? 0 : r0.A01;
            ValueAnimator valueAnimator = this.A09;
            float A042 = valueAnimator.isRunning() ? AnonymousClass000.A04(valueAnimator.getAnimatedValue()) : 0.0f;
            if (view == this.A08) {
                i2 = -i2;
                A042 = 1.0f - A042;
            }
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.A0B;
            if (rect.isEmpty()) {
                rect.set(0, 0, getMeasuredWidth(), measuredHeight);
            }
            canvas.save();
            canvas.clipRect(rect);
            canvas.translate(0.0f, ((float) (-measuredHeight)) * A042 * ((float) i2));
            view.draw(canvas);
            canvas.restore();
            if (valueAnimator.isRunning()) {
                invalidate();
                return true;
            }
        } else {
            AnonymousClass00B.A0E(AnonymousClass000.A0T("drawChild given something other than primary/secondary textview"));
        }
        return false;
    }

    public String getPrimaryText() {
        if (TextUtils.isEmpty(this.A07.getText())) {
            return null;
        }
        return C13690nt.A0b(this.A07);
    }

    public void setAnimationInterpolator(TimeInterpolator timeInterpolator) {
        this.A09.setInterpolator(timeInterpolator);
        this.A0A.setInterpolator(timeInterpolator);
    }

    public void setTextColor(int i2) {
        this.A07.setTextColor(i2);
        this.A08.setTextColor(i2);
    }
}
