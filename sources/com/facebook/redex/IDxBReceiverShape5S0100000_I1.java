package com.facebook.redex;

import X.AnonymousClass0H2;
import X.C03470Iq;
import X.C05510Rv;
import X.C18450wi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

public class IDxBReceiverShape5S0100000_I1 extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public IDxBReceiverShape5S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static void A00(Intent intent, IDxBReceiverShape5S0100000_I1 iDxBReceiverShape5S0100000_I1) {
        C18450wi.A0H(intent, 1);
        ((AnonymousClass0H2) iDxBReceiverShape5S0100000_I1.A00).A08(intent);
    }

    public void onReceive(Context context, Intent intent) {
        int type;
        switch (this.A01) {
            case 0:
                ((C05510Rv) this.A00).A04();
                return;
            case 1:
                A00(intent, this);
                return;
            default:
                C03470Iq r2 = (C03470Iq) this.A00;
                NetworkInfo activeNetworkInfo = r2.A03.getActiveNetworkInfo();
                if (activeNetworkInfo != null && (type = activeNetworkInfo.getType()) != r2.A00) {
                    r2.A03();
                    r2.A00 = type;
                    return;
                }
                return;
        }
    }
}
