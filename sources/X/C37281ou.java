package X;

import android.database.sqlite.SQLiteStatement;

/* renamed from: X.1ou  reason: invalid class name and case insensitive filesystem */
public class C37281ou {
    public final SQLiteStatement A00;

    public C37281ou(SQLiteStatement sQLiteStatement) {
        this.A00 = sQLiteStatement;
    }

    public int A00() {
        return this.A00.executeUpdateDelete();
    }

    public void A01(int i2, long j2) {
        this.A00.bindLong(i2, j2);
    }

    public void A02(int i2, String str) {
        this.A00.bindString(i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C37281ou) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
