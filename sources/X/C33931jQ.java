package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: X.1jQ  reason: invalid class name and case insensitive filesystem */
public class C33931jQ {
    public static int A00(String str, HashMap hashMap) {
        Object obj = hashMap.get(str);
        AnonymousClass00B.A06(obj);
        return ((Number) obj).intValue();
    }

    public static C16810tg A01(SQLiteDatabase sQLiteDatabase, C206911f r2) {
        Log.i("DatabaseUtils/initDatabase/injected sql log writer/using modified LoggableSQLiteDatabase");
        return new C16810tg(sQLiteDatabase, r2);
    }

    public static String A02(Cursor cursor, int i2) {
        try {
            return cursor.getString(i2);
        } catch (SQLiteDatabaseCorruptException e2) {
            Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading jids", e2);
            throw e2;
        } catch (SQLiteException e3) {
            if (e3.getMessage() == null || !e3.getMessage().contains("Unable to convert BLOB to string")) {
                Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading jids", e3);
                throw e3;
            }
            byte[] blob = cursor.getBlob(i2);
            if (blob == null) {
                return null;
            }
            try {
                String str = new String(blob, AnonymousClass01S.A08);
                StringBuilder sb = new StringBuilder();
                sb.append("DatabaseUtils/tryGetStringOrGetBlob/converting from blob; rawJids=");
                sb.append(str);
                Log.i(sb.toString());
                return str;
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
    }

    public static void A03(Cursor cursor, HashMap hashMap, String[] strArr) {
        for (String str : strArr) {
            AnonymousClass00B.A0B("Column is already in the map, make sure there are no columns with same name in the same query.", !hashMap.containsKey(str));
            hashMap.put(str, Integer.valueOf(cursor.getColumnIndexOrThrow(str)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r1.delete() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005a, code lost:
        if (r3.delete() != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0068, code lost:
        if (r2.delete() != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(java.io.File r5, java.lang.String r6) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-wal"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-journal"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-shm"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r3.exists()
            r5 = 0
            if (r0 == 0) goto L_0x005c
            boolean r0 = r3.delete()
            r4 = 0
            if (r0 == 0) goto L_0x005d
        L_0x005c:
            r4 = 1
        L_0x005d:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x006a
            boolean r0 = r2.delete()
            r3 = 0
            if (r0 == 0) goto L_0x006b
        L_0x006a:
            r3 = 1
        L_0x006b:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0078
            boolean r0 = r1.delete()
            r2 = 0
            if (r0 == 0) goto L_0x0079
        L_0x0078:
            r2 = 1
        L_0x0079:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = "deleteTemporaryFiles/journalDeleted="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; writeAheadLogDeleted="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; sharedDeleted="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 == 0) goto L_0x00a7
            if (r3 == 0) goto L_0x00a7
            if (r2 == 0) goto L_0x00a7
            r5 = 1
        L_0x00a7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33931jQ.A04(java.io.File, java.lang.String):boolean");
    }
}
