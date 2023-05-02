package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.obwhatsapp.R;

/* renamed from: X.3MQ  reason: invalid class name */
public class AnonymousClass3MQ extends ReplacementSpan {
    public final int A00;
    public final Context A01;

    public AnonymousClass3MQ(Context context, int i2) {
        this.A01 = context;
        this.A00 = i2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Paint paint2 = paint;
        paint2.setColor(this.A00);
        int i7 = i2;
        int i8 = i3;
        canvas.drawText(charSequence, i7, i8, (float) ((int) ((f2 + ((float) (getSize(paint2, charSequence, i7, i8, (Paint.FontMetricsInt) null) >> 1))) - (paint2.measureText(charSequence, i7, i8) / 2.0f))), (float) i5, paint2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        return Math.round(paint.measureText(charSequence, charSequence.length(), charSequence.length()) + this.A01.getResources().getDimension(R.dimen.dimen019b));
    }
}
