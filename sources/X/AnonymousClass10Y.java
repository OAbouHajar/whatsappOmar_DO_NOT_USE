package X;

import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape0S0301000_I0;
import com.facebook.redex.RunnableRunnableShape0S0310000_I0;
import com.whatsapp.util.Log;

/* renamed from: X.10Y  reason: invalid class name */
public class AnonymousClass10Y {
    public final C14870pt A00;
    public final AnonymousClass18Z A01;
    public final C16440t3 A02;
    public final C15860rz A03;
    public final C18910xS A04;
    public final C15810rt A05;
    public final AnonymousClass11A A06;
    public final C16460t6 A07;
    public final C19780yz A08;
    public final AnonymousClass15X A09;
    public final C19580yf A0A;
    public final C20260zl A0B;
    public final C16490t9 A0C;
    public final C14770pj A0D;
    public final C16320sq A0E;

    public AnonymousClass10Y(C14870pt r1, AnonymousClass18Z r2, C16440t3 r3, C15860rz r4, C18910xS r5, C15810rt r6, AnonymousClass11A r7, C16460t6 r8, C19780yz r9, AnonymousClass15X r10, C19580yf r11, C20260zl r12, C16490t9 r13, C14770pj r14, C16320sq r15) {
        this.A02 = r3;
        this.A00 = r1;
        this.A0E = r15;
        this.A05 = r6;
        this.A0C = r13;
        this.A04 = r5;
        this.A0B = r12;
        this.A01 = r2;
        this.A07 = r8;
        this.A08 = r9;
        this.A0D = r14;
        this.A09 = r10;
        this.A03 = r4;
        this.A06 = r7;
        this.A0A = r11;
    }

    public void A00(C15830rv r7, int i2, boolean z2, boolean z3) {
        A01(r7, i2, z2, z3, false);
    }

    public void A01(C15830rv r14, int i2, boolean z2, boolean z3, boolean z4) {
        C18910xS r4 = this.A04;
        C15830rv r5 = r14;
        if (r4.A08(r14)) {
            int i3 = this.A05.A07(r14).A00;
            if (i3 > 0) {
                C20260zl r0 = this.A0B;
                C16490t9 r10 = this.A0C;
                C19780yz r8 = this.A08;
                C16320sq r1 = this.A0E;
                if (C40561uK.A01(r0, r14)) {
                    r1.Acl(new RunnableRunnableShape0S0301000_I0(r8, r14, r10, i3, 0));
                }
            }
            if (z3) {
                this.A0D.A09(r14);
            }
            this.A0D.A0A(r14, (C16740tZ) null);
            r4.A03(r5, (C16740tZ) null, 0, 0, i2, z2, z4);
            C15860rz r12 = this.A03;
            r12.A0K().putLong("last_read_conversation_time", this.A02.A00()).apply();
            this.A00.A0L(new RunnableRunnableShape0S0300000_I0(this.A06, r14, this.A01, 33), 300);
        }
    }

    public void A02(C15830rv r8, boolean z2) {
        C18910xS r2 = this.A04;
        C15830rv r3 = r8;
        r2.A01.A00(r8, 8);
        C15840rx A062 = r2.A0A.A06(r8);
        if (A062 == null) {
            StringBuilder sb = new StringBuilder("msgstore/setchatunseen/nochat/");
            sb.append(r8);
            Log.i(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("msgstore/setchatunseen/");
            sb2.append(r8);
            sb2.append("/");
            sb2.append(A062.A07());
            Log.i(sb2.toString());
            A062.A0C(-1, 0, 0, 0);
            r2.A07.A01(new RunnableRunnableShape0S0310000_I0(r2, r3, A062, 1, z2), 1);
        }
        this.A06.A06(r8);
    }
}
