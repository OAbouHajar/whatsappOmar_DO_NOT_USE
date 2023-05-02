package com.facebook.redex;

public class RunnableRunnableShape0S0200100_I0 implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape0S0200100_I0(Object obj, Object obj2, int i2, long j2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0201, code lost:
        if (r9 <= 0) goto L_0x0203;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A03
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x013f;
                case 2: goto L_0x0150;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x00b6;
                case 7: goto L_0x017f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r13.A01
            X.14v r3 = (X.C216314v) r3
            long r1 = r13.A00
            java.lang.Object r0 = r13.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            r3.A0B(r0, r1)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r6 = r13.A01
            X.2Ui r6 = (X.AnonymousClass2Ui) r6
            java.lang.Object r5 = r13.A02
            X.4M6 r5 = (X.AnonymousClass4M6) r5
            long r1 = r13.A00
            X.0xU r7 = r6.A08
            X.0yb r9 = r7.A0D
            X.0t3 r0 = r9.A06
            long r10 = r0.A00()
            X.139 r0 = r9.A05
            android.content.SharedPreferences r8 = r0.A01()
            java.lang.String r0 = "syncd_last_device_reg_time"
            r3 = 0
            long r3 = r8.getLong(r0, r3)
            long r10 = r10 - r3
            r8 = 1
            r3 = 600000(0x927c0, double:2.964394E-318)
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L_0x0041
            r3 = 1
        L_0x0041:
            boolean r0 = r9.A03()
            if (r0 != 0) goto L_0x0069
            if (r3 == 0) goto L_0x006b
            boolean r0 = r9.A05()
            if (r0 == 0) goto L_0x006b
            X.0yO r0 = r9.A08
            java.util.List r0 = r0.A07()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x006b
            X.0pd r4 = r9.A09
            r3 = 1991(0x7c7, float:2.79E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r4.A0E(r0, r3)
            if (r0 == 0) goto L_0x006b
        L_0x0069:
            monitor-enter(r7)
            goto L_0x006d
        L_0x006b:
            r8 = 0
            goto L_0x0069
        L_0x006d:
            boolean r0 = r7.A05     // Catch:{ all -> 0x0227 }
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "sync-manager/shouldCleanUpSyncdOnPairing isSyncing = true"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0227 }
            monitor-exit(r7)     // Catch:{ all -> 0x0227 }
            goto L_0x01ba
        L_0x007a:
            monitor-exit(r7)     // Catch:{ all -> 0x0227 }
            java.lang.String r3 = "sync-manager/shouldCleanUpSyncdOnPairing shouldCleanUpSyncdOnPairing = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r8 == 0) goto L_0x01ba
            java.lang.String r0 = "CompanionDeviceQrHandler/handleSyncdDirty clean syncD before companion dereg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0t3 r0 = r6.A0A
            long r1 = r0.A00()
            X.1Ch r3 = r6.A07
            X.2Ug r0 = new X.2Ug
            r0.<init>(r6, r5, r1)
            r3.A02(r0)
            X.0yb r2 = r6.A06
            boolean r0 = r2.A04()
            if (r0 != 0) goto L_0x0012
            X.139 r1 = r2.A05
            r0 = 0
            r1.A05(r0)
            r2.A00()
            return
        L_0x00b6:
            java.lang.Object r10 = r13.A01
            X.0yO r10 = (X.C19410yO) r10
            java.lang.Object r4 = r13.A02
            long r2 = r13.A00
            X.16S r0 = r10.A0L
            X.0rz r0 = r0.A01
            boolean r0 = r0.A1d()
            if (r0 == 0) goto L_0x0012
            X.0xd r1 = r10.A0I
            X.0vs r0 = r1.A00()
            java.lang.Object r0 = r0.get(r4)
            X.1WN r0 = (X.AnonymousClass1WN) r0
            if (r0 == 0) goto L_0x0012
            r0.A00 = r2
            com.whatsapp.jid.DeviceJid r11 = r0.A06
            X.19N r9 = r1.A04
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>()
            java.lang.String r1 = "last_active"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r12.put(r1, r0)
            X.1p7 r0 = r9.A02
            X.0tf r8 = r0.A02()
            X.0tg r7 = r8.A02     // Catch:{ all -> 0x022d }
            java.lang.String r6 = "devices"
            java.lang.String r5 = "device_id = ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x022d }
            r1 = 0
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x022d }
            r4[r1] = r0     // Catch:{ all -> 0x022d }
            r7.A00(r6, r12, r5, r4)     // Catch:{ all -> 0x022d }
            monitor-enter(r9)     // Catch:{ all -> 0x022d }
            X.0vs r0 = r9.A00     // Catch:{ all -> 0x022a }
            if (r0 == 0) goto L_0x0112
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x022a }
            X.1WN r0 = (X.AnonymousClass1WN) r0     // Catch:{ all -> 0x022a }
            if (r0 == 0) goto L_0x0112
            r0.A00 = r2     // Catch:{ all -> 0x022a }
        L_0x0112:
            monitor-exit(r9)     // Catch:{ all -> 0x022a }
            r8.close()
            java.lang.Iterable r0 = r10.A01()
            java.util.Iterator r2 = r0.iterator()
        L_0x011e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r2.next()
            X.1WC r1 = (X.AnonymousClass1WC) r1
            boolean r0 = r1 instanceof com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0
            if (r0 == 0) goto L_0x011e
            com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0 r1 = (com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0) r1
            int r0 = r1.A01
            if (r0 != 0) goto L_0x011e
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel r0 = (com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel) r0
            X.1cy r1 = r0.A0T
            r0 = 0
            r1.A09(r0)
            goto L_0x011e
        L_0x013f:
            java.lang.Object r0 = r13.A01
            X.2UP r0 = (X.AnonymousClass2UP) r0
            java.lang.Object r4 = r13.A02
            X.4M6 r4 = (X.AnonymousClass4M6) r4
            long r2 = r13.A00
            X.2Ui r1 = r0.A00
            r0 = 1
            r1.A02(r4, r2, r0)
            return
        L_0x0150:
            java.lang.Object r2 = r13.A01
            X.1yj r2 = (X.C42821yj) r2
            java.lang.Object r3 = r13.A02
            X.0rv r3 = (X.C15830rv) r3
            long r7 = r13.A00
            X.1yV r0 = r2.A22
            X.1yR r0 = (X.AnonymousClass1yR) r0
            X.2DF r0 = r0.A00
            X.0sO r0 = r0.A0O
            java.util.Set r1 = r0.A02(r3)
            X.1yV r0 = r2.A22
            X.0pN r0 = (X.C14550pN) r0
            X.0so r0 = r0.A03
            java.util.Set r0 = X.C16030sJ.A0A(r0, r1)
            int r5 = r0.size()
            X.0w4 r2 = r2.A3u
            int r6 = r1.size()
            r4 = 3
            r2.A01(r3, r4, r5, r6, r7)
            return
        L_0x017f:
            java.lang.Object r0 = r13.A01
            X.14z r0 = (X.C216714z) r0
            java.lang.Object r1 = r13.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            long r3 = r13.A00
            X.14y r0 = r0.A01
            X.11X r0 = r0.A01
            X.0tf r5 = r0.A02()
            r0 = 2
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x01b5 }
            r2.<init>(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = "chat_jid"
            r2.put(r0, r1)     // Catch:{ all -> 0x01b5 }
            java.lang.String r1 = "timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01b5 }
            r2.put(r1, r0)     // Catch:{ all -> 0x01b5 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = "dismissed_chat"
            r1.A04(r2, r0)     // Catch:{ all -> 0x01b5 }
            r5.close()
            return
        L_0x01b5:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0231 }
            throw r0
        L_0x01ba:
            X.27H r4 = r6.A04
            monitor-enter(r4)
            X.0rz r8 = r4.A01     // Catch:{ all -> 0x0224 }
            int r9 = r8.A02()     // Catch:{ all -> 0x0224 }
            int r3 = r8.A01()     // Catch:{ all -> 0x0224 }
            r7 = 1
            if (r9 <= 0) goto L_0x01e7
            if (r3 <= 0) goto L_0x01e7
            X.0yO r0 = r4.A04     // Catch:{ all -> 0x0224 }
            java.util.List r0 = r0.A07()     // Catch:{ all -> 0x0224 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0224 }
            if (r0 != 0) goto L_0x01ff
            int r0 = r3 + 1
            if (r0 > 0) goto L_0x01e5
            java.lang.String r0 = "CompanionDeviceAdvUtil/incrementCurrentKeyIndex index overflow"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0224 }
            r4.A04()     // Catch:{ all -> 0x0224 }
            goto L_0x01ff
        L_0x01e5:
            r7 = r0
            goto L_0x0204
        L_0x01e7:
            java.lang.String r0 = "CompanionDeviceAdvUtil/incrementCurrentKeyIndex empty id and index"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0224 }
            r4.A04()     // Catch:{ all -> 0x0224 }
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x0224 }
            r0.<init>()     // Catch:{ all -> 0x0224 }
            int r0 = r0.nextInt()     // Catch:{ all -> 0x0224 }
            int r9 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0224 }
            if (r9 != 0) goto L_0x0204
            goto L_0x0203
        L_0x01ff:
            int r9 = r9 + 1
            if (r9 > 0) goto L_0x0204
        L_0x0203:
            r9 = 1
        L_0x0204:
            android.content.SharedPreferences$Editor r3 = r8.A0K()     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "adv_raw_id"
            android.content.SharedPreferences$Editor r0 = r3.putInt(r0, r9)     // Catch:{ all -> 0x0224 }
            r0.apply()     // Catch:{ all -> 0x0224 }
            android.content.SharedPreferences$Editor r3 = r8.A0K()     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "adv_current_key_index"
            android.content.SharedPreferences$Editor r0 = r3.putInt(r0, r7)     // Catch:{ all -> 0x0224 }
            r0.apply()     // Catch:{ all -> 0x0224 }
            monitor-exit(r4)
            r0 = 0
            r6.A02(r5, r1, r0)
            return
        L_0x0224:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0227:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0227 }
            throw r0
        L_0x022a:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x022a }
            throw r0     // Catch:{ all -> 0x022d }
        L_0x022d:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0231 }
        L_0x0231:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0200100_I0.run():void");
    }
}
