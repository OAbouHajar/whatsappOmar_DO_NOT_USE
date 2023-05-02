package X;

import android.net.wifi.p2p.WifiP2pManager;
import com.whatsapp.util.Log;

/* renamed from: X.4gk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91944gk implements WifiP2pManager.ChannelListener {
    public final /* synthetic */ C77013v5 A00;

    public /* synthetic */ C91944gk(C77013v5 r1) {
        this.A00 = r1;
    }

    public final void onChannelDisconnected() {
        if (this.A00.A00 != null) {
            Log.i("fpm/ReceiverTransferDonorService/onNetworkFailure");
        }
    }
}
