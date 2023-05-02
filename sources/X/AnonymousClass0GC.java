package X;

import android.database.sqlite.SQLiteStatement;

/* renamed from: X.0GC  reason: invalid class name */
public final class AnonymousClass0GC extends C07760cQ implements C13500mT {
    public final SQLiteStatement A00;

    public AnonymousClass0GC(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.A00 = sQLiteStatement;
    }

    public static void A00(AnonymousClass0SM r1, Object obj) {
        ((AnonymousClass0GC) obj).A00.executeUpdateDelete();
        r1.A0C();
    }
}
