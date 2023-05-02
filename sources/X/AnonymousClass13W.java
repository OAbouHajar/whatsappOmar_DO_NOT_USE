package X;

/* renamed from: X.13W  reason: invalid class name */
public class AnonymousClass13W {
    public final C14870pt A00;
    public final AnonymousClass13V A01;
    public final C16000sG A02;
    public final C17030uP A03;
    public final C16460t6 A04;
    public final C14710pd A05;
    public final C16320sq A06;

    public AnonymousClass13W(C14870pt r1, AnonymousClass13V r2, C16000sG r3, C17030uP r4, C16460t6 r5, C14710pd r6, C16320sq r7) {
        this.A05 = r6;
        this.A00 = r1;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r1 == 14) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        if (r1 != 14) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c6, code lost:
        if (r3.A05 != r30) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(com.whatsapp.jid.UserJid r26, X.C40111ta r27, byte[] r28, int r29, long r30) {
        /*
            r25 = this;
            r12 = r25
            X.0uP r4 = r12.A03
            r13 = r26
            X.1Vq r3 = r4.A00(r13)
            X.0pd r2 = r12.A05
            r1 = 2320(0x910, float:3.251E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r11 = r2.A0E(r0, r1)
            if (r3 == 0) goto L_0x0045
            int r5 = r3.A03
        L_0x0018:
            int r2 = X.C32441gM.A00(r3)
            r15 = 0
            if (r3 == 0) goto L_0x0043
            X.1ta r1 = r3.A00()
        L_0x0023:
            X.1gM r0 = new X.1gM
            r0.<init>(r1, r2, r5)
            int r1 = r0.A01()
            r0 = 11
            if (r1 == r0) goto L_0x003d
            r0 = 12
            if (r1 == r0) goto L_0x003d
            r0 = 13
            if (r1 == r0) goto L_0x003d
            r0 = 14
            r10 = 0
            if (r1 != r0) goto L_0x003e
        L_0x003d:
            r10 = 1
        L_0x003e:
            r6 = r28
            if (r28 == 0) goto L_0x0082
            goto L_0x0047
        L_0x0043:
            r1 = r15
            goto L_0x0023
        L_0x0045:
            r5 = 0
            goto L_0x0018
        L_0x0047:
            X.1tb r0 = X.C40121tb.A04     // Catch:{ 1bD -> 0x0067, IllegalArgumentException -> 0x006f }
            X.1Wm r5 = X.C28541Wm.A0E(r0, r6)     // Catch:{ 1bD -> 0x0067, IllegalArgumentException -> 0x006f }
            X.1tb r5 = (X.C40121tb) r5     // Catch:{ 1bD -> 0x0067, IllegalArgumentException -> 0x006f }
            int r0 = r5.A00     // Catch:{ 1bD -> 0x0067, IllegalArgumentException -> 0x006f }
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0082
            X.1Ww r0 = r5.A01     // Catch:{ 1bD -> 0x0067, IllegalArgumentException -> 0x006f }
            byte[] r1 = r0.A04()     // Catch:{ 1bD -> 0x0067, IllegalArgumentException -> 0x006f }
            X.1tc r0 = X.C40131tc.A06     // Catch:{ 1bD -> 0x0067, IllegalArgumentException -> 0x006f }
            X.1Wm r0 = X.C28541Wm.A0E(r0, r1)     // Catch:{ 1bD -> 0x0067, IllegalArgumentException -> 0x006f }
            X.1tc r0 = (X.C40131tc) r0     // Catch:{ 1bD -> 0x0067, IllegalArgumentException -> 0x006f }
            if (r0 == 0) goto L_0x0082
            goto L_0x0085
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = "vname invalidproto:"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0082
        L_0x006f:
            r5 = move-exception
            java.lang.String r1 = "vname failed to get identity entry for jid = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w(r0, r5)
        L_0x0082:
            r1 = r15
            r0 = r15
            goto L_0x0089
        L_0x0085:
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r0.A05
        L_0x0089:
            r22 = 0
            X.1Vq r16 = new X.1Vq
            r7 = r27
            r5 = r29
            r23 = r30
            r17 = r13
            r18 = r7
            r19 = r1
            r20 = r0
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            int r1 = X.C32441gM.A00(r16)
            X.1gM r0 = new X.1gM
            r0.<init>(r7, r1, r5)
            int r1 = r0.A01()
            r0 = 11
            if (r1 == r0) goto L_0x00be
            r0 = 12
            if (r1 == r0) goto L_0x00be
            r0 = 13
            if (r1 == r0) goto L_0x00be
            r0 = 14
            r9 = 0
            if (r1 != r0) goto L_0x00bf
        L_0x00be:
            r9 = 1
        L_0x00bf:
            if (r3 == 0) goto L_0x00c8
            long r0 = r3.A05
            int r8 = (r0 > r30 ? 1 : (r0 == r30 ? 0 : -1))
            r0 = 1
            if (r8 == 0) goto L_0x00c9
        L_0x00c8:
            r0 = 0
        L_0x00c9:
            if (r28 == 0) goto L_0x010d
            if (r0 != 0) goto L_0x010d
            boolean r8 = r4.A04(r13, r7, r6, r5)
        L_0x00d1:
            if (r3 == 0) goto L_0x010a
            int r7 = r3.A03
            java.lang.String r6 = r3.A08
        L_0x00d7:
            X.1Vq r0 = r4.A00(r13)
            if (r0 != 0) goto L_0x0107
            r1 = r15
        L_0x00de:
            if (r3 == 0) goto L_0x0105
            X.1ta r14 = r3.A00()
        L_0x00e4:
            if (r0 == 0) goto L_0x00ea
            X.1ta r15 = r0.A00()
        L_0x00ea:
            int r21 = X.C32441gM.A00(r0)
            if (r8 == 0) goto L_0x0104
            X.0sq r0 = r12.A06
            X.2KE r11 = new X.2KE
            r20 = r2
            r17 = r1
            r18 = r7
            r19 = r5
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.Acl(r11)
        L_0x0104:
            return
        L_0x0105:
            r14 = r15
            goto L_0x00e4
        L_0x0107:
            java.lang.String r1 = r0.A08
            goto L_0x00de
        L_0x010a:
            r7 = 0
            r6 = r15
            goto L_0x00d7
        L_0x010d:
            if (r10 == 0) goto L_0x0119
            if (r9 != 0) goto L_0x0119
            if (r11 == 0) goto L_0x0119
            java.lang.String r0 = "Deferring the business state transition"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0119:
            r0 = 1
            boolean r8 = r4.A03(r13, r7, r5, r0)
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13W.A00(com.whatsapp.jid.UserJid, X.1ta, byte[], int, long):void");
    }
}
