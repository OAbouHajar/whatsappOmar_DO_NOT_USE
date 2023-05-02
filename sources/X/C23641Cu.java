package X;

import android.content.ContentValues;

/* renamed from: X.1Cu  reason: invalid class name and case insensitive filesystem */
public class C23641Cu {
    public final C16900tq A00;

    public C23641Cu(C16900tq r1) {
        this.A00 = r1;
    }

    public static final void A00(C16800tf r4, long j2, long j3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("lid_row_id", Long.valueOf(j2));
        contentValues.put("jid_row_id", Long.valueOf(j3));
        r4.A02.A06(contentValues, "jid_map", 5);
    }
}
