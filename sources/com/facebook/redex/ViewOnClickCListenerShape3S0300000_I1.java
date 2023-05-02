package com.facebook.redex;

import X.C14930q1;
import X.C14990q7;
import X.C31201dg;
import android.view.View;

public class ViewOnClickCListenerShape3S0300000_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickCListenerShape3S0300000_I1(C14990q7 r1, C31201dg r2, C14930q1 r3, int i2) {
        this.A03 = i2;
        if (i2 != 0) {
            this.A00 = r2;
            this.A01 = r3;
            this.A02 = r1;
            return;
        }
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public ViewOnClickCListenerShape3S0300000_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x035d, code lost:
        X.C14940q2.A00(r1, r4, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0360, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x039e, code lost:
        X.C13690nt.A0u(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03e3, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02da, code lost:
        r3.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02dd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r17) {
        /*
            r16 = this;
            r4 = r17
            r6 = r16
            int r0 = r6.A03
            switch(r0) {
                case 0: goto L_0x0344;
                case 1: goto L_0x0321;
                case 2: goto L_0x0157;
                case 3: goto L_0x03a2;
                case 4: goto L_0x0122;
                case 5: goto L_0x030b;
                case 6: goto L_0x02de;
                case 7: goto L_0x02b5;
                case 8: goto L_0x028f;
                case 9: goto L_0x026b;
                case 10: goto L_0x0238;
                case 11: goto L_0x021e;
                case 12: goto L_0x020f;
                case 13: goto L_0x0377;
                case 14: goto L_0x00a8;
                case 15: goto L_0x0030;
                case 16: goto L_0x01f8;
                case 17: goto L_0x01a7;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r6.A00
            X.2r8 r0 = (X.C57412r8) r0
            java.lang.Object r1 = r6.A01
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Object r3 = r6.A02
            X.4I2 r3 = (X.AnonymousClass4I2) r3
            android.content.Context r0 = r0.A02
            android.app.Activity r2 = X.C19980zJ.A00(r0)
            X.0pN r2 = (X.C14550pN) r2
            com.whatsapp.jid.Jid r1 = X.C16010sH.A03(r1)
            X.AnonymousClass00B.A06(r1)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1bh r0 = r3.A01
            com.obwhatsapp.invites.RevokeInviteDialogFragment r0 = com.obwhatsapp.invites.RevokeInviteDialogFragment.A01(r1, r0)
            r2.Afc(r0)
        L_0x002f:
            return
        L_0x0030:
            java.lang.Object r2 = r6.A00
            X.31E r2 = (X.AnonymousClass31E) r2
            java.lang.Object r4 = r6.A01
            X.0tZ r4 = (X.C16740tZ) r4
            java.lang.Object r5 = r6.A02
            X.19r r5 = (X.C228919r) r5
            X.0sK r1 = r2.A0L
            X.1Vt r0 = r4.A0L
            com.whatsapp.jid.UserJid r0 = r0.A0D
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x0361
            X.0sK r1 = r2.A0L
            X.1Vt r0 = r4.A0L
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x0361
            X.1MB r3 = r2.A0A
            X.1Vt r0 = r4.A0L
            java.lang.String r1 = r0.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002f
            java.util.HashSet r0 = r3.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002f
            X.1MB r3 = r2.A0A
            X.1Vt r5 = r4.A0L
            if (r5 == 0) goto L_0x009e
            java.lang.String r0 = r5.A0K
            if (r0 == 0) goto L_0x009e
            int r1 = r5.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x009e
            X.0sK r1 = r3.A04
            com.whatsapp.jid.UserJid r0 = r5.A0D
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x009e
            X.1Vt r0 = r4.A0L
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x009e
            java.util.HashSet r1 = r3.A00
            X.1Vt r0 = r4.A0L
            java.lang.String r0 = r0.A0K
            r1.remove(r0)
            X.1Vt r0 = r4.A0L
            java.lang.String r1 = r0.A0K
            X.1Vw r0 = r4.A11
            r3.A03(r0, r1)
        L_0x009e:
            android.view.View r1 = r2.A0E
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r2.A0F
            goto L_0x03e3
        L_0x00a8:
            java.lang.Object r4 = r6.A00
            X.31E r4 = (X.AnonymousClass31E) r4
            java.lang.Object r5 = r6.A01
            X.0tZ r5 = (X.C16740tZ) r5
            java.lang.Object r8 = r6.A02
            X.19r r8 = (X.C228919r) r8
            X.1Vt r0 = r5.A0L
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x011f
            X.1Vt r0 = r5.A0L
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x011f
            X.0wS r0 = r4.A1K
            r0.A06()
            X.16r r1 = r0.A08
            X.1Vw r3 = r5.A11
            java.lang.String r0 = r3.A01
            X.1Vt r7 = r1.A0K(r0)
            if (r7 == 0) goto L_0x00f9
            X.1Vt r6 = r5.A0L
            int r1 = r6.A02
            r0 = 18
            if (r1 == r0) goto L_0x00f9
            X.0rv r2 = r7.A0C
            boolean r1 = r7.A0Q
            java.lang.String r0 = r7.A0L
            X.1Vw r3 = new X.1Vw
            r3.<init>(r2, r0, r1)
            X.1lo r0 = r6.A01()
            if (r0 == 0) goto L_0x00f9
            X.12h r1 = r4.A09
            X.1Vt r0 = r5.A0L
            X.1lo r0 = r0.A01()
            r1.A02(r0)
        L_0x00f9:
            if (r8 == 0) goto L_0x002f
            java.lang.Class r1 = r8.AEv()
            if (r1 == 0) goto L_0x002f
            android.content.Context r0 = r4.getContext()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0, r1)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "chat"
            r2.putExtra(r1, r0)
            X.1Vt r0 = r5.A0L
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = "extra_transaction_id"
            r2.putExtra(r0, r1)
            X.AnonymousClass1yL.A00(r2, r3)
            goto L_0x039e
        L_0x011f:
            X.1Vw r3 = r5.A11
            goto L_0x00f9
        L_0x0122:
            java.lang.Object r1 = r6.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            java.lang.Object r7 = r6.A01
            X.1dg r7 = (X.C31201dg) r7
            java.lang.Object r5 = r6.A02
            X.0q7 r5 = (X.C14990q7) r5
            boolean r0 = r1.isChecked()
            r4 = r0 ^ 1
            r1.setChecked(r4)
            r0 = 40
            X.0q1 r3 = r7.A0H(r0)
            if (r3 == 0) goto L_0x002f
            X.22A r0 = r5.A02
            X.4CE r0 = r0.A01
            X.C90154da.A01(r0)
            X.0q2 r2 = new X.0q2
            r2.<init>()
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A03(r0, r1)
            X.C14940q2.A00(r5, r7, r2, r3)
            return
        L_0x0157:
            java.lang.Object r5 = r6.A00
            X.3BH r5 = (X.AnonymousClass3BH) r5
            java.lang.Object r3 = r6.A01
            X.0u3 r3 = (X.C17020u3) r3
            java.lang.Object r7 = r6.A02
            X.0rz r7 = (X.C15860rz) r7
            X.2pY r0 = r5.A04
            if (r0 == 0) goto L_0x016e
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x016e
            return
        L_0x016e:
            X.2pZ r0 = r5.A03
            if (r0 == 0) goto L_0x0179
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0179
            return
        L_0x0179:
            X.2nu r4 = (X.C56562nu) r4
            int[] r6 = r4.A07
            if (r6 == 0) goto L_0x002f
            boolean r0 = X.C62153Bw.A02(r6)
            if (r0 == 0) goto L_0x03ee
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r7 = r3.A00(r0)
            int[] r2 = X.C62153Bw.A07(r6)
            java.lang.String r0 = "multi_skin_"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.C37781pj.A00(r2)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x03e9
            r5.A01(r4)
            return
        L_0x01a7:
            java.lang.Object r7 = r6.A00
            X.2rb r7 = (X.C57692rb) r7
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            java.lang.Object r6 = r6.A02
            X.4Kj r6 = (X.C84394Kj) r6
            X.0rt r0 = r7.A0A
            boolean r0 = r0.A0F(r2)
            r8 = 0
            r5 = 2
            if (r0 == 0) goto L_0x01e0
            X.0sO r0 = r7.A0B
            boolean r0 = r0.A09(r2)
            if (r0 == 0) goto L_0x01e0
            r5 = 1
            X.0ph r0 = new X.0ph
            r0.<init>()
            android.content.Context r1 = r7.A05
            android.content.Intent r0 = X.C14750ph.A0Q(r1, r2)
            r1.startActivity(r0, r8)
        L_0x01d4:
            X.0sq r2 = r7.A0D
            r1 = 7
            com.facebook.redex.RunnableRunnableShape1S0201000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0201000_I1
            r0.<init>(r6, r5, r7, r1)
            r2.Acl(r0)
            return
        L_0x01e0:
            android.content.Context r4 = r7.A05
            X.0pN r4 = (X.C14550pN) r4
            com.whatsapp.jid.GroupJid r3 = r6.A01
            X.1sW r0 = r6.A00
            com.whatsapp.jid.GroupJid r2 = r0.A02
            int r1 = r0.A00
            r0 = 3
            if (r1 != r5) goto L_0x01f0
            r0 = 2
        L_0x01f0:
            com.obwhatsapp.community.JoinGroupBottomSheetFragment r0 = com.obwhatsapp.community.JoinGroupBottomSheetFragment.A01(r3, r2, r0)
            r4.Afb(r0, r8)
            goto L_0x01d4
        L_0x01f8:
            java.lang.Object r2 = r6.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r6.A01
            X.0uj r1 = (X.C17220uj) r1
            java.lang.Object r3 = r6.A02
            android.app.Dialog r3 = (android.app.Dialog) r3
            java.lang.String r0 = "about-disappearing-messages"
            android.content.Intent r0 = X.C17220uj.A00(r1, r0)
            r2.startActivity(r0)
            goto L_0x02da
        L_0x020f:
            java.lang.Object r0 = r6.A00
            android.view.View r0 = (android.view.View) r0
            r0.getContext()
            android.content.Context r0 = r0.getContext()
            X.AnonymousClass22O.A01(r0)
            return
        L_0x021e:
            java.lang.Object r1 = r6.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r3 = r6.A01
            X.19r r3 = (X.C228919r) r3
            java.lang.Object r0 = r6.A02
            X.0tZ r0 = (X.C16740tZ) r0
            android.content.Context r2 = r1.getContext()
            X.1yP r1 = X.AnonymousClass22O.A02(r1)
            X.1Vt r0 = r0.A0L
            r3.ALy(r2, r1, r0)
            return
        L_0x0238:
            java.lang.Object r0 = r6.A00
            X.0wP r0 = (X.C18260wP) r0
            java.lang.Object r1 = r6.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r2 = r6.A02
            X.0pt r2 = (X.C14870pt) r2
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0263
            android.content.Context r3 = r1.getContext()
            android.content.Context r0 = r4.getContext()
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.calling.calllink.view.CallLinkActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0263:
            r1 = 2131886931(0x7f120353, float:1.9408455E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x026b:
            java.lang.Object r4 = r6.A00
            X.2rI r4 = (X.C57512rI) r4
            java.lang.Object r1 = r6.A01
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Object r0 = r6.A02
            X.3SV r0 = (X.AnonymousClass3SV) r0
            r3 = 0
            X.0rv r2 = X.C16010sH.A02(r1)
            android.widget.ImageView r0 = r0.A02
            X.3AW r1 = new X.3AW
            r1.<init>((android.view.View) r0, (X.C15830rv) r2, (java.lang.Integer) r3)
            java.lang.String r0 = X.C004601z.A0L(r0)
            r1.A04 = r0
            com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity r0 = r4.A01
            r1.A02(r0)
            return
        L_0x028f:
            java.lang.Object r4 = r6.A00
            X.3mI r4 = (X.C72533mI) r4
            java.lang.Object r3 = r6.A01
            X.4TQ r3 = (X.AnonymousClass4TQ) r3
            java.lang.Object r2 = r6.A02
            androidx.appcompat.widget.AppCompatCheckBox r1 = r4.A00
            boolean r0 = r1.isChecked()
            r3.A00 = r0
            boolean r1 = r1.isChecked()
            com.obwhatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = r4.A01
            X.2qV r0 = r0.A03
            java.util.Set r0 = r0.A03
            if (r1 == 0) goto L_0x02b1
            r0.add(r2)
            return
        L_0x02b1:
            r0.remove(r2)
            return
        L_0x02b5:
            java.lang.Object r1 = r6.A00
            X.2R7 r1 = (X.AnonymousClass2R7) r1
            java.lang.Object r0 = r6.A01
            X.4DM r0 = (X.AnonymousClass4DM) r0
            java.lang.Object r3 = r6.A02
            android.app.Dialog r3 = (android.app.Dialog) r3
            com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = r0.A00
            r0.A39()
            r2 = 1
            r1.A0D = r2
            X.1Kb r0 = r1.A0J
            X.1I2 r0 = r0.A02
            android.content.SharedPreferences r0 = r0.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "DIRECTORY_LOCATION_INFO_ACCEPTED"
            X.C13680ns.A0z(r1, r0, r2)
        L_0x02da:
            r3.dismiss()
            return
        L_0x02de:
            java.lang.Object r7 = r6.A00
            X.39h r7 = (X.C615339h) r7
            java.lang.Object r5 = r6.A01
            X.3ln r5 = (X.C72243ln) r5
            java.lang.Object r4 = r6.A02
            android.view.View r4 = (android.view.View) r4
            X.1US r0 = r5.A08
            X.5P4 r3 = r5.A06
            X.5T6 r2 = r5.A07
            X.0z7 r1 = r7.A0H
            java.lang.String r0 = r0.A0B
            r1.A02(r4, r3, r2, r0)
            X.5Rh r2 = r5.A05
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0309
            java.lang.Integer r1 = X.C13680ns.A0X()
        L_0x0301:
            java.lang.Integer r0 = r7.A00(r5)
            r2.AVI(r1, r0)
            return
        L_0x0309:
            r1 = 0
            goto L_0x0301
        L_0x030b:
            java.lang.Object r4 = r6.A00
            X.1dg r4 = (X.C31201dg) r4
            java.lang.Object r3 = r6.A01
            X.0q1 r3 = (X.C14930q1) r3
            java.lang.Object r1 = r6.A02
            X.0q7 r1 = (X.C14990q7) r1
            X.0q2 r2 = new X.0q2
            r2.<init>()
            r0 = 0
            r2.A03(r4, r0)
            goto L_0x035d
        L_0x0321:
            java.lang.Object r4 = r6.A00
            X.3BH r4 = (X.AnonymousClass3BH) r4
            java.lang.Object r0 = r6.A01
            X.013 r0 = (X.AnonymousClass013) r0
            java.lang.Object r3 = r6.A02
            X.4bP r3 = (X.C88984bP) r3
            boolean r0 = X.C13680ns.A1Z(r0)
            r2 = 1
            if (r0 == 0) goto L_0x033c
            int r1 = r3.A02
        L_0x0336:
            androidx.viewpager.widget.ViewPager r0 = r4.A0K
            r0.A0F(r1, r2)
            return
        L_0x033c:
            X.2oM[] r0 = r4.A0R
            int r1 = r0.length
            int r1 = r1 - r2
            int r0 = r3.A02
            int r1 = r1 - r0
            goto L_0x0336
        L_0x0344:
            java.lang.Object r4 = r6.A01
            X.1dg r4 = (X.C31201dg) r4
            java.lang.Object r3 = r6.A02
            X.0q1 r3 = (X.C14930q1) r3
            X.0q2 r2 = new X.0q2
            r2.<init>()
            r0 = 0
            r2.A03(r4, r0)
            java.lang.Object r1 = r6.A00
            X.0q7 r1 = (X.C14990q7) r1
            r0 = 1
            r2.A03(r1, r0)
        L_0x035d:
            X.C14940q2.A00(r1, r4, r2, r3)
            return
        L_0x0361:
            android.content.Context r3 = r2.getContext()
            java.lang.Class r0 = r5.AEv()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r0)
            X.1Vw r0 = r4.A11
            X.AnonymousClass1yL.A00(r1, r0)
            X.C13690nt.A0u(r1, r2)
            return
        L_0x0377:
            java.lang.Object r4 = r6.A00
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r0 = r6.A01
            X.19r r0 = (X.C228919r) r0
            java.lang.Object r3 = r6.A02
            X.0tZ r3 = (X.C16740tZ) r3
            android.content.Context r1 = r4.getContext()
            java.lang.Class r0 = r0.AEv()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r1, r0)
            X.1Vt r0 = r3.A0L
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = "extra_transaction_id"
            r2.putExtra(r0, r1)
            X.1Vw r0 = r3.A11
            X.AnonymousClass1yL.A00(r2, r0)
        L_0x039e:
            X.C13690nt.A0u(r2, r4)
            return
        L_0x03a2:
            java.lang.Object r4 = r6.A00
            X.3BH r4 = (X.AnonymousClass3BH) r4
            java.lang.Object r2 = r6.A01
            int[] r2 = (int[]) r2
            java.lang.Object r5 = r6.A02
            X.2nu r5 = (X.C56562nu) r5
            r4.A02(r2)
            X.0u3 r0 = r4.A0P
            X.C61953Bb.A02(r0, r2)
            r5.setEmoji(r2)
            X.20a r1 = new X.20a
            r1.<init>(r2)
            r0 = 0
            long r10 = com.obwhatsapp.emoji.EmojiDescriptor.A00(r1, r0)
            X.0um r6 = r4.A0O
            android.content.Context r0 = r4.A09
            android.content.res.Resources r7 = r0.getResources()
            X.20a r8 = new X.20a
            r8.<init>(r2)
            r9 = 1061158912(0x3f400000, float:0.75)
            android.graphics.drawable.Drawable r3 = r6.A04(r7, r8, r9, r10)
            long r1 = r5.A01
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x03e1
            r5.A03 = r3
            r5.invalidate()
        L_0x03e1:
            android.view.View r1 = r4.A0D
        L_0x03e3:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x03e9:
            X.C61953Bb.A01(r3, r6)
            goto L_0x04ae
        L_0x03ee:
            boolean r0 = X.C62153Bw.A03(r6)
            if (r0 == 0) goto L_0x04ae
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r7)
            java.lang.String r2 = "skin_emoji_tip"
            int r1 = X.C13690nt.A01(r0, r2)
            r0 = 1
            if (r1 >= r0) goto L_0x0484
            int r0 = r1 + 1
            X.C13680ns.A1S(r7, r2, r0)
            int[] r9 = r4.A07
            android.view.View r8 = r5.A0D
            r0 = 2131362021(0x7f0a00e5, float:1.834381E38)
            android.view.ViewGroup r14 = X.C13690nt.A0K(r8, r0)
            r14.removeAllViews()
            android.content.Context r10 = r5.A09
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166043(0x7f07035b, float:1.794632E38)
            int r13 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166041(0x7f070359, float:1.7946316E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = r13 - r0
            int r12 = r0 >> 1
            int[][] r11 = X.C62153Bw.A0A(r9)
            int r7 = r11.length
            r6 = 0
            r3 = 0
        L_0x0438:
            if (r3 >= r7) goto L_0x0468
            r2 = r11[r3]
            android.content.Context r0 = r8.getContext()
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r0)
            r1.setPadding(r12, r12, r12, r12)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r13, r13)
            r1.setLayoutParams(r0)
            X.0um r15 = r5.A0O
            android.content.res.Resources r0 = r10.getResources()
            X.C17250um.A00(r0, r1, r15, r2)
            r0 = 3
            X.C13690nt.A1B(r1, r5, r2, r4, r0)
            r14.addView(r1)
            int r3 = r3 + 1
            goto L_0x0438
        L_0x0468:
            r0 = 2131365874(0x7f0a0ff2, float:1.8351626E38)
            android.widget.ImageView r2 = X.C13680ns.A0K(r8, r0)
            r2.setPadding(r12, r12, r12, r12)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.setScaleType(r0)
            X.0um r1 = r5.A0O
            android.content.res.Resources r0 = r10.getResources()
            X.C17250um.A00(r0, r2, r1, r9)
            r8.setVisibility(r6)
            return
        L_0x0484:
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r3.A00(r0)
            java.lang.String r0 = X.C61953Bb.A00(r6)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x04ab
            r0 = 0
            com.facebook.redex.IDxSListenerShape99S0200000_2_I1 r3 = new com.facebook.redex.IDxSListenerShape99S0200000_2_I1
            r3.<init>(r4, r5, r0)
            X.0um r2 = r5.A0O
            int[] r0 = r4.A07
            X.2pY r1 = new X.2pY
            r1.<init>(r4, r3, r2, r0)
            r5.A04 = r1
            android.view.View r0 = r5.A0E
            X.C37941pz.A01(r4, r0, r1)
            return
        L_0x04ab:
            X.C61953Bb.A02(r3, r6)
        L_0x04ae:
            r5.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1.onClick(android.view.View):void");
    }
}
