package com.facebook.shimmer;

import X.AnonymousClass3U1;
import X.AnonymousClass3U2;
import X.AnonymousClass48j;
import X.AnonymousClass4PG;
import X.C13700nu;
import X.C56322nS;
import X.C616439s;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ShimmerFrameLayout extends FrameLayout {
    public boolean A00 = true;
    public final Paint A01 = C13700nu.A05();
    public final C56322nS A02 = new C56322nS();

    public ShimmerFrameLayout(Context context) {
        super(context);
        A03(context, (AttributeSet) null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A03(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A03(context, attributeSet);
    }

    public void A00() {
        if (this.A00) {
            A02();
            this.A00 = false;
            invalidate();
        }
    }

    public void A01() {
        C56322nS r1 = this.A02;
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null && !valueAnimator.isStarted() && r1.getCallback() != null) {
            r1.A00.start();
        }
    }

    public void A02() {
        C56322nS r1 = this.A02;
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            r1.A00.cancel();
        }
    }

    public final void A03(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.A02.setCallback(this);
        if (attributeSet == null) {
            A04(new AnonymousClass3U1().A01());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass48j.A00, 0, 0);
        try {
            C616439s r0 = (!obtainStyledAttributes.hasValue(4) || !obtainStyledAttributes.getBoolean(4, false)) ? new AnonymousClass3U1() : new AnonymousClass3U2();
            r0.A00(obtainStyledAttributes);
            A04(r0.A01());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void A04(AnonymousClass4PG r3) {
        int i2;
        Paint paint;
        this.A02.A02(r3);
        if (r3 == null || !r3.A0H) {
            i2 = 0;
            paint = null;
        } else {
            i2 = 2;
            paint = this.A01;
        }
        setLayerType(i2, paint);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A00) {
            this.A02.draw(canvas);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A02.A00();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A02();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.A02.setBounds(0, 0, getWidth(), getHeight());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A02;
    }
}
