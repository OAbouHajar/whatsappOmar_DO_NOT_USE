package X;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.widget.TextView;

/* renamed from: X.46w  reason: invalid class name and case insensitive filesystem */
public class C811046w {
    public static void A00(TextView textView, Object[] objArr, int i2) {
        Context context = textView.getContext();
        Spannable spannable = (Spannable) Html.fromHtml(context.getString(i2, objArr));
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            spannable.setSpan(new AnonymousClass3MS(context, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
            spannable.removeSpan(uRLSpan);
        }
        textView.setText(spannable);
        textView.setMovementMethod(new AnonymousClass3MF());
    }
}
