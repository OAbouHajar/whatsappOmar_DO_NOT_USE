package X;

import com.facebook.redex.IDxRListenerShape419S0100000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1KA  reason: invalid class name */
public class AnonymousClass1KA {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass027 A02 = new AnonymousClass027();
    public final AnonymousClass027 A03 = new AnonymousClass027();
    public final AnonymousClass027 A04 = new AnonymousClass027(Boolean.FALSE);
    public final C25281Je A05;
    public final C14870pt A06;
    public final C16040sK A07;
    public final C17740vZ A08;
    public final C17150uc A09;
    public final AnonymousClass1KY A0A;
    public final C18640x1 A0B;
    public final C17170ue A0C;
    public final AnonymousClass4Q4 A0D = new AnonymousClass4Q4(this);
    public final AnonymousClass4Q5 A0E = new AnonymousClass4Q5(this);
    public final C18770xE A0F;
    public final C18260wP A0G;
    public final C14710pd A0H;
    public final C18720x9 A0I;
    public final C17190ug A0J;
    public final C18630x0 A0K;
    public final C18750xC A0L;
    public final List A0M = new ArrayList();
    public final List A0N = new ArrayList();
    public final Map A0O = new HashMap();

    public AnonymousClass1KA(C25281Je r3, C14870pt r4, C16040sK r5, C17740vZ r6, C17150uc r7, AnonymousClass1KY r8, C18640x1 r9, C17170ue r10, C18770xE r11, C18260wP r12, C14710pd r13, C18720x9 r14, C17190ug r15, C18630x0 r16, C18750xC r17) {
        this.A0H = r13;
        this.A06 = r4;
        this.A07 = r5;
        this.A0K = r16;
        this.A0J = r15;
        this.A0A = r8;
        this.A0B = r9;
        this.A0C = r10;
        this.A09 = r7;
        this.A0I = r14;
        this.A0G = r12;
        this.A0F = r11;
        this.A05 = r3;
        this.A08 = r6;
        this.A0L = r17;
    }

    public void A00(int i2, UserJid userJid, String str, boolean z2) {
        AnonymousClass2GF r2;
        String str2 = str;
        boolean equals = str.equals("catalog_products_all_items_collection_id");
        UserJid userJid2 = userJid;
        int i3 = 1;
        if (this.A07.A0I(userJid)) {
            i3 = 2;
        }
        int i4 = i3 * 9;
        int i5 = i2;
        if (equals) {
            C18640x1 r0 = this.A0B;
            r0.A0E(userJid, i4);
            if (r0.A0J(userJid)) {
                this.A02.A0B(new C71443kO(userJid, str, true, true));
                i4 <<= 1;
            }
            A06(userJid, i2, i4, true);
            return;
        }
        C18640x1 r4 = this.A0B;
        synchronized (r4) {
            AnonymousClass2GD r02 = (AnonymousClass2GD) r4.A01.get(userJid);
            if (!(r02 == null || (r2 = (AnonymousClass2GF) r02.A04.get(str)) == null)) {
                r2.A00 = new AnonymousClass2GH((String) null, true);
                List list = r2.A01.A04;
                int size = list.size();
                if (size > i4) {
                    for (int i6 = i4; i6 < size; i6++) {
                        list.remove(list.size() - 1);
                    }
                }
            }
        }
        AnonymousClass2GE A042 = r4.A04(userJid, str);
        if (A042 != null && !A042.A04.isEmpty()) {
            this.A02.A0B(new C71443kO(userJid, A042.A03, true, true));
            i4 <<= 1;
        }
        A07(userJid2, str2, i5, i4, z2);
    }

    public void A01(int i2, UserJid userJid, String str, boolean z2) {
        UserJid userJid2 = userJid;
        int i3 = 1;
        if (this.A07.A0I(userJid)) {
            i3 = 2;
        }
        int i4 = i3 * 9;
        String str2 = str;
        int i5 = i2;
        if (str.equals("catalog_products_all_items_collection_id")) {
            A06(userJid, i2, i4, true);
        } else {
            A07(userJid2, str2, i5, i4, z2);
        }
    }

    public void A02(AnonymousClass5RT r15, C86124Rh r16) {
        AnonymousClass4H1 r4 = new AnonymousClass4H1(r15, this);
        C18770xE r2 = this.A0F;
        C18760xD r1 = r2.A01;
        C18650x2 r7 = r1.A04;
        C16320sq r13 = r1.A0G;
        C18660x3 r0 = r1.A05;
        C18710x8 r6 = r1.A03;
        r2.A00(new C59632yc(r4, r16, r6, r7, new C84734Lr(r6, r0), r1.A06, r1.A07, r1.A08, r1.A00(), r13));
    }

    public void A03(AnonymousClass5RU r13, AnonymousClass26O r14) {
        boolean A072;
        C18770xE r4 = this.A0F;
        AnonymousClass26O r8 = r14;
        if (r4.A00.A0I(r14.A05) || !this.A0H.A0E(C16620tM.A02, 1096)) {
            C17740vZ r2 = this.A08;
            IDxRListenerShape419S0100000_2_I0 iDxRListenerShape419S0100000_2_I0 = new IDxRListenerShape419S0100000_2_I0(this, 1);
            C16150sX r22 = r2.A02.A00.A01;
            C17190ug r10 = (C17190ug) r22.AEu.get();
            C61713Aa r6 = new C61713Aa(0);
            C18260wP r7 = (C18260wP) r22.A4p.get();
            A072 = new C59542yS((C16300so) r22.A5p.get(), (C17150uc) r22.A34.get(), iDxRListenerShape419S0100000_2_I0, r6, r7, r8, (C18720x9) r22.AB0.get(), r10, (C18630x0) r22.A1m.get()).A07();
        } else {
            A072 = r4.A01(new IDxRListenerShape419S0100000_2_I0(this, 0), r14);
        }
        if (A072) {
            this.A0O.put(r14, r13);
        } else {
            r13.AR8(r14, -1);
        }
    }

    public void A04(UserJid userJid, int i2) {
        int i3 = 1;
        if (this.A07.A0I(userJid)) {
            i3 = 4;
        }
        int i4 = i3 * 6;
        C18640x1 r0 = this.A0B;
        r0.A0E(userJid, i4);
        if (r0.A0J(userJid)) {
            for (AnonymousClass1yY AR3 : this.A0A.A01()) {
                AR3.AR3(userJid, true, true);
            }
            i4 <<= 1;
        }
        A06(userJid, i2, i4, false);
    }

    public final void A05(UserJid userJid, int i2, int i3, boolean z2) {
        C18640x1 r2 = this.A0B;
        UserJid userJid2 = userJid;
        AnonymousClass2GH A022 = r2.A02(userJid2);
        String str = A022 == null ? null : A022.A00;
        AnonymousClass2GH A023 = r2.A02(userJid2);
        if ((A023 == null || A023.A01) && !this.A00) {
            this.A00 = true;
            int i4 = i2;
            UserJid userJid3 = userJid2;
            AnonymousClass4O7 r15 = new AnonymousClass4O7(C34791ks.A00, userJid3, this.A0C.A00, str, i4, i4, i3);
            AnonymousClass395 r9 = new AnonymousClass395(new C84714Lp(this, userJid2, str, z2), this);
            C18770xE r4 = this.A0F;
            if (r4.A00.A0I(r15.A04) || !this.A0H.A0E(C16620tM.A02, 1327)) {
                C18630x0 r5 = this.A0K;
                C17190ug r42 = this.A0J;
                new C59552yT(this.A09, r9, r15, new C53812gL(new C61713Aa(0)), this.A0G, this.A0I, r42, r5, this.A0L).A06();
                return;
            }
            C18760xD r6 = r4.A01;
            C18630x0 r3 = r6.A0B;
            C17190ug r8 = r6.A0A;
            C53812gL r7 = new C53812gL(new C61713Aa(0));
            C18260wP r22 = r6.A08;
            C59552yT r16 = new C59552yT(r6.A01, r9, r15, r7, r22, r6.A09, r8, r3, r6.A0F);
            C18650x2 r11 = r6.A04;
            C16320sq r0 = r6.A0G;
            C18710x8 r10 = r6.A03;
            r4.A00(new C59642yd(r9, r10, r11, new C84734Lr(r10, r11), r6.A06, r6.A07, r15, r16, r22, r3, r6.A00(), r0));
        }
    }

    public final void A06(UserJid userJid, int i2, int i3, boolean z2) {
        UserJid userJid2;
        String str;
        C18640x1 r1 = this.A0B;
        synchronized (r1) {
            userJid2 = userJid;
            AnonymousClass2GD r0 = (AnonymousClass2GD) r1.A01.get(userJid);
            if (r0 != null) {
                AnonymousClass2GH r02 = r0.A01;
                if (r02 != null) {
                    str = r02.A00;
                }
            }
            str = null;
        }
        if (A09(userJid)) {
            this.A01 = true;
            if (z2) {
                this.A04.A0B(Boolean.TRUE);
            }
            A03(new C62793Ey(this, userJid, str, z2), new AnonymousClass26O(userJid2, str, this.A0C.A00, i3, i2, i2));
        }
    }

    public final void A07(UserJid userJid, String str, int i2, int i3, boolean z2) {
        C18640x1 r1 = this.A0B;
        UserJid userJid2 = userJid;
        String str2 = str;
        AnonymousClass2GH A032 = r1.A03(userJid2, str2);
        String str3 = A032 == null ? null : A032.A00;
        AnonymousClass2GH A033 = r1.A03(userJid2, str2);
        if (A033 == null || A033.A01) {
            AnonymousClass027 r12 = this.A04;
            if (r12.A01() == null || !((Boolean) r12.A01()).booleanValue()) {
                r12.A0B(Boolean.TRUE);
                int i4 = i2;
                String str4 = str2;
                UserJid userJid3 = userJid2;
                C55252j9 r15 = new C55252j9(userJid3, str4, this.A0C.A00, str3, i3, i4, i4, z2);
                AnonymousClass394 r9 = new AnonymousClass394(new C84724Lq(this, userJid2, str3, str2), this);
                C18770xE r4 = this.A0F;
                if (r4.A00.A0I(r15.A03) || !this.A0H.A0E(C16620tM.A02, 1327)) {
                    C18630x0 r5 = this.A0K;
                    C17190ug r42 = this.A0J;
                    C18260wP r3 = this.A0G;
                    new C59502yO(this.A09, r9, r15, new C53812gL(new C61713Aa(0)), r3, this.A0I, r42, r5, this.A0L).A02();
                    return;
                }
                C18760xD r6 = r4.A01;
                C18630x0 r32 = r6.A0B;
                C17190ug r8 = r6.A0A;
                C18260wP r2 = r6.A08;
                C59502yO r16 = new C59502yO(r6.A01, r9, r15, new C53812gL(new C61713Aa(0)), r2, r6.A09, r8, r32, r6.A0F);
                C18650x2 r11 = r6.A04;
                C16320sq r0 = r6.A0G;
                C18710x8 r10 = r6.A03;
                r4.A00(new C55242j8(r9, r10, r11, new C84734Lr(r10, r11), r6.A06, r6.A07, r15, r16, r2, r32, r6.A00(), r0));
            }
        }
    }

    public boolean A08(AnonymousClass26S r33) {
        C18770xE r14 = this.A0F;
        AnonymousClass26S r16 = r33;
        if (r14.A00.A0I(r16.A00) || !this.A0H.A0E(C16620tM.A02, 1096)) {
            C17740vZ r0 = this.A08;
            AnonymousClass4Q4 r6 = this.A0D;
            C16150sX r3 = r0.A00.A00.A01;
            AnonymousClass26S r9 = r16;
            C59522yQ r32 = new C59522yQ((C17150uc) r3.A34.get(), (C18640x1) r3.A3X.get(), r6, new C61713Aa(0), (C18260wP) r3.A4p.get(), r9, (C18720x9) r3.AB0.get(), (C17190ug) r3.AEu.get(), (C18630x0) r3.A1m.get());
            if (!r32.A03.A0A()) {
                r32.A01.A00(r32.A04, -1);
                return false;
            } else if (r32.A01.A09()) {
                r32.A02();
                return true;
            } else {
                r32.A03();
                return true;
            }
        } else {
            AnonymousClass4Q4 r15 = this.A0D;
            C18760xD r02 = r14.A01;
            C18630x0 r13 = r02.A0B;
            C17150uc r12 = r02.A01;
            C18640x1 r10 = r02.A02;
            C18650x2 r92 = r02.A04;
            C18620wz r8 = r02.A07;
            C16320sq r7 = r02.A0G;
            C17190ug r62 = r02.A0A;
            C18260wP r5 = r02.A08;
            C18710x8 r4 = r02.A03;
            C84734Lr r34 = new C84734Lr(r4, r92);
            C18690x6 r2 = r02.A06;
            C18630x0 r29 = r13;
            C18720x9 r27 = r02.A09;
            C17190ug r28 = r62;
            C18260wP r25 = r5;
            AnonymousClass26S r26 = r16;
            C18690x6 r23 = r2;
            C18620wz r24 = r8;
            C18650x2 r21 = r92;
            C84734Lr r22 = r34;
            return r14.A00(new AnonymousClass26R(r12, r10, r15, (AnonymousClass1KA) r02.A0H.get(), r4, r21, r22, r23, r24, r25, r26, r27, r28, r29, r02.A00(), r7));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r0.A01 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(com.whatsapp.jid.UserJid r3) {
        /*
            r2 = this;
            X.0x1 r1 = r2.A0B
            monitor-enter(r1)
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0020 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0020 }
            X.2GD r0 = (X.AnonymousClass2GD) r0     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0011
            X.2GH r0 = r0.A01     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x0013
        L_0x0011:
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x0019
        L_0x0013:
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x001e
        L_0x0019:
            boolean r1 = r2.A01
            r0 = 1
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KA.A09(com.whatsapp.jid.UserJid):boolean");
    }
}
