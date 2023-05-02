package com.obwhatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass006;
import X.AnonymousClass36E;
import X.AnonymousClass39P;
import X.C16150sX;
import X.C16300so;
import X.C16320sq;
import X.C23401Bv;
import X.C29491ai;
import X.C49672Uz;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import java.util.HashMap;

public class ShapePickerView extends RelativeLayout implements C49672Uz, AnonymousClass006 {
    public ValueAnimator A00;
    public Bitmap A01;
    public Bitmap A02;
    public RectF A03;
    public C16300so A04;
    public AnonymousClass39P A05;
    public AnonymousClass36E A06;
    public C16320sq A07;
    public C52662eE A08;
    public boolean A09;
    public final Paint A0A;

    public ShapePickerView(Context context) {
        super(context);
        A00();
        this.A0A = new Paint(1);
    }

    public ShapePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0A = new Paint(1);
    }

    public ShapePickerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A0A = new Paint(1);
    }

    public ShapePickerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A04 = (C16300so) r1.A5p.get();
            this.A07 = (C16320sq) r1.ARB.get();
        }
    }

    public void A01(Bitmap bitmap, AnonymousClass39P r11) {
        if (A02()) {
            invalidate();
        }
        if (r11.A04 <= 0 || r11.A03 <= 0) {
            C16300so r3 = this.A04;
            ((C23401Bv) r3).A08(new C29491ai("shape-picker-doodle-view-state-dimen"), "shape-picker-doodle-view-state-dimen", r11.toString(), new HashMap(), true);
            return;
        }
        this.A05 = r11;
        this.A02 = bitmap;
        RectF rectF = r11.A0B;
        this.A03 = new RectF(rectF);
        AnonymousClass36E r2 = new AnonymousClass36E(r11.A0A, new Rect(0, 0, r11.A04, r11.A03), new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom), this);
        this.A06 = r2;
        this.A07.Ack(r2, bitmap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r4.A02 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r4 = this;
            X.36E r1 = r4.A06
            if (r1 == 0) goto L_0x0008
            r0 = 1
            r1.A06(r0)
        L_0x0008:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x000f
            r0.cancel()
        L_0x000f:
            r3 = 0
            r4.A03 = r3
            android.graphics.Bitmap r2 = r4.A01
            if (r2 != 0) goto L_0x001b
            android.graphics.Bitmap r0 = r4.A02
            r1 = 0
            if (r0 == 0) goto L_0x0023
        L_0x001b:
            r1 = 1
            if (r2 == 0) goto L_0x0023
            r2.recycle()
            r4.A01 = r3
        L_0x0023:
            android.graphics.Bitmap r0 = r4.A02
            if (r0 == 0) goto L_0x002c
            r0.recycle()
            r4.A02 = r3
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerView.A02():boolean");
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A0A);
        }
        super.draw(canvas);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A08;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        AnonymousClass39P r1 = this.A05;
        if (r1 != null && this.A02 != null && !r1.A0B.equals(this.A03)) {
            A01(this.A02.copy(Bitmap.Config.ARGB_8888, true), this.A05);
        }
    }
}
