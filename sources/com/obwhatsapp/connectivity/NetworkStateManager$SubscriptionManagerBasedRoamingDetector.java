package com.obwhatsapp.connectivity;

import X.AnonymousClass01V;
import android.telephony.SubscriptionManager;
import android.util.Pair;

public class NetworkStateManager$SubscriptionManagerBasedRoamingDetector {
    public static Pair determineNetworkStateUsingSubscriptionManager(AnonymousClass01V r1, boolean z2) {
        Boolean bool;
        int i2;
        int defaultDataSubscriptionId;
        SubscriptionManager A0M = r1.A0M();
        if (A0M == null || (defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId()) == -1) {
            bool = Boolean.FALSE;
            i2 = 0;
        } else {
            boolean isNetworkRoaming = A0M.isNetworkRoaming(defaultDataSubscriptionId);
            bool = Boolean.TRUE;
            i2 = 2;
            if (isNetworkRoaming) {
                i2 = 3;
            }
        }
        return new Pair(bool, Integer.valueOf(i2));
    }
}
