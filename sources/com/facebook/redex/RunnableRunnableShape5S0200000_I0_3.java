package com.facebook.redex;

import X.AnonymousClass027;

public class RunnableRunnableShape5S0200000_I0_3 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape5S0200000_I0_3() {
        this.A02 = 22;
        this.A00 = new AnonymousClass027();
    }

    public RunnableRunnableShape5S0200000_I0_3(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0250, code lost:
        if (((X.C39391sP) r7).A00 == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04b7, code lost:
        if (r1 == 2) goto L_0x04b9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:263:0x068f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:328:0x08b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:343:0x0913 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:453:0x0ba9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x019d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01a2 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:93:0x0225=Splitter:B:93:0x0225, B:453:0x0ba9=Splitter:B:453:0x0ba9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r2 = r19
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0554;
                case 1: goto L_0x0b8c;
                case 2: goto L_0x04f6;
                case 3: goto L_0x04d4;
                case 4: goto L_0x0b80;
                case 5: goto L_0x04a6;
                case 6: goto L_0x0455;
                case 7: goto L_0x0b70;
                case 8: goto L_0x03a2;
                case 9: goto L_0x0b3e;
                case 10: goto L_0x0b30;
                case 11: goto L_0x0b0d;
                case 12: goto L_0x0b01;
                case 13: goto L_0x0add;
                case 14: goto L_0x0ac5;
                case 15: goto L_0x0a90;
                case 16: goto L_0x0385;
                case 17: goto L_0x032c;
                case 18: goto L_0x02b4;
                case 19: goto L_0x0291;
                case 20: goto L_0x09bb;
                case 21: goto L_0x097a;
                case 22: goto L_0x093e;
                case 23: goto L_0x0926;
                case 24: goto L_0x0822;
                case 25: goto L_0x0265;
                case 26: goto L_0x01d4;
                case 27: goto L_0x07ea;
                case 28: goto L_0x07de;
                case 29: goto L_0x07d2;
                case 30: goto L_0x07b6;
                case 31: goto L_0x00c8;
                case 32: goto L_0x00ae;
                case 33: goto L_0x07aa;
                case 34: goto L_0x0092;
                case 35: goto L_0x0790;
                case 36: goto L_0x0766;
                case 37: goto L_0x0738;
                case 38: goto L_0x006b;
                case 39: goto L_0x0700;
                case 40: goto L_0x06db;
                case 41: goto L_0x0040;
                case 42: goto L_0x0007;
                case 43: goto L_0x0007;
                case 44: goto L_0x0022;
                case 45: goto L_0x06cf;
                case 46: goto L_0x06c1;
                case 47: goto L_0x06ae;
                case 48: goto L_0x0693;
                case 49: goto L_0x05c6;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r2.A00
            X.2JE r1 = (X.AnonymousClass2JE) r1
            java.lang.Object r0 = r2.A01
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0021
            com.obwhatsapp.conversationslist.ConversationsFragment r2 = r1.A04
            android.widget.ListView r1 = r2.A09
            android.view.View r0 = r2.A05
            r1.removeHeaderView(r0)
            r0 = 0
            r2.A05 = r0
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r3 = r2.A00
            X.2JF r3 = (X.AnonymousClass2JF) r3
            java.lang.Object r0 = r2.A01
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x002e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r1 = r2.next()
            X.0rv r1 = (X.C15830rv) r1
            X.0xS r0 = r3.A0F
            r0.A00(r1)
            goto L_0x002e
        L_0x0040:
            java.lang.Object r5 = r2.A00
            X.2JC r5 = (X.AnonymousClass2JC) r5
            java.lang.Object r1 = r2.A01
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0021
            java.util.Iterator r4 = r1.iterator()
        L_0x0052:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r3 = r4.next()
            X.0rv r3 = (X.C15830rv) r3
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = r5.A0L
            X.0xS r2 = r0.A1L
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A04(r3, r0, r1)
            goto L_0x0052
        L_0x006b:
            java.lang.Object r4 = r2.A00
            X.2JC r4 = (X.AnonymousClass2JC) r4
            java.lang.Object r0 = r2.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x0077:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r2 = r3.next()
            X.0rv r2 = (X.C15830rv) r2
            boolean r0 = X.C16030sJ.A0R(r2)
            if (r0 != 0) goto L_0x0077
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = r4.A0L
            X.0tb r1 = r0.A0T
            r0 = 1
            r1.A0D(r2, r0)
            goto L_0x0077
        L_0x0092:
            java.lang.Object r4 = r2.A00
            X.1wN r4 = (X.C41681wN) r4
            java.lang.Object r3 = r2.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.1ZR r0 = r4.A01
            if (r0 == 0) goto L_0x0021
            X.0uc r2 = r4.A0I
            java.lang.String r1 = r2.A01(r3)
            if (r1 == 0) goto L_0x0b9c
            X.1ZR r0 = r4.A01
            r0.A0H = r1
            r4.A09(r3)
            return
        L_0x00ae:
            java.lang.Object r3 = r2.A00
            X.1wN r3 = (X.C41681wN) r3
            java.lang.Object r0 = r2.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            X.1ZR r1 = r3.A01
            if (r1 == 0) goto L_0x0021
            byte[] r0 = r1.A0H(r0)
            r1.A0T = r0
            X.027 r1 = r3.A0B
            X.1ZR r0 = r3.A01
            r1.A09(r0)
            return
        L_0x00c8:
            java.lang.Object r5 = r2.A01
            X.1kZ r5 = (X.C34621kZ) r5
            if (r5 == 0) goto L_0x0021
            X.0t6 r3 = r5.A0Z
            X.0rv r10 = r5.A0h
            X.0rt r1 = r3.A0O
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C()
            java.lang.Object r0 = r0.get(r10)
            X.0rx r0 = (X.C15840rx) r0
            if (r0 != 0) goto L_0x01d0
            r7 = 1
        L_0x00e2:
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C()
            java.lang.Object r0 = r0.get(r10)
            X.0rx r0 = (X.C15840rx) r0
            if (r0 != 0) goto L_0x01cc
            r0 = 1
        L_0x00f0:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r11 = 1
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x013d
            java.lang.String r0 = "msgstore/get-important-messages empty"
        L_0x00fd:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r1 = r5.A0w
            r1.clear()
            r1.addAll(r4)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0127
            r1 = 8
            r0 = 0
            X.2Pz r3 = new X.2Pz
            r3.<init>(r1, r0)
        L_0x0116:
            java.lang.Object r0 = r2.A00
            X.2Q0 r0 = (X.AnonymousClass2Q0) r0
            r1 = 0
            if (r0 == 0) goto L_0x0124
            X.027 r0 = r0.A00
            r0.A09(r3)
            r2.A00 = r1
        L_0x0124:
            r2.A01 = r1
            return
        L_0x0127:
            r4 = 0
            X.013 r0 = r5.A0W
            java.text.NumberFormat r3 = r0.A0K()
            int r0 = r1.size()
            long r0 = (long) r0
            java.lang.String r0 = r3.format(r0)
            X.2Pz r3 = new X.2Pz
            r3.<init>(r4, r0)
            goto L_0x0116
        L_0x013d:
            java.lang.String r9 = "msgstore/get-important-messages"
            X.1Zf r6 = new X.1Zf
            r6.<init>((java.lang.String) r9)
            r9 = 3
            java.lang.String[] r11 = new java.lang.String[r9]
            r9 = 0
            X.0ts r12 = r3.A0N
            long r12 = r12.A02(r10)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r11[r9] = r12
            r12 = 1
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r11[r12] = r7
            r8 = 2
            X.15B r7 = r3.A1D
            long r0 = r7.A03(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11[r8] = r0
            X.0tq r0 = r3.A0v     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a3 }
            X.0tf r8 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a3 }
            X.0tg r1 = r8.A02     // Catch:{ all -> 0x019e }
            java.lang.String r0 = X.C42931yw.A00     // Catch:{ all -> 0x019e }
            android.database.Cursor r7 = r1.A08(r0, r11)     // Catch:{ all -> 0x019e }
        L_0x0176:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0190
            X.0th r0 = r3.A0K     // Catch:{ all -> 0x0197 }
            X.0tZ r1 = r0.A02(r7, r10, r9)     // Catch:{ all -> 0x0197 }
            if (r1 == 0) goto L_0x0176
            X.0sK r0 = r3.A05     // Catch:{ all -> 0x0197 }
            boolean r0 = X.C38621r6.A0Q(r0, r1)     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0176
            r4.add(r1)     // Catch:{ all -> 0x0197 }
            goto L_0x0176
        L_0x0190:
            r7.close()     // Catch:{ all -> 0x019e }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a3 }
            goto L_0x01ac
        L_0x0197:
            r0 = move-exception
            if (r7 == 0) goto L_0x019d
            r7.close()     // Catch:{ all -> 0x019d }
        L_0x019d:
            throw r0     // Catch:{ all -> 0x019e }
        L_0x019e:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a3 }
        L_0x01a3:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r3.A0u
            r0.A02()
        L_0x01ac:
            java.lang.String r0 = "msgstore/get-important-messages time spent:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            long r0 = r6.A01()
            r3.append(r0)
            java.lang.String r0 = " found:"
            r3.append(r0)
            int r0 = r4.size()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x00fd
        L_0x01cc:
            long r0 = r0.A0J
            goto L_0x00f0
        L_0x01d0:
            long r7 = r0.A0O
            goto L_0x00e2
        L_0x01d4:
            java.lang.Object r6 = r2.A00
            X.1yj r6 = (X.C42821yj) r6
            java.lang.Object r5 = r2.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.0yz r4 = r6.A2h
            long r9 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]
            r2 = 0
            X.0ts r0 = r4.A03
            long r0 = r0.A02(r5)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8[r2] = r0
            X.0tq r0 = r4.A09
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0baa }
            java.lang.String r0 = X.AnonymousClass1WW.A0F     // Catch:{ all -> 0x0baa }
            android.database.Cursor r2 = r1.A08(r0, r8)     // Catch:{ all -> 0x0baa }
            if (r2 == 0) goto L_0x0229
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0ba3 }
            if (r0 == 0) goto L_0x0211
            X.0th r1 = r4.A02     // Catch:{ all -> 0x0ba3 }
            r0 = 0
            X.0tZ r7 = r1.A02(r2, r5, r0)     // Catch:{ all -> 0x0ba3 }
            goto L_0x0225
        L_0x0211:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ba3 }
            r1.<init>()     // Catch:{ all -> 0x0ba3 }
            java.lang.String r0 = "msgstore/last-raw/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x0ba3 }
            r1.append(r5)     // Catch:{ all -> 0x0ba3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0ba3 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0ba3 }
        L_0x0225:
            r2.close()     // Catch:{ all -> 0x0baa }
            goto L_0x022e
        L_0x0229:
            java.lang.String r0 = "msgstore/last-raw/db/cursor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0ba3 }
        L_0x022e:
            r3.close()
            X.0vN r3 = r4.A05
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r9
            java.lang.String r0 = "LastMessageStore/getLastMessageRaw"
            r3.A00(r0, r1)
            X.01Y r0 = r6.A1Q
            boolean r4 = r0.A0V(r5)
            r3 = 1
            r2 = 0
            if (r7 == 0) goto L_0x0252
            boolean r0 = r7 instanceof X.C39391sP
            if (r0 == 0) goto L_0x0252
            X.1sP r7 = (X.C39391sP) r7
            boolean r1 = r7.A00
            r0 = 1
            if (r1 != 0) goto L_0x0253
        L_0x0252:
            r0 = 0
        L_0x0253:
            if (r4 == 0) goto L_0x025d
            if (r0 != 0) goto L_0x0021
            X.01Y r0 = r6.A1Q
            r0.A0M(r5, r3)
            return
        L_0x025d:
            if (r0 == 0) goto L_0x0021
            X.01Y r0 = r6.A1Q
            r0.A0M(r5, r2)
            return
        L_0x0265:
            java.lang.Object r3 = r2.A00
            X.1yj r3 = (X.C42821yj) r3
            java.lang.Object r5 = r2.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.String r0 = r3.A4T
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0021
            java.lang.String r6 = r3.A4T
            java.lang.String r7 = r3.A4S
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = java.lang.System.currentTimeMillis()
            X.1vW r4 = new X.1vW
            r4.<init>(r5, r6, r7, r8, r10)
            X.1vV r1 = new X.1vV
            r1.<init>(r4)
            X.0z3 r0 = r3.A2O
            r0.A00(r1)
            return
        L_0x0291:
            java.lang.Object r0 = r2.A00
            X.1VA r0 = (X.AnonymousClass1VA) r0
            java.lang.Object r3 = r2.A01
            X.0tZ r3 = (X.C16740tZ) r3
            android.widget.ListView r0 = r0.ADA()
            X.1Vw r2 = r3.A11
            android.view.View r1 = r0.findViewWithTag(r2)
            boolean r0 = r1 instanceof X.C30011bb
            if (r0 == 0) goto L_0x0021
            X.1bb r1 = (X.C30011bb) r1
            boolean r0 = r1.A1L(r2)
            if (r0 == 0) goto L_0x0baf
            r0 = 1
            r1.A1G(r3, r0)
            return
        L_0x02b4:
            java.lang.Object r0 = r2.A00
            X.2DF r0 = (X.AnonymousClass2DF) r0
            java.lang.Object r7 = r2.A01
            X.0rv r7 = (X.C15830rv) r7
            X.0tb r0 = r0.A03
            if (r7 == 0) goto L_0x0021
            X.0t6 r13 = r0.A0e
            X.16w r2 = r13.A0U
            X.0ts r0 = r2.A00
            long r0 = r0.A02(r7)
            X.1y1 r6 = r2.A01(r0)
            if (r6 == 0) goto L_0x0021
            X.16x r5 = r13.A0Q
            int r0 = r7.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.12P r0 = r5.A02
            java.lang.Object r0 = r0.get()
            X.022 r0 = (X.AnonymousClass022) r0
            r0.A09(r1)
            r2.A05(r6)
            X.0rt r0 = r13.A0O
            boolean r0 = r0.A0I(r7)
            if (r0 == 0) goto L_0x031e
            r9 = 0
            boolean r11 = r6.A0C
            java.lang.String r2 = "action_delete"
        L_0x02f5:
            X.16w r6 = r13.A0U
            r0 = -9223372036854775808
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r10 = 1
            r12 = 0
            X.1y1 r0 = r6.A03(r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x0308
            r5.A00(r0, r2)
        L_0x0308:
            java.util.List r14 = java.util.Collections.emptyList()
            r17 = 0
            X.17E r0 = r13.A0e
            android.os.Handler r0 = r0.A01
            r16 = 3
            com.facebook.redex.RunnableRunnableShape0S0310000_I0 r12 = new com.facebook.redex.RunnableRunnableShape0S0310000_I0
            r15 = r7
            r12.<init>(r13, r14, r15, r16, r17)
            r0.post(r12)
            return
        L_0x031e:
            long r3 = r6.A04
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0308
            r9 = 0
            boolean r11 = r6.A0C
            java.lang.String r2 = "action_clear"
            goto L_0x02f5
        L_0x032c:
            java.lang.Object r5 = r2.A00
            X.2Q3 r5 = (X.AnonymousClass2Q3) r5
            java.lang.Object r3 = r2.A01
            X.1rH r3 = (X.C38701rH) r3
            com.obwhatsapp.search.views.itemviews.AudioPlayerView r2 = r5.A09
            java.lang.Object r0 = r2.getTag()
            if (r0 == 0) goto L_0x0021
            X.1Vw r1 = r3.A11
            java.lang.Object r0 = r2.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.1yC r0 = r3.A00
            if (r0 == 0) goto L_0x0021
            java.util.List r0 = r0.A00()
            if (r0 == 0) goto L_0x0021
            r2.A03(r0)
            boolean r0 = r1.A02
            r4 = 0
            if (r0 != 0) goto L_0x0383
            X.0rv r0 = r1.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x0383
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165841(0x7f070291, float:1.794591E38)
            int r3 = r1.getDimensionPixelSize(r0)
        L_0x036d:
            r0 = 2131362973(0x7f0a049d, float:1.8345742E38)
            android.view.View r2 = X.C004601z.A0E(r5, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165840(0x7f070290, float:1.7945908E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setPadding(r4, r3, r4, r0)
            return
        L_0x0383:
            r3 = 0
            goto L_0x036d
        L_0x0385:
            java.lang.Object r4 = r2.A00
            X.2QC r4 = (X.AnonymousClass2QC) r4
            java.lang.Object r1 = r2.A01
            X.0sL r1 = (X.C16050sL) r1
            X.0uk r0 = r4.A0Y
            X.0sL r3 = r0.A02(r1)
            if (r3 == 0) goto L_0x0021
            X.1FI r2 = r4.A07
            X.0rt r0 = r4.A0u
            int r1 = r0.A02(r1)
            r0 = 2
            r2.A00(r3, r1, r0)
            return
        L_0x03a2:
            java.lang.Object r5 = r2.A00
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r2.A01
            X.0rv r6 = (X.C15830rv) r6
            r4 = 0
        L_0x03ab:
            int r0 = r5.getChildCount()
            if (r4 >= r0) goto L_0x0021
            android.view.View r7 = r5.getChildAt(r4)
            boolean r0 = r7 instanceof X.C30011bb
            if (r0 == 0) goto L_0x03e2
            X.1bb r7 = (X.C30011bb) r7
            boolean r0 = r7 instanceof X.AnonymousClass2QF
            if (r0 == 0) goto L_0x03fd
            X.2QF r7 = (X.AnonymousClass2QF) r7
            X.0tZ r1 = r7.A0O
            X.1Vw r0 = r1.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x03e5
            X.0sK r0 = r7.A0L
            boolean r0 = r0.A0I(r6)
            if (r0 == 0) goto L_0x03e2
            X.2Ao r2 = r7.A0K
            X.0sK r0 = r7.A0L
            r0.A0B()
            X.1Zb r1 = r0.A01
            X.AnonymousClass00B.A06(r1)
            com.obwhatsapp.components.button.ThumbnailButton r0 = r7.A0J
            r2.A06(r0, r1)
        L_0x03e2:
            int r4 = r4 + 1
            goto L_0x03ab
        L_0x03e5:
            com.whatsapp.jid.UserJid r1 = r1.A0C()
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L_0x03e2
            X.14t r0 = r7.A0v
            X.0sH r2 = r0.A01(r1)
            X.2Ao r1 = r7.A0K
            com.obwhatsapp.components.button.ThumbnailButton r0 = r7.A0J
            r1.A06(r0, r2)
            goto L_0x03e2
        L_0x03fd:
            boolean r0 = r7 instanceof X.AnonymousClass2Q5
            if (r0 == 0) goto L_0x03e2
            X.2Q5 r7 = (X.AnonymousClass2Q5) r7
            boolean r0 = r7 instanceof X.AnonymousClass2Q3
            if (r0 == 0) goto L_0x0438
            X.2Q3 r7 = (X.AnonymousClass2Q3) r7
            X.0tZ r2 = r7.A0O
            X.0tY r2 = (X.C16730tY) r2
            X.1Vw r1 = r2.A11
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x03e2
            X.0rv r3 = r1.A00
            boolean r1 = X.C16030sJ.A0L(r3)
            if (r1 == 0) goto L_0x041f
            X.0rv r3 = r2.A0B()
        L_0x041f:
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L_0x03e2
            if (r1 == 0) goto L_0x0435
            android.widget.ImageView r2 = r7.A03
        L_0x0429:
            X.2Ao r1 = r7.A05
            X.0sG r0 = r7.A0a
            X.0sH r0 = r0.A0A(r3)
            r1.A06(r2, r0)
            goto L_0x03e2
        L_0x0435:
            android.widget.ImageView r2 = r7.A04
            goto L_0x0429
        L_0x0438:
            X.0tZ r1 = r7.A0O
            X.1Vw r0 = r1.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x044c
            X.0sK r0 = r7.A0L
            boolean r0 = r0.A0I(r6)
        L_0x0446:
            if (r0 == 0) goto L_0x03e2
            r7.A10()
            goto L_0x03e2
        L_0x044c:
            com.whatsapp.jid.UserJid r0 = r1.A0C()
            boolean r0 = r6.equals(r0)
            goto L_0x0446
        L_0x0455:
            java.lang.Object r1 = r2.A00
            X.17Z r1 = (X.AnonymousClass17Z) r1
            java.lang.Object r6 = r2.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.1ZX r6 = (X.AnonymousClass1ZX) r6
            X.15H r0 = r1.A09
            r0.A04(r6)
            X.0vJ r0 = r1.A08
            X.1ZT r7 = r0.A01(r6)
            if (r7 == 0) goto L_0x0021
            X.01J r0 = r1.A0E
            java.lang.Object r3 = r0.get()
            X.0xU r3 = (X.C18930xU) r3
            X.0sH r0 = new X.0sH
            r0.<init>(r7)
            java.util.List r2 = java.util.Collections.singletonList(r0)
            X.15h r1 = r3.A0T
            java.lang.String r0 = "pnForLidChat"
            java.lang.Object r1 = r1.A02(r0)
            X.0zw r1 = (X.C20370zw) r1
            if (r1 == 0) goto L_0x04a1
            r0 = 0
            X.C18450wi.A0H(r6, r0)
            X.0t3 r0 = r1.A01
            long r9 = r0.A00()
            r5 = 0
            X.1oV r4 = new X.1oV
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            java.util.Set r0 = java.util.Collections.singleton(r4)
            r3.A0S(r0)
        L_0x04a1:
            r0 = 1
            r3.A0T(r2, r0)
            return
        L_0x04a6:
            java.lang.Object r0 = r2.A00
            X.0yh r0 = (X.C19600yh) r0
            java.lang.Object r2 = r2.A01
            X.284 r2 = (X.AnonymousClass284) r2
            X.16j r4 = r0.A0B
            int r1 = r2.A00
            r0 = 3
            if (r1 == r0) goto L_0x04b9
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x04ba
        L_0x04b9:
            r3 = 1
        L_0x04ba:
            java.util.Set r2 = r2.A01
            java.lang.Iterable r0 = r4.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x04c4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            X.1iY r0 = (X.C33421iY) r0
            r0.A01(r2, r3)
            goto L_0x04c4
        L_0x04d4:
            java.lang.Object r3 = r2.A00
            X.15w r3 = (X.C219015w) r3
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x04e0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r2.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.13V r1 = r3.A03
            com.whatsapp.jid.UserJid r0 = r0.getUserJid()
            r1.A04(r0)
            goto L_0x04e0
        L_0x04f6:
            java.lang.Object r3 = r2.A00
            X.10w r3 = (X.C206210w) r3
            java.lang.Object r4 = r2.A01
            X.0sH r4 = (X.C16010sH) r4
            X.0xz r5 = r3.A03
            X.0sK r0 = r5.A01
            boolean r0 = r0.A0G()
            r1 = r0 ^ 1
            java.lang.String r0 = "ContactSyncMethods/outContactDiscoverySyncFor/out contacts should not be synced in companion mode"
            X.AnonymousClass00B.A0D(r0, r1)
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r4.A08(r0)
            if (r0 == 0) goto L_0x0021
            X.1kz r7 = X.C34861kz.A0I
            java.util.Set r8 = java.util.Collections.singleton(r0)
            X.27w r6 = X.C453027w.A0C
            r9 = 0
            r10 = 0
            X.1kE r0 = r5.A02(r6, r7, r8, r9, r10)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            X.284 r0 = (X.AnonymousClass284) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            boolean r0 = r0.A00()     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            if (r0 == 0) goto L_0x0021
            X.0sG r2 = r3.A01     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            long r0 = r4.A05()     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            X.0sH r1 = r2.A05(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            if (r1 == 0) goto L_0x0021
            boolean r0 = r1.A0i     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            if (r0 == 0) goto L_0x0021
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            r5.A0A(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            X.16l r0 = r3.A02     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            X.3q1 r1 = new X.3q1     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            r1.<init>()     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            X.0t9 r0 = r0.A05     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            r0.A06(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0bb6 }
            goto L_0x0bb5
        L_0x0554:
            java.lang.Object r3 = r2.A00
            X.16l r3 = (X.C220516l) r3
            java.lang.Object r4 = r2.A01
            java.util.Map r0 = r3.A00()
            X.0vs r1 = X.C17930vs.copyOf((java.util.Map) r0)
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L_0x0021
            X.0t3 r0 = r3.A03
            long r6 = r0.A00()
            java.lang.Object r0 = r1.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r6 = r6 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            X.0pd r5 = r3.A04
            r0 = 1144(0x478, float:1.603E-42)
            X.0tM r2 = X.C16620tM.A02
            int r1 = r5.A03(r2, r0)
            r0 = -1
            if (r1 == r0) goto L_0x05ad
            X.0sK r0 = r3.A01
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x05ad
            X.3qF r1 = new X.3qF
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1.A00 = r0
            X.0t9 r0 = r3.A05
            r0.A06(r1)
        L_0x05a1:
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.Set r0 = java.util.Collections.singleton(r4)
            r3.A01(r1, r0)
            return
        L_0x05ad:
            r0 = 1665(0x681, float:2.333E-42)
            boolean r0 = r5.A0E(r2, r0)
            if (r0 == 0) goto L_0x05a1
            X.3qG r1 = new X.3qG
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1.A00 = r0
            X.0t9 r0 = r3.A05
            r0.A06(r1)
            goto L_0x05a1
        L_0x05c6:
            java.lang.Object r4 = r2.A00
            X.0uV r4 = (X.C17080uV) r4
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r1 = "app_state"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            r4.A04 = r0
            java.io.File r0 = r4.A04
            boolean r0 = r0.exists()
            r3 = 0
            if (r0 == 0) goto L_0x05ec
            java.io.File r0 = r4.A04
            boolean r0 = r0.isDirectory()
            if (r0 != 0) goto L_0x05fc
        L_0x05ec:
            java.io.File r0 = r4.A04
            r0.delete()
            java.io.File r0 = r4.A04
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L_0x05fc
            r4.A06 = r3
            return
        L_0x05fc:
            r2 = 0
        L_0x05fd:
            java.io.File r0 = r4.A04
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r1)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x062a
            int r2 = r2 + 1
            r0 = 5
            if (r2 < r0) goto L_0x05fd
            long r5 = java.lang.System.currentTimeMillis()
            r0 = 5
            long r5 = r5 % r0
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4.A05 = r0
            java.io.File r1 = r4.A04
            java.lang.String r0 = r4.A05
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r0)
            goto L_0x062c
        L_0x062a:
            r4.A05 = r1
        L_0x062c:
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0690 }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0690 }
            r9 = 1024(0x400, double:5.06E-321)
            r2.setLength(r9)     // Catch:{ all -> 0x068b }
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch:{ all -> 0x068b }
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ all -> 0x068b }
            r7 = 0
            java.nio.MappedByteBuffer r0 = r5.map(r6, r7, r9)     // Catch:{ all -> 0x068b }
            r4.A01 = r0     // Catch:{ all -> 0x068b }
            r0.position(r3)     // Catch:{ all -> 0x068b }
            java.nio.MappedByteBuffer r0 = r4.A01     // Catch:{ all -> 0x068b }
            byte[] r6 = X.C17080uV.A09     // Catch:{ all -> 0x068b }
            r0.put(r6)     // Catch:{ all -> 0x068b }
            java.nio.MappedByteBuffer r1 = r4.A01     // Catch:{ all -> 0x068b }
            int r5 = X.C17080uV.A07     // Catch:{ all -> 0x068b }
            int r0 = r5 + -1
            r1.position(r0)     // Catch:{ all -> 0x068b }
            java.nio.MappedByteBuffer r1 = r4.A01     // Catch:{ all -> 0x068b }
            r0 = 10
            r1.put(r0)     // Catch:{ all -> 0x068b }
            java.nio.MappedByteBuffer r0 = r4.A01     // Catch:{ all -> 0x068b }
            r0.put(r6)     // Catch:{ all -> 0x068b }
            java.nio.MappedByteBuffer r0 = r4.A01     // Catch:{ all -> 0x068b }
            r0.position(r3)     // Catch:{ all -> 0x068b }
            java.nio.MappedByteBuffer r1 = r4.A01     // Catch:{ all -> 0x068b }
            java.lang.String r0 = X.C17080uV.A08     // Catch:{ all -> 0x068b }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x068b }
            r1.put(r0)     // Catch:{ all -> 0x068b }
            java.nio.MappedByteBuffer r1 = r4.A01     // Catch:{ all -> 0x068b }
            int r0 = r5 + 2
            r1.position(r0)     // Catch:{ all -> 0x068b }
            X.2QQ r0 = new X.2QQ     // Catch:{ all -> 0x068b }
            r0.<init>()     // Catch:{ all -> 0x068b }
            r4.A00 = r0     // Catch:{ all -> 0x068b }
            r0 = 1
            r4.A06 = r0     // Catch:{ all -> 0x068b }
            r2.close()     // Catch:{ IOException -> 0x0690 }
            return
        L_0x068b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x068f }
        L_0x068f:
            throw r0     // Catch:{ IOException -> 0x0690 }
        L_0x0690:
            r4.A06 = r3
            return
        L_0x0693:
            java.lang.Object r1 = r2.A00
            X.0so r1 = (X.C16300so) r1
            java.lang.Object r3 = r2.A01
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r0 = "log_files_upload"
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            r4 = 0
            r5 = 1
            r6 = 1
            r7 = 1
            r1.A04(r2, r3, r4, r5, r6, r7)
            return
        L_0x06ae:
            java.lang.Object r0 = r2.A00
            com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment r0 = (com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment) r0
            java.lang.Object r2 = r2.A01
            java.util.List r2 = (java.util.List) r2
            X.0xS r1 = r0.A07
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r0, r2)
            return
        L_0x06c1:
            java.lang.Object r1 = r2.A01
            X.0pN r1 = (X.C14550pN) r1
            r0 = 9
            com.obwhatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r0 = com.obwhatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A01(r0)
            r1.Afc(r0)
            return
        L_0x06cf:
            java.lang.Object r1 = r2.A00
            X.26f r1 = (X.C449126f) r1
            java.lang.Object r0 = r2.A01
            X.01A r0 = (X.AnonymousClass01A) r0
            r1.A02(r0)
            return
        L_0x06db:
            java.lang.Object r3 = r2.A00
            X.2JC r3 = (X.AnonymousClass2JC) r3
            java.lang.Object r4 = r2.A01
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            com.obwhatsapp.conversationslist.ConversationsFragment r2 = r3.A0L
            X.0xS r1 = r2.A1L
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r5 = r1.A01(r0, r4)
            int r6 = r4.size()
            X.0pt r0 = r2.A0O
            r7 = 4
            com.facebook.redex.RunnableRunnableShape0S0301000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0301000_I0
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0K(r2)
            return
        L_0x0700:
            java.lang.Object r4 = r2.A00
            X.2JC r4 = (X.AnonymousClass2JC) r4
            java.lang.Object r0 = r2.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            int r3 = r0.size()
            java.util.Iterator r2 = r0.iterator()
        L_0x0710:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0724
            java.lang.Object r1 = r2.next()
            X.0rv r1 = (X.C15830rv) r1
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = r4.A0L
            X.0xS r0 = r0.A1L
            r0.A00(r1)
            goto L_0x0710
        L_0x0724:
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = r4.A0L
            X.0pt r2 = r0.A0O
            android.content.res.Resources r1 = r0.A03()
            r0 = 2131755380(0x7f100174, float:1.9141638E38)
            java.lang.String r1 = r1.getQuantityString(r0, r3)
            r0 = 0
            r2.A0I(r1, r0)
            return
        L_0x0738:
            java.lang.Object r4 = r2.A00
            com.obwhatsapp.conversationslist.ConversationsFragment r4 = (com.obwhatsapp.conversationslist.ConversationsFragment) r4
            java.lang.Object r1 = r2.A01
            X.0sL r1 = (X.C16050sL) r1
            X.0uk r0 = r4.A0i
            X.0sL r3 = r0.A02(r1)
            if (r3 == 0) goto L_0x0755
            X.0pt r2 = r4.A0O
            r1 = 36
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r4, r1, r3)
            r2.Acq(r0)
            return
        L_0x0755:
            java.lang.String r0 = "conversations/subgroupBottomSheet/parentGroupJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r3 = r4.A0K
            r2 = 1
            java.lang.String r1 = "wa-com-event/subgroupBottomSheet"
            java.lang.String r0 = "null_parent_group_jid"
            r3.AcB(r1, r0, r2)
            return
        L_0x0766:
            java.lang.Object r0 = r2.A00
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = (com.obwhatsapp.conversationslist.ConversationsFragment) r0
            java.lang.Object r2 = r2.A01
            X.0sL r2 = (X.C16050sL) r2
            X.1L3 r1 = r0.A0j
            X.00l r0 = r0.A0D()
            X.02C r3 = r0.AGM()
            X.0va r1 = r1.A03
            r0 = 1
            r1.A00(r2, r0)
            com.obwhatsapp.community.CommunitySubgroupsBottomSheet r2 = com.obwhatsapp.community.CommunitySubgroupsBottomSheet.A01(r2)
            X.050 r1 = new X.050
            r1.<init>(r3)
            java.lang.String r0 = "SUBGROUP_PICKER_TAG"
            r1.A0C(r2, r0)
            r1.A02()
            return
        L_0x0790:
            java.lang.Object r1 = r2.A00
            X.0rz r1 = (X.C15860rz) r1
            java.lang.Object r0 = r2.A01
            X.0uq r0 = (X.C17290uq) r0
            long r2 = r0.A01()
            android.content.SharedPreferences$Editor r1 = r1.A0K()
            java.lang.String r0 = "last_message_row_id_since_archive_open"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            return
        L_0x07aa:
            java.lang.Object r0 = r2.A00
            X.1wN r0 = (X.C41681wN) r0
            java.lang.Object r1 = r2.A01
            X.027 r0 = r0.A0B
            r0.A0B(r1)
            return
        L_0x07b6:
            java.lang.Object r0 = r2.A00
            X.1kZ r0 = (X.C34621kZ) r0
            java.lang.Object r5 = r2.A01
            X.0tZ r5 = (X.C16740tZ) r5
            X.0z4 r4 = r0.A0i
            X.1Vw r0 = r5.A11
            X.0rv r3 = r0.A00
            r2 = 1
            X.0tZ[] r1 = new X.C16740tZ[r2]
            r0 = 0
            r1[r0] = r5
            java.util.List r0 = java.util.Arrays.asList(r1)
            r4.A09(r3, r0, r2)
            return
        L_0x07d2:
            java.lang.Object r1 = r2.A00
            X.1kZ r1 = (X.C34621kZ) r1
            java.lang.Object r0 = r2.A01
            X.1kc r0 = (X.C34651kc) r0
            r1.A0I(r0)
            return
        L_0x07de:
            java.lang.Object r0 = r2.A00
            X.1kZ r0 = (X.C34621kZ) r0
            java.lang.Object r1 = r2.A01
            X.1cy r0 = r0.A0n
            r0.A0B(r1)
            return
        L_0x07ea:
            java.lang.Object r6 = r2.A00
            X.1yj r6 = (X.C42821yj) r6
            java.lang.Object r5 = r2.A01
            X.0tZ r5 = (X.C16740tZ) r5
            long r3 = r6.A02
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0807
            X.1yV r0 = r6.A22
            X.1yR r0 = (X.AnonymousClass1yR) r0
            X.2DF r0 = r0.A00
            X.0yi r0 = r0.A0J
            r0.A07()
            r6.A02 = r1
        L_0x0807:
            com.obwhatsapp.conversation.ConversationListView r0 = r6.A1n
            X.1Vw r2 = r5.A11
            X.1bb r1 = r0.A00(r2)
            if (r1 == 0) goto L_0x0816
            r0 = 1
            r1.A1H(r5, r0)
            return
        L_0x0816:
            com.obwhatsapp.conversation.ConversationListView r0 = r6.A1n
            X.2Qa r0 = r0.getConversationCursorAdapter()
            java.util.HashSet r0 = r0.A0T
            r0.add(r2)
            return
        L_0x0822:
            java.lang.Object r1 = r2.A00
            X.1yj r1 = (X.C42821yj) r1
            java.lang.Object r12 = r2.A01
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            java.lang.String r0 = r1.A4Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0920
            java.lang.String r0 = r1.A4R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0920
            X.1Hn r2 = r1.A38
            java.lang.String r13 = r1.A4Q
            java.lang.String r14 = r1.A4R
            r15 = 0
            long r16 = java.lang.System.currentTimeMillis()
            r18 = 0
            X.2IP r11 = new X.2IP
            r11.<init>(r12, r13, r14, r15, r16, r18)
            com.whatsapp.jid.UserJid r4 = r11.A03
            X.2IP r0 = r2.A00(r4)
            if (r0 == 0) goto L_0x08b7
            X.1O8 r10 = r2.A01
            X.0tq r0 = r10.A02     // Catch:{ Exception -> 0x08b3 }
            X.0tf r7 = r0.A02()     // Catch:{ Exception -> 0x08b3 }
            r0 = 5
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x08ae }
            r8.<init>(r0)     // Catch:{ all -> 0x08ae }
            java.lang.String r1 = "data"
            java.lang.String r0 = r11.A04     // Catch:{ all -> 0x08ae }
            r8.put(r1, r0)     // Catch:{ all -> 0x08ae }
            java.lang.String r1 = "source"
            java.lang.String r0 = r11.A05     // Catch:{ all -> 0x08ae }
            r8.put(r1, r0)     // Catch:{ all -> 0x08ae }
            java.lang.String r1 = "biz_count"
            int r0 = r11.A00     // Catch:{ all -> 0x08ae }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x08ae }
            r8.put(r1, r0)     // Catch:{ all -> 0x08ae }
            java.lang.String r1 = "has_user_sent_last_message"
            boolean r0 = r11.A02     // Catch:{ all -> 0x08ae }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x08ae }
            r8.put(r1, r0)     // Catch:{ all -> 0x08ae }
            java.lang.String r3 = "last_interaction"
            long r0 = r11.A01     // Catch:{ all -> 0x08ae }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08ae }
            r8.put(r3, r0)     // Catch:{ all -> 0x08ae }
            X.0tg r9 = r7.A02     // Catch:{ all -> 0x08ae }
            java.lang.String r6 = "conversion_tuples"
            java.lang.String r5 = "jid_row_id=?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x08ae }
            X.14v r0 = r10.A01     // Catch:{ all -> 0x08ae }
            long r0 = r0.A01(r4)     // Catch:{ all -> 0x08ae }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ae }
            r3[r15] = r0     // Catch:{ all -> 0x08ae }
            r9.A00(r6, r8, r5, r3)     // Catch:{ all -> 0x08ae }
            r7.close()     // Catch:{ Exception -> 0x08b3 }
            goto L_0x091a
        L_0x08ae:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x08b2 }
        L_0x08b2:
            throw r0     // Catch:{ Exception -> 0x08b3 }
        L_0x08b3:
            r1 = move-exception
            java.lang.String r0 = "conversionTupleMessageStore/updateConversionTuple error accessing db"
            goto L_0x0917
        L_0x08b7:
            X.1O8 r1 = r2.A01
            X.0tq r0 = r1.A02     // Catch:{ Exception -> 0x0914 }
            X.0tf r5 = r0.A02()     // Catch:{ Exception -> 0x0914 }
            r0 = 6
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x090f }
            r6.<init>(r0)     // Catch:{ all -> 0x090f }
            java.lang.String r3 = "jid_row_id"
            X.14v r0 = r1.A01     // Catch:{ all -> 0x090f }
            long r0 = r0.A01(r4)     // Catch:{ all -> 0x090f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x090f }
            r6.put(r3, r0)     // Catch:{ all -> 0x090f }
            java.lang.String r1 = "source"
            java.lang.String r0 = r11.A05     // Catch:{ all -> 0x090f }
            r6.put(r1, r0)     // Catch:{ all -> 0x090f }
            java.lang.String r1 = "data"
            java.lang.String r0 = r11.A04     // Catch:{ all -> 0x090f }
            r6.put(r1, r0)     // Catch:{ all -> 0x090f }
            java.lang.String r1 = "biz_count"
            int r0 = r11.A00     // Catch:{ all -> 0x090f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x090f }
            r6.put(r1, r0)     // Catch:{ all -> 0x090f }
            java.lang.String r1 = "has_user_sent_last_message"
            boolean r0 = r11.A02     // Catch:{ all -> 0x090f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x090f }
            r6.put(r1, r0)     // Catch:{ all -> 0x090f }
            java.lang.String r3 = "last_interaction"
            long r0 = r11.A01     // Catch:{ all -> 0x090f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x090f }
            r6.put(r3, r0)     // Catch:{ all -> 0x090f }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x090f }
            java.lang.String r0 = "conversion_tuples"
            r1.A02(r6, r0)     // Catch:{ all -> 0x090f }
            r5.close()     // Catch:{ Exception -> 0x0914 }
            goto L_0x091a
        L_0x090f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0913 }
        L_0x0913:
            throw r0     // Catch:{ Exception -> 0x0914 }
        L_0x0914:
            r1 = move-exception
            java.lang.String r0 = "conversionTupleMessageStore/insertConversionTuple error accessing db"
        L_0x0917:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x091a:
            android.util.LruCache r0 = r2.A00
            r0.put(r4, r11)
            return
        L_0x0920:
            X.1Hn r0 = r1.A38
            r0.A00(r12)
            return
        L_0x0926:
            java.lang.Object r1 = r2.A00
            X.1yj r1 = (X.C42821yj) r1
            java.lang.Object r0 = r2.A01
            X.2Qb r0 = (X.AnonymousClass2Qb) r0
            X.1yV r2 = r1.A22
            android.content.Context r2 = (android.content.Context) r2
            X.0ph r1 = r1.A57
            X.1ZT r0 = r0.A06
            android.content.Intent r0 = r1.A0x(r2, r0)
            r2.startActivity(r0)
            return
        L_0x093e:
            monitor-enter(r2)
            java.lang.Object r0 = r2.A01     // Catch:{ all -> 0x0977 }
            X.1rn r0 = (X.C39021rn) r0     // Catch:{ all -> 0x0977 }
            monitor-exit(r2)
            r4 = 0
            if (r0 == 0) goto L_0x096f
            X.0tm r0 = r0.A0F()
            if (r0 == 0) goto L_0x096f
            byte[] r3 = r0.A07()
            if (r3 == 0) goto L_0x096f
            r1 = 0
            int r0 = r3.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r1, r0)
            if (r1 == 0) goto L_0x096f
            int r0 = r1.getHeight()
            if (r0 == 0) goto L_0x096f
            int r0 = r1.getWidth()
            if (r0 == 0) goto L_0x096f
            java.lang.Object r0 = r2.A00
            X.028 r0 = (X.AnonymousClass028) r0
            r0.A09(r1)
            return
        L_0x096f:
            java.lang.Object r0 = r2.A00
            X.028 r0 = (X.AnonymousClass028) r0
            r0.A09(r4)
            return
        L_0x0977:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x097a:
            java.lang.Object r3 = r2.A00
            X.10I r3 = (X.AnonymousClass10I) r3
            java.lang.Object r8 = r2.A01
            java.util.Map r8 = (java.util.Map) r8
            r7 = 0
            X.0xU r6 = r3.A01
            java.util.Collection r0 = r8.values()
            java.util.Set r5 = r6.A0J(r0, r7)
            X.C18450wi.A0B(r5)
            X.10G r1 = r3.A03
            java.util.Collection r0 = r8.values()
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x09b7
            X.0pt r4 = r3.A00
            X.013 r3 = r3.A02
            r2 = 2131755383(0x7f100177, float:1.9141644E38)
            java.util.Collection r0 = r8.values()
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.String r0 = r3.A0E(r0, r2)
            r4.A0I(r0, r7)
            r6.A0U(r5)
            return
        L_0x09b7:
            r6.A0V(r5)
            return
        L_0x09bb:
            java.lang.Object r7 = r2.A00
            X.10D r7 = (X.AnonymousClass10D) r7
            java.lang.Object r6 = r2.A01
            java.util.Map r6 = (java.util.Map) r6
            r2 = 0
            r5 = 1
            X.10C r1 = r7.A02
            int r0 = r6.size()
            r1.A00(r2, r0)
            X.1dR r4 = r1.A00
            java.lang.String r9 = "update_star_message_store"
            r4.A08(r9)
            X.0tb r8 = r7.A00
            java.util.Collection r3 = r6.values()
            X.10G r0 = r8.A0p
            r0.A01(r3)
            X.0sq r2 = r8.A1Y
            r1 = 33
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r3, r1, r8)
            r2.Acl(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r13 = r3.iterator()
            r2 = 0
            r10 = 0
        L_0x09f9:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0a33
            java.lang.Object r1 = r13.next()
            X.0tZ r1 = (X.C16740tZ) r1
            byte r12 = r1.A10
            r0 = 20
            if (r12 != r0) goto L_0x09f9
            r12 = r1
            X.1rB r12 = (X.C38641rB) r12
            boolean r0 = r12.A1B()
            if (r0 == 0) goto L_0x0a2e
            if (r10 != 0) goto L_0x0a18
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
        L_0x0a18:
            X.0ta r0 = r12.A02
            if (r0 == 0) goto L_0x09f9
            boolean r0 = r0.A0P
            if (r0 == 0) goto L_0x09f9
            long r0 = r1.A0I
            long r2 = java.lang.Math.max(r2, r0)
            X.1jm r0 = r12.A1A()
            r11.add(r0)
            goto L_0x09f9
        L_0x0a2e:
            if (r10 != 0) goto L_0x0a18
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            goto L_0x0a18
        L_0x0a33:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0a44
            boolean r1 = X.AnonymousClass01E.A01()
            X.1CX r0 = r8.A1U
            if (r1 == 0) goto L_0x0a8c
            r0.A0F(r11)
        L_0x0a44:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r10)
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r10 = r0.longValue()
            java.lang.Object r3 = r1.second
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a6b
            if (r3 == 0) goto L_0x0a6b
            X.0pt r2 = r8.A03
            r1 = 31
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r3, r1, r8)
            r2.A0K(r0)
        L_0x0a6b:
            r4.A07(r9)
            java.lang.String r2 = "sync"
            r4.A08(r2)
            X.0xU r1 = r7.A01
            java.util.Collection r0 = r6.values()
            java.util.Set r0 = r1.A0J(r0, r5)
            X.C18450wi.A0B(r0)
            r1.A0V(r0)
            r4.A07(r2)
            r0 = 2
            r4.A0C(r0)
            return
        L_0x0a8c:
            r0.A0G(r11, r5)
            goto L_0x0a44
        L_0x0a90:
            java.lang.Object r4 = r2.A00
            X.1bb r4 = (X.C30011bb) r4
            java.lang.Object r3 = r2.A01
            X.0tZ r3 = (X.C16740tZ) r3
            int r1 = r3.A0C
            r0 = 7
            if (r1 != r0) goto L_0x0ab2
            r3.A0R()
            boolean r0 = r3 instanceof X.C38541qx
            if (r0 == 0) goto L_0x0abf
            X.15G r1 = r4.A16
            X.1Vw r0 = r3.A11
            X.1Py r2 = r1.A0G
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 0
            r2.A07(r1, r0)
        L_0x0ab2:
            X.0pt r2 = r4.A0J
            r1 = 13
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r4, r1, r3)
            r2.A0K(r0)
            return
        L_0x0abf:
            X.0t6 r0 = r4.A0w
            r0.A0a(r3)
            goto L_0x0ab2
        L_0x0ac5:
            java.lang.Object r3 = r2.A00
            X.1bb r3 = (X.C30011bb) r3
            java.lang.Object r2 = r2.A01
            X.0tZ r2 = (X.C16740tZ) r2
            X.1ra r2 = (X.C38891ra) r2
            android.widget.FrameLayout r1 = r3.A07
            r0 = 2131365625(0x7f0a0ef9, float:1.835112E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 1
            r3.A16(r1, r2, r0)
            return
        L_0x0add:
            java.lang.Object r3 = r2.A00
            X.1bb r3 = (X.C30011bb) r3
            java.lang.Object r2 = r2.A01
            X.0tZ r2 = (X.C16740tZ) r2
            byte r1 = r2.A10
            boolean r0 = X.C38621r6.A0N(r1)
            if (r0 != 0) goto L_0x0af9
            boolean r0 = X.C30921dB.A00(r1)
            if (r0 != 0) goto L_0x0af9
            X.0tb r0 = r3.A0R
            r0.A0N(r2)
            return
        L_0x0af9:
            X.10X r0 = r3.A0M
            X.0tY r2 = (X.C16730tY) r2
            r0.A05(r2)
            return
        L_0x0b01:
            java.lang.Object r1 = r2.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r2.A01
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            return
        L_0x0b0d:
            java.lang.Object r0 = r2.A00
            X.1cT r0 = (X.C30511cT) r0
            java.lang.Object r6 = r2.A01
            java.lang.Number r6 = (java.lang.Number) r6
            android.widget.TextView r5 = r0.A09
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131755264(0x7f100100, float:1.9141402E38)
            int r2 = r6.intValue()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r6
            java.lang.String r0 = r4.getQuantityString(r3, r2, r1)
            r5.setText(r0)
            return
        L_0x0b30:
            java.lang.Object r0 = r2.A00
            X.2Qc r0 = (X.C48962Qc) r0
            java.lang.Object r1 = r2.A01
            X.04N r1 = (X.AnonymousClass04N) r1
            X.0sH r0 = r0.A06
            r1.accept(r0)
            return
        L_0x0b3e:
            java.lang.Object r4 = r2.A00
            X.2Qc r4 = (X.C48962Qc) r4
            java.lang.Object r3 = r2.A01
            X.0uk r1 = r4.A0B
            X.0sL r0 = r4.A0O
            X.0sL r1 = r1.A02(r0)
            if (r1 != 0) goto L_0x0b5b
            X.0pt r2 = r4.A0M
            r1 = 26
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6
            r0.<init>(r3, r1)
            r2.Acq(r0)
            return
        L_0x0b5b:
            X.0sG r0 = r4.A0D
            X.0sH r0 = r0.A08(r1)
            r4.A06 = r0
            X.0pt r2 = r4.A0M
            r1 = 10
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r4, r1, r3)
            r2.Acq(r0)
            return
        L_0x0b70:
            java.lang.Object r0 = r2.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r2.A01
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r1)
            return
        L_0x0b80:
            java.lang.Object r1 = r2.A00
            X.0yh r1 = (X.C19600yh) r1
            java.lang.Object r0 = r2.A01
            X.27t r0 = (X.C452727t) r0
            r1.A01(r0)
            return
        L_0x0b8c:
            java.lang.Object r3 = r2.A00
            X.16l r3 = (X.C220516l) r3
            java.lang.Object r1 = r2.A01
            java.util.List r1 = (java.util.List) r1
            java.util.Set r0 = java.util.Collections.emptySet()
            r3.A01(r1, r0)
            return
        L_0x0b9c:
            r1 = 0
            X.1U3 r0 = r4.A0J
            r2.A05(r0, r3, r1)
            return
        L_0x0ba3:
            r0 = move-exception
            if (r2 == 0) goto L_0x0ba9
            r2.close()     // Catch:{ all -> 0x0ba9 }
        L_0x0ba9:
            throw r0     // Catch:{ all -> 0x0baa }
        L_0x0baa:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0bae }
        L_0x0bae:
            throw r0
        L_0x0baf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0bb5:
            return
        L_0x0bb6:
            r2 = move-exception
            java.lang.String r1 = "ContactDiscoverySyncHelper/sendContactDiscoveryRequestAndReportStalenessFor/exception "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape5S0200000_I0_3.run():void");
    }
}
