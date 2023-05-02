package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.28z  reason: invalid class name */
public final class AnonymousClass28z {
    public final C39721sx A00;

    public AnonymousClass28z(Cursor cursor, UserJid userJid) {
        AnonymousClass00B.A06(userJid);
        C39721sx r2 = new C39721sx(userJid);
        this.A00 = r2;
        r2.A00 = cursor.getDouble(1);
        r2.A01 = cursor.getDouble(2);
        r2.A03 = cursor.getInt(3);
        r2.A02 = cursor.getFloat(4);
        r2.A04 = cursor.getInt(5);
        r2.A05 = cursor.getLong(6);
    }
}
