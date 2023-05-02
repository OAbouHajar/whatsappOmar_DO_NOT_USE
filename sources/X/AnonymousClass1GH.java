package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1GH  reason: invalid class name */
public class AnonymousClass1GH extends C16780td {
    public final C206911f A00;

    public AnonymousClass1GH(Context context, C16300so r8, C206911f r9, C14710pd r10) {
        super(context, r8, r10, "migration_export_metadata.db", 1);
        this.A00 = r9;
    }

    public C16810tg A05() {
        try {
            return C33931jQ.A01(super.A00(), this.A00);
        } catch (SQLiteException e2) {
            Log.e("Failed to open writable export metadata db.", e2);
            return C33931jQ.A01(super.A00(), this.A00);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE exported_files_metadata(_id INTEGER PRIMARY KEY AUTOINCREMENT, local_path TEXT NOT NULL, exported_path TEXT UNIQUE NOT NULL, file_size INTEGER, required INTEGER, encryption_iv TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS exported_files_metadata_local_path_index ON exported_files_metadata (local_path)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
