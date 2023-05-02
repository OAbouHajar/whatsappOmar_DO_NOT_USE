package X;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.08h  reason: invalid class name and case insensitive filesystem */
public class C017608h extends C017708i {
    public void A00(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    public boolean A01(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
