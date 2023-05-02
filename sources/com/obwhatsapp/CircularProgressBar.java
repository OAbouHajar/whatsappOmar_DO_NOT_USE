package com.obwhatsapp;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.C52662eE;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class CircularProgressBar extends ProgressBar implements AnonymousClass006 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public Rect A0E;
    public C52662eE A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public final Paint A0J;
    public final RectF A0K;

    public CircularProgressBar(Context context) {
        super(context);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
        this.A0K = new RectF();
        this.A0J = new Paint();
        this.A0G = null;
        this.A06 = 5.0f;
        this.A0I = false;
        this.A05 = 0.3f;
        this.A0E = new Rect();
        A00(context, (AttributeSet) null);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        this.A0K = new RectF();
        this.A0J = new Paint();
        this.A0G = null;
        this.A06 = 5.0f;
        this.A0I = false;
        this.A05 = 0.3f;
        this.A0E = new Rect();
        A00(context, attributeSet);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
        this.A0K = new RectF();
        this.A0J = new Paint();
        this.A0G = null;
        this.A06 = 5.0f;
        this.A0I = false;
        this.A05 = 0.3f;
        this.A0E = new Rect();
        A00(context, attributeSet);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        this.A08 = AnonymousClass00T.A00(context, R.color.color014d);
        this.A0C = AnonymousClass00T.A00(context, R.color.color014c);
        this.A0B = AnonymousClass00T.A00(context, R.color.color014b);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A06);
            this.A0C = obtainStyledAttributes.getInteger(1, this.A0C);
            this.A0B = obtainStyledAttributes.getInteger(0, this.A0B);
            this.A09 = obtainStyledAttributes.getInteger(2, this.A09);
            this.A06 = obtainStyledAttributes.getFloat(5, this.A06);
            this.A0A = obtainStyledAttributes.getInteger(3, this.A0A);
            this.A03 = obtainStyledAttributes.getDimension(4, this.A03);
            this.A08 = obtainStyledAttributes.getInteger(6, this.A08);
            obtainStyledAttributes.recycle();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0F;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0F = r0;
        }
        return r0.generatedComponent();
    }

    public String getCenterText() {
        return this.A0G;
    }

    public int getFillColor() {
        return this.A09;
    }

    public boolean getKnobEnabled() {
        return this.A0I;
    }

    public float getPaintStrokeFactor() {
        return this.A06;
    }

    public int getProgressBarBackgroundColor() {
        return this.A0B;
    }

    public int getProgressBarColor() {
        return this.A0C;
    }

    public void onDraw(Canvas canvas) {
        float f2;
        Paint paint = this.A0J;
        paint.setAntiAlias(true);
        Canvas canvas2 = canvas;
        if (this.A09 != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.A09);
            canvas2.drawArc(this.A0K, 0.0f, 360.0f, true, paint);
        }
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (isIndeterminate()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j2 = this.A0D;
            if (j2 == 0) {
                this.A0D = uptimeMillis;
                j2 = uptimeMillis;
            }
            long j3 = uptimeMillis - j2;
            float f3 = (((float) (j3 % 1333)) * 1.0f) / 1333.0f;
            if (f3 < 0.5f) {
                float sin = (float) Math.sin(((double) f3) * 3.141592653589793d);
                f2 = (((sin * sin) * sin) * sin) / 2.0f;
            } else {
                float sin2 = (float) Math.sin(((double) (f3 - 0.5f)) * 3.141592653589793d);
                f2 = ((((sin2 * sin2) * sin2) * sin2) / 2.0f) + 0.5f;
            }
            if (f2 < 0.5f) {
                this.A00 = f2 * 2.0f * 280.0f;
                this.A02 = -1.0f;
            } else {
                float f4 = this.A02;
                if (f4 < 0.0f) {
                    f4 = this.A01;
                    this.A02 = f4;
                }
                this.A00 = (1.0f - f2) * 2.0f * 280.0f;
                this.A01 = f4 + ((f2 - 0.5f) * 2.0f * 280.0f);
            }
            canvas2.rotate(((((float) (j3 % 2200)) * 1.0f) / 2200.0f) * 360.0f, (float) (getWidth() >> 1), (float) (getHeight() >> 1));
            paint.setAntiAlias(true);
            int i2 = this.A0B;
            if (i2 != 0) {
                paint.setColor(i2);
                paint.setStyle(Paint.Style.STROKE);
                canvas2.drawArc(this.A0K, 0.0f, 360.0f, false, paint);
            }
            int i3 = this.A0A;
            if (i3 != 0) {
                paint.setColor(i3);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth((this.A04 / this.A06) + (this.A03 * 2.0f));
                canvas2.drawArc(this.A0K, this.A01, this.A00, false, paint);
            }
            paint.setColor(this.A0C);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.A04 / this.A06);
            canvas2.drawArc(this.A0K, this.A01, this.A00, false, paint);
            invalidate();
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        if (this.A0B != 0) {
            paint.setStrokeWidth(this.A04 / this.A06);
            paint.setColor(this.A0B);
            canvas2.drawArc(this.A0K, ((((float) getProgress()) * 360.0f) / ((float) getMax())) + 270.0f, 360.0f - ((((float) getProgress()) * 360.0f) / ((float) getMax())), false, paint);
        }
        int i4 = this.A0A;
        if (i4 != 0) {
            paint.setColor(i4);
            paint.setStrokeWidth((this.A04 / this.A06) + (this.A03 * 2.0f));
            canvas2.drawArc(this.A0K, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, paint);
        }
        paint.setStrokeWidth(this.A04 / this.A06);
        paint.setColor(this.A0C);
        RectF rectF = this.A0K;
        canvas2.drawArc(rectF, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, paint);
        if (this.A0I) {
            paint.setColor(this.A0B);
            paint.setStyle(Paint.Style.FILL);
            double progress = (double) (((float) getProgress()) * ((float) (6.283185307179586d / ((double) getMax()))));
            canvas2.drawCircle((float) (((double) rectF.centerX()) + (((double) this.A04) * Math.sin(progress))), (float) (((double) rectF.centerY()) - (((double) this.A04) * Math.cos(progress))), 10.0f, paint);
        }
        if (this.A0G != null) {
            paint.setColor(this.A08);
            paint.setTextSize(this.A07);
            paint.setTextAlign(Paint.Align.CENTER);
            Typeface create = Typeface.create("sans-serif-light", 0);
            String str = this.A0G;
            int length = str.length();
            Rect rect = this.A0E;
            paint.getTextBounds(str, 0, length, rect);
            paint.setStyle(Paint.Style.FILL);
            String str2 = this.A0G;
            canvas2.drawText(str2, 0, str2.length(), rectF.centerX(), rectF.centerY() + (((float) rect.height()) * 0.5f), paint);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int paddingLeft = getPaddingLeft();
        float min = ((float) Math.min((i2 - paddingLeft) - getPaddingRight(), (i3 - getPaddingTop()) - getPaddingBottom())) / 2.0f;
        this.A04 = min;
        float f2 = min - (this.A05 * min);
        this.A04 = f2;
        float f3 = (float) (i2 >> 1);
        float f4 = (float) (i3 >> 1);
        this.A0K.set(f3 - f2, f4 - f2, f3 + f2, f4 + f2);
    }

    public void setCenterText(String str) {
        this.A0G = str;
        this.A07 = (float) getResources().getDimensionPixelSize(R.dimen.dimen065c);
    }

    public void setFillColor(int i2) {
        this.A09 = i2;
    }

    public void setKnobEnabled(boolean z2) {
        this.A0I = z2;
    }

    public void setPaintStrokeFactor(float f2) {
        this.A06 = f2;
    }

    public void setProgressBarBackgroundColor(int i2) {
        this.A0B = i2;
    }

    public void setProgressBarColor(int i2) {
        this.A0C = i2;
    }

    public void setRadiusFactor(float f2) {
        this.A05 = f2;
    }
}
