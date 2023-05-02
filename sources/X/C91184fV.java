package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.4fV  reason: invalid class name and case insensitive filesystem */
public class C91184fV implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ AnonymousClass4RS A00;

    public C91184fV(AnonymousClass4RS r1) {
        this.A00 = r1;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass4RS r1 = this.A00;
        if (activity == r1.A01.get()) {
            r1.A00();
        }
    }

    public void onActivityPaused(Activity activity) {
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
