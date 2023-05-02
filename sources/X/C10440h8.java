package X;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.0h8  reason: invalid class name and case insensitive filesystem */
public class C10440h8 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Notification A02;
    public final /* synthetic */ SystemForegroundService A03;

    public C10440h8(Notification notification, SystemForegroundService systemForegroundService, int i2, int i3) {
        this.A03 = systemForegroundService;
        this.A00 = i2;
        this.A02 = notification;
        this.A01 = i3;
    }

    public void run() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            AnonymousClass0MN.A00(this.A02, this.A03, this.A00, this.A01);
            return;
        }
        SystemForegroundService systemForegroundService = this.A03;
        int i3 = this.A00;
        Notification notification = this.A02;
        if (i2 >= 29) {
            AnonymousClass0MM.A00(notification, systemForegroundService, i3, this.A01);
        } else {
            systemForegroundService.startForeground(i3, notification);
        }
    }
}
