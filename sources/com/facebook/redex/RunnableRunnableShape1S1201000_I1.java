package com.facebook.redex;

public class RunnableRunnableShape1S1201000_I1 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableRunnableShape1S1201000_I1(Object obj, Object obj2, String str, int i2, int i3) {
        this.A04 = i3;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0144, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        X.C41191vO.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0148, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014c, code lost:
        X.C41191vO.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014f, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A04
            switch(r0) {
                case 0: goto L_0x0158;
                case 1: goto L_0x0091;
                case 2: goto L_0x01df;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r12.A01
            X.34a r4 = (X.C605634a) r4
            java.lang.String r6 = r12.A03
            int r3 = r12.A00
            java.lang.Object r2 = r12.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r7 = r4.A04
            r1.append(r7)
            java.lang.String r5 = "/"
            r1.append(r5)
            r1.append(r6)
            java.lang.String r0 = "; async task started, start_id="
            r1.append(r0)
            r1.append(r3)
            X.C13680ns.A1V(r1)
            r2.run()     // Catch:{ Exception -> 0x0031 }
            goto L_0x0057
        L_0x0031:
            r8 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r7)     // Catch:{ all -> 0x007e }
            r1.append(r5)     // Catch:{ all -> 0x007e }
            r1.append(r6)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "; async task failed, start_id="
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r3)     // Catch:{ all -> 0x007e }
            com.whatsapp.util.Log.e(r0, r8)     // Catch:{ all -> 0x007e }
            X.0so r2 = r4.A01     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r6)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass000.A0e(r8, r0, r1)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "xpm-export-service-error"
            r2.A03(r0, r1, r8)     // Catch:{ all -> 0x007e }
        L_0x0057:
            monitor-enter(r4)
            X.5Uo r1 = r4.A03     // Catch:{ all -> 0x007b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x007b }
            r1.remove(r0)     // Catch:{ all -> 0x007b }
            r4.A00()     // Catch:{ all -> 0x007b }
            monitor-exit(r4)     // Catch:{ all -> 0x007b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r7)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r0 = "; async task completed, start_id="
            r1.append(r0)
            r1.append(r3)
            X.C13680ns.A1V(r1)
            return
        L_0x007b:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x007b }
            throw r1
        L_0x007e:
            r2 = move-exception
            monitor-enter(r4)
            X.5Uo r1 = r4.A03     // Catch:{ all -> 0x008e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x008e }
            r1.remove(r0)     // Catch:{ all -> 0x008e }
            r4.A00()     // Catch:{ all -> 0x008e }
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r2
        L_0x008e:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r1
        L_0x0091:
            java.lang.Object r7 = r12.A01
            X.2BN r7 = (X.AnonymousClass2BN) r7
            java.lang.String r0 = r12.A03
            java.lang.Object r8 = r12.A02
            X.3Gb r8 = (X.C63083Gb) r8
            int r6 = r12.A00
            int r5 = java.lang.Integer.parseInt(r0)
            X.42o[] r4 = X.C801042o.values()
            int r3 = r4.length
            r2 = 0
        L_0x00a7:
            if (r2 >= r3) goto L_0x013e
            r1 = r4[r2]
            int r2 = r2 + 1
            int r0 = r1.value
            if (r0 != r5) goto L_0x00a7
        L_0x00b1:
            r0 = 0
            X.C18450wi.A0H(r1, r0)
            r7.A00 = r1
            int r5 = r1.statusMapping
            X.42N[] r4 = X.AnonymousClass42N.values()
            int r3 = r4.length
            r2 = 0
        L_0x00bf:
            if (r2 >= r3) goto L_0x0150
            r1 = r4[r2]
            int r2 = r2 + 1
            int r0 = r1.value
            if (r0 != r5) goto L_0x00bf
            r7.A01 = r1
            X.42o r0 = r7.A00
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x00e5;
                case 2: goto L_0x00e5;
                case 3: goto L_0x00e5;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            X.1UJ r2 = r8.A00
            if (r2 == 0) goto L_0x01f0
            X.4yx r1 = new X.4yx
            r1.<init>(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.AIV(r1, r0)
            return
        L_0x00e5:
            X.18U r5 = r8.A03
            X.0sL r10 = r7.A05
            com.whatsapp.jid.UserJid r4 = r7.A06
            r3 = 0
            r1 = 1
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = r10.getRawString()
            r11 = 0
            r2[r3] = r0
            java.lang.String r0 = r4.getRawString()
            r2[r1] = r0
            X.11X r0 = r5.A01
            X.0tf r5 = r0.get()
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = "SELECT EXISTS ( SELECT 1 FROM group_membership_approval_requests WHERE group_jid = ? AND requester_jid = ?) AS request_exists"
            android.database.Cursor r9 = r1.A08(r0, r2)     // Catch:{ all -> 0x0149 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = "request_exists"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0142 }
            long r3 = r9.getLong(r0)     // Catch:{ all -> 0x0142 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0122
            r11 = 1
        L_0x0122:
            r9.close()     // Catch:{ all -> 0x0149 }
            r5.close()
            if (r11 == 0) goto L_0x00d4
            X.18V r2 = r8.A04
            java.lang.String r0 = r10.getRawString()
            X.C18450wi.A0B(r0)
            X.2BT r1 = new X.2BT
            r1.<init>(r0)
            X.0xb r0 = r2.A00
            r0.A00(r1)
            goto L_0x00d4
        L_0x013e:
            X.42o r1 = X.C801042o.DEFAULT
            goto L_0x00b1
        L_0x0142:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            X.C41191vO.A00(r9, r1)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014b }
        L_0x014b:
            r0 = move-exception
            X.C41191vO.A00(r5, r1)
            throw r0
        L_0x0150:
            java.lang.String r0 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        L_0x0158:
            java.lang.Object r5 = r12.A01
            X.39S r5 = (X.AnonymousClass39S) r5
            java.lang.Object r1 = r12.A02
            byte[] r1 = (byte[]) r1
            java.lang.String r8 = r12.A03
            int r7 = r12.A00
            X.11s r0 = r5.A08
            X.1d4 r0 = r0.A07
            int r4 = r0.A01()
            r6 = 1
            if (r1 == 0) goto L_0x01c3
            int r3 = X.C28641Wx.A00(r1)
            java.lang.String r0 = "voip/encryption/onE2EDecryptionFailed.  message.id="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r8)
            java.lang.String r2 = "; serverRegistrationId="
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = "; localRegistrationId="
            r0.append(r1)
            r0.append(r4)
            X.C13680ns.A1V(r0)
            if (r3 == r4) goto L_0x01c3
            java.lang.String r0 = "voip/encryption/onE2EDecryptionFailed registration id received did not match local; message.id="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r8)
            r0.append(r2)
            X.C13690nt.A1N(r1, r0, r3, r4)
            X.C13680ns.A1V(r0)
            r1 = 1
        L_0x01a6:
            java.lang.String r0 = "voip/encryption/onE2EDecryptionFailed reject at retry: "
            if (r1 == 0) goto L_0x01c5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            r1.append(r7)
            java.lang.String r0 = " sending local pre keys to server; localRegistrationId="
            r1.append(r0)
            r1.append(r4)
            X.C13680ns.A1V(r1)
            X.12z r0 = r5.A02
            r0.A00()
            return
        L_0x01c3:
            r1 = 0
            goto L_0x01a6
        L_0x01c5:
            if (r7 <= r6) goto L_0x01f0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            r1.append(r7)
            java.lang.String r0 = " sending get prekey digest; localRegistrationId="
            r1.append(r0)
            r1.append(r4)
            X.C13680ns.A1V(r1)
            X.12z r0 = r5.A02
            r0.A02()
            return
        L_0x01df:
            java.lang.Object r0 = r12.A01
            X.3Gj r0 = (X.C63163Gj) r0
            java.lang.Object r3 = r12.A02
            X.2Bl r3 = (X.C45872Bl) r3
            java.lang.String r2 = r12.A03
            int r1 = r12.A00
            boolean r0 = r0.A03
            r3.ASf(r1, r2, r0)
        L_0x01f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S1201000_I1.run():void");
    }
}
