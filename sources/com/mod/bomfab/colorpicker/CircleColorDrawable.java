package com.mod.bomfab.colorpicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;

public class CircleColorDrawable extends ColorDrawable {
    private Paint fillBackPaint = PaintBuilder.newPaint().shader(PaintBuilder.createAlphaPatternShader(16)).build();
    private Paint fillPaint = PaintBuilder.newPaint().style(Paint.Style.FILL).color(0).build();
    private Paint strokePaint = PaintBuilder.newPaint().style(Paint.Style.STROKE).stroke(this.strokeWidth).color(-6381922).build();
    private float strokeWidth;

    public CircleColorDrawable() {
    }

    public CircleColorDrawable(int i2) {
        super(i2);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawColor(0);
        float width = ((float) canvas.getWidth()) / 2.0f;
        this.strokeWidth = width / 12.0f;
        this.strokePaint.setStrokeWidth(this.strokeWidth);
        this.fillPaint.setColor(getColor());
        canvas.drawCircle(width, width, width - (this.strokeWidth * 1.5f), this.fillBackPaint);
        canvas.drawCircle(width, width, width - (this.strokeWidth * 1.5f), this.fillPaint);
        canvas.drawCircle(width, width, width - this.strokeWidth, this.strokePaint);
    }

    @Override
    public void setColor(int i2) {
        super.setColor(i2);
        invalidateSelf();
    }
}
