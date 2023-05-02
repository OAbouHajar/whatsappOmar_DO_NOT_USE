package X;

import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2S9  reason: invalid class name */
public class AnonymousClass2S9 extends AnonymousClass2SA {
    public static final long A07 = TimeUnit.SECONDS.toMillis(30);
    public static final IntentFilter A08 = new AnonymousClass3Ko();
    public WifiP2pDnsSdServiceRequest A00;
    public AnonymousClass4IJ A01;
    public Runnable A02;
    public boolean A03 = false;
    public final C63553Kc A04;
    public final C16320sq A05;
    public final Runnable A06 = new RunnableRunnableShape11S0100000_I0_10((Object) this, 38);

    public AnonymousClass2S9(C16980tz r3, C16320sq r4) {
        super(r3);
        this.A05 = r4;
        this.A04 = new C63553Kc(this);
    }

    public void A05() {
        if (this.A00 != null) {
            Log.w("fpm/DonorWifiDirectManager/Discover service already called and active.");
            return;
        }
        WifiP2pManager wifiP2pManager = this.A01;
        if (wifiP2pManager == null) {
            Log.i("fpm/DonorWifiDirectManager/Trying to start service without manager");
            return;
        }
        wifiP2pManager.setDnsSdResponseListeners(this.A00, new C91954gl(this), new C91964gm());
        WifiP2pDnsSdServiceRequest newInstance = WifiP2pDnsSdServiceRequest.newInstance();
        this.A00 = newInstance;
        this.A01.addServiceRequest(this.A00, newInstance, (WifiP2pManager.ActionListener) null);
        this.A01.discoverServices(this.A00, (WifiP2pManager.ActionListener) null);
        this.A02 = this.A05.Ad4(this.A06, "fpm/DonorWifiDirectManager/startServiceDiscovery", A07);
    }

    public final void A06() {
        WifiP2pDnsSdServiceRequest wifiP2pDnsSdServiceRequest = this.A00;
        if (wifiP2pDnsSdServiceRequest != null) {
            WifiP2pManager wifiP2pManager = this.A01;
            if (wifiP2pManager != null) {
                wifiP2pManager.removeServiceRequest(this.A00, wifiP2pDnsSdServiceRequest, (WifiP2pManager.ActionListener) null);
            }
            this.A00 = null;
            Runnable runnable = this.A02;
            if (runnable != null) {
                this.A05.Ac3(runnable);
            }
        }
    }
}
