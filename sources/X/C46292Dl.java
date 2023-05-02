package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.2Dl  reason: invalid class name and case insensitive filesystem */
public class C46292Dl extends C16780td {
    public final Context A00;
    public final C206911f A01;

    public C46292Dl(Context context, C16300so r8, C206911f r9, C14710pd r10) {
        super(context, r8, r10, "hsmpacks.db", 2);
        this.A00 = context;
        this.A01 = r9;
    }

    public C16810tg A05() {
        try {
            return C33931jQ.A01(super.A00(), this.A01);
        } catch (SQLiteException e2) {
            Log.e("failed to open pack store", e2);
            A04();
            return C33931jQ.A01(super.A00(), this.A01);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS packs");
        sQLiteDatabase.execSQL("CREATE TABLE packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, lg TEXT NOT NULL, lc TEXT NOT NULL, hash TEXT NOT NULL, namespace TEXT NOT NULL, timestamp INTEGER NOT NULL, data BLOB NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS pack_index ON packs (lg, lc, namespace)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("language-pack-store/downgrade from ");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i3);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("language-pack-store/upgrade from ");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i3);
        Log.i(sb.toString());
        if (i2 != 1) {
            Log.e("language-pack-store/upgrade unknown old version");
        }
        onCreate(sQLiteDatabase);
    }
}
