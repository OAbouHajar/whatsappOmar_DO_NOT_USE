package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.1rv  reason: invalid class name and case insensitive filesystem */
public class C39101rv extends C38541qx implements C29881bN {
    public long A00;
    public String A01;

    public C39101rv(C28381Vw r2, long j2) {
        super(r2, (byte) 56, j2);
    }

    public C39101rv(C28381Vw r3, AnonymousClass23X r4, AnonymousClass23X r5, String str, long j2, long j3, long j4) {
        super(r3, (byte) 56, j2);
        this.A02 = r4;
        this.A01 = r5;
        this.A00 = j3;
        this.A01 = str;
        this.A01 = TextUtils.isEmpty(str) ? 7 : 0;
        this.A00 = j4;
    }

    public C39101rv(C53052eu r5, C33231iF r6, C28381Vw r7, long j2) {
        super(r7, (byte) 56, j2);
        C15830rv A02 = C15830rv.A02(r6.A03);
        AnonymousClass00B.A06(A02);
        C28381Vw r2 = new C28381Vw(A02, r6.A01, r6.A04);
        C33231iF r0 = r5.A02;
        this.A02 = new AnonymousClass23X(UserJid.getNullable((r0 == null ? C33231iF.A05 : r0).A02), r2);
        String str = r5.A04;
        this.A01 = str;
        this.A01 = TextUtils.isEmpty(str) ? 7 : 0;
        this.A00 = r5.A01;
    }

    public void A13(Cursor cursor, C216314v r6, HashMap hashMap) {
        super.A13(cursor, r6, hashMap);
        int A002 = C33931jQ.A00("reaction", hashMap);
        int A003 = C33931jQ.A00("sender_timestamp", hashMap);
        String string = cursor.getString(A002);
        long j2 = cursor.getLong(A003);
        this.A01 = string;
        boolean isEmpty = TextUtils.isEmpty(string);
        int i2 = 0;
        if (isEmpty) {
            i2 = 7;
        }
        this.A01 = i2;
        this.A00 = j2;
    }

    public String ADa() {
        return "inactive";
    }
}
