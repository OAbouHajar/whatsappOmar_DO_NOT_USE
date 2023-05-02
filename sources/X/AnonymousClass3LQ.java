package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.3LQ  reason: invalid class name */
public class AnonymousClass3LQ extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C55282jD A00;
    public final /* synthetic */ ScheduledFuture A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass3LQ(C55282jD r1, ScheduledFuture scheduledFuture, boolean z2) {
        this.A00 = r1;
        this.A01 = scheduledFuture;
        this.A02 = z2;
    }

    public static /* synthetic */ void A00(Network network, AnonymousClass3LQ r3, ScheduledFuture scheduledFuture, boolean z2) {
        scheduledFuture.cancel(false);
        C55282jD r1 = r3.A00;
        if (r1.A00 == null) {
            Log.i("voip/weak-wifi/onAvailable: network callback is already unregistered");
        } else if (r1.A02 != null) {
            Log.i("voip/weak-wifi/onAvailable: onAvailable() is called multiple times");
            Voip.notifyLostOfAlternativeNetwork();
        } else {
            r1.A09(network, z2);
        }
    }

    public static /* synthetic */ void A01(AnonymousClass3LQ r1, ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
        if (r1.A00.A00 == null) {
            Log.i("voip/weak-wifi/onLost: network callback is already unregistered");
        } else {
            Voip.notifyLostOfAlternativeNetwork();
        }
    }

    public static /* synthetic */ void A02(AnonymousClass3LQ r1, ScheduledFuture scheduledFuture, boolean z2) {
        scheduledFuture.cancel(false);
        C55282jD r12 = r1.A00;
        if (r12.A00 == null) {
            Log.i("voip/weak-wifi/onUnavailable: network callback is already unregistered");
            return;
        }
        r12.A00 = null;
        r12.A01 = null;
        Voip.notifyFailureToCreateAlternativeSocket(z2);
    }

    public void onAvailable(Network network) {
        Log.i("voip/weak-wifi/onAvailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new C1044555l(network, this, this.A01, this.A02));
        }
    }

    public void onLost(Network network) {
        Log.i("voip/weak-wifi/onLost");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new AnonymousClass55U(this, this.A01));
        }
    }

    public void onUnavailable() {
        Log.i("voip/weak-wifi/onUnavailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new C1043755c(this, this.A01, this.A02));
        }
    }
}
