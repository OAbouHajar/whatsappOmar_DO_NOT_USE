package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1Ru  reason: invalid class name and case insensitive filesystem */
public class C27451Ru extends C16780td {
    public final C206911f A00;

    public C27451Ru(C16300so r7, C16980tz r8, C206911f r9, C14710pd r10) {
        super(r8.A00, r7, r10, "location.db", 2);
        this.A00 = r9;
    }

    public C16810tg A05() {
        try {
            return C33931jQ.A01(super.A00(), this.A00);
        } catch (SQLiteDatabaseCorruptException e2) {
            Log.w("LocationDbHelper/getReadableDatabase/Locations database is corrupt. Removing...", e2);
            A04();
            return C33931jQ.A01(super.A00(), this.A00);
        } catch (SQLiteException e3) {
            String obj = e3.toString();
            if (obj.contains("file is encrypted")) {
                Log.w("LocationDbHelper/getReadableDatabase/Locations database is encrypted. Removing...", e3);
                A04();
                return C33931jQ.A01(super.A00(), this.A00);
            } else if (obj.contains("upgrade read-only database")) {
                Log.w("LocationDbHelper/getReadableDatabase/Client actually opened database as read-only and can't upgrade. Switching to writable...", e3);
                return C33931jQ.A01(super.A00(), this.A00);
            } else {
                throw e3;
            }
        } catch (StackOverflowError e4) {
            Log.w("LocationDbHelper/getReadableDatabase/StackOverflowError during db init check");
            for (StackTraceElement methodName : e4.getStackTrace()) {
                if (methodName.getMethodName().equals("onCorruption")) {
                    Log.w("LocationDbHelper/getReadableDatabase/Locations database is corrupt. Found via StackOverflowError. Removing...");
                    A04();
                    return C33931jQ.A01(super.A00(), this.A00);
                }
            }
            throw e4;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("LocationDbHelper/onCreate; version=2");
        Log.i("LocationSharerTable/createTable/version=2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_sharer");
        sQLiteDatabase.execSQL("CREATE TABLE location_sharer (_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_jid TEXT NOT NULL, from_me BOOLEAN NOT NULL, remote_resource TEXT NOT NULL, expires INTEGER NOT NULL, message_id TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_sharer_index ON location_sharer(remote_jid, from_me, remote_resource, message_id)");
        Log.i("LocationKeyDistributionTable/createTable/version=2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_key_distribution");
        sQLiteDatabase.execSQL("CREATE TABLE location_key_distribution (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, sent_to_server BOOLEAN NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_key_distribution_index ON location_key_distribution(jid)");
        Log.i("LocationCacheTable/createTable/version=2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_cache");
        sQLiteDatabase.execSQL("CREATE TABLE location_cache (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, latitude REAL NOT NULL, longitude REAL NOT NULL, accuracy INTEGER NOT NULL, speed REAL NOT NULL, bearing INTEGER NOT NULL, location_ts INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS user_location_index ON location_cache(jid)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("LocationDbHelper/onDowngrade; oldVersion=");
        sb.append(i2);
        sb.append("; newVersion=");
        sb.append(i3);
        Log.w(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("LocationDbHelper/onUpgrade; oldVersion=");
        sb.append(i2);
        sb.append("; newVersion=");
        sb.append(i3);
        Log.i(sb.toString());
        if (i3 != 2) {
            StringBuilder sb2 = new StringBuilder("LocationDbHelper/Unknown upgrade destination version: ");
            sb2.append(i2);
            sb2.append(" -> ");
            sb2.append(i3);
            throw new SQLiteException(sb2.toString());
        } else if (i2 != 1) {
            Log.i("LocationDbHelper/onUpgrade/unknown old version");
            onCreate(sQLiteDatabase);
        } else {
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS location_sharer_index");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_sharer_index ON location_sharer(remote_jid, from_me, remote_resource, message_id)");
        }
    }
}
