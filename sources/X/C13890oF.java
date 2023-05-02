package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0oF  reason: invalid class name and case insensitive filesystem */
public final class C13890oF implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final C13890oF A04 = new C13890oF();
    public boolean A00 = false;
    public final ArrayList A01 = new ArrayList();
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final AtomicBoolean A03 = new AtomicBoolean();

    public static void A00(Application application) {
        C13890oF r1 = A04;
        synchronized (r1) {
            if (!r1.A00) {
                application.registerActivityLifecycleCallbacks(r1);
                application.registerComponentCallbacks(r1);
                r1.A00 = true;
            }
        }
    }

    public final void A01(boolean z2) {
        synchronized (A04) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((C13880oE) it.next()).ANB(z2);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.A02.compareAndSet(true, false);
        this.A03.set(true);
        if (compareAndSet) {
            A01(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.A02.compareAndSet(true, false);
        this.A03.set(true);
        if (compareAndSet) {
            A01(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.A02.compareAndSet(false, true)) {
            this.A03.set(true);
            A01(true);
        }
    }
}
