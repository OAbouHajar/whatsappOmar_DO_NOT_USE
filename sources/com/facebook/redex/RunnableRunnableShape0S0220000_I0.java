package com.facebook.redex;

import X.AnonymousClass022;
import X.AnonymousClass10X;
import X.AnonymousClass1HE;
import X.AnonymousClass1WK;
import X.AnonymousClass1XJ;
import X.AnonymousClass1XP;
import X.C006903e;
import X.C007103g;
import X.C101844xy;
import X.C15830rv;
import X.C15840rx;
import X.C16030sJ;
import X.C16220sf;
import X.C16460t6;
import X.C16740tZ;
import X.C16760tb;
import X.C17380uz;
import X.C18450wi;
import X.C18930xU;
import X.C19410yO;
import X.C221616w;
import X.C221716x;
import X.C26931Pu;
import X.C28381Vw;
import X.C28831Xx;
import X.C33671ix;
import X.C33731j4;
import X.C36851oD;
import X.C36971oP;
import X.C42561y1;
import X.C43241zg;
import X.C45932Br;
import X.C47542Jk;
import com.obwhatsapp.data.ConversationDeleteWorker;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RunnableRunnableShape0S0220000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public RunnableRunnableShape0S0220000_I0(C17380uz r2, C19410yO r3, boolean z2) {
        this.A04 = 2;
        this.A00 = r3;
        this.A01 = r2;
        this.A02 = z2;
        this.A03 = false;
    }

    public RunnableRunnableShape0S0220000_I0(Object obj, Object obj2, int i2, boolean z2, boolean z3) {
        this.A04 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z2;
        this.A03 = z3;
    }

    public final void run() {
        ArrayList arrayList;
        Set A0I;
        long j2;
        C15830rv r14;
        boolean z2;
        boolean A0T;
        StringBuilder sb;
        String str;
        Set A0I2;
        switch (this.A04) {
            case 0:
                AnonymousClass10X r4 = (AnonymousClass10X) this.A00;
                C43241zg r5 = (C43241zg) this.A01;
                boolean z3 = this.A02;
                boolean z4 = this.A03;
                byte[] bArr = null;
                for (C16740tZ r1 : Collections.unmodifiableList(r5.A01)) {
                    r4.A0H.A00(r1);
                    if (bArr == null && r1.A0F() != null) {
                        bArr = r1.A0F().A07();
                    }
                }
                AnonymousClass1HE r6 = r4.A0E;
                AnonymousClass1XJ r8 = new AnonymousClass1XJ(z3, r5.A04(), r5.A03());
                r6.A0S.execute(new RunnableRunnableShape8S0200000_I0_6(r6, 21, r5));
                C47542Jk r42 = new C47542Jk(r5, r6, (AnonymousClass1XP) null, r8, bArr, false, false, false, z4);
                C28831Xx r0 = r6.A0P;
                if (r0 != null) {
                    r0.execute(r42);
                    return;
                } else {
                    r6.A0O.Acl(r42);
                    return;
                }
            case 1:
                C16760tb r82 = (C16760tb) this.A00;
                Collection<C16740tZ> collection = (Collection) this.A01;
                boolean z5 = this.A02;
                boolean z6 = this.A03;
                C18930xU r2 = r82.A0I;
                C33671ix r12 = (C33671ix) r2.A0T.A02("deleteMessageForMe");
                if (r12 == null) {
                    A0I = Collections.emptySet();
                } else {
                    if (!collection.isEmpty()) {
                        long A002 = r12.A00.A00();
                        ArrayList arrayList2 = new ArrayList(collection.size());
                        for (C16740tZ r10 : collection) {
                            C28381Vw r43 = r10.A11;
                            C15830rv r13 = r43.A00;
                            C15830rv A0B = (C16030sJ.A0L(r13) || C16030sJ.A0G(r13)) ? r10.A0B() : null;
                            if (r43.A02) {
                                if (r10.A0C == 0) {
                                    j2 = 0;
                                } else {
                                    j2 = r10.A0H;
                                    if (j2 > 0) {
                                    }
                                }
                                arrayList2.add(new C36851oD((AnonymousClass1WK) null, A0B, r43, (String) null, A002, j2, z5, false));
                            }
                            j2 = r10.A0I;
                            arrayList2.add(new C36851oD((AnonymousClass1WK) null, A0B, r43, (String) null, A002, j2, z5, false));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = Collections.emptyList();
                    }
                    A0I = r2.A0I(arrayList);
                }
                C16460t6 r3 = r82.A0e;
                if (z6) {
                    Iterator it = collection.iterator();
                    C16740tZ r02 = (C16740tZ) (it.hasNext() ? it.next() : null);
                    if (!(r02 == null || (r14 = r02.A11.A00) == null)) {
                        String str2 = "action_singular_delete";
                        C221616w r132 = r3.A0U;
                        C42561y1 A012 = r132.A01(r132.A00.A02(r14));
                        if (A012 != null) {
                            List list = A012.A09;
                            if (list != null) {
                                r3.A0q(A012, new C101844xy(r3), true);
                            }
                            ((AnonymousClass022) r3.A0Q.A02.get()).A09(String.valueOf(r14.hashCode()));
                            if (r3.A0O.A0I(A012.A07)) {
                                str2 = "action_delete";
                            } else if (list == null || A012.A04 != Long.MIN_VALUE) {
                                str2 = "action_clear";
                            }
                            z2 = A012.A0C;
                        } else {
                            z2 = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (C16740tZ r03 : collection) {
                            arrayList3.add(Long.valueOf(r03.A13));
                        }
                        boolean z7 = false;
                        if (z5 && true) {
                            z7 = true;
                        }
                        C42561y1 A032 = r132.A03(r14, Long.MIN_VALUE, arrayList3, true, z2, z7);
                        if (A032 != null) {
                            C221716x r9 = r3.A0Q;
                            String valueOf = String.valueOf(r14.hashCode());
                            C006903e r83 = new C006903e(ConversationDeleteWorker.class);
                            C007103g r133 = new C007103g();
                            Map map = r133.A00;
                            map.put("delete_action", str2);
                            map.put("job_id", Long.valueOf(A032.A06));
                            r83.A00.A0B = r133.A00();
                            r83.A02((long) 4000, TimeUnit.MILLISECONDS);
                            r83.A03.add(valueOf);
                            ((AnonymousClass022) r9.A02.get()).A07(r83.A00());
                        }
                        C15840rx A06 = r3.A0O.A06(r14);
                        if (A06 != null) {
                            Iterator it2 = collection.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (A06.A0L == ((C16740tZ) it2.next()).A13) {
                                        r3.A0P(r14);
                                    }
                                }
                            }
                        }
                        r3.A0e.A01.post(new RunnableRunnableShape0S0310000_I0(r3, collection, r14, 3, true));
                    }
                } else {
                    r3.A0n(collection, z5 ? 1 : 0);
                }
                r2.A0V(A0I);
                return;
            case 2:
                C19410yO r32 = (C19410yO) this.A00;
                C17380uz r22 = (C17380uz) this.A01;
                r32.A0I.A07(r22, this.A02);
                r32.A0P.removeAll(r22);
                r32.A07.A0G();
                r32.A09(r22);
                return;
            case 3:
                ((C45932Br) this.A00).A00.A0D((C28381Vw) this.A01, this.A02, this.A03);
                return;
            default:
                C26931Pu r44 = (C26931Pu) this.A00;
                UserJid userJid = (UserJid) this.A01;
                boolean z8 = this.A02;
                boolean z9 = this.A03;
                C16220sf r04 = r44.A02;
                if (z8) {
                    A0T = r04.A0U(userJid);
                    sb = new StringBuilder();
                    str = "StatusViewingSettings/mute-user-status returned ";
                } else {
                    A0T = r04.A0T(userJid);
                    sb = new StringBuilder();
                    str = "StatusViewingSettings/cancel-mute-user-status returned ";
                }
                sb.append(str);
                sb.append(A0T);
                Log.i(sb.toString());
                if (z9) {
                    C18930xU r23 = r44.A00;
                    C33731j4 r05 = (C33731j4) r23.A0T.A02("userStatusMute");
                    if (r05 == null) {
                        A0I2 = Collections.emptySet();
                    } else {
                        long A003 = r05.A00.A00();
                        C18450wi.A0H(userJid, 1);
                        A0I2 = r23.A0I(Collections.singletonList(new C36971oP((AnonymousClass1WK) null, userJid, (String) null, A003, z8, false)));
                    }
                    if (A0T) {
                        r23.A0V(A0I2);
                        return;
                    } else {
                        r23.A0U(A0I2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
