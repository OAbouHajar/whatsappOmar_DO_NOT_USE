package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.3MP  reason: invalid class name */
public class AnonymousClass3MP extends ReplacementSpan {
    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        canvas.drawText("□", f2, (float) i5, paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil((double) paint.measureText("□"));
    }
}
