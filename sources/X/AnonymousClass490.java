package X;

import android.os.Build;

/* renamed from: X.490  reason: invalid class name */
public final class AnonymousClass490 {
    public static final int A00;

    static {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.VERSION.CODENAME;
            if (str.length() == 1 && str.charAt(0) >= 'S' && str.charAt(0) <= 'Z') {
                i2 = 33554432;
            }
        }
        A00 = i2;
    }
}
