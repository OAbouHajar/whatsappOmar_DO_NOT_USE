package com.obwhatsapp.bloks;

import X.C13680ns;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.obwhatsapp.R;

public class BloksCameraOverlay extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Path A08;
    public Path A09;
    public String A0A;
    public final Paint A0B = C13680ns.A0E();

    public BloksCameraOverlay(Context context) {
        super(context);
        A00((String) null);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00((String) null);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00((String) null);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet, int i2, String str) {
        super(context, attributeSet, i2);
        A00(str);
    }

    public void A00(String str) {
        String str2 = str;
        this.A0A = str2;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        this.A07 = i2;
        int i3 = displayMetrics.heightPixels;
        this.A03 = i3;
        this.A01 = 125;
        if (TextUtils.equals(str2, "card")) {
            i2 = (this.A07 * 3) >> 2;
            i3 = this.A03 >> 2;
        } else if (TextUtils.equals(str2, "square")) {
            i2 = this.A07 - ((int) (displayMetrics.density * 32.0f));
            this.A01 = MotionEventCompat.ACTION_MASK;
            i3 = i2;
        } else if (TextUtils.equals(str2, "selfie")) {
            i2 = (this.A07 << 2) / 5;
            i3 = (this.A03 * 3) / 5;
            this.A01 = MotionEventCompat.ACTION_MASK;
        }
        int i4 = (this.A07 - i2) >> 1;
        this.A04 = i4;
        int i5 = (this.A03 - i3) >> 1;
        this.A06 = i5;
        this.A05 = i4 + i2;
        this.A02 = i5 + i3;
        this.A00 = C13680ns.A0D(this).getDimension(R.dimen.dimen0091);
        Path path = new Path();
        this.A08 = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.A08.addRect(new RectF(0.0f, 0.0f, (float) this.A07, (float) this.A03), Path.Direction.CW);
        Path path2 = this.A08;
        RectF rectF = new RectF((float) this.A04, (float) this.A06, (float) this.A05, (float) this.A02);
        float f2 = displayMetrics.density * 16.0f;
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF, f2, f2, direction);
        if (TextUtils.equals(str2, "selfie")) {
            int i6 = this.A04;
            int i7 = this.A06;
            int i8 = this.A05;
            int i9 = this.A02;
            float f3 = (float) i6;
            float f4 = (((float) (i8 - i6)) / 2.0f) + f3;
            float f5 = (float) i7;
            float f6 = (float) (i9 - i7);
            float f7 = 0.4f * f6;
            float f8 = f5 + f7;
            float f9 = 0.5f * f6;
            float f10 = (0.8f * f6) + f5;
            float f11 = f6 * 0.25f;
            float f12 = f11 / 10.0f;
            float f13 = f7 / 2.0f;
            float f14 = f9 / 2.0f;
            RectF rectF2 = new RectF(f4 - f13, f8 - f14, f13 + f4, f8 + f14);
            float f15 = (1.5f * f11) / 2.0f;
            float f16 = f11 / 2.0f;
            RectF rectF3 = new RectF(f4 - f15, f10 - f16, f4 + f15, f10 + f16);
            Path path3 = new Path();
            this.A09 = path3;
            path3.setFillType(Path.FillType.EVEN_ODD);
            this.A09.addOval(rectF2, direction);
            this.A09.addRoundRect(rectF3, f12, f12, direction);
            float f17 = f3;
            this.A09.addRect(f17, f5, (float) i8, (float) i9, direction);
        }
    }

    public void onDraw(Canvas canvas) {
        Paint paint = this.A0B;
        paint.setARGB(this.A01, 45, 52, 54);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.A08, paint);
        if (TextUtils.equals(this.A0A, "selfie")) {
            paint.setARGB(180, 50, 50, 50);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.A09, paint);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-2147418368);
        paint.setStrokeWidth(this.A00 * 2.0f);
    }
}
