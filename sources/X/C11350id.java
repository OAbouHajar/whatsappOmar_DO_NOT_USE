package X;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.0id  reason: invalid class name and case insensitive filesystem */
public final class C11350id extends AnonymousClass1DR implements AnonymousClass1DT {
    public final /* synthetic */ C13040lN $query;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11350id(C13040lN r2) {
        super(4);
        this.$query = r2;
    }

    /* renamed from: A00 */
    public final SQLiteCursor A01(SQLiteCursorDriver sQLiteCursorDriver, SQLiteQuery sQLiteQuery, String str) {
        C13040lN r1 = this.$query;
        C18450wi.A0F(sQLiteQuery);
        r1.A5T(new C07760cQ(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
