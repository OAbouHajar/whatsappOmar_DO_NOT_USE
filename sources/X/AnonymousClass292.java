package X;

/* renamed from: X.292  reason: invalid class name */
public class AnonymousClass292 extends C16690tT {
    public final /* synthetic */ AnonymousClass1H7 A00;

    public AnonymousClass292(AnonymousClass1H7 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r34) {
        /*
            r33 = this;
            r19 = 0
            r0 = 0
            r2 = r33
            X.1H7 r5 = r2.A00
            X.119 r2 = r5.A08
            java.util.ArrayList r15 = r2.A01()
            X.15G r12 = r5.A09
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.0t3 r2 = r12.A03
            long r17 = r2.A00()
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r17 = r17 - r2
            java.util.List r2 = X.AnonymousClass15G.A0O
            java.util.Iterator r16 = r2.iterator()
        L_0x0026:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x00e9
            java.lang.Object r2 = r16.next()
            java.lang.Number r2 = (java.lang.Number) r2
            byte r7 = r2.byteValue()
            X.0tq r2 = r12.A0B
            X.0tf r10 = r2.get()
            X.1Py r9 = r12.A0G     // Catch:{ all -> 0x00e4 }
            X.0tg r8 = r10.A02     // Catch:{ all -> 0x00e4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r3.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = X.AnonymousClass23Q.A00(r7)     // Catch:{ all -> 0x00e4 }
            r3.append(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = " WHERE message_add_on.from_me = 1  AND message_add_on.status < 4 AND message_add_on.timestamp > ? AND message_add_on.message_add_on_type = ?"
            r3.append(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00e4 }
            r2 = 2
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x00e4 }
            r2 = 0
            r4[r2] = r3     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00e4 }
            r2 = 1
            r4[r2] = r3     // Catch:{ all -> 0x00e4 }
            android.database.Cursor r8 = r8.A08(r6, r4)     // Catch:{ all -> 0x00e4 }
            java.util.HashMap r7 = X.AnonymousClass23W.A00(r8, r7)     // Catch:{ all -> 0x00dd }
        L_0x006e:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x00dd }
            if (r2 == 0) goto L_0x00d5
            X.1qx r6 = r9.A05(r8, r7)     // Catch:{ all -> 0x00dd }
            if (r6 != 0) goto L_0x0080
            java.lang.String r2 = "MessageAddOnManager/getMessageAddOnForParentMessage unexpected fmessage"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x00dd }
            goto L_0x006e
        L_0x0080:
            X.14v r2 = r12.A09     // Catch:{ all -> 0x00dd }
            r6.A13(r8, r2, r7)     // Catch:{ all -> 0x00dd }
            X.0th r4 = r12.A04     // Catch:{ all -> 0x00dd }
            long r2 = r6.A00     // Catch:{ all -> 0x00dd }
            X.0tZ r14 = r4.A00(r2)     // Catch:{ all -> 0x00dd }
            if (r14 != 0) goto L_0x0095
            java.lang.String r2 = "MessageAddOnManager/fillInMessageAddOnReactionForNotification parent message missing"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x00dd }
            goto L_0x006e
        L_0x0095:
            boolean r2 = r6 instanceof X.C39181s3     // Catch:{ all -> 0x00dd }
            if (r2 == 0) goto L_0x00be
            boolean r2 = r14 instanceof X.C39171s2     // Catch:{ all -> 0x00dd }
            if (r2 != 0) goto L_0x00a3
            java.lang.String r2 = "MessageAddOnManager/fillInMessageAddOn parent message not a poll for a poll vote"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x00dd }
            goto L_0x006e
        L_0x00a3:
            X.1Q3 r2 = r12.A0E     // Catch:{ all -> 0x00dd }
            r13 = r6
            X.1s3 r13 = (X.C39181s3) r13     // Catch:{ all -> 0x00dd }
            X.1Q2 r4 = r2.A07     // Catch:{ all -> 0x00dd }
            long r2 = r13.A13     // Catch:{ all -> 0x00dd }
            java.util.List r3 = r4.A00(r2)     // Catch:{ all -> 0x00dd }
            java.util.List r2 = r13.A05     // Catch:{ all -> 0x00dd }
            r2.clear()     // Catch:{ all -> 0x00dd }
            r2.addAll(r3)     // Catch:{ all -> 0x00dd }
            r2 = r14
            X.1s2 r2 = (X.C39171s2) r2     // Catch:{ all -> 0x00dd }
            X.AnonymousClass1Q3.A00(r2, r13)     // Catch:{ all -> 0x00dd }
        L_0x00be:
            X.1Vw r4 = r14.A11     // Catch:{ all -> 0x00dd }
            X.0rv r3 = r14.A0B()     // Catch:{ all -> 0x00dd }
            X.23X r2 = new X.23X     // Catch:{ all -> 0x00dd }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00dd }
            r6.A02 = r2     // Catch:{ all -> 0x00dd }
            X.23X r2 = X.AnonymousClass23Y.A01(r14)     // Catch:{ all -> 0x00dd }
            r6.A01 = r2     // Catch:{ all -> 0x00dd }
            r11.add(r6)     // Catch:{ all -> 0x00dd }
            goto L_0x006e
        L_0x00d5:
            r8.close()     // Catch:{ all -> 0x00e4 }
            r10.close()
            goto L_0x0026
        L_0x00dd:
            r0 = move-exception
            if (r8 == 0) goto L_0x00e3
            r8.close()     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            throw r0
        L_0x00e9:
            r15.addAll(r11)
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L_0x01ff
            X.0wP r2 = r5.A03
            r4 = 1
            int r8 = r2.A04(r4)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r13 = r15.iterator()
        L_0x0102:
            boolean r2 = r13.hasNext()
            r10 = 0
            if (r2 == 0) goto L_0x01e0
            java.lang.Object r9 = r13.next()
            X.0tZ r9 = (X.C16740tZ) r9
            boolean r2 = r5.A00(r9)
            if (r2 == 0) goto L_0x0102
            long r6 = r9.A18
            r11 = 0
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0123
            long r6 = android.os.SystemClock.uptimeMillis()
            r9.A18 = r6
        L_0x0123:
            boolean r2 = r9 instanceof X.C38541qx
            if (r2 != 0) goto L_0x012f
            X.0t6 r2 = r5.A06
            int r2 = r2.A07(r9)
            r9.A1H = r2
        L_0x012f:
            byte r6 = r9.A10
            r2 = 16
            r12 = 2
            if (r6 != r2) goto L_0x014c
            r10 = r9
            X.1d9 r10 = (X.C30901d9) r10
            int r2 = r10.A02
            if (r2 == r12) goto L_0x01d9
            X.0tb r9 = r5.A02
            X.0pt r7 = r9.A03
            r6 = 30
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r2 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r2.<init>(r10, r6, r9)
            r7.A0K(r2)
            goto L_0x0102
        L_0x014c:
            boolean r2 = r9 instanceof X.C16730tY
            if (r2 == 0) goto L_0x01d9
            r2 = r9
            X.0tY r2 = (X.C16730tY) r2
            X.0ta r11 = r2.A02
            java.lang.String r6 = r2.A08
            int r7 = r2.A0C
            if (r6 == 0) goto L_0x0167
            if (r11 == 0) goto L_0x0161
            java.io.File r6 = r11.A0F
            if (r6 != 0) goto L_0x0167
        L_0x0161:
            X.0y3 r6 = r5.A0B
            r6.A02(r2, r4)
            goto L_0x0102
        L_0x0167:
            int r6 = X.C42881yp.A00(r7, r12)
            if (r6 >= 0) goto L_0x019f
            if (r8 == r4) goto L_0x017d
            if (r8 == r12) goto L_0x017d
            boolean r6 = r2 instanceof X.C38681rF
            if (r6 != 0) goto L_0x017d
            boolean r6 = r2 instanceof X.C38701rH
            if (r6 == 0) goto L_0x0102
            int r6 = r2.A08
            if (r6 != r4) goto L_0x0102
        L_0x017d:
            java.lang.String r6 = r2.A09
            if (r6 != 0) goto L_0x0188
            X.10X r6 = r5.A01
            r6.A06(r2, r10, r10)
            goto L_0x0102
        L_0x0188:
            java.lang.Object r7 = r3.get(r6)
            java.util.AbstractCollection r7 = (java.util.AbstractCollection) r7
            if (r7 != 0) goto L_0x019a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r6 = r2.A09
            r3.put(r6, r7)
        L_0x019a:
            r7.add(r2)
            goto L_0x0102
        L_0x019f:
            X.0y3 r7 = r5.A0B
            r29 = 0
            com.facebook.redex.RunnableRunnableShape0S0401000_I0 r23 = new com.facebook.redex.RunnableRunnableShape0S0401000_I0
            r24 = r5
            r25 = r2
            r26 = r9
            r27 = r11
            r28 = r8
            r23.<init>(r24, r25, r26, r27, r28, r29)
            java.util.HashSet r24 = new java.util.HashSet
            r24.<init>()
            r25 = 0
            int r6 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r6 != 0) goto L_0x01bf
            long r0 = r2.A0I
        L_0x01bf:
            X.2Fi r6 = new X.2Fi
            r22 = r19
            r27 = 0
            r31 = 1
            r32 = 1
            r20 = r19
            r21 = r2
            r29 = r0
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r32)
            r7.A00(r6)
            goto L_0x0102
        L_0x01d9:
            X.0y3 r2 = r5.A0B
            r2.A02(r9, r4)
            goto L_0x0102
        L_0x01e0:
            java.util.Collection r0 = r3.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x01e8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r2 = r3.next()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            X.10X r1 = r5.A01
            X.1zg r0 = new X.1zg
            r0.<init>(r2)
            r1.A04(r0, r10, r10)
            goto L_0x01e8
        L_0x01ff:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass292.A08(java.lang.Object[]):java.lang.Object");
    }
}
