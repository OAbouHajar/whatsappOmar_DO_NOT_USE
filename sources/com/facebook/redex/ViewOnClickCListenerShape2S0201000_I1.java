package com.facebook.redex;

import android.view.View;

public class ViewOnClickCListenerShape2S0201000_I1 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickCListenerShape2S0201000_I1(Object obj, int i2, Object obj2, int i3) {
        this.A03 = i3;
        this.A01 = obj;
        this.A00 = i2;
        this.A02 = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A03
            switch(r0) {
                case 0: goto L_0x0138;
                case 1: goto L_0x007e;
                case 2: goto L_0x0018;
                case 3: goto L_0x016d;
                case 4: goto L_0x0158;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r12.A01
            X.34m r4 = (X.C606234m) r4
            java.lang.Object r3 = r12.A02
            X.34i r3 = (X.C605834i) r3
            int r2 = r12.A00
            X.4Io r1 = r4.A02
            r0 = 0
            r1.A00 = r0
            r4.A0H(r3, r2)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r4 = r12.A01
            X.2oS r4 = (X.C56752oS) r4
            java.lang.Object r5 = r12.A02
            android.view.View r5 = (android.view.View) r5
            int r3 = r12.A00
            java.lang.Object r1 = r5.getTag()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            com.whatsapp.jid.UserJid r6 = r4.A00
            boolean r0 = r1.equals(r6)
            r2 = 0
            if (r0 != 0) goto L_0x007b
            r4.A00 = r1
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = r4.A02
            java.util.ArrayList r0 = r0.A0b
            java.lang.Object r0 = r0.get(r3)
            X.2Aj r0 = (X.AnonymousClass2Aj) r0
            int r1 = r0.A00()
            r0 = 5
            if (r1 == r0) goto L_0x007b
            r0 = 1
            r4.A02(r5, r3, r0)
        L_0x0048:
            if (r6 == 0) goto L_0x0017
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = r4.A02
            android.widget.ListView r0 = r1.A02
            android.view.View r5 = r0.findViewWithTag(r6)
            java.util.ArrayList r3 = r1.A0b
            java.util.Iterator r2 = r3.iterator()
        L_0x0058:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r1 = r2.next()
            X.2Aj r1 = (X.AnonymousClass2Aj) r1
            com.whatsapp.jid.UserJid r0 = r1.A01
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0058
        L_0x006c:
            if (r5 == 0) goto L_0x0017
            if (r1 == 0) goto L_0x0017
            int r1 = r3.indexOf(r1)
            r0 = 0
            r4.A02(r5, r1, r0)
            return
        L_0x0079:
            r1 = 0
            goto L_0x006c
        L_0x007b:
            r4.A00 = r2
            goto L_0x0048
        L_0x007e:
            java.lang.Object r0 = r12.A01
            com.obwhatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout r0 = (com.obwhatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout) r0
            java.lang.Object r3 = r12.A02
            X.4Dz r3 = (X.C82744Dz) r3
            int r1 = r12.A00
            java.util.List r0 = r0.A03
            java.lang.Object r2 = r0.get(r1)
            X.1sy r2 = (X.C39731sy) r2
            X.1bb r7 = r3.A00
            X.1yP r0 = X.AnonymousClass22O.A02(r7)
            if (r0 == 0) goto L_0x0182
            X.0tZ r10 = r7.getFMessage()
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            X.1yj r1 = r0.A00
            X.2DF r0 = X.C14530pL.A0K(r1)
            X.0tb r9 = r0.A03
            X.0sH r0 = r1.A2l
            X.0rv r11 = X.C16010sH.A01(r0)
            java.lang.String r0 = r2.A04
            java.lang.String r8 = X.C40651uT.A05(r0)
            java.lang.String r5 = r2.A05
            int r6 = r2.A02
            X.17g r4 = r9.A1N
            X.0t3 r0 = r9.A0Q
            long r2 = r0.A00()
            X.18b r1 = r4.A05
            r0 = 1
            X.1Vw r0 = r1.A02(r11, r0)
            X.1rh r1 = new X.1rh
            r1.<init>(r0, r2)
            r1.A0k(r8)
            r1.A01 = r5
            r1.A00 = r6
            r4.A05(r1, r10)
            r9.A0M(r1)
            X.0t6 r0 = r9.A0e
            r0.A0W(r1)
            X.0sq r2 = r7.A1e
            r1 = 31
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6
            r0.<init>(r7, r1)
            r2.Acl(r0)
            X.1Ow r5 = r7.A1T
            X.0tZ r3 = r7.getFMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0 = 0
            X.C18450wi.A0H(r3, r0)
            X.1Ov r1 = r5.A01
            X.0pd r4 = r1.A01
            r0 = 2849(0xb21, float:3.992E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r0 = r4.A0E(r2, r0)
            if (r0 == 0) goto L_0x0136
            X.0rz r0 = r1.A00
            boolean r1 = r0.A1i()
        L_0x010a:
            r0 = 2848(0xb20, float:3.991E-42)
            boolean r0 = r4.A0E(r2, r0)
            if (r0 != 0) goto L_0x0017
            if (r1 == 0) goto L_0x0017
            X.0xb r2 = r5.A00
            X.1Vw r1 = r3.A11
            X.0rv r0 = r1.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.String r4 = r0.getRawString()
            X.C18450wi.A0B(r4)
            java.lang.String r5 = r1.A01
            X.C18450wi.A0A(r5)
            long r7 = r3.A0I
            long r9 = r3.A16
            com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob r3 = new com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob
            r3.<init>(r4, r5, r6, r7, r9)
            r2.A00(r3)
            return
        L_0x0136:
            r1 = 1
            goto L_0x010a
        L_0x0138:
            java.lang.Object r0 = r12.A01
            com.obwhatsapp.conversation.conversationrow.DynamicButtonsLayout r0 = (com.obwhatsapp.conversation.conversationrow.DynamicButtonsLayout) r0
            int r3 = r12.A00
            java.lang.Object r2 = r12.A02
            X.38Z r2 = (X.AnonymousClass38Z) r2
            java.util.List r1 = r0.A02
            java.lang.Object r0 = r1.get(r3)
            X.1t7 r0 = (X.C39821t7) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0017
            java.lang.Object r0 = r1.get(r3)
            X.1t7 r0 = (X.C39821t7) r0
            r2.A00(r0)
            return
        L_0x0158:
            java.lang.Object r0 = r12.A01
            X.31h r0 = (X.C603931h) r0
            java.lang.Object r4 = r12.A02
            X.0rv r4 = (X.C15830rv) r4
            int r5 = r12.A00
            X.2J6 r1 = r0.A0B
            com.obwhatsapp.conversationslist.ViewHolder r3 = r0.A0A
            android.view.View r2 = r3.A06
            r6 = -1
            r1.AOb(r2, r3, r4, r5, r6)
            return
        L_0x016d:
            java.lang.Object r0 = r12.A01
            X.31g r0 = (X.C603831g) r0
            java.lang.Object r4 = r12.A02
            X.0rv r4 = (X.C15830rv) r4
            int r5 = r12.A00
            X.2J6 r1 = r0.A03
            com.obwhatsapp.conversationslist.ViewHolder r3 = r0.A0A
            android.view.View r2 = r3.A06
            r6 = -1
            r1.AOb(r2, r3, r4, r5, r6)
            return
        L_0x0182:
            java.lang.String r0 = "ConversationRow/onQuickReplyButtonClicked/error: not click in Conversation"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape2S0201000_I1.onClick(android.view.View):void");
    }
}
