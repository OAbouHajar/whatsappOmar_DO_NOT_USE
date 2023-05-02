package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.1t2  reason: invalid class name and case insensitive filesystem */
public class C39771t2 extends MetricAffectingSpan {
    public final Typeface A00;

    public C39771t2(Typeface typeface) {
        this.A00 = typeface;
    }

    public final void A00(Paint paint) {
        Typeface typeface = paint.getTypeface();
        int style = (typeface == null ? 0 : typeface.getStyle()) & (this.A00.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint);
    }
}
