package X;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: X.00V  reason: invalid class name */
public class AnonymousClass00V {
    public static void A00(Activity activity) {
        activity.finishAfterTransition();
    }

    public static void A01(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void A02(Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public static void A03(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    public static void A04(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }
}
