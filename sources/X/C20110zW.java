package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.File;

/* renamed from: X.0zW  reason: invalid class name and case insensitive filesystem */
public class C20110zW {
    public final C20120zX A00;

    public C20110zW(C20120zX r1) {
        this.A00 = r1;
    }

    public static C85214No A00(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("local_path");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("exported_path");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("required");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("encryption_iv");
        long j2 = cursor.getLong(columnIndexOrThrow);
        String string = cursor.getString(columnIndexOrThrow2);
        String string2 = cursor.getString(columnIndexOrThrow3);
        int i2 = cursor.getInt(columnIndexOrThrow4);
        long j3 = cursor.getLong(columnIndexOrThrow5);
        String string3 = cursor.getString(columnIndexOrThrow6);
        AnonymousClass00B.A06(string);
        AnonymousClass00B.A06(string2);
        AnonymousClass00B.A06(string3);
        File file = new File(string);
        boolean z2 = false;
        if (i2 != 0) {
            z2 = true;
        }
        return new C85214No(file, string2, string3, j2, j3, z2);
    }

    public long A01(String str, String str2, String str3, long j2, boolean z2) {
        AnonymousClass1GH r0;
        ContentValues contentValues = new ContentValues();
        contentValues.put("local_path", str);
        contentValues.put("exported_path", str2);
        contentValues.put("required", Boolean.valueOf(z2));
        contentValues.put("file_size", Long.valueOf(j2));
        contentValues.put("encryption_iv", str3);
        C20120zX r1 = this.A00;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                r0 = (AnonymousClass1GH) r1.A02.get();
                r1.A00 = r0;
            }
        }
        C16800tf A02 = r0.A02();
        try {
            long A022 = A02.A02.A02(contentValues, "exported_files_metadata");
            A02.close();
            return A022;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
