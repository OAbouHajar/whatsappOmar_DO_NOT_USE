package X;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.0Lq  reason: invalid class name and case insensitive filesystem */
public final class C04220Lq {
    public static void A00(AccessibilityEvent accessibilityEvent, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            C05670Sm.A01(accessibilityEvent, i2);
        }
    }
}
