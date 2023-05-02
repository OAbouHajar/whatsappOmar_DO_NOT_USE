package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.28r  reason: invalid class name and case insensitive filesystem */
public final class C454528r {
    public final long A00;
    public final C15830rv A01;
    public final UserJid A02;
    public final C28381Vw A03;

    public C454528r(C15830rv r1, UserJid userJid, C28381Vw r3, long j2) {
        this.A01 = r1;
        this.A02 = userJid;
        this.A00 = j2;
        this.A03 = r3;
    }

    public C454528r(Cursor cursor, C15830rv r5, UserJid userJid) {
        this.A01 = r5;
        this.A02 = userJid;
        this.A00 = cursor.getLong(3);
        this.A03 = new C28381Vw(r5, cursor.getString(4), cursor.getInt(1) != 1 ? false : true);
    }
}
