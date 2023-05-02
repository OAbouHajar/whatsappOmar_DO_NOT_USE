package com.obwhatsapp.calling.views;

import X.AnonymousClass006;
import X.C13680ns;
import X.C13690nt;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;

public class VoipCallControlRingingDotsIndicator extends View implements AnonymousClass006 {
    public int A00;
    public int A01;
    public C52662eE A02;
    public boolean A03;
    public final Paint A04;
    public final float[] A05;

    public VoipCallControlRingingDotsIndicator(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A05 = new float[3];
        this.A04 = C13680ns.A0E();
        A00(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A05 = new float[3];
        this.A04 = C13680ns.A0E();
        A00(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A05 = new float[3];
        this.A04 = C13680ns.A0E();
        A00(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A05 = new float[3];
        this.A04 = C13680ns.A0E();
        A00(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final void A00(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen00fb);
        this.A01 = dimensionPixelSize;
        this.A00 = dimensionPixelSize << 1;
        C13690nt.A0r(getContext(), this.A04, 17170443);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i2 = 0;
        do {
            Paint paint = this.A04;
            paint.setAlpha((int) (this.A05[i2] * 255.0f));
            int i3 = this.A01;
            float f2 = (float) i3;
            canvas.drawCircle((float) (((this.A00 << 1) * i2) + i3), f2, f2, paint);
            i2++;
        } while (i2 < 3);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.A00;
        setMeasuredDimension(i4 * 5, i4);
    }
}
