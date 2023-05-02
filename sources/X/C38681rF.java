package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1rF  reason: invalid class name and case insensitive filesystem */
public class C38681rF extends C38691rG implements C16850tk, C30081bi {
    public C38681rF(C16750ta r9, C28381Vw r10, C38681rF r11, long j2) {
        super(r9, r10, r11, (byte) 1, j2, false);
    }

    public C38681rF(C16750ta r9, C28381Vw r10, C38681rF r11, long j2, boolean z2) {
        super(r9, r10, r11, r11.A10, j2, z2);
    }

    public C38681rF(C28381Vw r1, byte b2, long j2) {
        super(r1, b2, j2);
    }

    public C38681rF(C28381Vw r2, long j2) {
        super(r2, (byte) 1, j2);
    }

    public void A5j(AnonymousClass21Q r10, AnonymousClass1GC r11) {
        StringBuilder sb;
        UserJid userJid;
        C30611cf r0;
        if (this instanceof C38901rb) {
            C38901rb r6 = (C38901rb) this;
            C33221iE r5 = r10.A04;
            C69633fM r4 = (C69633fM) r5.A05().A0U();
            C59032uZ r2 = r5.A05().A03;
            if (r2 == null) {
                r2 = C59032uZ.A07;
            }
            C68803e1 A1A = r6.A1A((C68803e1) (r2.A01 == 3 ? (C28541Wm) r2.A03 : C445224k.A0R).A0U(), r10.A09, r10.A07);
            if (A1A == null || (r0 = r6.A00) == null) {
                sb = new StringBuilder("MessageTemplateImage/buildE2eMessage: cannot send encrypted media message, ");
                sb.append(r6.A10);
            } else {
                C69583fH A00 = AnonymousClass38C.A00(r5, r0);
                A00.A03();
                C59032uZ r1 = (C59032uZ) A00.A00;
                r1.A03 = A1A.A02();
                r1.A01 = 3;
                r4.A06(A00);
                r4.A05(A00);
                r5.A0D(r4);
                return;
            }
        } else if (this instanceof C38981rj) {
            C38981rj r3 = (C38981rj) this;
            C33221iE r52 = r10.A04;
            AnonymousClass2uE r02 = ((C33211iD) r52.A00).A0a;
            if (r02 == null) {
                r02 = AnonymousClass2uE.A07;
            }
            C28581Wr A0U = r02.A0U();
            AnonymousClass2uE r03 = ((C33211iD) r52.A00).A0a;
            if (r03 == null) {
                r03 = AnonymousClass2uE.A07;
            }
            C58722tx r04 = r03.A02;
            if (r04 == null) {
                r04 = C58722tx.A04;
            }
            C28581Wr A0U2 = r04.A0U();
            C445224k r05 = ((C58722tx) A0U2.A00).A01;
            if (r05 == null) {
                r05 = C445224k.A0R;
            }
            boolean z2 = r10.A09;
            boolean z3 = r10.A07;
            C68803e1 A1A2 = r3.A1A((C68803e1) r05.A0U(), z2, z3);
            if (A1A2 == null || (userJid = r3.A00) == null) {
                sb = new StringBuilder("FMessageCatalog/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=");
                sb.append(r3.A11);
                sb.append("; media_wa_type=");
                sb.append(r3.A10);
                sb.append("; business_owner_jid=");
                sb.append(r3.A00);
            } else {
                String rawString = userJid.getRawString();
                A0U.A03();
                AnonymousClass2uE r12 = (AnonymousClass2uE) A0U.A00;
                r12.A00 |= 2;
                r12.A05 = rawString;
                if (!TextUtils.isEmpty(r3.A01)) {
                    String str = r3.A01;
                    A0U2.A03();
                    C58722tx r13 = (C58722tx) A0U2.A00;
                    r13.A00 |= 4;
                    r13.A02 = str;
                }
                if (!TextUtils.isEmpty(r3.A02)) {
                    String str2 = r3.A02;
                    A0U2.A03();
                    C58722tx r14 = (C58722tx) A0U2.A00;
                    r14.A00 |= 2;
                    r14.A03 = str2;
                }
                A0U2.A03();
                C58722tx r15 = (C58722tx) A0U2.A00;
                r15.A01 = (C445224k) A1A2.A02();
                r15.A00 |= 1;
                A0U.A03();
                AnonymousClass2uE r16 = (AnonymousClass2uE) A0U.A00;
                r16.A02 = (C58722tx) A0U2.A02();
                r16.A00 |= 4;
                AnonymousClass1WV r22 = r10.A05;
                byte[] bArr = r10.A0A;
                if (C41071vB.A0O(r22, r3, bArr)) {
                    AnonymousClass21S A002 = r11.A00(r22, r3, bArr, z3);
                    A0U.A03();
                    AnonymousClass2uE r17 = (AnonymousClass2uE) A0U.A00;
                    r17.A01 = A002;
                    r17.A00 |= 32;
                }
                r52.A03();
                C33211iD r23 = (C33211iD) r52.A00;
                r23.A0a = (AnonymousClass2uE) A0U.A02();
                r23.A00 |= 16777216;
                return;
            }
        } else {
            C33221iE r32 = r10.A04;
            C445224k r06 = ((C33211iD) r32.A00).A0N;
            if (r06 == null) {
                r06 = C445224k.A0R;
            }
            C68803e1 A19 = A19((C68803e1) r06.A0U(), r10, r11);
            if (A19 == null) {
                return;
            }
            if (!A0x() || A0E().A00 == null) {
                r32.A03();
                C33211iD r18 = (C33211iD) r32.A00;
                r18.A0N = (C445224k) A19.A02();
                r18.A00 |= 4;
                return;
            }
            C58852uG r07 = ((C33211iD) r32.A00).A03;
            if (r07 == null) {
                r07 = C58852uG.A08;
            }
            C69503f9 r24 = (C69503f9) r07.A0U();
            C28541Wm A02 = A19.A02();
            r24.A03();
            C58852uG r19 = (C58852uG) r24.A00;
            r19.A05 = A02;
            r19.A01 = 3;
            r24.A05(AnonymousClass438.A03);
            C42551xz.A03(r24, A0E().A00);
            r32.A06((C58852uG) r24.A02());
            return;
        }
        Log.w(sb.toString());
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r8) {
        C28381Vw r2 = r8;
        if (this instanceof C38891ra) {
            C38891ra r3 = (C38891ra) this;
            return new C38891ra(r3.A02, r2, r3, r3.A0I, true);
        } else if (this instanceof C39111rw) {
            C39111rw r32 = (C39111rw) this;
            return new C39111rw(r32.A02, r2, r32, r32.A0I, true);
        } else if (this instanceof C38901rb) {
            C38901rb r33 = (C38901rb) this;
            return new C38901rb(r33.A02, r2, r33, r33.A0I);
        } else if (this instanceof C38981rj) {
            C38981rj r34 = (C38981rj) this;
            return new C38981rj(r34.A02, r2, r34, r34.A0I, true);
        } else {
            return new C38681rF(this.A02, r2, this, this.A0I, true);
        }
    }
}
