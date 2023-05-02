package X;

import android.database.Cursor;
import android.util.Base64;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1s3  reason: invalid class name and case insensitive filesystem */
public class C39181s3 extends C38541qx implements C39071rs, C30081bi {
    public long A00;
    public List A01;
    public byte[] A02;
    public byte[] A03;
    public byte[] A04;
    public final List A05;

    public C39181s3(long j2, C28381Vw r5, AnonymousClass23X r6, List list, long j3, long j4) {
        super(r5, (byte) 67, j2);
        this.A02 = r6;
        this.A01 = null;
        this.A00 = j3;
        this.A05 = new ArrayList();
        this.A01 = list;
        this.A00 = j4;
    }

    public C39181s3(C28381Vw r2, long j2) {
        super(r2, (byte) 67, j2);
        this.A05 = new ArrayList();
    }

    public C39181s3(C28381Vw r3, AnonymousClass23X r4, List list, long j2, long j3, long j4) {
        super(r3, (byte) 67, j2);
        this.A02 = r4;
        this.A01 = null;
        this.A00 = j3;
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        arrayList.addAll(list);
        this.A00 = j4;
    }

    public C39181s3(C53082ex r6, C28381Vw r7, long j2) {
        super(r7, (byte) 67, j2);
        this.A05 = new ArrayList();
        if ((r6.A00 & 1) != 1 ? false : true) {
            C33231iF r3 = r6.A04;
            r3 = r3 == null ? C33231iF.A05 : r3;
            C15830rv A022 = C15830rv.A02(r3.A03);
            AnonymousClass00B.A06(A022);
            C28381Vw r32 = new C28381Vw(A022, r3.A01, r3.A04);
            C33231iF r0 = r6.A04;
            this.A02 = new AnonymousClass23X(UserJid.getNullable((r0 == null ? C33231iF.A05 : r0).A02), r32);
            int i2 = r6.A00;
            if ((i2 & 8) == 8) {
                this.A00 = r6.A01;
                if ((i2 & 2) == 2) {
                    C58462tX r4 = r6.A02;
                    r4 = r4 == null ? C58462tX.A03 : r4;
                    if ((r4.A00 & 2) == 2) {
                        byte[] A042 = r4.A01.A04();
                        if (A042.length == 12) {
                            this.A02 = A042;
                            if ((r4.A00 & 1) == 1) {
                                this.A03 = r4.A02.A04();
                                return;
                            }
                            throw new AnonymousClass23S(34, "poll_update_missing_vote_enc_payload");
                        }
                        throw new AnonymousClass23S(34, "poll_update_invalid_vote_enc_iv");
                    }
                    throw new AnonymousClass23S(34, "poll_update_missing_vote_enc_iv");
                }
                throw new AnonymousClass23S(34, "poll_update_missing_update");
            }
            throw new AnonymousClass23S(34, "poll_update_missing_sender_timestamp");
        }
        throw new AnonymousClass23S(34, "poll_update_missing_poll_message_key");
    }

    public void A13(Cursor cursor, C216314v r4, HashMap hashMap) {
        super.A13(cursor, r4, hashMap);
        this.A00 = cursor.getLong(C33931jQ.A00("sender_timestamp", hashMap));
    }

    public void A5j(AnonymousClass21Q r18, AnonymousClass1GC r19) {
        UserJid of;
        UserJid A0C;
        C28631Ww r2;
        byte[] bArr;
        AnonymousClass21Q r7 = r18;
        JniBridge jniBridge = r7.A06;
        AnonymousClass00B.A06(jniBridge);
        C33221iE r6 = r7.A04;
        C53082ex r0 = ((C33211iD) r6.A00).A0Z;
        if (r0 == null) {
            r0 = C53082ex.A05;
        }
        C28581Wr A0U = r0.A0U();
        C33231iF r02 = ((C53082ex) A0U.A00).A04;
        if (r02 == null) {
            r02 = C33231iF.A05;
        }
        C33241iG r3 = (C33241iG) r02.A0U();
        C28381Vw A12 = A12();
        AnonymousClass23X r03 = this.A02;
        C15830rv r10 = r03 == null ? null : r03.A00;
        AnonymousClass00B.A06(A12);
        AnonymousClass23Y.A02(r10, r3, A12);
        A0U.A03();
        C53082ex r1 = (C53082ex) A0U.A00;
        r1.A04 = (C33231iF) r3.A02();
        r1.A00 |= 1;
        long j2 = this.A00;
        A0U.A03();
        C53082ex r4 = (C53082ex) A0U.A00;
        r4.A00 |= 8;
        r4.A01 = j2;
        C58462tX r04 = r4.A02;
        if (r04 == null) {
            r04 = C58462tX.A03;
        }
        C28581Wr A0U2 = r04.A0U();
        byte[] bArr2 = this.A02;
        if (bArr2 == null || (bArr = this.A03) == null) {
            List<String> list = this.A01;
            AnonymousClass00B.A06(list);
            byte[] bArr3 = this.A04;
            AnonymousClass00B.A06(bArr3);
            String str = A12.A01;
            if (A12.A02) {
                C16040sK r05 = r7.A01;
                r05.A0B();
                of = r05.A05;
            } else {
                of = UserJid.of(r10);
            }
            AnonymousClass00B.A06(of);
            if (this.A11.A02) {
                C16040sK r72 = r7.A01;
                C15810rt r22 = r19.A02;
                C15830rv r12 = A12.A00;
                if (!(r12 instanceof GroupJid) || r22.A02((GroupJid) r12) != 3) {
                    r72.A0B();
                    A0C = r72.A05;
                } else {
                    A0C = r72.A03();
                }
            } else {
                A0C = A0C();
            }
            AnonymousClass00B.A06(A0C);
            C28581Wr A0U3 = C441823c.A01.A0U();
            for (String decode : list) {
                byte[] decode2 = Base64.decode(decode, 2);
                C28631Ww A012 = C28631Ww.A01(decode2, 0, decode2.length);
                A0U3.A03();
                C441823c r32 = (C441823c) A0U3.A00;
                AnonymousClass1XE r13 = r32.A00;
                if (!((AnonymousClass1XF) r13).A00) {
                    r13 = C28541Wm.A0G(r13);
                    r32.A00 = r13;
                }
                r13.add(A012);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(0);
            sb.append(A0C.getRawString());
            C83814Id A002 = C441723b.A00(of, A0C, jniBridge, str, "Poll Vote", bArr3, sb.toString().getBytes(AnonymousClass01S.A0A), A0U3.A02().A02());
            if (A002 == null) {
                Log.e("MessageAddOnPollVoteUtils/encryptPollVotePayload encryptionResult is null");
                return;
            }
            C28631Ww r23 = A002.A00;
            A0U2.A03();
            C58462tX r14 = (C58462tX) A0U2.A00;
            r14.A00 |= 2;
            r14.A01 = r23;
            r2 = A002.A01;
        } else {
            C28631Ww A013 = C28631Ww.A01(bArr2, 0, bArr2.length);
            A0U2.A03();
            C58462tX r15 = (C58462tX) A0U2.A00;
            r15.A00 |= 2;
            r15.A01 = A013;
            r2 = C28631Ww.A01(bArr, 0, bArr.length);
        }
        A0U2.A03();
        C58462tX r16 = (C58462tX) A0U2.A00;
        r16.A00 |= 1;
        r16.A02 = r2;
        A0U.A03();
        C53082ex r17 = (C53082ex) A0U.A00;
        r17.A02 = (C58462tX) A0U2.A02();
        r17.A00 |= 2;
        r6.A03();
        C33211iD r110 = (C33211iD) r6.A00;
        r110.A0Z = (C53082ex) A0U.A02();
        r110.A01 |= 128;
    }

    public List AGD() {
        return Collections.singletonList(new C28371Vv("meta", new C35081lL[]{new C35081lL("polltype", "vote")}));
    }
}
