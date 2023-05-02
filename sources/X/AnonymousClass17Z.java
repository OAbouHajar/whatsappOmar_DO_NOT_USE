package X;

import com.facebook.redex.RunnableRunnableShape0S0301000_I0;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.17Z  reason: invalid class name */
public class AnonymousClass17Z {
    public final C14870pt A00;
    public final AnonymousClass18Z A01;
    public final AnonymousClass127 A02;
    public final C16000sG A03;
    public final AnonymousClass0y4 A04;
    public final C15800rs A05;
    public final C15810rt A06;
    public final AnonymousClass11A A07;
    public final C17580vJ A08;
    public final AnonymousClass15H A09;
    public final C19790z0 A0A;
    public final C222517f A0B;
    public final C19830z4 A0C;
    public final C16320sq A0D;
    public final AnonymousClass01J A0E;

    public AnonymousClass17Z(C14870pt r1, AnonymousClass18Z r2, AnonymousClass127 r3, C16000sG r4, AnonymousClass0y4 r5, C15800rs r6, C15810rt r7, AnonymousClass11A r8, C17580vJ r9, AnonymousClass15H r10, C19790z0 r11, C222517f r12, C19830z4 r13, C16320sq r14, AnonymousClass01J r15) {
        this.A00 = r1;
        this.A0D = r14;
        this.A06 = r7;
        this.A0B = r12;
        this.A01 = r2;
        this.A03 = r4;
        this.A08 = r9;
        this.A0A = r11;
        this.A02 = r3;
        this.A04 = r5;
        this.A0E = r15;
        this.A05 = r6;
        this.A07 = r8;
        this.A09 = r10;
        this.A0C = r13;
    }

    public void A00() {
        this.A07.A04();
        this.A01.A01();
    }

    public void A01(C15830rv r5) {
        C15810rt r1 = this.A06;
        if (r1.A0F(r5)) {
            C15800rs r3 = this.A05;
            long A052 = r1.A05(r5);
            r3.A00.A0C();
            r3.A0D(r5, r5, A052);
            this.A07.A04();
            UserJid of = UserJid.of(r5);
            if (of != null) {
                AnonymousClass0y4 r12 = this.A04;
                C16010sH A0A2 = this.A03.A0A(of);
                for (C33351iR r0 : r12.A01()) {
                    r0.A00.A0Z.A09(A0A2);
                }
                if (of instanceof AnonymousClass1ZX) {
                    this.A0D.Acl(new RunnableRunnableShape5S0200000_I0_3(this, 6, of));
                }
            }
        }
    }

    public void A02(C15830rv r8, Collection collection, int i2) {
        this.A01.A01();
        C15830rv r3 = r8;
        this.A07.A06(r8);
        for (C40781ug A002 : this.A02.A01()) {
            A002.A00(r8);
        }
        this.A0D.Acl(new RunnableRunnableShape0S0301000_I0(this, r3, collection, i2, 3));
        if (collection != null && this.A0A.A00(r8)) {
            this.A0B.A09(collection);
        }
    }

    public void A03(C15830rv r5, boolean z2) {
        AnonymousClass11A r0;
        C15810rt r1 = this.A06;
        boolean A0F = r1.A0F(r5);
        C15800rs r3 = this.A05;
        if (A0F) {
            long A052 = r1.A05(r5);
            r3.A00.A0C();
            if (!r3.A0D(r5, r5, A052)) {
                r0 = this.A07;
                r0.A06(r5);
            }
            r0 = this.A07;
            r0.A04();
        } else {
            r3.A0B(r5);
            this.A01.A01();
            r0 = this.A07;
            r0.A04();
        }
        if (z2) {
            r0.A07(r5);
        }
    }
}
