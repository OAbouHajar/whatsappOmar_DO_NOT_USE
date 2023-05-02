package X;

import android.net.ConnectivityManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.55T  reason: invalid class name */
public class AnonymousClass55T implements Runnable {
    public final /* synthetic */ C55282jD A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass55T(C55282jD r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public void run() {
        C55282jD r2 = this.A00;
        ConnectivityManager.NetworkCallback A002 = r2.A00;
        if (A002 == null) {
            Log.i("voip/weak-wifi/onUnavailable: network callback is already unregistered");
            return;
        }
        r2.A04.unregisterNetworkCallback(A002);
        r2.A00 = null;
        r2.A01 = null;
        Voip.notifyFailureToCreateAlternativeSocket(this.A01);
    }
}
