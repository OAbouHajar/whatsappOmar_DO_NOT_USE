package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.redex.IDxUListenerShape141S0100000_2_I1;

/* renamed from: X.2nS  reason: invalid class name and case insensitive filesystem */
public final class C56322nS extends Drawable {
    public ValueAnimator A00;
    public AnonymousClass4PG A01;
    public final ValueAnimator.AnimatorUpdateListener A02 = new IDxUListenerShape141S0100000_2_I1(this, 0);
    public final Matrix A03;
    public final Paint A04;
    public final Rect A05;

    public C56322nS() {
        Paint A052 = C13700nu.A05();
        this.A04 = A052;
        this.A05 = AnonymousClass000.A0J();
        this.A03 = AnonymousClass000.A0H();
        A052.setAntiAlias(true);
    }

    public void A00() {
        AnonymousClass4PG r0;
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null && !valueAnimator.isStarted() && (r0 = this.A01) != null && r0.A0G && getCallback() != null) {
            this.A00.start();
        }
    }

    public final void A01() {
        AnonymousClass4PG r2;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (r2 = this.A01) != null) {
            int i2 = r2.A08;
            if (i2 <= 0) {
                i2 = Math.round(r2.A04 * ((float) width));
            }
            int i3 = r2.A07;
            if (i3 <= 0) {
                i3 = Math.round(r2.A01 * ((float) height));
            }
            if (r2.A0C != 1) {
                int i4 = r2.A06;
                if (i4 == 1 || i4 == 3) {
                    i2 = 0;
                } else {
                    i3 = 0;
                }
                radialGradient = new LinearGradient(0.0f, 0.0f, (float) i2, (float) i3, r2.A0K, r2.A0J, Shader.TileMode.CLAMP);
            } else {
                radialGradient = new RadialGradient(((float) i2) / 2.0f, ((float) i3) / 2.0f, (float) (((double) Math.max(i2, i3)) / Math.sqrt(2.0d)), r2.A0K, r2.A0J, Shader.TileMode.CLAMP);
            }
            this.A04.setShader(radialGradient);
        }
    }

    public void A02(AnonymousClass4PG r9) {
        boolean z2;
        this.A01 = r9;
        if (r9 != null) {
            this.A04.setXfermode(new PorterDuffXfermode(r9.A0F ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        A01();
        if (this.A01 != null) {
            ValueAnimator valueAnimator = this.A00;
            if (valueAnimator != null) {
                z2 = valueAnimator.isStarted();
                this.A00.cancel();
                this.A00.removeAllUpdateListeners();
            } else {
                z2 = false;
            }
            AnonymousClass4PG r0 = this.A01;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (r0.A0E / r0.A0D)) + 1.0f});
            this.A00 = ofFloat;
            ofFloat.setRepeatMode(this.A01.A0B);
            this.A00.setRepeatCount(this.A01.A0A);
            ValueAnimator valueAnimator2 = this.A00;
            AnonymousClass4PG r02 = this.A01;
            valueAnimator2.setDuration(r02.A0D + r02.A0E);
            this.A00.addUpdateListener(this.A02);
            if (z2) {
                this.A00.start();
            }
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        float f2;
        if (this.A01 != null) {
            Paint paint = this.A04;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians((double) this.A01.A03));
                Rect rect = this.A05;
                float height = ((float) rect.height()) + (((float) rect.width()) * tan);
                float width = ((float) rect.width()) + (tan * ((float) rect.height()));
                ValueAnimator valueAnimator = this.A00;
                float f3 = 0.0f;
                float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
                int i2 = this.A01.A06;
                if (i2 != 1) {
                    if (i2 == 2) {
                        f3 = width + (((-width) - width) * animatedFraction);
                    } else if (i2 != 3) {
                        float f4 = -width;
                        f3 = f4 + ((width - f4) * animatedFraction);
                    } else {
                        f2 = height + (((-height) - height) * animatedFraction);
                    }
                    f2 = 0.0f;
                } else {
                    float f5 = -height;
                    f2 = f5 + ((height - f5) * animatedFraction);
                }
                Matrix matrix = this.A03;
                matrix.reset();
                matrix.setRotate(this.A01.A03, ((float) rect.width()) / 2.0f, ((float) rect.height()) / 2.0f);
                matrix.postTranslate(f3, f2);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    public int getOpacity() {
        AnonymousClass4PG r1 = this.A01;
        if (r1 != null) {
            return (r1.A0H || r1.A0F) ? -3 : -1;
        }
        return -1;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A05.set(0, 0, rect.width(), rect.height());
        A01();
        A00();
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
