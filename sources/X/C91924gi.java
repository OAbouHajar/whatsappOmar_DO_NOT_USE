package X;

import android.net.wifi.p2p.WifiP2pManager;
import com.whatsapp.util.Log;

/* renamed from: X.4gi  reason: invalid class name and case insensitive filesystem */
public class C91924gi implements WifiP2pManager.ActionListener {
    public final /* synthetic */ AnonymousClass2S9 A00;

    public C91924gi(AnonymousClass2S9 r1) {
        this.A00 = r1;
    }

    public void onFailure(int i2) {
        Log.i("fpm/DonorWifiDirectManager/Failed to connect to service");
        this.A00.A03 = false;
    }

    public void onSuccess() {
        Log.i("fpm/DonorWifiDirectManager/Successfully connected to service");
    }
}
