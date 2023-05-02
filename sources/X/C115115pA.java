package X;

import android.graphics.Rect;

/* renamed from: X.5pA  reason: invalid class name and case insensitive filesystem */
public class C115115pA {
    public static void A00(Rect rect, Rect rect2, int i2, int i3) {
        if (!(i3 == 0 || i3 == 180)) {
            rect.set(0, 0, rect.height(), rect.width());
        }
        if (i2 == 90 || i2 == 270) {
            rect2.set(0, 0, rect2.height(), rect2.width());
        }
    }
}
