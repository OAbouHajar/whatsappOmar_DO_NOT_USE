package X;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.0MN  reason: invalid class name */
public class AnonymousClass0MN {
    public static void A00(Notification notification, Service service, int i2, int i3) {
        try {
            service.startForeground(i2, notification, i3);
        } catch (ForegroundServiceStartNotAllowedException e2) {
            C06530Wm.A00();
            Log.w(SystemForegroundService.A05, "Unable to start foreground service", e2);
        }
    }
}
