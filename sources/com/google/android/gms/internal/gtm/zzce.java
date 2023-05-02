package com.google.android.gms.internal.gtm;

import X.C107825Lo;
import X.C13710nw;
import X.C15000qA;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import java.util.List;

public final class zzce extends zzbs implements Closeable {
    public static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    public static final String zzb = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});
    public final zzcd zzc;
    public final zzfo zzd;
    public final zzfo zze;

    public zzce(zzbv zzbv) {
        super(zzbv);
        C107825Lo r1 = this.zza.zzd;
        this.zzd = new zzfo(r1);
        this.zze = new zzfo(r1);
        this.zzc = new zzcd(this, zzbv.zzb, "google_analytics_v4.db");
    }

    private final long zzad(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = zzf().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return 0;
        } catch (SQLiteException e2) {
            zzL("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e2) {
            zzK("Sql error closing database", e2);
        } catch (IllegalStateException e3) {
            zzK("Error closing database", e3);
        }
    }

    public final void zzZ(List list) {
        C13710nw.A01(list);
        C15000qA.A00();
        zzW();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id");
            sb.append(" in (");
            for (int i2 = 0; i2 < list.size(); i2++) {
                Number number = (Number) list.get(i2);
                if (number == null || number.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(number);
            }
            sb.append(")");
            String obj = sb.toString();
            try {
                SQLiteDatabase zzf = zzf();
                zzP("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = zzf.delete("hits2", obj, (String[]) null);
                if (delete != list.size()) {
                    zzU("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), obj);
                }
            } catch (SQLiteException e2) {
                zzK("Error deleting hits", e2);
                throw e2;
            }
        }
    }

    public final void zzaa() {
        zzW();
        zzf().endTransaction();
    }

    public final void zzab() {
        zzW();
        zzf().setTransactionSuccessful();
    }

    public final long zzb() {
        C15000qA.A00();
        zzW();
        Cursor cursor = null;
        try {
            cursor = zzf().rawQuery("SELECT COUNT(*) FROM hits2", (String[]) null);
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            zzL("Database error", "SELECT COUNT(*) FROM hits2", e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zzc() {
        C15000qA.A00();
        zzW();
        return zzad(zzb, (String[]) null, 0);
    }

    public final void zzd() {
    }

    public final long zze(long j2, String str, String str2) {
        C13710nw.A05(str);
        C13710nw.A05(str2);
        zzW();
        C15000qA.A00();
        return zzad("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{"0", str, str2}, 0);
    }

    public final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e2) {
            zzS("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        if (r9.startsWith("http:") == false) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzj(long r19) {
        /*
            r18 = this;
            java.lang.String r6 = "hit_id"
            r2 = 0
            r0 = 1
            r4 = 0
            int r3 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            r1 = 0
            if (r3 < 0) goto L_0x000c
            r1 = 1
        L_0x000c:
            if (r1 == 0) goto L_0x00e1
            X.C15000qA.A00()
            r4 = r18
            r4.zzW()
            android.database.sqlite.SQLiteDatabase r7 = r4.zzf()
            r1 = 5
            java.lang.String[] r9 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            r9[r2] = r6     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            java.lang.String r1 = "hit_time"
            r9[r0] = r1     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            java.lang.String r3 = "hit_string"
            r1 = 2
            r9[r1] = r3     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            java.lang.String r5 = "hit_url"
            r3 = 3
            r9[r3] = r5     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            java.lang.String r5 = "hit_app_id"
            r3 = 4
            r9[r3] = r5     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            r5[r2] = r6     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            java.lang.String r8 = "hits2"
            r10 = 0
            java.lang.String r3 = "%s ASC"
            java.lang.String r14 = java.lang.String.format(r3, r5)     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            java.lang.String r15 = java.lang.Long.toString(r19)     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            r3 = 4
            r5 = 3
            r12 = r10
            r13 = r10
            r11 = r10
            android.database.Cursor r6 = r7.query(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00cf }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00cd }
            r7.<init>()     // Catch:{ SQLiteException -> 0x00cd }
            boolean r8 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x00cd }
            if (r8 == 0) goto L_0x00c9
        L_0x0057:
            long r14 = r6.getLong(r2)     // Catch:{ SQLiteException -> 0x00cd }
            long r11 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x00cd }
            java.lang.String r8 = r6.getString(r1)     // Catch:{ SQLiteException -> 0x00cd }
            java.lang.String r9 = r6.getString(r5)     // Catch:{ SQLiteException -> 0x00cd }
            int r16 = r6.getInt(r3)     // Catch:{ SQLiteException -> 0x00cd }
            java.lang.String r10 = "?"
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch:{ SQLiteException -> 0x00cd }
            if (r5 == 0) goto L_0x009d
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x00cd }
            r5.<init>(r2)     // Catch:{ SQLiteException -> 0x00cd }
        L_0x0078:
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ SQLiteException -> 0x00cd }
            if (r2 != 0) goto L_0x0087
            java.lang.String r2 = "http:"
            boolean r2 = r9.startsWith(r2)     // Catch:{ SQLiteException -> 0x00cd }
            r13 = 0
            if (r2 != 0) goto L_0x0088
        L_0x0087:
            r13 = 1
        L_0x0088:
            r17 = 0
            com.google.android.gms.internal.gtm.zzex r8 = new com.google.android.gms.internal.gtm.zzex     // Catch:{ SQLiteException -> 0x00cd }
            r9 = r4
            r10 = r5
            r8.<init>(r9, r10, r11, r13, r14, r16, r17)     // Catch:{ SQLiteException -> 0x00cd }
            r7.add(r8)     // Catch:{ SQLiteException -> 0x00cd }
            boolean r2 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x00cd }
            if (r2 == 0) goto L_0x00c9
            r5 = 3
            r2 = 0
            goto L_0x0057
        L_0x009d:
            boolean r5 = r8.startsWith(r10)     // Catch:{ URISyntaxException -> 0x00bd }
            if (r5 != 0) goto L_0x00ad
            int r5 = r8.length()     // Catch:{ URISyntaxException -> 0x00bd }
            if (r5 == 0) goto L_0x00b7
            java.lang.String r8 = r10.concat(r8)     // Catch:{ URISyntaxException -> 0x00bd }
        L_0x00ad:
            java.net.URI r5 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00bd }
            r5.<init>(r8)     // Catch:{ URISyntaxException -> 0x00bd }
            java.util.Map r5 = X.AnonymousClass4Z6.A00(r5)     // Catch:{ URISyntaxException -> 0x00bd }
            goto L_0x0078
        L_0x00b7:
            java.lang.String r8 = new java.lang.String     // Catch:{ URISyntaxException -> 0x00bd }
            r8.<init>(r10)     // Catch:{ URISyntaxException -> 0x00bd }
            goto L_0x00ad
        L_0x00bd:
            r8 = move-exception
            java.lang.String r5 = "Error parsing hit parameters"
            r4.zzK(r5, r8)     // Catch:{ SQLiteException -> 0x00cd }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x00cd }
            r5.<init>(r2)     // Catch:{ SQLiteException -> 0x00cd }
            goto L_0x0078
        L_0x00c9:
            r6.close()
            return r7
        L_0x00cd:
            r1 = move-exception
            goto L_0x00d4
        L_0x00cf:
            r0 = move-exception
            r6 = 0
            goto L_0x00db
        L_0x00d2:
            r1 = move-exception
            r6 = 0
        L_0x00d4:
            java.lang.String r0 = "Error loading hits from the database"
            r4.zzK(r0, r1)     // Catch:{ all -> 0x00da }
            throw r1     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
        L_0x00db:
            if (r6 == 0) goto L_0x00e0
            r6.close()
        L_0x00e0:
            throw r0
        L_0x00e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzce.zzj(long):java.util.List");
    }
}
