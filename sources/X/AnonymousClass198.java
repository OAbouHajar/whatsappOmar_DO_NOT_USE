package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.198  reason: invalid class name */
public class AnonymousClass198 {
    public final AnonymousClass196 A00;
    public final C216314v A01;
    public final C16900tq A02;

    public AnonymousClass198(AnonymousClass196 r1, C216314v r2, C16900tq r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public synchronized C38591r2 A00(Cursor cursor) {
        C38591r2 r5;
        int i2;
        int columnIndex = cursor.getColumnIndex("call_link_id");
        r5 = null;
        if (!(columnIndex == -1 || (i2 = cursor.getInt(columnIndex)) == 0)) {
            r5 = new C38591r2(UserJid.of(this.A01.A03((long) cursor.getInt(cursor.getColumnIndexOrThrow("creator_jid_row_id")))), cursor.getString(cursor.getColumnIndexOrThrow("token")), (long) i2);
        }
        return r5;
    }
}
