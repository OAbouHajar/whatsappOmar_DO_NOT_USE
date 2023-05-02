package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.0v1  reason: invalid class name and case insensitive filesystem */
public class C17400v1 {
    public final C16920ts A00;
    public final C16900tq A01;

    public C17400v1(C16920ts r1, C16900tq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public Cursor A00(C28381Vw r9) {
        C15830rv r7 = r9.A00;
        if (r7 == null) {
            return null;
        }
        C16800tf A012 = this.A01.get();
        try {
            C16810tg r6 = A012.A02;
            String str = C40081tX.A00;
            String[] strArr = new String[3];
            strArr[0] = r9.A01;
            strArr[1] = String.valueOf(this.A00.A02(r7));
            strArr[2] = r9.A02 ? "1" : "0";
            Cursor A08 = r6.A08(str, strArr);
            A012.close();
            return A08;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A01(C16740tZ r7) {
        if (r7.A10(131072)) {
            C39271sC A0G = r7.A0G();
            if (A0G != null) {
                C16800tf A02 = this.A01.A02();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_row_id", Long.valueOf(r7.A13));
                    contentValues.put("original_key_id", A0G.A02.A01);
                    contentValues.put("edited_timestamp", Long.valueOf(A0G.A00));
                    contentValues.put("sender_timestamp", Long.valueOf(A0G.A01));
                    A02.A02.A06(contentValues, "message_edit_info", 5);
                    A02.close();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                throw new IllegalStateException("MessageEditInfoStore/insertEditInfo/missing information in the FMessage");
            }
        } else {
            return;
        }
        throw th;
    }
}
