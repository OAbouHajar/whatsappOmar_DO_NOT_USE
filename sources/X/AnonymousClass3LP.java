package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3LP  reason: invalid class name */
public class AnonymousClass3LP extends ConnectivityManager.NetworkCallback {
    public final C16260sj A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public volatile ConnectivityManager A02;
    public volatile Network A03;
    public volatile TelephonyManager A04;
    public final /* synthetic */ C18260wP A05;

    public AnonymousClass3LP(C18260wP r3, C16260sj r4) {
        this.A05 = r3;
        this.A00 = r4;
    }

    public int A00() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.A02;
        int i2 = 0;
        if (!(connectivityManager == null || this.A03 == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(this.A03)) == null)) {
            i2 = 1;
            if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(3)) {
                return networkCapabilities.hasCapability(18) ^ true ? 3 : 2;
            }
        }
        return i2;
    }

    public int A01() {
        TelephonyManager telephonyManager = this.A04;
        if (telephonyManager == null || this.A00.A03("android.permission.READ_PHONE_STATE") != 0) {
            return 0;
        }
        return telephonyManager.getDataNetworkType();
    }

    public void A02(ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        this.A02 = connectivityManager;
        this.A04 = telephonyManager;
    }

    public void A03(AnonymousClass1UW r3) {
        if (r3 != null) {
            this.A01.set(r3.A03);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = r3.getNetworkCapabilities(r4.A03);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r4 = this;
            android.net.ConnectivityManager r3 = r4.A02
            r2 = 0
            if (r3 == 0) goto L_0x0021
            android.net.Network r0 = r4.A03
            if (r0 == 0) goto L_0x0021
            android.net.Network r0 = r4.A03
            android.net.NetworkCapabilities r1 = r3.getNetworkCapabilities(r0)
            if (r1 == 0) goto L_0x0021
            r0 = 11
            boolean r0 = r1.hasCapability(r0)
            if (r0 != 0) goto L_0x0021
            int r1 = r3.getRestrictBackgroundStatus()
            r0 = 3
            if (r1 != r0) goto L_0x0021
            r2 = 1
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LP.A04():boolean");
    }

    public boolean A05() {
        return this.A01.get();
    }

    public void onBlockedStatusChanged(Network network, boolean z2) {
        AtomicBoolean atomicBoolean;
        boolean z3;
        if (!z2) {
            this.A03 = network;
            atomicBoolean = this.A01;
            z3 = true;
        } else if (network.equals(this.A03)) {
            this.A03 = null;
            atomicBoolean = this.A01;
            z3 = false;
        } else {
            return;
        }
        atomicBoolean.set(z3);
        this.A05.A07();
    }

    public void onLost(Network network) {
        if (network.equals(this.A03)) {
            this.A03 = null;
            this.A01.set(false);
            this.A05.A07();
        }
    }

    public void onUnavailable() {
        this.A03 = null;
        this.A01.set(false);
        this.A05.A07();
    }
}
