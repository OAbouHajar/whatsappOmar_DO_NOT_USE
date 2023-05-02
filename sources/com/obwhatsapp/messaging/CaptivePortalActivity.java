package com.obwhatsapp.messaging;

import X.AnonymousClass01V;
import X.AnonymousClass2Rf;
import X.C13680ns;
import X.C14570pP;
import X.C16150sX;
import X.C19210xw;
import X.C49132Rg;

public class CaptivePortalActivity extends C14570pP {
    public AnonymousClass01V A00;
    public C19210xw A01;
    public boolean A02;

    public CaptivePortalActivity() {
        this(0);
    }

    public CaptivePortalActivity(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 87);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C16150sX r1 = ((C49132Rg) ((AnonymousClass2Rf) generatedComponent())).A1s;
            this.A05 = C16150sX.A1B(r1);
            this.A00 = C16150sX.A0T(r1);
            this.A01 = (C19210xw) r1.AG2.get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1
            r9.requestWindowFeature(r0)
            super.onCreate(r10)
            X.01V r2 = r9.A00
            android.net.wifi.WifiManager r6 = r2.A0E
            if (r6 != 0) goto L_0x00b8
            r1 = 0
            java.lang.String r0 = "wifi"
            java.lang.Object r6 = r2.A0S(r0, r1)
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6
            r2.A0E = r6
            if (r6 != 0) goto L_0x00b8
            java.lang.String r0 = "captiveportalactivity/create wm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r3 = 0
        L_0x0020:
            X.1fu r4 = X.C32241fu.A00(r9)
            r7 = 0
            r4.A07(r7)
            r0 = 2131889656(0x7f120df8, float:1.9413982E38)
            r4.A02(r0)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 67
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r0.<init>(r9, r1)
            r4.A0B(r0, r2)
            r2 = 2131887867(0x7f1206fb, float:1.9410353E38)
            r1 = 25
            com.facebook.redex.IDxCListenerShape29S0200000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape29S0200000_2_I1
            r0.<init>(r6, r1, r9)
            r4.setNegativeButton(r2, r0)
            if (r3 == 0) goto L_0x00b1
            int r5 = r3.getNetworkId()
            java.lang.String r3 = r3.getSSID()
            if (r3 == 0) goto L_0x007d
            int r8 = r3.length()
            r0 = 2
            if (r8 < r0) goto L_0x007d
            java.lang.String r2 = "\""
            boolean r0 = r3.startsWith(r2)
            java.lang.String r1 = "'"
            if (r0 != 0) goto L_0x006b
            boolean r0 = r3.startsWith(r1)
            if (r0 == 0) goto L_0x007d
        L_0x006b:
            boolean r0 = r3.endsWith(r2)
            if (r0 != 0) goto L_0x0077
            boolean r0 = r3.endsWith(r1)
            if (r0 == 0) goto L_0x007d
        L_0x0077:
            r0 = 1
            int r8 = r8 - r0
            java.lang.String r3 = r3.substring(r0, r8)
        L_0x007d:
            java.lang.String r0 = "wifi network name is "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 2131893148(0x7f121b9c, float:1.9421064E38)
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r0 = X.C13680ns.A0d(r9, r3, r0, r7, r1)
            r4.A06(r0)
            r1 = 2131888397(0x7f12090d, float:1.9411428E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = X.C13680ns.A0d(r9, r3, r0, r7, r1)
            X.4fm r0 = new X.4fm
            r0.<init>(r6, r9, r3, r5)
            r4.A09(r0, r1)
        L_0x00a8:
            java.lang.String r0 = "captive portal dialog created"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A00()
            return
        L_0x00b1:
            r0 = 2131893147(0x7f121b9b, float:1.9421062E38)
            r4.A01(r0)
            goto L_0x00a8
        L_0x00b8:
            android.net.wifi.WifiInfo r3 = r6.getConnectionInfo()
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.messaging.CaptivePortalActivity.onCreate(android.os.Bundle):void");
    }

    public void onPause() {
        super.onPause();
        this.A01.A00.removeMessages(1);
        this.A01.A00();
    }

    public void onResume() {
        super.onResume();
        this.A01.A00.sendEmptyMessageDelayed(1, 3000);
    }
}
