package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.redex.IDxUListenerShape87S0200000_I1;

/* renamed from: X.0Ag  reason: invalid class name and case insensitive filesystem */
public class C02210Ag extends Drawable implements Animatable {
    public static final Interpolator A06 = new LinearInterpolator();
    public static final Interpolator A07 = new C018508q();
    public static final int[] A08 = {-16777216};
    public float A00;
    public float A01;
    public Animator A02;
    public Resources A03;
    public boolean A04;
    public final AnonymousClass0PF A05;

    public C02210Ag(Context context) {
        this.A03 = context.getResources();
        AnonymousClass0PF r2 = new AnonymousClass0PF();
        this.A05 = r2;
        int[] iArr = A08;
        r2.A0G = iArr;
        r2.A0C = 0;
        r2.A0D = iArr[0];
        r2.A08 = 2.5f;
        r2.A0J.setStrokeWidth(2.5f);
        invalidateSelf();
        AnonymousClass0PF r3 = this.A05;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new IDxUListenerShape87S0200000_I1(r3, 1, this));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(A06);
        ofFloat.addListener(new AnonymousClass0XQ(r3, this));
        this.A02 = ofFloat;
    }

    public void A00(int i2) {
        float f2 = 7.5f;
        float f3 = 2.5f;
        float f4 = 10.0f;
        float f5 = 5.0f;
        if (i2 == 0) {
            f2 = 11.0f;
            f3 = 3.0f;
            f4 = 12.0f;
            f5 = 6.0f;
        }
        AnonymousClass0PF r3 = this.A05;
        float f6 = this.A03.getDisplayMetrics().density;
        float f7 = f3 * f6;
        r3.A08 = f7;
        r3.A0J.setStrokeWidth(f7);
        r3.A02 = f2 * f6;
        r3.A0C = 0;
        r3.A0D = r3.A0G[0];
        r3.A0B = (int) (f4 * f6);
        r3.A0A = (int) (f5 * f6);
        invalidateSelf();
    }

    public void A01(AnonymousClass0PF r10, float f2) {
        int i2;
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int[] iArr = r10.A0G;
            int i3 = r10.A0C;
            int i4 = iArr[i3];
            int i5 = iArr[(i3 + 1) % iArr.length];
            int i6 = (i4 >> 24) & MotionEventCompat.ACTION_MASK;
            int i7 = (i4 >> 16) & MotionEventCompat.ACTION_MASK;
            int i8 = (i4 >> 8) & MotionEventCompat.ACTION_MASK;
            int i9 = i4 & MotionEventCompat.ACTION_MASK;
            i2 = (AnonymousClass000.A06(f3, (i5 >> 24) & MotionEventCompat.ACTION_MASK, i6) << 24) | (AnonymousClass000.A06(f3, (i5 >> 16) & MotionEventCompat.ACTION_MASK, i7) << 16) | (AnonymousClass000.A06(f3, (i5 >> 8) & MotionEventCompat.ACTION_MASK, i8) << 8) | (i9 + ((int) (f3 * ((float) ((i5 & MotionEventCompat.ACTION_MASK) - i9)))));
        } else {
            i2 = r10.A0G[r10.A0C];
        }
        r10.A0D = i2;
    }

    public void A02(AnonymousClass0PF r8, float f2, boolean z2) {
        float f3;
        float interpolation;
        if (this.A04) {
            A01(r8, f2);
            float f4 = r8.A06;
            float f5 = r8.A07;
            float f6 = r8.A05;
            r8.A04 = f5 + (((f6 - 0.01f) - f5) * f2);
            r8.A01 = f6;
            r8.A03 = f4 + ((((float) (Math.floor((double) (f4 / 0.8f)) + 1.0d)) - f4) * f2);
        } else if (f2 != 1.0f || z2) {
            float f7 = r8.A06;
            if (f2 < 0.5f) {
                interpolation = r8.A07;
                f3 = (A07.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                f3 = r8.A07 + 0.79f;
                interpolation = f3 - (((1.0f - A07.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            r8.A04 = interpolation;
            r8.A01 = f3;
            r8.A03 = f7 + (0.20999998f * f2);
            this.A00 = (f2 + this.A01) * 216.0f;
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        canvas.save();
        canvas.rotate(this.A00, bounds.exactCenterX(), bounds.exactCenterY());
        AnonymousClass0PF r3 = this.A05;
        RectF rectF = r3.A0K;
        float f2 = r3.A02;
        float f3 = (r3.A08 / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) r3.A0B) * r3.A00) / 2.0f, r3.A08 / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f3, ((float) bounds.centerY()) - f3, ((float) bounds.centerX()) + f3, ((float) bounds.centerY()) + f3);
        float f4 = r3.A04;
        float f5 = r3.A03;
        float f6 = (f4 + f5) * 360.0f;
        float f7 = ((r3.A01 + f5) * 360.0f) - f6;
        Paint paint = r3.A0J;
        paint.setColor(r3.A0D);
        paint.setAlpha(r3.A09);
        float f8 = r3.A08 / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, r3.A0I);
        float f9 = -f8;
        rectF.inset(f9, f9);
        canvas2.drawArc(rectF, f6, f7, false, paint);
        if (r3.A0F) {
            Path path = r3.A0E;
            if (path == null) {
                Path A0I = AnonymousClass000.A0I();
                r3.A0E = A0I;
                A0I.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            r3.A0E.moveTo(0.0f, 0.0f);
            r3.A0E.lineTo(((float) r3.A0B) * r3.A00, 0.0f);
            Path path2 = r3.A0E;
            float f10 = r3.A00;
            path2.lineTo((((float) r3.A0B) * f10) / 2.0f, ((float) r3.A0A) * f10);
            r3.A0E.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) r3.A0B) * r3.A00) / 2.0f), rectF.centerY() + (r3.A08 / 2.0f));
            r3.A0E.close();
            Paint paint2 = r3.A0H;
            paint2.setColor(r3.A0D);
            paint2.setAlpha(r3.A09);
            canvas.save();
            canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
            canvas.drawPath(r3.A0E, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    public int getAlpha() {
        return this.A05.A09;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.A02.isRunning();
    }

    public void setAlpha(int i2) {
        this.A05.A09 = i2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A05.A0J.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j2;
        Animator animator = this.A02;
        animator.cancel();
        AnonymousClass0PF r3 = this.A05;
        float f2 = r3.A04;
        r3.A07 = f2;
        float f3 = r3.A01;
        r3.A05 = f3;
        r3.A06 = r3.A03;
        if (f3 != f2) {
            this.A04 = true;
            j2 = 666;
        } else {
            r3.A0C = 0;
            r3.A0D = r3.A0G[0];
            r3.A07 = 0.0f;
            r3.A05 = 0.0f;
            r3.A06 = 0.0f;
            r3.A04 = 0.0f;
            r3.A01 = 0.0f;
            r3.A03 = 0.0f;
            j2 = 1332;
        }
        animator.setDuration(j2);
        animator.start();
    }

    public void stop() {
        this.A02.cancel();
        this.A00 = 0.0f;
        AnonymousClass0PF r2 = this.A05;
        if (r2.A0F) {
            r2.A0F = false;
        }
        r2.A0C = 0;
        r2.A0D = r2.A0G[0];
        r2.A07 = 0.0f;
        r2.A05 = 0.0f;
        r2.A06 = 0.0f;
        r2.A04 = 0.0f;
        r2.A01 = 0.0f;
        r2.A03 = 0.0f;
        invalidateSelf();
    }
}
