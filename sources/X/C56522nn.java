package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* renamed from: X.2nn  reason: invalid class name and case insensitive filesystem */
public class C56522nn extends ImageSpan {
    public WeakReference A00;

    public C56522nn(Drawable drawable) {
        super(drawable);
    }

    public static CharSequence A00(Paint paint, Drawable drawable, CharSequence charSequence) {
        SpannableStringBuilder A0F = C13690nt.A0F(AnonymousClass000.A0g("  ", charSequence));
        A02(paint, drawable, A0F, -1, 0, 1);
        return A0F;
    }

    public static CharSequence A01(Paint paint, Drawable drawable, CharSequence charSequence, String str) {
        int indexOf = TextUtils.indexOf(charSequence, str);
        SpannableStringBuilder A0F = C13690nt.A0F(charSequence);
        A02(paint, drawable, A0F, -1, indexOf, str.length() + indexOf);
        return A0F;
    }

    public static void A02(Paint paint, Drawable drawable, SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
        if (i2 <= 0) {
            i2 = (int) paint.getTextSize();
        }
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * i2) / drawable.getIntrinsicHeight(), i2);
        spannableStringBuilder.setSpan(new C56522nn(drawable), i3, i4, 33);
    }

    public Drawable A03() {
        Drawable drawable;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (drawable = (Drawable) weakReference.get()) != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.A00 = C13690nt.A0h(drawable2);
        return drawable2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Drawable A03 = A03();
        canvas.save();
        Rect bounds = A03.getBounds();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.translate(f2, ((float) i5) + (((fontMetrics.ascent + fontMetrics.descent) - ((float) bounds.height())) / 2.0f));
        A03.draw(canvas);
        canvas.restore();
    }
}
