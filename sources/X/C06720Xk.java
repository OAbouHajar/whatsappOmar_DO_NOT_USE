package X;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.0Xk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C06720Xk implements DatabaseErrorHandler {
    public final /* synthetic */ C06190Uq A00;
    public final /* synthetic */ AnonymousClass0NU A01;

    public /* synthetic */ C06720Xk(C06190Uq r1, AnonymousClass0NU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass0AP.A02(sQLiteDatabase, this.A00, this.A01);
    }
}
