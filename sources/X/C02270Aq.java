package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.0Aq  reason: invalid class name and case insensitive filesystem */
public final class C02270Aq extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ AnonymousClass0H3 A00;

    public C02270Aq(AnonymousClass0H3 r1) {
        this.A00 = r1;
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C18450wi.A0H(networkCapabilities, 1);
        C06530Wm.A00().A02(C06320Vg.A00, AnonymousClass000.A0g("Network capabilities changed: ", networkCapabilities));
        AnonymousClass0H3 r1 = this.A00;
        r1.A06(C06320Vg.A00(r1.A00));
    }

    public void onLost(Network network) {
        C06530Wm.A00().A02(C06320Vg.A00, "Network connection lost");
        AnonymousClass0H3 r1 = this.A00;
        r1.A06(C06320Vg.A00(r1.A00));
    }
}
