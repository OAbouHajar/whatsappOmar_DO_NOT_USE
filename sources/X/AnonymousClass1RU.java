package X;

import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape0S0311000_I0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1RU  reason: invalid class name */
public class AnonymousClass1RU {
    public final AnonymousClass12E A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C19150xq A03;
    public final AnonymousClass15G A04;
    public final AnonymousClass1WA A05;

    public AnonymousClass1RU(AnonymousClass12E r3, C14870pt r4, C16040sK r5, C19150xq r6, AnonymousClass15G r7, C16320sq r8) {
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A00 = r3;
        this.A05 = new AnonymousClass1WA(r8, true);
    }

    public static boolean A00(C16740tZ r4, byte b2) {
        int i2;
        if (r4 == null || (i2 = r4.A07) == 0) {
            return false;
        }
        if (b2 == 56 && (i2 & 1) == 1) {
            return r4.A0W == null;
        }
        if (!(r4 instanceof C39171s2) || b2 != 67) {
            if (!(b2 == 68 && (i2 & 4) == 4 && r4.A1A == null)) {
                return false;
            }
        } else if (!((i2 & 2) == 2 && ((C39171s2) r4).A04 == null)) {
            return false;
        }
    }

    public synchronized void A01(C16740tZ r5, byte b2) {
        IllegalStateException illegalStateException;
        if (A00(r5, b2)) {
            List<C38541qx> A08 = this.A04.A08(r5, b2);
            if (b2 == 56) {
                ArrayList arrayList = new ArrayList();
                for (C38541qx r1 : A08) {
                    if (r1 instanceof C39101rv) {
                        arrayList.add((C39101rv) r1);
                    }
                }
                AnonymousClass23T r12 = new AnonymousClass23T(this.A02, arrayList);
                if (r5.A0W == null) {
                    r5.A0W = r12;
                } else {
                    illegalStateException = new IllegalStateException("FMessage/setMessageReactions re-assigning messageReactions");
                }
            } else if ((r5 instanceof C39171s2) && b2 == 67) {
                ArrayList arrayList2 = new ArrayList();
                for (C38541qx r13 : A08) {
                    if (r13 instanceof C39181s3) {
                        arrayList2.add(r13);
                    }
                }
                C39171s2 r52 = (C39171s2) r5;
                if (r52.A04 == null) {
                    r52.A04 = arrayList2;
                } else {
                    illegalStateException = new IllegalStateException("FMessagePoll/setPollVotes re-assigning pollVotes");
                }
            } else if (b2 == 68) {
                boolean z2 = true;
                if (A08.size() > 1) {
                    z2 = false;
                }
                AnonymousClass00B.A0B("Multiple KeepInChat messages linked to a parent message", z2);
                for (C38541qx r14 : A08) {
                    if (r14 instanceof C39191s4) {
                        C39191s4 r15 = (C39191s4) r14;
                        r5.A1A = r15;
                        if (r15 != null) {
                            r5.A06 = r15.A01;
                        }
                    }
                }
            }
            throw illegalStateException;
        }
    }

    public void A02(C16740tZ r9, Runnable runnable, byte b2) {
        C16740tZ r3 = r9;
        boolean A012 = this.A00.A00().A01(r9.A11.A00);
        byte b3 = b2;
        Runnable runnable2 = runnable;
        if (A00(r9, b2)) {
            this.A05.execute(new RunnableRunnableShape0S0311000_I0((Object) this, (Object) r3, (Object) runnable2, (int) b3, 6, A012));
        } else {
            A03(r3, runnable2, b3, false, A012);
        }
    }

    public final void A03(C16740tZ r10, Runnable runnable, byte b2, boolean z2, boolean z3) {
        this.A01.A0K(new RunnableRunnableShape0S0311000_I0((Object) this, (Object) runnable, (Object) r10, (int) b2, 7, z2));
        if (z3) {
            this.A05.execute(new RunnableRunnableShape0S0201000_I0((Object) this, (int) b2, (Object) r10, 31));
        }
    }
}
