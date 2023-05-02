package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1NV  reason: invalid class name */
public class AnonymousClass1NV extends C16780td {
    public final C206911f A00;

    public AnonymousClass1NV(Context context, C16300so r8, C206911f r9, C14710pd r10) {
        super(context, r8, r10, "migration_prefetcher.db", 1);
        this.A00 = r9;
    }

    public C16810tg A05() {
        try {
            return C33931jQ.A01(super.A00(), this.A00);
        } catch (SQLiteException e2) {
            Log.e("Failed to open writable file prefetcher db.", e2);
            return C33931jQ.A01(super.A00(), this.A00);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE prefetched_files(_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_file_path TEXT UNIQUE NOT NULL, prefetched_file_path TEXT UNIQUE, file_size INTEGER, required INTEGER, prefetched INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS remote_file_path_index ON prefetched_files (remote_file_path)");
        sQLiteDatabase.execSQL("CREATE TABLE encrypted_files(_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_file_path TEXT UNIQUE NOT NULL, enc_iv TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS remote_file_path_index ON encrypted_files (remote_file_path)");
        sQLiteDatabase.execSQL("CREATE TABLE properties(_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT UNIQUE NOT NULL, value TEXT)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
