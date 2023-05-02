package X;

import android.app.Service;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3KT  reason: invalid class name */
public abstract class AnonymousClass3KT extends Service {
    public PowerManager.WakeLock A00;

    public void A00() {
        PowerManager powerManager;
        if (this.A00 == null && (powerManager = (PowerManager) AnonymousClass00T.A07(this, PowerManager.class)) != null) {
            this.A00 = powerManager.newWakeLock(1, "signal:d2dpartial");
        }
        if (!this.A00.isHeld()) {
            this.A00.acquire(TimeUnit.HOURS.toMillis(2));
        }
    }

    public void onDestroy() {
        Log.i("fpm/KeepScreenAwakeService/onDestroy");
        PowerManager.WakeLock wakeLock = this.A00;
        if (wakeLock != null) {
            wakeLock.release();
        }
        super.onDestroy();
    }
}
