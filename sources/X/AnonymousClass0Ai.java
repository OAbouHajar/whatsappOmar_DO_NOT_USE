package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.redex.IDxUListenerShape139S0100000_I1;

/* renamed from: X.0Ai  reason: invalid class name */
public class AnonymousClass0Ai extends Drawable implements Animatable {
    public static final ArgbEvaluator A08 = new ArgbEvaluator();
    public static final TimeInterpolator A09 = new AnonymousClass0XT();
    public boolean A00;
    public final float A01;
    public final int A02;
    public final ValueAnimator.AnimatorUpdateListener A03;
    public final ValueAnimator A04;
    public final Paint A05;
    public final RectF A06;
    public final AnonymousClass0JY A07;

    public AnonymousClass0Ai(Context context, AnonymousClass0OC r13, AnonymousClass0OC r14, AnonymousClass0JY r15, C14990q7 r16, float f2, int i2, int i3) {
        this(context, r13, r14, r15, r16, f2, i2, i3, 200);
    }

    public AnonymousClass0Ai(Context context, AnonymousClass0OC r9, AnonymousClass0OC r10, AnonymousClass0JY r11, C14990q7 r12, float f2, int i2, int i3, long j2) {
        float f3;
        float f4;
        IDxUListenerShape139S0100000_I1 iDxUListenerShape139S0100000_I1 = new IDxUListenerShape139S0100000_I1(this, 3);
        this.A03 = iDxUListenerShape139S0100000_I1;
        this.A07 = r11;
        this.A06 = AnonymousClass000.A0K();
        Paint paint = new Paint();
        this.A05 = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.A02 = i3;
        this.A01 = AnonymousClass0MV.A00(context, f2);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A04 = valueAnimator;
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(iDxUListenerShape139S0100000_I1);
        valueAnimator.setStartDelay(((long) (i2 % 10)) * 200);
        valueAnimator.setDuration(2000);
        valueAnimator.setInterpolator(A09);
        valueAnimator.setEvaluator(A08);
        if (C06290Vd.A02(context, r12)) {
            f3 = r10.A00;
            f4 = r10.A01;
        } else {
            f3 = r9.A00;
            f4 = r9.A01;
        }
        valueAnimator.setFloatValues(new float[]{f3, f4});
        paint.setColor(AnonymousClass0MU.A00(i3, f3));
    }

    public void draw(Canvas canvas) {
        int ordinal = this.A07.ordinal();
        RectF rectF = this.A06;
        if (ordinal != 0) {
            float f2 = this.A01;
            canvas.drawRoundRect(rectF, f2, f2, this.A05);
            return;
        }
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A05);
    }

    public int getOpacity() {
        return -1;
    }

    public boolean isRunning() {
        return this.A04.isStarted();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A06.set(rect);
    }

    public void setAlpha(int i2) {
        Paint paint = this.A05;
        if (paint.getAlpha() != i2) {
            paint.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean setVisible(boolean z2, boolean z3) {
        if (!z2) {
            this.A04.cancel();
        } else if (this.A00) {
            this.A04.start();
        }
        return super.setVisible(z2, z3);
    }

    public void start() {
        this.A04.start();
        this.A00 = true;
    }

    public void stop() {
        this.A04.cancel();
        this.A00 = false;
    }
}
