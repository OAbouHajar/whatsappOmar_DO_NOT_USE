package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

public class ViewCompatJB {
    public static Object getAccessibilityNodeProvider(View view) {
        return view.getAccessibilityNodeProvider();
    }

    public static int getImportantForAccessibility(View view) {
        return view.getImportantForAccessibility();
    }

    public static ViewParent getParentForAccessibility(View view) {
        return view.getParentForAccessibility();
    }

    public static boolean hasTransientState(View view) {
        return view.hasTransientState();
    }

    public static boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    public static void postInvalidateOnAnimation(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void postInvalidateOnAnimation(View view, int i2, int i3, int i4, int i5) {
        view.postInvalidate(i2, i3, i4, i5);
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void postOnAnimationDelayed(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    public static void setHasTransientState(View view, boolean z2) {
        view.setHasTransientState(z2);
    }

    public static void setImportantForAccessibility(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }
}
