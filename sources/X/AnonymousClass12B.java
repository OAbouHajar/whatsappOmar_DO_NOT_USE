package X;

import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape0S0402000_I0;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.12B  reason: invalid class name */
public class AnonymousClass12B {
    public long A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C17130ua A03;
    public final C19000xb A04;
    public final C16600tK A05;
    public final AnonymousClass12A A06;
    public final C16440t3 A07;
    public final C16980tz A08;
    public final C14710pd A09;
    public final C20260zl A0A;
    public final C219215y A0B;
    public final C17190ug A0C;
    public final C219115x A0D;
    public final C17670vS A0E;
    public final C17770vc A0F;
    public final C17660vR A0G;
    public final C16320sq A0H;

    public AnonymousClass12B(C14870pt r2, C16040sK r3, C17130ua r4, C19000xb r5, C16600tK r6, AnonymousClass12A r7, C16440t3 r8, C16980tz r9, C14710pd r10, C20260zl r11, C219215y r12, C17190ug r13, C219115x r14, C17670vS r15, C17770vc r16, C17660vR r17, C16320sq r18) {
        this.A08 = r9;
        this.A07 = r8;
        this.A09 = r10;
        this.A01 = r2;
        this.A02 = r3;
        this.A0G = r17;
        this.A0H = r18;
        this.A03 = r4;
        this.A0A = r11;
        this.A0C = r13;
        this.A0F = r16;
        this.A05 = r6;
        this.A0E = r15;
        this.A04 = r5;
        this.A06 = r7;
        this.A0D = r14;
        this.A0B = r12;
    }

    public void A00(C15830rv r5, int i2) {
        if (i2 == 500 || i2 == 501 || i2 == 503) {
            this.A00 = this.A07.A00() + 3600000;
        } else if (i2 == 401 && r5 != null && !C16030sJ.A0L(r5)) {
            this.A06.A03(r5);
        }
    }

    public void A01(C15830rv r7, int i2, int i3) {
        A02(r7, (AnonymousClass273) null, (AnonymousClass279) null, i2, i3);
    }

    public void A02(C15830rv r13, AnonymousClass273 r14, AnonymousClass279 r15, int i2, int i3) {
        C15830rv r6 = r13;
        if (r13 != null && r13.isProtocolCompliant() && !C16030sJ.A0G(r13)) {
            if (!C40561uK.A01(this.A0A, r13)) {
                AnonymousClass273 r7 = r14;
                int i4 = i3;
                if ((r13 instanceof UserJid) && this.A09.A03(C16620tM.A02, 609) >= 1) {
                    A04(r14, Collections.singleton(r13), i4);
                } else if (this.A00 < this.A07.A00()) {
                    C17770vc r1 = this.A0F;
                    if (((i3 & 1) != 0 && r1.A01.A02(r13)) || ((i3 & 2) != 0 && r1.A02.A02(r13))) {
                        this.A01.A0K(new RunnableRunnableShape0S0402000_I0(this, r6, r7, r15, i2, i4, 0));
                    }
                }
            }
        }
    }

    public void A03(AnonymousClass27A r15) {
        C15830rv r6 = r15.A0I;
        if (r6 != null && r6.isProtocolCompliant() && this.A05.A05 && this.A00 < this.A07.A00()) {
            Log.w("app/sendSetProfilePhoto");
            AnonymousClass27B r8 = new AnonymousClass27B(r6, this.A0C, r15);
            byte[] bArr = r15.A05;
            boolean A0I = this.A02.A0I(r6);
            boolean z2 = false;
            if (bArr == null) {
                z2 = true;
            }
            r8.A00 = z2;
            C17190ug r7 = r8.A02;
            String A022 = r7.A02();
            C32461gQ r3 = new C32461gQ("iq");
            r3.A02(new C35081lL("id", A022));
            r3.A02(new C35081lL("xmlns", "w:profile:picture"));
            r3.A02(new C35081lL((Jid) C34791ks.A00, "to"));
            r3.A02(new C35081lL("type", "set"));
            if (!A0I) {
                r3.A02(new C35081lL((Jid) r8.A01, "target"));
            }
            C32461gQ r2 = new C32461gQ(FacebookFacade.RequestParameter.PICTURE);
            r2.A02(new C35081lL("type", "image"));
            r2.A01 = bArr;
            r3.A03(r2.A01());
            r7.A0G(r8, r3.A01(), A022, 25, 0);
        }
    }

    public final void A04(AnonymousClass273 r6, Set set, int i2) {
        HashSet hashSet = new HashSet();
        for (Object next : set) {
            C17770vc r1 = this.A0F;
            if (((i2 & 1) != 0 && r1.A01.A02(next)) || ((i2 & 2) != 0 && r1.A02.A02(next))) {
                hashSet.add(next);
            }
        }
        if (!hashSet.isEmpty()) {
            new RunnableRunnableShape0S0201000_I0((Object) this, i2, (Object) hashSet, 30).run();
        }
        if (r6 != null) {
            r6.A00(2);
        }
    }

    public boolean A05() {
        return this.A09.A03(C16620tM.A02, 609) >= 2;
    }
}
