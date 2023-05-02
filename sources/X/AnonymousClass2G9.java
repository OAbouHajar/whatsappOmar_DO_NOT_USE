package X;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2G9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2G9 implements DatabaseErrorHandler {
    public final /* synthetic */ File A00;

    public /* synthetic */ AnonymousClass2G9(File file) {
        this.A00 = file;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        File file = this.A00;
        StringBuilder sb = new StringBuilder("MessageStoreBackup/integritycheck/error-handler/corrupt-db ");
        sb.append(file);
        Log.i(sb.toString());
    }
}
