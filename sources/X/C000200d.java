package X;

import android.app.Activity;

/* renamed from: X.00d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C000200d implements Runnable {
    public final /* synthetic */ Activity A00;

    public /* synthetic */ C000200d(Activity activity) {
        this.A00 = activity;
    }

    public final void run() {
        Activity activity = this.A00;
        if (!activity.isFinishing() && !C05890Tk.A00(activity)) {
            activity.recreate();
        }
    }
}
