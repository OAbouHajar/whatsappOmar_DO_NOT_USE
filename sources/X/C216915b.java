package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.15b  reason: invalid class name and case insensitive filesystem */
public class C216915b extends C16780td {
    public final C206911f A00;

    public C216915b(C16300so r7, C16980tz r8, C206911f r9, C14710pd r10) {
        super(r8.A00, r7, r10, "daily_metrics.db", 5);
        this.A00 = r9;
    }

    public C16810tg A05() {
        Log.i("DailyMetricsDbHelper/initDatabase");
        try {
            return C33931jQ.A01(super.A00(), this.A00);
        } catch (SQLiteException e2) {
            Log.e("failed to open writable daily metrics store", e2);
            return C33931jQ.A01(super.A00(), this.A00);
        }
    }

    public final void A06(SQLiteDatabase sQLiteDatabase) {
        Log.i("DailyMetricsDbHelper/createDB");
        A07(sQLiteDatabase, "community_home_action_logging", "DROP TABLE IF EXISTS community_home_action_logging", "CREATE TABLE community_home_action_logging(jid_row_id INTEGER PRIMARY KEY, home_view_count INTEGER NOT NULL DEFAULT 0, home_group_navigation_count INTEGER NOT NULL DEFAULT 0, home_group_discovery_count INTEGER NOT NULL DEFAULT 0, home_group_join_count INTEGER NOT NULL DEFAULT 0)");
        A07(sQLiteDatabase, "poll_event_logging", "DROP TABLE IF EXISTS poll_event_logging", "CREATE TABLE poll_event_logging(poll_id INTEGER PRIMARY KEY, poll_votes INTEGER NOT NULL DEFAULT 0, poll_votes_changed INTEGER NOT NULL DEFAULT 0, poll_vote_deletes INTEGER NOT NULL DEFAULT 0,option_count INTEGER NOT NULL DEFAULT 0, users_participated INTEGER NOT NULL DEFAULT 0, poll_creation_ds INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, is_a_group_flag INTEGER NOT NULL DEFAULT 0)");
        A07(sQLiteDatabase, "pnh_daily_event_logging", "DROP TABLE IF EXISTS pnh_daily_event_logging", "CREATE TABLE pnh_daily_event_logging(community_id TEXT NOT NULL, type_of_subgroup INTEGER NOT NULL, reaction_open_tray_count INTEGER NOT NULL DEFAULT 0, reaction_delete_count INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_chat INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_info_screen INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (community_id, type_of_subgroup))");
    }

    public final void A07(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            sQLiteDatabase.execSQL(str2);
            sQLiteDatabase.execSQL(str3);
        } catch (SQLiteException e2) {
            C16300so r2 = this.A02;
            StringBuilder sb = new StringBuilder("Issue recreating ");
            sb.append(str);
            sb.append(" table");
            r2.A03("DailyMetricsDbHelper/recreateActionTable", sb.toString(), e2);
            StringBuilder sb2 = new StringBuilder("DailyMetricsDbHelper/failed to recreate ");
            sb2.append(str);
            sb2.append(" logging table");
            Log.e(sb2.toString(), e2);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("DailyMetricsDbHelper/onCreate; version=5");
        A06(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("DailyMetricsDbHelper/downgrade from ");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i3);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        Log.i("DailyMetricsDbHelper/onUpgrade");
        A06(sQLiteDatabase);
    }
}
