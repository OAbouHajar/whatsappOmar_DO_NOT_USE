package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass01V;
import X.AnonymousClass4BW;
import X.C006002o;
import X.C16150sX;
import X.C16210se;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.obwhatsapp.R;

public class WallpaperImagePreview extends C006002o implements AnonymousClass006 {
    public AnonymousClass01V A00;
    public C52662eE A01;
    public boolean A02;
    public boolean A03;
    public final Path A04;
    public final RectF A05;
    public final float[] A06;

    public WallpaperImagePreview(Context context) {
        this(context, (AttributeSet) null);
    }

    public WallpaperImagePreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WallpaperImagePreview(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C16150sX.A0T(C52652eD.A00(generatedComponent()));
        }
        this.A04 = AnonymousClass000.A0I();
        this.A05 = AnonymousClass000.A0K();
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.A06 = fArr;
        this.A03 = false;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.dimen084b);
        fArr[4] = dimensionPixelSize;
        fArr[5] = dimensionPixelSize;
        fArr[6] = dimensionPixelSize;
        fArr[7] = dimensionPixelSize;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0L);
        try {
            this.A03 = obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        if (this.A03) {
            canvas.clipPath(this.A04);
        }
        super.onDraw(canvas);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.A03) {
            Path path = this.A04;
            path.reset();
            RectF rectF = this.A05;
            rectF.right = (float) getMeasuredWidth();
            rectF.bottom = (float) getMeasuredHeight();
            path.addRoundRect(rectF, this.A06, Path.Direction.CW);
            path.close();
        }
    }

    public boolean setFrame(int i2, int i3, int i4, int i5) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Point A002 = C16210se.A00(getContext());
            float f2 = (float) A002.x;
            float f3 = (float) A002.y;
            float f4 = ((float) (i4 - i2)) / f2;
            float max = Math.max(f2 / intrinsicWidth, f3 / intrinsicHeight) * f4;
            Matrix imageMatrix = getImageMatrix();
            float f5 = 0.0f;
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            float f6 = ((f2 * f4) - (intrinsicWidth * max)) / 2.0f;
            float f7 = ((f3 * f4) - (intrinsicHeight * max)) / 2.0f;
            if (getResources().getConfiguration().orientation != 2) {
                f5 = f7;
            }
            imageMatrix.postTranslate(f6, f5);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i2, i3, i4, i5);
    }

    public void setRoundBottomCorners(boolean z2) {
        this.A03 = z2;
        invalidate();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }
}
