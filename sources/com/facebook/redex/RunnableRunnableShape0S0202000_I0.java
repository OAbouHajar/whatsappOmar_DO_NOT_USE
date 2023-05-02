package com.facebook.redex;

import X.C226318r;

public class RunnableRunnableShape0S0202000_I0 implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableRunnableShape0S0202000_I0(C226318r r2, Object obj, int i2, int i3, int i4) {
        this.A04 = i4;
        if (i4 != 0) {
            this.A02 = r2;
            this.A00 = i2;
        } else {
            this.A02 = r2;
            this.A00 = 2;
        }
        this.A01 = i3;
        this.A03 = obj;
    }

    public RunnableRunnableShape0S0202000_I0(Object obj, int i2, Object obj2, int i3, int i4) {
        this.A04 = i4;
        this.A02 = obj;
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x0285;
                case 1: goto L_0x0274;
                case 2: goto L_0x01ee;
                case 3: goto L_0x01cf;
                case 4: goto L_0x01c3;
                case 5: goto L_0x0105;
                case 6: goto L_0x0223;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r7 = r0.A02
            X.1L1 r7 = (X.AnonymousClass1L1) r7
            int r3 = r0.A00
            int r6 = r0.A01
            java.lang.Object r8 = r0.A03
            X.0tZ r8 = (X.C16740tZ) r8
            X.3rz r2 = new X.3rz
            r2.<init>()
            X.2Jd r0 = r7.A00
            if (r0 != 0) goto L_0x0080
            r0 = 0
        L_0x001e:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A03 = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r2.A02 = r5
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass1L1.A01(r8)
            if (r1 == 0) goto L_0x0052
            X.0sG r0 = r7.A03
            X.0sH r1 = r0.A08(r1)
            if (r1 == 0) goto L_0x0052
            boolean r0 = r1.A0H()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            boolean r0 = r1.A0G()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
        L_0x0052:
            X.0t9 r0 = r7.A09
            r0.A05(r2)
            X.2Jf r0 = r7.A01
            if (r0 == 0) goto L_0x0273
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r0 = r0.A0D
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x006a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r1.next()
            X.4Of r0 = (X.C85384Of) r0
            java.util.Map r0 = r0.A08
            java.util.Collection r0 = r0.values()
            r2.addAll(r0)
            goto L_0x006a
        L_0x0080:
            long r0 = r0.A05
            goto L_0x001e
        L_0x0083:
            java.util.Iterator r11 = r2.iterator()
        L_0x0087:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0273
            java.lang.Object r9 = r11.next()
            X.4PH r9 = (X.AnonymousClass4PH) r9
            java.lang.String r4 = r9.A0K
            X.1Vw r0 = r8.A11
            java.lang.String r0 = r0.A01
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0087
            long r0 = r9.A09
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            boolean r0 = r9.A0M
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            com.whatsapp.jid.UserJid r13 = r9.A0A
            java.lang.Integer r0 = r9.A0F
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x00f6
            r0 = 3
            if (r1 == r0) goto L_0x00f6
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
        L_0x00bb:
            int r0 = r9.A02
            int r0 = X.C27691St.A00(r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r0 = 15
            X.1St r12 = r7.A0E
            if (r0 != r6) goto L_0x00e2
            boolean r0 = r12.A04(r8)
            if (r0 == 0) goto L_0x0087
            r18 = r4
            X.3sj r2 = r12.A02(r13, r14, r15, r16, r17, r18)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00dc:
            r2.A06 = r0
            r12.A03(r2, r8)
            goto L_0x0087
        L_0x00e2:
            r1 = 1
            boolean r0 = r12.A04(r8)
            if (r0 == 0) goto L_0x0087
            r18 = r4
            X.3sj r2 = r12.A02(r13, r14, r15, r16, r17, r18)
            r2.A04 = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x00dc
        L_0x00f6:
            long r2 = r9.A08
            long r0 = r9.A06
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r0 = 0
            if (r10 < 0) goto L_0x0100
            r0 = 1
        L_0x0100:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
            goto L_0x00bb
        L_0x0105:
            java.lang.Object r8 = r0.A02
            X.1Ty r8 = (X.C28001Ty) r8
            java.lang.Object r4 = r0.A03
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            int r2 = r0.A00
            int r6 = r0.A01
            X.1Yb r5 = X.C28851Ya.A02(r4)
            X.0xT r0 = r8.A05
            java.util.concurrent.locks.Lock r10 = r0.A02(r5)
            if (r10 == 0) goto L_0x0120
            r10.lock()     // Catch:{ all -> 0x01bc }
        L_0x0120:
            r9 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bc }
            r1.<init>()     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = "axolotl checking sessions for "
            r1.append(r0)     // Catch:{ all -> 0x01bc }
            r1.append(r5)     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = " due to retry receipt for "
            r1.append(r0)     // Catch:{ all -> 0x01bc }
            r1.append(r4)     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01bc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01bc }
            X.11s r3 = r8.A03     // Catch:{ all -> 0x01bc }
            boolean r0 = r3.A0d(r5)     // Catch:{ all -> 0x01bc }
            if (r0 == 0) goto L_0x01ac
            X.1ev r0 = r3.A0D(r5)     // Catch:{ all -> 0x01bc }
            X.1ms r0 = r0.A01     // Catch:{ all -> 0x01bc }
            X.1mt r7 = r0.A00     // Catch:{ all -> 0x01bc }
            int r0 = r7.A03     // Catch:{ all -> 0x01bc }
            if (r0 == r2) goto L_0x0171
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bc }
            r1.<init>()     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = "axolotl deleting session due to registration id change for "
            r1.append(r0)     // Catch:{ all -> 0x01bc }
            r1.append(r4)     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = " stop retrying"
            r1.append(r0)     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01bc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01bc }
            r3.A0U(r5)     // Catch:{ all -> 0x01bc }
            r3.A0T(r5)     // Catch:{ all -> 0x01bc }
            goto L_0x01b6
        L_0x0171:
            r2 = 2
            if (r6 < r2) goto L_0x01ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bc }
            r1.<init>()     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = "axolotl requiring new session before resending for "
            r1.append(r0)     // Catch:{ all -> 0x01bc }
            r1.append(r4)     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01bc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01bc }
            X.1Ww r0 = r7.A05     // Catch:{ all -> 0x01bc }
            byte[] r9 = r0.A04()     // Catch:{ all -> 0x01bc }
            if (r6 <= r2) goto L_0x01a0
            com.whatsapp.jid.UserJid r0 = r4.getUserJid()     // Catch:{ all -> 0x01bc }
            boolean r0 = r3.A0e(r5, r0)     // Catch:{ all -> 0x01bc }
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = "axolotl will wait to send notification until a new prekey has been fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01bc }
            goto L_0x01b6
        L_0x01a0:
            java.lang.String r0 = "axolotl will record the base key used to send "
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01bc }
            com.whatsapp.jid.UserJid r0 = r4.getUserJid()     // Catch:{ all -> 0x01bc }
            r3.A0V(r5, r0, r9)     // Catch:{ all -> 0x01bc }
        L_0x01ac:
            X.0xb r1 = r8.A02     // Catch:{ all -> 0x01bc }
            com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob r0 = new com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob     // Catch:{ all -> 0x01bc }
            r0.<init>(r4, r9, r6)     // Catch:{ all -> 0x01bc }
            r1.A00(r0)     // Catch:{ all -> 0x01bc }
        L_0x01b6:
            if (r10 == 0) goto L_0x0273
            r10.unlock()
            return
        L_0x01bc:
            r0 = move-exception
            if (r10 == 0) goto L_0x01c2
            r10.unlock()
        L_0x01c2:
            throw r0
        L_0x01c3:
            java.lang.Object r6 = r0.A02
            X.0xA r6 = (X.C18730xA) r6
            int r2 = r0.A00
            int r1 = r0.A01
            java.lang.Object r5 = r0.A03
            r0 = 0
            goto L_0x01da
        L_0x01cf:
            java.lang.Object r6 = r0.A02
            X.0xA r6 = (X.C18730xA) r6
            int r2 = r0.A00
            int r1 = r0.A01
            java.lang.Object r5 = r0.A03
            r0 = 1
        L_0x01da:
            X.0zF r4 = r6.A01
            X.4MY r3 = new X.4MY
            r3.<init>(r6, r0, r2, r1)
            X.0sq r2 = r4.A00
            r1 = 42
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r4, r5, r3, r1)
            r2.Acl(r0)
            return
        L_0x01ee:
            java.lang.Object r6 = r0.A02
            X.0t9 r6 = (X.C16490t9) r6
            int r5 = r0.A00
            java.lang.Object r4 = r0.A03
            byte[] r4 = (byte[]) r4
            int r3 = r0.A01
            boolean r0 = r6.A0I()
            if (r0 == 0) goto L_0x0273
            boolean r0 = r6.A0Q
            if (r0 == 0) goto L_0x0215
            boolean r0 = r6.A0O
            if (r0 != 0) goto L_0x0215
            X.1CI r2 = r6.A0G
            java.util.ArrayList r1 = X.C810346o.A00()
            r0 = 0
            r2.A06(r0, r1)
            r0 = 1
            r6.A0O = r0
        L_0x0215:
            X.1a8 r0 = r6.A04
            r0.A04(r4, r5, r3)
            X.1a8 r0 = r6.A04
            r0.A01()
            r6.A02()
            return
        L_0x0223:
            java.lang.Object r6 = r0.A02
            X.1Ty r6 = (X.C28001Ty) r6
            java.lang.Object r5 = r0.A03
            X.1ci r5 = (X.C30641ci) r5
            int r2 = r0.A00
            int r4 = r0.A01
            java.lang.String r1 = "need to send retry receipt; stanzaKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte[] r3 = X.C28641Wx.A02(r2)
            r0 = 1
            if (r4 <= r0) goto L_0x024c
            X.12z r0 = r6.A01
            r0.A02()
        L_0x024c:
            java.lang.String r0 = "axolotl sending retry receipt; stanzaKey="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = "; localRegistrationId="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yQ r2 = r6.A06
            com.whatsapp.jid.UserJid r1 = r5.A00()
            X.AnonymousClass00B.A06(r1)
            int r0 = r4 + 1
            r2.A0S(r1, r3, r0)
        L_0x0273:
            return
        L_0x0274:
            java.lang.Object r3 = r0.A02
            X.18r r3 = (X.C226318r) r3
            int r2 = r0.A00
            int r1 = r0.A01
            java.lang.Object r0 = r0.A03
            r3.A00(r2)
            r3.A01(r0, r1, r2)
            return
        L_0x0285:
            java.lang.Object r3 = r0.A02
            X.18r r3 = (X.C226318r) r3
            int r2 = r0.A01
            java.lang.Object r1 = r0.A03
            r0 = 2
            r3.A00(r0)
            X.1Zq r0 = r3.A01
            r0.A00(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0202000_I0.run():void");
    }
}
