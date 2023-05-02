package X;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: X.2SA  reason: invalid class name */
public abstract class AnonymousClass2SA {
    public WifiP2pManager.Channel A00;
    public WifiP2pManager A01;
    public final C16980tz A02;

    public AnonymousClass2SA(C16980tz r1) {
        this.A02 = r1;
    }

    public WifiP2pManager.ChannelListener A00() {
        return new C91934gj((AnonymousClass2S9) this);
    }

    public void A01() {
        AnonymousClass2S9 r2 = (AnonymousClass2S9) this;
        r2.A01 = null;
        r2.A02.A00.unregisterReceiver(r2.A04);
        Runnable runnable = r2.A02;
        if (runnable != null) {
            r2.A05.Ac3(runnable);
        }
    }

    public final void A02() {
        WifiP2pManager.Channel channel;
        WifiP2pManager wifiP2pManager = this.A01;
        if (wifiP2pManager != null && (channel = this.A00) != null) {
            A03(channel, wifiP2pManager);
            this.A01 = null;
            this.A00 = null;
            A01();
        }
    }

    public void A03(WifiP2pManager.Channel channel, WifiP2pManager wifiP2pManager) {
        wifiP2pManager.clearServiceRequests(channel, (WifiP2pManager.ActionListener) null);
        wifiP2pManager.stopPeerDiscovery(channel, (WifiP2pManager.ActionListener) null);
        wifiP2pManager.removeGroup(channel, (WifiP2pManager.ActionListener) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r5.A00 == null) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04() {
        /*
            r5 = this;
            android.net.wifi.p2p.WifiP2pManager r0 = r5.A01
            if (r0 == 0) goto L_0x0009
            android.net.wifi.p2p.WifiP2pManager$Channel r1 = r5.A00
            r0 = 1
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            r4 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "fpm/WifiDirectManager/Already initialized, do not need to initialize twice"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r4
        L_0x0013:
            X.0tz r0 = r5.A02
            android.content.Context r3 = r0.A00
            java.lang.Class<android.net.wifi.p2p.WifiP2pManager> r0 = android.net.wifi.p2p.WifiP2pManager.class
            java.lang.Object r2 = X.AnonymousClass00T.A07(r3, r0)
            android.net.wifi.p2p.WifiP2pManager r2 = (android.net.wifi.p2p.WifiP2pManager) r2
            r5.A01 = r2
            if (r2 != 0) goto L_0x002c
            java.lang.String r0 = "fpm/WifiDirectManager/Unable to get WifiP2pManager"
        L_0x0025:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A02()
            return r4
        L_0x002c:
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.net.wifi.p2p.WifiP2pManager$ChannelListener r0 = r5.A00()
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = r2.initialize(r3, r1, r0)
            r5.A00 = r0
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "fpm/WifiDirectManager/Unable to initialize channel"
            goto L_0x0025
        L_0x003f:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2SA.A04():boolean");
    }
}
