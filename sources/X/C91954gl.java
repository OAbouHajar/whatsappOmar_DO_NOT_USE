package X;

import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: X.4gl  reason: invalid class name and case insensitive filesystem */
public class C91954gl implements WifiP2pManager.DnsSdServiceResponseListener {
    public final /* synthetic */ AnonymousClass2S9 A00;

    public C91954gl(AnonymousClass2S9 r1) {
        this.A00 = r1;
    }

    public void onDnsSdServiceAvailable(String str, String str2, WifiP2pDevice wifiP2pDevice) {
        if (str.equals("_devicetransfer._whatsapp.com")) {
            AnonymousClass2S9 r4 = this.A00;
            r4.A03 = true;
            String str3 = wifiP2pDevice.deviceAddress;
            WifiP2pConfig wifiP2pConfig = new WifiP2pConfig();
            wifiP2pConfig.deviceAddress = str3;
            wifiP2pConfig.wps.setup = 0;
            r4.A06();
            WifiP2pManager wifiP2pManager = r4.A01;
            if (wifiP2pManager != null) {
                wifiP2pManager.connect(r4.A00, wifiP2pConfig, new C91924gi(r4));
            }
        }
    }
}
