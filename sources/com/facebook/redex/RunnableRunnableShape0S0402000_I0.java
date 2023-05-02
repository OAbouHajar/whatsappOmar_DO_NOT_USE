package com.facebook.redex;

public class RunnableRunnableShape0S0402000_I0 implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public RunnableRunnableShape0S0402000_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2, int i3, int i4) {
        this.A06 = i4;
        this.A02 = obj;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r31 = this;
            r5 = r31
            int r0 = r5.A06
            if (r0 == 0) goto L_0x0104
            java.lang.Object r2 = r5.A02
            X.1Ty r2 = (X.C28001Ty) r2
            java.lang.Object r14 = r5.A03
            com.whatsapp.jid.DeviceJid r14 = (com.whatsapp.jid.DeviceJid) r14
            int r1 = r5.A00
            int r4 = r5.A01
            java.lang.Object r15 = r5.A04
            X.1Vw r15 = (X.C28381Vw) r15
            java.lang.Object r5 = r5.A05
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.String r7 = "; targetJid="
            com.whatsapp.jid.UserJid r6 = r14.getUserJid()
            X.1Yb r10 = X.C28851Ya.A02(r14)
            X.0xT r0 = r2.A05
            java.util.concurrent.locks.Lock r12 = r0.A02(r10)
            if (r12 == 0) goto L_0x002f
            r12.lock()     // Catch:{ all -> 0x00fd }
        L_0x002f:
            r3 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r8.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl checking sessions due to retry receipt; recipient="
            r8.append(r0)     // Catch:{ all -> 0x00fd }
            r8.append(r10)     // Catch:{ all -> 0x00fd }
            r8.append(r7)     // Catch:{ all -> 0x00fd }
            r8.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x00fd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fd }
            X.11s r9 = r2.A03     // Catch:{ all -> 0x00fd }
            boolean r0 = r9.A0d(r10)     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00ac
            X.1ev r0 = r9.A0D(r10)     // Catch:{ all -> 0x00fd }
            X.1ms r0 = r0.A01     // Catch:{ all -> 0x00fd }
            X.1mt r11 = r0.A00     // Catch:{ all -> 0x00fd }
            int r0 = r11.A03     // Catch:{ all -> 0x00fd }
            if (r0 == r1) goto L_0x0079
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r1.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl deleting session due to registration id change; stop retrying; targetJid="
            r1.append(r0)     // Catch:{ all -> 0x00fd }
            r1.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00fd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fd }
            r9.A0U(r10)     // Catch:{ all -> 0x00fd }
            r9.A0T(r10)     // Catch:{ all -> 0x00fd }
            goto L_0x00f7
        L_0x0079:
            r8 = 2
            if (r4 < r8) goto L_0x00ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r1.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl requiring new session before resending; targetJid="
            r1.append(r0)     // Catch:{ all -> 0x00fd }
            r1.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00fd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fd }
            X.1Ww r0 = r11.A05     // Catch:{ all -> 0x00fd }
            byte[] r3 = r0.A04()     // Catch:{ all -> 0x00fd }
            if (r4 <= r8) goto L_0x00a4
            boolean r0 = r9.A0e(r10, r6)     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl will wait to send notification until a new prekey has been fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fd }
            goto L_0x00f7
        L_0x00a4:
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl will record the base key used to send"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fd }
            r9.A0V(r10, r6, r3)     // Catch:{ all -> 0x00fd }
        L_0x00ac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r1.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; create new SendFinalLiveLocationRetryJob; messageKey="
            r1.append(r0)     // Catch:{ all -> 0x00fd }
            r1.append(r15)     // Catch:{ all -> 0x00fd }
            r1.append(r7)     // Catch:{ all -> 0x00fd }
            r1.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "; timeOffset="
            r1.append(r0)     // Catch:{ all -> 0x00fd }
            java.lang.Object r0 = r5.second     // Catch:{ all -> 0x00fd }
            r1.append(r0)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "; retryCount="
            r1.append(r0)     // Catch:{ all -> 0x00fd }
            r1.append(r4)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00fd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fd }
            X.0xb r2 = r2.A02     // Catch:{ all -> 0x00fd }
            X.AnonymousClass00B.A06(r14)     // Catch:{ all -> 0x00fd }
            java.lang.Object r1 = r5.first     // Catch:{ all -> 0x00fd }
            X.1sx r1 = (X.C39721sx) r1     // Catch:{ all -> 0x00fd }
            java.lang.Object r0 = r5.second     // Catch:{ all -> 0x00fd }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00fd }
            int r18 = r0.intValue()     // Catch:{ all -> 0x00fd }
            com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r13 = new com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob     // Catch:{ all -> 0x00fd }
            r19 = r4
            r17 = r3
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00fd }
            r2.A00(r13)     // Catch:{ all -> 0x00fd }
        L_0x00f7:
            if (r12 == 0) goto L_0x0223
            r12.unlock()
            return
        L_0x00fd:
            r0 = move-exception
            if (r12 == 0) goto L_0x0103
            r12.unlock()
        L_0x0103:
            throw r0
        L_0x0104:
            java.lang.Object r12 = r5.A02
            X.12B r12 = (X.AnonymousClass12B) r12
            int r3 = r5.A00
            int r2 = r5.A01
            java.lang.Object r11 = r5.A03
            X.0rv r11 = (X.C15830rv) r11
            java.lang.Object r10 = r5.A04
            X.273 r10 = (X.AnonymousClass273) r10
            java.lang.Object r9 = r5.A05
            X.279 r9 = (X.AnonymousClass279) r9
            java.lang.String r0 = "ProfilePhotoManager/sendGetProfilePhoto photoId:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " type:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " jid:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0pd r15 = r12.A09
            X.0ug r14 = r12.A0C
            java.lang.String r8 = "image"
            r0 = 1
            if (r2 != r0) goto L_0x0228
            r29 = r8
        L_0x0144:
            if (r3 <= 0) goto L_0x0224
            java.lang.String r30 = java.lang.Integer.toString(r3)
        L_0x014a:
            X.0tz r13 = r12.A08
            X.0vR r7 = r12.A0G
            X.0sq r6 = r12.A0H
            X.0ua r5 = r12.A03
            X.0vc r4 = r12.A0F
            X.0vS r3 = r12.A0E
            X.12A r2 = r12.A06
            X.15y r1 = r12.A0B
            X.15x r0 = r12.A0D
            X.3Fv r16 = new X.3Fv
            r28 = r6
            r27 = r7
            r26 = r4
            r25 = r3
            r24 = r9
            r23 = r10
            r22 = r0
            r21 = r12
            r20 = r1
            r19 = r13
            r18 = r2
            r17 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.3Gh r1 = new X.3Gh
            r26 = r16
            r27 = r11
            r28 = r14
            r25 = r15
            r24 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30)
            X.0ug r10 = r1.A04
            java.lang.String r4 = r10.A02()
            X.0rv r9 = r1.A03
            java.lang.String r6 = r1.A06
            boolean r0 = r8.equals(r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x01b0
        L_0x01a3:
            java.lang.String r3 = "query"
            java.lang.String r2 = "url"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r3, (java.lang.String) r2)
            r5.add(r0)
        L_0x01b0:
            java.lang.String r2 = r1.A05
            java.lang.String r8 = "id"
            java.lang.String r7 = "type"
            if (r2 == 0) goto L_0x01c1
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r8, (java.lang.String) r2)
            r5.add(r0)
        L_0x01c1:
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r7, (java.lang.String) r6)
            r5.add(r0)
            r3 = 0
            X.1lL[] r0 = new X.C35081lL[r3]
            java.lang.Object[] r2 = r5.toArray(r0)
            X.1lL[] r2 = (X.C35081lL[]) r2
            java.lang.String r0 = "picture"
            X.1Vv r6 = new X.1Vv
            r6.<init>(r0, r2)
            r0 = 5
            X.1lL[] r5 = new X.C35081lL[r0]
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r8, (java.lang.String) r4)
            r5[r3] = r0
            r8 = 1
            java.lang.String r3 = "xmlns"
            java.lang.String r2 = "w:profile:picture"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r3, (java.lang.String) r2)
            r5[r8] = r0
            r8 = 2
            X.1ks r3 = X.C34791ks.A00
            java.lang.String r2 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r2)
            r5[r8] = r0
            r3 = 3
            java.lang.String r2 = "target"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r9, (java.lang.String) r2)
            r5[r3] = r0
            r3 = 4
            java.lang.String r2 = "get"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r7, (java.lang.String) r2)
            r5[r3] = r0
            java.lang.String r0 = "iq"
            X.1Vv r12 = new X.1Vv
            r12.<init>((X.C28371Vv) r6, (java.lang.String) r0, (X.C35081lL[]) r5)
            r14 = 26
            r15 = 0
            r11 = r1
            r13 = r4
            r10.A0B(r11, r12, r13, r14, r15)
        L_0x0223:
            return
        L_0x0224:
            r30 = 0
            goto L_0x014a
        L_0x0228:
            java.lang.String r29 = "preview"
            goto L_0x0144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0402000_I0.run():void");
    }
}
