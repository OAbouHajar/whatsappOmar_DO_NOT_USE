package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.1jT  reason: invalid class name and case insensitive filesystem */
public class C33961jT {
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:7:0x0022=Splitter:B:7:0x0022, B:14:0x002c=Splitter:B:14:0x002c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.C16810tg r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r3 = ""
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r5
            r0 = 1
            r1[r0] = r6
            java.lang.String r0 = "SELECT sql FROM sqlite_master WHERE type = ? AND name = ?"
            android.database.Cursor r1 = r4.A08(r0, r1)     // Catch:{ Exception -> 0x002d }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "sql"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0026 }
            java.lang.String r3 = r1.getString(r0)     // Catch:{ all -> 0x0026 }
        L_0x0022:
            r1.close()     // Catch:{ Exception -> 0x002d }
            return r3
        L_0x0026:
            r0 = move-exception
            if (r1 == 0) goto L_0x002c
            r1.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            r2 = move-exception
            java.lang.String r1 = "BaseDatabaseTable/getSqlFor view = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33961jT.A00(X.0tg, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void A01(C16810tg r3, String str, String str2) {
        String A00 = C34031ja.A00(str2);
        C34021jZ.A01(str, "dropLoggableDatabaseTables", C34021jZ.A00(str2));
        r3.A0B(A00);
    }

    public static boolean A02(C16810tg r5, String str, String str2, String str3, String str4, String str5) {
        String trim = str3.trim();
        String trim2 = str4.trim();
        if (A03(str, trim, trim2)) {
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE ");
            sb.append(str2);
            sb.append(" ADD ");
            sb.append(trim);
            sb.append(" ");
            sb.append(trim2);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append("/addColumnIfNotExists/ALTER_TABLE");
            sb2.toString();
            r5.A0B(obj);
            return true;
        } catch (SQLiteException e2) {
            StringBuilder sb3 = new StringBuilder("databasehelper/addColumnIfNotExists/alter_table ");
            sb3.append(trim);
            Log.w(sb3.toString(), e2);
            return false;
        }
    }

    public static boolean A03(String str, String str2, String str3) {
        String trim = str2.trim();
        String upperCase = str3.trim().toUpperCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder();
        sb.append(trim);
        sb.append(" ");
        sb.append(upperCase);
        if (str.contains(sb.toString())) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("(`*)");
        sb2.append(trim);
        sb2.append("(`*)(\\s+)");
        sb2.append(upperCase.replaceAll("\\s+", "(\\\\s+)"));
        return Pattern.compile(sb2.toString(), 2).matcher(str).find();
    }
}
