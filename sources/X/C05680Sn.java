package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0Sn  reason: invalid class name and case insensitive filesystem */
public class C05680Sn {
    public static void A00(AccessibilityManager accessibilityManager, C12400kK r2) {
        accessibilityManager.addTouchExplorationStateChangeListener(new C07030Yw(r2));
    }

    public static void A01(AccessibilityManager accessibilityManager, C12400kK r2) {
        accessibilityManager.removeTouchExplorationStateChangeListener(new C07030Yw(r2));
    }
}
