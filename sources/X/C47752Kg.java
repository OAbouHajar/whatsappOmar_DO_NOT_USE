package X;

import android.database.Cursor;

/* renamed from: X.2Kg  reason: invalid class name and case insensitive filesystem */
public class C47752Kg {
    public final long A00;
    public final long A01;
    public final C28381Vw A02;
    public final boolean A03;

    public C47752Kg(Cursor cursor, C15830rv r7) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean z2 = false;
        boolean z3 = cursor.getInt(cursor.getColumnIndexOrThrow("from_me")) == 1;
        this.A02 = new C28381Vw(r7, string, z3);
        cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        this.A00 = cursor.getLong(cursor.getColumnIndexOrThrow("sort_id"));
        this.A03 = cursor.getInt(cursor.getColumnIndexOrThrow("starred")) == 1 ? true : z2;
        this.A01 = AnonymousClass19D.A01(cursor, z3);
    }
}
