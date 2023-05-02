package com.obwhatsapp.components;

import X.AnonymousClass013;
import X.AnonymousClass2TS;
import X.C53072ew;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;

public class RoundCornerProgressBar extends AnonymousClass2TS {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass013 A05;
    public boolean A06;
    public final Paint A07;
    public final RectF A08;

    public RoundCornerProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public RoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A06 = true;
        this.A00 = 0.0f;
        this.A02 = 0;
        this.A04 = 10;
        this.A03 = -15561602;
        this.A01 = -920588;
        this.A07 = new Paint(1);
        this.A08 = new RectF();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0I);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(2, this.A04);
            this.A03 = obtainStyledAttributes.getInteger(1, this.A03);
            this.A01 = obtainStyledAttributes.getInteger(0, this.A01);
            obtainStyledAttributes.recycle();
        }
    }

    public int getProgress() {
        return this.A02;
    }

    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f2 = (this.A00 / 100.0f) * ((float) ((width - paddingLeft) - paddingRight));
        float f3 = (isInEditMode() || (this.A05.A0T() ^ true)) ? ((float) paddingLeft) + f2 : (((float) width) - f2) - ((float) paddingRight);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingTop()) - getPaddingBottom()) >> 1);
        Paint paint = this.A07;
        paint.setColor(this.A01);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = this.A08;
        int i2 = this.A04 >> 1;
        float f4 = (float) (paddingTop - i2);
        float f5 = (float) (i2 + paddingTop);
        rectF.set(0.0f, f4, (float) getWidth(), f5);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        paint.setColor(this.A03);
        if (isInEditMode() || (!this.A05.A0T())) {
            rectF.set((float) paddingLeft, f4, f3, f5);
        } else {
            rectF.set(f3, f4, (float) (width - paddingRight), f5);
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i3) == 0 ? getPaddingTop() + this.A04 + getPaddingBottom() : View.MeasureSpec.getSize(i3));
    }

    public void setBackgroundColor(int i2) {
        this.A01 = i2;
    }

    public void setProgress(int i2) {
        if (i2 < 0 || i2 > 100) {
            throw new IllegalArgumentException("Progress must be between 0 and 100 inclusive");
        } else if (i2 != this.A02) {
            this.A02 = i2;
            if (!this.A06) {
                this.A00 = (float) i2;
            } else if (i2 > 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) i2});
                ofFloat.setDuration((long) ((int) Math.max(200.0f, (((float) this.A02) / 100.0f) * 650.0f)));
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 10));
                ofFloat.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 15));
                ofFloat.setStartDelay(300);
                ofFloat.start();
                return;
            } else {
                this.A00 = (float) i2;
                this.A06 = false;
            }
            invalidate();
        }
    }
}
