package com.facebook.redex;

import android.view.View;

public class ViewOnClickCListenerShape3S0400000_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public ViewOnClickCListenerShape3S0400000_I1(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0211, code lost:
        if (r2.A0L(r7) == false) goto L_0x0213;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A04
            switch(r0) {
                case 0: goto L_0x01c5;
                case 1: goto L_0x0149;
                case 2: goto L_0x019f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r10.A00
            com.obwhatsapp.conversation.conversationrow.TemplateRowContentLayout r3 = (com.obwhatsapp.conversation.conversationrow.TemplateRowContentLayout) r3
            java.lang.Object r9 = r10.A01
            X.1sy r9 = (X.C39731sy) r9
            java.lang.Object r7 = r10.A02
            X.4E0 r7 = (X.AnonymousClass4E0) r7
            java.lang.Object r5 = r10.A03
            X.0tZ r5 = (X.C16740tZ) r5
            int r1 = r9.A03
            r2 = 1
            if (r1 == r2) goto L_0x0199
            r6 = 2
            if (r1 == r6) goto L_0x003f
            r0 = 3
            if (r1 != r0) goto L_0x003e
            java.lang.String r0 = "tel:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r9.A05
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L_0x0031:
            android.content.Intent r4 = X.C13690nt.A0B(r0)
        L_0x0035:
            X.0zJ r1 = r3.A01
            android.content.Context r0 = r3.getContext()
            r1.A06(r0, r4)
        L_0x003e:
            return
        L_0x003f:
            X.17V r0 = r3.A05
            boolean r0 = r0.A07(r9)
            if (r0 == 0) goto L_0x0068
            X.1bb r0 = r3.A04
            X.0tZ r4 = r0.getFMessage()
            X.1cb r4 = (X.C30571cb) r4
            X.17V r1 = r3.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A06(r4, r0)
        L_0x0058:
            X.1bb r0 = r3.A04
            X.1yP r0 = X.AnonymousClass22O.A02(r0)
            if (r0 == 0) goto L_0x003e
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            X.1yj r0 = r0.A00
            r0.A0O()
            return
        L_0x0068:
            X.17V r0 = r3.A05
            boolean r0 = r0.A08(r9)
            if (r0 == 0) goto L_0x0086
            X.1bb r0 = r3.A04
            X.0tZ r4 = r0.getFMessage()
            X.1cb r4 = (X.C30571cb) r4
            X.17V r2 = r3.A05
            android.content.Context r1 = r3.getContext()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.A04(r1, r4, r0)
            goto L_0x0058
        L_0x0086:
            java.lang.String r4 = r9.A05
            X.1bb r8 = r7.A00
            X.0pN r7 = X.AnonymousClass22N.A02(r8)
            if (r7 == 0) goto L_0x00b0
            X.1Mg r1 = r8.A12
            X.0tZ r0 = r8.getFMessage()
            com.whatsapp.jid.UserJid r0 = r0.A0C()
            java.util.Set r1 = r1.A01(r0, r4)
            if (r1 == 0) goto L_0x00b5
            X.0tZ r0 = r8.getFMessage()
            X.1Vw r0 = r0.A11
            java.lang.String r0 = r0.A01
            com.obwhatsapp.SuspiciousLinkWarningDialogFragment r0 = com.obwhatsapp.SuspiciousLinkWarningDialogFragment.A01(r4, r0, r1)
            r7.Afc(r0)
            return
        L_0x00b0:
            java.lang.String r0 = "ConversationRow/needHandleSuspiciousUrl/error: not click in Conversation"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00b5:
            X.0pd r0 = r3.A07
            boolean r0 = X.C40571uL.A02(r0, r9)
            if (r0 == 0) goto L_0x00c9
            android.content.Context r1 = r3.getContext()
            java.lang.String r0 = "research-survey"
            android.content.Intent r4 = X.C14750ph.A0k(r1, r4, r0, r2, r2)
            goto L_0x0035
        L_0x00c9:
            r7 = 0
            X.0w2 r1 = r3.A06     // Catch:{ Exception -> 0x00d8 }
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00d8 }
            int r0 = r1.A08(r0)     // Catch:{ Exception -> 0x00d8 }
            if (r0 == r2) goto L_0x00eb
            r7 = 1
            goto L_0x00eb
        L_0x00d8:
            r2 = move-exception
            java.lang.String r0 = "TemplateRowContentLayout/isDeepLinkUri/<"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r4)
            java.lang.String r0 = "> is not a valid URL. Error="
            java.lang.String r0 = X.AnonymousClass000.A0e(r2, r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00eb:
            X.0zl r2 = r3.A08
            if (r7 == 0) goto L_0x0115
            X.0t9 r1 = r3.A09
            r0 = 4
            X.C42601y5.A02(r2, r1, r5, r0)
            android.content.Context r0 = r3.getContext()
            android.net.Uri r2 = android.net.Uri.parse(r4)
            android.content.Intent r4 = X.C13680ns.A09()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.deeplink.DeepLinkActivity"
            r4.setClassName(r1, r0)
            r4.setData(r2)
            java.lang.String r0 = "source"
            r4.putExtra(r0, r6)
            goto L_0x0035
        L_0x0115:
            if (r5 == 0) goto L_0x012f
            X.1Vw r0 = r5.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C40561uK.A01(r2, r0)
            if (r0 == 0) goto L_0x012f
            X.0zl r2 = r3.A08
            X.0t9 r1 = r3.A09
            r0 = 4
            X.C42601y5.A02(r2, r1, r5, r0)
        L_0x0129:
            android.net.Uri r0 = android.net.Uri.parse(r4)
            goto L_0x0031
        L_0x012f:
            X.0pd r2 = r3.A07
            r1 = 2994(0xbb2, float:4.195E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x0129
            X.1N6 r2 = r3.A0A
            android.content.Context r1 = r3.getContext()
            android.net.Uri r0 = android.net.Uri.parse(r4)
            r2.A01(r1, r0)
            return
        L_0x0149:
            java.lang.Object r4 = r10.A00
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r10.A01
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r10.A02
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.Object r1 = r10.A03
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r1 = (com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r1
            r0 = 8
            r4.setVisibility(r0)
            r0 = 4
            r3.setVisibility(r0)
            r4 = 1
            r2.setIndeterminate(r4)
            X.1KN r3 = r1.A0Q
            X.0yo r2 = r3.A04
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A0Z
            boolean r0 = r1.get()
            if (r0 != 0) goto L_0x003e
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0a
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x003e
            r1.set(r4)
            android.os.ConditionVariable r0 = r2.A0G
            r0.open()
            X.0sq r2 = r3.A0C
            r1 = 3
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r3, r1)
            r2.Acl(r0)
            X.12Q r0 = r3.A05
            r0.A03()
            X.0rz r1 = r3.A08
            r0 = 0
            r1.A0j(r0)
            return
        L_0x0199:
            java.lang.String r0 = "TemplateRowContentLayout/fillButton/the button is in wrong type."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x019f:
            java.lang.Object r0 = r10.A00
            X.39f r0 = (X.C615139f) r0
            java.lang.Object r1 = r10.A01
            X.1xL r1 = (X.C42171xL) r1
            java.lang.Object r4 = r10.A02
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r3 = r10.A03
            X.0tZ r3 = (X.C16740tZ) r3
            android.content.Context r0 = r0.A03
            android.app.Activity r2 = X.C19980zJ.A00(r0)
            X.0pN r2 = (X.C14550pN) r2
            java.lang.String r1 = r1.A03
            X.1Vw r0 = r3.A11
            java.lang.String r0 = r0.A01
            com.obwhatsapp.SuspiciousLinkWarningDialogFragment r0 = com.obwhatsapp.SuspiciousLinkWarningDialogFragment.A01(r1, r0, r4)
            r2.Afc(r0)
            return
        L_0x01c5:
            java.lang.Object r6 = r10.A00
            X.39l r6 = (X.C615739l) r6
            java.lang.Object r7 = r10.A01
            X.1rH r7 = (X.C38701rH) r7
            java.lang.Object r5 = r10.A02
            X.38M r5 = (X.AnonymousClass38M) r5
            java.lang.Object r4 = r10.A03
            X.0pN r4 = (X.C14550pN) r4
            boolean r0 = r7.A18()
            if (r0 != 0) goto L_0x01e3
            com.obwhatsapp.audiopicker.AudioPickerActivity r0 = r6.A0C
            X.1PD r0 = r0.A0J
            r0.A01(r4)
            return
        L_0x01e3:
            com.obwhatsapp.audiopicker.AudioPickerActivity r3 = r6.A0C
            boolean r0 = X.C14550pN.A1Q(r3)
            if (r0 == 0) goto L_0x01fa
            X.0yi r0 = r3.A0G
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x01fa
            X.0yi r1 = r3.A0G
            X.01D r0 = r3.A0K
            X.AnonymousClass2DE.A0A(r1, r0)
        L_0x01fa:
            X.0yi r0 = r3.A0G
            X.2DT r2 = r0.A00()
            if (r2 == 0) goto L_0x0213
            boolean r0 = r2.A0L(r7)
            if (r0 != 0) goto L_0x020d
            r1 = 1
            r0 = 0
            r2.A0I(r1, r0)
        L_0x020d:
            boolean r0 = r2.A0L(r7)
            if (r0 != 0) goto L_0x0224
        L_0x0213:
            X.1B5 r1 = r3.A0F
            r0 = 0
            X.2DT r2 = r1.A01(r4, r0, r0)
            r2.A0O = r7
            X.0yi r0 = r3.A0G
            r0.A08(r2)
            r6.A03(r4, r5)
        L_0x0224:
            r0 = 0
            r2.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape3S0400000_I1.onClick(android.view.View):void");
    }
}
