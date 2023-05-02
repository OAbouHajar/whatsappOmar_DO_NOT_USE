package X;

import com.facebook.redex.IDxRCallbackShape6S0400000_1_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.39X  reason: invalid class name */
public final class AnonymousClass39X {
    public AnonymousClass4RA A00;
    public final C14550pN A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final C18260wP A04;
    public final C16000sG A05;
    public final C16080sP A06;
    public final AnonymousClass11A A07;
    public final C16070sO A08;
    public final C17240ul A09;
    public final C17780vd A0A;
    public final C16050sL A0B;

    public AnonymousClass39X(C14550pN r1, C14870pt r2, C16040sK r3, AnonymousClass4RA r4, C18260wP r5, C16000sG r6, C16080sP r7, AnonymousClass11A r8, C16070sO r9, C17240ul r10, C17780vd r11, C16050sL r12) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A09 = r10;
        this.A0A = r11;
        this.A07 = r8;
        this.A08 = r9;
        this.A04 = r5;
        this.A01 = r1;
        this.A0B = r12;
        this.A00 = r4;
    }

    public void A00(UserJid userJid, Integer num) {
        IDxRCallbackShape6S0400000_1_I1 iDxRCallbackShape6S0400000_1_I1;
        if (!A02()) {
            C16070sO r3 = this.A08;
            C16050sL r6 = this.A0B;
            int A022 = r3.A03.A02(r6);
            C14710pd r2 = r3.A0A;
            UserJid userJid2 = userJid;
            if ((A022 == 1 ? r2.A03(C16620tM.A02, 1655) : r2.A03(C16620tM.A02, 1304) - 1) > C16070sO.A00(r3, r6).A0C().size()) {
                this.A01.Afr(R.string.str0f20, R.string.str13db);
                C76493u0 r22 = new C76493u0(this.A07, this, this.A09, r6, userJid2, num, Collections.singletonList(userJid2));
                C17780vd r5 = this.A0A;
                C16050sL r62 = r22.A01;
                boolean A0m = ((C17240ul) r5.A04.get()).A0m(r62);
                List list = r22.A05;
                AnonymousClass00B.A06(list);
                if (r22.A00) {
                    StringBuilder A0r = AnonymousClass000.A0r("GroupIqResponseUtil/add-admin/timeout; groupId=");
                    A0r.append(r62);
                    Log.e(AnonymousClass000.A0e(list, "; participants=", A0r));
                    iDxRCallbackShape6S0400000_1_I1 = null;
                } else {
                    iDxRCallbackShape6S0400000_1_I1 = new IDxRCallbackShape6S0400000_1_I1(r22, r5, r22, r22, 1);
                }
                r5.A09(r62, iDxRCallbackShape6S0400000_1_I1, "promote", list, 91, A0m);
                return;
            }
            HashMap A0x = AnonymousClass000.A0x();
            C13680ns.A1X(userJid2, A0x, 419);
            int i2 = 3003;
            if (this.A09.A0m(r6)) {
                i2 = 3019;
            }
            C17240ul.A01(i2, A0x);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r2 != 2) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(com.whatsapp.jid.UserJid r15, java.lang.Integer r16) {
        /*
            r14 = this;
            r6 = r14
            X.0sO r0 = r14.A08
            X.0sL r8 = r14.A0B
            X.1cE r0 = X.C16070sO.A00(r0, r8)
            r9 = r15
            X.1ck r0 = r0.A05(r15)
            if (r0 == 0) goto L_0x0016
            int r2 = r0.A01
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r4 = 0
            if (r0 == 0) goto L_0x0064
            X.0sK r0 = r14.A03
            boolean r0 = r0.A0I(r15)
            if (r0 == 0) goto L_0x0049
            X.0ul r0 = r14.A09
            boolean r0 = r0.A0m(r8)
            if (r0 == 0) goto L_0x0049
            X.0pN r2 = r14.A01
            r1 = 2131887809(0x7f1206c1, float:1.9410236E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r2.Afj(r0, r4, r1)
            X.4RA r0 = r14.A00
            if (r0 == 0) goto L_0x0048
            X.4Rt r1 = r0.A02
            X.0sK r0 = r1.A02
            boolean r0 = r0.A0I(r15)
            if (r0 == 0) goto L_0x0048
            X.4Vh r1 = r1.A04
            r0 = 1
            r1.A02(r0)
        L_0x0048:
            return
        L_0x0049:
            X.0pN r5 = r14.A01
            r3 = 2131888221(0x7f12085d, float:1.9411071E38)
            java.lang.Object[] r2 = X.C13680ns.A1b()
            X.0sP r1 = r14.A06
            X.0sG r0 = r14.A05
            X.0sH r0 = r0.A0A(r15)
            java.lang.String r0 = r1.A08(r0)
            r2[r4] = r0
            r5.Afj(r2, r4, r3)
            return
        L_0x0064:
            X.0wP r0 = r14.A04
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0080
            X.0pt r2 = r14.A02
            X.0pN r0 = r14.A01
            boolean r1 = X.C18260wP.A02(r0)
            r0 = 2131889602(0x7f120dc2, float:1.9413872E38)
            if (r1 == 0) goto L_0x007c
            r0 = 2131889603(0x7f120dc3, float:1.9413874E38)
        L_0x007c:
            r2.A09(r0, r4)
            return
        L_0x0080:
            X.0pN r2 = r14.A01
            r1 = 2131889954(0x7f120f22, float:1.9414586E38)
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r2.Afr(r1, r0)
            X.0ul r7 = r14.A09
            X.11A r5 = r14.A07
            java.util.List r11 = java.util.Collections.singletonList(r15)
            r12 = 92
            X.3u1 r4 = new X.3u1
            r10 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.0vd r7 = r14.A0A
            X.01D r1 = r7.A04
            java.lang.Object r0 = r1.get()
            X.0ul r0 = (X.C17240ul) r0
            X.0sL r8 = r4.A01
            boolean r13 = r0.A0m(r8)
            java.util.List r11 = r4.A05
            X.AnonymousClass00B.A06(r11)
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = "GroupIqResponseUtil/remove-admin/timeout; groupId="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r8)
            java.lang.String r0 = "; participants="
            java.lang.String r0 = X.AnonymousClass000.A0e(r11, r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r9 = 0
        L_0x00c8:
            java.lang.String r10 = "demote"
            r7.A09(r8, r9, r10, r11, r12, r13)
            return
        L_0x00ce:
            java.lang.Object r0 = r1.get()
            X.0ul r0 = (X.C17240ul) r0
            boolean r5 = r0.A0m(r8)
            X.3GW r9 = new X.3GW
            r3 = r4
            r0 = r9
            r1 = r4
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39X.A01(com.whatsapp.jid.UserJid, java.lang.Integer):void");
    }

    public boolean A02() {
        if (this.A04.A0A()) {
            return false;
        }
        C14870pt r2 = this.A02;
        boolean A022 = C18260wP.A02(this.A01.getApplicationContext());
        int i2 = R.string.str0dc2;
        if (A022) {
            i2 = R.string.str0dc3;
        }
        r2.A09(i2, 0);
        return true;
    }
}
