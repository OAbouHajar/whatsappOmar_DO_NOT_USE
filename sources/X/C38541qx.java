package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.1qx  reason: invalid class name and case insensitive filesystem */
public abstract class C38541qx extends C16740tZ {
    public long A00;
    public AnonymousClass23X A01;
    public AnonymousClass23X A02;

    public C38541qx(C28381Vw r1, byte b2, long j2) {
        super(r1, b2, j2);
    }

    public void A0X(int i2) {
        AnonymousClass00B.A0B("Cannot change storage type for add on messages", false);
    }

    public C28381Vw A12() {
        AnonymousClass23X r0 = this.A02;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public void A13(Cursor cursor, C216314v r10, HashMap hashMap) {
        int A002 = C33931jQ.A00("_id", hashMap);
        int A003 = C33931jQ.A00("sender_jid_row_id", hashMap);
        int A004 = C33931jQ.A00("parent_message_row_id", hashMap);
        int A005 = C33931jQ.A00("status", hashMap);
        long j2 = cursor.getLong(A002);
        long j3 = cursor.getLong(A003);
        long j4 = cursor.getLong(A004);
        int i2 = cursor.getInt(A005);
        this.A13 = j2;
        A0b((C15830rv) r10.A07(C15830rv.class, j3));
        this.A00 = j4;
        A0W(i2);
    }
}
