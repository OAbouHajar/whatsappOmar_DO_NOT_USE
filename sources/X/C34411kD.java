package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1kD  reason: invalid class name and case insensitive filesystem */
public class C34411kD {
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5) {
        /*
            java.lang.String r3 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003d }
            r1.<init>()     // Catch:{ Exception -> 0x003d }
            java.lang.String r0 = "select sql from sqlite_master where type='table' and name='"
            r1.append(r0)     // Catch:{ Exception -> 0x003d }
            r1.append(r5)     // Catch:{ Exception -> 0x003d }
            java.lang.String r0 = "';"
            r1.append(r0)     // Catch:{ Exception -> 0x003d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x003d }
            r0 = 0
            android.database.Cursor r1 = r4.rawQuery(r1, r0)     // Catch:{ Exception -> 0x003d }
            if (r1 == 0) goto L_0x0037
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "sql"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = r1.getString(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0037
        L_0x0032:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ Exception -> 0x003d }
        L_0x0037:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ Exception -> 0x003d }
            return r3
        L_0x003d:
            r2 = move-exception
            java.lang.String r1 = "base-sqlite-open-helper-utils/schema "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x004f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34411kD.A00(android.database.sqlite.SQLiteDatabase, java.lang.String):java.lang.String");
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        A02(sQLiteDatabase, A00(sQLiteDatabase, str), str, str2, str3);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        String trim = str3.trim();
        String trim2 = str4.trim();
        if (!C33961jT.A03(str, trim, trim2)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("ALTER TABLE ");
                sb.append(str2);
                sb.append(" ADD ");
                sb.append(trim);
                sb.append(" ");
                sb.append(trim2);
                sQLiteDatabase.execSQL(sb.toString());
            } catch (SQLiteException e2) {
                StringBuilder sb2 = new StringBuilder("base-sqlite-open-helper-utils/add-column ");
                sb2.append(trim);
                Log.e(sb2.toString(), e2);
            }
        }
    }
}
