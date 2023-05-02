package com.obwhatsapp.location;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C52662eE;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

public class DragBottomSheetIndicator extends View implements AnonymousClass006 {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public C52662eE A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Paint A09;
    public final Path A0A;

    public DragBottomSheetIndicator(Context context) {
        super(context);
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
        this.A08 = C13700nu.A06(1);
        this.A09 = C13700nu.A06(1);
        this.A0A = AnonymousClass000.A0I();
        A00(context);
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A08 = C13700nu.A06(1);
        this.A09 = C13700nu.A06(1);
        this.A0A = AnonymousClass000.A0I();
        A00(context);
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
        this.A08 = C13700nu.A06(1);
        this.A09 = C13700nu.A06(1);
        this.A0A = AnonymousClass000.A0I();
        A00(context);
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
        this.A08 = C13700nu.A06(1);
        this.A09 = C13700nu.A06(1);
        this.A0A = AnonymousClass000.A0I();
        A00(context);
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
    }

    public final void A00(Context context) {
        Paint paint = this.A08;
        C13690nt.A0y(paint);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeWidth(C13680ns.A01(context) * 2.0f);
        paint.setColor(-1);
        Paint paint2 = this.A09;
        C13690nt.A0y(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeWidth(C13680ns.A01(context) * 4.0f);
        paint2.setColor(855638016);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (r7.A05 != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        if (r4 >= 0.0f) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        if (r7.A05 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        r4 = (float) (((double) r4) * 0.25d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r4 > 0.0f) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.onDraw(r8)
            float r5 = r7.A00
            float r0 = r7.A01
            float r4 = r5 - r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 * r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r7.A03
            long r2 = r2 - r0
            float r0 = (float) r2
            float r4 = r4 / r0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006c
            r4 = 0
        L_0x001f:
            int r6 = r7.getPaddingLeft()
            int r2 = r7.getPaddingTop()
            int r5 = X.C13690nt.A04(r7)
            int r1 = r7.getHeight()
            int r0 = r7.getPaddingBottom()
            int r1 = r1 - r0
            int r0 = r1 + r2
            int r0 = r0 >> 1
            float r3 = (float) r0
            int r1 = r1 - r2
            float r2 = (float) r1
            boolean r1 = r7.A05
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x0043
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
        L_0x0043:
            float r0 = r0 + r4
            float r2 = r2 * r0
            float r2 = r2 + r3
            android.graphics.Path r1 = r7.A0A
            r1.reset()
            float r0 = (float) r6
            r1.moveTo(r0, r2)
            int r6 = r6 + r5
            int r0 = r6 >> 1
            float r0 = (float) r0
            r1.lineTo(r0, r3)
            float r0 = (float) r5
            r1.lineTo(r0, r2)
            android.graphics.Paint r0 = r7.A09
            r8.drawPath(r1, r0)
            android.graphics.Paint r0 = r7.A08
            r8.drawPath(r1, r0)
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x006b
            r7.invalidate()
        L_0x006b:
            return
        L_0x006c:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0072:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x007e
        L_0x0076:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
        L_0x007a:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x001f
        L_0x007e:
            double r2 = (double) r4
            r0 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r2 = r2 * r0
            float r4 = (float) r2
            goto L_0x001f
        L_0x0084:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x008b
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x007a
        L_0x008b:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.DragBottomSheetIndicator.onDraw(android.graphics.Canvas):void");
    }

    public void setExpanded(boolean z2) {
        this.A05 = z2;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        invalidate();
    }

    public void setOffset(float f2) {
        this.A03 = this.A02;
        this.A01 = this.A00;
        this.A02 = SystemClock.elapsedRealtime();
        this.A00 = f2;
        invalidate();
    }

    public void setUpdating(boolean z2) {
        this.A07 = z2;
        if (z2) {
            invalidate();
        }
    }
}
