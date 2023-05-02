package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import com.facebook.redex.IDxUListenerShape139S0100000_I1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0Aa  reason: invalid class name and case insensitive filesystem */
public class C02160Aa extends Drawable {
    public float A00;
    public float A01;
    public int A02;
    public ValueAnimator A03;
    public AnonymousClass0NY A04;
    public AnonymousClass0NY A05;
    public boolean A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final ValueAnimator.AnimatorUpdateListener A0A = new IDxUListenerShape139S0100000_I1(this, 2);
    public final Path A0B;
    public final List A0C;
    public final AnonymousClass0NY[] A0D;

    public C02160Aa(Context context, float f2, int i2, boolean z2) {
        AnonymousClass0NY[] r4 = new AnonymousClass0NY[4];
        this.A0D = r4;
        this.A0B = AnonymousClass000.A0I();
        this.A02 = MotionEventCompat.ACTION_MASK;
        this.A09 = i2;
        this.A08 = f2;
        Context context2 = context;
        this.A07 = AnonymousClass0MV.A00(context2, 375.0f);
        this.A0C = Arrays.asList(new AnonymousClass0UG[]{new AnonymousClass0UG(0.0f, AnonymousClass0MV.A00(context2, 116.0f), 0, AnonymousClass0MV.A00(context2, 350.0f), -15173646, AnonymousClass0MV.A00(context2, 232.0f)), new AnonymousClass0UG(0.0f, AnonymousClass0MV.A00(context2, -219.0f), 1, AnonymousClass0MV.A00(context2, 226.0f), -14298266, AnonymousClass0MV.A00(context2, 153.0f)), new AnonymousClass0UG(AnonymousClass0MV.A00(context2, 124.0f), AnonymousClass0MV.A00(context2, -438.0f), 2, AnonymousClass0MV.A00(context2, 156.0f), -668109, AnonymousClass0MV.A00(context2, 100.0f)), new AnonymousClass0UG(AnonymousClass0MV.A00(context2, 238.0f), AnonymousClass0MV.A00(context2, -196.0f), 3, AnonymousClass0MV.A00(context2, 206.0f), -37796, AnonymousClass0MV.A00(context2, 132.0f)), new AnonymousClass0UG(AnonymousClass0MV.A00(context2, -175.0f), AnonymousClass0MV.A00(context2, 373.0f), 4, AnonymousClass0MV.A00(context2, 272.0f), -15173646, AnonymousClass0MV.A00(context2, 175.0f)), new AnonymousClass0UG(AnonymousClass0MV.A00(context2, 308.0f), AnonymousClass0MV.A00(context2, -71.0f), 5, AnonymousClass0MV.A00(context2, 176.0f), -6278145, AnonymousClass0MV.A00(context2, 119.0f))});
        HashMap A0x = AnonymousClass000.A0x();
        C05020Ox r3 = new C05020Ox();
        r3.A04 = true;
        r3.A01 = 90.0f;
        A0x.put(-1, r3);
        C05020Ox r0 = new C05020Ox();
        r0.A03 = true;
        A0x.put(4, r0);
        C05020Ox r32 = new C05020Ox();
        r32.A02 = true;
        r32.A00 = 0.5f;
        A0x.put(5, r32);
        r4[1] = new AnonymousClass0NY(A0x);
        HashMap A0x2 = AnonymousClass000.A0x();
        C05020Ox r33 = new C05020Ox();
        r33.A04 = true;
        r33.A01 = 180.0f;
        A0x2.put(-1, r33);
        C05020Ox r34 = new C05020Ox();
        r34.A02 = true;
        r34.A00 = 0.5f;
        r34.A03 = true;
        A0x2.put(5, r34);
        r4[2] = new AnonymousClass0NY(A0x2);
        HashMap A0x3 = AnonymousClass000.A0x();
        C05020Ox r35 = new C05020Ox();
        r35.A04 = true;
        r35.A01 = 270.0f;
        A0x3.put(-1, r35);
        C05020Ox r36 = new C05020Ox();
        r36.A02 = true;
        r36.A00 = 0.5f;
        A0x3.put(5, r36);
        C05020Ox r02 = new C05020Ox();
        r02.A03 = true;
        A0x3.put(1, r02);
        r4[3] = new AnonymousClass0NY(A0x3);
        setAlpha(z2 ? 10 : 8);
    }

    public final void A00(Canvas canvas, Paint paint, C05020Ox r7, C05020Ox r8, float f2) {
        int alpha = paint.getAlpha();
        float f3 = 1.0f;
        float f4 = (r7 == null || !r7.A02) ? 1.0f : r7.A00;
        if (r8 != null && r8.A02) {
            f3 = r8.A00;
        }
        float alpha2 = (float) paint.getAlpha();
        paint.setAlpha((int) AnonymousClass000.A01(f3 * alpha2, f4 * alpha2, this.A00));
        canvas.drawCircle(0.0f, 0.0f, f2, paint);
        paint.setAlpha(alpha);
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        if (this.A08 != 0.0f) {
            canvas2.clipPath(this.A0B);
        }
        if (this.A01 > 1.0f) {
            Rect bounds = getBounds();
            float f2 = this.A01;
            canvas2.scale(f2, f2, bounds.exactCenterX(), bounds.exactCenterY());
        }
        canvas2.drawColor(this.A09);
        AnonymousClass0NY r0 = this.A04;
        C05020Ox r2 = r0 != null ? (C05020Ox) AnonymousClass000.A0Y(r0.A00, -1) : null;
        AnonymousClass0NY r02 = this.A05;
        C05020Ox r1 = r02 != null ? (C05020Ox) AnonymousClass000.A0Y(r02.A00, -1) : null;
        float f3 = (r2 == null || !r2.A04) ? 0.0f : r2.A01;
        float f4 = (r1 == null || !r1.A04) ? 0.0f : r1.A01;
        if (f3 == 270.0f && f4 == 0.0f) {
            f4 = 360.0f;
        }
        float A012 = AnonymousClass000.A01(f4, f3, this.A00);
        Rect bounds2 = getBounds();
        if (A012 != 0.0f) {
            canvas2.rotate(A012, bounds2.exactCenterX(), bounds2.exactCenterY());
        }
        for (AnonymousClass0UG r6 : this.A0C) {
            int save2 = canvas2.save();
            AnonymousClass0NY r03 = this.A04;
            C05020Ox r22 = r03 != null ? (C05020Ox) AnonymousClass000.A0Y(r03.A00, r6.A06) : null;
            AnonymousClass0NY r04 = this.A05;
            C05020Ox r12 = r04 != null ? (C05020Ox) AnonymousClass000.A0Y(r04.A00, r6.A06) : null;
            float f5 = r6.A00;
            float exactCenterX = bounds2.exactCenterX();
            float f6 = (r22 == null || !r22.A03) ? f5 : 0.0f + exactCenterX;
            if (r12 != null && r12.A03) {
                f5 = exactCenterX + 0.0f;
            }
            float A013 = AnonymousClass000.A01(f5, f6, this.A00);
            float f7 = r6.A01;
            float exactCenterY = bounds2.exactCenterY();
            float f8 = (r22 == null || !r22.A03) ? f7 : 0.0f + exactCenterY;
            if (r12 != null && r12.A03) {
                f7 = exactCenterY + 0.0f;
            }
            canvas2.translate(A013, AnonymousClass000.A01(f7, f8, this.A00));
            float f9 = r6.A04;
            float f10 = r6.A05;
            float max = Math.max(f9, f10);
            canvas2.scale(1.0f, Math.min(f9, f10) / max);
            C05020Ox r18 = r12;
            C05020Ox r17 = r22;
            A00(canvas2, r6.A09, r17, r18, max * 2.0f);
            A00(canvas2, r6.A08, r17, r18, max * 1.5f);
            A00(canvas2, r6.A07, r22, r12, max);
            canvas2.restoreToCount(save2);
        }
        canvas2.restoreToCount(save);
    }

    public int getAlpha() {
        return this.A02;
    }

    public int getOpacity() {
        return -1;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (AnonymousClass0UG r2 : this.A0C) {
            r2.A00 = ((float) rect.centerX()) + r2.A02;
            r2.A01 = ((float) rect.centerY()) + r2.A03;
        }
        Path path = this.A0B;
        path.reset();
        RectF rectF = new RectF(rect);
        float f2 = this.A08;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        path.close();
        float width = (float) rect.width();
        float f3 = this.A07;
        this.A01 = width > f3 ? width / f3 : 0.0f;
    }

    public void setAlpha(int i2) {
        this.A02 = i2;
        for (AnonymousClass0UG r1 : this.A0C) {
            r1.A07.setAlpha(i2);
            r1.A08.setAlpha(i2);
            r1.A09.setAlpha(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        for (AnonymousClass0UG r1 : this.A0C) {
            r1.A07.setColorFilter(colorFilter);
            r1.A08.setColorFilter(colorFilter);
            r1.A09.setColorFilter(colorFilter);
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z4 = this.A06;
        if (!z2) {
            if (z4 && (valueAnimator2 = this.A03) != null && valueAnimator2.isStarted()) {
                this.A03.cancel();
            }
        } else if (z4 && (valueAnimator = this.A03) != null && !valueAnimator.isStarted()) {
            this.A03.start();
        }
        return super.setVisible(z2, z3);
    }
}
