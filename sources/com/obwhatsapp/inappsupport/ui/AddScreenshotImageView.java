package com.obwhatsapp.inappsupport.ui;

import X.AnonymousClass00T;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

public class AddScreenshotImageView extends WaImageView {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Bitmap A07;
    public BitmapShader A08;
    public Matrix A09;
    public Paint A0A;
    public Paint A0B;
    public Paint A0C;
    public Paint A0D;
    public RectF A0E;
    public RectF A0F;
    public boolean A0G;
    public final ImageView.ScaleType A0H;

    public AddScreenshotImageView(Context context) {
        super(context);
        A02();
        this.A0H = ImageView.ScaleType.CENTER;
        this.A0E = new RectF();
        this.A0F = new RectF();
        this.A0A = new Paint(1);
        this.A0B = new Paint(1);
        this.A0C = new Paint(1);
        this.A0D = new Paint(1);
        this.A09 = new Matrix();
        A05();
        A04();
    }

    public AddScreenshotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0H = ImageView.ScaleType.CENTER;
        this.A0E = new RectF();
        this.A0F = new RectF();
        this.A0A = new Paint(1);
        this.A0B = new Paint(1);
        this.A0C = new Paint(1);
        this.A0D = new Paint(1);
        this.A09 = new Matrix();
        A05();
        A04();
    }

    public AddScreenshotImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A0H = ImageView.ScaleType.CENTER;
        this.A0E = new RectF();
        this.A0F = new RectF();
        this.A0A = new Paint(1);
        this.A0B = new Paint(1);
        this.A0C = new Paint(1);
        this.A0D = new Paint(1);
        this.A09 = new Matrix();
        A05();
        A04();
    }

    public AddScreenshotImageView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public final void A04() {
        super.setScaleType(this.A0H);
        Resources resources = getResources();
        Drawable drawable = resources.getDrawable(R.drawable.ic_action_add);
        drawable.setColorFilter(resources.getColor(R.color.color0706), PorterDuff.Mode.SRC_IN);
        super.setImageDrawable(drawable);
        super.setContentDescription(getContext().getString(R.string.str06c3));
    }

    public final void A05() {
        this.A0A.setColor(AnonymousClass00T.A00(getContext(), R.color.color0703));
        this.A0B.setColor(AnonymousClass00T.A00(getContext(), R.color.color0704));
        this.A0C.setColor(AnonymousClass00T.A00(getContext(), R.color.color0705));
        this.A06 = getResources().getDimensionPixelSize(R.dimen.dimen06fc);
        this.A04 = getResources().getDimensionPixelSize(R.dimen.dimen06fb);
        this.A03 = getResources().getDimensionPixelSize(R.dimen.dimen06fa);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06f9);
        this.A05 = dimensionPixelSize;
        float f2 = (float) this.A04;
        float f3 = (float) this.A06;
        this.A00 = f2 * ((f3 - (((float) dimensionPixelSize) * 2.0f)) / f3);
    }

    public final void A06() {
        float width;
        float height;
        if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.A07;
            if (bitmap == null) {
                A04();
            } else {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.A08 = new BitmapShader(bitmap, tileMode, tileMode);
                Paint paint = this.A0D;
                paint.setAntiAlias(true);
                paint.setShader(this.A08);
                this.A01 = this.A07.getHeight();
                this.A02 = this.A07.getWidth();
                Matrix matrix = this.A09;
                matrix.set((Matrix) null);
                RectF rectF = this.A0F;
                float f2 = 0.0f;
                if (((float) this.A02) * rectF.height() > rectF.width() * ((float) this.A01)) {
                    width = rectF.height() / ((float) this.A01);
                    f2 = (rectF.width() - (((float) this.A02) * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = rectF.width() / ((float) this.A02);
                    height = (rectF.height() - (((float) this.A01) * width)) * 0.5f;
                }
                matrix.setScale(width, width);
                matrix.postTranslate(((float) ((int) (f2 + 0.5f))) + rectF.left, ((float) ((int) (height + 0.5f))) + rectF.top);
                this.A08.setLocalMatrix(matrix);
            }
            invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.A07;
        RectF rectF = this.A0E;
        float f2 = (float) this.A04;
        if (bitmap == null) {
            canvas.drawRoundRect(rectF, f2, f2, this.A0A);
            canvas.drawCircle((float) (getMeasuredWidth() >> 1), (float) (getMeasuredHeight() >> 1), (float) (this.A03 >> 1), this.A0C);
            super.onDraw(canvas);
            return;
        }
        canvas.drawRoundRect(rectF, f2, f2, this.A0B);
        RectF rectF2 = this.A0F;
        float f3 = this.A00;
        canvas.drawRoundRect(rectF2, f3, f3, this.A0D);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        RectF rectF = this.A0E;
        float f2 = (float) this.A06;
        rectF.set(0.0f, 0.0f, f2, f2);
        RectF rectF2 = this.A0F;
        int i4 = this.A05;
        float f3 = (float) i4;
        float f4 = (float) (this.A06 - i4);
        rectF2.set(f3, f3, f4, f4);
        int i5 = this.A06;
        setMeasuredDimension(i5, i5);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        A06();
    }

    public void setScreenshot(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.A07 = bitmap;
        A06();
    }
}
