package X;

import android.net.wifi.p2p.WifiP2pManager;
import com.whatsapp.util.Log;

/* renamed from: X.4gj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91934gj implements WifiP2pManager.ChannelListener {
    public final /* synthetic */ AnonymousClass2S9 A00;

    public /* synthetic */ C91934gj(AnonymousClass2S9 r1) {
        this.A00 = r1;
    }

    public final void onChannelDisconnected() {
        if (this.A00.A01 != null) {
            Log.i("fpm/DonorDeviceTransferService/onNetworkFailure");
        }
    }
}
