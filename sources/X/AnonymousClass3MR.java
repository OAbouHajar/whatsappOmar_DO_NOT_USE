package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: X.3MR  reason: invalid class name */
public class AnonymousClass3MR extends TypefaceSpan {
    public final Typeface A00;

    public AnonymousClass3MR(Context context) {
        super("");
        this.A00 = AnonymousClass1UP.A03(context);
    }

    public static void A00(Paint paint, Typeface typeface) {
        Typeface typeface2 = paint.getTypeface();
        if (((typeface2 == null ? 0 : typeface2.getStyle()) & (typeface.getStyle() ^ -1) & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint, this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint, this.A00);
    }
}
