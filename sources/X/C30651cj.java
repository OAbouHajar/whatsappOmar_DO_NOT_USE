package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.AbstractMap;

/* renamed from: X.1cj  reason: invalid class name and case insensitive filesystem */
public class C30651cj implements Closeable {
    public boolean A00 = false;
    public boolean A01;
    public final C16810tg A02;

    public C30651cj(SQLiteTransactionListener sQLiteTransactionListener, C33921jP r6, C16810tg r7) {
        this.A02 = r7;
        ThreadLocal threadLocal = r6.A01;
        Object obj = threadLocal.get();
        AnonymousClass00B.A06(obj);
        if (!((Boolean) obj).booleanValue()) {
            SQLiteDatabase sQLiteDatabase = r7.A00;
            AnonymousClass00B.A0B("OuterTransactionManager/already-in-transaction", !sQLiteDatabase.inTransaction());
            sQLiteDatabase.beginTransactionWithListener(r6);
            threadLocal.set(Boolean.TRUE);
        } else {
            r7.A00.beginTransaction();
        }
        if (sQLiteTransactionListener != null) {
            Object obj2 = new Object();
            Object obj3 = r6.A02.get();
            AnonymousClass00B.A06(obj3);
            ((AbstractMap) obj3).put(obj2, sQLiteTransactionListener);
            sQLiteTransactionListener.onBegin();
        }
    }

    public void A00() {
        this.A01 = true;
        this.A02.A00.setTransactionSuccessful();
    }

    public boolean A01() {
        return this.A02.A00.inTransaction() && !this.A00 && !this.A01;
    }

    public void close() {
        if (!this.A00) {
            if (!this.A01) {
                Log.w("DatabaseTransaction/close/was not set successful");
            }
            this.A02.A00.endTransaction();
            this.A00 = true;
        }
    }
}
