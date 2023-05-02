package X;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.0Sm  reason: invalid class name and case insensitive filesystem */
public class C05670Sm {
    public static int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i2) {
        accessibilityEvent.setContentChangeTypes(i2);
    }
}
