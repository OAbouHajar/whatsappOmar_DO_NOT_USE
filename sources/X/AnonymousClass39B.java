package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.obwhatsapp.R;

/* renamed from: X.39B  reason: invalid class name */
public class AnonymousClass39B {
    public boolean A00 = true;
    public final TextPaint A01;
    public final TextPaint A02;
    public final String A03;

    public AnonymousClass39B(Context context, AnonymousClass013 r9) {
        TextPaint textPaint = new TextPaint(1);
        this.A02 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.A01 = textPaint2;
        textPaint.setColor(-1);
        textPaint.setTextSize(40.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        Typeface A032 = AnonymousClass1UP.A03(context);
        textPaint.setShadowLayer(0.5f, 0.0f, 1.0f, Color.parseColor("#73000000"));
        textPaint2.setColor(0);
        textPaint2.setTextSize(40.0f);
        textPaint2.setTextAlign(Paint.Align.CENTER);
        Typeface A033 = AnonymousClass1UP.A03(context);
        textPaint2.setShadowLayer(7.0f, 0.0f, 0.0f, Color.parseColor("#4D000000"));
        this.A03 = context.getString(R.string.str1786).toUpperCase(C13690nt.A0m(r9));
    }

    public void A00(float f2) {
        if (this.A00) {
            TextPaint textPaint = this.A02;
            textPaint.setTextSize(textPaint.getTextSize() * f2);
            TextPaint textPaint2 = this.A01;
            textPaint2.setTextSize(textPaint2.getTextSize() * f2);
        }
    }

    public void A01(Canvas canvas, RectF rectF, float f2) {
        if (this.A00) {
            Rect A0J = AnonymousClass000.A0J();
            TextPaint textPaint = this.A02;
            String str = this.A03;
            textPaint.getTextBounds(str, 0, str.length(), A0J);
            canvas.save();
            float width = rectF.left + (rectF.width() / 2.0f);
            float height = rectF.top + rectF.height() + ((float) (A0J.height() << 1));
            C13690nt.A0x(canvas, rectF, f2);
            canvas.drawText(str, width, height, this.A01);
            canvas.drawText(str, width, height, textPaint);
            canvas.restore();
        }
    }
}
