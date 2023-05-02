package X;

import android.text.Spannable;

/* renamed from: X.455  reason: invalid class name */
public final class AnonymousClass455 {
    public static void A00(Spannable spannable, Object obj, int i2, int i3) {
        for (Object obj2 : spannable.getSpans(i2, i3, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i2 && spannable.getSpanEnd(obj2) == i3 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i2, i3, 33);
    }
}
