package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.2HR  reason: invalid class name */
public class AnonymousClass2HR extends C16780td {
    public final C206911f A00;

    public AnonymousClass2HR(Context context, C16300so r8, C206911f r9, C14710pd r10) {
        super(context, r8, r10, "emojidictionary.db", 1);
        this.A00 = r9;
    }

    public C16810tg A05() {
        return C33931jQ.A01(super.A00(), this.A00);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE emoji_search_tag (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, type INTEGER NOT NULL, symbol TEXT NOT NULL, tag TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS emoji_search_pack_index ON emoji_search_tag (type, symbol, tag)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }
}
