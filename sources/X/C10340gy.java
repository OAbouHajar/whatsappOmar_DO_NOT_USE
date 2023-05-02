package X;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.0gy  reason: invalid class name and case insensitive filesystem */
public class C10340gy implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Notification A01;
    public final /* synthetic */ SystemForegroundService A02;

    public C10340gy(Notification notification, SystemForegroundService systemForegroundService, int i2) {
        this.A02 = systemForegroundService;
        this.A00 = i2;
        this.A01 = notification;
    }

    public void run() {
        this.A02.A00.notify(this.A00, this.A01);
    }
}
