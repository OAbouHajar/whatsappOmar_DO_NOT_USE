package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.redex.IDxUListenerShape139S0100000_I1;

/* renamed from: X.0Ah  reason: invalid class name */
public class AnonymousClass0Ah extends Drawable implements Animatable {
    public static final Interpolator A09 = C04240Lt.A00(0.33f, 0.0f, 0.67f, 1.0f);
    public static final Interpolator A0A = new LinearInterpolator();
    public static final float[] A0B = {0.8f, 0.8f, 1.0f, 0.8f, 0.8f};
    public static final float[] A0C = {0.0f, 180.0f, 360.0f, 540.0f, 1080.0f};
    public static final float[] A0D = {0.0f, 0.7f, 0.45f, 0.7f, 0.0f};
    public float A00;
    public float A01 = -90.0f;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final ValueAnimator.AnimatorUpdateListener A05;
    public final ValueAnimator A06;
    public final Paint A07;
    public final RectF A08 = AnonymousClass000.A0K();

    public AnonymousClass0Ah(Context context, int i2, int i3) {
        Paint paint = new Paint(1);
        this.A07 = paint;
        IDxUListenerShape139S0100000_I1 iDxUListenerShape139S0100000_I1 = new IDxUListenerShape139S0100000_I1(this, 4);
        this.A05 = iDxUListenerShape139S0100000_I1;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A06 = valueAnimator;
        valueAnimator.setInterpolator(A0A);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.addUpdateListener(iDxUListenerShape139S0100000_I1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(2000);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AnonymousClass0MV.A00(context, 2.0f));
        this.A03 = i2;
        this.A04 = i3;
    }

    public void draw(Canvas canvas) {
        Paint paint = this.A07;
        paint.setColor(this.A03);
        canvas.drawArc(this.A08, this.A01, this.A00, false, paint);
    }

    public int getIntrinsicHeight() {
        return this.A04;
    }

    public int getIntrinsicWidth() {
        return this.A04;
    }

    public int getOpacity() {
        return -1;
    }

    public boolean isRunning() {
        ValueAnimator valueAnimator = this.A06;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float strokeWidth = this.A07.getStrokeWidth() / 2.0f;
        RectF rectF = this.A08;
        rectF.set(rect);
        rectF.offset(strokeWidth, strokeWidth);
        int i2 = rect.left;
        int i3 = this.A04;
        rectF.right = ((float) (i2 + i3)) - strokeWidth;
        rectF.bottom = ((float) (rect.top + i3)) - strokeWidth;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean setVisible(boolean z2, boolean z3) {
        ValueAnimator valueAnimator = this.A06;
        if (!z2) {
            if (valueAnimator != null && this.A02) {
                valueAnimator.cancel();
            }
        } else if (valueAnimator != null && this.A02) {
            valueAnimator.start();
        }
        return super.setVisible(z2, z3);
    }

    public void start() {
        ValueAnimator valueAnimator = this.A06;
        if (valueAnimator != null) {
            valueAnimator.start();
            this.A02 = true;
        }
    }

    public void stop() {
        ValueAnimator valueAnimator = this.A06;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A02 = false;
        }
    }
}
