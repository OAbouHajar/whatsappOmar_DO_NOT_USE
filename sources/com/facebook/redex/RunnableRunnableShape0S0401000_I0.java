package com.facebook.redex;

public class RunnableRunnableShape0S0401000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public RunnableRunnableShape0S0401000_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2, int i3) {
        this.A05 = i3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i2;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A05
            switch(r0) {
                case 0: goto L_0x014a;
                case 1: goto L_0x0134;
                case 2: goto L_0x0088;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r12.A01
            X.1Ty r6 = (X.C28001Ty) r6
            java.lang.Object r2 = r12.A02
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            int r9 = r12.A00
            java.lang.Object r8 = r12.A03
            X.1ci r8 = (X.C30641ci) r8
            java.lang.Object r5 = r12.A04
            X.1d1 r5 = (X.C30821d1) r5
            java.lang.String r0 = "axolotl received a location notification; jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = "; retryCount="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Yb r4 = X.C28851Ya.A02(r2)
            X.3FT r1 = new X.3FT
            r1.<init>(r4, r6, r8)
            int r2 = r5.A00
            if (r2 != 0) goto L_0x007c
            X.11s r3 = r6.A03
            byte[] r0 = r5.A02
            X.1d8 r0 = r3.A05(r1, r4, r0)
        L_0x0045:
            int r2 = r0.A00
            if (r2 == 0) goto L_0x007b
            java.lang.String r1 = "axolotl error; status="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            if (r2 == r0) goto L_0x006a
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            if (r2 == r0) goto L_0x006a
            r0 = -1003(0xfffffffffffffc15, float:NaN)
            if (r2 == r0) goto L_0x006a
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            if (r2 != r0) goto L_0x007b
        L_0x006a:
            X.1d4 r0 = r3.A07
            int r7 = r0.A01()
            X.0pt r0 = r6.A00
            r10 = 6
            com.facebook.redex.RunnableRunnableShape0S0202000_I0 r5 = new com.facebook.redex.RunnableRunnableShape0S0202000_I0
            r5.<init>((java.lang.Object) r6, (int) r7, (java.lang.Object) r8, (int) r9, (int) r10)
            r0.A0K(r5)
        L_0x007b:
            return
        L_0x007c:
            r0 = 1
            if (r2 != r0) goto L_0x011a
            X.11s r3 = r6.A03
            byte[] r0 = r5.A02
            X.1d8 r0 = r3.A06(r1, r4, r0)
            goto L_0x0045
        L_0x0088:
            java.lang.Object r3 = r12.A01
            X.0vP r3 = (X.C17640vP) r3
            java.lang.Object r7 = r12.A02
            com.whatsapp.jid.DeviceJid r7 = (com.whatsapp.jid.DeviceJid) r7
            java.lang.Object r9 = r12.A03
            byte[] r9 = (byte[]) r9
            int r0 = r12.A00
            byte r10 = (byte) r0
            java.lang.Object r8 = r12.A04
            byte[] r8 = (byte[]) r8
            X.01D r0 = r3.A08
            java.lang.Object r0 = r0.get()
            X.0xT r0 = (X.C18920xT) r0
            java.util.concurrent.locks.Lock r5 = r0.A04(r7)
            if (r5 == 0) goto L_0x00ac
            r5.lock()     // Catch:{ all -> 0x0187 }
        L_0x00ac:
            byte r1 = r7.device     // Catch:{ all -> 0x0187 }
            r0 = 0
            if (r1 != 0) goto L_0x00b2
            r0 = 1
        L_0x00b2:
            r4 = 1
            if (r0 != 0) goto L_0x00d3
            X.01D r1 = r3.A03     // Catch:{ all -> 0x0187 }
            java.lang.Object r6 = r1.get()     // Catch:{ all -> 0x0187 }
            X.137 r6 = (X.AnonymousClass137) r6     // Catch:{ all -> 0x0187 }
            r11 = 5
            boolean r0 = r6.A0C(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = "recvmessagelistener/on-get-identity-success/invalid device identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0187 }
            X.137 r0 = (X.AnonymousClass137) r0     // Catch:{ all -> 0x0187 }
            r0.A08(r7, r4)     // Catch:{ all -> 0x0187 }
            goto L_0x0114
        L_0x00d3:
            r0 = 2
            byte[][] r2 = new byte[r0][]     // Catch:{ all -> 0x0187 }
            byte[] r1 = new byte[r4]     // Catch:{ all -> 0x0187 }
            r0 = 0
            r1[r0] = r10     // Catch:{ all -> 0x0187 }
            r2[r0] = r1     // Catch:{ all -> 0x0187 }
            r2[r4] = r9     // Catch:{ all -> 0x0187 }
            byte[] r0 = X.C28641Wx.A04(r2)     // Catch:{ all -> 0x0187 }
            X.1cD r4 = X.C28851Ya.A01(r0)     // Catch:{ 1ey -> 0x010e }
            X.01D r0 = r3.A06     // Catch:{ 1ey -> 0x010e }
            java.lang.Object r2 = r0.get()     // Catch:{ 1ey -> 0x010e }
            X.11s r2 = (X.C208211s) r2     // Catch:{ 1ey -> 0x010e }
            X.1Yb r1 = X.C28851Ya.A02(r7)     // Catch:{ 1ey -> 0x010e }
            X.1WL r0 = new X.1WL     // Catch:{ 1ey -> 0x010e }
            r0.<init>(r4)     // Catch:{ 1ey -> 0x010e }
            r2.A0R(r0, r1)     // Catch:{ 1ey -> 0x010e }
            X.01D r0 = r3.A04     // Catch:{ 1ey -> 0x010e }
            java.lang.Object r2 = r0.get()     // Catch:{ 1ey -> 0x010e }
            X.0pt r2 = (X.C14870pt) r2     // Catch:{ 1ey -> 0x010e }
            r1 = 18
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5     // Catch:{ 1ey -> 0x010e }
            r0.<init>(r3, r1, r7)     // Catch:{ 1ey -> 0x010e }
            r2.A0K(r0)     // Catch:{ 1ey -> 0x010e }
            goto L_0x0114
        L_0x010e:
            r1 = move-exception
            java.lang.String r0 = "recvmessagelistener/on-get-identity-success/invalidkey/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0187 }
        L_0x0114:
            if (r5 == 0) goto L_0x007b
            r5.unlock()
            return
        L_0x011a:
            java.lang.String r0 = "axolotl unrecognized ciphertext type; stanzaKey="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = "; type="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0134:
            java.lang.Object r4 = r12.A01
            com.obwhatsapp.calling.service.VoiceService$VoiceServiceEventCallback r4 = (com.obwhatsapp.calling.service.VoiceService$VoiceServiceEventCallback) r4
            java.lang.Object r3 = r12.A02
            com.whatsapp.voipcalling.Voip$RecordingInfo[] r3 = (com.whatsapp.voipcalling.Voip.RecordingInfo[]) r3
            java.lang.Object r2 = r12.A03
            com.whatsapp.voipcalling.Voip$DebugTapType r2 = (com.whatsapp.voipcalling.Voip.DebugTapType) r2
            java.lang.Object r1 = r12.A04
            byte[] r1 = (byte[]) r1
            int r0 = r12.A00
            r4.lambda$callCaptureBufferFilled$3(r3, r2, r1, r0)
            return
        L_0x014a:
            java.lang.Object r7 = r12.A01
            X.1H7 r7 = (X.AnonymousClass1H7) r7
            java.lang.Object r6 = r12.A02
            X.0tY r6 = (X.C16730tY) r6
            int r5 = r12.A00
            java.lang.Object r4 = r12.A03
            X.0tZ r4 = (X.C16740tZ) r4
            java.lang.Object r3 = r12.A04
            X.0ta r3 = (X.C16750ta) r3
            r2 = 0
            r1 = 1
            if (r5 == r1) goto L_0x016f
            r0 = 2
            if (r5 == r0) goto L_0x016f
            boolean r0 = r6 instanceof X.C38681rF
            if (r0 != 0) goto L_0x016f
            boolean r0 = r6 instanceof X.C38701rH
            if (r0 == 0) goto L_0x0170
            int r0 = r6.A08
            if (r0 != r1) goto L_0x0170
        L_0x016f:
            r2 = 1
        L_0x0170:
            r1 = 0
            if (r3 == 0) goto L_0x0175
            r3.A0P = r1
        L_0x0175:
            r6.A0R()
            if (r2 == 0) goto L_0x0180
            X.10X r0 = r7.A01
            r0.A06(r6, r1, r1)
            return
        L_0x0180:
            X.0t6 r1 = r7.A06
            r0 = -1
            r1.A0e(r4, r0)
            return
        L_0x0187:
            r0 = move-exception
            if (r5 == 0) goto L_0x018d
            r5.unlock()
        L_0x018d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0401000_I0.run():void");
    }
}
