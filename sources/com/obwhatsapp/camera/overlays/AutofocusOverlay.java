package com.obwhatsapp.camera.overlays;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.R;

public class AutofocusOverlay extends View implements AnonymousClass006 {
    public float A00;
    public RectF A01;
    public C52662eE A02;
    public Boolean A03;
    public boolean A04;
    public boolean A05;
    public final Paint A06;
    public final Runnable A07;

    public AutofocusOverlay(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A06 = new Paint(1);
        this.A07 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 19);
        A00();
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A06 = new Paint(1);
        this.A07 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 19);
        A00();
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A06 = new Paint(1);
        this.A07 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 19);
        A00();
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A06 = new Paint(1);
        this.A07 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 19);
        A00();
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public final void A00() {
        this.A00 = getResources().getDimension(R.dimen.dimen008f);
        Paint paint = this.A06;
        paint.setStrokeWidth(getResources().getDimension(R.dimen.dimen0091));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        int i2;
        if (!this.A05) {
            Boolean bool = this.A03;
            if (bool == null) {
                paint = this.A06;
                i2 = -1;
            } else {
                Boolean bool2 = Boolean.TRUE;
                paint = this.A06;
                i2 = -65536;
                if (bool == bool2) {
                    i2 = -16711936;
                }
            }
            paint.setColor(i2);
        }
        boolean z2 = this.A05;
        RectF rectF = this.A01;
        if (z2) {
            float f2 = this.A00 / 2.0f;
            canvas.drawRoundRect(rectF, f2, f2, this.A06);
            return;
        }
        canvas.drawRect(rectF, this.A06);
    }
}
