package com.obwhatsapp.camera.overlays;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;

public class ShutterOverlay extends View implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public boolean A02;
    public final Paint A03;

    public ShutterOverlay(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = new Paint(1);
        A00(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A03 = new Paint(1);
        A00(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = new Paint(1);
        A00(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = new Paint(1);
        A00(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final void A00(Context context) {
        Paint paint = this.A03;
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.dimen0744));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        if (this.A02) {
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.A03);
        }
    }
}
