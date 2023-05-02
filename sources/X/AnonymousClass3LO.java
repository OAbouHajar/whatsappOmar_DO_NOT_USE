package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;

/* renamed from: X.3LO  reason: invalid class name */
public class AnonymousClass3LO extends ConnectivityManager.NetworkCallback {
    public volatile Network A00;
    public final /* synthetic */ C28321Vn A01;

    public AnonymousClass3LO(C28321Vn r1) {
        this.A01 = r1;
    }

    public final void A00(Network network) {
        if (this.A00 == null) {
            return;
        }
        if (network == null || network.equals(this.A00)) {
            this.A00 = null;
            C28321Vn r4 = this.A01;
            r4.A03.A00();
            C19090xk r0 = r4.A04;
            r0.A09(-1, false);
            r0.A0F(false, false);
        }
    }

    public void onAvailable(Network network) {
        StringBuilder A0r = AnonymousClass000.A0r("xmpp/handler/network/network-callback onAvailable:");
        A0r.append(network);
        A0r.append(" handle:");
        A0r.append(network.getNetworkHandle());
        C13680ns.A1V(A0r);
    }

    public void onBlockedStatusChanged(Network network, boolean z2) {
        StringBuilder A0r = AnonymousClass000.A0r("xmpp/handler/network/network-callback onBlockedStatusChanged network:");
        A0r.append(network);
        A0r.append(" blocked:");
        A0r.append(z2);
        A0r.append(" handle:");
        A0r.append(network.getNetworkHandle());
        C13680ns.A1V(A0r);
        if (z2) {
            A00(network);
            return;
        }
        this.A00 = network;
        C28321Vn r1 = this.A01;
        boolean A012 = C28321Vn.A01(network, r1);
        long networkHandle = network.getNetworkHandle();
        r1.A03.A00();
        C19090xk r12 = r1.A04;
        r12.A09(networkHandle, AnonymousClass000.A1P(A012 ? 1 : 0));
        r12.A0F(A012, false);
    }

    public void onLost(Network network) {
        Log.i(AnonymousClass000.A0g("xmpp/handler/network/network-callback onLost:", network));
        A00(network);
    }

    public void onUnavailable() {
        Log.i("xmpp/handler/network/network-callback onUnavailable");
        A00((Network) null);
    }
}
