package com.obwhatsapp.camera.overlays;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.R;

public class ZoomOverlay extends View implements AnonymousClass006 {
    public float A00;
    public C52662eE A01;
    public String A02;
    public boolean A03;
    public final Paint A04;
    public final RectF A05;
    public final TextPaint A06;
    public final Runnable A07;

    public ZoomOverlay(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A05 = new RectF();
        this.A04 = new Paint(1);
        this.A06 = new TextPaint(1);
        this.A07 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 21);
        A00(context);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A05 = new RectF();
        this.A04 = new Paint(1);
        this.A06 = new TextPaint(1);
        this.A07 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 21);
        A00(context);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A05 = new RectF();
        this.A04 = new Paint(1);
        this.A06 = new TextPaint(1);
        this.A07 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 21);
        A00(context);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A05 = new RectF();
        this.A04 = new Paint(1);
        this.A06 = new TextPaint(1);
        this.A07 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 21);
        A00(context);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final void A00(Context context) {
        Paint paint = this.A04;
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.dimen08c9));
        paint.setStyle(Paint.Style.STROKE);
        TextPaint textPaint = this.A06;
        textPaint.setTextSize(context.getResources().getDimension(R.dimen.dimen08ca));
        textPaint.setColor(-1711276033);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFakeBoldText(true);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public float getMaxScale() {
        return (((float) Math.min(getWidth() >> 1, getHeight() >> 1)) * 0.9f) / this.A06.measureText("x00.0");
    }

    public void onDraw(Canvas canvas) {
        int width = getWidth() >> 1;
        int height = getHeight() >> 1;
        float min = ((float) Math.min(width, height)) * 0.9f;
        Paint paint = this.A04;
        paint.setColor(-1711276033);
        RectF rectF = this.A05;
        float f2 = (float) width;
        float f3 = (float) height;
        rectF.set(f2 - min, f3 - min, f2 + min, f3 + min);
        canvas.drawOval(rectF, paint);
        String str = this.A02;
        if (str != null) {
            TextPaint textPaint = this.A06;
            canvas.drawText(str, f2, f3 - ((textPaint.descent() + textPaint.ascent()) / 2.0f), textPaint);
        }
        float measureText = this.A06.measureText("x00.0");
        rectF.set(f2 - measureText, f3 - measureText, f2 + measureText, f3 + measureText);
        canvas.drawOval(rectF, paint);
        float min2 = Math.min(min, measureText * this.A00);
        paint.setColor(-13388315);
        rectF.set(f2 - min2, f3 - min2, f2 + min2, f3 + min2);
        canvas.drawOval(rectF, paint);
    }
}
