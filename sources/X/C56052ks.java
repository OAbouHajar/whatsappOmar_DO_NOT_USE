package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.redex.IDxCallbackShape373S0100000_2_I0;
import com.facebook.redex.IDxCallbackShape374S0100000_2_I0;
import com.facebook.redex.IDxFunctionShape206S0100000_2_I0;
import com.facebook.redex.IDxLObserverShape301S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.R;
import com.obwhatsapp.community.SubgroupPileView;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2ks  reason: invalid class name and case insensitive filesystem */
public class C56052ks extends AnonymousClass2AK {
    public C78793yh A00;
    public C78803yi A01;
    public C37831po A02;
    public C38571r0 A03;
    public final C16300so A04;
    public final AnonymousClass5P8 A05 = new IDxCallbackShape373S0100000_2_I0(this, 0);
    public final AnonymousClass5P9 A06 = new IDxCallbackShape374S0100000_2_I0(this, 0);
    public final C17230uk A07;
    public final C16000sG A08;
    public final AnonymousClass15I A09;
    public final C16440t3 A0A;
    public final AnonymousClass1D0 A0B;
    public final C16070sO A0C;
    public final AnonymousClass195 A0D;
    public final AnonymousClass119 A0E;
    public final C16010sH A0F;
    public final AnonymousClass15X A0G;
    public final C14710pd A0H;
    public final C17240ul A0I;
    public final C217915l A0J;
    public final C16050sL A0K;
    public final AnonymousClass47G A0L;
    public final AnonymousClass125 A0M;
    public final AnonymousClass47S A0N;
    public final AnonymousClass1M4 A0O;
    public final C109505Sk A0P = new IDxLObserverShape301S0100000_2_I0(this, 1);
    public final AnonymousClass1SP A0Q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56052ks(X.C000900k r43, X.C16300so r44, X.C14600pS r45, X.C14870pt r46, X.C16040sK r47, X.C15900s5 r48, X.C16760tb r49, X.C19740yv r50, X.C54602hp r51, X.C17650vQ r52, X.AnonymousClass127 r53, X.C17760vb r54, X.C17230uk r55, X.C16000sG r56, X.C17140ub r57, X.C17030uP r58, X.AnonymousClass1yP r59, X.AnonymousClass2a9 r60, X.AnonymousClass1M1 r61, X.AnonymousClass15I r62, X.C20270zm r63, X.AnonymousClass12W r64, X.C16440t3 r65, X.C15860rz r66, X.AnonymousClass013 r67, X.C14730pf r68, X.AnonymousClass1D0 r69, X.C15810rt r70, X.C216114t r71, X.C16070sO r72, X.AnonymousClass195 r73, X.AnonymousClass119 r74, X.C16010sH r75, X.C17580vJ r76, X.C19410yO r77, X.AnonymousClass15X r78, X.C14710pd r79, X.C20260zl r80, X.C17240ul r81, X.AnonymousClass18R r82, X.C217915l r83, X.C16050sL r84, X.AnonymousClass47G r85, X.AnonymousClass125 r86, X.C16220sf r87, X.AnonymousClass47S r88, X.C25781Lc r89, X.AnonymousClass15V r90, X.AnonymousClass1M4 r91, X.C25721Kw r92, X.C16320sq r93, X.AnonymousClass1SP r94) {
        /*
            r42 = this;
            r5 = r42
            r29 = r71
            r28 = r70
            r27 = r68
            r26 = r67
            r25 = r66
            r24 = r64
            r23 = r63
            r4 = r62
            r21 = r61
            r20 = r60
            r19 = r59
            r18 = r58
            r17 = r57
            r6 = r43
            r7 = r45
            r8 = r46
            r9 = r47
            r10 = r48
            r11 = r49
            r35 = r82
            r15 = r53
            r16 = r54
            r2 = r84
            r37 = r87
            r38 = r89
            r39 = r90
            r40 = r92
            r41 = r93
            r14 = r52
            r34 = r80
            r13 = r51
            r3 = r79
            r12 = r50
            r32 = r77
            r31 = r76
            r30 = r75
            r22 = r4
            r33 = r3
            r36 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1 = 0
            com.facebook.redex.IDxCallbackShape373S0100000_2_I0 r0 = new com.facebook.redex.IDxCallbackShape373S0100000_2_I0
            r0.<init>(r5, r1)
            r5.A05 = r0
            com.facebook.redex.IDxCallbackShape374S0100000_2_I0 r0 = new com.facebook.redex.IDxCallbackShape374S0100000_2_I0
            r0.<init>(r5, r1)
            r5.A06 = r0
            r1 = 1
            com.facebook.redex.IDxLObserverShape301S0100000_2_I0 r0 = new com.facebook.redex.IDxLObserverShape301S0100000_2_I0
            r0.<init>(r5, r1)
            r5.A0P = r0
            r0 = r65
            r5.A0A = r0
            r5.A0H = r3
            r0 = r44
            r5.A04 = r0
            r1 = r56
            r5.A08 = r1
            r0 = r86
            r5.A0M = r0
            r0 = r94
            r5.A0Q = r0
            r0 = r81
            r5.A0I = r0
            r0 = r69
            r5.A0B = r0
            r0 = r74
            r5.A0E = r0
            r0 = r78
            r5.A0G = r0
            r0 = r55
            r5.A07 = r0
            r0 = r73
            r5.A0D = r0
            r0 = r72
            r5.A0C = r0
            r0 = r91
            r5.A0O = r0
            r0 = r88
            r5.A0N = r0
            r5.A0K = r2
            r5.A09 = r4
            X.0sH r0 = r1.A0A(r2)
            r5.A0F = r0
            r0 = r83
            r5.A0J = r0
            r0 = r85
            r5.A0L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56052ks.<init>(X.00k, X.0so, X.0pS, X.0pt, X.0sK, X.0s5, X.0tb, X.0yv, X.2hp, X.0vQ, X.127, X.0vb, X.0uk, X.0sG, X.0ub, X.0uP, X.1yP, X.2a9, X.1M1, X.15I, X.0zm, X.12W, X.0t3, X.0rz, X.013, X.0pf, X.1D0, X.0rt, X.14t, X.0sO, X.195, X.119, X.0sH, X.0vJ, X.0yO, X.15X, X.0pd, X.0zl, X.0ul, X.18R, X.15l, X.0sL, X.47G, X.125, X.0sf, X.47S, X.1Lc, X.15V, X.1M4, X.1Kw, X.0sq, X.1SP):void");
    }

    public final void A08(long j2) {
        AnonymousClass1D0 r1 = this.A0B;
        C37831po A012 = r1.A01(j2);
        if (A012 != null) {
            this.A02 = A012;
        } else if (this.A00 == null) {
            C78793yh r2 = new C78793yh(this.A05, r1, j2);
            this.A00 = r2;
            this.A0d.Acn(r2, new Void[0]);
        }
    }

    public final boolean A09() {
        if (((Conversation) this.A0G).A00.A0q()) {
            return false;
        }
        C16050sL r7 = this.A0K;
        C16010sH r5 = this.A00;
        C17650vQ r2 = this.A09;
        C17240ul r6 = this.A0I;
        return C30341cC.A0I(this.A04, this.A05, r2, this.A08, this.A0C, r5, r6, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r10.A0I.A0f(r10.A00) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r5.equals(r3.groupJid) == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APE(android.view.Menu r11) {
        /*
            r10 = this;
            java.lang.String r0 = "groupconversationmenu/oncreateoptionsmenu"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sL r5 = r10.A0K
            X.0sH r0 = r10.A00
            X.0rt r4 = r10.A0P
            if (r5 == 0) goto L_0x00d8
            boolean r0 = r0.A0a
            if (r0 != 0) goto L_0x00d8
            int r1 = r4.A02(r5)
            r0 = 3
            if (r1 == r0) goto L_0x00d8
            X.195 r1 = r10.A0D
            boolean r0 = r1.A07(r5)
            if (r0 == 0) goto L_0x01d9
            X.1r0 r0 = r1.A02(r5)
            r10.A03 = r0
            if (r0 == 0) goto L_0x002d
            long r0 = r0.A00
            r10.A08(r0)
        L_0x002d:
            X.1r0 r0 = r10.A03
            if (r0 == 0) goto L_0x0165
            boolean r2 = r0.A04
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.1yP r0 = r10.A0G
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            X.1yj r0 = r0.A00
            boolean r0 = r0.A0q()
            if (r0 != 0) goto L_0x0056
            X.0vQ r0 = r10.A09
            boolean r0 = X.C30341cC.A0K(r0, r5, r3)
            if (r0 == 0) goto L_0x0056
            X.0ul r1 = r10.A0I
            X.0sH r0 = r10.A00
            boolean r0 = r1.A0f(r0)
            r8 = 1
            if (r0 == 0) goto L_0x0057
        L_0x0056:
            r8 = 0
        L_0x0057:
            if (r3 == 0) goto L_0x0068
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0068
            com.whatsapp.jid.GroupJid r0 = r3.groupJid
            boolean r0 = r5.equals(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0069
        L_0x0068:
            r9 = 0
        L_0x0069:
            r7 = 2131893731(0x7f121de3, float:1.9422247E38)
            r1 = 27
            r0 = 0
            android.view.MenuItem r6 = r11.add(r0, r1, r0, r7)
            r0 = 2131559284(0x7f0d0374, float:1.8743908E38)
            r6.setActionView(r0)
            r0 = 2
            r6.setShowAsAction(r0)
            android.view.View r3 = r6.getActionView()
            r0 = 2131364235(0x7f0a098b, float:1.8348301E38)
            android.view.View r1 = X.C004601z.A0E(r3, r0)
            com.obwhatsapp.text.AutoSizeTextView r1 = (com.obwhatsapp.text.AutoSizeTextView) r1
            r0 = 2131893731(0x7f121de3, float:1.9422247E38)
            if (r9 == 0) goto L_0x0092
            r0 = 2131893011(0x7f121b13, float:1.9420786E38)
        L_0x0092:
            r1.setText(r0)
            r0 = 56
            r1.A0C(r0)
            r0 = 2131362536(0x7f0a02e8, float:1.8344855E38)
            android.view.View r1 = X.C004601z.A0E(r3, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131231401(0x7f0802a9, float:1.8078882E38)
            if (r2 == 0) goto L_0x00ab
            r0 = 2131231439(0x7f0802cf, float:1.807896E38)
        L_0x00ab:
            r1.setImageResource(r0)
            X.00k r1 = r10.A01
            r0 = 2131889806(0x7f120e8e, float:1.9414286E38)
            if (r2 == 0) goto L_0x00b8
            r0 = 2131892682(0x7f1219ca, float:1.942012E38)
        L_0x00b8:
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131892931(0x7f121ac3, float:1.9420624E38)
            if (r9 == 0) goto L_0x00c4
            r0 = 2131893011(0x7f121b13, float:1.9420786E38)
        L_0x00c4:
            java.lang.String r1 = r1.getString(r0)
            X.3P5 r0 = new X.3P5
            r0.<init>(r2, r1)
            X.C004601z.A0j(r3, r0)
            if (r9 == 0) goto L_0x00d5
            r7 = 2131893011(0x7f121b13, float:1.9420786E38)
        L_0x00d5:
            r10.A07(r6, r7, r8)
        L_0x00d8:
            r1 = 21
            r0 = 2131888794(0x7f120a9a, float:1.9412233E38)
            X.AnonymousClass2AK.A02(r11, r1, r0)
            r1 = 6
            r0 = 2131892701(0x7f1219dd, float:1.9420158E38)
            X.AnonymousClass2AK.A02(r11, r1, r0)
            r1 = 7
            r0 = 2131893628(0x7f121d7c, float:1.9422038E38)
            X.AnonymousClass2AK.A02(r11, r1, r0)
            r1 = 4
            int r0 = r10.A04()
            X.AnonymousClass2AK.A02(r11, r1, r0)
            X.0ul r0 = r10.A0I
            X.0sH r6 = r10.A0F
            boolean r3 = r0.A0f(r6)
            X.0pd r2 = r10.A0H
            r1 = 1309(0x51d, float:1.834E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0124
            X.0sO r2 = r10.A0C
            X.15l r1 = r10.A0J
            boolean r0 = X.AnonymousClass2BW.A01(r2, r6, r1, r5)
            if (r0 != 0) goto L_0x011a
            boolean r0 = X.AnonymousClass2BX.A03(r4, r2, r6, r1, r5)
            if (r0 == 0) goto L_0x0124
        L_0x011a:
            if (r3 != 0) goto L_0x0124
            r1 = 12
            r0 = 2131888143(0x7f12080f, float:1.9410913E38)
            X.AnonymousClass2AK.A02(r11, r1, r0)
        L_0x0124:
            r1 = 5
            r0 = 2131893054(0x7f121b3e, float:1.9420874E38)
            X.AnonymousClass2AK.A02(r11, r1, r0)
            r2 = 1
            r1 = 2131893512(0x7f121d08, float:1.9421803E38)
            r0 = 0
            android.view.SubMenu r2 = r11.addSubMenu(r0, r2, r0, r1)
            r2.clearHeader()
            r1 = 9
            r0 = 2131891232(0x7f121420, float:1.9417178E38)
            X.AnonymousClass2AK.A02(r2, r1, r0)
            X.0sO r0 = r10.A0C
            boolean r0 = r0.A09(r5)
            if (r0 == 0) goto L_0x014f
            r1 = 23
            r0 = 2131888268(0x7f12088c, float:1.9411167E38)
            X.AnonymousClass2AK.A02(r2, r1, r0)
        L_0x014f:
            r1 = 8
            r0 = 2131887209(0x7f120469, float:1.9409019E38)
            X.AnonymousClass2AK.A02(r2, r1, r0)
            r10.A05(r2)
            r1 = 2
            r0 = 2131886273(0x7f1200c1, float:1.940712E38)
            X.AnonymousClass2AK.A02(r2, r1, r0)
            r4.A02(r5)
            return
        L_0x0165:
            X.0s5 r2 = r10.A05
            X.0sO r1 = r10.A0C
            X.0sH r0 = r10.A00
            boolean r0 = X.C30341cC.A0J(r2, r4, r1, r0, r5)
            if (r0 == 0) goto L_0x01b6
            boolean r7 = r10.A09()
            r6 = 2131886365(0x7f12011d, float:1.9407307E38)
            r2 = 2131892662(0x7f1219b6, float:1.9420079E38)
            r0 = 26
            r1 = 0
            android.view.MenuItem r3 = r11.add(r1, r0, r1, r2)
            r0 = 2131559880(0x7f0d05c8, float:1.8745117E38)
            r3.setActionView(r0)
            r10.A07(r3, r2, r7)
            r0 = 25
            android.view.MenuItem r2 = r11.add(r1, r0, r1, r6)
            r0 = 2131558520(0x7f0d0078, float:1.8742358E38)
            r2.setActionView(r0)
            android.view.View r1 = r2.getActionView()
            X.00k r0 = r10.A01
            java.lang.String r0 = r0.getString(r6)
            r1.setContentDescription(r0)
            r10.A07(r2, r6, r7)
            r0 = 2
            r3.setShowAsAction(r0)
            com.obwhatsapp.yo.yo.Conv_call_btn(r3)
            r2.setShowAsAction(r0)
            com.obwhatsapp.yo.yo.Conv_call_btn(r2)
            goto L_0x00d8
        L_0x01b6:
            boolean r0 = r1.A09(r5)
            if (r0 == 0) goto L_0x00d8
            boolean r3 = r10.A09()
            r2 = 2131888701(0x7f120a3d, float:1.9412045E38)
            r1 = 24
            r0 = 0
            android.view.MenuItem r1 = r11.add(r0, r1, r0, r2)
            r0 = 2131559114(0x7f0d02ca, float:1.8743563E38)
            r1.setActionView(r0)
            r10.A07(r1, r2, r3)
            r0 = 2
            r1.setShowAsAction(r0)
            goto L_0x00d8
        L_0x01d9:
            X.5P9 r0 = r10.A06
            X.3yi r2 = new X.3yi
            r2.<init>(r0, r1, r5)
            r10.A01 = r2
            X.0sq r1 = r10.A0d
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Acn(r2, r0)
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56052ks.APE(android.view.Menu):void");
    }

    public boolean AUD(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 12) {
            if (itemId != 13) {
                switch (itemId) {
                    case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                        C000900k r4 = this.A01;
                        Intent A0W = C14750ph.A0W(r4, this.A00.A0E, true, false, false);
                        C17230uk r2 = this.A07;
                        C16050sL r1 = this.A0K;
                        Bundle A052 = C455529g.A05(r4, r2.A0E(r1, this.A0P.A02(r1)) ? ((SubgroupPileView) new C33741j5(AnonymousClass00T.A05(r4, R.id.subgroup_facepile_toolbar_photo)).A02()).A01 : AnonymousClass00T.A05(r4, R.id.transition_start), this.A08.A00(R.string.str1dd7));
                        AnonymousClass22U.A00(A0W, r4.getClass().getSimpleName());
                        r4.startActivity(A0W, A052);
                        return true;
                    case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                    case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                        break;
                    case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                        this.A0M.A04(this.A0Y);
                        this.A02.Afr(0, R.string.str13db);
                        this.A0d.Ack(new C55462je(new IDxFunctionShape206S0100000_2_I0(this, 0), this.A01, this.A07, this.A0E, Collections.singleton(this.A0K)), new Object[0]);
                        return true;
                    case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                        C16000sG r22 = this.A08;
                        C16050sL r3 = this.A0K;
                        C30341cC.A0E(this.A01, r22, r3, C30341cC.A0D(this.A04, this.A0C, r3), (List) null, 24, true);
                        break;
                    case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                        this.A0O.A00(6);
                        ((Conversation) this.A0G).A00.A0d(this.A00, false);
                        return true;
                    case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                        this.A0O.A00(7);
                        ((Conversation) this.A0G).A00.A0d(this.A00, true);
                        return true;
                    case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                        C37831po r32 = this.A02;
                        if (r32 != null) {
                            C42821yj r0 = ((Conversation) this.A0G).A00;
                            r0.A1R.A06((Context) r0.A22, r32, 9);
                            return true;
                        }
                        this.A04.AcB("LinkedCallLogPrefetchNotCompletedOnTime", "groupConversationHeader", false);
                        return true;
                    default:
                        return super.AUD(menuItem);
                }
            }
            return true;
        }
        this.A0d.Acl(new RunnableRunnableShape7S0100000_I0_6(this, 24));
        C000900k r33 = this.A01;
        C16050sL r23 = this.A0K;
        r33.startActivity(C14750ph.A0J(r33, r23, this.A08.A0A(r23).A01, 3));
        return true;
    }

    public boolean AVB(Menu menu) {
        StringBuilder sb = new StringBuilder("groupconversationmenu/onprepareoptionsmenu ");
        sb.append(menu.size());
        Log.i(sb.toString());
        if (menu.size() == 0) {
            return false;
        }
        A06(menu.findItem(4));
        menu.findItem(1).getSubMenu();
        return super.AVB(menu);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        this.A0Q.A02(this.A0P);
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        this.A0Q.A03(this.A0P);
        C78803yi r0 = this.A01;
        if (r0 != null) {
            r0.A06(true);
            this.A01 = null;
        }
        C78793yh r02 = this.A00;
        if (r02 != null) {
            r02.A06(true);
            this.A00 = null;
        }
    }
}
