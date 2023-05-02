package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.WeakHashMap;

/* renamed from: X.4fU  reason: invalid class name and case insensitive filesystem */
public class C91174fU implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (C89814cy.A01) {
            if (C89814cy.A03.containsKey(activity)) {
                throw AnonymousClass000.A0V("The MountContentPools has a reference to an activity that has just been created");
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        synchronized (C89814cy.A01) {
            C89814cy.A01(activity, C89814cy.A03);
            C89814cy.A01(activity, C89814cy.A02);
            WeakHashMap weakHashMap = C89814cy.A04;
            Context context = activity;
            while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            weakHashMap.put(context, Boolean.TRUE);
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
