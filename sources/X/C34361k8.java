package X;

import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1k8  reason: invalid class name and case insensitive filesystem */
public class C34361k8 implements DatabaseErrorHandler {
    public final DefaultDatabaseErrorHandler A00 = new DefaultDatabaseErrorHandler();
    public final C16300so A01;
    public final String A02;

    public C34361k8(C16300so r2, String str) {
        this.A01 = r2;
        this.A02 = str;
    }

    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C16300so r3 = this.A01;
        StringBuilder sb = new StringBuilder("db-corrupted/");
        sb.append(this.A02);
        r3.AcB(sb.toString(), (String) null, false);
        this.A00.onCorruption(sQLiteDatabase);
    }
}
