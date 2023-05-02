package X;

import android.view.View;
import com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.10B  reason: invalid class name */
public class AnonymousClass10B {
    public final C14870pt A00;
    public final C16040sK A01;
    public final AnonymousClass01Y A02;
    public final C18260wP A03;
    public final C16000sG A04;
    public final C16440t3 A05;
    public final C15860rz A06;
    public final C16070sO A07;
    public final C18070w6 A08;
    public final C14710pd A09;
    public final C17240ul A0A;
    public final C17220uj A0B;
    public final C16320sq A0C;

    public AnonymousClass10B(C14870pt r1, C16040sK r2, AnonymousClass01Y r3, C18260wP r4, C16000sG r5, C16440t3 r6, C15860rz r7, C16070sO r8, C18070w6 r9, C14710pd r10, C17240ul r11, C17220uj r12, C16320sq r13) {
        this.A05 = r6;
        this.A09 = r10;
        this.A00 = r1;
        this.A01 = r2;
        this.A0C = r13;
        this.A04 = r5;
        this.A0B = r12;
        this.A02 = r3;
        this.A0A = r11;
        this.A08 = r9;
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r13.equals(r0) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        if (r0 != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r22, android.view.View r23, X.C16760tb r24, X.AnonymousClass5PJ r25, X.C16740tZ r26, int r27, boolean r28) {
        /*
            r21 = this;
            r10 = 8
            r9 = 5
            r8 = 4
            r7 = 3
            r2 = 1
            r6 = r21
            r3 = r22
            r20 = r23
            r19 = r24
            r4 = r25
            r5 = r26
            r18 = r27
            r11 = r28
            if (r28 == 0) goto L_0x00ca
            java.lang.Long r1 = r5.A0Z
            X.1Vw r0 = r5.A11
            X.0rv r0 = r0.A00
            r16 = r0
            com.whatsapp.jid.GroupJid r15 = com.whatsapp.jid.GroupJid.of(r16)
            com.whatsapp.jid.UserJid r12 = com.whatsapp.jid.UserJid.of(r16)
            X.0sK r14 = r6.A01
            com.whatsapp.jid.UserJid r13 = X.C38621r6.A0B(r14, r5)
            X.0wP r0 = r6.A03
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0071
            r1 = 1
        L_0x0037:
            X.0w6 r0 = r6.A08
            r0.A03(r5, r1, r11)
            if (r1 == 0) goto L_0x0062
            if (r1 == r2) goto L_0x02d3
            if (r1 == r7) goto L_0x01f5
            if (r1 == r8) goto L_0x0059
            if (r1 == r9) goto L_0x0165
            if (r1 != r10) goto L_0x0058
            r1 = 607(0x25f, float:8.5E-43)
        L_0x004a:
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r0 = X.AnonymousClass22N.A01(r3, r0)
            if (r0 == 0) goto L_0x0055
            X.AnonymousClass29T.A01(r0, r1)
        L_0x0055:
            r4.A6E()
        L_0x0058:
            return
        L_0x0059:
            r1 = 2131889132(0x7f120bec, float:1.9412919E38)
            r0 = r20
            X.C34321k4.A01(r3, r0, r1)
            goto L_0x0055
        L_0x0062:
            X.0sq r3 = r6.A0C
            com.facebook.redex.RunnableRunnableShape0S0211000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0211000_I0
            r1 = r19
            r0 = r18
            r2.<init>(r1, r5, r0)
            r3.Acl(r2)
            goto L_0x0055
        L_0x0071:
            if (r15 == 0) goto L_0x0083
            boolean r0 = X.C16030sJ.A0L(r16)
            if (r0 == 0) goto L_0x0083
            X.0sO r0 = r6.A07
            boolean r0 = r0.A0B(r15, r13)
            if (r0 != 0) goto L_0x0083
            r1 = 3
            goto L_0x0037
        L_0x0083:
            X.01Y r0 = r6.A02
            boolean r0 = r0.A0V(r12)
            if (r0 == 0) goto L_0x008e
            r1 = 8
            goto L_0x0037
        L_0x008e:
            if (r1 == 0) goto L_0x009e
            long r15 = r1.longValue()
            long r12 = java.lang.System.currentTimeMillis()
            int r0 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x009e
            r1 = 4
            goto L_0x0037
        L_0x009e:
            X.1s4 r0 = r5.A1A
            if (r0 == 0) goto L_0x00c7
            com.whatsapp.jid.UserJid r13 = X.C38621r6.A0B(r14, r0)
            com.whatsapp.jid.UserJid r0 = X.C38621r6.A0B(r14, r5)
            if (r13 == 0) goto L_0x00b3
            boolean r0 = r13.equals(r0)
            r12 = 1
            if (r0 != 0) goto L_0x00b4
        L_0x00b3:
            r12 = 0
        L_0x00b4:
            int r0 = r5.A06()
            r1 = 0
            if (r0 != 0) goto L_0x00bc
            r1 = 1
        L_0x00bc:
            boolean r0 = r14.A0I(r13)
            if (r12 == 0) goto L_0x00c7
            if (r1 == 0) goto L_0x00c7
            r1 = 5
            if (r0 == 0) goto L_0x0037
        L_0x00c7:
            r1 = 0
            goto L_0x0037
        L_0x00ca:
            java.lang.Long r13 = r5.A0Z
            X.1Vw r12 = r5.A11
            X.0rv r0 = r12.A00
            r16 = r0
            com.whatsapp.jid.GroupJid r15 = com.whatsapp.jid.GroupJid.of(r16)
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r16)
            X.0sK r0 = r6.A01
            com.whatsapp.jid.UserJid r14 = X.C38621r6.A0B(r0, r5)
            X.0wP r0 = r6.A03
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0101
            r1 = 1
        L_0x00e9:
            X.0w6 r0 = r6.A08
            r0.A03(r5, r1, r11)
            if (r1 == 0) goto L_0x0155
            if (r1 == r2) goto L_0x02d3
            if (r1 == r7) goto L_0x02ca
            if (r1 == r8) goto L_0x0260
            if (r1 == r9) goto L_0x022d
            r0 = 6
            if (r1 == r0) goto L_0x01fa
            if (r1 != r10) goto L_0x0058
            r1 = 608(0x260, float:8.52E-43)
            goto L_0x004a
        L_0x0101:
            if (r15 == 0) goto L_0x0113
            boolean r0 = X.C16030sJ.A0L(r16)
            if (r0 == 0) goto L_0x0113
            X.0sO r0 = r6.A07
            boolean r0 = r0.A0B(r15, r14)
            if (r0 != 0) goto L_0x0113
            r1 = 3
            goto L_0x00e9
        L_0x0113:
            X.01Y r0 = r6.A02
            boolean r0 = r0.A0V(r1)
            if (r0 == 0) goto L_0x011e
            r1 = 8
            goto L_0x00e9
        L_0x011e:
            X.0pd r15 = r6.A09
            java.lang.Long r14 = r5.A0Z
            if (r14 == 0) goto L_0x013e
            long r16 = java.lang.System.currentTimeMillis()
            r1 = 1698(0x6a2, float:2.38E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r15.A03(r0, r1)
            int r0 = r0 * 1000
            long r0 = (long) r0
            long r14 = r14.longValue()
            long r14 = r14 + r0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x013e
            r1 = 6
            goto L_0x00e9
        L_0x013e:
            if (r13 == 0) goto L_0x014e
            long r15 = r13.longValue()
            long r13 = java.lang.System.currentTimeMillis()
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x014e
            r1 = 4
            goto L_0x00e9
        L_0x014e:
            boolean r0 = r12.A02
            r1 = 0
            if (r0 == 0) goto L_0x00e9
            r1 = 5
            goto L_0x00e9
        L_0x0155:
            X.0sq r3 = r6.A0C
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r1 = r19
            r0 = r18
            r2.<init>((X.C16760tb) r1, (X.C16740tZ) r5, (int) r0)
            r3.Acl(r2)
            goto L_0x0055
        L_0x0165:
            X.0uj r7 = r6.A0B
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r3)
            r1 = 2131559288(0x7f0d0378, float:1.8743916E38)
            r0 = 0
            android.view.View r9 = r5.inflate(r1, r0)
            r0 = 2131366117(0x7f0a10e5, float:1.8352118E38)
            android.view.View r6 = X.C004601z.A0E(r9, r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 2131366116(0x7f0a10e4, float:1.8352116E38)
            android.view.View r5 = X.C004601z.A0E(r9, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131364238(0x7f0a098e, float:1.8348307E38)
            android.view.View r1 = X.C004601z.A0E(r9, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131889159(0x7f120c07, float:1.9412974E38)
            r6.setText(r0)
            r0 = 2131889158(0x7f120c06, float:1.9412972E38)
            r5.setText(r0)
            r0 = 2131232078(0x7f08054e, float:1.8080255E38)
            r1.setImageResource(r0)
            r0 = 2131364898(0x7f0a0c22, float:1.8349646E38)
            android.view.View r8 = X.C004601z.A0E(r9, r0)
            r0 = 2131364276(0x7f0a09b4, float:1.8348384E38)
            android.view.View r6 = X.C004601z.A0E(r9, r0)
            X.1fu r0 = new X.1fu
            r0.<init>(r3)
            r0.setView(r9)
            r0.A07(r2)
            X.02l r5 = r0.create()
            com.facebook.redex.IDxDListenerShape158S0100000_2_I0 r0 = new com.facebook.redex.IDxDListenerShape158S0100000_2_I0
            r0.<init>(r4, r2)
            r5.setOnDismissListener(r0)
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x01de
            android.view.Window r2 = r5.getWindow()
            r0 = 2131101586(0x7f060792, float:1.7815586E38)
            int r1 = X.AnonymousClass00T.A00(r3, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r2.setBackgroundDrawable(r0)
        L_0x01de:
            r1 = 7
            com.facebook.redex.ViewOnClickCListenerShape18S0100000_I1_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape18S0100000_I1_3
            r0.<init>(r5, r1)
            r8.setOnClickListener(r0)
            r1 = 16
            com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1 r0 = new com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r7, (java.lang.Object) r5, (int) r1)
            r6.setOnClickListener(r0)
            r5.show()
            return
        L_0x01f5:
            r1 = 2131889156(0x7f120c04, float:1.9412968E38)
            goto L_0x02cd
        L_0x01fa:
            X.0pt r2 = r6.A00
            X.0sq r0 = r6.A0C
            X.4fp r1 = new X.4fp
            r7 = r2
            r8 = r19
            r9 = r5
            r10 = r0
            r5 = r1
            r6 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            X.1fu r5 = new X.1fu
            r5.<init>(r3)
            r0 = 2131887868(0x7f1206fc, float:1.9410355E38)
            r5.A01(r0)
            r0 = 2131891311(0x7f12146f, float:1.9417338E38)
            r5.setPositiveButton(r0, r1)
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 67
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r4, r1)
            r5.setNegativeButton(r2, r0)
            X.02l r0 = r5.create()
            goto L_0x025c
        L_0x022d:
            X.0sq r1 = r6.A0C
            X.1fu r6 = new X.1fu
            r6.<init>(r3)
            r0 = 2131889161(0x7f120c09, float:1.9412978E38)
            r6.A01(r0)
            r0 = 2131889799(0x7f120e87, float:1.9414272E38)
            r12 = 6
            com.facebook.redex.IDxCListenerShape4S0400000_2_I0 r7 = new com.facebook.redex.IDxCListenerShape4S0400000_2_I0
            r8 = r19
            r9 = r5
            r10 = r1
            r11 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r6.setPositiveButton(r0, r7)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 68
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r4, r1)
            r6.setNegativeButton(r2, r0)
            X.02l r0 = r6.create()
        L_0x025c:
            r0.show()
            return
        L_0x0260:
            X.0sq r7 = r6.A0C
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            r1 = 2131559405(0x7f0d03ed, float:1.8744153E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r1, r0)
            X.1fu r1 = new X.1fu
            r1.<init>(r3)
            r0 = 2131893108(0x7f121b74, float:1.9420983E38)
            r1.A02(r0)
            r0 = 2131893106(0x7f121b72, float:1.942098E38)
            r1.A01(r0)
            r1.setView(r2)
            X.02l r6 = r1.create()
            r0 = 2131362436(0x7f0a0284, float:1.8344653E38)
            android.view.View r1 = X.C004601z.A0E(r2, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131362437(0x7f0a0285, float:1.8344655E38)
            android.view.View r2 = X.C004601z.A0E(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = 2131893107(0x7f121b73, float:1.9420981E38)
            r1.setText(r0)
            r0 = 2131101508(0x7f060744, float:1.7815428E38)
            int r0 = X.AnonymousClass00T.A00(r3, r0)
            X.4kF r0 = new X.4kF
            r9 = r6
            r10 = r20
            r11 = r19
            r12 = r5
            r13 = r7
            r7 = r0
            r8 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.setOnClickListener(r0)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            r2.setText(r0)
            r1 = 25
            com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1
            r0.<init>(r4, r1, r6)
            r2.setOnClickListener(r0)
            r6.show()
            return
        L_0x02ca:
            r1 = 2131889157(0x7f120c05, float:1.941297E38)
        L_0x02cd:
            r0 = r20
            X.C34321k4.A01(r3, r0, r1)
            return
        L_0x02d3:
            X.0pt r1 = r6.A00
            r0 = 2131889133(0x7f120bed, float:1.941292E38)
            r1.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10B.A00(android.app.Activity, android.view.View, X.0tb, X.5PJ, X.0tZ, int, boolean):void");
    }

    public void A01(View view, C14550pN r19, C16760tb r20, AnonymousClass5PJ r21, C16740tZ r22, int i2, boolean z2) {
        C14710pd r7 = this.A09;
        C16620tM r5 = C16620tM.A02;
        View view2 = view;
        C14550pN r10 = r19;
        C16760tb r11 = r20;
        AnonymousClass5PJ r12 = r21;
        C16740tZ r14 = r22;
        int i3 = i2;
        boolean z3 = z2;
        if (r7.A0E(r5, 2005)) {
            C15860rz r4 = this.A06;
            if (EphemeralDmKicBottomSheetDialog.A02(r10.AGM(), r4)) {
                AnonymousClass02C AGM = r10.AGM();
                C15830rv r2 = r14.A11.A00;
                C102004yF r8 = new C102004yF(view2, r10, r11, r12, this, r14, i3, z3);
                int i4 = 7;
                if (z2) {
                    i4 = 6;
                }
                if (r7.A0E(r5, 2005) && EphemeralDmKicBottomSheetDialog.A02(AGM, r4)) {
                    EphemeralDmKicBottomSheetDialog.A01(AGM, r2, i4);
                    EphemeralDmKicBottomSheetDialog.A0P = r8;
                    return;
                }
                return;
            }
        }
        A00(r10, view2, r11, r12, r14, i3, z3);
    }

    public boolean A02(C16740tZ r9) {
        GroupJid of;
        C14710pd r6 = this.A09;
        C16620tM r5 = C16620tM.A02;
        if (r6.A0E(r5, 1353) && C38621r6.A0l(r9) && 1 != r9.A06()) {
            C15830rv r1 = r9.A11.A00;
            if (C16030sJ.A0L(r1) && (of = GroupJid.of(r1)) != null) {
                C16010sH A082 = this.A04.A08(of);
                C16050sL A032 = C16050sL.A03(of);
                if (!(A082 == null || A032 == null)) {
                    C17240ul r2 = this.A0A;
                    if (!r2.A0g(A082, of) || this.A07.A0A(of)) {
                        if (r2.A0R.A03(A032) != 3 || r6.A0E(r5, 2844)) {
                            return r2.A0h(A082, A032);
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean A03(C16740tZ r11) {
        GroupJid of;
        C14710pd r8 = this.A09;
        if (C34321k4.A05(r8, r11) && C38621r6.A0l(r11) && 1 == r11.A06()) {
            C28381Vw r7 = r11.A11;
            C15830rv r1 = r7.A00;
            if (C16030sJ.A0L(r1) && (of = GroupJid.of(r1)) != null) {
                C16010sH A082 = this.A04.A08(of);
                C16050sL A032 = C16050sL.A03(of);
                if (!(A082 == null || A032 == null)) {
                    C17240ul r2 = this.A0A;
                    if (r2.A0R.A03(A032) != 3 || r8.A0E(C16620tM.A02, 2844)) {
                        C16070sO r12 = this.A07;
                        if (!r12.A0A(of)) {
                            if (r12.A09(of) && 1 == r11.A06() && r7.A02) {
                                return true;
                            }
                            if (r2.A0g(A082, of)) {
                                return false;
                            }
                        }
                        return r2.A0h(A082, A032);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
