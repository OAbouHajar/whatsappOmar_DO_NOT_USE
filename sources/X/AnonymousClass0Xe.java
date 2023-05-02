package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: X.0Xe  reason: invalid class name */
public final class AnonymousClass0Xe implements ComponentCallbacks {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C07940ck A01;

    public AnonymousClass0Xe(Activity activity, C07940ck r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C07940ck r0 = this.A01;
        C12560kb r2 = r0.A00;
        if (r2 != null) {
            Activity activity = this.A00;
            r2.AZo(activity, r0.A00(activity));
        }
    }

    public void onLowMemory() {
    }
}
