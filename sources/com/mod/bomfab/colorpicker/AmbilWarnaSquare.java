package com.mod.bomfab.colorpicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

public class AmbilWarnaSquare extends View {
    final float[] color = {1.0f, 1.0f, 1.0f};
    Shader luar;
    Paint paint;

    public AmbilWarnaSquare(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AmbilWarnaSquare(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    @SuppressLint("DrawAllocation")
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.paint == null) {
            this.paint = new Paint();
            this.luar = new LinearGradient(0.0f, 0.0f, 0.0f, (float) getMeasuredHeight(), -1, -16777216, Shader.TileMode.CLAMP);
        }
        this.paint.setShader(new ComposeShader(this.luar, new LinearGradient(0.0f, 0.0f, (float) getMeasuredWidth(), 0.0f, -1, Color.HSVToColor(this.color), Shader.TileMode.CLAMP), PorterDuff.Mode.MULTIPLY));
        canvas.drawRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), this.paint);
    }

    public void setHue(float f2) {
        this.color[0] = f2;
        invalidate();
    }
}
