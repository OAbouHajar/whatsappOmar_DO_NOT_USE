package androidx.work.impl.foreground;

import X.AnonymousClass000;
import X.AnonymousClass0A5;
import X.C06530Wm;
import X.C08070cz;
import X.C12590ke;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.util.Log;

public class SystemForegroundService extends AnonymousClass0A5 implements C12590ke {
    public static SystemForegroundService A04;
    public static final String A05 = C06530Wm.A01("SystemFgService");
    public NotificationManager A00;
    public Handler A01;
    public C08070cz A02;
    public boolean A03;

    public final void A00() {
        this.A01 = AnonymousClass000.A0L();
        this.A00 = (NotificationManager) getApplicationContext().getSystemService("notification");
        C08070cz r1 = new C08070cz(getApplicationContext());
        this.A02 = r1;
        if (r1.A02 != null) {
            C06530Wm.A00();
            Log.e(C08070cz.A0A, "A callback already exists.");
            return;
        }
        r1.A02 = this;
    }

    public void onCreate() {
        super.onCreate();
        A04 = this;
        A00();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A02.A00();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.A03) {
            C06530Wm.A00();
            Log.i(A05, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.A02.A00();
            A00();
            this.A03 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.A02.A01(intent);
        return 3;
    }

    public void stop() {
        this.A03 = true;
        C06530Wm.A00().A02(A05, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        A04 = null;
        stopSelf();
    }
}
