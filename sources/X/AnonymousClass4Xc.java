package X;

import android.view.View;

/* renamed from: X.4Xc  reason: invalid class name */
public class AnonymousClass4Xc {
    public static boolean A00(int i2, int i3) {
        if (i2 != i3) {
            return View.MeasureSpec.getMode(i2) == 0 && View.MeasureSpec.getMode(i3) == 0;
        }
        return true;
    }

    public static boolean A01(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (i2 == i3) {
            return true;
        }
        if (mode2 == 0 && mode == 0) {
            return true;
        }
        float f2 = (float) i4;
        if (mode != 1073741824 || AnonymousClass3K4.A01((float) size, f2) >= 0.5f) {
            return (mode == Integer.MIN_VALUE && mode2 == 0) ? ((float) size) >= f2 : mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 > size && f2 <= ((float) size);
        }
        return true;
    }
}
