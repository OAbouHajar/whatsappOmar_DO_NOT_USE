package X;

import android.view.Display;
import android.view.View;

/* renamed from: X.06p  reason: invalid class name and case insensitive filesystem */
public class C013706p {
    public static int A00() {
        return View.generateViewId();
    }

    public static int A01(View view) {
        return view.getLayoutDirection();
    }

    public static int A02(View view) {
        return view.getPaddingEnd();
    }

    public static int A03(View view) {
        return view.getPaddingStart();
    }

    public static Display A04(View view) {
        return view.getDisplay();
    }

    public static void A05(View view, int i2) {
        view.setLabelFor(i2);
    }

    public static void A06(View view, int i2) {
        view.setLayoutDirection(i2);
    }

    public static void A07(View view, int i2, int i3, int i4, int i5) {
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static boolean A08(View view) {
        return view.isPaddingRelative();
    }
}
