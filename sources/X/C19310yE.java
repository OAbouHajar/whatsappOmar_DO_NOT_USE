package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.obwhatsapp.connectivity.NetworkStateManager$SubscriptionManagerBasedRoamingDetector;
import com.whatsapp.util.Log;

/* renamed from: X.0yE  reason: invalid class name and case insensitive filesystem */
public class C19310yE {
    public final C16300so A00;
    public final AnonymousClass01V A01;

    public C19310yE(C16300so r1, AnonymousClass01V r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public int A00(boolean z2) {
        AnonymousClass01V r1 = this.A01;
        TelephonyManager A0N = r1.A0N();
        ConnectivityManager A0H = r1.A0H();
        int i2 = 0;
        if (!(A0H == null || A0N == null)) {
            try {
                NetworkInfo activeNetworkInfo = A0H.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    i2 = 1;
                    if (activeNetworkInfo.getType() != 1) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Pair determineNetworkStateUsingSubscriptionManager = NetworkStateManager$SubscriptionManagerBasedRoamingDetector.determineNetworkStateUsingSubscriptionManager(r1, z2);
                            if (((Boolean) determineNetworkStateUsingSubscriptionManager.first).booleanValue()) {
                                return ((Number) determineNetworkStateUsingSubscriptionManager.second).intValue();
                            }
                        }
                        i2 = 3;
                        if (!activeNetworkInfo.isRoaming() && !A0N.isNetworkRoaming()) {
                            String simCountryIso = A0N.getSimCountryIso();
                            if (!TextUtils.isEmpty(simCountryIso)) {
                                String simOperator = A0N.getSimOperator();
                                if (!TextUtils.isEmpty(simOperator)) {
                                    if (A0N.getPhoneType() != 2) {
                                        String networkCountryIso = A0N.getNetworkCountryIso();
                                        if (!TextUtils.isEmpty(networkCountryIso) && simCountryIso.equals(networkCountryIso)) {
                                            String networkOperator = A0N.getNetworkOperator();
                                            if (!TextUtils.isEmpty(networkOperator)) {
                                                return (networkOperator.equals(simOperator) || AnonymousClass2CJ.A00.contains(new AnonymousClass01Q(networkOperator, simOperator))) ? 2 : 3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (RuntimeException e2) {
                if (!(e2.getCause() instanceof DeadObjectException)) {
                    if (Build.VERSION.SDK_INT >= 24 && (e2.getCause() instanceof DeadSystemException)) {
                        return 0;
                    }
                    throw e2;
                }
            }
        }
        return i2;
    }

    public NetworkInfo A01() {
        AnonymousClass01V r1 = this.A01;
        AnonymousClass01V.A0P = true;
        ConnectivityManager A0H = r1.A0H();
        AnonymousClass01V.A0P = false;
        if (A0H != null) {
            return A0H.getActiveNetworkInfo();
        }
        Log.w("NetworkStateManager/getActiveNetworkInfo cm=null");
        return null;
    }

    public boolean A02() {
        ConnectivityManager A0H = this.A01.A0H();
        if (A0H != null) {
            try {
                NetworkInfo activeNetworkInfo = A0H.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    this.A00.AcB("networkstatemanager/deadOS", (String) null, false);
                    return false;
                }
                throw e2;
            }
        }
    }

    public boolean A03() {
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager A0H = this.A01.A0H();
            if (A0H == null) {
                Log.w("NetworkStateManager/isDataSaverOn cm=null");
            } else if (A0H.isActiveNetworkMetered()) {
                A0H.getRestrictBackgroundStatus();
                if (A0H.getRestrictBackgroundStatus() == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
