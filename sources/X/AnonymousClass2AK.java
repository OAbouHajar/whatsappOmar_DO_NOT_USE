package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;

/* renamed from: X.2AK  reason: invalid class name */
public abstract class AnonymousClass2AK extends C19530ya implements AnonymousClass2AL {
    public C16010sH A00;
    public final C000900k A01;
    public final C14600pS A02;
    public final C14870pt A03;
    public final C16040sK A04;
    public final C15900s5 A05;
    public final C16760tb A06;
    public final C19740yv A07;
    public final C54602hp A08;
    public final C17650vQ A09;
    public final C40781ug A0A = new IDxSObserverShape63S0100000_2_I0(this, 8);
    public final AnonymousClass127 A0B;
    public final C17760vb A0C;
    public final C33481ie A0D = new IDxCObserverShape68S0100000_2_I0(this, 12);
    public final C17140ub A0E;
    public final C17030uP A0F;
    public final AnonymousClass1yP A0G;
    public final AnonymousClass2a9 A0H;
    public final AnonymousClass1M1 A0I;
    public final AnonymousClass15I A0J;
    public final C20270zm A0K;
    public final AnonymousClass12W A0L;
    public final C15860rz A0M;
    public final AnonymousClass013 A0N;
    public final C14730pf A0O;
    public final C15810rt A0P;
    public final C216114t A0Q;
    public final C17580vJ A0R;
    public final C19410yO A0S;
    public final C14710pd A0T;
    public final C20260zl A0U;
    public final AnonymousClass1VD A0V = new IDxPObserverShape81S0100000_2_I0(this, 10);
    public final AnonymousClass18R A0W;
    public final C14750ph A0X = new C14750ph();
    public final C15830rv A0Y;
    public final C16220sf A0Z;
    public final C25781Lc A0a;
    public final AnonymousClass15V A0b;
    public final C25721Kw A0c;
    public final C16320sq A0d;

    public AnonymousClass2AK(C000900k r3, C14600pS r4, C14870pt r5, C16040sK r6, C15900s5 r7, C16760tb r8, C19740yv r9, C54602hp r10, C17650vQ r11, AnonymousClass127 r12, C17760vb r13, C17140ub r14, C17030uP r15, AnonymousClass1yP r16, AnonymousClass2a9 r17, AnonymousClass1M1 r18, AnonymousClass15I r19, C20270zm r20, AnonymousClass12W r21, C15860rz r22, AnonymousClass013 r23, C14730pf r24, C15810rt r25, C216114t r26, C16010sH r27, C17580vJ r28, C19410yO r29, C14710pd r30, C20260zl r31, AnonymousClass18R r32, C15830rv r33, C16220sf r34, C25781Lc r35, AnonymousClass15V r36, C25721Kw r37, C16320sq r38) {
        this.A0T = r30;
        this.A01 = r3;
        this.A02 = r4;
        this.A0G = r16;
        this.A03 = r5;
        this.A04 = r6;
        this.A0d = r38;
        this.A0P = r25;
        this.A0b = r36;
        this.A05 = r7;
        this.A06 = r8;
        this.A0U = r31;
        this.A0O = r24;
        this.A09 = r11;
        this.A0N = r23;
        this.A08 = r10;
        this.A0C = r13;
        this.A0E = r14;
        this.A0a = r35;
        this.A0R = r28;
        this.A0J = r19;
        this.A0Z = r34;
        this.A0L = r21;
        this.A07 = r9;
        this.A0B = r12;
        this.A0F = r15;
        this.A0M = r22;
        this.A0I = r18;
        this.A0S = r29;
        this.A0c = r37;
        this.A0H = r17;
        this.A0Q = r26;
        this.A0W = r32;
        this.A0K = r20;
        this.A0Y = r33;
        this.A00 = r27;
    }

    public static void A02(Menu menu, int i2, int i3) {
        menu.add(0, i2, 0, i3);
    }

    public int A04() {
        C16220sf r0 = this.A0Z;
        C15830rv r2 = this.A0Y;
        if (!r0.A0Q(r2)) {
            return C222417e.A01(this.A0M, this.A0P, r2) ? R.string.str0d13 : R.string.str0d01;
        }
    }

    public void A05(Menu menu) {
        if (this.A05.A05(C15910s6.A0K)) {
            A02(menu, 3, R.string.str0896);
        }
    }

    public void A06(MenuItem menuItem) {
        C000900k r4 = this.A01;
        SpannableString spannableString = new SpannableString(r4.getString(A04()));
        C15830rv r2 = this.A0Y;
        if (C222417e.A01(this.A0M, this.A0P, r2)) {
            spannableString.setSpan(new ForegroundColorSpan(AnonymousClass00T.A00(r4, R.color.color0501)), 0, spannableString.length(), 0);
        }
        menuItem.setTitle(spannableString);
    }

    public void A07(MenuItem menuItem, int i2, boolean z2) {
        C94254kc r0;
        View actionView = menuItem.getActionView();
        float f2 = 0.4f;
        if (z2) {
            f2 = 1.0f;
        }
        actionView.setAlpha(f2);
        actionView.setEnabled(z2);
        if (z2) {
            if (!(!this.A0N.A0T())) {
                r0 = new C94254kc(0.2f, 0.0f, 0.0f, 0.0f);
            }
            actionView.setOnTouchListener(r0);
            actionView.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 23, menuItem));
            actionView.setOnLongClickListener(new AnonymousClass3Cy(this, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01e1, code lost:
        if (r5.A0A.A00(r6) != null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006b, code lost:
        if (r5.A0E.A0E(X.C16620tM.A02, 1967) == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APE(android.view.Menu r15) {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.AnonymousClass30A
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "listconversationmenu/oncreateoptionsmenu"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 2131889248(0x7f120c60, float:1.9413154E38)
            r0 = 21
            A02(r15, r0, r1)
            r1 = 2131892706(0x7f1219e2, float:1.9420168E38)
            r0 = 6
            A02(r15, r0, r1)
            r1 = 2131893628(0x7f121d7c, float:1.9422038E38)
            r0 = 7
            A02(r15, r0, r1)
            r1 = 2131893054(0x7f121b3e, float:1.9420874E38)
            r0 = 5
            A02(r15, r0, r1)
            r2 = 1
            r1 = 2131893512(0x7f121d08, float:1.9421803E38)
            r0 = 0
            android.view.SubMenu r2 = r15.addSubMenu(r0, r2, r0, r1)
            r2.clearHeader()
            r1 = 8
            r0 = 2131887209(0x7f120469, float:1.9409019E38)
            A02(r2, r1, r0)
            r14.A05(r2)
            r1 = 2
            r0 = 2131886273(0x7f1200c1, float:1.940712E38)
            A02(r2, r1, r0)
            return
        L_0x0045:
            r5 = r14
            X.30B r5 = (X.AnonymousClass30B) r5
            java.lang.String r0 = "contactconversationmenu/oncreateoptionsmenu"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sK r1 = r5.A02
            X.0rv r6 = r5.A0Y
            r1.A0I(r6)
            X.0zl r0 = r5.A0F
            boolean r13 = X.C40561uK.A01(r0, r6)
            boolean r0 = r1.A0I(r6)
            if (r0 == 0) goto L_0x006d
            X.0pd r2 = r5.A0E
            r1 = 1967(0x7af, float:2.756E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r12 = 1
            if (r0 != 0) goto L_0x006e
        L_0x006d:
            r12 = 0
        L_0x006e:
            if (r13 != 0) goto L_0x00bd
            X.0sH r0 = r5.A00
            boolean r0 = r0.A0H()
            if (r0 != 0) goto L_0x01a5
            if (r12 != 0) goto L_0x00bd
            boolean r7 = r5.A09()
            r6 = 2131886365(0x7f12011d, float:1.9407307E38)
            r3 = 2131892662(0x7f1219b6, float:1.9420079E38)
            r0 = 26
            r1 = 0
            android.view.MenuItem r2 = r15.add(r1, r0, r1, r3)
            r0 = 2131559880(0x7f0d05c8, float:1.8745117E38)
            r2.setActionView(r0)
            r5.A07(r2, r3, r7)
            r0 = 25
            android.view.MenuItem r4 = r15.add(r1, r0, r1, r6)
            r0 = 2131558520(0x7f0d0078, float:1.8742358E38)
            r4.setActionView(r0)
            android.view.View r1 = r4.getActionView()
            X.00k r0 = r5.A01
            java.lang.String r0 = r0.getString(r6)
            r1.setContentDescription(r0)
            r5.A07(r4, r6, r7)
            r0 = 2
            r2.setShowAsAction(r0)
            com.obwhatsapp.yo.yo.Conv_call_btn(r2)
        L_0x00b7:
            r4.setShowAsAction(r0)
            com.obwhatsapp.yo.yo.Conv_call_btn(r4)
        L_0x00bd:
            r1 = 21
            r0 = 2131892692(0x7f1219d4, float:1.942014E38)
            A02(r15, r1, r0)
            if (r12 == 0) goto L_0x00df
            X.18c r2 = r5.A07
            X.0sH r1 = r5.A00
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            X.0rv r0 = (X.C15830rv) r0
            X.0sH r0 = r2.A0A(r0)
            if (r0 == 0) goto L_0x00df
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x00e7
        L_0x00df:
            r1 = 22
            r0 = 2131886246(0x7f1200a6, float:1.9407065E38)
            A02(r15, r1, r0)
        L_0x00e7:
            X.0sH r0 = r5.A00
            boolean r0 = r0.A0H()
            r6 = 2
            r4 = 8
            r7 = 23
            r3 = 24
            r2 = 12
            r1 = 5
            r8 = 9
            r10 = 4
            r11 = 7
            r9 = 6
            if (r0 == 0) goto L_0x015a
            if (r13 != 0) goto L_0x0106
            r0 = 2131891232(0x7f121420, float:1.9417178E38)
            A02(r15, r8, r0)
        L_0x0106:
            if (r12 != 0) goto L_0x010e
            r0 = 2131886630(0x7f120226, float:1.9407844E38)
            A02(r15, r7, r0)
        L_0x010e:
            r0 = 2131892338(0x7f121872, float:1.9419421E38)
            A02(r15, r3, r0)
            r0 = 2131893628(0x7f121d7c, float:1.9422038E38)
            A02(r15, r11, r0)
            if (r12 != 0) goto L_0x0123
            int r0 = r5.A04()
            A02(r15, r10, r0)
        L_0x0123:
            boolean r0 = r5.A08()
            if (r0 == 0) goto L_0x012f
            r0 = 2131888143(0x7f12080f, float:1.9410913E38)
            A02(r15, r2, r0)
        L_0x012f:
            r0 = 2131893054(0x7f121b3e, float:1.9420874E38)
            A02(r15, r1, r0)
            r2 = 1
            r1 = 2131893512(0x7f121d08, float:1.9421803E38)
            r0 = 0
            android.view.SubMenu r1 = r15.addSubMenu(r0, r2, r0, r1)
            r1.clearHeader()
            r1.clearHeader()
            r0 = 2131892697(0x7f1219d9, float:1.942015E38)
            A02(r1, r9, r0)
        L_0x014a:
            r0 = 2131887209(0x7f120469, float:1.9409019E38)
            A02(r1, r4, r0)
            r5.A05(r1)
            r0 = 2131886273(0x7f1200c1, float:1.940712E38)
            A02(r1, r6, r0)
            return
        L_0x015a:
            r0 = 2131892697(0x7f1219d9, float:1.942015E38)
            A02(r15, r9, r0)
            r0 = 2131893628(0x7f121d7c, float:1.9422038E38)
            A02(r15, r11, r0)
            if (r12 != 0) goto L_0x016f
            int r0 = r5.A04()
            A02(r15, r10, r0)
        L_0x016f:
            boolean r0 = r5.A08()
            if (r0 == 0) goto L_0x017b
            r0 = 2131888143(0x7f12080f, float:1.9410913E38)
            A02(r15, r2, r0)
        L_0x017b:
            r0 = 2131893054(0x7f121b3e, float:1.9420874E38)
            A02(r15, r1, r0)
            r2 = 1
            r1 = 2131893512(0x7f121d08, float:1.9421803E38)
            r0 = 0
            android.view.SubMenu r1 = r15.addSubMenu(r0, r2, r0, r1)
            r1.clearHeader()
            r1.clearHeader()
            if (r12 != 0) goto L_0x019e
            r0 = 2131891232(0x7f121420, float:1.9417178E38)
            A02(r1, r8, r0)
            r0 = 2131886630(0x7f120226, float:1.9407844E38)
            A02(r1, r7, r0)
        L_0x019e:
            r0 = 2131892338(0x7f121872, float:1.9419421E38)
            A02(r1, r3, r0)
            goto L_0x014a
        L_0x01a5:
            X.0pd r2 = r5.A0E
            r1 = 1464(0x5b8, float:2.052E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r4 = r2.A0E(r0, r1)
            r3 = r6
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.0uc r2 = r5.A04
            r1 = 1
            com.facebook.redex.IDxPCallbackShape79S0200000_1_I1 r0 = new com.facebook.redex.IDxPCallbackShape79S0200000_1_I1
            r0.<init>(r15, r1, r5)
            r2.A03(r0, r3)
            X.0uP r2 = r5.A08
            X.0sH r1 = r5.A00
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x01d1
            if (r4 == 0) goto L_0x00bd
        L_0x01d1:
            if (r12 != 0) goto L_0x00bd
            boolean r0 = r5.A09()
            r4 = 0
            if (r0 == 0) goto L_0x01e3
            X.2a9 r0 = r5.A0A
            X.1ZT r0 = r0.A00(r6)
            r3 = 1
            if (r0 == 0) goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            r1 = 28
            r0 = 5
            r2 = 2131886900(0x7f120334, float:1.9408392E38)
            android.view.MenuItem r4 = r15.add(r4, r1, r0, r2)
            r0 = 2131558529(0x7f0d0081, float:1.8742376E38)
            r4.setActionView(r0)
            android.view.View r1 = r4.getActionView()
            X.00k r0 = r5.A01
            java.lang.String r0 = r0.getString(r2)
            r1.setContentDescription(r0)
            r5.A07(r4, r2, r3)
            r0 = 2
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2AK.APE(android.view.Menu):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        r2.A00(new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0(r9, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e4, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AUD(android.view.MenuItem r10) {
        /*
            r9 = this;
            X.0vb r1 = r9.A0C
            r0 = 6
            r1.A01 = r0
            int r1 = r10.getItemId()
            r0 = 12
            r5 = 1
            if (r1 == r0) goto L_0x0133
            r0 = 14
            if (r1 == r0) goto L_0x0108
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r1 == r0) goto L_0x0102
            r2 = 0
            switch(r1) {
                case 2: goto L_0x0165;
                case 3: goto L_0x001c;
                case 4: goto L_0x005e;
                case 5: goto L_0x007e;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00c3;
                case 8: goto L_0x00c9;
                case 9: goto L_0x00d4;
                case 10: goto L_0x00e5;
                default: goto L_0x001b;
            }
        L_0x001b:
            return r2
        L_0x001c:
            X.12W r0 = r9.A0L
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "conversation/email-attachment/need-sd-card"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0pS r2 = r9.A02
            boolean r1 = X.C14730pf.A00()
            r0 = 2131889601(0x7f120dc1, float:1.941387E38)
            if (r1 == 0) goto L_0x0037
            r0 = 2131889600(0x7f120dc0, float:1.9413868E38)
        L_0x0037:
            r2.Afg(r0)
            return r5
        L_0x003b:
            X.1M1 r8 = r9.A0I
            X.00k r7 = r9.A01
            X.0pS r6 = r9.A02
            X.0rv r4 = r9.A0Y
            X.0sH r3 = r9.A00
            X.0t8 r2 = r8.A04
            r1 = 0
            r0 = 2
            java.util.ArrayList r0 = r2.A0B(r1, r4, r5, r0)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0059
            r0 = 10
            X.AnonymousClass29T.A01(r7, r0)
            return r5
        L_0x0059:
            r0 = 0
            r8.A01(r7, r6, r3, r0)
            return r5
        L_0x005e:
            X.0rv r4 = r9.A0Y
            X.0rt r1 = r9.A0P
            X.0rz r0 = r9.A0M
            boolean r0 = X.C222417e.A01(r0, r1, r4)
            if (r0 == 0) goto L_0x010d
            X.00k r3 = r9.A01
            X.0tb r2 = r9.A06
            r0 = 2131363738(0x7f0a079a, float:1.8347293E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C222417e.A00(r3, r1, r2, r4, r0)
            return r5
        L_0x007e:
            java.lang.String r0 = "conversation/menu/wallpaper/"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00k r4 = r9.A01
            X.0rv r3 = r9.A0Y
            if (r3 == 0) goto L_0x00ab
            boolean r0 = X.C434920f.A09(r4)
            if (r0 != 0) goto L_0x00ab
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity"
        L_0x009a:
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r1 = X.C16030sJ.A03(r3)
            java.lang.String r0 = "chat_jid"
            r2.putExtra(r0, r1)
            r4.startActivity(r2)
            return r5
        L_0x00ab:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity"
            goto L_0x009a
        L_0x00b7:
            X.00k r1 = r9.A01
            X.0rv r0 = r9.A0Y
            android.content.Intent r0 = X.C14750ph.A0G(r1, r0)
            r1.startActivity(r0)
            return r5
        L_0x00c3:
            X.00k r0 = r9.A01
            r0.onSearchRequested()
            return r5
        L_0x00c9:
            X.1Kw r1 = r9.A0c
            X.00k r0 = r9.A01
            X.1WD r2 = r1.A07(r0)
            r1 = 8
            goto L_0x00dc
        L_0x00d4:
            X.0yO r0 = r9.A0S
            X.1WD r2 = r0.A04()
            r1 = 9
        L_0x00dc:
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0
            r0.<init>(r9, r1)
            r2.A00(r0)
            return r5
        L_0x00e5:
            X.0pt r1 = r9.A03
            java.lang.String r0 = "Export chat for internal testing"
            r1.A0I(r0, r2)
            X.0zm r0 = r9.A0K
            X.00k r4 = r9.A01
            X.0rv r3 = r9.A0Y
            X.0sq r2 = r0.A01
            X.1LC r0 = r0.A00
            X.3pI r1 = new X.3pI
            r1.<init>(r4, r3, r0)
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r2.Ack(r1, r0)
            return r5
        L_0x0102:
            X.00k r0 = r9.A01
            r0.finish()
            return r5
        L_0x0108:
            X.0sq r2 = r9.A0d
            r1 = 21
            goto L_0x0119
        L_0x010d:
            X.0sf r0 = r9.A0Z
            boolean r0 = r0.A0Q(r4)
            if (r0 == 0) goto L_0x0122
            X.0sq r2 = r9.A0d
            r1 = 23
        L_0x0119:
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6
            r0.<init>(r9, r1)
            r2.Acl(r0)
            return r5
        L_0x0122:
            r0 = 3
            com.obwhatsapp.MuteDialogFragment r2 = com.obwhatsapp.MuteDialogFragment.A01(r4, r0)
            X.00k r0 = r9.A01
            X.02C r1 = r0.AGM()
            java.lang.String r0 = "MuteDialogFragment"
            r2.A1G(r1, r0)
            return r5
        L_0x0133:
            X.0sq r2 = r9.A0d
            r1 = 22
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6
            r0.<init>(r9, r1)
            r2.Acl(r0)
            X.0rv r4 = r9.A0Y
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x016c
            r3 = r4
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.0zl r2 = r9.A0U
            X.0uP r1 = r9.A0F
            X.2a9 r0 = r9.A0H
            boolean r0 = X.AnonymousClass2BX.A02(r1, r0, r2, r3)
            if (r0 == 0) goto L_0x016c
            X.00k r2 = r9.A01
            X.0rt r0 = r9.A0P
            int r1 = r0.A01(r3)
            r0 = 3
            android.content.Intent r0 = X.C14750ph.A0J(r2, r4, r1, r0)
            r2.startActivity(r0)
            return r5
        L_0x0165:
            X.0yv r1 = r9.A07
            X.0sH r0 = r9.A00
            r1.A04(r0)
        L_0x016c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2AK.AUD(android.view.MenuItem):boolean");
    }

    public boolean AVB(Menu menu) {
        boolean z2 = false;
        if (((Conversation) this.A0G).A00.A1n.getConversationCursorAdapter().getCount() > 0) {
            z2 = true;
        }
        menu.findItem(8).setVisible(z2);
        menu.findItem(7).setVisible(z2);
        MenuItem findItem = menu.findItem(3);
        if (findItem != null) {
            findItem.setVisible(z2);
        }
        MenuItem findItem2 = menu.findItem(9);
        if (findItem2 != null) {
            findItem2.setVisible(true);
        }
        MenuItem findItem3 = menu.findItem(1);
        SubMenu subMenu = findItem3.getSubMenu();
        MenuItem findItem4 = subMenu.findItem(10);
        if (findItem4 != null) {
            findItem4.setVisible(z2);
        }
        findItem3.setVisible(subMenu.hasVisibleItems());
        return true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A0E.A02(this.A0D);
        this.A0B.A02(this.A0A);
        this.A0W.A02(this.A0V);
    }

    public void onActivityDestroyed(Activity activity) {
        this.A0E.A03(this.A0D);
        this.A0B.A03(this.A0A);
        this.A0W.A03(this.A0V);
    }
}
