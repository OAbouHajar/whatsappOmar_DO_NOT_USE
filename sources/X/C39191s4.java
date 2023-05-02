package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.1s4  reason: invalid class name and case insensitive filesystem */
public class C39191s4 extends C38541qx implements C30081bi {
    public int A00;
    public int A01;
    public long A02;

    public C39191s4(C28381Vw r2, long j2) {
        super(r2, (byte) 68, j2);
    }

    public C39191s4(C28381Vw r3, AnonymousClass23X r4, int i2, long j2, long j3, long j4) {
        super(r3, (byte) 68, j2);
        this.A02 = r4;
        this.A01 = null;
        this.A00 = j3;
        this.A01 = i2;
        this.A02 = j4;
    }

    public C39191s4(AnonymousClass2Q2 r6, C28381Vw r7, long j2) {
        this(r7, j2);
        C33231iF r4 = r6.A03;
        r4 = r4 == null ? C33231iF.A05 : r4;
        C15830rv A022 = C15830rv.A02(r4.A03);
        AnonymousClass00B.A06(A022);
        this.A02 = new AnonymousClass23X(UserJid.getNullable(r4.A02), new C28381Vw(A022, r4.A01, r4.A04));
        C802042y A002 = C802042y.A00(r6.A01);
        this.A01 = (A002 == null ? C802042y.A03 : A002) == C802042y.A01 ? 1 : 0;
        this.A02 = r6.A02;
    }

    public void A13(Cursor cursor, C216314v r6, HashMap hashMap) {
        super.A13(cursor, r6, hashMap);
        int A002 = C33931jQ.A00("sender_timestamp", hashMap);
        int A003 = C33931jQ.A00("keep_in_chat_state", hashMap);
        int A004 = C33931jQ.A00("keep_count", hashMap);
        long j2 = cursor.getLong(A002);
        int i2 = cursor.getInt(A003);
        int i3 = cursor.getInt(A004);
        this.A02 = j2;
        this.A01 = i2;
        this.A00 = i3;
    }

    public void A5j(AnonymousClass21Q r7, AnonymousClass1GC r8) {
        C33221iE r4 = r7.A04;
        AnonymousClass2Q2 r0 = ((C33211iD) r4.A00).A0Q;
        if (r0 == null) {
            r0 = AnonymousClass2Q2.A04;
        }
        C28581Wr A0U = r0.A0U();
        C33231iF r02 = ((AnonymousClass2Q2) A0U.A00).A03;
        if (r02 == null) {
            r02 = C33231iF.A05;
        }
        C33241iG r2 = (C33241iG) r02.A0U();
        C28381Vw A12 = A12();
        AnonymousClass23X r03 = this.A02;
        C15830rv r04 = r03 == null ? null : r03.A00;
        AnonymousClass00B.A06(A12);
        AnonymousClass23Y.A02(r04, r2, A12);
        A0U.A03();
        AnonymousClass2Q2 r1 = (AnonymousClass2Q2) A0U.A00;
        r1.A03 = (C33231iF) r2.A02();
        r1.A00 |= 1;
        C802042y r22 = this.A01 == 1 ? C802042y.A01 : C802042y.A02;
        A0U.A03();
        AnonymousClass2Q2 r12 = (AnonymousClass2Q2) A0U.A00;
        r12.A00 |= 2;
        r12.A01 = r22.value;
        long j2 = this.A02;
        A0U.A03();
        AnonymousClass2Q2 r13 = (AnonymousClass2Q2) A0U.A00;
        r13.A00 |= 4;
        r13.A02 = j2;
        r4.A03();
        C33211iD r14 = (C33211iD) r4.A00;
        r14.A0Q = (AnonymousClass2Q2) A0U.A02();
        r14.A01 |= 256;
    }
}
