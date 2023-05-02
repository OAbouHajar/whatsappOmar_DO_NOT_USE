package X;

import com.obwhatsapp.group.IDxCObserverShape80S0100000_2_I0;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2O9  reason: invalid class name */
public class AnonymousClass2O9 extends C003401n {
    public final C16040sK A00;
    public final C16000sG A01;
    public final AnonymousClass18Q A02;
    public final C16080sP A03;
    public final C16440t3 A04;
    public final C15810rt A05;
    public final AnonymousClass18U A06;
    public final C16070sO A07;
    public final AnonymousClass192 A08;
    public final C14710pd A09;
    public final C53272fR A0A;
    public final AnonymousClass18N A0B;
    public final C16050sL A0C;
    public final C47712Kc A0D;
    public final AnonymousClass2OB A0E = new AnonymousClass2OB();
    public final AnonymousClass2OB A0F = new AnonymousClass2OB();
    public final AnonymousClass2OB A0G = new AnonymousClass2OB();
    public final AnonymousClass2OB A0H = new AnonymousClass2OB();
    public final C17110uY A0I;
    public final AnonymousClass2OJ A0J = new AnonymousClass2OJ(0);
    public final AnonymousClass2OJ A0K = new AnonymousClass2OJ(0);
    public final C16320sq A0L;

    public AnonymousClass2O9(C16040sK r3, C16000sG r4, AnonymousClass18Q r5, C16080sP r6, C16440t3 r7, C15810rt r8, AnonymousClass18U r9, C16070sO r10, AnonymousClass192 r11, C14710pd r12, AnonymousClass18N r13, C16050sL r14, C47712Kc r15, C17110uY r16, C16320sq r17) {
        IDxCObserverShape80S0100000_2_I0 iDxCObserverShape80S0100000_2_I0 = new IDxCObserverShape80S0100000_2_I0(this, 1);
        this.A0A = iDxCObserverShape80S0100000_2_I0;
        this.A04 = r7;
        this.A09 = r12;
        this.A0I = r16;
        this.A00 = r3;
        this.A0L = r17;
        this.A05 = r8;
        this.A01 = r4;
        this.A03 = r6;
        this.A0B = r13;
        this.A07 = r10;
        this.A08 = r11;
        this.A02 = r5;
        this.A06 = r9;
        this.A0C = r14;
        this.A0D = r15;
        r13.A02(iDxCObserverShape80S0100000_2_I0);
    }

    public void A04() {
        this.A0B.A03(this.A0A);
    }

    public void A05(C34871l0 r3) {
        AnonymousClass2OC r0 = (AnonymousClass2OC) this.A0E.A01();
        if (r0 != null) {
            C16010sH.A04(r3, r0.A00);
            AnonymousClass2OB r1 = this.A0H;
            Object A012 = r1.A01();
            if (A012 != null) {
                r1.A09(A012);
            }
            AnonymousClass2OB r12 = this.A0F;
            Object A013 = r12.A01();
            if (A013 != null) {
                r12.A09(A013);
            }
        }
    }

    public boolean A06(UserJid userJid) {
        AnonymousClass2OC r0 = (AnonymousClass2OC) this.A0E.A01();
        return r0 != null && r0.A01.contains(userJid);
    }
}
