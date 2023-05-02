package com.obwhatsapp.components.button;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.obwhatsapp.R;

public class ThumbnailPickerButton extends ThumbnailButton {
    public Path A00;
    public boolean A01;

    public ThumbnailPickerButton(Context context) {
        super(context);
        A02();
        this.A00 = new Path();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A00 = new Path();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A00 = new Path();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public void A04(Canvas canvas) {
        super.A04(canvas);
        if (isEnabled()) {
            float f2 = this.A02;
            if (f2 > 0.0f) {
                float f3 = f2 * 7.0f;
                Path path = this.A00;
                path.reset();
                this.A05.setStyle(Paint.Style.FILL);
                RectF rectF = this.A09;
                path.moveTo(rectF.right, rectF.bottom - f3);
                path.lineTo(rectF.right, rectF.bottom - this.A02);
                float f4 = rectF.right;
                float f5 = this.A02 * 2.0f;
                float f6 = rectF.bottom;
                path.arcTo(new RectF(f4 - f5, f6 - f5, f4, f6), 0.0f, 90.0f);
                path.lineTo(rectF.right - f3, rectF.bottom);
                path.lineTo(rectF.right, rectF.bottom - f3);
                this.A05.setColor(1409286144);
                canvas.drawPath(path, this.A05);
                path.reset();
                path.moveTo(rectF.right, rectF.bottom - f3);
                path.lineTo(rectF.right - f3, rectF.bottom);
                this.A05.setStyle(Paint.Style.STROKE);
                this.A05.setStrokeJoin(Paint.Join.ROUND);
                this.A05.setStrokeCap(Paint.Cap.ROUND);
                this.A05.setStrokeWidth(getResources().getDimension(R.dimen.dimen07d8));
                this.A05.setColor(-570425345);
                canvas.drawPath(path, this.A05);
            }
        }
    }
}
