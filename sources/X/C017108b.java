package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: X.08b  reason: invalid class name and case insensitive filesystem */
public class C017108b {
    public static int A00(View view) {
        return view.getLayoutDirection();
    }

    public static int A01(View view) {
        return view.getTextDirection();
    }

    public static Locale A02(TextView textView) {
        return textView.getTextLocale();
    }

    public static void A03(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, TextView textView) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void A04(View view, int i2) {
        view.setTextDirection(i2);
    }

    public static Drawable[] A05(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
}
