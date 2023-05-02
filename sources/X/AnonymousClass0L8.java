package X;

import android.os.Build;

/* renamed from: X.0L8  reason: invalid class name */
public class AnonymousClass0L8 {
    public static boolean A00(int i2) {
        if (!(i2 == 15 || i2 == 255)) {
            if (i2 == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i2 != 32783) {
                return i2 == 33023 || i2 == 0;
            }
            int i3 = Build.VERSION.SDK_INT;
            return i3 < 28 || i3 > 29;
        }
    }
}
