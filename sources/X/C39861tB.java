package X;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1tB  reason: invalid class name and case insensitive filesystem */
public class C39861tB extends C16780td {
    public final C206911f A00;
    public final AnonymousClass1UY A01;

    public C39861tB(Context context, C16300so r10, C206911f r11, C14710pd r12, Set set) {
        super(context, r10, r12, "payments.db", 3);
        this.A00 = r11;
        this.A01 = new AnonymousClass1UY(new AnonymousClass01T(set, (AnonymousClass01J) null));
    }

    public C16810tg A05() {
        try {
            return C33931jQ.A01(super.A00(), this.A00);
        } catch (SQLiteException e2) {
            Log.e("failed to open payment store", e2);
            new SQLiteCantOpenDatabaseException();
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                AnonymousClass160 r1 = ((C42521xw) it.next()).A00;
                synchronized (r1) {
                    C39861tB r0 = r1.A00;
                    if (r0 != null) {
                        r0.A04();
                    }
                    r1.A08 = false;
                }
            }
            return C33931jQ.A01(super.A00(), this.A00);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("PAY: creating payments database version 3");
        sQLiteDatabase.execSQL("CREATE TABLE methods (credential_id TEXT NOT NULL PRIMARY KEY, country TEXT, readable_name TEXT, issuer_name TEXT, type INTEGER NOT NULL, subtype INTEGER, creation_ts INTEGER, updated_ts INTEGER, debit_mode INTEGER NOT NULL, credit_mode INTEGER NOT NULL, balance_1000 INTEGER, balance_ts INTEGER, country_data TEXT, icon BLOB, p2m_debit_mode INTEGER NOT NULL DEFAULT 0, p2m_credit_mode INTEGER NOT NULL DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_methods_index ON methods (credential_id)");
        sQLiteDatabase.execSQL("CREATE TABLE tmp_transactions (tmp_id TEXT NOT NULL, tmp_metadata TEXT, tmp_ts INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transactions_index ON tmp_transactions (tmp_id)");
        sQLiteDatabase.execSQL("CREATE TABLE contacts (jid NOT NULL, country_data TEXT, merchant INTEGER, consumer_status INTEGER, default_payment_type INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_constacts_index ON contacts (jid)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("PaymentDbHelper/onDowngrade/oldVersion:");
        sb.append(i2);
        sb.append(", newVersion:");
        sb.append(i3);
        Log.i(sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS methods");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tmp_transactions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String A002 = C34411kD.A00(sQLiteDatabase, "methods");
        if (!TextUtils.isEmpty(A002)) {
            C34411kD.A02(sQLiteDatabase, A002, "methods", "icon", "BLOB");
        }
        String A003 = C34411kD.A00(sQLiteDatabase, "contacts");
        if (!TextUtils.isEmpty(A003)) {
            C34411kD.A02(sQLiteDatabase, A003, "contacts", "merchant", "INTEGER");
            C34411kD.A02(sQLiteDatabase, A003, "contacts", "default_payment_type", "INTEGER");
            C34411kD.A02(sQLiteDatabase, A003, "contacts", "consumer_status", "INTEGER");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("PaymentDbHelper/onUpgrade/old version: ");
        sb.append(i2);
        sb.append(", new version: ");
        sb.append(i3);
        Log.i(sb.toString());
        if (i2 == 1 || i2 == 2) {
            sQLiteDatabase.execSQL("ALTER TABLE methods ADD p2m_debit_mode  INTEGER NOT NULL DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE methods ADD p2m_credit_mode  INTEGER NOT NULL DEFAULT 0");
            return;
        }
        StringBuilder sb2 = new StringBuilder("PaymentDbHelper/onUpgrade/Unknown upgrade from ");
        sb2.append(i2);
        sb2.append(" to ");
        sb2.append(i3);
        throw new SQLiteException(sb2.toString());
    }
}
