package X;

import com.obwhatsapp.contact.picker.ContactPickerFragment;
import java.util.HashSet;

/* renamed from: X.2zs  reason: invalid class name and case insensitive filesystem */
public class C60052zs extends AnonymousClass35s {
    public final C19740yv A00;
    public final AnonymousClass01Y A01;
    public final C16000sG A02;
    public final AnonymousClass151 A03;
    public final C16070sO A04;
    public final C14710pd A05;
    public final C15830rv A06;
    public final C18290wS A07;
    public final HashSet A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public C60052zs(C19740yv r2, AnonymousClass01Y r3, C16000sG r4, ContactPickerFragment contactPickerFragment, AnonymousClass151 r6, C16070sO r7, C14710pd r8, C15830rv r9, C18290wS r10, HashSet hashSet, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(contactPickerFragment);
        this.A08 = hashSet;
        this.A06 = r9;
        this.A0D = z2;
        this.A0A = z3;
        this.A0K = z4;
        this.A0C = z5;
        this.A0F = z6;
        this.A0J = z7;
        this.A0B = z8;
        this.A0E = z9;
        this.A0G = z10;
        this.A0I = z11;
        this.A0H = z12;
        this.A09 = z13;
        this.A05 = r8;
        this.A02 = r4;
        this.A07 = r10;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r6;
        this.A04 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (X.C13700nu.A0h(r10, 43) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (X.C13700nu.A0h(r10, 42) != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a4, code lost:
        if (r1.A09((com.whatsapp.jid.GroupJid) r0) != false) goto L_0x01a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r18) {
        /*
            r17 = this;
            java.util.ArrayList r12 = X.AnonymousClass000.A0u()
            r3 = r17
            X.0tU r4 = r3.A02
            boolean r0 = r4.isCancelled()
            r2 = 1
            if (r0 != 0) goto L_0x00da
            boolean r5 = r3.A0F
            if (r5 != 0) goto L_0x0033
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.A0I
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.A0C
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.A0D
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x00da
            X.0pd r6 = r3.A05
            r1 = 691(0x2b3, float:9.68E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r6.A0E(r0, r1)
            if (r0 == 0) goto L_0x00da
        L_0x0033:
            X.151 r7 = r3.A03
            X.11I r8 = r7.A06
            java.lang.String r6 = "frequents"
            r0 = 0
            long r10 = r8.A01(r6, r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r10 = r10 + r0
            X.0t3 r0 = r7.A01
            long r8 = r0.A00()
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            r7.A03()
            X.0yv r0 = r3.A00
            r0.A02()
        L_0x0055:
            java.util.HashSet r10 = r3.A08
            r6 = 3
            boolean r0 = X.C13700nu.A0h(r10, r6)
            r9 = 100
            if (r0 != 0) goto L_0x0069
            r0 = 43
            boolean r0 = X.C13700nu.A0h(r10, r0)
            r8 = 1
            if (r0 == 0) goto L_0x006b
        L_0x0069:
            r8 = 100
        L_0x006b:
            boolean r0 = X.C13700nu.A0h(r10, r2)
            if (r0 != 0) goto L_0x007a
            r0 = 42
            boolean r0 = X.C13700nu.A0h(r10, r0)
            r1 = 1
            if (r0 == 0) goto L_0x007c
        L_0x007a:
            r1 = 100
        L_0x007c:
            r0 = 13
            boolean r0 = X.C13700nu.A0h(r10, r0)
            if (r0 != 0) goto L_0x0085
            r9 = 1
        L_0x0085:
            X.1y9 r0 = new X.1y9
            r0.<init>(r1, r9, r8)
            java.util.List r0 = r7.A01(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0092:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00da
            X.0rv r8 = X.C13700nu.A0B(r9)
            boolean r0 = X.C16030sJ.A0Q(r8)
            if (r0 != 0) goto L_0x0092
            X.0sG r0 = r3.A02
            X.0sH r7 = r0.A08(r8)
            if (r7 == 0) goto L_0x00d4
            X.01Y r1 = r3.A01
            com.whatsapp.jid.Jid r0 = X.C16010sH.A03(r7)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A0V(r0)
            if (r0 != 0) goto L_0x00d4
            boolean r0 = X.C16030sJ.A0P(r8)
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x00c8
            boolean r0 = X.C16030sJ.A0H(r8)
            if (r0 != 0) goto L_0x00d4
        L_0x00c8:
            boolean r0 = r3.A0K
            if (r5 != 0) goto L_0x00ce
            if (r0 == 0) goto L_0x018d
        L_0x00ce:
            boolean r0 = X.C16030sJ.A0H(r8)
            if (r0 == 0) goto L_0x018d
        L_0x00d4:
            int r0 = r12.size()
            if (r0 < r6) goto L_0x0092
        L_0x00da:
            java.util.ArrayList r13 = X.AnonymousClass000.A0u()
            boolean r0 = r4.isCancelled()
            if (r0 != 0) goto L_0x00f1
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x0151
            X.0sG r0 = r3.A02
            java.util.ArrayList r0 = r0.A0E()
            r13.addAll(r0)
        L_0x00f1:
            java.util.ArrayList r14 = X.AnonymousClass000.A0u()
            boolean r0 = r4.isCancelled()
            if (r0 != 0) goto L_0x010c
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x010c
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x010c
            X.0sG r0 = r3.A02
            java.util.ArrayList r0 = r0.A0E()
            r14.addAll(r0)
        L_0x010c:
            X.4NB[] r0 = new X.AnonymousClass4NB[r2]
            r4 = 0
            java.util.ArrayList r15 = X.AnonymousClass000.A0u()
            r16 = 0
            X.4NB r11 = new X.4NB
            r11.<init>(r12, r13, r14, r15, r16)
            r0[r4] = r11
            r3.A07(r0)
            java.util.ArrayList r15 = X.AnonymousClass000.A0u()
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0145
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0139
            X.0sG r0 = r3.A02
            X.18c r1 = r0.A06
            r0 = 2
            r1.A0R(r15, r0, r2, r4)
        L_0x0133:
            X.4NB r11 = new X.4NB
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L_0x0139:
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x0133
            X.0sG r0 = r3.A02
            X.18c r0 = r0.A06
            r0.A0R(r15, r2, r2, r4)
            goto L_0x0133
        L_0x0145:
            X.0wS r0 = r3.A07
            r0.A06()
            X.160 r0 = r0.A09
            java.util.List r16 = r0.A0C()
            goto L_0x0133
        L_0x0151:
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x017b
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x017b
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x0174
            boolean r0 = r3.A0G
            if (r0 != 0) goto L_0x0174
            boolean r0 = r3.A0F
            if (r0 != 0) goto L_0x0182
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0182
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x0182
            X.0sG r0 = r3.A02
            r0.A0Y(r13)
            goto L_0x00f1
        L_0x0174:
            X.0sG r0 = r3.A02
            r0.A0U(r13)
            goto L_0x00f1
        L_0x017b:
            X.0sG r0 = r3.A02
            X.18c r5 = r0.A06
            r1 = 0
            r0 = 2
            goto L_0x0188
        L_0x0182:
            X.0sG r0 = r3.A02
            X.18c r5 = r0.A06
            r1 = 0
            r0 = 3
        L_0x0188:
            r5.A0R(r13, r0, r1, r1)
            goto L_0x00f1
        L_0x018d:
            boolean r0 = r7.A0J()
            if (r0 == 0) goto L_0x01a6
            X.0sO r1 = r3.A04
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r7.A08(r0)
            X.AnonymousClass00B.A06(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x00d4
        L_0x01a6:
            X.0rv r0 = r3.A06
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00d4
            r12.add(r7)
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60052zs.A08(java.lang.Object[]):java.lang.Object");
    }
}
