package com.obwhatsapp.bloks.ui.widgets.rangeslider;

import X.AnonymousClass600;
import X.AnonymousClass68G;
import X.AnonymousClass68H;
import X.C110305dq;
import X.C114835og;
import X.C114895om;
import X.C118905vb;
import X.C119935zr;
import X.C1219767u;
import X.C1219867v;
import X.C13680ns;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

public class WaRangeSeekBar extends FrameLayout implements AnonymousClass68G, AnonymousClass68H, C1219767u {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public Paint A07;
    public Paint A08;
    public Paint A09;
    public Paint A0A;
    public Paint A0B;
    public C118905vb A0C;
    public C1219867v A0D;
    public C114835og A0E;

    public WaRangeSeekBar(Context context) {
        super(context);
        A00();
    }

    public WaRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public WaRangeSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    private int getCenterY() {
        return getMeasuredHeight() >> 1;
    }

    private float getCurrentPosition() {
        return this.A0E == C114835og.START ? getStartThumbX() : getEndThumbX();
    }

    private float getEndThumbX() {
        float f2 = this.A02;
        float f3 = this.A01;
        float f4 = this.A00;
        float f5 = (float) this.A04;
        return (((f2 - f3) / (f4 - f3)) * (((float) (getWidth() - this.A04)) - f5)) + f5;
    }

    private int getLeftBound() {
        return this.A04;
    }

    private int getRightBound() {
        return getWidth() - this.A04;
    }

    private float getStartThumbX() {
        float f2 = this.A03;
        float f3 = this.A01;
        float f4 = this.A00;
        float f5 = (float) this.A04;
        return (((f2 - f3) / (f4 - f3)) * (((float) (getWidth() - this.A04)) - f5)) + f5;
    }

    private void setCurrentPosition(float f2) {
        if (this.A0E != null) {
            float f3 = (float) this.A04;
            float f4 = this.A01;
            float f5 = this.A00;
            float width = (((f2 - f3) / (((float) (getWidth() - this.A04)) - f3)) * (f5 - f4)) + f4;
            if (this.A0E == C114835og.START) {
                float f6 = this.A02;
                this.A03 = Math.min(Math.max(f4, f6), Math.max(Math.min(f4, f6), width));
            } else {
                float f7 = this.A03;
                this.A02 = Math.min(Math.max(f7, f5), Math.max(Math.min(f7, f5), width));
            }
            invalidate();
            A02();
        }
    }

    private void setCurrentThumb(float f2) {
        float abs = Math.abs(getEndThumbX() - f2);
        float abs2 = Math.abs(getStartThumbX() - f2);
        this.A0E = ((abs > abs2 ? 1 : (abs == abs2 ? 0 : -1)) == 0 ? (getStartThumbX() > f2 ? 1 : (getStartThumbX() == f2 ? 0 : -1)) : (abs > abs2 ? 1 : (abs == abs2 ? 0 : -1))) < 0 ? C114835og.END : C114835og.START;
    }

    public final void A00() {
        C118905vb r6 = new C118905vb(getContext());
        this.A0C = r6;
        C114895om[] r4 = {C114895om.A02, C114895om.A03};
        int i2 = 0;
        r6.A05 = 0;
        int i3 = 0;
        do {
            if (r4[i3] != null) {
                int i4 = r4[i3].flag | i2;
                r6.A05 = i4;
                i2 = i4;
            }
            i3++;
        } while (i3 < 2);
        r6.A0D = this;
        r6.A0E = this;
        r6.A0G = this;
        Resources A0D2 = C13680ns.A0D(this);
        Paint paint = new Paint();
        this.A07 = paint;
        paint.setColor(A0D2.getColor(R.color.color0659));
        this.A07.setAntiAlias(true);
        this.A07.setStrokeWidth((float) A0D2.getDimensionPixelSize(R.dimen.dimen0844));
        Paint paint2 = new Paint();
        this.A08 = paint2;
        paint2.setColor(A0D2.getColor(R.color.color06c5));
        this.A08.setStrokeWidth((float) A0D2.getDimensionPixelSize(R.dimen.dimen0844));
        Paint paint3 = new Paint();
        this.A09 = paint3;
        paint3.setColor(A0D2.getColor(R.color.color0659));
        this.A09.setAlpha(127);
        this.A09.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.A0A = paint4;
        paint4.setColor(A0D2.getColor(R.color.color0659));
        this.A0A.setAntiAlias(true);
        Paint paint5 = new Paint();
        this.A0B = paint5;
        paint5.setColor(A0D2.getColor(R.color.color0659));
        this.A0B.setAntiAlias(true);
        this.A04 = A0D2.getDimensionPixelSize(R.dimen.dimen0841);
        this.A05 = A0D2.getDimensionPixelSize(R.dimen.dimen0842);
        this.A06 = A0D2.getDimensionPixelSize(R.dimen.dimen0843);
        this.A03 = Float.NaN;
        this.A02 = Float.NaN;
    }

    public final void A01() {
        C1219867v r0 = this.A0D;
        if (r0 != null) {
            AnonymousClass600 r02 = (AnonymousClass600) r0;
            C119935zr.A00(r02.A01, this.A03, this.A02, r02.A00);
        }
    }

    public final void A02() {
        C1219867v r0 = this.A0D;
        if (r0 != null) {
            AnonymousClass600 r02 = (AnonymousClass600) r0;
            C119935zr.A00(r02.A01, this.A03, this.A02, r02.A00);
        }
    }

    public boolean AQ9(C114895om r3, float f2, float f3) {
        setCurrentThumb(f2);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public boolean AYm(float f2, float f3) {
        if (Math.abs(f3 - ((float) (getMeasuredHeight() >> 1))) > ((float) (this.A04 << 1))) {
            return false;
        }
        setCurrentThumb(f2);
        setCurrentPosition(f2);
        this.A0E = null;
        A01();
        return true;
    }

    public void dispatchDraw(Canvas canvas) {
        float measuredHeight = (float) (getMeasuredHeight() >> 1);
        float startThumbX = getStartThumbX();
        float endThumbX = getEndThumbX();
        canvas.save();
        canvas.drawLine((float) this.A04, measuredHeight, (float) (getWidth() - this.A04), measuredHeight, this.A08);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A04, this.A09);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A04, this.A09);
        Canvas canvas2 = canvas;
        float f2 = measuredHeight;
        canvas2.drawLine(startThumbX, f2, endThumbX, measuredHeight, this.A07);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A05, this.A0A);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A05, this.A0A);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A06, this.A0B);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A06, this.A0B);
        canvas.restore();
    }

    public float getRangeEndValue() {
        return this.A02;
    }

    public float getRangeStartValue() {
        return this.A03;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A0C.A02(motionEvent);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C110305dq r4 = (C110305dq) parcelable;
        super.onRestoreInstanceState(r4.getSuperState());
        float f2 = r4.A01;
        float f3 = r4.A00;
        if (f2 >= this.A01 && f3 <= this.A00 && f2 <= f3) {
            this.A03 = f2;
            this.A02 = f3;
            invalidate();
            A02();
        }
    }

    public Parcelable onSaveInstanceState() {
        C110305dq r1 = new C110305dq(super.onSaveInstanceState());
        r1.A01 = this.A03;
        r1.A00 = this.A02;
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r2 <= 0) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            X.5vb r4 = r7.A0C
            X.5oj r1 = r4.A0F
            X.5oj r0 = X.C114865oj.DRAGGING
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            r2 = 1
            if (r0 != 0) goto L_0x001c
            r4.A02(r8)
            int[] r1 = X.C115355pc.A00
            X.5oj r0 = r4.A0F
            int r0 = X.C110115dX.A01(r0, r1)
            if (r0 == r2) goto L_0x00f3
        L_0x001a:
            r0 = 1
            return r0
        L_0x001c:
            X.68G r0 = r4.A0E
            if (r0 == 0) goto L_0x00f3
            int r0 = r4.A05
            if (r0 <= 0) goto L_0x00f3
            android.view.VelocityTracker r0 = r4.A0B
            if (r0 != 0) goto L_0x002e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.A0B = r0
        L_0x002e:
            r0.addMovement(r8)
            int r1 = r8.getAction()
            float r5 = r8.getX()
            float r6 = r8.getY()
            if (r1 == r2) goto L_0x0069
            r0 = 2
            if (r1 == r0) goto L_0x0046
            r0 = 3
            if (r1 == r0) goto L_0x0069
            goto L_0x001a
        L_0x0046:
            float r0 = r4.A00
            float r2 = r5 - r0
            float r0 = r4.A01
            float r1 = r6 - r0
            r4.A00 = r5
            r4.A01 = r6
            float r0 = r4.A02
            float r0 = r0 + r2
            r4.A02 = r0
            float r0 = r4.A03
            float r0 = r0 + r1
            r4.A03 = r0
            X.68G r1 = r4.A0E
            com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r1 = (com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r1
            float r0 = r1.getCurrentPosition()
            float r0 = r0 + r2
            r1.setCurrentPosition(r0)
            goto L_0x001a
        L_0x0069:
            android.view.VelocityTracker r3 = r4.A0B
            r0 = 0
            r4.A0B = r0
            r1 = 1000(0x3e8, float:1.401E-42)
            r4.A01()
            int r0 = r4.A06
            float r0 = (float) r0
            r3.computeCurrentVelocity(r1, r0)
            X.5om r1 = r4.A0H
            X.5om r0 = X.C114895om.A02
            if (r1 == r0) goto L_0x00ee
            X.5om r0 = X.C114895om.A03
            if (r1 == r0) goto L_0x00ee
            float r0 = r3.getYVelocity()
        L_0x0087:
            int r2 = (int) r0
            r4.A01()
            int r1 = r4.A07
            int r0 = java.lang.Math.abs(r2)
            if (r0 <= r1) goto L_0x00aa
            if (r2 < 0) goto L_0x0097
            if (r2 <= 0) goto L_0x00a1
        L_0x0097:
            X.68G r1 = r4.A0E
            com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r1 = (com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r1
            r0 = 0
            r1.A0E = r0
            r1.A01()
        L_0x00a1:
            X.5oj r0 = X.C114865oj.AT_REST
            r4.A0F = r0
            r3.recycle()
            goto L_0x001a
        L_0x00aa:
            X.68H r0 = r4.A0G
            if (r0 == 0) goto L_0x0097
            r4.A01()
            int r1 = r4.A08
            float r0 = r4.A02
            float r0 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0097
            float r0 = r4.A03
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0097
            X.68H r2 = r4.A0G
            com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r2 = (com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r2
            int r0 = r2.getMeasuredHeight()
            int r0 = r0 >> 1
            float r0 = (float) r0
            float r6 = r6 - r0
            float r1 = java.lang.Math.abs(r6)
            int r0 = r2.A04
            int r0 = r0 << 1
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00a1
            r2.setCurrentThumb(r5)
            r2.setCurrentPosition(r5)
            r0 = 0
            r2.A0E = r0
            r2.A01()
            goto L_0x00a1
        L_0x00ee:
            float r0 = r3.getXVelocity()
            goto L_0x0087
        L_0x00f3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performClick() {
        return super.performClick();
    }

    public void setRangeSeekBarChangeListener(C1219867v r1) {
        this.A0D = r1;
    }
}
