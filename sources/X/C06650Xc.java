package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.0Xc  reason: invalid class name and case insensitive filesystem */
public class C06650Xc implements Application.ActivityLifecycleCallbacks {
    public static void registerIn(Activity activity) {
        activity.registerActivityLifecycleCallbacks(new C06650Xc());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        C010905e.A01(activity, C011405n.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        C010905e.A01(activity, C011405n.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        C010905e.A01(activity, C011405n.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        C010905e.A01(activity, C011405n.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        C010905e.A01(activity, C011405n.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        C010905e.A01(activity, C011405n.ON_STOP);
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
