package X;

import android.database.Cursor;
import android.database.DataSetObserver;

/* renamed from: X.3R5  reason: invalid class name */
public abstract class AnonymousClass3R5 extends AnonymousClass01X {
    public int A00 = -1;
    public Cursor A01 = null;
    public DataSetObserver A02 = new C63643Kx(this);
    public boolean A03 = false;

    public AnonymousClass3R5() {
        A0B(true);
    }

    public void A0B(boolean z2) {
        super.A0B(true);
    }

    public int A0C() {
        Cursor cursor;
        if (!this.A03 || (cursor = this.A01) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public long A0D(int i2) {
        Cursor cursor;
        if (!this.A03 || (cursor = this.A01) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.A01.getLong(this.A00);
    }

    public Cursor A0E(Cursor cursor) {
        boolean z2;
        DataSetObserver dataSetObserver;
        Cursor cursor2 = this.A01;
        if (cursor == cursor2) {
            return null;
        }
        if (!(cursor2 == null || (dataSetObserver = this.A02) == null)) {
            cursor2.unregisterDataSetObserver(dataSetObserver);
        }
        this.A01 = cursor;
        if (cursor != null) {
            DataSetObserver dataSetObserver2 = this.A02;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.A00 = cursor.getColumnIndexOrThrow("_id");
            z2 = true;
        } else {
            this.A00 = -1;
            z2 = false;
        }
        this.A03 = z2;
        A01();
        return cursor2;
    }

    public abstract void A0F(Cursor cursor, C005602k r2);

    public void ANf(C005602k r2, int i2) {
        String str;
        if (!this.A03) {
            str = "this should only be called when the cursor is valid";
        } else if (this.A01.moveToPosition(i2)) {
            A0F(this.A01, r2);
            return;
        } else {
            str = C13680ns.A0c(i2, "couldn't move cursor to position ");
        }
        throw AnonymousClass000.A0V(str);
    }
}
