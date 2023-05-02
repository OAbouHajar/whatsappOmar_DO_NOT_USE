package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape28S0200000_2_I0 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape28S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0120, code lost:
        r3.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r15, int r16) {
        /*
            r14 = this;
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x0107;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00ba;
                case 5: goto L_0x0096;
                case 6: goto L_0x0083;
                case 7: goto L_0x006c;
                case 8: goto L_0x0056;
                case 9: goto L_0x002c;
                case 10: goto L_0x003e;
                case 11: goto L_0x001e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A00
            com.obwhatsapp.status.playback.MessageReplyActivity r2 = (com.obwhatsapp.status.playback.MessageReplyActivity) r2
            java.lang.Object r1 = r14.A01
            X.0sH r1 = (X.C16010sH) r1
            X.01Y r0 = r2.A0K
            X.AnonymousClass3K3.A0z(r2, r0, r1)
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass29T.A00(r2, r0)
            com.obwhatsapp.mentions.MentionableEntry r1 = r2.A0m
            r0 = 1
            r1.A04(r0)
        L_0x001d:
            return
        L_0x001e:
            java.lang.Object r1 = r14.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r14.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 124(0x7c, float:1.74E-43)
            X.AnonymousClass29T.A00(r1, r0)
            goto L_0x0038
        L_0x002c:
            java.lang.Object r1 = r14.A00
            com.obwhatsapp.migration.export.ui.ExportMigrationActivity r1 = (com.obwhatsapp.migration.export.ui.ExportMigrationActivity) r1
            java.lang.Object r2 = r14.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 0
            r1.A35(r0)
        L_0x0038:
            if (r2 == 0) goto L_0x001d
            r2.run()
            return
        L_0x003e:
            java.lang.Object r3 = r14.A00
            X.1yJ r3 = (X.C42711yJ) r3
            java.lang.Object r2 = r14.A01
            android.content.Context r2 = (android.content.Context) r2
            X.0xQ r0 = r3.A02
            android.net.Uri r0 = r0.A00()
            android.content.Intent r1 = X.C13690nt.A0B(r0)
            X.0zJ r0 = r3.A01
            r0.A06(r2, r1)
            return
        L_0x0056:
            java.lang.Object r4 = r14.A00
            com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment r4 = (com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment) r4
            java.lang.Object r3 = r14.A01
            X.0sq r2 = r4.A0G
            r1 = 47
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            r4.A1C()
            return
        L_0x006c:
            java.lang.Object r3 = r14.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.Object r1 = r14.A01
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 4
            com.obwhatsapp.MuteDialogFragment r2 = com.obwhatsapp.MuteDialogFragment.A02(r1, r0)
            X.02C r1 = r3.A0G()
            r0 = 0
            r2.A1G(r1, r0)
            goto L_0x0120
        L_0x0083:
            java.lang.Object r4 = r14.A00
            X.2JF r4 = (X.AnonymousClass2JF) r4
            java.lang.Object r3 = r14.A01
            X.0sq r2 = r4.A0T
            r1 = 44
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            return
        L_0x0096:
            java.lang.Object r0 = r14.A00
            X.2KS r0 = (X.AnonymousClass2KS) r0
            java.lang.Object r8 = r14.A01
            X.0sH r8 = (X.C16010sH) r8
            X.0sq r1 = r0.A0b
            X.00k r3 = r0.A03
            X.0tb r5 = r0.A0A
            X.1Lr r7 = r0.A0F
            X.0pS r4 = r0.A06
            r12 = 1
            r13 = 0
            r6 = 0
            java.lang.String r11 = "chat"
            r10 = r6
            X.377 r2 = new X.377
            r9 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Void[] r0 = new java.lang.Void[r13]
            r1.Ack(r2, r0)
            return
        L_0x00ba:
            java.lang.Object r0 = r14.A00
            com.obwhatsapp.communitysuspend.CommunitySuspendDialogFragment r0 = (com.obwhatsapp.communitysuspend.CommunitySuspendDialogFragment) r0
            java.lang.Object r2 = r14.A01
            X.00l r2 = (X.C001000l) r2
            X.1BZ r1 = r0.A00
            java.lang.String r0 = "community-no-longer-available"
            r1.A00(r2, r0)
            return
        L_0x00ca:
            java.lang.Object r2 = r14.A00
            com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity r2 = (com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity) r2
            java.lang.Object r1 = r14.A01
            X.0sH r1 = (X.C16010sH) r1
            X.01Y r0 = r2.A07
            X.AnonymousClass3K3.A0z(r2, r0, r1)
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass29T.A00(r2, r0)
            return
        L_0x00dd:
            java.lang.Object r3 = r14.A00
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r14.A01
            X.0xQ r2 = (X.C18890xQ) r2
            r0 = 115(0x73, float:1.61E-43)
            X.AnonymousClass29T.A00(r3, r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = X.C13700nu.A02(r0)
            android.net.Uri r0 = r2.A00()
            r1.setData(r0)
            r3.startActivity(r1)
            return
        L_0x00fb:
            java.lang.Object r1 = r14.A00
            com.obwhatsapp.MuteDialogFragment r1 = (com.obwhatsapp.MuteDialogFragment) r1
            java.lang.Object r0 = r14.A01
            java.util.List r0 = (java.util.List) r0
            com.obwhatsapp.MuteDialogFragment.A03(r1, r0)
            return
        L_0x0107:
            java.lang.Object r3 = r14.A00
            com.obwhatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment r3 = (com.obwhatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment) r3
            java.lang.Object r2 = r14.A01
            android.content.Context r2 = (android.content.Context) r2
            X.0uj r1 = r3.A01
            java.lang.String r0 = "30035737"
            android.net.Uri r0 = r1.A04(r0)
            android.content.Intent r1 = X.C13690nt.A0B(r0)
            X.0zJ r0 = r3.A00
            r0.A06(r2, r1)
        L_0x0120:
            r3.A1C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape28S0200000_2_I0.onClick(android.content.DialogInterface, int):void");
    }
}
