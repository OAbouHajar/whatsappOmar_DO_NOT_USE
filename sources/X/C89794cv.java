package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.4cv  reason: invalid class name and case insensitive filesystem */
public final class C89794cv {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static Boolean A03;

    public static boolean A00(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = A00;
        if (bool == null) {
            boolean z2 = false;
            if (C14320oy.A01() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
            A00 = bool;
        }
        return bool.booleanValue();
    }

    public static boolean A01(Context context) {
        if (A00(context)) {
            if (Build.VERSION.SDK_INT < 24) {
                return true;
            }
            Boolean bool = A01;
            if (bool == null) {
                boolean z2 = false;
                if (C14320oy.A02() && context.getPackageManager().hasSystemFeature("cn.google")) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
                A01 = bool;
            }
            return bool.booleanValue() && !C14320oy.A03();
        }
    }
}
