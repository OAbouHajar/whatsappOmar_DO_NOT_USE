package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: X.0Sc  reason: invalid class name and case insensitive filesystem */
public final class C05570Sc {
    public static int A00(int i2, int i3) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i2, i3) : i2 & -8388609;
    }

    public static void A01(int i2, int i3, int i4, Rect rect, Rect rect2, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            C04140Li.A00(i2, i3, i4, rect, rect2, i5);
        } else {
            Gravity.apply(i2, i3, i4, rect, rect2);
        }
    }
}
