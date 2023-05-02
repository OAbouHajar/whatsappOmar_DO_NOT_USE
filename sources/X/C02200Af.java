package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;

/* renamed from: X.0Af  reason: invalid class name and case insensitive filesystem */
public class C02200Af extends Drawable {
    public static C12320kC A0G;
    public static final double A0H = Math.cos(Math.toRadians(45.0d));
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public ColorStateList A04;
    public Paint A05;
    public Paint A06;
    public Paint A07;
    public Path A08;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B = false;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final RectF A0F;

    public C02200Af(ColorStateList colorStateList, Resources resources, float f2, float f3, float f4) {
        this.A0E = resources.getColor(R.color.color00fa);
        this.A0D = resources.getColor(R.color.color00f9);
        this.A0C = resources.getDimensionPixelSize(R.dimen.dimen0159);
        this.A07 = new Paint(5);
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.A04 = colorStateList;
        this.A07.setColor(colorStateList.getColorForState(getState(), this.A04.getDefaultColor()));
        Paint paint = new Paint(5);
        this.A05 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A00 = (float) ((int) (f2 + 0.5f));
        this.A0F = AnonymousClass000.A0K();
        Paint paint2 = new Paint(this.A05);
        this.A06 = paint2;
        paint2.setAntiAlias(false);
        A00(f3, f4);
    }

    public final void A00(float f2, float f3) {
        StringBuilder sb;
        if (f2 < 0.0f) {
            sb = AnonymousClass000.A0r("Invalid shadow size ");
            sb.append(f2);
        } else if (f3 >= 0.0f) {
            int i2 = (int) (f2 + 0.5f);
            if (i2 % 2 == 1) {
                i2--;
            }
            float f4 = (float) i2;
            int i3 = (int) (f3 + 0.5f);
            if (i3 % 2 == 1) {
                i3--;
            }
            float f5 = (float) i3;
            if (f4 > f5) {
                if (!this.A0B) {
                    this.A0B = true;
                }
                f4 = f5;
            }
            if (this.A02 != f4 || this.A01 != f5) {
                this.A02 = f4;
                this.A01 = f5;
                this.A03 = (float) ((int) ((f4 * 1.5f) + ((float) this.A0C) + 0.5f));
                this.A0A = true;
                invalidateSelf();
                return;
            }
            return;
        } else {
            sb = AnonymousClass000.A0r("Invalid max shadow size ");
            sb.append(f3);
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(". Must be >= 0", sb));
    }

    public void draw(Canvas canvas) {
        if (this.A0A) {
            Rect bounds = getBounds();
            float f2 = this.A01;
            float f3 = 1.5f * f2;
            this.A0F.set(((float) bounds.left) + f2, ((float) bounds.top) + f3, ((float) bounds.right) - f2, ((float) bounds.bottom) - f3);
            float f4 = this.A00;
            float f5 = -f4;
            RectF rectF = new RectF(f5, f5, f4, f4);
            RectF rectF2 = new RectF(rectF);
            float f6 = -this.A03;
            rectF2.inset(f6, f6);
            Path path = this.A08;
            if (path == null) {
                this.A08 = AnonymousClass000.A0I();
            } else {
                path.reset();
            }
            this.A08.setFillType(Path.FillType.EVEN_ODD);
            this.A08.moveTo(-this.A00, 0.0f);
            this.A08.rLineTo(-this.A03, 0.0f);
            this.A08.arcTo(rectF2, 180.0f, 90.0f, false);
            this.A08.arcTo(rectF, 270.0f, -90.0f, false);
            this.A08.close();
            float f7 = this.A00;
            float f8 = this.A03 + f7;
            Paint paint = this.A05;
            int i2 = this.A0E;
            int i3 = this.A0D;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f8, new int[]{i2, i2, i3}, new float[]{0.0f, f7 / f8, 1.0f}, tileMode));
            Paint paint2 = this.A06;
            float f9 = -this.A00;
            float f10 = this.A03;
            paint2.setShader(new LinearGradient(0.0f, f9 + f10, 0.0f, f9 - f10, new int[]{i2, i2, i3}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
            paint2.setAntiAlias(false);
            this.A0A = false;
        }
        Canvas canvas2 = canvas;
        canvas2.translate(0.0f, this.A02 / 2.0f);
        float f11 = this.A00;
        float f12 = (-f11) - this.A03;
        float f13 = f11 + ((float) this.A0C) + (this.A02 / 2.0f);
        RectF rectF3 = this.A0F;
        float f14 = f13 * 2.0f;
        boolean A1Q = AnonymousClass000.A1Q(((rectF3.width() - f14) > 0.0f ? 1 : ((rectF3.width() - f14) == 0.0f ? 0 : -1)));
        boolean A1Q2 = AnonymousClass000.A1Q(((rectF3.height() - f14) > 0.0f ? 1 : ((rectF3.height() - f14) == 0.0f ? 0 : -1)));
        int save = canvas2.save();
        canvas2.translate(rectF3.left + f13, rectF3.top + f13);
        Path path2 = this.A08;
        Paint paint3 = this.A05;
        canvas2.drawPath(path2, paint3);
        if (A1Q) {
            Canvas canvas3 = canvas2;
            float f15 = f12;
            canvas3.drawRect(0.0f, f15, rectF3.width() - f14, -this.A00, this.A06);
        }
        canvas2.restoreToCount(save);
        int save2 = canvas2.save();
        canvas2.translate(rectF3.right - f13, rectF3.bottom - f13);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.A08, paint3);
        if (A1Q) {
            Canvas canvas4 = canvas2;
            float f16 = f12;
            canvas4.drawRect(0.0f, f16, rectF3.width() - f14, (-this.A00) + this.A03, this.A06);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas2.save();
        canvas2.translate(rectF3.left + f13, rectF3.bottom - f13);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.A08, paint3);
        if (A1Q2) {
            Canvas canvas5 = canvas2;
            float f17 = f12;
            canvas5.drawRect(0.0f, f17, rectF3.height() - f14, -this.A00, this.A06);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas2.save();
        canvas2.translate(rectF3.right - f13, rectF3.top + f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.A08, paint3);
        if (A1Q2) {
            Canvas canvas6 = canvas2;
            float f18 = f12;
            canvas6.drawRect(0.0f, f18, rectF3.height() - f14, -this.A00, this.A06);
        }
        canvas2.restoreToCount(save4);
        canvas2.translate(0.0f, (-this.A02) / 2.0f);
        A0G.A8H(canvas2, this.A07, rectF3, this.A00);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        float f2 = this.A01;
        float f3 = this.A00;
        boolean z2 = this.A09;
        float f4 = 1.5f * f2;
        if (z2) {
            f4 = AnonymousClass000.A00(f4, f3);
        }
        int ceil = (int) Math.ceil((double) f4);
        if (z2) {
            f2 = AnonymousClass000.A00(f2, f3);
        }
        int ceil2 = (int) Math.ceil((double) f2);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.A04;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0A = true;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.A04;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.A07;
        if (paint.getColor() == colorForState) {
            return false;
        }
        paint.setColor(colorForState);
        this.A0A = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i2) {
        this.A07.setAlpha(i2);
        this.A05.setAlpha(i2);
        this.A06.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }
}
