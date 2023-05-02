package X;

/* renamed from: X.1Nz  reason: invalid class name and case insensitive filesystem */
public class C26491Nz implements C23541Cj {
    public final C216915b A00;
    public final AnonymousClass1Ny A01;
    public final C14710pd A02;
    public final C16490t9 A03;

    public C26491Nz(C216915b r1, AnonymousClass1Ny r2, C14710pd r3, C16490t9 r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APJ() {
        /*
            r7 = this;
            X.0pd r2 = r7.A02
            r1 = 2321(0x911, float:3.252E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = "PollStatsLoggerDailyCron/sendPollDailyActionsLogging()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.15b r4 = r7.A00
            X.0tf r3 = r4.get()
            X.1Ny r6 = r7.A01     // Catch:{ all -> 0x0080 }
            r2 = 0
            X.0tg r1 = r3.A02     // Catch:{ Exception -> 0x0057 }
            java.lang.String r0 = "SELECT poll_id, poll_votes, poll_votes_changed, poll_vote_deletes, option_count, users_participated, poll_creation_ds, group_size_bucket, is_a_group_flag FROM poll_event_logging"
            android.database.Cursor r5 = r1.A08(r0, r2)     // Catch:{ Exception -> 0x0057 }
            r1 = 2
            com.facebook.redex.IDxCParserShape382S0100000_2_I0 r0 = new com.facebook.redex.IDxCParserShape382S0100000_2_I0     // Catch:{ Exception -> 0x0057 }
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0057 }
            X.57f r2 = new X.57f     // Catch:{ Exception -> 0x0057 }
            r2.<init>(r5, r0)     // Catch:{ Exception -> 0x0057 }
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x003a
            r2.close()     // Catch:{ all -> 0x0080 }
            r3.close()
            return
        L_0x003a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0052 }
            X.3sc r1 = (X.C75723sc) r1     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x003a
            X.0t9 r0 = r7.A03     // Catch:{ all -> 0x0052 }
            r0.A04(r1)     // Catch:{ all -> 0x0052 }
            goto L_0x003a
        L_0x004e:
            r2.close()     // Catch:{ all -> 0x0080 }
            goto L_0x006d
        L_0x0052:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0057:
            r2 = move-exception
            java.lang.String r0 = "PollDailyActionLoggingStore/getWamPollsDailyStats: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r1.<init>(r0)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0080 }
            r1.append(r0)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0080 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0080 }
        L_0x006d:
            r3.close()
            X.0tg r0 = r4.AHC()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "poll_event_logging"
            java.lang.String r1 = "DROP TABLE IF EXISTS poll_event_logging"
            java.lang.String r0 = "CREATE TABLE poll_event_logging(poll_id INTEGER PRIMARY KEY, poll_votes INTEGER NOT NULL DEFAULT 0, poll_votes_changed INTEGER NOT NULL DEFAULT 0, poll_vote_deletes INTEGER NOT NULL DEFAULT 0,option_count INTEGER NOT NULL DEFAULT 0, users_participated INTEGER NOT NULL DEFAULT 0, poll_creation_ds INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, is_a_group_flag INTEGER NOT NULL DEFAULT 0)"
            r4.A07(r3, r2, r1, r0)
            return
        L_0x0080:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0084 }
        L_0x0084:
            throw r0
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26491Nz.APJ():void");
    }

    public /* synthetic */ void APK() {
    }
}
