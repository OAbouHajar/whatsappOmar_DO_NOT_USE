package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatJellyBean {
    AccessibilityNodeInfoCompatJellyBean() {
    }

    public static void addChild(Object obj, View view, int i2) {
        ((AccessibilityNodeInfo) obj).addChild(view, i2);
    }

    public static Object findFocus(Object obj, int i2) {
        return ((AccessibilityNodeInfo) obj).findFocus(i2);
    }

    public static Object focusSearch(Object obj, int i2) {
        return ((AccessibilityNodeInfo) obj).focusSearch(i2);
    }

    public static int getMovementGranularities(Object obj) {
        return ((AccessibilityNodeInfo) obj).getMovementGranularities();
    }

    public static boolean isAccessibilityFocused(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }

    public static boolean isVisibleToUser(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    public static Object obtain(View view, int i2) {
        return AccessibilityNodeInfo.obtain(view, i2);
    }

    public static boolean performAction(Object obj, int i2, Bundle bundle) {
        return ((AccessibilityNodeInfo) obj).performAction(i2, bundle);
    }

    public static void setAccesibilityFocused(Object obj, boolean z2) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z2);
    }

    public static void setMovementGranularities(Object obj, int i2) {
        ((AccessibilityNodeInfo) obj).setMovementGranularities(i2);
    }

    public static void setParent(Object obj, View view, int i2) {
        ((AccessibilityNodeInfo) obj).setParent(view, i2);
    }

    public static void setSource(Object obj, View view, int i2) {
        ((AccessibilityNodeInfo) obj).setSource(view, i2);
    }

    public static void setVisibleToUser(Object obj, boolean z2) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z2);
    }
}
