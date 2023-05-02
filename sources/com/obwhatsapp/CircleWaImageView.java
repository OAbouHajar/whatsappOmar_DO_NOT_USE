package com.obwhatsapp;

import X.AnonymousClass000;
import X.C13680ns;
import X.C13700nu;
import X.C55392jX;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircleWaImageView extends C55392jX {
    public static final Bitmap.Config A0A = Bitmap.Config.ARGB_8888;
    public static final ImageView.ScaleType A0B = ImageView.ScaleType.CENTER_CROP;
    public float A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public BitmapShader A04;
    public Matrix A05;
    public Paint A06;
    public boolean A07;
    public boolean A08;
    public final RectF A09;

    public CircleWaImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircleWaImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleWaImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A09 = AnonymousClass000.A0K();
        this.A06 = C13700nu.A05();
        this.A05 = AnonymousClass000.A0H();
        super.setScaleType(A0B);
        this.A07 = true;
        if (this.A08) {
            A05();
            this.A08 = false;
        }
    }

    public final void A04() {
        Drawable drawable = getDrawable();
        Bitmap bitmap = null;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), A0A);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap = createBitmap;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        this.A03 = bitmap;
        A05();
    }

    public final void A05() {
        float width;
        float height;
        if (!this.A07) {
            this.A08 = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.A03;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.A04 = new BitmapShader(bitmap, tileMode, tileMode);
                Paint paint = this.A06;
                paint.setAntiAlias(true);
                paint.setShader(this.A04);
                this.A01 = this.A03.getHeight();
                this.A02 = this.A03.getWidth();
                RectF rectF = this.A09;
                int A042 = C13680ns.A04(this);
                int A032 = C13680ns.A03(this);
                int min = Math.min(A042, A032);
                float paddingLeft = ((float) getPaddingLeft()) + (((float) (A042 - min)) / 2.0f);
                float paddingTop = ((float) getPaddingTop()) + (((float) (A032 - min)) / 2.0f);
                float f2 = (float) min;
                rectF.set(new RectF(paddingLeft, paddingTop, paddingLeft + f2, f2 + paddingTop));
                this.A00 = Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f);
                Matrix matrix = this.A05;
                matrix.set((Matrix) null);
                float f3 = 0.0f;
                if (((float) this.A02) * rectF.height() > rectF.width() * ((float) this.A01)) {
                    width = rectF.height() / ((float) this.A01);
                    f3 = (rectF.width() - (((float) this.A02) * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = rectF.width() / ((float) this.A02);
                    height = (rectF.height() - (((float) this.A01) * width)) * 0.5f;
                }
                matrix.setScale(width, width);
                matrix.postTranslate(((float) ((int) (f3 + 0.5f))) + rectF.left, ((float) ((int) (height + 0.5f))) + rectF.top);
                this.A04.setLocalMatrix(matrix);
            }
            invalidate();
        }
    }

    public ImageView.ScaleType getScaleType() {
        return A0B;
    }

    public void onDraw(Canvas canvas) {
        if (this.A03 != null) {
            RectF rectF = this.A09;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.A00, this.A06);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        A05();
    }

    public void setAdjustViewBounds(boolean z2) {
        if (z2) {
            throw AnonymousClass000.A0T("adjustViewBounds not supported.");
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        A04();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        A04();
    }

    public void setImageResource(int i2) {
        super.setImageResource(i2);
        A04();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        A04();
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        A05();
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
        A05();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != A0B) {
            throw AnonymousClass000.A0T(String.format("ScaleType %s not supported.", AnonymousClass000.A1a(scaleType)));
        }
    }
}
