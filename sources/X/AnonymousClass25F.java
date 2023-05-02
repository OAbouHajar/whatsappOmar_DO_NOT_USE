package X;

/* renamed from: X.25F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass25F implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C15840rx A03;
    public final /* synthetic */ C18910xS A04;
    public final /* synthetic */ C15830rv A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ AnonymousClass25F(C15840rx r1, C18910xS r2, C15830rv r3, int i2, long j2, long j3, boolean z2, boolean z3, boolean z4) {
        this.A04 = r2;
        this.A06 = z2;
        this.A07 = z3;
        this.A05 = r3;
        this.A03 = r1;
        this.A01 = j2;
        this.A08 = z4;
        this.A02 = j3;
        this.A00 = i2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x01c3 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x00e2=Splitter:B:42:0x00e2, B:37:0x00da=Splitter:B:37:0x00da} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r0 = r20
            X.0xS r9 = r0.A04
            boolean r3 = r0.A06
            boolean r1 = r0.A07
            X.0rv r8 = r0.A05
            X.0rx r2 = r0.A03
            long r6 = r0.A01
            boolean r11 = r0.A08
            long r15 = r0.A02
            int r0 = r0.A00
            r19 = r0
            if (r3 == 0) goto L_0x0116
            if (r1 == 0) goto L_0x0116
            X.0xU r1 = r9.A02
            r0 = 1
            java.util.Set r1 = r1.A0F(r8, r0)
        L_0x0021:
            X.0ts r0 = r9.A09
            r0.A0C(r2)
            X.0xU r0 = r9.A02
            r0.A0V(r1)
            X.19A r10 = r9.A0K
            r5 = 0
            X.1Zf r4 = new X.1Zf
            r4.<init>((boolean) r5)
            java.lang.String r0 = "msgstore/unsentreadreceiptsforjid"
            r4.A04(r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            X.0z0 r13 = r10.A09
            boolean r0 = r13.A00(r8)
            if (r0 == 0) goto L_0x005e
            X.0rt r0 = r10.A03
            X.0rx r12 = r0.A06(r8)
            if (r12 != 0) goto L_0x0075
            java.lang.String r1 = "msgstore/unsentreadreceiptsforjid/no chat for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x005e:
            if (r11 == 0) goto L_0x01cf
            X.15G r10 = r9.A0L
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            X.0ts r0 = r10.A05
            long r17 = r0.A02(r8)
            X.0tq r0 = r10.A0B
            X.0tf r6 = r0.get()
            goto L_0x011c
        L_0x0075:
            long r2 = r12.A0N
            long r0 = r12.A0P
            int r17 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r17 == 0) goto L_0x005e
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]
            X.0ts r0 = r10.A02
            long r0 = r0.A02(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r5] = r0
            r3 = 1
            long r0 = r12.A0O
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r3] = r0
            r1 = 2
            boolean r0 = r13.A01(r8)
            if (r0 == 0) goto L_0x009e
            long r6 = r12.A0Q
        L_0x009e:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r2[r1] = r0
            X.0tq r0 = r10.A07     // Catch:{ IllegalStateException -> 0x00e3, SQLiteDatabaseCorruptException -> 0x00ea, SQLiteFullException -> 0x01e2 }
            X.0tf r3 = r0.get()     // Catch:{ IllegalStateException -> 0x00e3, SQLiteDatabaseCorruptException -> 0x00ea, SQLiteFullException -> 0x01e2 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x00de }
            java.lang.String r0 = X.AnonymousClass1WW.A0M     // Catch:{ all -> 0x00de }
            android.database.Cursor r7 = r1.A08(r0, r2)     // Catch:{ all -> 0x00de }
            if (r7 == 0) goto L_0x00da
        L_0x00b4:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00d1
            X.0th r0 = r10.A01     // Catch:{ all -> 0x00d5 }
            X.0tZ r6 = r0.A02(r7, r8, r5)     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x00b4
            long r0 = r6.A0I     // Catch:{ all -> 0x00d5 }
            r12 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b4
            r14.add(r6)     // Catch:{ all -> 0x00d5 }
            goto L_0x00b4
        L_0x00d1:
            r7.close()     // Catch:{ all -> 0x00de }
            goto L_0x00da
        L_0x00d5:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00da:
            r3.close()     // Catch:{ IllegalStateException -> 0x00e3, SQLiteDatabaseCorruptException -> 0x00ea, SQLiteFullException -> 0x01e2 }
            goto L_0x00f3
        L_0x00de:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            throw r0     // Catch:{ IllegalStateException -> 0x00e3, SQLiteDatabaseCorruptException -> 0x00ea, SQLiteFullException -> 0x01e2 }
        L_0x00e3:
            r1 = move-exception
            java.lang.String r0 = "msgstore/unsentreadreceiptsforjid/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x00f3
        L_0x00ea:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r10.A06
            r0.A02()
        L_0x00f3:
            java.lang.String r0 = "msgstore/unsentreadreceiptsforjid "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r0 = r14.size()
            r2.append(r0)
            java.lang.String r0 = " | time spent:"
            r2.append(r0)
            long r0 = r4.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x005e
        L_0x0116:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x0021
        L_0x011c:
            java.util.List r0 = X.AnonymousClass15G.A0M     // Catch:{ all -> 0x01c4 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x01c4 }
        L_0x0122:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x01c9
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x01c4 }
            java.lang.Byte r0 = (java.lang.Byte) r0     // Catch:{ all -> 0x01c4 }
            byte r2 = r0.byteValue()     // Catch:{ all -> 0x01c4 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x01c4 }
            r5.<init>()     // Catch:{ all -> 0x01c4 }
            X.1Py r4 = r10.A0G     // Catch:{ all -> 0x01c4 }
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x01c4 }
            r11 = 0
            r3[r11] = r0     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x01c4 }
            r0 = 1
            r3[r0] = r1     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01c4 }
            r0 = 2
            r3[r0] = r1     // Catch:{ all -> 0x01c4 }
            X.0tg r1 = r6.A02     // Catch:{ all -> 0x01c4 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r11.<init>()     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = X.AnonymousClass23Q.A00(r2)     // Catch:{ all -> 0x01c4 }
            r11.append(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = " WHERE "
            r11.append(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "message_add_on.chat_row_id = ?"
            r11.append(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = " AND "
            r11.append(r12)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "message_add_on.message_add_on_type = "
            r11.append(r0)     // Catch:{ all -> 0x01c4 }
            r11.append(r2)     // Catch:{ all -> 0x01c4 }
            r11.append(r12)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "message_add_on._id > ?"
            r11.append(r0)     // Catch:{ all -> 0x01c4 }
            r11.append(r12)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "message_add_on.from_me = 0"
            r11.append(r0)     // Catch:{ all -> 0x01c4 }
            r11.append(r12)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "message_add_on.status = ?"
            r11.append(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x01c4 }
            android.database.Cursor r3 = r1.A08(r0, r3)     // Catch:{ all -> 0x01c4 }
            java.util.HashMap r2 = X.AnonymousClass23W.A00(r3, r2)     // Catch:{ all -> 0x01bd }
        L_0x019a:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x01b5
            X.1qx r1 = r4.A05(r3, r2)     // Catch:{ all -> 0x01bd }
            if (r1 != 0) goto L_0x01ac
            java.lang.String r0 = "MessageAddOnManager/getUnreadMessageAddOnReactionsFor unexpected fmessage"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01bd }
            goto L_0x019a
        L_0x01ac:
            X.14v r0 = r10.A09     // Catch:{ all -> 0x01bd }
            r1.A13(r3, r0, r2)     // Catch:{ all -> 0x01bd }
            r5.add(r1)     // Catch:{ all -> 0x01bd }
            goto L_0x019a
        L_0x01b5:
            r3.close()     // Catch:{ all -> 0x01c4 }
            r7.addAll(r5)     // Catch:{ all -> 0x01c4 }
            goto L_0x0122
        L_0x01bd:
            r0 = move-exception
            if (r3 == 0) goto L_0x01c3
            r3.close()     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x01c8 }
        L_0x01c8:
            throw r0
        L_0x01c9:
            r6.close()
            r10.A02(r7)
        L_0x01cf:
            X.17E r0 = r9.A0C
            android.os.Handler r0 = r0.A02
            r6 = 5
            com.facebook.redex.RunnableRunnableShape0S0301000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0301000_I0
            r2 = r9
            r3 = r8
            r4 = r14
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            r0.post(r1)
            return
        L_0x01e2:
            r1 = move-exception
            X.0y0 r0 = r10.A05
            r0.A00(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25F.run():void");
    }
}
