package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1jU  reason: invalid class name and case insensitive filesystem */
public class C33971jU {
    public static String A00(C16810tg r2, String str, String str2) {
        Cursor A08 = r2.A08("SELECT value FROM props WHERE key = ?", new String[]{str});
        try {
            if (A08.moveToNext()) {
                String string = A08.getString(A08.getColumnIndexOrThrow("value"));
                A08.close();
                return string;
            }
            A08.close();
            return str2;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public static void A01(C16810tg r2, String str) {
        r2.A0C("DELETE FROM props WHERE key = ?", new String[]{str});
    }

    public static void A02(C16810tg r3, String str, String str2, long j2) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", str);
        contentValues.put("value", Long.valueOf(j2));
        C34021jZ.A01(str2, "setProp", "REPLACE_PROPS");
        r3.A05(contentValues, "props");
    }

    public static void A03(C16810tg r3, String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", str);
        contentValues.put("value", str2);
        C34021jZ.A01(str3, "setProp", "REPLACE_PROPS");
        r3.A05(contentValues, "props");
    }
}
