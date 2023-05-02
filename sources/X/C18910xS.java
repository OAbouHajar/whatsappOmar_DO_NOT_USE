package X;

import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import com.facebook.redex.RunnableRunnableShape0S0310000_I0;
import com.facebook.redex.RunnableRunnableShape0S1310000_I0;
import com.facebook.redex.RunnableRunnableShape6S0200000_I0_4;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0xS  reason: invalid class name and case insensitive filesystem */
public class C18910xS {
    public final C14870pt A00;
    public final C17760vb A01;
    public final C18930xU A02;
    public final AnonymousClass17Z A03;
    public final C15800rs A04;
    public final C222417e A05;
    public final C15860rz A06;
    public final AnonymousClass126 A07;
    public final AnonymousClass10R A08;
    public final C16920ts A09;
    public final C15810rt A0A;
    public final C218015m A0B;
    public final AnonymousClass17E A0C;
    public final C26901Pr A0D;
    public final C19780yz A0E;
    public final C19650ym A0F;
    public final C16900tq A0G;
    public final C17290uq A0H;
    public final AnonymousClass15B A0I;
    public final AnonymousClass17C A0J;
    public final AnonymousClass19A A0K;
    public final AnonymousClass15G A0L;
    public final AnonymousClass15X A0M;
    public final C19580yf A0N;
    public final C20260zl A0O;
    public final C16490t9 A0P;
    public final C19790z0 A0Q;
    public final C19830z4 A0R;
    public final C16220sf A0S;
    public final C16320sq A0T;

    public C18910xS(C14870pt r2, C17760vb r3, C18930xU r4, AnonymousClass17Z r5, C15800rs r6, C222417e r7, C15860rz r8, AnonymousClass126 r9, AnonymousClass10R r10, C16920ts r11, C15810rt r12, C218015m r13, AnonymousClass17E r14, C26901Pr r15, C19780yz r16, C19650ym r17, C16900tq r18, C17290uq r19, AnonymousClass15B r20, AnonymousClass17C r21, AnonymousClass19A r22, AnonymousClass15G r23, AnonymousClass15X r24, C19580yf r25, C20260zl r26, C16490t9 r27, C19790z0 r28, C19830z4 r29, C16220sf r30, C16320sq r31) {
        this.A00 = r2;
        this.A09 = r11;
        this.A0T = r31;
        this.A0A = r12;
        this.A0H = r19;
        this.A0P = r27;
        this.A0I = r20;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A0O = r26;
        this.A0C = r14;
        this.A01 = r3;
        this.A08 = r10;
        this.A0E = r16;
        this.A0Q = r28;
        this.A0S = r30;
        this.A0J = r21;
        this.A07 = r9;
        this.A0B = r13;
        this.A0L = r23;
        this.A0G = r18;
        this.A06 = r8;
        this.A0M = r24;
        this.A04 = r6;
        this.A0D = r15;
        this.A0N = r25;
        this.A0F = r17;
        this.A0K = r22;
        this.A0R = r29;
    }

    public Long A00(C15830rv r7) {
        C18930xU r5 = this.A02;
        Set A0D2 = r5.A0D(r7, false);
        Long A082 = this.A0S.A08(r7, 0, false);
        if (A082 != null) {
            r5.A0V(A0D2);
            return A082;
        }
        r5.A0U(A0D2);
        return A082;
    }

    public HashMap A01(Integer num, List list) {
        Set A0A2 = this.A0S.A0A();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15830rv r1 = (C15830rv) it.next();
            if (!C16030sJ.A0R(r1)) {
                A04(r1, num, true);
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C15830rv r12 = (C15830rv) it2.next();
            if (!C16030sJ.A0R(r12) && A0A2.contains(r12)) {
                hashMap.put(r12, A00(r12));
            }
        }
        return hashMap;
    }

    public void A02(C15830rv r5) {
        C15840rx A062 = this.A0A.A06(r5);
        if (A062 == null) {
            StringBuilder sb = new StringBuilder("msgstore/reset-show-group-description/no chat ");
            sb.append(r5);
            Log.w(sb.toString());
        } else if (!A062.A0h) {
            StringBuilder sb2 = new StringBuilder("msgstore/reset-show-group-description/nop ");
            sb2.append(r5);
            Log.i(sb2.toString());
        } else {
            A062.A0h = false;
            this.A07.A01(new RunnableRunnableShape6S0200000_I0_4(this, 16, A062), 5);
        }
    }

    public final void A03(C15830rv r24, C16740tZ r25, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5;
        int i6;
        C15830rv r14 = r24;
        C15840rx A062 = this.A0A.A06(r14);
        C16740tZ r2 = r25;
        if (A062 == null) {
            StringBuilder sb = new StringBuilder("msgstore/setchatseen/nochat/");
            sb.append(r14);
            sb.append("/");
            sb.append(r25 != null ? r2.A11 : null);
            Log.i(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("msgstore/setchatseen/");
        sb2.append(r14);
        sb2.append("/");
        sb2.append(A062.A07());
        sb2.append("/");
        sb2.append(r25 != null ? r2.A11 : null);
        sb2.append("/");
        int i7 = i2;
        sb2.append(i7);
        Log.i(sb2.toString());
        boolean z4 = true;
        boolean z5 = false;
        if (A062.A06 == -1) {
            z5 = true;
        }
        if (r25 != null) {
            AnonymousClass15B r3 = this.A0I;
            C15830rv r6 = r2.A11.A00;
            AnonymousClass00B.A06(r6);
            i5 = r3.A00(r6, r2.A14);
            C26901Pr r32 = this.A0D;
            AnonymousClass00B.A06(r6);
            i6 = r32.A00(r6, r2.A14);
        } else {
            i5 = 0;
            i6 = 0;
        }
        boolean A0C2 = A062.A0C(i7, i3, i5, i6);
        long j2 = A062.A0R;
        long j3 = A062.A0K;
        if (j3 > j2) {
            A062.A0R = j3;
            A062.A05 = 0;
        } else {
            z4 = A0C2;
        }
        long j4 = (r25 == null || r2.A13 == 0) ? 1 : r2.A13;
        long A072 = C38621r6.A07(r2);
        long j5 = A062.A0O;
        if (j4 == 1) {
            A072 = A062.A0M;
            long j6 = A062.A0T;
            if (A072 > j6) {
                j4 = A062.A0L;
            } else {
                j4 = A062.A0S;
                A072 = j6;
            }
        }
        if (j5 < A072 || z4 || A062.A0L == 0) {
            if (A062.A0L == 0) {
                C17290uq r0 = this.A0H;
                C15830rv r22 = A062.A0i;
                A062.A0L = r0.A02(r22);
                A062.A0M = this.A0I.A05(r22);
                A062.A0Y = null;
            }
            if (A062.A0J != 1) {
                A062.A0J = 1;
            }
            A062.A0N = j4;
            A062.A0O = A072;
            this.A07.A01(new AnonymousClass25F(A062, this, r14, i4, j5, j2, z2, z5, z3), 2);
        }
    }

    public void A04(C15830rv r20, Integer num, boolean z2) {
        C16320sq r7;
        StringBuilder sb;
        String str;
        C15830rv r6 = r20;
        boolean z3 = z2;
        if (z2) {
            this.A01.A00(r6, 3);
            C20260zl r4 = this.A0O;
            r7 = this.A0T;
            C42601y5.A01(this.A0E, r4, this.A0P, r6, r7, 6, (Integer) null, 3);
        } else {
            C20260zl r12 = this.A0O;
            r7 = this.A0T;
            C42601y5.A01(this.A0E, r12, this.A0P, r6, r7, 8, (Integer) null, 4);
        }
        r7.Acl(new RunnableRunnableShape0S0310000_I0(this, r6, num, 2, z3));
        C15840rx A062 = this.A0A.A06(r6);
        if (A062 == null) {
            sb = new StringBuilder();
            str = "msgstore/archive/no chat ";
        } else if (A062.A0e == z3) {
            sb = new StringBuilder();
            str = "msgstore/archive/nop ";
        } else {
            A06(z3);
            A062.A0e = z3;
            this.A03.A00();
            this.A07.A01(new RunnableRunnableShape0S0210000_I0(this, A062, 9, z3), 3);
            return;
        }
        sb.append(str);
        sb.append(r6);
        sb.append(" ");
        sb.append(z3);
        Log.w(sb.toString());
    }

    public void A05(C15830rv r10, Runnable runnable, String str) {
        this.A07.A01(new RunnableRunnableShape0S1310000_I0(this, r10, runnable, str, 2, false), 6);
    }

    public final void A06(boolean z2) {
        if (z2 && this.A04.A00() == 0 && !this.A06.A1b()) {
            Log.i("chatMAnager/setChatArchived/Enabling archive2.0");
            this.A05.A02();
        }
    }

    public final void A07(boolean z2) {
        boolean z3;
        synchronized (this.A0F) {
            C15810rt r3 = this.A0A;
            synchronized (r3) {
                z3 = r3.A00;
            }
            if (!z3) {
                C33801jB r2 = new C33801jB(this);
                synchronized (r3) {
                    r3.A0C();
                    boolean z4 = false;
                    if (r3.A03 == null) {
                        z4 = true;
                    }
                    AnonymousClass00B.A0G(z4);
                    r3.A03 = r2;
                    if (!z2) {
                        r3.A0C();
                    }
                }
            }
        }
    }

    public boolean A08(C15830rv r8) {
        C15840rx A062 = this.A0A.A06(r8);
        if (A062 != null) {
            return (A062.A06 == 0 && A062.A07 == 0 && A062.A0O == Math.max(A062.A0M, A062.A0T) && A062.A0K <= A062.A0R) ? false : true;
        }
        return false;
    }
}
