package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.0Va  reason: invalid class name and case insensitive filesystem */
public final class C06260Va {
    public static final NetworkCapabilities A00(ConnectivityManager connectivityManager, Network network) {
        C18450wi.A0H(connectivityManager, 0);
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final void A01(ConnectivityManager.NetworkCallback networkCallback, ConnectivityManager connectivityManager) {
        C18450wi.A0H(connectivityManager, 0);
        C18450wi.A0H(networkCallback, 1);
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    public static final boolean A02(NetworkCapabilities networkCapabilities, int i2) {
        C18450wi.A0H(networkCapabilities, 0);
        return networkCapabilities.hasCapability(i2);
    }
}
