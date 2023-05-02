package X;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: X.00e  reason: invalid class name and case insensitive filesystem */
public class C000300e {
    public static void A00(Activity activity, String[] strArr, int i2) {
        activity.requestPermissions(strArr, i2);
    }

    public static void A01(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static boolean A02(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
