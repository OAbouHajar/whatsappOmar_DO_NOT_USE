package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.C16150sX;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScalingFrameLayout extends FrameLayout implements AnonymousClass006 {
    public float A00;
    public AnonymousClass013 A01;
    public C52662eE A02;
    public boolean A03;

    public ScalingFrameLayout(Context context) {
        super(context);
        A00();
        this.A00 = 1.0f;
    }

    public ScalingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A00 = 1.0f;
    }

    public ScalingFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A00 = 1.0f;
    }

    public ScalingFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        this.A00 = 1.0f;
    }

    public ScalingFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.A01.A0T()) {
            canvas.translate((float) getWidth(), 0.0f);
        }
        float f2 = this.A00;
        canvas.scale(f2, f2);
        if (this.A01.A0T()) {
            canvas.translate((float) (-getWidth()), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i2)) / this.A00), mode), View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i3)) / this.A00), mode2));
        setMeasuredDimension((int) (((float) getMeasuredWidth()) * this.A00), (int) (((float) getMeasuredHeight()) * this.A00));
    }

    public void setScale(float f2) {
        this.A00 = f2;
    }
}
