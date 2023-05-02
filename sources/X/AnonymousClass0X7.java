package X;

import android.view.View;

/* renamed from: X.0X7  reason: invalid class name */
public class AnonymousClass0X7 {
    public static CharSequence A00(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static Object A01(View view, int i2) {
        return view.requireViewById(i2);
    }

    public static void A02(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void A03(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void A04(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }

    public static boolean A05(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean A06(View view) {
        return view.isScreenReaderFocusable();
    }
}
