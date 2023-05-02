package X;

import android.os.Build;

/* renamed from: X.1v0  reason: invalid class name and case insensitive filesystem */
public class C40981v0 {
    public static final boolean A00;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            z2 = true;
        }
        A00 = z2;
    }
}
