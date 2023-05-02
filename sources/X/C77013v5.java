package X;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: X.3v5  reason: invalid class name and case insensitive filesystem */
public class C77013v5 extends AnonymousClass2SA {
    public C82804Ef A00;

    public C77013v5(C16980tz r1) {
        super(r1);
    }

    public WifiP2pManager.ChannelListener A00() {
        return new C91944gk(this);
    }

    public void A01() {
        this.A00 = null;
    }

    public void A03(WifiP2pManager.Channel channel, WifiP2pManager wifiP2pManager) {
        WifiP2pManager wifiP2pManager2 = this.A01;
        if (wifiP2pManager2 != null) {
            wifiP2pManager2.clearLocalServices(this.A00, (WifiP2pManager.ActionListener) null);
        }
        wifiP2pManager.removeGroup(channel, (WifiP2pManager.ActionListener) null);
    }
}
