package X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.0cQ  reason: invalid class name and case insensitive filesystem */
public class C07760cQ implements C13610mf {
    public final SQLiteProgram A00;

    public C07760cQ(SQLiteProgram sQLiteProgram) {
        C18450wi.A0H(sQLiteProgram, 1);
        this.A00 = sQLiteProgram;
    }

    public void A5N(int i2, byte[] bArr) {
        C18450wi.A0H(bArr, 1);
        this.A00.bindBlob(i2, bArr);
    }

    public void A5P(int i2, double d2) {
        this.A00.bindDouble(i2, d2);
    }

    public void A5Q(int i2, long j2) {
        this.A00.bindLong(i2, j2);
    }

    public void A5R(int i2) {
        this.A00.bindNull(i2);
    }

    public void A5S(int i2, String str) {
        C18450wi.A0H(str, 1);
        this.A00.bindString(i2, str);
    }

    public void close() {
        this.A00.close();
    }
}
