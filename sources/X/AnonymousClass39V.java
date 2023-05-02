package X;

import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape237S0100000_2_I1;
import com.facebook.redex.IDxDListenerShape191S0100000_2_I1;

/* renamed from: X.39V  reason: invalid class name */
public class AnonymousClass39V {
    public final int A00;
    public final View A01;
    public final View A02;

    public AnonymousClass39V(View view, View view2, int i2) {
        this.A02 = view;
        this.A01 = view2;
        this.A00 = i2;
        if (Build.VERSION.SDK_INT >= 21) {
            view.getViewTreeObserver().addOnScrollChangedListener(new IDxCListenerShape237S0100000_2_I1(this, 5));
        }
    }

    public void A00() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A02.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape191S0100000_2_I1(this, 5));
        }
    }

    public final void A01() {
        this.A01.setElevation(this.A02.canScrollVertically(1) ? (float) this.A00 : 0.0f);
    }

    public void A02(Context context, ClickableSpan clickableSpan, TextView textView, String str, int i2) {
        SpannableString spannableString = new SpannableString(str);
        int length = str.length();
        spannableString.setSpan(clickableSpan, 0, length, 0);
        spannableString.setSpan(new TextAppearanceSpan(context, i2), 0, length, 0);
        spannableString.setSpan(new AnonymousClass3MT(this), 0, length, 0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }
}
