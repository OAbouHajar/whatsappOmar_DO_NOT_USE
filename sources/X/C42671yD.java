package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* renamed from: X.1yD  reason: invalid class name and case insensitive filesystem */
public class C42671yD extends Drawable {
    public final int A00;
    public final int A01;
    public final TextPaint A02;
    public final CharSequence A03;

    public C42671yD(Typeface typeface, CharSequence charSequence, int i2, int i3) {
        this.A03 = charSequence;
        TextPaint textPaint = new TextPaint();
        this.A02 = textPaint;
        textPaint.setTextSize((float) i3);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(i2);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        if (typeface != null) {
        }
        this.A01 = (int) Math.ceil((double) textPaint.measureText(charSequence, 0, charSequence.length()));
        this.A00 = textPaint.getFontMetricsInt((Paint.FontMetricsInt) null);
    }

    public void draw(Canvas canvas) {
        int width = getBounds().width() >> 1;
        TextPaint textPaint = this.A02;
        int height = (int) (((float) (getBounds().height() >> 1)) - ((textPaint.descent() + textPaint.ascent()) / 2.0f));
        CharSequence charSequence = this.A03;
        canvas.drawText(charSequence, 0, charSequence.length(), (float) width, (float) height, textPaint);
    }

    public int getIntrinsicHeight() {
        return this.A00;
    }

    public int getIntrinsicWidth() {
        return this.A01;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        this.A02.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }
}
