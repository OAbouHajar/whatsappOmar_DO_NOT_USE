package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.29T  reason: invalid class name */
public class AnonymousClass29T {
    public static void A00(Activity activity, int i2) {
        if (!A03(activity)) {
            activity.removeDialog(i2);
        }
    }

    public static void A01(Activity activity, int i2) {
        if (!A03(activity)) {
            activity.showDialog(i2);
        }
    }

    public static void A02(Activity activity, Bundle bundle, int i2) {
        if (!A03(activity)) {
            activity.showDialog(i2, bundle);
        }
    }

    public static boolean A03(Activity activity) {
        if (activity.isFinishing() || activity.isChangingConfigurations()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && activity.isDestroyed();
    }
}
