package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.SystemClock;
import com.mod2.fblibs.FacebookFacade;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public final class zzcd extends SQLiteOpenHelper {
    public final /* synthetic */ zzce zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcd(zzce zzce, Context context, String str) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzce;
    }

    private final boolean zza(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{FacebookFacade.RequestParameter.NAME}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
            boolean moveToFirst = cursor.moveToFirst();
            cursor.close();
            return moveToFirst;
        } catch (SQLiteException e2) {
            this.zza.zzT("Error querying for table", str, e2);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static final Set zzb(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet A0o = C13680ns.A0o();
        StringBuilder A0g = C13690nt.A0g(str.length() + 22);
        A0g.append("SELECT * FROM ");
        A0g.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery(AnonymousClass000.A0h(" LIMIT 0", A0g), (String[]) null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                A0o.add(add);
            }
            return A0o;
        } finally {
            rawQuery.close();
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        if (this.zza.zze.zzc(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                zzce zzce = this.zza;
                zzce.zze.zzb = SystemClock.elapsedRealtime();
                zzce.zzJ("Opening the database failed, dropping the table and recreating it");
                this.zza.zza.zzb.getDatabasePath("google_analytics_v4.db").delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.zza.zze.zzb = 0;
                    return writableDatabase;
                } catch (SQLiteException e2) {
                    this.zza.zzK("Failed to open freshly created database", e2);
                    throw e2;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File A0D = C13700nu.A0D(path);
                A0D.setReadable(false, false);
                A0D.setWritable(false, false);
                A0D.setReadable(true, true);
                A0D.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            zzfa.zzb("Invalid version number", Build.VERSION.SDK);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r11) {
        /*
            r10 = this;
            java.lang.String r1 = "hits2"
            boolean r0 = r10.zza(r11, r1)
            r9 = 3
            r8 = 2
            r5 = 4
            r4 = 0
            r7 = 1
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = com.google.android.gms.internal.gtm.zzce.zza
        L_0x000f:
            r11.execSQL(r0)
        L_0x0012:
            java.lang.String r1 = "properties"
            boolean r0 = r10.zza(r11, r1)
            if (r0 == 0) goto L_0x00ad
            java.util.Set r6 = zzb(r11, r1)
            r3 = 6
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r0 = "app_uid"
            r2[r4] = r0
            java.lang.String r0 = "cid"
            r2[r7] = r0
            java.lang.String r0 = "tid"
            r2[r8] = r0
            java.lang.String r0 = "params"
            r2[r9] = r0
            java.lang.String r0 = "adid"
            r2[r5] = r0
            r1 = 5
            java.lang.String r0 = "hits_count"
            r2[r1] = r0
        L_0x003b:
            r1 = r2[r4]
            boolean r0 = r6.remove(r1)
            if (r0 != 0) goto L_0x0053
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Database properties is missing required column: "
            java.lang.String r1 = X.C13680ns.A0g(r1, r0)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x0053:
            int r4 = r4 + 1
            if (r4 < r3) goto L_0x003b
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00a5
            return
        L_0x005e:
            java.util.Set r6 = zzb(r11, r1)
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r0 = "hit_id"
            r3[r4] = r0
            java.lang.String r0 = "hit_string"
            r3[r7] = r0
            java.lang.String r0 = "hit_time"
            r3[r8] = r0
            java.lang.String r0 = "hit_url"
            r3[r9] = r0
            r2 = 0
        L_0x0075:
            r1 = r3[r2]
            boolean r0 = r6.remove(r1)
            if (r0 != 0) goto L_0x008d
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Database hits2 is missing required column: "
            java.lang.String r1 = X.C13680ns.A0g(r1, r0)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x008d:
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x0075
            java.lang.String r0 = "hit_app_id"
            boolean r0 = r6.remove(r0)
            r1 = r0 ^ 1
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00b3
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER"
            goto L_0x000f
        L_0x00a5:
            java.lang.String r1 = "Database properties table has extra columns"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x00ad:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;"
            r11.execSQL(r0)
            return
        L_0x00b3:
            java.lang.String r1 = "Database hits2 has extra columns"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcd.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
