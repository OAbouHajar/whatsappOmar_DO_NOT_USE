package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.0Xl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C06730Xl implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ C11350id A00;

    public /* synthetic */ C06730Xl(C11350id r1) {
        this.A00 = r1;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return C07700cK.A00(sQLiteCursorDriver, sQLiteQuery, this.A00, str);
    }
}
