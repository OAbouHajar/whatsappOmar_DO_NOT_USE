package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.3MO  reason: invalid class name */
public class AnonymousClass3MO extends MetricAffectingSpan {
    public final float A00;
    public final float A01;

    public AnonymousClass3MO(float f2, float f3) {
        this.A01 = f2;
        this.A00 = f3;
    }

    public final void A00(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A01 / (textPaint.getTextSize() / this.A00));
    }

    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint);
    }
}
