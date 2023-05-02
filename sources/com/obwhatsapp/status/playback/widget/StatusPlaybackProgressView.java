package com.obwhatsapp.status.playback.widget;

import X.AnonymousClass006;
import X.C108175My;
import X.C52662eE;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.yo.SS;
import java.util.HashSet;
import java.util.Set;

public class StatusPlaybackProgressView extends View implements AnonymousClass006 {
    public float A00;
    public int A01;
    public int A02;
    public C108175My A03;
    public C52662eE A04;
    public boolean A05;
    public final Paint A06;
    public final RectF A07;
    public final Set A08;

    public StatusPlaybackProgressView(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A08 = new HashSet();
        this.A07 = new RectF();
        this.A06 = new Paint(1);
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A08 = new HashSet();
        this.A07 = new RectF();
        this.A06 = new Paint(1);
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A08 = new HashSet();
        this.A07 = new RectF();
        this.A06 = new Paint(1);
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A08 = new HashSet();
        this.A07 = new RectF();
        this.A06 = new Paint(1);
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e9, code lost:
        if (((long) r4.A0B()) < (((long) r4.A0B.A02(X.C15910s6.A1y)) * 1000)) goto L_0x01f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r8 = r18
            r11 = r19
            super.onDraw(r11)
            int r0 = r8.A01
            if (r0 == 0) goto L_0x0292
            int r1 = r8.getWidth()
            int r0 = r8.getPaddingLeft()
            int r1 = r1 - r0
            int r0 = r8.getPaddingRight()
            int r1 = r1 - r0
            int r9 = r8.getHeight()
            int r0 = r8.getPaddingTop()
            int r9 = r9 - r0
            int r0 = r8.getPaddingBottom()
            int r9 = r9 - r0
            float r7 = (float) r1
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 * r4
            int r2 = r8.A01
            float r1 = (float) r2
            float r3 = r3 / r1
            int r0 = r9 << 1
            float r0 = (float) r0
            r17 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r17
            float r16 = java.lang.Math.min(r0, r3)
            int r0 = r2 + -1
            float r0 = (float) r0
            float r0 = r0 * r16
            float r7 = r7 - r0
            float r7 = r7 * r4
            float r7 = r7 / r1
            android.graphics.Paint r6 = r8.A06
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r6.setStrokeCap(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r6.setStyle(r0)
            int r0 = r8.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r8.getPaddingTop()
            float r0 = (float) r0
            r11.translate(r1, r0)
            r12 = 0
            r10 = 0
            r5 = 0
        L_0x005f:
            int r0 = r8.A01
            if (r10 >= r0) goto L_0x028b
            int r2 = r8.A02
            if (r10 != r2) goto L_0x025e
            X.5My r0 = r8.A03
            if (r0 == 0) goto L_0x007d
            X.51u r0 = (X.C1035451u) r0
            X.1wh r0 = r0.A00
            X.1wk r4 = r0.A09()
            boolean r0 = r4 instanceof X.AnonymousClass34y
            if (r0 == 0) goto L_0x00c3
            X.34y r4 = (X.AnonymousClass34y) r4
            float r1 = r4.A00
        L_0x007b:
            r8.A00 = r1
        L_0x007d:
            float r13 = r8.A00
            float r13 = r13 * r7
            r0 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 / r0
            java.util.Set r1 = r8.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            boolean r2 = r1.contains(r0)
            r0 = 1728053247(0x66ffffff, float:6.0446287E23)
            if (r2 == 0) goto L_0x0095
            r0 = 1727676737(0x66fa4141, float:5.9089767E23)
        L_0x0095:
            r6.setColor(r0)
            android.graphics.RectF r4 = r8.A07
            float r0 = r5 + r7
            float r3 = (float) r9
            r4.set(r5, r12, r0, r3)
            float r2 = r3 / r17
            r11.drawRoundRect(r4, r2, r2, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            boolean r1 = r1.contains(r0)
            r0 = -1
            if (r1 == 0) goto L_0x00b3
            r0 = -376511(0xfffffffffffa4141, float:NaN)
        L_0x00b3:
            r6.setColor(r0)
            float r13 = r13 + r5
            r4.set(r5, r12, r13, r3)
            r11.drawRoundRect(r4, r2, r2, r6)
        L_0x00bd:
            float r0 = r7 + r16
            float r5 = r5 + r0
            int r10 = r10 + 1
            goto L_0x005f
        L_0x00c3:
            boolean r0 = r4 instanceof X.C606534t
            if (r0 == 0) goto L_0x00e5
            X.34t r4 = (X.C606534t) r4
            X.4WP r2 = r4.A06
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r13 = r13 / r2
            float r1 = java.lang.Math.min(r3, r13)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x007b
            X.4Ta r0 = r4.A05
            r0.A00()
            goto L_0x007b
        L_0x00e5:
            boolean r0 = r4 instanceof X.C606734v
            if (r0 == 0) goto L_0x0108
            X.34v r4 = (X.C606734v) r4
            X.4WP r2 = r4.A0d
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r13 = r13 / r2
            float r1 = java.lang.Math.min(r3, r13)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x007b
            X.4Ta r0 = r4.A05
            r0.A00()
            goto L_0x007b
        L_0x0108:
            boolean r0 = r4 instanceof X.C606634u
            if (r0 == 0) goto L_0x012b
            X.34u r4 = (X.C606634u) r4
            X.4WP r2 = r4.A07
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r13 = r13 / r2
            float r1 = java.lang.Math.min(r3, r13)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x007b
            X.4Ta r0 = r4.A05
            r0.A00()
            goto L_0x007b
        L_0x012b:
            boolean r0 = r4 instanceof X.C606934x
            if (r0 == 0) goto L_0x023f
            X.34x r4 = (X.C606934x) r4
            boolean r0 = r4 instanceof X.C606834w
            if (r0 == 0) goto L_0x01b7
            X.34w r4 = (X.C606834w) r4
            X.29D r3 = r4.A02
            r1 = 0
            if (r3 == 0) goto L_0x007b
            int r2 = r4.A04
            int r0 = r4.A02
            r13 = 1120403456(0x42c80000, float:100.0)
            if (r2 < r0) goto L_0x0148
            r1 = 1120403456(0x42c80000, float:100.0)
            goto L_0x007b
        L_0x0148:
            boolean r0 = r3.A0C()
            if (r0 != 0) goto L_0x0156
            X.4Ta r0 = r4.A05
            X.1wh r0 = r0.A00
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x01a6
        L_0x0156:
            X.29D r0 = r4.A02
            int r0 = r0.A03()
            long r2 = (long) r0
            com.obwhatsapp.mediaview.PhotoView r15 = r4.A0F
            int r0 = r15.getVisibility()
            r14 = 8
            if (r0 == r14) goto L_0x0186
            X.29D r0 = r4.A02
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0186
            X.29D r0 = r4.A02
            android.view.View r0 = r0.A06()
            if (r0 == r15) goto L_0x0186
            r4.A0E()
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0186
            r15.setVisibility(r14)
            android.view.View r0 = r4.A08
            r0.setVisibility(r14)
        L_0x0186:
            int r14 = r4.A03
            if (r14 != 0) goto L_0x019c
            X.29D r0 = r4.A02
            int r14 = r0.A04()
            r4.A03 = r14
            r0 = 1
            if (r14 <= r0) goto L_0x01b3
            long r0 = (long) r14
            int r0 = r4.A0J(r0)
            r4.A02 = r0
        L_0x019c:
            float r1 = (float) r2
            float r1 = r1 * r13
            float r0 = (float) r14
            float r1 = r1 / r0
        L_0x01a0:
            float r0 = java.lang.Math.min(r13, r1)
            r4.A00 = r0
        L_0x01a6:
            int r0 = r4.A04
            float r1 = (float) r0
            float r1 = r1 * r13
            float r0 = r4.A00
            float r1 = r1 + r0
            int r0 = r4.A02
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x007b
        L_0x01b3:
            r0 = 0
            r4.A03 = r0
            goto L_0x01a0
        L_0x01b7:
            X.29D r0 = r4.A02
            if (r0 == 0) goto L_0x01f0
            boolean r0 = r0.A0C()
            r2 = 1120403456(0x42c80000, float:100.0)
            if (r0 != 0) goto L_0x01f7
            X.4Ta r0 = r4.A05
            X.1wh r0 = r0.A00
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x01f7
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x01f4
            r0 = 0
        L_0x01d0:
            r4.A00 = r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01eb
            int r0 = r4.A0B()
            long r2 = (long) r0
            X.0s5 r1 = r4.A0B
            X.0tC r0 = X.C15910s6.A1y
            int r0 = r1.A02(r0)
            long r0 = (long) r0
            r13 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r13
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x01f0
        L_0x01eb:
            X.4Ta r0 = r4.A05
            r0.A00()
        L_0x01f0:
            float r1 = r4.A00
            goto L_0x007b
        L_0x01f4:
            r4.A00 = r2
            goto L_0x01eb
        L_0x01f7:
            int r0 = r4.A0B()
            long r0 = (long) r0
            com.obwhatsapp.mediaview.PhotoView r14 = r4.A0F
            int r3 = r14.getVisibility()
            r13 = 8
            if (r3 == r13) goto L_0x0228
            X.29D r3 = r4.A02
            boolean r3 = r3.A0D()
            if (r3 == 0) goto L_0x0228
            X.29D r3 = r4.A02
            android.view.View r3 = r3.A06()
            if (r3 == r14) goto L_0x0228
            r4.A0E()
            r4.A0E()
            boolean r3 = r4.A04
            if (r3 != 0) goto L_0x0228
            r14.setVisibility(r13)
            android.view.View r3 = r4.A08
            r3.setVisibility(r13)
        L_0x0228:
            X.29D r3 = r4.A02
            boolean r3 = r3.A0C()
            r3 = r3 ^ 1
            r4.A07 = r3
            float r13 = (float) r0
            float r13 = r13 * r2
            long r0 = r4.A08()
            float r3 = (float) r0
            float r13 = r13 / r3
            float r0 = java.lang.Math.min(r2, r13)
            goto L_0x01d0
        L_0x023f:
            X.34s r4 = (X.C606434s) r4
            X.4WP r2 = r4.A01
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r13 = r13 / r2
            float r1 = java.lang.Math.min(r3, r13)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x007b
            X.4Ta r0 = r4.A05
            r0.A00()
            goto L_0x007b
        L_0x025e:
            java.util.Set r1 = r8.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            boolean r1 = r1.contains(r0)
            if (r10 >= r2) goto L_0x0282
            r0 = -1
            if (r1 == 0) goto L_0x0270
            r0 = -376511(0xfffffffffffa4141, float:NaN)
        L_0x0270:
            r6.setColor(r0)
            android.graphics.RectF r2 = r8.A07
            float r1 = r5 + r7
            float r0 = (float) r9
            r2.set(r5, r12, r1, r0)
            float r0 = r0 / r17
            r11.drawRoundRect(r2, r0, r0, r6)
            goto L_0x00bd
        L_0x0282:
            r0 = 1728053247(0x66ffffff, float:6.0446287E23)
            if (r1 == 0) goto L_0x0270
            r0 = 1727676737(0x66fa4141, float:5.9089767E23)
            goto L_0x0270
        L_0x028b:
            X.5My r0 = r8.A03
            if (r0 == 0) goto L_0x0292
            r8.invalidate()
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.widget.StatusPlaybackProgressView.onDraw(android.graphics.Canvas):void");
    }

    public void setCount(int i2) {
        this.A01 = i2;
        invalidate();
    }

    public void setPosition(int i2) {
        int i3 = this.A02;
        SS.setCP(i2);
        if (i3 != i2) {
            this.A02 = i2;
            this.A00 = 0.0f;
            invalidate();
        }
    }

    public void setProgressProvider(C108175My r1) {
        this.A03 = r1;
        invalidate();
    }
}
