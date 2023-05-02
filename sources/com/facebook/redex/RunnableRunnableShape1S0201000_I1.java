package com.facebook.redex;

public class RunnableRunnableShape1S0201000_I1 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape1S0201000_I1(Object obj, int i2, Object obj2, int i3) {
        this.A03 = i3;
        this.A02 = obj;
        this.A00 = i2;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x00dd;
                case 1: goto L_0x022c;
                case 2: goto L_0x00b5;
                case 3: goto L_0x020a;
                case 4: goto L_0x020a;
                case 5: goto L_0x008f;
                case 6: goto L_0x01fb;
                case 7: goto L_0x01e9;
                case 8: goto L_0x0182;
                case 9: goto L_0x016c;
                case 10: goto L_0x0156;
                case 11: goto L_0x010f;
                case 12: goto L_0x0054;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0 r0 = (com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0) r0
            int r4 = r10.A00
            java.lang.Object r3 = r10.A02
            X.0tZ r3 = (X.C16740tZ) r3
            java.lang.Object r2 = r0.A00
            X.2B2 r2 = (X.AnonymousClass2B2) r2
            X.0tZ r1 = r2.A0B
            boolean r0 = r1 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0022
            X.0tY r1 = (X.C16730tY) r1
            boolean r0 = X.C38621r6.A0z(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0047
            if (r1 != 0) goto L_0x0047
            r2.A0P()
        L_0x002c:
            int r1 = r3.A0C
            r0 = 4
            int r0 = X.C42881yp.A00(r1, r0)
            if (r0 <= 0) goto L_0x0046
            X.2B5 r0 = r2.A00
            X.C13680ns.A1T(r0)
            X.2B5 r1 = new X.2B5
            r1.<init>(r2)
            r2.A00 = r1
            X.0sq r0 = r2.A0X
            X.C13680ns.A1U(r1, r0)
        L_0x0046:
            return
        L_0x0047:
            r2.A0H()
            r0 = 3
            if (r0 != r4) goto L_0x002c
            r2.A0F()
            r2.A0E()
            goto L_0x002c
        L_0x0054:
            java.lang.Object r4 = r10.A01
            X.31n r4 = (X.AnonymousClass31n) r4
            int r3 = r10.A00
            java.lang.Object r2 = r10.A02
            X.0tZ r2 = (X.C16740tZ) r2
            X.2kF r1 = r4.A01
            r1.A0H()
            r0 = 3
            if (r0 != r3) goto L_0x0071
            r1.A0F()
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0046
            r1.A0E()
            return
        L_0x0071:
            r0 = 12
            if (r3 != r0) goto L_0x0046
            r1.A0F()
            boolean r0 = r2 instanceof X.C38681rF
            if (r0 == 0) goto L_0x0046
            X.0tY r2 = (X.C16730tY) r2
            boolean r0 = X.C38621r6.A0x(r2)
            if (r0 == 0) goto L_0x0046
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x008b
            r1.A0E()
        L_0x008b:
            r0 = 1
            r4.A00 = r0
            return
        L_0x008f:
            java.lang.Object r3 = r10.A01
            X.3FR r3 = (X.AnonymousClass3FR) r3
            int r2 = r10.A00
            java.lang.Object r1 = r10.A02
            X.0rv r1 = (X.C15830rv) r1
            r0 = 3
            if (r2 != r0) goto L_0x00ab
            X.0uk r2 = r3.A02
            X.0sL r1 = (X.C16050sL) r1
            X.0sL r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x0046
            r0 = 1
            r2.A05(r1, r0)
            return
        L_0x00ab:
            r0 = 4
            if (r2 != r0) goto L_0x0046
            X.0uk r1 = r3.A02
            r0 = 2
            r1.A04(r0)
            return
        L_0x00b5:
            java.lang.Object r0 = r10.A01
            X.4Q4 r0 = (X.AnonymousClass4Q4) r0
            java.lang.Object r4 = r10.A02
            X.26S r4 = (X.AnonymousClass26S) r4
            int r3 = r10.A00
            X.1KA r0 = r0.A00
            java.util.List r0 = r0.A0M
            java.util.ArrayList r0 = X.C13680ns.A0n(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00cb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r2.next()
            X.26n r1 = (X.C449926n) r1
            java.lang.String r0 = r4.A03
            r1.ARA(r0, r3)
            goto L_0x00cb
        L_0x00dd:
            java.lang.Object r0 = r10.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            int r5 = r10.A00
            java.lang.Object r4 = r10.A02
            X.5Nr r4 = (X.C108365Nr) r4
            java.util.Iterator r3 = r0.iterator()
        L_0x00eb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r2 = r3.next()
            X.0QU r2 = (X.AnonymousClass0QU) r2
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x00eb
            r0 = -1
            if (r5 == r0) goto L_0x0106
            X.4Sb r0 = r2.A00
            android.util.SparseBooleanArray r1 = r0.A00
            r0 = 1
            r1.append(r5, r0)
        L_0x0106:
            r0 = 1
            r2.A01 = r0
            java.lang.Object r0 = r2.A03
            r4.AIX(r0)
            goto L_0x00eb
        L_0x010f:
            java.lang.Object r5 = r10.A01
            com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0 r5 = (com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0) r5
            java.lang.Object r0 = r10.A02
            java.util.Collection r0 = (java.util.Collection) r0
            int r4 = r10.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x011d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0133
            X.0tZ r2 = X.C13680ns.A0V(r3)
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = (com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment) r0
            X.03L r1 = r0.A0p
            X.1Vw r0 = r2.A11
            r1.A03(r0)
            goto L_0x011d
        L_0x0133:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = (com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment) r3
            java.util.List r0 = r3.A0k
            int r0 = r0.size()
            r2 = 6
            r1 = 4
            if (r4 < r0) goto L_0x0145
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment.A03(r3, r1, r2)
            return
        L_0x0145:
            r3.A1M()
            r0 = -1
            r3.A00 = r0
            r3.A1N(r4)
            X.1wi r0 = r3.A1J()
            r3.A1Q(r0, r1, r2)
            return
        L_0x0156:
            java.lang.Object r0 = r10.A01
            X.4IZ r0 = (X.AnonymousClass4IZ) r0
            int r3 = r10.A00
            java.lang.Object r2 = r10.A02
            X.4L0 r2 = (X.AnonymousClass4L0) r2
            X.0xA r1 = r0.A01
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            r1.A01(r2, r3, r0)
            return
        L_0x016c:
            java.lang.Object r0 = r10.A01
            X.4IZ r0 = (X.AnonymousClass4IZ) r0
            int r3 = r10.A00
            java.lang.Object r2 = r10.A02
            X.4L0 r2 = (X.AnonymousClass4L0) r2
            X.0xA r1 = r0.A01
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            r1.A02(r2, r3, r0)
            return
        L_0x0182:
            java.lang.Object r7 = r10.A01
            com.obwhatsapp.pnh.RequestPhoneNumberViewModel r7 = (com.obwhatsapp.pnh.RequestPhoneNumberViewModel) r7
            java.lang.Object r6 = r10.A02
            X.1ZX r6 = (X.AnonymousClass1ZX) r6
            int r5 = r10.A00
            X.0tb r9 = r7.A02
            X.17g r8 = r9.A1N
            X.0t3 r0 = r9.A0Q
            long r0 = r0.A00()
            r4 = 72
            X.18b r3 = r8.A05
            r2 = 1
            X.1Vw r2 = r3.A02(r6, r2)
            X.0tZ r1 = r8.A01(r2, r4, r0)
            boolean r0 = r1 instanceof X.C39211s6
            if (r0 == 0) goto L_0x01e2
            X.0t6 r0 = r9.A0e
            r0.A0W(r1)
            X.15H r8 = r7.A04
            monitor-enter(r8)
            X.14v r0 = r8.A01     // Catch:{ all -> 0x01df }
            long r3 = r0.A01(r6)     // Catch:{ all -> 0x01df }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r8.A0B(r6)     // Catch:{ all -> 0x01df }
            if (r0 != 0) goto L_0x01d3
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01df }
            X.170 r0 = r8.A02     // Catch:{ all -> 0x01df }
            boolean r0 = r0.A03(r3, r1)     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x01d3
            r8.A02(r3, r1)     // Catch:{ all -> 0x01df }
            r8.A06(r6, r3)     // Catch:{ all -> 0x01df }
        L_0x01d3:
            monitor-exit(r8)
            X.16z r2 = r7.A06
            r1 = 3
            r0 = 1
            r2.A00(r6, r1, r5, r0)
            r7.A06(r6)
            return
        L_0x01df:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01e2:
            java.lang.String r0 = "FMessageFactory/newFMessageMedia/wrong message type; mediaWaType=\" + mediaWaType"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x01e9:
            java.lang.Object r1 = r10.A01
            X.2rb r1 = (X.C57692rb) r1
            java.lang.Object r0 = r10.A02
            X.4Kj r0 = (X.C84394Kj) r0
            int r2 = r10.A00
            X.0uk r1 = r1.A07
            com.whatsapp.jid.GroupJid r0 = r0.A01
            r1.A05(r0, r2)
            return
        L_0x01fb:
            int r0 = r10.A00
            if (r0 <= 0) goto L_0x0207
            java.lang.Object r0 = r10.A01
        L_0x0201:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0207:
            java.lang.Object r0 = r10.A02
            goto L_0x0201
        L_0x020a:
            java.lang.Object r0 = r10.A01
            com.facebook.redex.IDxRListenerShape419S0100000_2_I0 r0 = (com.facebook.redex.IDxRListenerShape419S0100000_2_I0) r0
            java.lang.Object r2 = r10.A02
            X.26O r2 = (X.AnonymousClass26O) r2
            int r1 = r10.A00
            java.lang.Object r0 = r0.A00
            X.1KA r0 = (X.AnonymousClass1KA) r0
            java.util.Map r0 = r0.A0O
            java.lang.Object r0 = r0.remove(r2)
            X.5RU r0 = (X.AnonymousClass5RU) r0
            if (r0 != 0) goto L_0x0228
            java.lang.String r0 = "The response handler must not be null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0228:
            r0.AR8(r2, r1)
            return
        L_0x022c:
            java.lang.Object r0 = r10.A02
            com.google.android.gms.vision.clearcut.DynamiteClearcutLogger r0 = (com.google.android.gms.vision.clearcut.DynamiteClearcutLogger) r0
            com.google.android.gms.vision.clearcut.VisionClearcutLogger r2 = r0.zzc
            int r1 = r10.A00
            java.lang.Object r0 = r10.A01
            X.3bD r0 = (X.C67233bD) r0
            r2.zza(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S0201000_I1.run():void");
    }
}
