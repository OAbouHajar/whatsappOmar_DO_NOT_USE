package com.facebook.redex;

public class RunnableRunnableShape0S0301000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableRunnableShape0S0301000_I0(Object obj, Object obj2, Object obj3, int i2, int i3) {
        this.A04 = i3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02e3, code lost:
        if (r8.A13 == r9) goto L_0x02e5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x033f */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0291  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:106:0x0321=Splitter:B:106:0x0321, B:117:0x033f=Splitter:B:117:0x033f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A04
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x022e;
                case 2: goto L_0x0093;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00d8;
                case 5: goto L_0x010a;
                case 6: goto L_0x011e;
                case 7: goto L_0x0151;
                case 8: goto L_0x0163;
                case 9: goto L_0x01ed;
                case 10: goto L_0x0345;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r13.A01
            X.15O r5 = (X.AnonymousClass15O) r5
            java.lang.Object r2 = r13.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r4 = r13.A03
            android.net.Uri r4 = (android.net.Uri) r4
            int r3 = r13.A00
            X.2PQ r1 = new X.2PQ     // Catch:{ Exception -> 0x002d }
            r1.<init>(r3)     // Catch:{ Exception -> 0x002d }
            android.media.MediaPlayer r0 = r1.A00     // Catch:{ Exception -> 0x002d }
            r0.setDataSource(r2, r4)     // Catch:{ Exception -> 0x002d }
            r1.A05()     // Catch:{ Exception -> 0x002d }
            r1.A08()     // Catch:{ Exception -> 0x002d }
            X.1bx r0 = r5.A00     // Catch:{ Exception -> 0x002d }
            if (r0 == 0) goto L_0x002a
            r0.A06()     // Catch:{ Exception -> 0x002d }
        L_0x002a:
            r5.A00 = r1     // Catch:{ Exception -> 0x002d }
            return
        L_0x002d:
            r2 = move-exception
            java.lang.String r0 = "asyncaudioplayer/play/e Error playing URI: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = " with stream: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w(r0, r2)
            return
        L_0x0048:
            java.lang.Object r2 = r13.A01
            X.0yz r2 = (X.C19780yz) r2
            java.lang.Object r1 = r13.A02
            X.0rv r1 = (X.C15830rv) r1
            int r0 = r13.A00
            java.lang.Object r6 = r13.A03
            X.0t9 r6 = (X.C16490t9) r6
            java.util.ArrayList r0 = r2.A03(r1, r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x005e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0284
            java.lang.Object r4 = r5.next()
            X.0tZ r4 = (X.C16740tZ) r4
            if (r4 == 0) goto L_0x0284
            X.3rB r3 = new X.3rB
            r3.<init>()
            X.1Vw r0 = r4.A11
            java.lang.String r0 = r0.A01
            r3.A02 = r0
            java.lang.String r0 = X.C42601y5.A00(r4)
            r3.A01 = r0
            byte r2 = r4.A10
            int r1 = r4.A08
            boolean r0 = X.C30921dB.A04(r4)
            int r0 = X.C42141xI.A00(r2, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A00 = r0
            r6.A06(r3)
            goto L_0x005e
        L_0x0093:
            java.lang.Object r4 = r13.A01
            X.0uU r4 = (X.C17070uU) r4
            java.lang.Object r0 = r13.A02
            int r1 = r13.A00
            java.lang.Object r3 = r13.A03
            X.00F r3 = (X.AnonymousClass00F) r3
            X.2TU r2 = new X.2TU
            r2.<init>()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
            X.1Gs r0 = r4.A01
            java.lang.Long r0 = r0.A00()
            r2.A01 = r0
            X.0t9 r1 = r4.A00
            int r0 = r3.A03
            r1.A07(r2, r0)
            return
        L_0x00c4:
            java.lang.Object r0 = r13.A01
            X.17Z r0 = (X.AnonymousClass17Z) r0
            java.lang.Object r3 = r13.A02
            X.0rv r3 = (X.C15830rv) r3
            int r2 = r13.A00
            java.lang.Object r1 = r13.A03
            java.util.Collection r1 = (java.util.Collection) r1
            X.0z4 r0 = r0.A0C
            r0.A09(r3, r1, r2)
            return
        L_0x00d8:
            java.lang.Object r8 = r13.A01
            X.2JC r8 = (X.AnonymousClass2JC) r8
            int r9 = r13.A00
            java.lang.Object r7 = r13.A02
            java.lang.Object r6 = r13.A03
            com.obwhatsapp.conversationslist.ConversationsFragment r5 = r8.A0L
            android.content.res.Resources r4 = r5.A03()
            r3 = 2131755020(0x7f10000c, float:1.9140907E38)
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0 = 0
            r2[r0] = r1
            java.lang.String r3 = r4.getQuantityString(r3, r9, r2)
            r0 = 2131892358(0x7f121886, float:1.9419462E38)
            java.lang.String r2 = r5.A0J(r0)
            r1 = 4
            com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0
            r0.<init>(r8, r7, r6, r1)
            r5.A1V(r3, r2, r0)
            return
        L_0x010a:
            java.lang.Object r0 = r13.A01
            X.0xS r0 = (X.C18910xS) r0
            java.lang.Object r3 = r13.A02
            X.0rv r3 = (X.C15830rv) r3
            java.lang.Object r2 = r13.A03
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r1 = r13.A00
            X.17Z r0 = r0.A03
            r0.A02(r3, r2, r1)
            return
        L_0x011e:
            java.lang.Object r0 = r13.A01
            X.0t6 r0 = (X.C16460t6) r0
            java.lang.Object r9 = r13.A02
            X.0tZ r9 = (X.C16740tZ) r9
            int r8 = r13.A00
            java.lang.Object r7 = r13.A03
            java.util.concurrent.CountDownLatch r7 = (java.util.concurrent.CountDownLatch) r7
            X.0xq r6 = r0.A0r
            java.lang.Iterable r0 = r6.A01()
            java.util.Iterator r5 = r0.iterator()
        L_0x0136:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x014d
            java.lang.Object r4 = r5.next()
            X.0xV r4 = (X.C18940xV) r4
            long r2 = r6.A00
            r0 = 1
            long r2 = r2 + r0
            r6.A00 = r2
            r4.A05(r9, r8)
            goto L_0x0136
        L_0x014d:
            r7.countDown()
            return
        L_0x0151:
            java.lang.Object r3 = r13.A01
            X.1HK r3 = (X.AnonymousClass1HK) r3
            java.lang.Object r2 = r13.A02
            X.1Vw r2 = (X.C28381Vw) r2
            int r1 = r13.A00
            java.lang.Object r0 = r13.A03
            X.2C0 r0 = (X.AnonymousClass2C0) r0
            r3.A03(r0, r2, r1)
            return
        L_0x0163:
            java.lang.Object r3 = r13.A01
            com.obwhatsapp.group.GroupChatInfoActivity r3 = (com.obwhatsapp.group.GroupChatInfoActivity) r3
            java.lang.Object r7 = r13.A02
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r4 = r13.A03
            X.0sH r4 = (X.C16010sH) r4
            int r6 = r13.A00
            r3.invalidateOptionsMenu()
            r0 = 2131364314(0x7f0a09da, float:1.8348462E38)
            android.view.View r5 = X.AnonymousClass00T.A05(r3, r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            X.013 r2 = r3.A08
            r0 = 2131231078(0x7f080166, float:1.8078227E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r3, r0)
            X.25m r0 = new X.25m
            r0.<init>(r1, r2)
            r5.setImageDrawable(r0)
            r5 = 0
            r7.setVisibility(r5)
            r1 = 5
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r0 = new com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2
            r0.<init>(r3, r1)
            r7.setOnClickListener(r0)
            r0 = 2131364316(0x7f0a09dc, float:1.8348466E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r3, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.2Ao r0 = r3.A0h
            r0.A06(r1, r4)
            X.15l r0 = r3.A1J
            boolean r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x01b6
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r0)
        L_0x01b6:
            r0 = 2131364318(0x7f0a09de, float:1.834847E38)
            android.view.View r2 = X.AnonymousClass00T.A05(r3, r0)
            com.obwhatsapp.TextEmojiLabel r2 = (com.obwhatsapp.TextEmojiLabel) r2
            X.0sP r0 = r3.A0f
            java.lang.String r1 = r0.A08(r4)
            r0 = 0
            r2.A0I(r0, r1)
            X.AnonymousClass1UP.A06(r2)
            r0 = 2131364317(0x7f0a09dd, float:1.8348468E38)
            android.view.View r4 = X.AnonymousClass00T.A05(r3, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.content.res.Resources r3 = r3.getResources()
            r2 = 2131755204(0x7f1000c4, float:1.914128E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1[r5] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r6, r1)
            r4.setText(r0)
            return
        L_0x01ed:
            java.lang.Object r0 = r13.A01
            X.12c r0 = (X.C209212c) r0
            java.lang.Object r4 = r13.A02
            X.0tY r4 = (X.C16730tY) r4
            java.lang.Object r3 = r13.A03
            X.0ta r3 = (X.C16750ta) r3
            int r2 = r13.A00
            X.0xf r5 = r0.A0f
            byte r1 = r4.A10
            int r0 = r4.A08
            X.1XK r0 = X.C31831f6.A01(r1, r0)
            java.lang.String r6 = r0.A02
            java.lang.String r7 = r4.A04
            java.lang.String r8 = r3.A0G
            r9 = 1
            if (r2 != 0) goto L_0x020f
            r9 = 2
        L_0x020f:
            r0 = 1
            X.AnonymousClass00B.A0G(r0)
            if (r6 != 0) goto L_0x0217
            java.lang.String r6 = "image"
        L_0x0217:
            X.0pd r2 = r5.A09
            r1 = 15
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x0284
            X.0sq r0 = r5.A0F
            X.1qP r4 = new X.1qP
            r4.<init>(r5, r6, r7, r8, r9)
            r0.Acl(r4)
            return
        L_0x022e:
            java.lang.Object r6 = r13.A01
            X.0w1 r6 = (X.C18020w1) r6
            java.lang.Object r5 = r13.A02
            X.1xN r5 = (X.C42191xN) r5
            java.lang.Object r8 = r13.A03
            X.0tZ r8 = (X.C16740tZ) r8
            int r7 = r13.A00
            int r0 = X.AnonymousClass1U8.A00()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0R = r0
            java.lang.Boolean r0 = r5.A0A
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02bc
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0251:
            r5.A09 = r0
        L_0x0253:
            java.lang.Boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x025d
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x027f
        L_0x025d:
            java.lang.Boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0267
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x027f
        L_0x0267:
            java.lang.Boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0285
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0285
            java.lang.Long r0 = r5.A0O
            if (r0 == 0) goto L_0x0285
            long r3 = r0.longValue()
            r1 = 50
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0285
        L_0x027f:
            X.0t9 r0 = r6.A0C
            r0.A05(r5)
        L_0x0284:
            return
        L_0x0285:
            X.0pd r2 = r6.A0B
            r1 = 1861(0x745, float:2.608E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            if (r7 >= r0) goto L_0x027f
            java.lang.Long r0 = r5.A0W
            if (r0 == 0) goto L_0x02a7
            long r3 = r0.longValue()
            r1 = 50
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02a7
            X.0t9 r1 = r6.A0C
            X.00F r0 = X.C16470t7.DEFAULT_SAMPLING_RATE
        L_0x02a3:
            r1.A0A(r5, r0)
            return
        L_0x02a7:
            java.lang.Integer r0 = r5.A0E
            if (r0 == 0) goto L_0x0333
            int r1 = r0.intValue()
            r0 = 14
            if (r1 == r0) goto L_0x02b7
            r0 = 15
            if (r1 != r0) goto L_0x0333
        L_0x02b7:
            X.0t9 r1 = r6.A0C
            X.00F r0 = X.C18020w1.A0O
            goto L_0x02a3
        L_0x02bc:
            X.1Vw r0 = r8.A11
            X.0rv r4 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r4)
            if (r0 == 0) goto L_0x0253
            android.util.LruCache r3 = r6.A00
            java.lang.Object r0 = r3.get(r4)
            r11 = -1
            if (r0 == 0) goto L_0x02ec
            java.lang.Object r0 = r3.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            long r9 = r0.longValue()
        L_0x02da:
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x02e5
            long r2 = r8.A13
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x02e6
        L_0x02e5:
            r0 = 1
        L_0x02e6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0251
        L_0x02ec:
            if (r4 == 0) goto L_0x02e5
            X.0uq r2 = r6.A08
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]
            X.0ts r0 = r2.A02
            long r0 = r0.A02(r4)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r9[r0] = r1
            X.0tq r0 = r2.A06
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0340 }
            java.lang.String r0 = "SELECT _id FROM available_message_view WHERE chat_row_id = ? AND message_type NOT IN ('7') AND from_me = 1  ORDER BY sort_id ASC LIMIT 1"
            android.database.Cursor r1 = r1.A08(r0, r9)     // Catch:{ all -> 0x0340 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0339 }
            if (r0 == 0) goto L_0x031f
            java.lang.String r0 = "_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0339 }
            long r9 = r1.getLong(r0)     // Catch:{ all -> 0x0339 }
            goto L_0x0321
        L_0x031f:
            r9 = -1
        L_0x0321:
            r1.close()     // Catch:{ all -> 0x0340 }
            r2.close()
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x02da
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r3.put(r4, r0)
            goto L_0x02da
        L_0x0333:
            X.0t9 r0 = r6.A0C
            r0.A06(r5)
            return
        L_0x0339:
            r0 = move-exception
            if (r1 == 0) goto L_0x033f
            r1.close()     // Catch:{ all -> 0x033f }
        L_0x033f:
            throw r0     // Catch:{ all -> 0x0340 }
        L_0x0340:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0344 }
        L_0x0344:
            throw r0
        L_0x0345:
            java.lang.Object r3 = r13.A01
            X.11r r3 = (X.C208111r) r3
            int r2 = r13.A00
            java.lang.Object r1 = r13.A02
            X.1Vv r1 = (X.C28371Vv) r1
            java.lang.Object r0 = r13.A03
            X.1ci r0 = (X.C30641ci) r0
            r3.A02(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0301000_I0.run():void");
    }
}
