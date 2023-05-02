package X;

/* renamed from: X.1Ny  reason: invalid class name */
public class AnonymousClass1Ny {
    public final C216915b A00;

    public AnonymousClass1Ny(C216915b r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x009a=Splitter:B:34:0x009a, B:25:0x008e=Splitter:B:25:0x008e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A00(int r9, long r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto L_0x0016
            r0 = 1
            if (r9 == r0) goto L_0x0013
            r0 = 2
            if (r9 == r0) goto L_0x0010
            r0 = 3
            if (r9 == r0) goto L_0x0019
            java.lang.String r6 = "users_participated"
            goto L_0x001b
        L_0x0010:
            java.lang.String r6 = "poll_vote_deletes"
            goto L_0x001b
        L_0x0013:
            java.lang.String r6 = "poll_votes_changed"
            goto L_0x001b
        L_0x0016:
            java.lang.String r6 = "poll_votes"
            goto L_0x001b
        L_0x0019:
            java.lang.String r6 = "option_count"
        L_0x001b:
            X.15b r0 = r8.A00     // Catch:{ all -> 0x00a0 }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x00a0 }
            X.1cj r7 = r4.A00()     // Catch:{ all -> 0x009b }
            java.lang.String r3 = "poll_event_logging"
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0096 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C33961jT.A00(r2, r0, r3)     // Catch:{ all -> 0x0096 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0096 }
            r0 = r0 ^ 1
            r5 = 0
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "PollDailyActionLoggingStore/incrementCount: table does not exist"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0096 }
            goto L_0x008e
        L_0x0042:
            java.lang.String r0 = "UPDATE "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r3)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = " SET "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = " = "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = " + ?"
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = " WHERE "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "poll_id"
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = " = ?"
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0096 }
            X.1ou r3 = r2.A0A(r0)     // Catch:{ all -> 0x0096 }
            r1 = 1
            r0 = 1
            r3.A01(r0, r1)     // Catch:{ all -> 0x0096 }
            r0 = 2
            r3.A01(r0, r10)     // Catch:{ all -> 0x0096 }
            android.database.sqlite.SQLiteStatement r0 = r3.A00     // Catch:{ all -> 0x0096 }
            int r0 = r0.executeUpdateDelete()     // Catch:{ all -> 0x0096 }
            r7.A00()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x008e
            r5 = 1
        L_0x008e:
            r7.close()     // Catch:{ all -> 0x009b }
            r4.close()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r8)
            return r5
        L_0x0096:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x009a }
        L_0x009a:
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x009f }
        L_0x009f:
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Ny.A00(int, long):boolean");
    }
}
