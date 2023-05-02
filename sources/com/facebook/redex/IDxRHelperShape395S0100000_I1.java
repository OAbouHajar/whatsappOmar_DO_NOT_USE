package com.facebook.redex;

import X.C07180ak;
import X.C12320kC;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class IDxRHelperShape395S0100000_I1 implements C12320kC {
    public Object A00;
    public final int A01;

    public IDxRHelperShape395S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A8H(Canvas canvas, Paint paint, RectF rectF, float f2) {
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        RectF rectF2 = rectF;
        float f3 = f2;
        if (this.A01 != 0) {
            float f4 = 2.0f * f2;
            float width = (rectF2.width() - f4) - 1.0f;
            float height = (rectF2.height() - f4) - 1.0f;
            if (f2 >= 1.0f) {
                float f5 = f2 + 0.5f;
                RectF rectF3 = ((C07180ak) this.A00).A00;
                float f6 = -f5;
                rectF3.set(f6, f6, f5, f5);
                int save = canvas2.save();
                canvas2.translate(rectF2.left + f5, rectF2.top + f5);
                canvas2.drawArc(rectF3, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas2.drawArc(rectF3, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas2.drawArc(rectF3, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas2.drawArc(rectF3, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f7 = rectF2.top;
                canvas2.drawRect((rectF2.left + f5) - 1.0f, f7, (rectF2.right - f5) + 1.0f, f7 + f5, paint2);
                float f8 = rectF2.bottom;
                canvas2.drawRect((rectF2.left + f5) - 1.0f, f8 - f5, (rectF2.right - f5) + 1.0f, f8, paint2);
            }
            canvas2.drawRect(rectF2.left, rectF2.top + f2, rectF2.right, rectF2.bottom - f2, paint2);
            return;
        }
        canvas2.drawRoundRect(rectF2, f3, f3, paint2);
    }
}
