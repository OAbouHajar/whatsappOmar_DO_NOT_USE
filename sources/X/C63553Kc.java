package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import com.whatsapp.util.Log;

/* renamed from: X.3Kc  reason: invalid class name and case insensitive filesystem */
public class C63553Kc extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass2S9 A00;

    public C63553Kc(AnonymousClass2S9 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (!"android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (intent.getParcelableExtra("networkInfo") == null) {
            Log.w("fpm/DonorWifiDirectManager/WiFi P2P broadcast connection changed action with null network info.");
            return;
        }
        AnonymousClass2S9 r3 = this.A00;
        WifiP2pManager wifiP2pManager = r3.A01;
        if (wifiP2pManager != null) {
            wifiP2pManager.requestConnectionInfo(r3.A00, new AnonymousClass3CI(r3));
        }
    }
}
