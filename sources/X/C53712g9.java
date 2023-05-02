package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;

/* renamed from: X.2g9  reason: invalid class name and case insensitive filesystem */
public class C53712g9 extends C018408p {
    public static final double A0F = Math.cos(Math.toRadians(45.0d));
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Path A05;
    public boolean A06 = true;
    public boolean A07 = true;
    public boolean A08 = false;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final RectF A0E;

    public C53712g9(Context context, Drawable drawable, float f2, float f3, float f4) {
        super(drawable);
        this.A0B = AnonymousClass00T.A00(context, R.color.color01c9);
        this.A0A = AnonymousClass00T.A00(context, R.color.color01c8);
        this.A09 = AnonymousClass00T.A00(context, R.color.color01c7);
        Paint paint = new Paint(5);
        this.A0C = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A00 = (float) Math.round(f2);
        this.A0E = new RectF();
        Paint paint2 = new Paint(paint);
        this.A0D = paint2;
        paint2.setAntiAlias(false);
        A00(f3, f4);
    }

    public void A00(float f2, float f3) {
        if (f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        int round = Math.round(f2);
        if (round % 2 == 1) {
            round--;
        }
        float f4 = (float) round;
        int round2 = Math.round(f3);
        if (round2 % 2 == 1) {
            round2--;
        }
        float f5 = (float) round2;
        if (f4 > f5) {
            if (!this.A08) {
                this.A08 = true;
            }
            f4 = f5;
        }
        if (this.A02 != f4 || this.A01 != f5) {
            this.A02 = f4;
            this.A01 = f5;
            this.A04 = (float) Math.round(f4 * 1.5f);
            this.A07 = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.A07) {
            Rect bounds = getBounds();
            float f2 = this.A01;
            float f3 = 1.5f * f2;
            RectF rectF = this.A0E;
            rectF.set(((float) bounds.left) + f2, ((float) bounds.top) + f3, ((float) bounds.right) - f2, ((float) bounds.bottom) - f3);
            this.A00.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            float f4 = this.A00;
            float f5 = -f4;
            RectF rectF2 = new RectF(f5, f5, f4, f4);
            RectF rectF3 = new RectF(rectF2);
            float f6 = -this.A04;
            rectF3.inset(f6, f6);
            Path path = this.A05;
            if (path == null) {
                this.A05 = new Path();
            } else {
                path.reset();
            }
            this.A05.setFillType(Path.FillType.EVEN_ODD);
            this.A05.moveTo(f5, 0.0f);
            this.A05.rLineTo(-this.A04, 0.0f);
            this.A05.arcTo(rectF3, 180.0f, 90.0f, false);
            this.A05.arcTo(rectF2, 270.0f, -90.0f, false);
            this.A05.close();
            float f7 = -rectF3.top;
            if (f7 > 0.0f) {
                float f8 = f4 / f7;
                this.A0C.setShader(new RadialGradient(0.0f, 0.0f, f7, new int[]{0, this.A0B, this.A0A, this.A09}, new float[]{0.0f, f8, ((1.0f - f8) / 2.0f) + f8, 1.0f}, Shader.TileMode.CLAMP));
            }
            Paint paint = this.A0D;
            float f9 = rectF2.top;
            float f10 = rectF3.top;
            float f11 = f10;
            paint.setShader(new LinearGradient(0.0f, f9, 0.0f, f11, new int[]{this.A0B, this.A0A, this.A09}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAntiAlias(false);
            this.A07 = false;
        }
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        float f12 = this.A03;
        RectF rectF4 = this.A0E;
        canvas2.rotate(f12, rectF4.centerX(), rectF4.centerY());
        float f13 = this.A00;
        float f14 = -f13;
        float f15 = f14 - this.A04;
        float f16 = f13 * 2.0f;
        boolean z2 = false;
        if (rectF4.width() - f16 > 0.0f) {
            z2 = true;
        }
        boolean z3 = false;
        if (rectF4.height() - f16 > 0.0f) {
            z3 = true;
        }
        float f17 = this.A02;
        float f18 = f13 / ((f17 - (0.5f * f17)) + f13);
        float f19 = f13 / ((f17 - (0.25f * f17)) + f13);
        float f20 = f13 / ((f17 - (f17 * 1.0f)) + f13);
        int save2 = canvas2.save();
        canvas2.translate(rectF4.left + f13, rectF4.top + f13);
        canvas2.scale(f18, f19);
        Path path2 = this.A05;
        Paint paint2 = this.A0C;
        canvas2.drawPath(path2, paint2);
        if (z2) {
            canvas2.scale(1.0f / f18, 1.0f);
            canvas2.drawRect(0.0f, f15, rectF4.width() - f16, f14, this.A0D);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas2.save();
        canvas2.translate(rectF4.right - f13, rectF4.bottom - f13);
        canvas2.scale(f18, f20);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.A05, paint2);
        if (z2) {
            canvas2.scale(1.0f / f18, 1.0f);
            canvas2.drawRect(0.0f, f15, rectF4.width() - f16, f14 + this.A04, this.A0D);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas2.save();
        canvas2.translate(rectF4.left + f13, rectF4.bottom - f13);
        canvas2.scale(f18, f20);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.A05, paint2);
        if (z3) {
            canvas2.scale(1.0f / f20, 1.0f);
            canvas2.drawRect(0.0f, f15, rectF4.height() - f16, f14, this.A0D);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas2.save();
        canvas2.translate(rectF4.right - f13, rectF4.top + f13);
        canvas2.scale(f18, f19);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.A05, paint2);
        if (z3) {
            canvas2.scale(1.0f / f19, 1.0f);
            canvas2.drawRect(0.0f, f15, rectF4.height() - f16, f14, this.A0D);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(save);
        super.draw(canvas2);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        float f2 = this.A01;
        float f3 = this.A00;
        boolean z2 = this.A06;
        float f4 = 1.5f * f2;
        if (z2) {
            f4 = (float) (((double) f4) + ((1.0d - A0F) * ((double) f3)));
        }
        int ceil = (int) Math.ceil((double) f4);
        if (z2) {
            f2 = (float) (((double) f2) + ((1.0d - A0F) * ((double) f3)));
        }
        int ceil2 = (int) Math.ceil((double) f2);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public void onBoundsChange(Rect rect) {
        this.A07 = true;
    }

    public void setAlpha(int i2) {
        super.setAlpha(i2);
        this.A0C.setAlpha(i2);
        this.A0D.setAlpha(i2);
    }
}
