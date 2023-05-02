package X;

import android.net.ConnectivityManager;

/* renamed from: X.0MS  reason: invalid class name */
public final class AnonymousClass0MS {
    public static final void A00(ConnectivityManager.NetworkCallback networkCallback, ConnectivityManager connectivityManager) {
        C18450wi.A0H(connectivityManager, 0);
        C18450wi.A0H(networkCallback, 1);
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
