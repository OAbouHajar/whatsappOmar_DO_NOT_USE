package com.facebook.redex;

public class RunnableRunnableShape0S0300000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape0S0300000_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b3, code lost:
        r2 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04b5, code lost:
        if (r2 == null) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04b9, code lost:
        if (r2.A00 != r3) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04bb, code lost:
        r5.A0D.A09(r2.A01);
        r5.A02 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04c4, code lost:
        r6.A0N(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x05b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        X.C41191vO.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0d02, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0d05, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0d26, code lost:
        if (r0.A04 <= 0) goto L_0x0d28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0f79, code lost:
        if (r0.A04 <= 0) goto L_0x0f7b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d6, code lost:
        if (r0.A04 <= 0) goto L_0x01d8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:273:0x07c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:409:0x0dfe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:414:0x0e03 */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x05f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r13 = 0
            r4 = r33
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x0315;
                case 1: goto L_0x0329;
                case 2: goto L_0x004f;
                case 3: goto L_0x0346;
                case 4: goto L_0x0358;
                case 5: goto L_0x006d;
                case 6: goto L_0x0084;
                case 7: goto L_0x039e;
                case 8: goto L_0x0415;
                case 9: goto L_0x042b;
                case 10: goto L_0x0493;
                case 11: goto L_0x04a7;
                case 12: goto L_0x04c8;
                case 13: goto L_0x04db;
                case 14: goto L_0x0605;
                case 15: goto L_0x07eb;
                case 16: goto L_0x07fb;
                case 17: goto L_0x00db;
                case 18: goto L_0x080b;
                case 19: goto L_0x085c;
                case 20: goto L_0x0872;
                case 21: goto L_0x08ab;
                case 22: goto L_0x08f1;
                case 23: goto L_0x092a;
                case 24: goto L_0x093c;
                case 25: goto L_0x094e;
                case 26: goto L_0x095a;
                case 27: goto L_0x0104;
                case 28: goto L_0x0984;
                case 29: goto L_0x0137;
                case 30: goto L_0x0a4a;
                case 31: goto L_0x0a69;
                case 32: goto L_0x0a87;
                case 33: goto L_0x0a93;
                case 34: goto L_0x0aa6;
                case 35: goto L_0x0b91;
                case 36: goto L_0x0c70;
                case 37: goto L_0x0cb2;
                case 38: goto L_0x01a7;
                case 39: goto L_0x0d06;
                case 40: goto L_0x0f4a;
                case 41: goto L_0x01f4;
                case 42: goto L_0x0f8a;
                case 43: goto L_0x0261;
                case 44: goto L_0x0fa3;
                case 45: goto L_0x02cc;
                case 46: goto L_0x0ff6;
                case 47: goto L_0x1041;
                case 48: goto L_0x105e;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r0 = r4.A00
            X.0xG r0 = (X.C18790xG) r0
            java.lang.Object r5 = r4.A01
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            java.lang.Object r3 = r4.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            X.0xF r0 = r0.A01
            java.util.HashMap r1 = r0.A00
            r1.size()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0028:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0311
            java.lang.Object r0 = r1.next()
            X.1uV r0 = (X.C40671uV) r0
            int r2 = r0.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 < r0) goto L_0x0028
            java.lang.String r1 = "backupencryption/received/error "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r5.run()
        L_0x004e:
            return
        L_0x004f:
            java.lang.Object r0 = r4.A00
            X.00o r0 = (X.C001300o) r0
            java.lang.Object r2 = r4.A01
            X.05f r2 = (X.C011005f) r2
            java.lang.Object r1 = r4.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            X.04q r0 = r0.getLifecycle()
            X.04p r0 = (X.C009604p) r0
            X.05f r0 = r0.A02
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x004e
            r1.run()
            return
        L_0x006d:
            java.lang.Object r5 = r4.A00
            X.10X r5 = (X.AnonymousClass10X) r5
            java.lang.Object r0 = r4.A01
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r6 = r4.A02
            java.util.List r6 = (java.util.List) r6
            r4 = 0
            X.1QZ r1 = r5.A0M     // Catch:{ IOException -> 0x10b1 }
            java.lang.String r0 = r1.A01(r0)     // Catch:{ IOException -> 0x10b1 }
            if (r0 == 0) goto L_0x004e
            goto L_0x107e
        L_0x0084:
            java.lang.Object r5 = r4.A00
            X.0tb r5 = (X.C16760tb) r5
            java.lang.Object r1 = r4.A01
            X.0tZ r1 = (X.C16740tZ) r1
            java.lang.Object r4 = r4.A02
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r1 instanceof X.C16730tY
            if (r0 == 0) goto L_0x00c5
            X.0tY r1 = (X.C16730tY) r1
            X.0ta r0 = r1.A02
            X.AnonymousClass00B.A06(r0)
            java.lang.String r2 = r0.A0G
            X.0t3 r0 = r5.A0Q
            long r0 = r0.A00()
            java.lang.String r3 = X.AnonymousClass47Q.A00(r2, r0)
            java.util.Iterator r2 = r4.iterator()
        L_0x00ab:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r1 = r2.next()
            X.0tZ r1 = (X.C16740tZ) r1
            boolean r0 = r1 instanceof X.C16730tY
            if (r0 == 0) goto L_0x00ab
            X.0tY r1 = (X.C16730tY) r1
            X.0ta r0 = r1.A02
            X.AnonymousClass00B.A06(r0)
            r0.A0G = r3
            goto L_0x00ab
        L_0x00c5:
            java.util.Iterator r2 = r4.iterator()
        L_0x00c9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r2.next()
            X.0tZ r1 = (X.C16740tZ) r1
            X.0t6 r0 = r5.A0e
            r0.A0W(r1)
            goto L_0x00c9
        L_0x00db:
            java.lang.Object r0 = r4.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r5 = r0.iterator()
        L_0x00e3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r3 = r5.next()
            X.5TC r3 = (X.AnonymousClass5TC) r3
            java.lang.Object r2 = r4.A00
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.Object r0 = r4.A02
            X.1qo r0 = (X.C38451qo) r0
            X.1qm r1 = r0.A04
            if (r2 != 0) goto L_0x00ff
            r1.ASn(r3)
            goto L_0x00e3
        L_0x00ff:
            r0 = 0
            r1.ASx(r2, r3, r0)
            goto L_0x00e3
        L_0x0104:
            java.lang.Object r5 = r4.A00
            X.28n r5 = (X.C454128n) r5
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r4.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x0112:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r3.next()
            X.1sW r1 = (X.C39461sW) r1
            X.15k r0 = r5.A04
            com.whatsapp.jid.GroupJid r2 = r1.A02
            r0.A02(r2)
            X.11H r1 = r5.A02
            r0 = 0
            r1.A03(r2, r0)
            X.0pt r2 = r5.A00
            r1 = 7
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r5, r1, r4)
            r2.A0K(r0)
            goto L_0x0112
        L_0x0137:
            java.lang.Object r1 = r4.A00
            X.0xU r1 = (X.C18930xU) r1
            java.lang.Object r3 = r4.A01
            X.1WG r3 = (X.AnonymousClass1WG) r3
            java.lang.Object r5 = r4.A02
            java.util.Locale r5 = (java.util.Locale) r5
            boolean r0 = r1.A0X()
            if (r0 == 0) goto L_0x004e
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r0 = "setting_locale"
            r4[r2] = r0
            java.lang.String r4 = X.AnonymousClass1WJ.A00(r4)
            X.0zv r2 = r3.A00
            X.1WJ r0 = r2.A05(r4)
            if (r0 != 0) goto L_0x0164
            X.1WJ r0 = r2.A06(r4)
            if (r0 == 0) goto L_0x004e
        L_0x0164:
            java.lang.String r2 = X.AnonymousClass1WH.A05(r5)
            X.1Wl r0 = r0.A02()
            X.AnonymousClass00B.A06(r0)
            X.1os r0 = r0.A0E
            if (r0 != 0) goto L_0x0175
            X.1os r0 = X.C37261os.A02
        L_0x0175:
            java.lang.String r0 = r0.A01
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x004e
            X.0sK r0 = r3.A00
            boolean r0 = r0.A0G()
            r0 = r0 ^ 1
            X.AnonymousClass00B.A0G(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r15 = X.AnonymousClass1WH.A05(r0)
            X.0t3 r0 = r3.A01
            long r16 = r0.A00()
            r14 = r13
            X.1WI r12 = new X.1WI
            r12.<init>(r13, r14, r15, r16)
            java.util.List r0 = java.util.Collections.singletonList(r12)
            r1.A0S(r0)
            r1.A0N()
            return
        L_0x01a7:
            java.lang.Object r2 = r4.A00
            X.2D3 r2 = (X.AnonymousClass2D3) r2
            java.lang.Object r3 = r4.A01
            X.0rv r3 = (X.C15830rv) r3
            java.lang.Object r4 = r4.A02
            X.1Vw r4 = (X.C28381Vw) r4
            java.lang.String r1 = "ChatMessageCounts/recordMessageSent jid:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.15I r2 = r2.A00
            r2.A06()
            X.0t6 r0 = r2.A0C
            X.0th r1 = r0.A0K
            X.0tZ r0 = r1.A03(r4)
            if (r0 == 0) goto L_0x01d8
            int r0 = r0.A04
            r6 = 1
            if (r0 > 0) goto L_0x01d9
        L_0x01d8:
            r6 = 0
        L_0x01d9:
            boolean r7 = X.AnonymousClass15I.A03(r2, r4)
            boolean r8 = X.AnonymousClass15I.A04(r2, r4)
            boolean r9 = X.AnonymousClass15I.A02(r2, r4)
            r5 = 1
            X.AnonymousClass15I.A01(r2, r3, r4, r5, r6, r7, r8, r9)
            X.0tZ r1 = r1.A03(r4)
            if (r1 == 0) goto L_0x004e
            X.0z4 r2 = r2.A0T
            monitor-enter(r2)
            goto L_0x10ba
        L_0x01f4:
            java.lang.Object r3 = r4.A00
            X.2D3 r3 = (X.AnonymousClass2D3) r3
            java.lang.Object r2 = r4.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r4.A02
            X.1Vw r6 = (X.C28381Vw) r6
            java.lang.String r1 = "ChatMessageCounts/recordMessageSent jids:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.15I r4 = r3.A00
            r4.A06()
            X.0rv r0 = r6.A00
            boolean r0 = X.C16030sJ.A0H(r0)
            if (r0 == 0) goto L_0x025f
            X.0t6 r0 = r4.A0C
            X.0th r0 = r0.A0K
            X.0tZ r3 = r0.A03(r6)
        L_0x0226:
            java.util.Iterator r2 = r2.iterator()
        L_0x022a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r5 = r2.next()
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x024f
            java.util.Map r1 = r3.A0s
            if (r1 == 0) goto L_0x024f
            com.whatsapp.jid.DeviceJid r0 = r5.getPrimaryDevice()
            java.lang.Object r0 = r1.get(r0)
            X.1WV r0 = (X.AnonymousClass1WV) r0
            if (r0 == 0) goto L_0x024f
            int r0 = r0.expiration
            if (r0 <= 0) goto L_0x024f
            r8 = 1
        L_0x024f:
            boolean r9 = X.AnonymousClass15I.A03(r4, r6)
            boolean r10 = X.AnonymousClass15I.A04(r4, r6)
            boolean r11 = X.AnonymousClass15I.A02(r4, r6)
            X.AnonymousClass15I.A01(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x022a
        L_0x025f:
            r3 = 0
            goto L_0x0226
        L_0x0261:
            java.lang.Object r8 = r4.A00
            X.1bd r8 = (X.C30031bd) r8
            java.lang.Object r0 = r4.A01
            X.0pL r0 = (X.C14530pL) r0
            java.lang.Object r4 = r4.A02
            X.0tZ r4 = (X.C16740tZ) r4
            X.1yP r0 = (X.AnonymousClass1yP) r0
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            X.1yj r3 = r0.A00
            java.util.Stack r7 = r3.A5J
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0292
            java.lang.Object r0 = r7.peek()
            X.4KS r0 = (X.AnonymousClass4KS) r0
            X.0tZ r0 = r0.A01
            long r5 = r0.A13
            X.0tZ r0 = r8.getFMessage()
            long r1 = r0.A13
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0292
            r7.clear()
        L_0x0292:
            X.0tZ r2 = r8.getFMessage()
            int r1 = r8.getTop()
            X.4KS r0 = new X.4KS
            r0.<init>(r4, r2, r1)
            r7.push(r0)
            X.1yV r0 = r3.A22
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165815(0x7f070277, float:1.7945858E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.A0i(r4, r0)
            boolean r0 = r4 instanceof X.C38641rB
            if (r0 == 0) goto L_0x004e
            boolean r0 = X.C89674ci.A00
            if (r0 == 0) goto L_0x004e
            com.obwhatsapp.conversation.ConversationListView r1 = r3.A1n
            X.1Vw r0 = r4.A11
            X.1bb r1 = r1.A00(r0)
            boolean r0 = r1 instanceof X.AnonymousClass5QU
            if (r0 == 0) goto L_0x004e
            X.5QU r1 = (X.AnonymousClass5QU) r1
            r1.Ag4()
            return
        L_0x02cc:
            java.lang.Object r3 = r4.A00
            X.2KS r3 = (X.AnonymousClass2KS) r3
            java.lang.Object r0 = r4.A01
            X.0pS r0 = (X.C14600pS) r0
            java.lang.Object r2 = r4.A02
            X.2KT r2 = (X.AnonymousClass2KT) r2
            r0.Ac1()
            X.2KU r1 = r3.A00
            if (r1 == 0) goto L_0x02e9
            r1.A01 = r13
            r1.A00 = r13
            r0 = 1
            r1.A06(r0)
            r3.A00 = r13
        L_0x02e9:
            X.1yj r4 = r2.A00
            X.1yV r0 = r4.A22
            X.0pP r0 = (X.C14570pP) r0
            X.0sq r3 = r0.A05
            X.0rv r0 = r4.A33
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r0)
            if (r2 == 0) goto L_0x0303
            r1 = 26
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r4, r1, r2)
            r3.Acl(r0)
        L_0x0303:
            X.1ZQ r1 = r4.A4A
            if (r1 == 0) goto L_0x004e
            boolean r0 = r1.ACn()
            if (r0 == 0) goto L_0x004e
            r1.A6N()
            return
        L_0x0311:
            r3.run()
            return
        L_0x0315:
            java.lang.Object r0 = r4.A00
            X.1bz r0 = (X.C30231bz) r0
            java.lang.Object r3 = r4.A01
            X.1c0 r3 = (X.C30241c0) r3
            java.lang.Object r2 = r4.A02
            X.1c2 r2 = (X.C30261c2) r2
            int r1 = r0.A00
            X.1c3 r0 = r0.A01
            r3.AQ7(r2, r0, r1)
            return
        L_0x0329:
            java.lang.Object r0 = r4.A00
            X.0oe r0 = (X.C14120oe) r0
            java.lang.Object r1 = r4.A01
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r2 = r4.A02
            X.0p3 r2 = (X.C14370p3) r2
            X.0p1 r0 = r0.A02     // Catch:{ IOException -> 0x033f }
            android.os.Bundle r0 = r0.A01(r1)     // Catch:{ IOException -> 0x033f }
            r2.A01(r0)     // Catch:{ IOException -> 0x033f }
            return
        L_0x033f:
            r1 = move-exception
            X.0on r0 = r2.A00
            r0.A07(r1)
            return
        L_0x0346:
            java.lang.Object r0 = r4.A00
            X.0yD r0 = (X.C19300yD) r0
            java.lang.Object r2 = r4.A01
            X.1ZX r2 = (X.AnonymousClass1ZX) r2
            java.lang.Object r1 = r4.A02
            X.1ZT r1 = (X.AnonymousClass1ZT) r1
            X.0vJ r0 = r0.A0O
            r0.A03(r2, r1)
            return
        L_0x0358:
            java.lang.Object r5 = r4.A00
            X.0w1 r5 = (X.C18020w1) r5
            java.lang.Object r0 = r4.A01
            X.2QJ r0 = (X.AnonymousClass2QJ) r0
            java.lang.Object r4 = r4.A02
            X.2eG r4 = (X.C52672eG) r4
            com.whatsapp.jid.Jid r1 = r0.A04
            boolean r0 = r1 instanceof X.C16060sN
            if (r0 == 0) goto L_0x0398
            X.0sN r1 = (X.C16060sN) r1
            X.0sO r0 = r5.A07
            int r3 = r0.A01(r1)
            java.util.Set r0 = r0.A02(r1)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0386
            int r0 = X.C18020w1.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
        L_0x0386:
            X.0pd r2 = r5.A0B
            r1 = 1861(0x745, float:2.608E-42)
            X.0tM r0 = X.C16620tM.A02
            int r1 = r2.A03(r0, r1)
            X.0t9 r0 = r5.A0C
            if (r3 < r1) goto L_0x039a
            r0.A05(r4)
            return
        L_0x0398:
            r3 = 0
            goto L_0x0386
        L_0x039a:
            r0.A06(r4)
            return
        L_0x039e:
            java.lang.Object r1 = r4.A00
            X.0tb r1 = (X.C16760tb) r1
            java.lang.Object r0 = r4.A01
            X.0tZ r0 = (X.C16740tZ) r0
            java.lang.Object r2 = r4.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.0tY r0 = (X.C16730tY) r0
            java.lang.String r14 = r0.A04
            X.AnonymousClass00B.A06(r14)
            X.1QV r12 = r1.A17
            byte r4 = r0.A10
            int r3 = r0.A08
            X.1XK r3 = X.C31831f6.A01(r4, r3)
            java.lang.String r15 = r3.A02
            r18 = 0
            X.AnonymousClass00B.A06(r14)
            X.AnonymousClass00B.A06(r15)
            r17 = r13
            r19 = 0
            X.2A0 r11 = new X.2A0
            r16 = r13
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            X.0xf r14 = r1.A1Q
            r14.A08()
            int r3 = r0.A08
            X.1XK r3 = X.C31831f6.A01(r4, r3)
            java.lang.String r15 = r3.A02
            X.1qJ r10 = r14.A05(r15, r16, r17, r18, r19)
            X.1QW r3 = r1.A1B
            java.lang.String r12 = r0.A04
            X.1AO r9 = r3.A03
            X.0vT r8 = r3.A02
            X.0vU r6 = r3.A00
            X.0zs r7 = r3.A01
            X.38x r5 = new X.38x
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.4Wb r3 = r5.A00()
            X.41s r4 = r3.A02
            X.41s r3 = X.C798841s.COMPLETE
            if (r4 != r3) goto L_0x0406
            r4 = 6
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r3.<init>(r1, r0, r2, r4)
            r1.A0Q(r0, r3, r2, r13)
            return
        L_0x0406:
            X.0pt r4 = r1.A03
            r3 = 2131889466(0x7f120d3a, float:1.9413596E38)
            r2 = 1
            r4.A07(r3, r2)
            X.124 r1 = r1.A1F
            r1.A03(r0)
            return
        L_0x0415:
            java.lang.Object r3 = r4.A00
            X.0tb r3 = (X.C16760tb) r3
            java.lang.Object r0 = r4.A01
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r2 = r4.A02
            byte[] r2 = (byte[]) r2
            X.1zg r1 = new X.1zg
            r1.<init>(r0)
            r0 = 0
            r3.A07(r1, r2, r0, r0)
            return
        L_0x042b:
            java.lang.Object r2 = r4.A00
            X.0tZ r2 = (X.C16740tZ) r2
            java.lang.Object r1 = r4.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r7 = r4.A02
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            X.AnonymousClass00B.A01()
            X.0tm r6 = r2.A0F()
            boolean r0 = r2 instanceof X.C16730tY
            if (r0 == 0) goto L_0x048a
            X.0tY r2 = (X.C16730tY) r2
            X.1y4 r5 = r2.A12()
        L_0x0448:
            java.util.Iterator r4 = r1.iterator()
        L_0x044c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x048f
            java.lang.Object r2 = r4.next()
            X.0tZ r2 = (X.C16740tZ) r2
            if (r6 == 0) goto L_0x046e
            X.0tm r1 = r2.A0F()
            X.AnonymousClass00B.A06(r1)
            boolean r0 = r1.A05()
            if (r0 != 0) goto L_0x046e
            byte[] r0 = r6.A07()
            r1.A02(r0)
        L_0x046e:
            if (r5 == 0) goto L_0x044c
            X.0tY r2 = (X.C16730tY) r2
            X.1y4 r3 = r2.A12()
            if (r3 == 0) goto L_0x044c
            byte[] r2 = r5.A05()
            int[] r1 = r5.A06()
            monitor-enter(r3)
            boolean r0 = r3.A00     // Catch:{ all -> 0x048c }
            if (r0 != 0) goto L_0x0488
            r3.A02(r2, r1)     // Catch:{ all -> 0x048c }
        L_0x0488:
            monitor-exit(r3)
            goto L_0x044c
        L_0x048a:
            r5 = 0
            goto L_0x0448
        L_0x048c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x048f:
            r7.run()
            return
        L_0x0493:
            java.lang.Object r6 = r4.A00
            X.0tb r6 = (X.C16760tb) r6
            java.lang.Object r5 = r4.A01
            X.1wN r5 = (X.C41681wN) r5
            java.lang.Object r3 = r4.A02
            X.0tZ r3 = (X.C16740tZ) r3
            X.1cv r0 = r5.A03
            if (r0 == 0) goto L_0x04b3
            r3.A0h(r0)
            goto L_0x04b3
        L_0x04a7:
            java.lang.Object r6 = r4.A00
            X.0tb r6 = (X.C16760tb) r6
            java.lang.Object r5 = r4.A01
            X.1wN r5 = (X.C41681wN) r5
            java.lang.Object r3 = r4.A02
            X.0tZ r3 = (X.C16740tZ) r3
        L_0x04b3:
            X.21F r2 = r5.A02
            if (r2 == 0) goto L_0x04c4
            X.0tZ r0 = r2.A00
            if (r0 != r3) goto L_0x04c4
            X.027 r1 = r5.A0D
            X.1XQ r0 = r2.A01
            r1.A09(r0)
            r5.A02 = r13
        L_0x04c4:
            r6.A0N(r3)
            return
        L_0x04c8:
            java.lang.Object r2 = r4.A00
            android.os.ConditionVariable r2 = (android.os.ConditionVariable) r2
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r4.A02
            android.content.Intent r0 = (android.content.Intent) r0
            r2.block()
            X.C446524y.A00(r1, r0)
            return
        L_0x04db:
            java.lang.Object r11 = r4.A00
            com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r11 = (com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r11
            java.lang.Object r0 = r4.A01
            X.3hl r0 = (X.C70803hl) r0
            java.lang.Object r2 = r4.A02
            X.3ho r2 = (X.C70833ho) r2
            r3 = 0
            long r7 = java.lang.System.currentTimeMillis()
            android.graphics.Bitmap r6 = r0.A01     // Catch:{ all -> 0x05ba }
            int r1 = r6.getWidth()     // Catch:{ all -> 0x05ba }
            int r0 = r6.getHeight()     // Catch:{ all -> 0x05ba }
            if (r1 == r0) goto L_0x051e
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap not squared (w="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05ba }
            r1.<init>(r0)     // Catch:{ all -> 0x05ba }
            int r0 = r6.getWidth()     // Catch:{ all -> 0x05ba }
            r1.append(r0)     // Catch:{ all -> 0x05ba }
            java.lang.String r0 = ", h="
            r1.append(r0)     // Catch:{ all -> 0x05ba }
            int r0 = r6.getHeight()     // Catch:{ all -> 0x05ba }
            r1.append(r0)     // Catch:{ all -> 0x05ba }
            r0 = 41
            r1.append(r0)     // Catch:{ all -> 0x05ba }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05ba }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05ba }
        L_0x051e:
            int r5 = r2.A00     // Catch:{ all -> 0x05ba }
            int r2 = r6.getWidth()     // Catch:{ all -> 0x05ba }
            int r1 = r6.getHeight()     // Catch:{ all -> 0x05ba }
            android.graphics.Bitmap$Config r0 = r6.getConfig()     // Catch:{ all -> 0x05ba }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ all -> 0x05ba }
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch:{ all -> 0x05ba }
            r1.<init>(r4)     // Catch:{ all -> 0x05ba }
            r1.drawColor(r5)     // Catch:{ all -> 0x05ba }
            r0 = 0
            r1.drawBitmap(r6, r0, r0, r13)     // Catch:{ all -> 0x05ba }
            int r0 = r4.getWidth()     // Catch:{ all -> 0x05ba }
            r2 = 196(0xc4, float:2.75E-43)
            if (r0 >= r2) goto L_0x059c
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap width too low ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05ba }
            r1.<init>(r0)     // Catch:{ all -> 0x05ba }
            int r0 = r4.getWidth()     // Catch:{ all -> 0x05ba }
            r1.append(r0)     // Catch:{ all -> 0x05ba }
            java.lang.String r0 = "), will be scaled up."
            r1.append(r0)     // Catch:{ all -> 0x05ba }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05ba }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05ba }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x05ba }
        L_0x0562:
            int r0 = r4.getWidth()     // Catch:{ all -> 0x05ba }
            r2 = 640(0x280, float:8.97E-43)
            if (r0 <= r2) goto L_0x0599
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap width too high ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05ba }
            r1.<init>(r0)     // Catch:{ all -> 0x05ba }
            int r0 = r4.getWidth()     // Catch:{ all -> 0x05ba }
            r1.append(r0)     // Catch:{ all -> 0x05ba }
            java.lang.String r0 = "), will be scaled down."
            r1.append(r0)     // Catch:{ all -> 0x05ba }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05ba }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05ba }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x05ba }
        L_0x0588:
            int r0 = r1.intValue()     // Catch:{ all -> 0x05ba }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r0, r0, r3)     // Catch:{ all -> 0x05ba }
        L_0x0590:
            X.C18450wi.A0E(r4)     // Catch:{ all -> 0x05ba }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x05ba }
            r2.<init>()     // Catch:{ all -> 0x05ba }
            goto L_0x059e
        L_0x0599:
            if (r1 == 0) goto L_0x0590
            goto L_0x0588
        L_0x059c:
            r1 = 0
            goto L_0x0562
        L_0x059e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x05b3 }
            r0 = 100
            r4.compress(r1, r0, r2)     // Catch:{ all -> 0x05b3 }
            r2.close()     // Catch:{ all -> 0x05ba }
            r4.recycle()     // Catch:{ all -> 0x05ba }
            byte[] r12 = r2.toByteArray()     // Catch:{ all -> 0x05ba }
            X.C18450wi.A0B(r12)     // Catch:{ all -> 0x05ba }
            goto L_0x05c0
        L_0x05b3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05b5 }
        L_0x05b5:
            r0 = move-exception
            X.C41191vO.A00(r2, r1)     // Catch:{ all -> 0x05ba }
            throw r0     // Catch:{ all -> 0x05ba }
        L_0x05ba:
            r0 = move-exception
            X.1vQ r12 = new X.1vQ
            r12.<init>(r0)
        L_0x05c0:
            java.lang.Throwable r1 = X.C41201vP.A00(r12)
            if (r1 != 0) goto L_0x05f4
            X.0sK r0 = r11.A03
            r0.A0B()
            X.1Zb r13 = r0.A01
            X.1c6 r10 = new X.1c6
            r10.<init>()
            if (r13 == 0) goto L_0x05df
            X.0pt r0 = r11.A02
            r14 = 7
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r9 = new com.facebook.redex.RunnableRunnableShape0S0400000_I0
            r9.<init>(r10, r11, r12, r13, r14)
            r0.A0K(r9)
        L_0x05df:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x05ee
            long r1 = r1 - r3
            java.lang.Thread.sleep(r1)
        L_0x05ee:
            boolean r0 = r10.element
            r11.A05(r0)
            return
        L_0x05f4:
            java.lang.String r0 = "AvatarProfilePhotoViewModel/unable to compose profile photo"
            com.whatsapp.util.Log.e(r0, r1)
            r11.A05(r3)
            X.0pt r1 = r11.A02
            r0 = 2131888200(0x7f120848, float:1.9411029E38)
            r1.A0A(r0, r3)
            return
        L_0x0605:
            java.lang.Object r5 = r4.A00
            X.1Ql r5 = (X.C27101Ql) r5
            java.lang.Object r1 = r4.A01
            X.1pi r1 = (X.C37771pi) r1
            java.lang.Object r6 = r4.A02
            X.22J r6 = (X.AnonymousClass22J) r6
            X.0rz r0 = r5.A04
            r3 = 1
            android.content.SharedPreferences$Editor r2 = r0.A0K()
            java.lang.String r0 = "sticker_store_onboarding_badge_shown"
            android.content.SharedPreferences$Editor r0 = r2.putBoolean(r0, r3)
            r0.apply()
            X.1Qk r5 = r5.A03
            java.util.List r0 = r1.A04
            r0.size()
            X.13k r3 = r5.A02
            java.util.List r10 = r1.A04
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Map r0 = r3.A04()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x0643:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x065f
            java.lang.Object r8 = r9.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r0 = r8.getKey()
            X.1z2 r0 = (X.AnonymousClass1z2) r0
            java.lang.String r7 = r0.A01
            java.lang.Object r0 = r8.getValue()
            r2.put(r7, r0)
            goto L_0x0643
        L_0x065f:
            java.util.Iterator r8 = r10.iterator()
        L_0x0663:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0681
            java.lang.Object r7 = r8.next()
            X.1jm r7 = (X.C34151jm) r7
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x067b
            java.lang.String r0 = r7.A05
            if (r0 == 0) goto L_0x067b
            r4.put(r0, r7)
            goto L_0x0663
        L_0x067b:
            java.lang.String r0 = "RecentStickers/sticker is not avatar or with null template id, skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0663
        L_0x0681:
            java.util.List r0 = r3.A02()
            java.util.Iterator r9 = r0.iterator()
        L_0x0689:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x06e2
            java.lang.Object r0 = r9.next()
            X.1z2 r0 = (X.AnonymousClass1z2) r0
            java.lang.String r14 = r0.A01
            if (r14 == 0) goto L_0x0689
            r3.A06(r0)
            java.lang.Object r11 = r4.get(r14)
            X.1jm r11 = (X.C34151jm) r11
            if (r11 == 0) goto L_0x0689
            java.lang.String r12 = r11.A0D
            java.lang.String r13 = r11.A0A
            long r15 = r0.A00
            X.1z2 r10 = new X.1z2
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.Object r0 = r2.get(r14)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x06bd
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x06bd:
            float r0 = r0.floatValue()
            X.1z3 r8 = new X.1z3
            r8.<init>(r10, r0)
            r3.A05()
            monitor-enter(r3)
            java.util.List r0 = r3.A03     // Catch:{ all -> 0x06df }
            r0.add(r8)     // Catch:{ all -> 0x06df }
            X.11c r7 = r3.A00     // Catch:{ all -> 0x06df }
            java.util.List r0 = r3.A03     // Catch:{ all -> 0x06df }
            r7.AaZ(r0)     // Catch:{ all -> 0x06df }
            monitor-exit(r3)     // Catch:{ all -> 0x06df }
            X.1z2 r0 = r8.A01
            X.1jm r0 = r0.A04
            r3.A0B(r0)
            goto L_0x0689
        L_0x06df:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x06df }
            throw r0
        L_0x06e2:
            X.0pt r13 = r5.A00
            r2 = 42
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r0.<init>(r5, r2)
            r13.A0K(r0)
            X.13y r12 = r5.A01
            java.lang.String r0 = "migrate_stickers_recents_done"
            r12.A01(r0)
            java.util.List r0 = r1.A04
            r0.size()
            X.1Go r11 = r5.A04
            java.util.List r0 = r1.A04
            java.util.Iterator r16 = r0.iterator()
        L_0x0702:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x07ce
            java.lang.Object r10 = r16.next()
            X.1jm r10 = (X.C34151jm) r10
            java.lang.String r0 = r10.A05
            if (r0 != 0) goto L_0x0718
            java.lang.String r0 = "StarredStickers/updateStarredStickerByAvatarTemplateId/sticker has no avatar template id, aborting"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0702
        L_0x0718:
            X.1Qj r9 = r11.A04
            X.1pc r8 = r9.A01(r0)
            if (r8 == 0) goto L_0x0702
            java.lang.String r7 = r10.A05
            java.lang.String r4 = r10.A0D
            java.lang.String r3 = r10.A0G
            java.lang.String r2 = r10.A06
            java.lang.String r1 = r10.A0C
            int r0 = r10.A00
            r21 = r0
            int r0 = r10.A03
            r20 = r0
            int r0 = r10.A02
            r19 = r0
            java.lang.String r14 = r10.A07
            boolean r0 = r10.A0I
            r18 = r0
            boolean r0 = r10.A0H
            r17 = r0
            android.content.ContentValues r15 = new android.content.ContentValues
            r15.<init>()
            java.lang.String r0 = "plaintext_hash"
            r15.put(r0, r4)
            java.lang.String r0 = "url"
            r15.put(r0, r3)
            java.lang.String r0 = "direct_path"
            r15.put(r0, r2)
            java.lang.String r0 = "mimetype"
            r15.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            java.lang.String r0 = "file_size"
            r15.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.String r0 = "width"
            r15.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.String r0 = "height"
            r15.put(r0, r1)
            java.lang.String r0 = "emojis"
            r15.put(r0, r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r18)
            java.lang.String r0 = "is_first_party"
            r15.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "is_avatar"
            r15.put(r0, r1)
            r14 = 0
            X.12j r0 = r9.A01     // Catch:{ Exception -> 0x07c5 }
            X.0tf r4 = r0.A02()     // Catch:{ Exception -> 0x07c5 }
            X.0tg r9 = r4.A02     // Catch:{ all -> 0x07c0 }
            java.lang.String r3 = "starred_stickers"
            java.lang.String r2 = "avatar_template_id = ?"
            r1 = 1
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ all -> 0x07c0 }
            r0[r14] = r7     // Catch:{ all -> 0x07c0 }
            int r0 = r9.A00(r3, r15, r2, r0)     // Catch:{ all -> 0x07c0 }
            if (r0 > 0) goto L_0x07a7
            r1 = 0
        L_0x07a7:
            r4.close()     // Catch:{ Exception -> 0x07c5 }
            if (r1 == 0) goto L_0x0702
            X.1pf r2 = r11.A01
            java.lang.String r1 = r8.A0B
            java.lang.String r0 = r2.A00(r1)
            r2.A02(r1, r0)
            java.lang.String r1 = r10.A0D
            java.lang.String r0 = r10.A0A
            r2.A01(r1, r0)
            goto L_0x0702
        L_0x07c0:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x07c4 }
        L_0x07c4:
            throw r0     // Catch:{ Exception -> 0x07c5 }
        L_0x07c5:
            r1 = move-exception
            java.lang.String r0 = "updateStickerAttrsByAvatarTemplateId/unable to update sticker"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0702
        L_0x07ce:
            r11.A01()
            r1 = 43
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r0.<init>(r5, r1)
            r13.A0K(r0)
            java.lang.String r0 = "migrate_stickers_favorites_done"
            r12.A01(r0)
            X.42P r0 = X.AnonymousClass42P.SUCCESS
            r12.A00(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.AIU(r0)
            return
        L_0x07eb:
            java.lang.Object r2 = r4.A00
            X.2YL r2 = (X.AnonymousClass2YL) r2
            java.lang.Object r1 = r4.A01
            android.accounts.AccountManagerFuture r1 = (android.accounts.AccountManagerFuture) r1
            java.lang.Object r0 = r4.A02
            com.obwhatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment r0 = (com.obwhatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment) r0
            X.AnonymousClass2YL.A02(r1, r0, r2)
            return
        L_0x07fb:
            java.lang.Object r2 = r4.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r2 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r2
            java.lang.Object r1 = r4.A01
            android.accounts.AccountManagerFuture r1 = (android.accounts.AccountManagerFuture) r1
            java.lang.Object r0 = r4.A02
            com.obwhatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment r0 = (com.obwhatsapp.backup.google.SettingsGoogleDrive.AuthRequestDialogFragment) r0
            com.obwhatsapp.backup.google.SettingsGoogleDrive.A02(r1, r0, r2)
            return
        L_0x080b:
            java.lang.Object r2 = r4.A00
            X.16E r2 = (X.AnonymousClass16E) r2
            java.lang.Object r1 = r4.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r3 = r4.A02
            X.236 r3 = (X.AnonymousClass236) r3
            X.16B r0 = r2.A01
            java.lang.String r10 = r1.getRawString()
            X.C18450wi.A0B(r10)
            X.0un r0 = r0.A00
            X.0sX r4 = r0.A01
            X.01J r0 = r4.A05
            java.lang.Object r7 = r0.get()
            X.0pd r7 = (X.C14710pd) r7
            X.01J r0 = r4.AN9
            java.lang.Object r5 = r0.get()
            X.0ua r5 = (X.C17130ua) r5
            X.01J r0 = r4.AQh
            java.lang.Object r6 = r0.get()
            X.0rz r6 = (X.C15860rz) r6
            X.01J r0 = r4.AQV
            X.01D r9 = X.C17270uo.A00(r0)
            X.01J r11 = r4.A8M
            X.01J r12 = r4.A8N
            X.01J r0 = r4.AAi
            java.lang.Object r8 = r0.get()
            X.168 r8 = (X.AnonymousClass168) r8
            X.3tr r4 = new X.3tr
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.3Fn r0 = new X.3Fn
            r0.<init>(r3, r2, r1)
            r4.Aah(r0)
            return
        L_0x085c:
            java.lang.Object r0 = r4.A00
            X.1KX r0 = (X.AnonymousClass1KX) r0
            java.lang.Object r2 = r4.A01
            X.1WD r2 = (X.AnonymousClass1WD) r2
            java.lang.Object r1 = r4.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.0sb r0 = r0.A00
            X.01Q r0 = X.AnonymousClass3F0.A00(r1, r0)
            r2.A02(r0)
            return
        L_0x0872:
            java.lang.Object r6 = r4.A00
            X.26W r6 = (X.AnonymousClass26W) r6
            java.lang.Object r5 = r4.A01
            X.26j r5 = (X.C449526j) r5
            java.lang.Object r3 = r4.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.2RQ r1 = r6.A03
            com.whatsapp.jid.UserJid r0 = r5.A00
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x08a7
            X.0rz r0 = r6.A05
            java.lang.String r2 = "252"
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "latest_biz_backend_request_id"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
            X.0uc r0 = r6.A01
            X.4vN r2 = new X.4vN
            r2.<init>(r5, r6)
            r1 = 1
            X.16N r0 = r0.A07
            r0.A02(r2, r3, r1)
            return
        L_0x08a7:
            r6.A02(r5)
            return
        L_0x08ab:
            java.lang.Object r6 = r4.A00
            X.1U2 r6 = (X.AnonymousClass1U2) r6
            java.lang.Object r5 = r4.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r4 = r4.A02
            X.1ci r4 = (X.C30641ci) r4
            X.0uP r0 = r6.A0B
            X.1Vq r3 = r0.A00(r5)
            r0.A01(r5)
            X.0uc r0 = r6.A04
            X.235 r0 = r0.A0A
            r0.A02(r5)
            if (r3 == 0) goto L_0x08eb
            X.0t6 r2 = r6.A0G
            X.1Vr r1 = new X.1Vr
            r1.<init>()
            int r0 = r3.A03
            r1.A03 = r0
            java.lang.String r0 = r3.A08
            r1.A07 = r0
            X.1ta r0 = r3.A00()
            r1.A05 = r0
            int r0 = X.C32441gM.A00(r3)
            r1.A02 = r0
            X.1Vs r0 = r1.A01()
            r2.A0R(r5, r0)
        L_0x08eb:
            X.124 r0 = r6.A0J
            r0.A02(r4)
            return
        L_0x08f1:
            java.lang.Object r5 = r4.A00
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r4.A02
            X.5Re r3 = (X.C109225Re) r3
            r2 = 3
            if (r1 == 0) goto L_0x0921
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0921
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            android.location.Address r1 = (android.location.Address) r1
            r0 = 1092616192(0x41200000, float:10.0)
            java.lang.String r1 = X.AnonymousClass463.A00(r5, r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x091d
            r3.ARj(r1)
            return
        L_0x091d:
            r3.ARi(r2)
            return
        L_0x0921:
            r3.ARi(r2)
            java.lang.String r0 = "DirectorySetLocationMapActivity/resolveLocation geocoded address is not available"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x092a:
            java.lang.Object r0 = r4.A00
            X.25g r0 = (X.C447225g) r0
            java.lang.Object r2 = r4.A01
            X.1Yb r2 = (X.C28861Yb) r2
            java.lang.Object r1 = r4.A02
            X.1Vw r1 = (X.C28381Vw) r1
            X.11s r0 = r0.A2I
            r0.A0W(r2, r1)
            return
        L_0x093c:
            java.lang.Object r0 = r4.A00
            X.2Qp r0 = (X.C49062Qp) r0
            java.lang.Object r2 = r4.A01
            X.2VC r2 = (X.AnonymousClass2VC) r2
            java.lang.Object r1 = r4.A02
            byte[] r1 = (byte[]) r1
            boolean r0 = r0.A0N
            r2.A01(r1, r0)
            return
        L_0x094e:
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r4.A01
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            r1.dispatchTouchEvent(r0)
            return
        L_0x095a:
            java.lang.Object r6 = r4.A00
            X.28n r6 = (X.C454128n) r6
            java.lang.Object r5 = r4.A01
            X.1sW r5 = (X.C39461sW) r5
            java.lang.Object r3 = r4.A02
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            X.11H r2 = r6.A02
            com.whatsapp.jid.GroupJid r1 = r5.A02
            int r0 = r5.A00
            r2.A03(r1, r0)
            X.15k r1 = r6.A04
            java.util.List r0 = java.util.Collections.singletonList(r5)
            r1.A04(r3, r0)
            X.0pt r2 = r6.A00
            r1 = 6
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r6, r1, r3)
            r2.A0K(r0)
            return
        L_0x0984:
            java.lang.Object r2 = r4.A00
            X.2AS r2 = (X.AnonymousClass2AS) r2
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r9 = r4.A02
            com.whatsapp.jid.Jid r9 = (com.whatsapp.jid.Jid) r9
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0999:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x09af
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            com.whatsapp.jid.GroupJid r0 = com.whatsapp.jid.GroupJid.getNullable(r0)
            if (r0 == 0) goto L_0x0999
            r11.add(r0)
            goto L_0x0999
        L_0x09af:
            X.0so r6 = r2.A0F
            X.0ug r14 = r2.A0k
            X.4z4 r5 = new X.4z4
            r5.<init>(r2)
            java.lang.String r4 = r14.A02()
            int r10 = r11.size()
            X.1Vv[] r8 = new X.C28371Vv[r10]
            r12 = 0
            r7 = 0
        L_0x09c4:
            r3 = 1
            if (r7 >= r10) goto L_0x09e4
            X.1lL[] r3 = new X.C35081lL[r3]
            java.lang.Object r2 = r11.get(r7)
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            java.lang.String r1 = "jid"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r3[r12] = r0
            java.lang.String r1 = "group"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r3)
            r8[r7] = r0
            int r7 = r7 + 1
            goto L_0x09c4
        L_0x09e4:
            X.1lL[] r7 = new X.C35081lL[r3]
            java.lang.String r2 = "link_type"
            java.lang.String r1 = "sub_group"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r7[r12] = r0
            java.lang.String r0 = "link"
            X.1Vv r1 = new X.1Vv
            r1.<init>((java.lang.String) r0, (X.C35081lL[]) r7, (X.C28371Vv[]) r8)
            java.lang.String r0 = "links"
            X.1Vv r7 = new X.1Vv
            r7.<init>((X.C28371Vv) r1, (java.lang.String) r0, (X.C35081lL[]) r13)
            r0 = 4
            X.1lL[] r8 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r4)
            r8[r12] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "w:g2"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r8[r3] = r0
            r3 = 2
            java.lang.String r2 = "type"
            java.lang.String r1 = "set"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r8[r3] = r0
            r2 = 3
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r9, (java.lang.String) r1)
            r8[r2] = r0
            java.lang.String r1 = "iq"
            X.1Vv r0 = new X.1Vv
            r0.<init>((X.C28371Vv) r7, (java.lang.String) r1, (X.C35081lL[]) r8)
            X.3GP r15 = new X.3GP
            r15.<init>(r6, r5)
            r18 = 301(0x12d, float:4.22E-43)
            r19 = 32000(0x7d00, double:1.581E-319)
            r17 = r4
            r16 = r0
            r14.A0A(r15, r16, r17, r18, r19)
            return
        L_0x0a4a:
            java.lang.Object r1 = r4.A00
            X.1Hx r1 = (X.C24951Hx) r1
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            java.lang.Object r3 = r4.A02
            X.1cD r3 = (X.C30351cD) r3
            X.11s r2 = r1.A04
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()
            X.1Yb r1 = X.C28851Ya.A02(r0)
            X.1WL r0 = new X.1WL
            r0.<init>(r3)
            r2.A0R(r0, r1)
            return
        L_0x0a69:
            java.lang.Object r1 = r4.A00
            X.1CB r1 = (X.AnonymousClass1CB) r1
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            java.lang.Object r2 = r4.A02
            X.1WL r2 = (X.AnonymousClass1WL) r2
            X.11s r1 = r1.A0R
            com.whatsapp.jid.UserJid r0 = r0.getUserJid()
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()
            X.1Yb r0 = X.C28851Ya.A02(r0)
            r1.A0R(r2, r0)
            return
        L_0x0a87:
            java.lang.Object r1 = r4.A00
            X.0wP r1 = (X.C18260wP) r1
            java.lang.Object r0 = r4.A01
            X.1UX r0 = (X.AnonymousClass1UX) r0
            r1.A09(r0)
            return
        L_0x0a93:
            java.lang.Object r2 = r4.A00
            X.11A r2 = (X.AnonymousClass11A) r2
            java.lang.Object r1 = r4.A01
            X.0rv r1 = (X.C15830rv) r1
            java.lang.Object r0 = r4.A02
            X.18Z r0 = (X.AnonymousClass18Z) r0
            r2.A06(r1)
            r0.A01()
            return
        L_0x0aa6:
            java.lang.Object r2 = r4.A00
            X.15I r2 = (X.AnonymousClass15I) r2
            java.lang.Object r3 = r4.A01
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            java.lang.Object r1 = r4.A02
            X.1po r1 = (X.C37831po) r1
            r2.A06()
            X.1lE r0 = r1.A0C
            boolean r13 = r0.A03
            boolean r12 = r1.A0I
            int r1 = r1.A01
            monitor-enter(r2)
            android.content.SharedPreferences r5 = r2.A05()     // Catch:{ all -> 0x0b8e }
            java.lang.String r32 = r3.getRawString()     // Catch:{ all -> 0x0b8e }
            java.lang.String r3 = X.AnonymousClass2D9.A00(r32)     // Catch:{ all -> 0x0b8e }
            java.lang.String r0 = "0,0,0,0,0,0,0,0,0,0,0"
            java.lang.String r0 = r5.getString(r3, r0)     // Catch:{ all -> 0x0b8e }
            java.lang.String r6 = ","
            java.lang.String[] r3 = r0.split(r6)     // Catch:{ all -> 0x0b8e }
            r0 = 0
            long r30 = X.AnonymousClass2D6.A01(r3, r0)     // Catch:{ all -> 0x0b8e }
            r0 = 1
            long r28 = X.AnonymousClass2D6.A01(r3, r0)     // Catch:{ all -> 0x0b8e }
            r0 = 2
            long r26 = X.AnonymousClass2D6.A01(r3, r0)     // Catch:{ all -> 0x0b8e }
            r0 = 3
            long r24 = X.AnonymousClass2D6.A01(r3, r0)     // Catch:{ all -> 0x0b8e }
            r0 = 4
            long r22 = X.AnonymousClass2D6.A01(r3, r0)     // Catch:{ all -> 0x0b8e }
            r0 = 5
            long r20 = X.AnonymousClass2D6.A01(r3, r0)     // Catch:{ all -> 0x0b8e }
            r0 = 6
            long r18 = X.AnonymousClass2D6.A01(r3, r0)     // Catch:{ all -> 0x0b8e }
            r0 = 7
            long r16 = X.AnonymousClass2D6.A01(r3, r0)     // Catch:{ all -> 0x0b8e }
            r0 = 8
            long r14 = X.AnonymousClass2D6.A01(r3, r0)     // Catch:{ all -> 0x0b8e }
            r0 = 9
            long r10 = X.AnonymousClass2D6.A01(r3, r0)     // Catch:{ all -> 0x0b8e }
            r7 = 10
            long r8 = X.AnonymousClass2D6.A01(r3, r7)     // Catch:{ all -> 0x0b8e }
            long r3 = (long) r1     // Catch:{ all -> 0x0b8e }
            r0 = 1
            if (r13 == 0) goto L_0x0b1f
            long r30 = r30 + r0
            if (r12 == 0) goto L_0x0b1c
            long r24 = r24 + r0
            goto L_0x0b21
        L_0x0b1c:
            long r22 = r22 + r0
            goto L_0x0b21
        L_0x0b1f:
            long r28 = r28 + r0
        L_0x0b21:
            long r26 = r26 + r3
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x0b8e }
            java.lang.String r4 = X.AnonymousClass2D9.A00(r32)     // Catch:{ all -> 0x0b8e }
            r0 = 11
            java.lang.Long[] r3 = new java.lang.Long[r0]     // Catch:{ all -> 0x0b8e }
            java.lang.Long r1 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x0b8e }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x0b8e }
            java.lang.Long r1 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x0b8e }
            r0 = 1
            r3[r0] = r1     // Catch:{ all -> 0x0b8e }
            java.lang.Long r1 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x0b8e }
            r0 = 2
            r3[r0] = r1     // Catch:{ all -> 0x0b8e }
            java.lang.Long r1 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0b8e }
            r0 = 3
            r3[r0] = r1     // Catch:{ all -> 0x0b8e }
            java.lang.Long r1 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0b8e }
            r0 = 4
            r3[r0] = r1     // Catch:{ all -> 0x0b8e }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0b8e }
            r0 = 5
            r3[r0] = r1     // Catch:{ all -> 0x0b8e }
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0b8e }
            r0 = 6
            r3[r0] = r1     // Catch:{ all -> 0x0b8e }
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0b8e }
            r0 = 7
            r3[r0] = r1     // Catch:{ all -> 0x0b8e }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0b8e }
            r0 = 8
            r3[r0] = r1     // Catch:{ all -> 0x0b8e }
            java.lang.Long r1 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0b8e }
            r0 = 9
            r3[r0] = r1     // Catch:{ all -> 0x0b8e }
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0b8e }
            r3[r7] = r0     // Catch:{ all -> 0x0b8e }
            java.util.List r0 = java.util.Arrays.asList(r3)     // Catch:{ all -> 0x0b8e }
            java.lang.String r0 = android.text.TextUtils.join(r6, r0)     // Catch:{ all -> 0x0b8e }
            android.content.SharedPreferences$Editor r0 = r5.putString(r4, r0)     // Catch:{ all -> 0x0b8e }
            r0.apply()     // Catch:{ all -> 0x0b8e }
            monitor-exit(r2)
            return
        L_0x0b8e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0b91:
            java.lang.Object r2 = r4.A00
            X.15I r2 = (X.AnonymousClass15I) r2
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r1 = r4.A02
            java.lang.Number r1 = (java.lang.Number) r1
            r2.A06()
            android.content.SharedPreferences r3 = r2.A05()
            java.lang.String r29 = r0.getRawString()
            java.lang.String r2 = X.AnonymousClass2D9.A00(r29)
            java.lang.String r0 = "0,0,0,0,0,0,0,0,0,0,0"
            java.lang.String r0 = r3.getString(r2, r0)
            java.lang.String r5 = ","
            java.lang.String[] r2 = r0.split(r5)
            r0 = 0
            long r27 = X.AnonymousClass2D6.A01(r2, r0)
            r0 = 1
            long r25 = X.AnonymousClass2D6.A01(r2, r0)
            r0 = 2
            long r23 = X.AnonymousClass2D6.A01(r2, r0)
            r0 = 3
            long r21 = X.AnonymousClass2D6.A01(r2, r0)
            r0 = 4
            long r19 = X.AnonymousClass2D6.A01(r2, r0)
            r0 = 5
            long r17 = X.AnonymousClass2D6.A01(r2, r0)
            r0 = 6
            long r15 = X.AnonymousClass2D6.A01(r2, r0)
            r0 = 7
            long r13 = X.AnonymousClass2D6.A01(r2, r0)
            r0 = 8
            long r11 = X.AnonymousClass2D6.A01(r2, r0)
            r0 = 9
            long r9 = X.AnonymousClass2D6.A01(r2, r0)
            r6 = 10
            long r7 = X.AnonymousClass2D6.A01(r2, r6)
            int r2 = r1.intValue()
            r0 = 1
            switch(r2) {
                case 0: goto L_0x0c63;
                case 1: goto L_0x0c65;
                case 2: goto L_0x0c68;
                case 3: goto L_0x0c63;
                case 4: goto L_0x0c6a;
                case 5: goto L_0x0c6c;
                case 6: goto L_0x0c63;
                case 7: goto L_0x0c63;
                case 8: goto L_0x0c63;
                case 9: goto L_0x0c6a;
                case 10: goto L_0x0c63;
                case 11: goto L_0x0c6e;
                case 12: goto L_0x0c6e;
                case 13: goto L_0x0c6e;
                case 14: goto L_0x0c6e;
                case 15: goto L_0x0c63;
                case 16: goto L_0x0c63;
                case 17: goto L_0x0c63;
                case 18: goto L_0x0c6e;
                case 19: goto L_0x0c63;
                case 20: goto L_0x0c65;
                case 21: goto L_0x0c63;
                case 22: goto L_0x0c65;
                case 23: goto L_0x0c68;
                case 24: goto L_0x0bfb;
                case 25: goto L_0x0c63;
                default: goto L_0x0bfb;
            }
        L_0x0bfb:
            android.content.SharedPreferences$Editor r4 = r3.edit()
            java.lang.String r3 = X.AnonymousClass2D9.A00(r29)
            r0 = 11
            java.lang.Long[] r2 = new java.lang.Long[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r27)
            r0 = 0
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r25)
            r0 = 1
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r23)
            r0 = 2
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r21)
            r0 = 3
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r19)
            r0 = 4
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r17)
            r0 = 5
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            r0 = 6
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r0 = 7
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            r0 = 8
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r0 = 9
            r2[r0] = r1
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2[r6] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            java.lang.String r0 = android.text.TextUtils.join(r5, r0)
            android.content.SharedPreferences$Editor r0 = r4.putString(r3, r0)
            goto L_0x0d02
        L_0x0c63:
            long r7 = r7 + r0
            goto L_0x0bfb
        L_0x0c65:
            long r17 = r17 + r0
            goto L_0x0bfb
        L_0x0c68:
            long r13 = r13 + r0
            goto L_0x0bfb
        L_0x0c6a:
            long r15 = r15 + r0
            goto L_0x0bfb
        L_0x0c6c:
            long r11 = r11 + r0
            goto L_0x0bfb
        L_0x0c6e:
            long r9 = r9 + r0
            goto L_0x0bfb
        L_0x0c70:
            java.lang.Object r1 = r4.A00
            X.15I r1 = (X.AnonymousClass15I) r1
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r4 = r4.A02
            X.04N r4 = (X.AnonymousClass04N) r4
            r1.A06()
            android.content.SharedPreferences r3 = r1.A05()
            java.lang.String r0 = r0.getRawString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_commerce"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.String r0 = "null,false,false,null,false,null,null,null,null,null"
            java.lang.String r0 = r3.getString(r2, r0)
            X.2D5 r0 = X.AnonymousClass2D5.A00(r0)
            r4.accept(r0)
            android.content.SharedPreferences$Editor r1 = r3.edit()
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            goto L_0x0d02
        L_0x0cb2:
            java.lang.Object r1 = r4.A00
            X.15I r1 = (X.AnonymousClass15I) r1
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r3 = r4.A02
            X.1vV r3 = (X.C41261vV) r3
            r1.A06()
            android.content.SharedPreferences r2 = r1.A05()
            java.lang.String r0 = r0.getRawString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_discovery"
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = "null,null"
            java.lang.String r0 = r2.getString(r7, r0)
            java.lang.String r6 = ","
            r0.split(r6)
            r5 = 1
            java.lang.String r4 = r3.A05
            java.lang.String r3 = r3.A06
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r4
            r1[r5] = r3
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.lang.String r0 = android.text.TextUtils.join(r6, r0)
            android.content.SharedPreferences$Editor r0 = r2.putString(r7, r0)
        L_0x0d02:
            r0.apply()
            return
        L_0x0d06:
            java.lang.Object r0 = r4.A00
            X.2D3 r0 = (X.AnonymousClass2D3) r0
            java.lang.Object r1 = r4.A01
            X.0rv r1 = (X.C15830rv) r1
            java.lang.Object r5 = r4.A02
            X.1Vw r5 = (X.C28381Vw) r5
            X.15I r4 = r0.A00
            r4.A06()
            boolean r3 = r5.A02
            X.0t6 r0 = r4.A0C
            X.0th r2 = r0.A0K
            X.0tZ r0 = r2.A03(r5)
            if (r0 == 0) goto L_0x0d28
            int r0 = r0.A04
            r10 = 1
            if (r0 > 0) goto L_0x0d29
        L_0x0d28:
            r10 = 0
        L_0x0d29:
            boolean r11 = X.AnonymousClass15I.A03(r4, r5)
            boolean r12 = X.AnonymousClass15I.A04(r4, r5)
            boolean r13 = X.AnonymousClass15I.A02(r4, r5)
            r6 = r4
            r7 = r1
            r8 = r5
            r9 = r3
            X.AnonymousClass15I.A01(r6, r7, r8, r9, r10, r11, r12, r13)
            X.0z4 r0 = r4.A0T
            r24 = r0
            X.0tZ r2 = r2.A03(r5)
            monitor-enter(r24)
            X.0sG r0 = r0.A00     // Catch:{ all -> 0x0f47 }
            X.0sH r4 = r0.A08(r1)     // Catch:{ all -> 0x0f47 }
            if (r4 == 0) goto L_0x0ef4
            if (r2 == 0) goto L_0x0f45
            X.1Vw r0 = r2.A11     // Catch:{ all -> 0x0f47 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0f47 }
            if (r0 != 0) goto L_0x0f13
            int r23 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x0f47 }
            r3 = 1
            r0 = r23
            if (r0 == r3) goto L_0x0f13
            java.lang.Integer r3 = X.C19830z4.A01(r2)     // Catch:{ all -> 0x0f47 }
            r0 = r24
            X.0sf r5 = r0.A0D     // Catch:{ all -> 0x0f47 }
            java.lang.String r0 = r1.getRawString()     // Catch:{ all -> 0x0f47 }
            X.1WS r0 = r5.A07(r0)     // Catch:{ all -> 0x0f47 }
            boolean r22 = r0.A09()     // Catch:{ all -> 0x0f47 }
            byte r0 = r2.A10     // Catch:{ all -> 0x0f47 }
            java.lang.String r21 = X.C19830z4.A03(r0)     // Catch:{ all -> 0x0f47 }
            r0 = r24
            X.0rt r0 = r0.A05     // Catch:{ all -> 0x0f47 }
            boolean r5 = r0.A0G(r1)     // Catch:{ all -> 0x0f47 }
            r0 = 1
            if (r5 == 0) goto L_0x0d84
            r0 = 2
        L_0x0d84:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0f47 }
            r0 = r24
            X.0rz r0 = r0.A03     // Catch:{ all -> 0x0f47 }
            boolean r0 = r0.A1c()     // Catch:{ all -> 0x0f47 }
            r20 = 0
            if (r0 != 0) goto L_0x0d96
            r20 = 1
        L_0x0d96:
            r0 = r24
            X.0yL r0 = r0.A02     // Catch:{ all -> 0x0f47 }
            X.03S r0 = r0.A00     // Catch:{ all -> 0x0f47 }
            boolean r19 = r0.A03()     // Catch:{ all -> 0x0f47 }
            r11 = 0
            r0 = r24
            X.0pd r9 = r0.A08     // Catch:{ all -> 0x0f47 }
            r0 = 3016(0xbc8, float:4.226E-42)
            X.0tM r8 = X.C16620tM.A02     // Catch:{ all -> 0x0f47 }
            boolean r0 = r9.A0E(r8, r0)     // Catch:{ all -> 0x0f47 }
            if (r0 == 0) goto L_0x0e27
            r6 = 0
            r0 = r24
            X.0yz r7 = r0.A06     // Catch:{ all -> 0x0f47 }
            r18 = 1
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0f47 }
            r10.<init>()     // Catch:{ all -> 0x0f47 }
            X.0tq r0 = r7.A09     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e04, IllegalStateException -> 0x0e0e }
            X.0tf r11 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e04, IllegalStateException -> 0x0e0e }
            X.0tg r15 = r11.A02     // Catch:{ all -> 0x0dff }
            java.lang.String r14 = X.AnonymousClass1WW.A06     // Catch:{ all -> 0x0dff }
            r0 = 2
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ all -> 0x0dff }
            r13 = 0
            X.0ts r0 = r7.A03     // Catch:{ all -> 0x0dff }
            long r16 = r0.A02(r1)     // Catch:{ all -> 0x0dff }
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0dff }
            r12[r13] = r0     // Catch:{ all -> 0x0dff }
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x0dff }
            r12[r18] = r0     // Catch:{ all -> 0x0dff }
            android.database.Cursor r12 = r15.A08(r14, r12)     // Catch:{ all -> 0x0dff }
        L_0x0ddf:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0df8 }
            if (r0 == 0) goto L_0x0df1
            X.0th r0 = r7.A02     // Catch:{ all -> 0x0df8 }
            X.0tZ r0 = r0.A02(r12, r1, r13)     // Catch:{ all -> 0x0df8 }
            if (r0 == 0) goto L_0x0ddf
            r10.add(r0)     // Catch:{ all -> 0x0df8 }
            goto L_0x0ddf
        L_0x0df1:
            r12.close()     // Catch:{ all -> 0x0dff }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e04, IllegalStateException -> 0x0e0e }
            goto L_0x0e14
        L_0x0df8:
            r0 = move-exception
            if (r12 == 0) goto L_0x0dfe
            r12.close()     // Catch:{ all -> 0x0dfe }
        L_0x0dfe:
            throw r0     // Catch:{ all -> 0x0dff }
        L_0x0dff:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0e03 }
        L_0x0e03:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e04, IllegalStateException -> 0x0e0e }
        L_0x0e04:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0f47 }
            X.0ym r0 = r7.A08     // Catch:{ all -> 0x0f47 }
            r0.A02()     // Catch:{ all -> 0x0f47 }
            goto L_0x0e14
        L_0x0e0e:
            r7 = move-exception
            java.lang.String r0 = "msgstore/getLastSignificantOutgoingMessages/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r7)     // Catch:{ all -> 0x0f47 }
        L_0x0e14:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0f47 }
            if (r0 != 0) goto L_0x0e21
            r0 = 0
            java.lang.Object r6 = r10.get(r0)     // Catch:{ all -> 0x0f47 }
            X.0tZ r6 = (X.C16740tZ) r6     // Catch:{ all -> 0x0f47 }
        L_0x0e21:
            r0 = r24
            java.lang.Long r11 = r0.A05(r6)     // Catch:{ all -> 0x0f47 }
        L_0x0e27:
            r0 = 2455(0x997, float:3.44E-42)
            boolean r0 = r9.A0E(r8, r0)     // Catch:{ all -> 0x0ef2 }
            if (r0 == 0) goto L_0x0e86
            X.3sn r10 = new X.3sn     // Catch:{ all -> 0x0ef2 }
            r10.<init>()     // Catch:{ all -> 0x0ef2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)     // Catch:{ all -> 0x0ef2 }
            r10.A01 = r0     // Catch:{ all -> 0x0ef2 }
            r10.A06 = r3     // Catch:{ all -> 0x0ef2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0ef2 }
            r10.A05 = r0     // Catch:{ all -> 0x0ef2 }
            r0 = r21
            r10.A09 = r0     // Catch:{ all -> 0x0ef2 }
            r10.A04 = r5     // Catch:{ all -> 0x0ef2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r20)     // Catch:{ all -> 0x0ef2 }
            r10.A00 = r0     // Catch:{ all -> 0x0ef2 }
            r0 = r24
            java.lang.String r0 = r0.A06(r4)     // Catch:{ all -> 0x0ef2 }
            r10.A0A = r0     // Catch:{ all -> 0x0ef2 }
            r0 = r24
            X.0z0 r0 = r0.A0B     // Catch:{ all -> 0x0ef2 }
            boolean r0 = r0.A01(r1)     // Catch:{ all -> 0x0ef2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0ef2 }
            r10.A03 = r0     // Catch:{ all -> 0x0ef2 }
            r0 = r24
            X.0z2 r0 = r0.A07     // Catch:{ all -> 0x0ef2 }
            X.0uz r0 = r0.A06()     // Catch:{ all -> 0x0ef2 }
            int r0 = r0.size()     // Catch:{ all -> 0x0ef2 }
            long r6 = (long) r0     // Catch:{ all -> 0x0ef2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0ef2 }
            r10.A07 = r0     // Catch:{ all -> 0x0ef2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x0ef2 }
            r10.A02 = r0     // Catch:{ all -> 0x0ef2 }
            r10.A08 = r11     // Catch:{ all -> 0x0ef2 }
            r0 = r24
            X.0t9 r0 = r0.A09     // Catch:{ all -> 0x0ef2 }
            r0.A06(r10)     // Catch:{ all -> 0x0ef2 }
        L_0x0e86:
            r0 = 2456(0x998, float:3.442E-42)
            boolean r0 = r9.A0E(r8, r0)     // Catch:{ all -> 0x0ef2 }
            if (r0 == 0) goto L_0x0eca
            boolean r0 = r2 instanceof X.C30591cd     // Catch:{ all -> 0x0ef2 }
            if (r0 == 0) goto L_0x0eca
            r7 = r2
            X.1cb r7 = (X.C30571cb) r7     // Catch:{ all -> 0x0ef2 }
            X.3sG r6 = new X.3sG     // Catch:{ all -> 0x0ef2 }
            r6.<init>()     // Catch:{ all -> 0x0ef2 }
            r6.A03 = r5     // Catch:{ all -> 0x0ef2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r20)     // Catch:{ all -> 0x0ef2 }
            r6.A00 = r0     // Catch:{ all -> 0x0ef2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)     // Catch:{ all -> 0x0ef2 }
            r6.A01 = r0     // Catch:{ all -> 0x0ef2 }
            r5 = 0
            X.0rv r0 = r4.A0E     // Catch:{ all -> 0x0ef2 }
            if (r0 == 0) goto L_0x0eb3
            java.lang.String r0 = r0.user     // Catch:{ all -> 0x0ef2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0ef2 }
        L_0x0eb3:
            r6.A05 = r5     // Catch:{ all -> 0x0ef2 }
            X.1cf r0 = r7.A00     // Catch:{ all -> 0x0ef2 }
            java.lang.String r0 = r0.A04     // Catch:{ all -> 0x0ef2 }
            r6.A06 = r0     // Catch:{ all -> 0x0ef2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x0ef2 }
            r6.A02 = r0     // Catch:{ all -> 0x0ef2 }
            r6.A04 = r3     // Catch:{ all -> 0x0ef2 }
            r0 = r24
            X.0t9 r0 = r0.A09     // Catch:{ all -> 0x0ef2 }
            r0.A06(r6)     // Catch:{ all -> 0x0ef2 }
        L_0x0eca:
            r6 = 0
            if (r3 == 0) goto L_0x0ee9
            int r3 = r3.intValue()     // Catch:{ all -> 0x0f47 }
            if (r3 == 0) goto L_0x0ee4
            r0 = 1
            if (r3 == r0) goto L_0x0ee0
            r0 = 2
            if (r3 == r0) goto L_0x0edd
            r0 = 3
            if (r3 != r0) goto L_0x0ee9
            goto L_0x0ee7
        L_0x0edd:
            java.lang.String r6 = "promotional_qbm"
            goto L_0x0ee9
        L_0x0ee0:
            java.lang.String r6 = "transactional_qbm"
            goto L_0x0ee9
        L_0x0ee4:
            java.lang.String r6 = "other_qbm"
            goto L_0x0ee9
        L_0x0ee7:
            java.lang.String r6 = "otp_qbm"
        L_0x0ee9:
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.of(r1)     // Catch:{ all -> 0x0f47 }
            if (r6 == 0) goto L_0x0f13
            if (r5 == 0) goto L_0x0f13
            goto L_0x0ef7
        L_0x0ef2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0f47 }
        L_0x0ef4:
            if (r2 == 0) goto L_0x0f45
            goto L_0x0f13
        L_0x0ef7:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0f47 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0f47 }
            java.lang.String r7 = "whatsapp"
            X.1vW r4 = new X.1vW     // Catch:{ all -> 0x0f47 }
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ all -> 0x0f47 }
            X.1vV r3 = new X.1vV     // Catch:{ all -> 0x0f47 }
            r3.<init>(r4)     // Catch:{ all -> 0x0f47 }
            r0 = r24
            X.0z3 r0 = r0.A04     // Catch:{ all -> 0x0f47 }
            r0.A00(r3)     // Catch:{ all -> 0x0f47 }
        L_0x0f13:
            r0 = r24
            X.0z1 r3 = r0.A0C     // Catch:{ all -> 0x0f47 }
            java.util.List r0 = r3.A04     // Catch:{ all -> 0x0f47 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0f47 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0f45
            X.0sG r0 = r3.A00     // Catch:{ all -> 0x0f47 }
            X.0sH r0 = r0.A08(r1)     // Catch:{ all -> 0x0f47 }
            if (r0 == 0) goto L_0x0f45
            boolean r0 = r0.A0I()     // Catch:{ all -> 0x0f47 }
            if (r0 == 0) goto L_0x0f45
            boolean r0 = r3.A01(r2)     // Catch:{ all -> 0x0f47 }
            if (r0 == 0) goto L_0x0f45
            X.1cd r2 = (X.C30591cd) r2     // Catch:{ all -> 0x0f47 }
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0f47 }
            X.1vc r1 = r3.A00(r1, r2, r0)     // Catch:{ all -> 0x0f47 }
            X.0t9 r0 = r3.A03     // Catch:{ all -> 0x0f47 }
            r0.A06(r1)     // Catch:{ all -> 0x0f47 }
        L_0x0f45:
            monitor-exit(r24)
            return
        L_0x0f47:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        L_0x0f4a:
            java.lang.Object r2 = r4.A00
            X.2D3 r2 = (X.AnonymousClass2D3) r2
            java.lang.Object r3 = r4.A01
            X.0rv r3 = (X.C15830rv) r3
            java.lang.Object r4 = r4.A02
            X.1Vw r4 = (X.C28381Vw) r4
            java.lang.String r1 = "ChatMessageCounts/recordMessageSent jid:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.15I r2 = r2.A00
            r2.A06()
            X.0t6 r0 = r2.A0C
            X.0th r0 = r0.A0K
            X.0tZ r0 = r0.A03(r4)
            if (r0 == 0) goto L_0x0f7b
            int r0 = r0.A04
            r6 = 1
            if (r0 > 0) goto L_0x0f7c
        L_0x0f7b:
            r6 = 0
        L_0x0f7c:
            boolean r7 = X.AnonymousClass15I.A03(r2, r4)
            boolean r8 = X.AnonymousClass15I.A04(r2, r4)
            r5 = 1
            r9 = 1
            X.AnonymousClass15I.A01(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0f8a:
            java.lang.Object r1 = r4.A00
            X.1bb r1 = (X.C30011bb) r1
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r4.A02
            android.content.Intent r2 = (android.content.Intent) r2
            X.1DY r0 = r1.A1L
            r0.A00()
            X.0zJ r1 = r1.A0I
            java.lang.String r0 = "ConversationRow"
            r1.A08(r3, r2, r0)
            return
        L_0x0fa3:
            java.lang.Object r0 = r4.A00
            X.1yP r0 = (X.AnonymousClass1yP) r0
            java.lang.Object r11 = r4.A01
            X.1lO r11 = (X.C35111lO) r11
            java.lang.Object r10 = r4.A02
            X.0tZ r10 = (X.C16740tZ) r10
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            X.1yj r1 = r0.A00
            X.1yV r0 = r1.A22
            X.1yR r0 = (X.AnonymousClass1yR) r0
            X.2DF r0 = r0.A00
            X.0tb r9 = r0.A03
            X.0sH r1 = r1.A2l
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r2 = r1.A08(r0)
            X.AnonymousClass00B.A06(r2)
            X.0rv r2 = (X.C15830rv) r2
            X.17g r8 = r9.A1N
            X.0t3 r0 = r9.A0Q
            long r3 = r0.A00()
            X.18b r1 = r8.A05
            r0 = 1
            X.1Vw r7 = r1.A02(r2, r0)
            r6 = 1
            java.lang.String r5 = r11.A02
            java.lang.String r2 = r11.A00
            java.lang.String r1 = r11.A01
            X.1lN r0 = new X.1lN
            r0.<init>(r5, r2, r1, r6)
            X.1rp r1 = new X.1rp
            r1.<init>(r7, r3)
            r1.A00 = r0
            r8.A05(r1, r10)
            r9.A0M(r1)
            X.0t6 r0 = r9.A0e
            r0.A0W(r1)
            return
        L_0x0ff6:
            java.lang.Object r8 = r4.A00
            X.2JC r8 = (X.AnonymousClass2JC) r8
            java.lang.Object r0 = r4.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.lang.Object r10 = r4.A02
            java.util.AbstractMap r10 = (java.util.AbstractMap) r10
            java.util.Iterator r9 = r0.iterator()
        L_0x1006:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x1032
            java.lang.Object r7 = r9.next()
            X.0rv r7 = (X.C15830rv) r7
            java.lang.Object r0 = r10.get(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x1006
            com.obwhatsapp.conversationslist.ConversationsFragment r6 = r8.A0L
            X.1cg r5 = r6.A17
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x102e
            X.0t3 r0 = r6.A1G
            long r3 = r0.A00()
        L_0x102e:
            r5.A01(r7, r3)
            goto L_0x1006
        L_0x1032:
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = r8.A0L
            X.0pt r2 = r0.A0O
            r1 = 17
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r0.<init>(r8, r1)
            r2.A0K(r0)
            return
        L_0x1041:
            java.lang.Object r2 = r4.A00
            X.1cg r2 = (X.C30621cg) r2
            java.lang.Object r3 = r4.A01
            X.0rv r3 = (X.C15830rv) r3
            java.lang.Object r5 = r4.A02
            X.0xS r0 = r2.A06
            java.lang.Long r4 = r0.A00(r3)
            X.0pt r0 = r2.A01
            r6 = 20
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0400000_I0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0K(r1)
            return
        L_0x105e:
            java.lang.Object r6 = r4.A00
            X.1cg r6 = (X.C30621cg) r6
            java.lang.Object r5 = r4.A01
            X.0rv r5 = (X.C15830rv) r5
            java.lang.Object r0 = r4.A02
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x107a
            X.0t3 r0 = r6.A05
            long r3 = r0.A00()
        L_0x107a:
            r6.A01(r5, r3)
            return
        L_0x107e:
            X.25P r3 = r1.A00(r0)     // Catch:{ 25G -> 0x10a3 }
            java.util.ArrayList r2 = r3.A01     // Catch:{ 25G -> 0x10a3 }
            int r1 = r2.size()     // Catch:{ 25G -> 0x10a3 }
            r0 = 1
            if (r1 <= r0) goto L_0x1091
            X.0tb r0 = r5.A03     // Catch:{ 25G -> 0x10a3 }
            r0.A0T(r13, r6, r2, r4)     // Catch:{ 25G -> 0x10a3 }
            return
        L_0x1091:
            X.0tb r12 = r5.A03     // Catch:{ 25G -> 0x10a3 }
            java.lang.String r14 = r3.A00     // Catch:{ 25G -> 0x10a3 }
            java.lang.Object r15 = r2.get(r4)     // Catch:{ 25G -> 0x10a3 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ 25G -> 0x10a3 }
            r17 = 0
            r16 = r6
            r12.A0S(r13, r14, r15, r16, r17)     // Catch:{ 25G -> 0x10a3 }
            return
        L_0x10a3:
            r3 = move-exception
            X.0pt r2 = r5.A01
            r1 = 22
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r3, r1, r5)
            r2.A0K(r0)
            return
        L_0x10b1:
            X.0pt r1 = r5.A01
            r0 = 2131892603(0x7f12197b, float:1.9419959E38)
            r1.A09(r0, r4)
            return
        L_0x10ba:
            X.1Vw r0 = r1.A11     // Catch:{ all -> 0x10ce }
            X.0rv r3 = r0.A00     // Catch:{ all -> 0x10ce }
            X.0tZ r5 = r1.A0D()     // Catch:{ all -> 0x10ce }
            X.0tZ r4 = r2.A04(r3)     // Catch:{ all -> 0x10ce }
            byte r6 = r1.A10     // Catch:{ all -> 0x10ce }
            r7 = 0
            r2.A07(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x10ce }
            monitor-exit(r2)
            return
        L_0x10ce:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0300000_I0.run():void");
    }
}
