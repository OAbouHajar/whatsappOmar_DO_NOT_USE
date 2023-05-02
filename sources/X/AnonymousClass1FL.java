package X;

/* renamed from: X.1FL  reason: invalid class name */
public class AnonymousClass1FL implements AnonymousClass1FG {
    public final C16300so A00;
    public final C216915b A01;
    public final C217215e A02;
    public final C217015c A03;
    public final C16490t9 A04;

    public AnonymousClass1FL(C16300so r1, C216915b r2, C217215e r3, C217015c r4, C16490t9 r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void API() {
        /*
            r17 = this;
            java.lang.String r0 = "CommunityEventLoggerDailyCron/sendCommunityHomeActionLogging()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14 = r17
            X.15b r4 = r14.A01     // Catch:{ SQLiteException -> 0x004a }
            X.0tf r5 = r4.get()     // Catch:{ SQLiteException -> 0x004a }
            X.15c r3 = r14.A03     // Catch:{ all -> 0x0045 }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "SELECT jid_row_id, home_view_count, home_group_navigation_count, home_group_discovery_count, home_group_join_count FROM community_home_action_logging"
            r0 = 0
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x0045 }
            r1 = 0
            com.facebook.redex.IDxCParserShape382S0100000_2_I0 r0 = new com.facebook.redex.IDxCParserShape382S0100000_2_I0     // Catch:{ all -> 0x0045 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0045 }
            X.57f r3 = new X.57f     // Catch:{ all -> 0x0045 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0045 }
            r2 = 0
        L_0x0024:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0039
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0040 }
            X.3rl r1 = (X.C75193rl) r1     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x0024
            X.0t9 r0 = r14.A04     // Catch:{ all -> 0x0040 }
            r0.A04(r1)     // Catch:{ all -> 0x0040 }
            r2 = 1
            goto L_0x0024
        L_0x0039:
            r3.close()     // Catch:{ all -> 0x0045 }
            r5.close()     // Catch:{ SQLiteException -> 0x004a }
            goto L_0x005a
        L_0x0040:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0     // Catch:{ SQLiteException -> 0x004a }
        L_0x004a:
            r3 = move-exception
            X.0so r2 = r14.A00
            java.lang.String r1 = "CommunityEventLoggerDailyCron/send"
            java.lang.String r0 = "Issue sending community action logs"
            r2.A03(r1, r0, r3)
            java.lang.String r0 = "CommunityEventLoggerDailyCron/failed to send home actions"
            com.whatsapp.util.Log.e(r0, r3)
            goto L_0x0070
        L_0x005a:
            if (r2 == 0) goto L_0x0070
            java.lang.String r0 = "DailyMetricsDbHelper/recreating community table"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tg r0 = r4.AHC()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "community_home_action_logging"
            java.lang.String r1 = "DROP TABLE IF EXISTS community_home_action_logging"
            java.lang.String r0 = "CREATE TABLE community_home_action_logging(jid_row_id INTEGER PRIMARY KEY, home_view_count INTEGER NOT NULL DEFAULT 0, home_group_navigation_count INTEGER NOT NULL DEFAULT 0, home_group_discovery_count INTEGER NOT NULL DEFAULT 0, home_group_join_count INTEGER NOT NULL DEFAULT 0)"
            r4.A07(r3, r2, r1, r0)
        L_0x0070:
            X.15e r13 = r14.A02
            android.content.SharedPreferences r0 = r13.A00()
            java.lang.String r7 = "community_tab_no_action_view"
            r1 = 0
            int r2 = r0.getInt(r7, r1)
            android.content.SharedPreferences r0 = r13.A00()
            java.lang.String r11 = "community_tab_daily_views"
            int r0 = r0.getInt(r11, r1)
            int r0 = java.lang.Math.min(r2, r0)
            long r8 = (long) r0
            android.content.SharedPreferences r0 = r13.A00()
            java.lang.String r6 = "community_tab_group_navigation"
            int r0 = r0.getInt(r6, r1)
            long r4 = (long) r0
            android.content.SharedPreferences r0 = r13.A00()
            int r0 = r0.getInt(r11, r1)
            long r2 = (long) r0
            android.content.SharedPreferences r0 = r13.A00()
            java.lang.String r10 = "community_tab_to_home_views"
            int r0 = r0.getInt(r10, r1)
            long r0 = (long) r0
            r15 = 0
            int r12 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r12 != 0) goto L_0x00bd
            int r12 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r12 != 0) goto L_0x00bd
            int r12 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r12 != 0) goto L_0x00bd
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r12 == 0) goto L_0x00fa
        L_0x00bd:
            X.3rY r12 = new X.3rY
            r12.<init>()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r12.A00 = r8
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r12.A01 = r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.A03 = r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.A02 = r0
            X.0t9 r0 = r14.A04
            r0.A04(r12)
            android.content.SharedPreferences r0 = r13.A00()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r11)
            android.content.SharedPreferences$Editor r0 = r0.remove(r10)
            android.content.SharedPreferences$Editor r0 = r0.remove(r6)
            android.content.SharedPreferences$Editor r0 = r0.remove(r7)
            r0.commit()
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FL.API():void");
    }
}
