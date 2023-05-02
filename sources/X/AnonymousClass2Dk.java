package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.2Dk  reason: invalid class name */
public class AnonymousClass2Dk extends C16780td {
    public final C206911f A00;

    public AnonymousClass2Dk(C16300so r7, C16980tz r8, C206911f r9, C14710pd r10) {
        super(r8.A00, r7, r10, "commerce.db", 1);
        this.A00 = r9;
    }

    public C16810tg A05() {
        try {
            return C33931jQ.A01(super.A00(), this.A00);
        } catch (SQLiteException e2) {
            Log.e("failed to open writable commerce store", e2);
            return C33931jQ.A01(super.A00(), this.A00);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cart_item");
        sQLiteDatabase.execSQL("CREATE TABLE cart_item(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, product_id TEXT NOT NULL, product_title TEXT, product_price_1000 INTEGER, product_currency_code TEXT, product_image_id TEXT, product_quantity INTEGER, product_sale_price_1000 INTEGER, product_sale_start_date TIMESTAMP, product_sale_end_date TIMESTAMP, product_max_available INTEGER)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index on cart_item (business_id)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String A002 = C34411kD.A00(sQLiteDatabase, "cart_item");
        if (!TextUtils.isEmpty(A002)) {
            C34411kD.A02(sQLiteDatabase, A002, "cart_item", "product_price_1000", "INTEGER");
            C34411kD.A02(sQLiteDatabase, A002, "cart_item", "product_sale_price_1000", "INTEGER");
            C34411kD.A02(sQLiteDatabase, A002, "cart_item", "product_sale_start_date", "TIMESTAMP");
            C34411kD.A02(sQLiteDatabase, A002, "cart_item", "product_sale_end_date", "TIMESTAMP");
            C34411kD.A02(sQLiteDatabase, A002, "cart_item", "product_max_available", "INTEGER");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        onCreate(sQLiteDatabase);
    }
}
