package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.0Xb  reason: invalid class name and case insensitive filesystem */
public final class C06640Xb implements Application.ActivityLifecycleCallbacks {
    public Activity A00;
    public Object A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public final int A05;

    public C06640Xb(Activity activity) {
        this.A00 = activity;
        this.A05 = activity.hashCode();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.A00 == activity) {
            this.A00 = null;
            this.A02 = true;
        }
    }

    public void onActivityPaused(Activity activity) {
        if (this.A02 && !this.A04 && !this.A03) {
            Object obj = this.A01;
            int i2 = this.A05;
            try {
                Object obj2 = C05890Tk.A02.get(activity);
                if (obj2 == obj && activity.hashCode() == i2) {
                    C05890Tk.A00.postAtFrontOfQueue(new C09770g3(C05890Tk.A01.get(activity), obj2));
                    this.A04 = true;
                    this.A01 = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.A00 == activity) {
            this.A03 = true;
        }
    }

    public void onActivityStopped(Activity activity) {
    }
}
