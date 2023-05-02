package X;

import android.content.ContentValues;

/* renamed from: X.1Q0  reason: invalid class name */
public class AnonymousClass1Q0 {
    public final C16900tq A00;

    public AnonymousClass1Q0(C16900tq r1) {
        this.A00 = r1;
    }

    public static void A00(C16800tf r3, C39101rv r4, long j2) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("message_add_on_row_id", Long.valueOf(j2));
        contentValues.put("reaction", r4.A01);
        contentValues.put("sender_timestamp", Long.valueOf(r4.A00));
        r3.A02.A03(contentValues, "message_add_on_reaction");
    }
}
