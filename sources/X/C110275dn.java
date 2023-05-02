package X;

import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.SuperscriptSpan;

/* renamed from: X.5dn  reason: invalid class name and case insensitive filesystem */
public class C110275dn extends SuperscriptSpan {
    public float A00;
    public Rect A01;
    public String A02;

    public C110275dn(String str) {
        this.A02 = str.equals(".") ? ".1" : str;
        this.A00 = 1.0f;
        this.A01 = new Rect();
    }

    public final void A00(TextPaint textPaint) {
        String str = this.A02;
        int length = str.length();
        Rect rect = this.A01;
        textPaint.getTextBounds(str, 0, length, rect);
        int i2 = rect.top;
        float ascent = textPaint.ascent();
        float textSize = textPaint.getTextSize();
        float f2 = this.A00;
        textPaint.setTextSize(textSize * f2);
        textPaint.getTextBounds(str, 0, length, rect);
        int i3 = rect.top;
        textPaint.baselineShift = (int) (((float) textPaint.baselineShift) + ((float) (i2 - i3)) + (((((float) i2) - ascent) - (((float) i3) - textPaint.ascent())) * f2));
    }

    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint);
    }
}
