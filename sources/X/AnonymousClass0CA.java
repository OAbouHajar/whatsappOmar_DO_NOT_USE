package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.Arrays;

/* renamed from: X.0CA  reason: invalid class name */
public class AnonymousClass0CA extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public AnonymousClass0AZ A04;
    public AnonymousClass0AZ A05;
    public boolean A06;
    public final int A07;
    public final C03870Ke A08;
    public final C03880Kf A09;

    public AnonymousClass0CA(Context context, AnonymousClass0C9 r7, AnonymousClass0XG r8, AnonymousClass0KQ r9, C14990q7 r10) {
        super(context);
        C03880Kf r4 = r8.A03;
        this.A09 = r4;
        this.A08 = r8.A00;
        C03880Kf r3 = C03880Kf.FULL_SCREEN;
        if (r4 == r3) {
            this.A07 = 0;
        } else {
            this.A07 = (int) AnonymousClass0MV.A00(context, (float) AnonymousClass0XA.A00(C03690Jm.BOTTOM_SHEET, r9));
            this.A00 = (int) AnonymousClass0MV.A00(context, 18.0f);
            this.A02 = (int) AnonymousClass0MV.A00(context, 6.0f);
            this.A01 = (int) AnonymousClass0MV.A00(context, 10.0f);
            C03860Kd r2 = r8.A02;
            boolean z2 = true;
            if (r2 != C03860Kd.AUTO ? r2 != C03860Kd.DISABLED : !(r4 == C03880Kf.FULL_SHEET || r4 == r3)) {
                z2 = false;
            }
            this.A06 = !z2;
            AnonymousClass0AZ r32 = new AnonymousClass0AZ();
            this.A04 = r32;
            int A002 = C06290Vd.A00(context, AnonymousClass0JF.BOTTOM_SHEET_HANDLE, r10);
            Paint paint = r32.A01;
            if (A002 != paint.getColor()) {
                paint.setColor(A002);
                r32.invalidateSelf();
            }
            AnonymousClass0AZ r22 = this.A04;
            Arrays.fill(r22.A04, (float) ((int) AnonymousClass0MV.A00(context, 2.0f)));
            r22.A00 = true;
            r22.invalidateSelf();
        }
        A00(context, r7, r9, r10);
    }

    public final void A00(Context context, AnonymousClass0C9 r5, AnonymousClass0KQ r6, C14990q7 r7) {
        A02(context, r6, r7);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, (int) AnonymousClass0MV.A00(context, 16.0f), 0, 0);
        addView(r5, marginLayoutParams);
        A01(context, r6, r7);
    }

    public final void A01(Context context, AnonymousClass0KQ r5, C14990q7 r6) {
        AnonymousClass0AZ r2 = new AnonymousClass0AZ();
        this.A05 = r2;
        Arrays.fill(r2.A04, (float) this.A07);
        r2.A00 = true;
        r2.invalidateSelf();
        AnonymousClass0R9 A042 = AnonymousClass0XA.A04(AnonymousClass0KH.BACKGROUND_DIMMER, r5);
        Color.alpha(C06290Vd.A02(context, r6) ? A042.A00 : A042.A01);
        if (this.A05 != null) {
            setForeground((Drawable) null);
        }
    }

    public final void A02(Context context, AnonymousClass0KQ r9, C14990q7 r10) {
        boolean A022 = C06290Vd.A02(context, r10);
        C03870Ke r2 = this.A08;
        if (r2.equals(C03870Ke.DISABLED)) {
            AnonymousClass0R9 A042 = AnonymousClass0XA.A04(AnonymousClass0KH.BACKGROUND_BLOBS_DISABLED, r9);
            int i2 = C06290Vd.A02(context, r10) ? A042.A00 : A042.A01;
            AnonymousClass0AZ r22 = new AnonymousClass0AZ();
            Paint paint = r22.A01;
            if (i2 != paint.getColor()) {
                paint.setColor(i2);
                r22.invalidateSelf();
            }
            Arrays.fill(r22.A04, (float) this.A07);
            r22.A00 = true;
            r22.invalidateSelf();
            setBackground(r22);
            return;
        }
        AnonymousClass0R9 A043 = AnonymousClass0XA.A04(AnonymousClass0KH.BACKGROUND_BLOBS_ENABLED, r9);
        int i3 = C06290Vd.A02(context, r10) ? A043.A00 : A043.A01;
        AnonymousClass0XA.A06(r9, AnonymousClass0JS.A01);
        C02160Aa r5 = new C02160Aa(context, (float) this.A07, i3, A022);
        this.A03 = r5;
        if (r2.equals(C03870Ke.ANIMATED) && !r5.A06) {
            ValueAnimator valueAnimator = r5.A03;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                r5.A03 = null;
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            r5.A03 = valueAnimator2;
            valueAnimator2.addUpdateListener(r5.A0A);
            r5.A03.setRepeatCount(-1);
            r5.A03.setDuration(((long) r5.A0D.length) * 3000);
            r5.A03.setFloatValues(new float[]{0.0f, 1.0f});
            r5.A03.setInterpolator(new LinearInterpolator());
            r5.A03.start();
            r5.A06 = true;
        }
        setBackground(this.A03);
    }

    public void dispatchDraw(Canvas canvas) {
        AnonymousClass0AZ r4;
        super.dispatchDraw(canvas);
        if (this.A09 != C03880Kf.FULL_SCREEN && (r4 = this.A04) != null && this.A06) {
            int width = (int) (((float) getWidth()) / 2.0f);
            int i2 = this.A00;
            r4.setBounds(width - i2, this.A02, width + i2, this.A01);
            r4.draw(canvas);
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        int size = View.MeasureSpec.getSize(i3);
        if (this.A09 == C03880Kf.FLEXIBLE_SHEET) {
            i4 = Integer.MIN_VALUE;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, i4));
    }
}
