package X;

import android.content.Context;
import com.facebook.redex.IDxCListenerShape227S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0;
import com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.obwhatsapp.group.IDxCObserverShape80S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2VT  reason: invalid class name */
public class AnonymousClass2VT extends C003401n {
    public C16010sH A00;
    public C15830rv A01;
    public final AnonymousClass027 A02 = new AnonymousClass027();
    public final AnonymousClass01Y A03;
    public final C40781ug A04;
    public final AnonymousClass127 A05;
    public final C17230uk A06;
    public final C16000sG A07;
    public final C33481ie A08;
    public final C17140ub A09;
    public final AnonymousClass2a9 A0A;
    public final C41681wN A0B;
    public final CountryGatingViewModel A0C;
    public final C15810rt A0D;
    public final C216114t A0E;
    public final AnonymousClass18U A0F;
    public final C16070sO A0G;
    public final C14710pd A0H;
    public final C20260zl A0I;
    public final C17240ul A0J;
    public final C53272fR A0K;
    public final AnonymousClass18N A0L;
    public final AnonymousClass28S A0M;
    public final AnonymousClass18O A0N;
    public final AnonymousClass1VD A0O;
    public final AnonymousClass18R A0P;
    public final C217915l A0Q;
    public final ToSGatingViewModel A0R;
    public final AnonymousClass1WA A0S;
    public final C30801cy A0T = new C30801cy();
    public final C30801cy A0U = new C30801cy();
    public final C30801cy A0V = new C30801cy();

    public AnonymousClass2VT(AnonymousClass01Y r14, AnonymousClass127 r15, C17230uk r16, C16000sG r17, C17140ub r18, AnonymousClass2a9 r19, C41681wN r20, CountryGatingViewModel countryGatingViewModel, C15810rt r22, C216114t r23, AnonymousClass18U r24, C16070sO r25, C16010sH r26, C14710pd r27, C20260zl r28, C17240ul r29, AnonymousClass18N r30, AnonymousClass18O r31, AnonymousClass18R r32, C217915l r33, C15830rv r34, ToSGatingViewModel toSGatingViewModel, C16320sq r36) {
        IDxCObserverShape66S0100000_1_I0 iDxCObserverShape66S0100000_1_I0 = new IDxCObserverShape66S0100000_1_I0(this, 4);
        this.A08 = iDxCObserverShape66S0100000_1_I0;
        IDxSObserverShape63S0100000_2_I0 iDxSObserverShape63S0100000_2_I0 = new IDxSObserverShape63S0100000_2_I0(this, 13);
        this.A04 = iDxSObserverShape63S0100000_2_I0;
        IDxPObserverShape81S0100000_2_I0 iDxPObserverShape81S0100000_2_I0 = new IDxPObserverShape81S0100000_2_I0(this, 15);
        this.A0O = iDxPObserverShape81S0100000_2_I0;
        IDxCListenerShape227S0100000_2_I0 iDxCListenerShape227S0100000_2_I0 = new IDxCListenerShape227S0100000_2_I0(this, 4);
        this.A0M = iDxCListenerShape227S0100000_2_I0;
        IDxCObserverShape80S0100000_2_I0 iDxCObserverShape80S0100000_2_I0 = new IDxCObserverShape80S0100000_2_I0(this, 0);
        this.A0K = iDxCObserverShape80S0100000_2_I0;
        this.A0H = r27;
        this.A0D = r22;
        this.A0I = r28;
        this.A07 = r17;
        this.A03 = r14;
        C17140ub r10 = r18;
        this.A09 = r10;
        this.A0Q = r33;
        this.A05 = r15;
        AnonymousClass18N r9 = r30;
        this.A0L = r9;
        this.A06 = r16;
        this.A0A = r19;
        this.A0F = r24;
        AnonymousClass18R r11 = r32;
        this.A0P = r11;
        AnonymousClass18O r8 = r31;
        this.A0N = r8;
        this.A01 = r34;
        this.A0B = r20;
        this.A0C = countryGatingViewModel;
        this.A0R = toSGatingViewModel;
        this.A0E = r23;
        this.A0G = r25;
        this.A0J = r29;
        C16010sH r12 = r26;
        this.A00 = r12;
        this.A0S = new AnonymousClass1WA(r36, false);
        r10.A02(iDxCObserverShape66S0100000_1_I0);
        r15.A02(iDxSObserverShape63S0100000_2_I0);
        r11.A02(iDxPObserverShape81S0100000_2_I0);
        if (r12.A0J()) {
            r8.A00.add(iDxCListenerShape227S0100000_2_I0);
            r9.A02(iDxCObserverShape80S0100000_2_I0);
        }
    }

    public void A04() {
        this.A09.A03(this.A08);
        this.A05.A03(this.A04);
        this.A0P.A03(this.A0O);
        if (this.A00.A0J()) {
            AnonymousClass18O r0 = this.A0N;
            r0.A00.remove(this.A0M);
            this.A0L.A03(this.A0K);
        }
    }

    public String A05(Context context, boolean z2, boolean z3) {
        C20260zl r0 = this.A0I;
        C15830rv r2 = this.A01;
        if (C40561uK.A01(r0, r2)) {
            return (!(r2 instanceof UserJid) || !this.A03.A0V(UserJid.of(r2))) ? C34811ku.A05(context, R.string.str1b2f) : C34811ku.A05(context, R.string.str1b2d);
        }
        if (C40571uL.A00(this.A0H, r2)) {
            return context.getString(R.string.str1717, new Object[]{"OBWhatsApp Surveys"});
        } else if (z3) {
            return context.getString(R.string.str064c);
        } else {
            int i2 = R.string.str0a34;
            if (z2) {
                i2 = R.string.str0b15;
            }
            return AnonymousClass1ZW.A00(context, new Object[]{AnonymousClass1ZW.A06(context, R.color.normal)}, i2).toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0083, code lost:
        if (r2.A00.A0k == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r10 == 1) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0042, code lost:
        if (r6.A09((com.whatsapp.jid.GroupJid) r0) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r33 = this;
            r2 = r33
            X.0sH r1 = r2.A00
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r1.A08(r0)
            X.0rv r4 = (X.C15830rv) r4
            X.14t r0 = r2.A0E
            X.0sH r0 = r0.A01(r4)
            r2.A00 = r0
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x0021
            X.0sH r1 = r2.A00
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            r1.A08(r0)
        L_0x0021:
            X.0sL r3 = X.C16050sL.A03(r4)
            X.0sH r0 = r2.A00
            boolean r0 = r0.A0J()
            r1 = 1
            if (r0 == 0) goto L_0x0044
            X.0sO r6 = r2.A0G
            X.0sH r5 = r2.A00
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r0 = r5.A08(r0)
            X.AnonymousClass00B.A06(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r6.A09(r0)
            r12 = 1
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r12 = 0
        L_0x0045:
            X.0ul r5 = r2.A0J
            X.0sH r0 = r2.A00
            boolean r18 = r5.A0e(r0)
            X.0sH r0 = r2.A00
            int r10 = r5.A03(r0)
            X.0sH r0 = r2.A00
            boolean r19 = r5.A0f(r0)
            X.15l r5 = r2.A0Q
            X.0sH r0 = r2.A00
            boolean r20 = r5.A00(r0)
            X.0rt r0 = r2.A0D
            int r9 = r0.A02(r3)
            X.0pd r6 = r2.A0H
            r5 = 2449(0x991, float:3.432E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r6.A0E(r0, r5)
            if (r0 == 0) goto L_0x0085
            if (r3 == 0) goto L_0x0085
            X.0sO r0 = r2.A0G
            boolean r0 = r0.A0A(r3)
            if (r0 == 0) goto L_0x0085
            X.0sH r0 = r2.A00
            boolean r0 = r0.A0k
            r27 = 1
            if (r0 != 0) goto L_0x0087
        L_0x0085:
            r27 = 0
        L_0x0087:
            X.0uk r0 = r2.A06
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x009b
            if (r3 == 0) goto L_0x009b
            r0 = 3
            if (r9 != r0) goto L_0x009b
            if (r18 != 0) goto L_0x009b
            if (r20 != 0) goto L_0x009b
            r11 = 1
            if (r10 != r1) goto L_0x00ce
        L_0x009b:
            r11 = 0
            if (r27 != 0) goto L_0x00ce
            boolean r0 = X.C16030sJ.A0M(r4)
            if (r0 != 0) goto L_0x00ce
            X.027 r0 = r2.A02
            X.0sH r5 = r2.A00
            r6 = 0
            boolean r13 = r5.A0a
            com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel r4 = r2.A0C
            X.0rv r1 = r2.A01
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.of(r1)
            boolean r14 = r4.A05(r3)
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r1 = r2.A0R
            boolean r15 = r1.A05(r3)
            boolean r17 = r2.A07()
            r8 = r6
            r16 = 0
            X.2Qb r4 = new X.2Qb
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.A09(r4)
            return
        L_0x00ce:
            X.1WA r1 = r2.A0S
            X.56Y r0 = new X.56Y
            r21 = r0
            r22 = r2
            r23 = r4
            r24 = r3
            r25 = r9
            r26 = r10
            r28 = r12
            r29 = r11
            r30 = r18
            r31 = r19
            r32 = r20
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r1.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2VT.A06():void");
    }

    public boolean A07() {
        C20260zl r0 = this.A0I;
        C15830rv r1 = this.A01;
        if (C40561uK.A01(r0, r1) || C40571uL.A00(this.A0H, r1)) {
            return true;
        }
        CountryGatingViewModel countryGatingViewModel = this.A0C;
        UserJid of = UserJid.of(r1);
        if (countryGatingViewModel.A05(of) || this.A0R.A05(of)) {
            return true;
        }
        if (!this.A00.A0J()) {
            return false;
        }
        Jid A082 = this.A00.A08(C16050sL.class);
        AnonymousClass00B.A06(A082);
        GroupJid groupJid = (GroupJid) A082;
        return !this.A0G.A09(groupJid) || this.A0J.A0g(this.A00, groupJid);
    }
}
