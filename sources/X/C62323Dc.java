package X;

import com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity;

/* renamed from: X.3Dc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62323Dc implements AnonymousClass023 {
    public final /* synthetic */ DeviceTransferActivity A00;

    public /* synthetic */ C62323Dc(DeviceTransferActivity deviceTransferActivity) {
        this.A00 = deviceTransferActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        X.C13680ns.A1O(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        r5 = new com.facebook.redex.IDxActionShape258S0100000_2_I1(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0118, code lost:
        r3.A39(new X.C85224Np(r5, (X.C108915Pz) null, r7, r8, r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0121, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AOH(java.lang.Object r12) {
        /*
            r11 = this;
            com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity r3 = r11.A00
            int r0 = X.AnonymousClass000.A0D(r12)
            switch(r0) {
                case 1: goto L_0x005c;
                case 2: goto L_0x0104;
                case 3: goto L_0x0100;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00e9;
                case 6: goto L_0x00db;
                case 7: goto L_0x002d;
                case 8: goto L_0x0011;
                case 9: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r1 = r3.A0B
            r0 = 1
            r1.A08(r0)
            return
        L_0x0011:
            X.1fu r2 = X.C32241fu.A00(r3)
            r0 = 2131893341(0x7f121c5d, float:1.9421456E38)
            r2.A02(r0)
            r0 = 2131893340(0x7f121c5c, float:1.9421454E38)
            r2.A01(r0)
            r1 = 2131889799(0x7f120e87, float:1.9414272E38)
            r0 = 72
            X.C13680ns.A1H(r2, r3, r0, r1)
            X.C13690nt.A1G(r2)
            return
        L_0x002d:
            android.content.Context r1 = r3.getApplicationContext()
            java.lang.Class<android.net.wifi.WifiManager> r0 = android.net.wifi.WifiManager.class
            java.lang.Object r2 = X.AnonymousClass00T.A07(r1, r0)
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            r1 = 0
            if (r2 != 0) goto L_0x004b
            java.lang.String r0 = "fpm/WifiDirectUtils/WifiManager not available"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0041:
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r0 = r3.A0B
            X.027 r2 = r0.A05
            if (r1 == 0) goto L_0x0059
            r0 = 9
            goto L_0x00d7
        L_0x004b:
            boolean r0 = X.C15450qv.A03()
            if (r0 == 0) goto L_0x0057
            boolean r0 = r2.isP2pSupported()
            if (r0 == 0) goto L_0x0041
        L_0x0057:
            r1 = 1
            goto L_0x0041
        L_0x0059:
            r0 = 8
            goto L_0x00d7
        L_0x005c:
            boolean r0 = X.C15450qv.A0B()
            if (r0 == 0) goto L_0x0073
            X.0sj r0 = r3.A0A
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x00d2
            android.content.Intent r1 = r3.A36()
        L_0x006e:
            r0 = 1
            r3.startActivityForResult(r1, r0)
            return
        L_0x0073:
            X.0sc r0 = r3.A04
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x00c3
            X.0sj r0 = r3.A0A
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x00c3
            X.2iV r5 = new X.2iV
            r5.<init>(r3)
            r6 = 2
            int[] r2 = new int[r6]
            r0 = 2131232302(0x7f08062e, float:1.808071E38)
            r4 = 0
            r2[r4] = r0
            r0 = 2131232309(0x7f080635, float:1.8080724E38)
            r1 = 1
            r2[r1] = r0
            r5.A0H = r2
            r0 = 4
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            r2[r4] = r0
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            r2[r1] = r0
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r2[r6] = r0
            r1 = 3
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            r2[r1] = r0
            r5.A0K = r2
            r0 = 2131888633(0x7f1209f9, float:1.9411907E38)
            r5.A0A = r0
            r0 = 2131893344(0x7f121c60, float:1.9421462E38)
            r5.A06 = r0
            r0 = 2131893343(0x7f121c5f, float:1.942146E38)
            r5.A09 = r0
            android.content.Intent r1 = r5.A00()
            goto L_0x006e
        L_0x00c3:
            X.0sj r1 = r3.A0A
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x00d2
            android.content.Intent r1 = r3.A35()
            goto L_0x006e
        L_0x00d2:
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r0 = r3.A0B
            X.027 r2 = r0.A05
            r0 = 3
        L_0x00d7:
            X.C13680ns.A1O(r2, r0)
            return
        L_0x00db:
            r7 = 2131893356(0x7f121c6c, float:1.9421486E38)
            r8 = 2131893355(0x7f121c6b, float:1.9421484E38)
            r9 = 2131886764(0x7f1202ac, float:1.9408116E38)
            r10 = 2131889695(0x7f120e1f, float:1.941406E38)
            r0 = 2
            goto L_0x00fa
        L_0x00e9:
            r3.A38()
            return
        L_0x00ed:
            r7 = 2131893354(0x7f121c6a, float:1.9421482E38)
            r8 = 2131893353(0x7f121c69, float:1.942148E38)
            r9 = 2131886764(0x7f1202ac, float:1.9408116E38)
            r10 = 2131889695(0x7f120e1f, float:1.941406E38)
            r0 = 1
        L_0x00fa:
            com.facebook.redex.IDxActionShape258S0100000_2_I1 r5 = new com.facebook.redex.IDxActionShape258S0100000_2_I1
            r5.<init>(r3, r0)
            goto L_0x0118
        L_0x0100:
            r3.A37()
            return
        L_0x0104:
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r1 = r3.A0B
            r8 = 2131893345(0x7f121c61, float:1.9421464E38)
            r7 = 2131893335(0x7f121c57, float:1.9421444E38)
            r9 = 2131893334(0x7f121c56, float:1.9421442E38)
            r10 = 2131886996(0x7f120394, float:1.9408587E38)
            r0 = 5
            com.facebook.redex.IDxActionShape258S0100000_2_I1 r5 = new com.facebook.redex.IDxActionShape258S0100000_2_I1
            r5.<init>(r1, r0)
        L_0x0118:
            r6 = 0
            X.4Np r4 = new X.4Np
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.A39(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62323Dc.AOH(java.lang.Object):void");
    }
}
