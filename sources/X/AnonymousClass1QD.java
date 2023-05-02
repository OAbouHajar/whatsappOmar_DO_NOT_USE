package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1QD  reason: invalid class name */
public class AnonymousClass1QD implements AnonymousClass1Q5 {
    public final AnonymousClass1Q6 A00;

    public AnonymousClass1QD(AnonymousClass1Q6 r1) {
        this.A00 = r1;
    }

    public void A5i(C16740tZ r17, AnonymousClass21Q r18, AnonymousClass1GC r19) {
        C33211iD r1;
        int i2;
        C15830rv r8;
        UserJid userJid;
        C28381Vw r0;
        C16740tZ r5 = r17;
        if (r5 instanceof C39101rv) {
            C39101rv r52 = (C39101rv) r5;
            C33221iE r3 = r18.A04;
            C53052eu r02 = ((C33211iD) r3.A00).A0c;
            if (r02 == null) {
                r02 = C53052eu.A05;
            }
            C28581Wr A0U = r02.A0U();
            C33231iF r03 = ((C53052eu) A0U.A00).A02;
            if (r03 == null) {
                r03 = C33231iF.A05;
            }
            C33241iG r7 = (C33241iG) r03.A0U();
            C28381Vw A12 = r52.A12();
            AnonymousClass23X r04 = r52.A02;
            C15830rv r4 = r04 == null ? null : r04.A00;
            AnonymousClass23X r12 = r52.A01;
            if (!(r12 == null || (r0 = r12.A01) == null)) {
                A12 = r0;
                r4 = r12.A00;
            }
            AnonymousClass00B.A06(A12);
            AnonymousClass23Y.A02(r4, r7, A12);
            A0U.A03();
            C53052eu r13 = (C53052eu) A0U.A00;
            r13.A02 = (C33231iF) r7.A02();
            r13.A00 |= 1;
            String str = !TextUtils.isEmpty(r52.A01) ? r52.A01 : "";
            A0U.A03();
            C53052eu r14 = (C53052eu) A0U.A00;
            r14.A00 |= 2;
            r14.A04 = str;
            long j2 = r52.A00;
            A0U.A03();
            C53052eu r15 = (C53052eu) A0U.A00;
            r15.A00 |= 8;
            r15.A01 = j2;
            AnonymousClass1Q6 r6 = this.A00;
            C15830rv r16 = r52.A11.A00;
            if (!(r16 instanceof GroupJid) || r6.A01.A02((GroupJid) r16) != 3) {
                r3.A03();
                r1 = (C33211iD) r3.A00;
                r1.A0c = (C53052eu) A0U.A02();
                i2 = r1.A01 | 16;
            } else {
                AnonymousClass00B.A06(r52.A12());
                C58622tn r05 = ((C33211iD) r3.A00).A0D;
                if (r05 == null) {
                    r05 = C58622tn.A04;
                }
                C28581Wr A0U2 = r05.A0U();
                byte[] A01 = r6.A02.A01(r52.A00);
                C28381Vw A122 = r52.A12();
                if (A122 == null || !A122.A02) {
                    AnonymousClass23X r06 = r52.A02;
                    if (r06 == null || (r8 = r06.A00) == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.obwhatsapp.jid.UserJid");
                    }
                    userJid = (UserJid) r8;
                } else {
                    C16040sK r07 = r6.A00;
                    r07.A0B();
                    userJid = r07.A05;
                }
                if (userJid != null) {
                    AnonymousClass1ZX A03 = r6.A00.A03();
                    if (A03 != null) {
                        A0U2.A03();
                        C58622tn r110 = (C58622tn) A0U2.A00;
                        r110.A03 = (C33231iF) r7.A02();
                        r110.A00 |= 1;
                        A0U.A03();
                        C53052eu r111 = (C53052eu) A0U.A00;
                        r111.A02 = null;
                        r111.A00 &= -2;
                        JniBridge jniBridge = r6.A03;
                        C28381Vw A123 = r52.A12();
                        String str2 = A123 == null ? null : A123.A01;
                        C28541Wm A02 = A0U.A02();
                        boolean z2 = true;
                        if (str2 == null || A01 == null) {
                            StringBuilder sb = new StringBuilder("MessageAddOnEncReactionUtils/");
                            sb.append("decryptEncReactionMessage: one of the params is null, targetMessageId is null = ");
                            boolean z3 = false;
                            if (str2 == null) {
                                z3 = true;
                            }
                            sb.append(z3);
                            sb.append("messageSecret is null = ");
                            if (A01 != null) {
                                z2 = false;
                            }
                            sb.append(z2);
                            Log.e(sb.toString());
                        } else {
                            C83814Id A002 = C441723b.A00(userJid, A03, jniBridge, str2, "Enc Reaction", A01, (byte[]) null, A02.A02());
                            if (A002 != null) {
                                C28631Ww r2 = A002.A00;
                                A0U2.A03();
                                C58622tn r112 = (C58622tn) A0U2.A00;
                                r112.A00 |= 4;
                                r112.A01 = r2;
                                C28631Ww r22 = A002.A01;
                                A0U2.A03();
                                C58622tn r113 = (C58622tn) A0U2.A00;
                                r113.A00 |= 2;
                                r113.A02 = r22;
                            }
                        }
                        r3.A03();
                        r1 = (C33211iD) r3.A00;
                        r1.A0D = (C58622tn) A0U2.A02();
                        i2 = r1.A01 | 4096;
                    } else {
                        throw new NullPointerException("reactionSenderUserLid is NULL");
                    }
                } else {
                    throw new NullPointerException("targetSenderUserJid is NULL");
                }
            }
            r1.A01 = i2;
            return;
        }
        throw new IllegalArgumentException("FMessageReactionSerializer/not supported message");
    }

    public int[] ACW() {
        return new int[]{56};
    }
}
