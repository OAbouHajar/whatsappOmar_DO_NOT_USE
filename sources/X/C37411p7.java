package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;

/* renamed from: X.1p7  reason: invalid class name and case insensitive filesystem */
public class C37411p7 extends C16780td {
    public final C206911f A00;

    public C37411p7(Context context, C16300so r8, C206911f r9, C14710pd r10) {
        super(context, r8, r10, "companion_devices.db", 9);
        this.A00 = r9;
    }

    public C16810tg A05() {
        return C33931jQ.A01(super.A00(), this.A00);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS devices");
        sQLiteDatabase.execSQL("CREATE TABLE devices (_id INTEGER PRIMARY KEY AUTOINCREMENT,device_id TEXT,device_os TEXT,platform_type INTEGER,last_active INTEGER,login_time INTEGER,logout_time INTEGER NOT NULL DEFAULT 0,adv_key_index INTEGER NOT NULL DEFAULT 0,full_sync_required INTEGER NOT NULL DEFAULT 0,place_name TEXT);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS companion_device_jid_index ON devices(device_id);");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS devices_history");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("CompanionDeviceDbHelper/downgrade from ");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i3);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        r3.execSQL("DROP TABLE IF EXISTS devices_history");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        r3.execSQL("ALTER TABLE devices ADD login_time INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        r3.execSQL("ALTER TABLE devices ADD adv_key_index INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        r3.execSQL("ALTER TABLE devices ADD full_sync_required INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        r3.execSQL("ALTER TABLE devices ADD place_name TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r3.execSQL("ALTER TABLE devices ADD logout_time INTEGER NOT NULL DEFAULT 0");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "CompanionDeviceDbHelper/upgrade from "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            switch(r4) {
                case 1: goto L_0x0025;
                case 2: goto L_0x002a;
                case 3: goto L_0x002f;
                case 4: goto L_0x0034;
                case 5: goto L_0x0039;
                case 6: goto L_0x003e;
                case 7: goto L_0x0043;
                case 8: goto L_0x0043;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.String r0 = "CompanionDeviceDbHelper/upgrade unknown old version"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2.onCreate(r3)
            return
        L_0x0025:
            java.lang.String r0 = "ALTER TABLE devices ADD platform_type INTEGER"
            r3.execSQL(r0)
        L_0x002a:
            java.lang.String r0 = "ALTER TABLE devices ADD login_time INTEGER"
            r3.execSQL(r0)
        L_0x002f:
            java.lang.String r0 = "ALTER TABLE devices ADD adv_key_index INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)
        L_0x0034:
            java.lang.String r0 = "ALTER TABLE devices ADD full_sync_required INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)
        L_0x0039:
            java.lang.String r0 = "ALTER TABLE devices ADD place_name TEXT"
            r3.execSQL(r0)
        L_0x003e:
            java.lang.String r0 = "ALTER TABLE devices ADD logout_time INTEGER NOT NULL DEFAULT 0"
            r3.execSQL(r0)
        L_0x0043:
            java.lang.String r0 = "DROP TABLE IF EXISTS devices_history"
            r3.execSQL(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37411p7.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
