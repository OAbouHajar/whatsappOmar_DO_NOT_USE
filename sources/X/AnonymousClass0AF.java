package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.0AF  reason: invalid class name */
public abstract class AnonymousClass0AF extends BroadcastReceiver {
    public abstract void A00(Context context, String str);

    public abstract void A01(Context context, String str);

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            AnonymousClass0OJ r4 = AnonymousClass0OJ.A02;
            if (r4 == null) {
                r4 = new AnonymousClass0OJ(context);
                AnonymousClass0OJ.A02 = r4;
            }
            C10570hL r3 = new C10570hL(context, intent, this);
            PowerManager.WakeLock newWakeLock = r4.A00.newWakeLock(1, "FBNSPreloadWakefulExecutor");
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            try {
                r4.A01.execute(new C10370h1(newWakeLock, r4, r3));
            } catch (RejectedExecutionException e2) {
                Log.e("FBNSPreloadWakefulExecutor/Notification skipped", e2);
                newWakeLock.release();
            }
        }
    }
}
