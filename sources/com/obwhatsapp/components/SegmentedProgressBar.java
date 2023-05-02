package com.obwhatsapp.components;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass013;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C16150sX;
import X.C52652eD;
import X.C52662eE;
import X.C53072ew;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;

public class SegmentedProgressBar extends View implements AnonymousClass006 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AnimatorSet A08;
    public Bitmap A09;
    public AnonymousClass013 A0A;
    public C52662eE A0B;
    public boolean A0C;
    public float[] A0D;
    public int[] A0E;
    public final Paint A0F;
    public final RectF A0G;

    public SegmentedProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public SegmentedProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentedProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0C) {
            this.A0C = true;
            this.A0A = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
        this.A0F = C13700nu.A06(1);
        this.A0G = AnonymousClass000.A0K();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0J);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.A07 = dimensionPixelSize;
            if (dimensionPixelSize % 2 == 1) {
                this.A07 = dimensionPixelSize + 1;
            }
            this.A05 = obtainStyledAttributes.getInteger(2, 0);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A03 = obtainStyledAttributes.getInteger(0, 0);
            this.A02 = obtainStyledAttributes.getInteger(3, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = 1000;
        this.A00 = 300;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0B;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i2 = (width - paddingLeft) - paddingRight;
        int paddingTop = getPaddingTop() + (C13680ns.A03(this) >> 1);
        Paint paint = this.A0F;
        C13690nt.A0n(this.A02, paint);
        RectF rectF = this.A0G;
        int i3 = this.A07;
        int i4 = i3 >> 1;
        float f2 = (float) (paddingTop - i4);
        float f3 = (float) (i4 + paddingTop);
        rectF.set(0.0f, f2, (float) getWidth(), f3);
        Canvas canvas2 = canvas;
        canvas2.drawRect(rectF, paint);
        if (this.A0D != null && this.A0E != null) {
            int i5 = 0;
            float f4 = 0.0f;
            while (true) {
                float[] fArr = this.A0D;
                if (i5 >= fArr.length) {
                    break;
                }
                if (fArr[i5] != 0.0f) {
                    paint.setColor(this.A0E[i5]);
                    float f5 = (this.A0D[i5] / 100.0f) * ((float) i2);
                    if (isInEditMode() || C13680ns.A1Z(this.A0A)) {
                        float f6 = (float) paddingLeft;
                        rectF.set(f6 + f4, f2, f6 + f5 + f4, f3);
                        canvas2.drawRect(rectF, paint);
                        if (!(i5 == this.A0D.length - 1 && this.A06 == 100)) {
                            paint.setColor(this.A03);
                            float f7 = f5 + f4;
                            rectF.set(f7 - ((float) this.A04), f2, f7, f3);
                        }
                        f4 += f5;
                    } else {
                        float f8 = ((float) (width - paddingRight)) - f4;
                        float f9 = f8 - f5;
                        rectF.set(f9, f2, f8, f3);
                        canvas2.drawRect(rectF, paint);
                        if (!(i5 == this.A0D.length - 1 && this.A06 == 100)) {
                            paint.setColor(this.A03);
                            rectF.set(f9, f2, ((float) this.A04) + f9, f3);
                        }
                        f4 += f5;
                    }
                    canvas2.drawRect(rectF, paint);
                    f4 += f5;
                }
                i5++;
            }
        }
        int i6 = this.A05;
        paint.setColor(i6);
        if (this.A09 == null) {
            int width2 = getWidth();
            float height = rectF.height() / 2.0f;
            Bitmap createBitmap = Bitmap.createBitmap(width2, i3, Bitmap.Config.ARGB_8888);
            this.A09 = createBitmap;
            Canvas canvas3 = new Canvas(createBitmap);
            Paint A0E2 = C13680ns.A0E();
            A0E2.setColor(i6);
            A0E2.setXfermode((Xfermode) null);
            float f10 = (float) width2;
            float f11 = (float) i3;
            canvas3.drawRect(0.0f, 0.0f, f10, f11, A0E2);
            A0E2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas3.drawRoundRect(new RectF(0.0f, 0.0f, f10, f11), height, height, A0E2);
        }
        canvas2.drawBitmap(this.A09, 0.0f, 0.0f, paint);
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i3) == 0 ? getPaddingTop() + this.A07 + getPaddingBottom() : View.MeasureSpec.getSize(i3));
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.A09 = null;
    }
}
