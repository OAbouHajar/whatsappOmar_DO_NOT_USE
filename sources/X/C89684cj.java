package X;

import android.graphics.Paint;
import android.os.Build;

/* renamed from: X.4cj  reason: invalid class name and case insensitive filesystem */
public class C89684cj {
    public static final AnonymousClass03L A00 = new AnonymousClass03L(50);

    public static Paint.FontMetricsInt A00(Paint paint) {
        if (Build.VERSION.SDK_INT > 23 || !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
            return paint.getFontMetricsInt();
        }
        int floatToIntBits = (((Float.floatToIntBits(paint.getTextSize()) + 31) * 31) + Float.floatToIntBits(paint.getTextSkewX())) * 31;
        float f2 = 0.0f;
        if (paint.isFakeBoldText()) {
            f2 = 1.0f;
        }
        int floatToIntBits2 = (floatToIntBits + Float.floatToIntBits(f2)) * 31;
        int hashCode = paint.getTypeface() != null ? paint.getTypeface().hashCode() : 0;
        AnonymousClass03L r2 = A00;
        Integer valueOf = Integer.valueOf(floatToIntBits2 + hashCode);
        Paint.FontMetricsInt fontMetricsInt = (Paint.FontMetricsInt) r2.A02(valueOf);
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        r2.A06(valueOf, fontMetricsInt2);
        return fontMetricsInt2;
    }
}
