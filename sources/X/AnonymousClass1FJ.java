package X;

/* renamed from: X.1FJ  reason: invalid class name */
public class AnonymousClass1FJ implements AnonymousClass1FG {
    public final C216915b A00;
    public final AnonymousClass1FI A01;
    public final C16490t9 A02;

    public AnonymousClass1FJ(C216915b r1, AnonymousClass1FI r2, C16490t9 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0038 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void API() {
        /*
            r7 = this;
            X.15b r4 = r7.A00     // Catch:{ SQLiteException -> 0x0068 }
            X.0tf r5 = r4.get()     // Catch:{ SQLiteException -> 0x0068 }
            X.1FI r6 = r7.A01     // Catch:{ all -> 0x0063 }
            r2 = 0
            X.0tg r1 = r5.A02     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = "SELECT community_id, type_of_subgroup, reaction_open_tray_count, reaction_delete_count, pnh_indicator_clicks_chat, pnh_indicator_clicks_info_screen FROM pnh_daily_event_logging"
            android.database.Cursor r3 = r1.A08(r0, r2)     // Catch:{ Exception -> 0x0039 }
            r1 = 1
            com.facebook.redex.IDxCParserShape382S0100000_2_I0 r0 = new com.facebook.redex.IDxCParserShape382S0100000_2_I0     // Catch:{ Exception -> 0x0039 }
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0039 }
            X.57f r2 = new X.57f     // Catch:{ Exception -> 0x0039 }
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x0039 }
        L_0x001c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0030
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0034 }
            X.3sA r1 = (X.C75443sA) r1     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x001c
            X.0t9 r0 = r7.A02     // Catch:{ all -> 0x0034 }
            r0.A04(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x001c
        L_0x0030:
            r2.close()     // Catch:{ all -> 0x0063 }
            goto L_0x004b
        L_0x0034:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ all -> 0x0063 }
        L_0x0039:
            r2 = move-exception
            java.lang.String r1 = "PollDailyActionLoggingStore/getWamPnhDaily failure: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r0.<init>(r1)     // Catch:{ all -> 0x0063 }
            r0.append(r2)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0063 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0063 }
        L_0x004b:
            r5.close()     // Catch:{ SQLiteException -> 0x0068 }
            java.lang.String r0 = "DailyMetricsDbHelper/recreating pnh_daily_event_logging table"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tg r0 = r4.AHC()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "pnh_daily_event_logging"
            java.lang.String r1 = "DROP TABLE IF EXISTS pnh_daily_event_logging"
            java.lang.String r0 = "CREATE TABLE pnh_daily_event_logging(community_id TEXT NOT NULL, type_of_subgroup INTEGER NOT NULL, reaction_open_tray_count INTEGER NOT NULL DEFAULT 0, reaction_delete_count INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_chat INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_info_screen INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (community_id, type_of_subgroup))"
            r4.A07(r3, r2, r1, r0)
            return
        L_0x0063:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            throw r0     // Catch:{ SQLiteException -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            java.lang.String r0 = "PnhDailyEventLoggerDailyCron/failed to send pnh daily actions"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FJ.API():void");
    }
}
