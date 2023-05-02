package X;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.099  reason: invalid class name */
public class AnonymousClass099 {
    public static int A00(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static void A01(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    public static void A02(View view, View view2, ViewParent viewParent, int i2) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
    }

    public static void A03(AccessibilityEvent accessibilityEvent, int i2) {
        accessibilityEvent.setContentChangeTypes(i2);
    }

    public static boolean A04(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean A05(View view) {
        return view.isLaidOut();
    }
}
