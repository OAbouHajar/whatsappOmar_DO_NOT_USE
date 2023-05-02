package com.facebook.redex;

import X.C57652rX;

public class RunnableRunnableShape14S0200000_I1_2 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape14S0200000_I1_2(C57652rX r2) {
        this.A02 = 20;
        this.A01 = r2;
        this.A00 = null;
    }

    public RunnableRunnableShape14S0200000_I1_2(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:225:0x06cc, code lost:
        if (r2 == 78) goto L_0x06ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0976, code lost:
        r4.A0K(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0979, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x09a4, code lost:
        if (r6 != null) goto L_0x09a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0b4c, code lost:
        r1.AIU(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0b4f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0b69, code lost:
        r2.AIU(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0b6c, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:271:0x07bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:281:0x07c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:427:0x0b88 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:432:0x0b8d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:427:0x0b88=Splitter:B:427:0x0b88, B:148:0x047d=Splitter:B:148:0x047d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r5 = r28
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0540;
                case 1: goto L_0x05d1;
                case 2: goto L_0x0619;
                case 3: goto L_0x0677;
                case 4: goto L_0x06b7;
                case 5: goto L_0x06b7;
                case 6: goto L_0x06e6;
                case 7: goto L_0x0031;
                case 8: goto L_0x06f4;
                case 9: goto L_0x0030;
                case 10: goto L_0x0708;
                case 11: goto L_0x0071;
                case 12: goto L_0x0718;
                case 13: goto L_0x008f;
                case 14: goto L_0x07ca;
                case 15: goto L_0x00cf;
                case 16: goto L_0x0169;
                case 17: goto L_0x019d;
                case 18: goto L_0x07e8;
                case 19: goto L_0x07f6;
                case 20: goto L_0x01b7;
                case 21: goto L_0x0805;
                case 22: goto L_0x081e;
                case 23: goto L_0x0886;
                case 24: goto L_0x01dc;
                case 25: goto L_0x08bd;
                case 26: goto L_0x0204;
                case 27: goto L_0x08d4;
                case 28: goto L_0x08eb;
                case 29: goto L_0x0937;
                case 30: goto L_0x097d;
                case 31: goto L_0x098c;
                case 32: goto L_0x0220;
                case 33: goto L_0x0249;
                case 34: goto L_0x0508;
                case 35: goto L_0x0a53;
                case 36: goto L_0x0a67;
                case 37: goto L_0x052a;
                case 38: goto L_0x0a78;
                case 39: goto L_0x0a84;
                case 40: goto L_0x0b31;
                case 41: goto L_0x0b3d;
                case 42: goto L_0x0b5b;
                case 43: goto L_0x0b50;
                case 44: goto L_0x0b46;
                case 45: goto L_0x0b50;
                case 46: goto L_0x0b5b;
                case 47: goto L_0x0b5b;
                case 48: goto L_0x0b5b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0 r0 = (com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0) r0
            java.lang.Object r1 = r5.A01
            java.lang.Object r2 = r0.A00
            com.obwhatsapp.qrcode.DevicePairQrScannerActivity r2 = (com.obwhatsapp.qrcode.DevicePairQrScannerActivity) r2
            boolean r0 = r2.AIm()
            if (r0 != 0) goto L_0x0030
            X.2gc r0 = r2.A08
            X.2Ui r0 = r0.A00()
            X.1WF r0 = r0.A00
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r1 = r2.A0A
            if (r1 == 0) goto L_0x0030
            android.view.View r0 = r2.A00
            r0.removeCallbacks(r1)
        L_0x0030:
            return
        L_0x0031:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.conversation.conversationrow.IdentityChangeDialogFragment r4 = (com.obwhatsapp.conversation.conversationrow.IdentityChangeDialogFragment) r4
            java.lang.Object r0 = r5.A01
            X.0sH r0 = (X.C16010sH) r0
            com.whatsapp.jid.Jid r1 = X.C16010sH.A03(r0)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.0z2 r0 = r4.A00
            java.util.Set r0 = r0.A0D(r1)
            int r1 = r0.size()
            X.16S r0 = r4.A01
            X.0rz r0 = r0.A01
            boolean r0 = r0.A1d()
            r3 = 1
            if (r0 != 0) goto L_0x0057
            if (r1 > r3) goto L_0x0057
            r3 = 0
        L_0x0057:
            X.00l r0 = r4.A0C()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0030
            X.00l r2 = r4.A0C()
            r1 = 6
            com.facebook.redex.RunnableRunnableShape1S0110000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0110000_I1
            r0.<init>(r4, r1, r3)
            r2.runOnUiThread(r0)
            return
        L_0x0071:
            java.lang.Object r3 = r5.A00
            com.facebook.redex.RunnableRunnableShape1S0301000_I1 r3 = (com.facebook.redex.RunnableRunnableShape1S0301000_I1) r3
            java.lang.Object r2 = r3.A01
            X.4NF r2 = (X.AnonymousClass4NF) r2
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0030
            java.lang.Object r0 = r3.A02
            X.1kb r0 = (X.C34641kb) r0
            java.lang.Object r1 = r5.A01
            X.07C r1 = (X.AnonymousClass07C) r1
            r2.A01 = r0
            X.0lm r0 = r2.A03
            r1.A01(r0)
            return
        L_0x008f:
            java.lang.Object r0 = r5.A00
            X.3Gk r0 = (X.C63173Gk) r0
            java.lang.Object r6 = r5.A01
            X.4OW r6 = (X.AnonymousClass4OW) r6
            X.4RZ r5 = r0.A05
            X.1wN r4 = r5.A03
            X.1ZR r2 = r4.A01
            boolean r0 = r2 instanceof X.C70653hS
            if (r0 == 0) goto L_0x0030
            X.3hS r2 = (X.C70653hS) r2
            X.2ZO r1 = r4.A0O
            X.3BB r0 = r5.A01
            X.1uH r0 = r1.A01(r0, r6)
            r2.A0L(r0)
            X.027 r3 = r5.A00
            X.4NG r2 = r5.A02
            r1 = 1
            X.4KT r0 = new X.4KT
            r0.<init>(r6, r2, r1)
            r3.A09(r0)
            X.027 r1 = r4.A0B
            X.1ZR r0 = r4.A01
            r1.A09(r0)
            X.0sq r2 = r4.A0U
            r1 = 13
            com.facebook.redex.RunnableRunnableShape18S0100000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape18S0100000_I1_1
            r0.<init>((X.AnonymousClass4RZ) r5, (int) r1)
            r2.Acl(r0)
            return
        L_0x00cf:
            java.lang.Object r7 = r5.A00
            X.3Gk r7 = (X.C63173Gk) r7
            java.lang.Object r2 = r5.A01
            X.4NG r2 = (X.AnonymousClass4NG) r2
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0030
            X.0ug r6 = r7.A06
            java.lang.String r9 = r6.A02()
            r10 = 246(0xf6, float:3.45E-43)
            java.lang.String r0 = "iq"
            X.1gQ r5 = new X.1gQ
            r5.<init>((java.lang.String) r0)
            java.lang.String r0 = "id"
            X.C32461gQ.A00(r5, r0, r9)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C32461gQ.A00(r5, r1, r0)
            X.1lL r0 = X.C35081lL.A00()
            r5.A02(r0)
            java.lang.String r1 = "smax_id"
            java.lang.String r0 = "4"
            X.C32461gQ.A00(r5, r1, r0)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "fb:thrift_iq"
            X.C32461gQ.A00(r5, r1, r0)
            java.lang.String r3 = r2.A01
            java.lang.String r1 = "account_number"
            r4 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (java.lang.String) r3, (X.C35081lL[]) r4)
            r5.A03(r0)
            java.lang.String r3 = r2.A00
            java.lang.String r1 = "code"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (java.lang.String) r3, (X.C35081lL[]) r4)
            r5.A03(r0)
            java.lang.String r3 = r2.A02
            java.lang.String r1 = "expected_source_url"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (java.lang.String) r3, (X.C35081lL[]) r4)
            r5.A03(r0)
            r0 = 1
            X.1lL[] r4 = new X.C35081lL[r0]
            java.lang.String r3 = "support_icebreakers"
            java.lang.String r0 = "true"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)
            r0 = 0
            r4[r0] = r1
            java.lang.String r1 = "feature"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r4)
            r5.A03(r0)
            X.1Vv r8 = r5.A01()
            r11 = 0
            boolean r0 = r6.A0G(r7, r8, r9, r10, r11)
            if (r0 != 0) goto L_0x0030
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0b6d
            r0 = 0
            r7.A02 = r0
            X.0pt r1 = r7.A03
            r0 = 14
            X.C14870pt.A03(r1, r7, r2, r0)
            return
        L_0x0169:
            java.lang.Object r6 = r5.A00
            X.0tj r6 = (X.C16840tj) r6
            java.lang.Object r4 = r5.A01
            X.0t6 r4 = (X.C16460t6) r4
            boolean r0 = r6 instanceof X.C16740tZ
            if (r0 == 0) goto L_0x0030
            X.0tn r0 = r6.AAt()
            if (r0 == 0) goto L_0x0030
            X.1lc r3 = r0.A01
            if (r3 == 0) goto L_0x0030
            X.1lZ r1 = r3.A05
            java.lang.String r0 = "canceled"
            r1.A01 = r0
            X.1lb r2 = r1.A02
            if (r2 == 0) goto L_0x0197
            java.lang.String r0 = r2.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0197
            X.1lZ r1 = r3.A05
            java.lang.String r0 = r2.A01
            r1.A00 = r0
        L_0x0197:
            X.0tZ r6 = (X.C16740tZ) r6
            r4.A0a(r6)
            return
        L_0x019d:
            java.lang.Object r0 = r5.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            java.lang.Object r2 = r5.A01
            X.29I r2 = (X.AnonymousClass29I) r2
            android.view.Window r0 = r0.getWindow()
            r1 = 1
            r0.setSoftInputMode(r1)
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0030
            r2.A00(r1)
            return
        L_0x01b7:
            java.lang.Object r3 = r5.A00
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0030
            java.lang.Object r0 = r5.A01
            X.2rX r0 = (X.C57652rX) r0
            int r2 = r0.A02
            boolean r1 = r0.A07
            r0 = -1
            if (r1 == 0) goto L_0x01c9
            r0 = 1
        L_0x01c9:
            int r2 = r2 * r0
            r0 = 0
            r3.scrollBy(r0, r2)
            java.lang.Object r0 = r5.A00
            android.view.View r0 = (android.view.View) r0
            android.os.Handler r2 = r0.getHandler()
            r0 = 10
            r2.postDelayed(r5, r0)
            return
        L_0x01dc:
            java.lang.Object r0 = r5.A00
            X.31m r0 = (X.C604231m) r0
            java.lang.Object r3 = r5.A01
            X.0sL r3 = (X.C16050sL) r3
            com.obwhatsapp.group.NewGroup r2 = r0.A00
            r2.Ac1()
            boolean r0 = r2.AIm()
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "newgroup/onConversationChanged/ok/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r2.A0c
            r1.append(r0)
            X.C13680ns.A1V(r1)
            r2.A36(r3)
            r2.finish()
            return
        L_0x0204:
            java.lang.Object r3 = r5.A00
            X.2zc r3 = (X.C59952zc) r3
            java.lang.Object r2 = r5.A01
            java.lang.ref.WeakReference r0 = r3.A05
            java.lang.Object r1 = r0.get()
            X.3o0 r1 = (X.AnonymousClass3o0) r1
            if (r1 == 0) goto L_0x0030
            boolean r0 = X.C16690tT.A02(r3)
            if (r0 != 0) goto L_0x0030
            X.027 r0 = r1.A02
            r0.A09(r2)
            return
        L_0x0220:
            java.lang.Object r2 = r5.A00
            X.3yD r2 = (X.C78523yD) r2
            java.lang.Object r1 = r5.A01
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = 0
            r2.A00 = r0
            android.view.View r0 = r2.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0030
            X.2X3 r0 = r2.A03
            java.lang.String r2 = r1.toString()
            X.2OJ r1 = r0.A02
            java.lang.Object r0 = r1.A01()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0030
            r1.A0B(r2)
            return
        L_0x0249:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.migration.export.service.MessagesExporterService r0 = (com.obwhatsapp.migration.export.service.MessagesExporterService) r0
            java.lang.Object r1 = r5.A01
            android.content.Intent r1 = (android.content.Intent) r1
            X.0sr r7 = r0.A00
            java.lang.String r0 = "IS_FIRST_PARTY"
            r6 = 0
            boolean r19 = r1.getBooleanExtra(r0, r6)
            monitor-enter(r7)
            X.1Zf r2 = r7.A0J     // Catch:{ all -> 0x0ca8 }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x0ca8 }
            r2.A00 = r0     // Catch:{ all -> 0x0ca8 }
            r2.A03()     // Catch:{ all -> 0x0ca8 }
            monitor-exit(r7)
            X.4zu r5 = r7.A0E
            r5.A00 = r6
            monitor-enter(r7)
            android.os.CancellationSignal r0 = r7.A00     // Catch:{ all -> 0x0ca5 }
            if (r0 != 0) goto L_0x0c9e
            java.util.concurrent.CountDownLatch r0 = r7.A01     // Catch:{ all -> 0x0ca5 }
            if (r0 != 0) goto L_0x0c9e
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ all -> 0x0ca5 }
            r0.<init>()     // Catch:{ all -> 0x0ca5 }
            r7.A00 = r0     // Catch:{ all -> 0x0ca5 }
            r4 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0ca5 }
            r0.<init>(r4)     // Catch:{ all -> 0x0ca5 }
            r7.A01 = r0     // Catch:{ all -> 0x0ca5 }
            android.os.CancellationSignal r9 = r7.A00     // Catch:{ all -> 0x0ca5 }
            monitor-exit(r7)     // Catch:{ all -> 0x0ca5 }
            r18 = 16
            java.lang.String r1 = "ExportFlowManager/"
            X.01V r0 = r7.A03
            android.os.PowerManager r0 = r0.A0I()
            if (r0 != 0) goto L_0x029c
            java.lang.String r0 = "OsUtil/acquireWakeLock()/pm=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 0
        L_0x0298:
            r2 = 0
            if (r3 == 0) goto L_0x02ac
            goto L_0x02a1
        L_0x029c:
            android.os.PowerManager$WakeLock r3 = X.C43421zy.A00(r0, r1, r4)
            goto L_0x0298
        L_0x02a1:
            java.lang.String r0 = "ExportFlowManager/onStartCommand/wakelock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            r3.acquire(r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
        L_0x02ac:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r0 = 3
            r7.A07(r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.3sl r10 = new X.3sl     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r10.<init>()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.3sl r8 = new X.3sl     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r8.<init>()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.3sl r1 = r7.A01(r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r10.A05 = r0     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r8.A05 = r0     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            monitor-enter(r7)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            java.util.List r13 = r7.A0N     // Catch:{ all -> 0x0b98 }
            r13.clear()     // Catch:{ all -> 0x0b98 }
            r13.add(r10)     // Catch:{ all -> 0x0b98 }
            r13.add(r8)     // Catch:{ all -> 0x0b98 }
            r13.add(r1)     // Catch:{ all -> 0x0b98 }
            monitor-exit(r7)     // Catch:{ all -> 0x0b98 }
            X.0ut r0 = r7.A0F     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r27 = r0
            java.util.Iterator r1 = X.C16590tJ.A00(r27)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
        L_0x02e9:
            boolean r0 = r1.hasNext()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            if (r0 == 0) goto L_0x02f9
            java.lang.Object r0 = r1.next()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.5T7 r0 = (X.AnonymousClass5T7) r0     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r0.AQp()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            goto L_0x02e9
        L_0x02f9:
            r7.A05()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.1Bs r1 = r7.A0C     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r1.A02(r9)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r1.A00()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.0yx r8 = r7.A0I     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r8.A0F()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.0y3 r0 = r7.A07     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r0.A03(r6)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.1Bq r10 = r7.A0D     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            java.lang.String r0 = "messages"
            java.io.File r11 = r10.A00(r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.0uv r0 = r7.A08     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r0.A0H(r9, r11)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            java.lang.String r0 = "ExportFlowManager/doExport()/data-exported"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.0sv r12 = r7.A0H     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            java.lang.String r0 = "migration/messages_export.zip"
            long r14 = r12.A02(r11, r0, r4)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r16 = 0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0b8e
            java.lang.String r0 = "enc-metadata"
            java.io.File r10 = r10.A00(r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            X.0pd r14 = r7.A05     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r11 = 1387(0x56b, float:1.944E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            boolean r14 = r14.A0E(r0, r11)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r0 = 10
            X.3sl r0 = r7.A01(r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r13.add(r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r0.<init>(r10)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            java.util.zip.ZipOutputStream r11 = new java.util.zip.ZipOutputStream     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r11.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r1.A03(r9, r11, r4)     // Catch:{ all -> 0x0b89 }
            X.1Br r1 = r7.A0G     // Catch:{ all -> 0x0b89 }
            if (r14 != 0) goto L_0x035c
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0b89 }
        L_0x035c:
            java.lang.String r9 = "attempt.json"
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0b89 }
            r0.<init>(r9)     // Catch:{ all -> 0x0b89 }
            r11.putNextEntry(r0)     // Catch:{ all -> 0x0b89 }
            java.io.OutputStreamWriter r9 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0b89 }
            r9.<init>(r11)     // Catch:{ all -> 0x0b89 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0b89 }
            r0.<init>(r9)     // Catch:{ all -> 0x0b89 }
            android.util.JsonWriter r9 = new android.util.JsonWriter     // Catch:{ all -> 0x0b89 }
            r9.<init>(r0)     // Catch:{ all -> 0x0b89 }
            r9.beginObject()     // Catch:{ all -> 0x0b89 }
            X.0su r0 = r1.A01     // Catch:{ all -> 0x0b7e }
            java.lang.String r14 = r0.A02()     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "attemptInfo"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            r9.beginObject()     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "attemptId"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            r9.value(r14)     // Catch:{ all -> 0x0b7e }
            r9.endObject()     // Catch:{ all -> 0x0b7e }
            X.01V r14 = r1.A00     // Catch:{ all -> 0x0b7e }
            X.0u3 r1 = r1.A02     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "donorInfo"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            r9.beginObject()     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "deviceName"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0b7e }
            r15.append(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "-"
            r15.append(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r15)     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "appVersion"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "2.23.1.76"
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "osVersion"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "buildType"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.Integer r0 = X.C13690nt.A0T()     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "yearClass2016"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            int r0 = X.C42971z5.A02(r14, r1)     // Catch:{ all -> 0x0b7e }
            long r0 = (long) r0     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
            r9.endObject()     // Catch:{ all -> 0x0b7e }
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0b7e }
            if (r0 != 0) goto L_0x047d
            java.lang.String r0 = "loggingEvents"
            android.util.JsonWriter r0 = r9.name(r0)     // Catch:{ all -> 0x0b7e }
            r0.beginArray()     // Catch:{ all -> 0x0b7e }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0b7e }
        L_0x03fd:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0b7e }
            if (r0 == 0) goto L_0x047a
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0b7e }
            X.3sl r1 = (X.C75813sl) r1     // Catch:{ all -> 0x0b7e }
            java.lang.Integer r0 = r1.A05     // Catch:{ all -> 0x0b7e }
            if (r0 == 0) goto L_0x03fd
            int r0 = r0.intValue()     // Catch:{ all -> 0x0b7e }
            if (r0 == 0) goto L_0x03fd
            r9.beginObject()     // Catch:{ all -> 0x0b7e }
            java.lang.String r0 = "eventTypeCode"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.Integer r0 = r1.A05     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.Long r0 = r1.A07     // Catch:{ all -> 0x0b7e }
            if (r0 == 0) goto L_0x042e
            java.lang.String r0 = "duration"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.Long r0 = r1.A07     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
        L_0x042e:
            java.lang.Long r0 = r1.A08     // Catch:{ all -> 0x0b7e }
            if (r0 == 0) goto L_0x043c
            java.lang.String r0 = "progress"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.Long r0 = r1.A08     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
        L_0x043c:
            java.lang.Double r0 = r1.A02     // Catch:{ all -> 0x0b7e }
            if (r0 == 0) goto L_0x044a
            java.lang.String r0 = "exportedDbSize"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.Double r0 = r1.A02     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
        L_0x044a:
            java.lang.Long r0 = r1.A06     // Catch:{ all -> 0x0b7e }
            if (r0 == 0) goto L_0x0459
            java.lang.String r0 = "storageAvailableSize"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.Long r0 = r1.A06     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
        L_0x0459:
            java.lang.Double r0 = r1.A00     // Catch:{ all -> 0x0b7e }
            if (r0 == 0) goto L_0x0468
            java.lang.String r0 = "waDbSize"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.Double r0 = r1.A00     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
        L_0x0468:
            java.lang.Double r0 = r1.A01     // Catch:{ all -> 0x0b7e }
            if (r0 == 0) goto L_0x0476
            java.lang.String r0 = "mediaSize"
            r9.name(r0)     // Catch:{ all -> 0x0b7e }
            java.lang.Double r0 = r1.A01     // Catch:{ all -> 0x0b7e }
            r9.value(r0)     // Catch:{ all -> 0x0b7e }
        L_0x0476:
            r9.endObject()     // Catch:{ all -> 0x0b7e }
            goto L_0x03fd
        L_0x047a:
            r9.endArray()     // Catch:{ all -> 0x0b7e }
        L_0x047d:
            r9.endObject()     // Catch:{ all -> 0x0b89 }
            r9.flush()     // Catch:{ all -> 0x0b89 }
            r11.closeEntry()     // Catch:{ all -> 0x0b89 }
            r11.close()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            java.lang.String r22 = "migration/enc.zip"
            X.0zW r0 = r12.A01     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            java.lang.String r21 = r10.getCanonicalPath()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            long r24 = r10.length()     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            java.lang.String r23 = ""
            r26 = 1
            r20 = r0
            long r9 = r20.A01(r21, r22, r23, r24, r26)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0b74
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r7)
            java.util.concurrent.CountDownLatch r0 = r7.A01     // Catch:{ all -> 0x0b71 }
            r0.countDown()     // Catch:{ all -> 0x0b71 }
            r7.A01 = r2     // Catch:{ all -> 0x0b71 }
            r7.A00 = r2     // Catch:{ all -> 0x0b71 }
            monitor-exit(r7)     // Catch:{ all -> 0x0b71 }
            X.C13690nt.A10(r3)
            r0 = 10
            r7.A07(r0)
            r7.A06()
            if (r19 != 0) goto L_0x04f4
            X.0sy r0 = r7.A0A
            r0.A03()
            r8.A09()
            java.lang.String r0 = "registration-manager/set-migration-export-stage"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r0 = r8.A0O
            r0.A0Y()
            r0 = 11
            r8.A0A(r0)
            X.0su r4 = r7.A0B
            long r2 = java.lang.System.currentTimeMillis()
            X.01D r0 = r4.A02
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "/export/start_time"
            X.C13680ns.A0x(r1, r0, r2)
            r4.A03()
            java.lang.String r0 = "ExportFlowManager/exportProviderAndLogout/complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x04f4:
            java.util.Iterator r1 = X.C16590tJ.A00(r27)
        L_0x04f8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r1.next()
            X.5T7 r0 = (X.AnonymousClass5T7) r0
            r0.AOq()
            goto L_0x04f8
        L_0x0508:
            java.lang.Object r0 = r5.A00
            X.1DI r0 = (X.AnonymousClass1DI) r0
            java.lang.Object r4 = r5.A01
            X.0rv r4 = (X.C15830rv) r4
            X.0sf r3 = r0.A0A
            java.lang.String r0 = r4.getRawString()
            X.1WS r2 = r3.A07(r0)
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x0030
            boolean r0 = r2.A09()
            if (r0 != 0) goto L_0x0030
            r0 = 2
            r3.A0H(r4, r0)
            return
        L_0x052a:
            java.lang.Object r0 = r5.A00
            X.4yB r0 = (X.C101964yB) r0
            X.12h r0 = r0.A02
            X.12g r0 = r0.A0A
            java.util.Iterator r1 = X.C16590tJ.A00(r0)
        L_0x0536:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0030
            r1.next()
            goto L_0x0536
        L_0x0540:
            java.lang.Object r6 = r5.A00
            X.2rn r6 = (X.C57782rn) r6
            java.lang.Object r5 = r5.A01
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r8 = r5.iterator()
        L_0x054c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x05c8
            java.lang.Object r4 = r8.next()
            X.4Ru r4 = (X.C86234Ru) r4
            X.02k r0 = r4.A05
            r3 = 0
            if (r0 != 0) goto L_0x05c5
            r1 = r3
        L_0x055e:
            X.02k r0 = r4.A04
            if (r0 == 0) goto L_0x0564
            android.view.View r3 = r0.A0H
        L_0x0564:
            r7 = 0
            if (r1 == 0) goto L_0x059a
            X.0SH r2 = X.C004601z.A0H(r1)
            long r0 = r6.A05()
            r2.A08(r0)
            java.util.List r1 = r6.A02
            X.02k r0 = r4.A05
            r1.add(r0)
            int r1 = r4.A02
            int r0 = r4.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            r2.A06(r0)
            int r1 = r4.A03
            int r0 = r4.A01
            int r1 = r1 - r0
            float r0 = (float) r1
            r2.A07(r0)
            r2.A03(r7)
            r1 = 2
            com.obwhatsapp.contact.picker.IDxLAdapterShape4S0300000_2_I1 r0 = new com.obwhatsapp.contact.picker.IDxLAdapterShape4S0300000_2_I1
            r0.<init>(r4, r2, r6, r1)
            r2.A0A(r0)
            r2.A02()
        L_0x059a:
            if (r3 == 0) goto L_0x054c
            X.0SH r2 = X.C004601z.A0H(r3)
            java.util.List r1 = r6.A02
            X.02k r0 = r4.A04
            r1.add(r0)
            r2.A06(r7)
            r2.A07(r7)
            long r0 = r6.A05()
            r2.A08(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A03(r0)
            X.3oV r0 = new X.3oV
            r0.<init>(r3, r2, r4, r6)
            r2.A0A(r0)
            r2.A02()
            goto L_0x054c
        L_0x05c5:
            android.view.View r1 = r0.A0H
            goto L_0x055e
        L_0x05c8:
            r5.clear()
            java.util.List r0 = r6.A03
            r0.remove(r5)
            return
        L_0x05d1:
            java.lang.Object r6 = r5.A00
            X.2rn r6 = (X.C57782rn) r6
            java.lang.Object r5 = r5.A01
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r4 = r5.iterator()
        L_0x05dd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0610
            java.lang.Object r3 = r4.next()
            X.02k r3 = (X.C005602k) r3
            android.view.View r0 = r3.A0H
            X.0SH r2 = X.C004601z.A0H(r0)
            java.util.List r0 = r6.A00
            r0.add(r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A04(r0)
            r2.A05(r0)
            long r0 = r6.A04()
            r2.A08(r0)
            r1 = 1
            com.obwhatsapp.contact.picker.IDxLAdapterShape4S0300000_2_I1 r0 = new com.obwhatsapp.contact.picker.IDxLAdapterShape4S0300000_2_I1
            r0.<init>(r2, r3, r6, r1)
            r2.A0A(r0)
            r2.A02()
            goto L_0x05dd
        L_0x0610:
            r5.clear()
            java.util.List r0 = r6.A01
            r0.remove(r5)
            return
        L_0x0619:
            java.lang.Object r8 = r5.A00
            X.2rn r8 = (X.C57782rn) r8
            java.lang.Object r3 = r5.A01
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r4 = r3.iterator()
        L_0x0625:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x066e
            java.lang.Object r2 = r4.next()
            X.4NC r2 = (X.AnonymousClass4NC) r2
            X.02k r7 = r2.A04
            int r1 = r2.A00
            int r0 = r2.A01
            int r9 = r2.A02
            int r10 = r2.A03
            android.view.View r2 = r7.A0H
            int r9 = r9 - r1
            int r10 = r10 - r0
            r1 = 0
            if (r9 == 0) goto L_0x0649
            X.0SH r0 = X.C004601z.A0H(r2)
            r0.A06(r1)
        L_0x0649:
            if (r10 == 0) goto L_0x0652
            X.0SH r0 = X.C004601z.A0H(r2)
            r0.A07(r1)
        L_0x0652:
            X.0SH r6 = X.C004601z.A0H(r2)
            java.util.List r0 = r8.A04
            r0.add(r7)
            long r0 = r8.A06()
            r6.A08(r0)
            X.3oW r5 = new X.3oW
            r5.<init>(r6, r7, r8, r9, r10)
            r6.A0A(r5)
            r6.A02()
            goto L_0x0625
        L_0x066e:
            r3.clear()
            java.util.List r0 = r8.A05
            r0.remove(r3)
            return
        L_0x0677:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0) r0
            java.lang.Object r1 = r5.A01
            X.0tZ r1 = (X.C16740tZ) r1
            java.lang.Object r7 = r0.A00
            X.15I r7 = (X.AnonymousClass15I) r7
            monitor-enter(r7)
            android.content.SharedPreferences r6 = r7.A05()     // Catch:{ all -> 0x06b4 }
            X.0w3 r0 = r7.A0R     // Catch:{ all -> 0x06b4 }
            long r4 = r0.A01()     // Catch:{ all -> 0x06b4 }
            X.1Vw r0 = r1.A11     // Catch:{ all -> 0x06b4 }
            X.0rv r3 = r0.A00     // Catch:{ all -> 0x06b4 }
            long r1 = r1.A0I     // Catch:{ all -> 0x06b4 }
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x06af
            if (r3 == 0) goto L_0x06af
            java.lang.String r2 = r3.getRawString()     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r6.getString(r2, r0)     // Catch:{ all -> 0x06b4 }
            X.2D4 r1 = X.AnonymousClass2D4.A00(r0)     // Catch:{ all -> 0x06b4 }
            r0 = 6
            r1.A01(r0)     // Catch:{ all -> 0x06b4 }
            X.AnonymousClass15I.A00(r6, r1, r2)     // Catch:{ all -> 0x06b4 }
        L_0x06af:
            monitor-exit(r7)
            r7.A06()
            return
        L_0x06b4:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x06b7:
            java.lang.Object r0 = r5.A00
            X.1bb r0 = (X.C30011bb) r0
            java.lang.Object r4 = r5.A01
            X.0tZ r4 = (X.C16740tZ) r4
            X.0tb r3 = r0.A0R
            byte r2 = r4.A10
            boolean r0 = X.C30921dB.A00(r2)
            if (r0 != 0) goto L_0x06ce
            r1 = 78
            r0 = 0
            if (r2 != r1) goto L_0x06cf
        L_0x06ce:
            r0 = 1
        L_0x06cf:
            X.AnonymousClass00B.A0G(r0)
            r1 = r4
            X.1rl r1 = (X.C39001rl) r1
            r0 = 1
            r1.Aey(r0)
            X.0sq r2 = r3.A1Y
            r1 = 28
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            return
        L_0x06e6:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.conversation.conversationrow.DeviceUpdateDialogFragment r0 = (com.obwhatsapp.conversation.conversationrow.DeviceUpdateDialogFragment) r0
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1L0 r0 = r0.A00
            r0.A01(r1)
            return
        L_0x06f4:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.IDxLAdapterShape52S0100000_2_I1 r0 = (com.obwhatsapp.IDxLAdapterShape52S0100000_2_I1) r0
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.A00
            X.3D6 r0 = (X.AnonymousClass3D6) r0
            X.1yj r0 = r0.A02
            com.obwhatsapp.KeyboardPopupLayout r0 = r0.A0z
            r0.removeView(r1)
            return
        L_0x0708:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0) r0
            java.lang.Object r1 = r5.A01
            X.0rv r1 = (X.C15830rv) r1
            java.lang.Object r0 = r0.A00
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = (com.obwhatsapp.conversationslist.ConversationsFragment) r0
            com.obwhatsapp.conversationslist.ConversationsFragment.A05(r0, r1)
            return
        L_0x0718:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.RunnableRunnableShape1S0500000_I1 r0 = (com.facebook.redex.RunnableRunnableShape1S0500000_I1) r0
            java.lang.Object r1 = r5.A01
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r10 = r0.A02
            X.11s r10 = (X.C208211s) r10
            X.0xT r0 = r10.A0I
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x072f
            X.16P r0 = r10.A0H
            r0.A00()
        L_0x072f:
            X.01d r0 = r10.A0K
            X.0tf r9 = r0.A02()
            X.1cj r8 = r9.A00()     // Catch:{ all -> 0x07c5 }
            X.19U r4 = r10.A0F     // Catch:{ all -> 0x07c0 }
            monitor-enter(r4)     // Catch:{ all -> 0x07c0 }
            int r6 = r1.size()     // Catch:{ all -> 0x07bd }
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x07bd }
            r2 = 0
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x07bd }
        L_0x0747:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x07bd }
            if (r0 == 0) goto L_0x0770
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x07bd }
            X.4KX r1 = (X.AnonymousClass4KX) r1     // Catch:{ all -> 0x07bd }
            int r3 = r2 + 1
            int r0 = r1.A00     // Catch:{ all -> 0x07bd }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x07bd }
            r7[r2] = r0     // Catch:{ all -> 0x07bd }
            X.1Yb r2 = r1.A02     // Catch:{ all -> 0x07bd }
            java.util.Map r1 = r4.A00     // Catch:{ all -> 0x07bd }
            monitor-enter(r1)     // Catch:{ all -> 0x07bd }
            java.util.Set r0 = r4.A01     // Catch:{ all -> 0x076d }
            r0.remove(r2)     // Catch:{ all -> 0x076d }
            r1.remove(r2)     // Catch:{ all -> 0x076d }
            monitor-exit(r1)     // Catch:{ all -> 0x076d }
            r2 = r3
            goto L_0x0747
        L_0x076d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x076d }
            throw r0     // Catch:{ all -> 0x07bd }
        L_0x0770:
            X.1ex r0 = r10.A0B     // Catch:{ all -> 0x07bd }
            X.01d r0 = r0.A01     // Catch:{ all -> 0x07bd }
            X.0tf r5 = r0.A02()     // Catch:{ all -> 0x07bd }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x07b8 }
            java.lang.String r2 = "sessions"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x07b8 }
            java.lang.String r0 = "_id IN "
            r1.append(r0)     // Catch:{ all -> 0x07b8 }
            java.lang.String r0 = X.C34111ji.A00(r6)     // Catch:{ all -> 0x07b8 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x07b8 }
            int r0 = r3.A01(r2, r0, r7)     // Catch:{ all -> 0x07b8 }
            long r2 = (long) r0     // Catch:{ all -> 0x07b8 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x07b8 }
            java.lang.String r0 = "axolotl sessions deleted "
            r1.append(r0)     // Catch:{ all -> 0x07b8 }
            r1.append(r2)     // Catch:{ all -> 0x07b8 }
            java.lang.String r0 = " out of "
            r1.append(r0)     // Catch:{ all -> 0x07b8 }
            r1.append(r6)     // Catch:{ all -> 0x07b8 }
            X.C13680ns.A1V(r1)     // Catch:{ all -> 0x07b8 }
            r5.close()     // Catch:{ all -> 0x07bd }
            r8.A00()     // Catch:{ all -> 0x07bd }
            monitor-exit(r4)     // Catch:{ all -> 0x07bd }
            r8.close()     // Catch:{ all -> 0x07c5 }
            r9.close()
            return
        L_0x07b8:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x07bc }
        L_0x07bc:
            throw r0     // Catch:{ all -> 0x07bd }
        L_0x07bd:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x07bd }
            throw r0     // Catch:{ all -> 0x07c0 }
        L_0x07c0:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x07c4 }
        L_0x07c4:
            throw r0     // Catch:{ all -> 0x07c5 }
        L_0x07c5:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x07c9 }
        L_0x07c9:
            throw r0
        L_0x07ca:
            java.lang.Object r3 = r5.A00
            X.3Gk r3 = (X.C63173Gk) r3
            java.lang.Object r2 = r5.A01
            X.4NG r2 = (X.AnonymousClass4NG) r2
            X.0xW r1 = r3.A00
            if (r1 == 0) goto L_0x07db
            X.0tK r0 = r3.A04
            r0.A03(r1)
        L_0x07db:
            X.4ux r1 = new X.4ux
            r1.<init>(r2, r3)
            r3.A00 = r1
            X.0tK r0 = r3.A04
            r0.A04(r1)
            return
        L_0x07e8:
            java.lang.Object r3 = r5.A00
            X.0tb r3 = (X.C16760tb) r3
            java.lang.Object r2 = r5.A01
            X.0tZ r2 = (X.C16740tZ) r2
            r1 = 0
            r0 = 3
            r3.A0P(r2, r0, r1, r1)
            return
        L_0x07f6:
            java.lang.Object r4 = r5.A00
            X.0tb r4 = (X.C16760tb) r4
            java.lang.Object r3 = r5.A01
            X.0tZ r3 = (X.C16740tZ) r3
            r2 = 0
            r1 = 1
            r0 = 3
            r4.A0P(r3, r0, r2, r1)
            return
        L_0x0805:
            java.lang.Object r3 = r5.A00
            X.2Si r3 = (X.C49302Si) r3
            java.lang.Object r2 = r5.A01
            java.io.File r2 = (java.io.File) r2
            android.view.View r0 = r3.A01
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.A03
            r0.setVisibility(r1)
            r0 = 0
            r3.ATN(r2, r0)
            return
        L_0x081e:
            java.lang.Object r10 = r5.A00
            X.32P r10 = (X.AnonymousClass32P) r10
            java.lang.Object r9 = r5.A01
            X.4MJ r9 = (X.AnonymousClass4MJ) r9
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            java.util.Map r6 = r9.A02
            java.util.Iterator r5 = X.C13700nu.A0I(r6)
            r4 = 0
        L_0x0835:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x085e
            java.lang.Object r3 = r5.next()
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            java.lang.Object r2 = r6.get(r3)
            X.4I1 r2 = (X.AnonymousClass4I1) r2
            if (r2 == 0) goto L_0x0835
            if (r4 != 0) goto L_0x0851
            long r0 = r2.A00
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x0851:
            java.lang.String r0 = r3.getRawString()
            r8.add(r0)
            java.lang.String r0 = r2.A01
            r7.add(r0)
            goto L_0x0835
        L_0x085e:
            com.obwhatsapp.group.GroupChatInfoActivity r5 = r10.A00
            java.util.Set r1 = r6.keySet()
            X.0sL r0 = r9.A00
            android.content.Intent r4 = X.C14750ph.A0P(r5, r0, r4, r8, r7)
            r3 = 17
            android.os.Bundle r2 = X.C13690nt.A0D()
            java.util.ArrayList r1 = X.C16030sJ.A06(r1)
            java.lang.String r0 = "jids"
            r2.putStringArrayList(r0, r1)
            java.lang.String r0 = "invite_intent"
            r2.putParcelable(r0, r4)
            com.obwhatsapp.invites.PromptSendGroupInviteDialogFragment r0 = com.obwhatsapp.invites.PromptSendGroupInviteDialogFragment.A01(r2, r3)
            r5.Afc(r0)
            return
        L_0x0886:
            java.lang.Object r6 = r5.A00
            com.obwhatsapp.group.GroupSettingsViewModel r6 = (com.obwhatsapp.group.GroupSettingsViewModel) r6
            java.lang.Object r5 = r5.A01
            X.0rv r5 = (X.C15830rv) r5
            X.0sG r0 = r6.A04
            X.0sH r4 = r0.A0A(r5)
            boolean r0 = r5 instanceof X.C16050sL
            if (r0 == 0) goto L_0x08b7
            X.0sL r5 = (X.C16050sL) r5
            X.0sO r3 = r6.A06
            X.0pd r2 = r3.A0A
            r1 = 1304(0x518, float:1.827E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            int r1 = r0 + -1
            int r0 = r3.A01(r5)
            int r1 = r1 - r0
            r6.A01 = r1
            X.18U r0 = r6.A05
            int r0 = r0.A01(r5)
            r6.A00 = r0
        L_0x08b7:
            X.027 r0 = r6.A02
            r0.A09(r4)
            return
        L_0x08bd:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.RunnableRunnableShape1S0700000_I1 r0 = (com.facebook.redex.RunnableRunnableShape1S0700000_I1) r0
            java.lang.Object r3 = r5.A01
            X.0pN r3 = (X.C14550pN) r3
            java.lang.Object r2 = r0.A04
            X.0pt r2 = (X.C14870pt) r2
            r1 = 2131891812(0x7f121664, float:1.9418355E38)
            r0 = 0
            r2.A09(r1, r0)
            r3.Ac1()
            return
        L_0x08d4:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.groupsuspend.CreateGroupSuspendDialog r3 = (com.obwhatsapp.groupsuspend.CreateGroupSuspendDialog) r3
            java.lang.Object r2 = r5.A01
            X.00l r2 = (X.C001000l) r2
            X.1BZ r1 = r3.A01
            java.lang.String r0 = "group-no-longer-available"
            r1.A00(r2, r0)
            android.app.Dialog r0 = r3.A1A()
            r0.dismiss()
            return
        L_0x08eb:
            java.lang.Object r3 = r5.A00
            X.4Oc r3 = (X.C85354Oc) r3
            java.lang.Object r2 = r5.A01
            r19 = 0
            r18 = 1
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C18450wi.A0B(r0)
            r3.A01 = r0
            X.12W r1 = r3.A05
            X.1g2 r0 = r3.A04
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0910
            X.0pf r0 = r3.A06
            long r0 = r0.A01()
            r3.A00 = r0
        L_0x0910:
            X.0pf r0 = r3.A06
            long r16 = r0.A02()
            X.1Bb r4 = r3.A07
            android.content.Context r5 = r3.A02
            r6 = 0
            long r14 = r3.A00
            java.lang.String r11 = r3.A01
            java.lang.String r8 = "InAppBugReporting"
            r9 = r6
            r10 = r6
            r12 = r6
            r13 = r6
            r7 = r6
            java.lang.String r1 = r4.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19)
            X.C18450wi.A0B(r1)
            X.0pt r4 = r3.A03
            r0 = 8
            com.facebook.redex.RunnableRunnableShape1S1100000_I1 r3 = new com.facebook.redex.RunnableRunnableShape1S1100000_I1
            r3.<init>(r0, r1, r2)
            goto L_0x0976
        L_0x0937:
            java.lang.Object r10 = r5.A00
            X.4Kl r10 = (X.C84414Kl) r10
            java.lang.Object r8 = r5.A01
            X.1Bc r9 = r10.A01
            monitor-enter(r9)
            X.1Bb r7 = r9.A04     // Catch:{ all -> 0x097a }
            r7.A06()     // Catch:{ all -> 0x097a }
            r6 = 0
            com.whatsapp.util.Log.rotate()     // Catch:{ all -> 0x097a }
            com.whatsapp.util.Log.compress()     // Catch:{ all -> 0x097a }
            boolean r1 = r9.A00()     // Catch:{ all -> 0x097a }
            r0 = 1
            java.io.File r5 = r7.A02(r6, r0, r0, r1)     // Catch:{ all -> 0x097a }
            if (r5 == 0) goto L_0x0968
            long r3 = r5.length()     // Catch:{ all -> 0x097a }
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0968
            r0 = 1
            java.lang.String r1 = r7.A04(r5, r6, r0)     // Catch:{ all -> 0x097a }
            goto L_0x096c
        L_0x0968:
            java.lang.String r1 = r7.A05(r6)     // Catch:{ all -> 0x097a }
        L_0x096c:
            monitor-exit(r9)
            X.0pt r4 = r10.A00
            r0 = 9
            com.facebook.redex.RunnableRunnableShape1S1100000_I1 r3 = new com.facebook.redex.RunnableRunnableShape1S1100000_I1
            r3.<init>(r0, r1, r8)
        L_0x0976:
            r4.A0K(r3)
            return
        L_0x097a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x097d:
            java.lang.Object r0 = r5.A00
            X.4MK r0 = (X.AnonymousClass4MK) r0
            java.lang.Object r2 = r5.A01
            X.1XP r2 = (X.AnonymousClass1XP) r2
            X.0wL r1 = r0.A02
            r0 = 0
            r1.A0D(r2, r0)
            return
        L_0x098c:
            java.lang.Object r2 = r5.A00
            X.4g9 r2 = (X.C91584g9) r2
            java.lang.Object r1 = r5.A01
            android.os.IBinder r1 = (android.os.IBinder) r1
            if (r1 == 0) goto L_0x0a10
            java.lang.String r7 = "com.obwhatsapp.instrumentation.CallbackInterface"
            android.os.IInterface r6 = r1.queryLocalInterface(r7)     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            if (r6 == 0) goto L_0x09b3
            boolean r0 = r6 instanceof X.C92034gt     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            if (r0 == 0) goto L_0x09b3
            X.4gt r6 = (X.C92034gt) r6     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            if (r6 == 0) goto L_0x0a10
        L_0x09a6:
            boolean r0 = r2.A01     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            if (r0 == 0) goto L_0x09e7
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            goto L_0x09b9
        L_0x09b3:
            X.4gt r6 = new X.4gt     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            r6.<init>(r1)     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            goto L_0x09a6
        L_0x09b9:
            r5.writeInterfaceToken(r7)     // Catch:{ all -> 0x0a08 }
            android.os.IBinder r3 = r6.A00     // Catch:{ all -> 0x0a08 }
            r1 = 1
            r0 = 0
            r3.transact(r1, r5, r4, r0)     // Catch:{ all -> 0x0a08 }
            r4.readException()     // Catch:{ all -> 0x0a08 }
            java.lang.String r3 = r4.readString()     // Catch:{ all -> 0x0a08 }
            r4.recycle()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            r5.recycle()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            X.115 r0 = r2.A02     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            X.10T r1 = r0.A03     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            java.lang.String r0 = "com.facebook.stella"
            boolean r0 = r1.A00(r0, r3)     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            if (r0 != 0) goto L_0x09e7
            java.lang.String r0 = "CallbackServiceProxy/request invalid authorization token"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            X.43i r0 = new X.43i     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            r0.<init>()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            goto L_0x0a1a
        L_0x09e7:
            java.lang.String r0 = r2.A00     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            r5.writeInterfaceToken(r7)     // Catch:{ all -> 0x0a08 }
            r5.writeString(r0)     // Catch:{ all -> 0x0a08 }
            android.os.IBinder r3 = r6.A00     // Catch:{ all -> 0x0a08 }
            r1 = 2
            r0 = 0
            r3.transact(r1, r5, r4, r0)     // Catch:{ all -> 0x0a08 }
            r4.readException()     // Catch:{ all -> 0x0a08 }
            r4.recycle()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            r5.recycle()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            goto L_0x0a3e
        L_0x0a08:
            r0 = move-exception
            r4.recycle()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            r5.recycle()     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            goto L_0x0a1a
        L_0x0a10:
            java.lang.String r0 = "Cannot convert binder to interface: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
        L_0x0a1a:
            throw r0     // Catch:{ 43i -> 0x0a22, all -> 0x0a1b }
        L_0x0a1b:
            r1 = move-exception
            java.lang.String r0 = "CallbackServiceProxy/failed to send request:"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0a48 }
            goto L_0x0a3e
        L_0x0a22:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0a48 }
            java.lang.String r0 = "CallbackServiceProxy/failed to send request: "
            r1.append(r0)     // Catch:{ all -> 0x0a48 }
            java.lang.String r0 = r3.message     // Catch:{ all -> 0x0a48 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0a48 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0a48 }
            X.115 r0 = r2.A02     // Catch:{ all -> 0x0a48 }
            X.113 r1 = r0.A01     // Catch:{ all -> 0x0a48 }
            java.lang.String r0 = "com.facebook.stella"
            r1.A00(r0)     // Catch:{ all -> 0x0a48 }
        L_0x0a3e:
            X.115 r0 = r2.A02
            X.0tz r0 = r0.A00
            android.content.Context r0 = r0.A00
            r0.unbindService(r2)
            return
        L_0x0a48:
            r1 = move-exception
            X.115 r0 = r2.A02
            X.0tz r0 = r0.A00
            android.content.Context r0 = r0.A00
            r0.unbindService(r2)
            throw r1
        L_0x0a53:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.notification.MessageOTPNotificationBroadcastReceiver r0 = (com.obwhatsapp.notification.MessageOTPNotificationBroadcastReceiver) r0
            java.lang.Object r2 = r5.A01
            X.0tZ r2 = (X.C16740tZ) r2
            X.17V r1 = r0.A02
            X.1cb r2 = (X.C30571cb) r2
            java.lang.Integer r0 = X.C13680ns.A0Z()
            r1.A06(r2, r0)
            return
        L_0x0a67:
            java.lang.Object r0 = r5.A00
            X.500 r0 = (X.AnonymousClass500) r0
            java.lang.Object r2 = r5.A01
            X.1Vv r2 = (X.C28371Vv) r2
            X.13O r0 = r0.A00
            X.1Tw r1 = r0.A09
            r0 = 0
            r1.A04(r0, r2)
            return
        L_0x0a78:
            java.lang.Object r0 = r5.A00
            X.4yB r0 = (X.C101964yB) r0
            X.12h r0 = r0.A02
            X.12g r0 = r0.A0A
            r0.A05()
            return
        L_0x0a84:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.picker.searchexpressions.ExpressionSearchViewModel r4 = (com.obwhatsapp.picker.searchexpressions.ExpressionSearchViewModel) r4
            java.lang.Object r5 = r5.A01
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            X.027 r9 = r4.A0A
            java.lang.Object r0 = r9.A01()
            X.AnonymousClass00B.A06(r0)
            X.027 r7 = r4.A09
            java.lang.Object r0 = r7.A01()
            X.AnonymousClass00B.A06(r0)
            X.027 r8 = r4.A0C
            java.lang.Object r0 = r8.A01()
            X.AnonymousClass00B.A06(r0)
            X.027 r6 = r4.A08
            java.lang.Object r0 = r6.A01()
            X.AnonymousClass00B.A06(r0)
            int r0 = r5.length()
            r3 = 2
            if (r0 <= 0) goto L_0x0aef
            r2 = 1
            java.lang.String r1 = r5.toString()
            X.4IS r0 = new X.4IS
            r0.<init>(r2, r1)
            r9.A0B(r0)
            X.4Em r0 = new X.4Em
            r0.<init>(r3)
            r7.A0B(r0)
        L_0x0acc:
            java.lang.String r2 = r5.toString()
            X.1BQ r1 = r4.A04
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0ae4
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0ae4
            r0 = 1
            X.2X4 r0 = r1.A00(r2, r0)
            r0.A00(r4)
        L_0x0ae4:
            java.lang.String r0 = r5.toString()
            r4.A09(r0)
            r0 = 0
            r4.A07 = r0
            return
        L_0x0aef:
            r2 = 0
            java.lang.String r1 = ""
            X.4IS r0 = new X.4IS
            r0.<init>(r2, r1)
            r9.A0B(r0)
            X.4Em r0 = new X.4Em
            r0.<init>(r3)
            r7.A0B(r0)
            X.4En r0 = new X.4En
            r0.<init>(r2)
            r8.A0B(r0)
            X.4En r0 = new X.4En
            r0.<init>(r2)
            r6.A0B(r0)
            X.027 r3 = r4.A0B
            java.lang.Object r0 = r3.A01()
            if (r0 == 0) goto L_0x0b2c
            java.lang.Object r0 = r3.A01()
            X.4Ze r0 = (X.C87924Ze) r0
            java.util.List r2 = r0.A01
        L_0x0b22:
            r1 = 0
            X.4Ze r0 = new X.4Ze
            r0.<init>(r1, r2)
            r3.A0B(r0)
            goto L_0x0acc
        L_0x0b2c:
            java.util.ArrayList r2 = X.C13690nt.A0i(r2)
            goto L_0x0b22
        L_0x0b31:
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.pnh.RequestPhoneNumberViewModel r1 = (com.obwhatsapp.pnh.RequestPhoneNumberViewModel) r1
            java.lang.Object r0 = r5.A01
            X.1ZX r0 = (X.AnonymousClass1ZX) r0
            r1.A06(r0)
            return
        L_0x0b3d:
            java.lang.Object r1 = r5.A00
            X.22J r1 = (X.AnonymousClass22J) r1
            java.lang.Object r0 = r5.A01
            if (r1 != 0) goto L_0x0b4c
            return
        L_0x0b46:
            java.lang.Object r1 = r5.A00
            X.22J r1 = (X.AnonymousClass22J) r1
            java.lang.Object r0 = r5.A01
        L_0x0b4c:
            r1.AIU(r0)
            return
        L_0x0b50:
            java.lang.Object r2 = r5.A00
            X.22J r2 = (X.AnonymousClass22J) r2
            java.lang.Object r1 = r5.A01
            r0 = 0
            X.C18450wi.A0H(r2, r0)
            goto L_0x0b69
        L_0x0b5b:
            java.lang.Object r2 = r5.A00
            X.22J r2 = (X.AnonymousClass22J) r2
            java.lang.Object r1 = r5.A01
            r0 = 0
            X.C18450wi.A0H(r2, r0)
            r0 = 1
            X.C18450wi.A0H(r1, r0)
        L_0x0b69:
            r2.AIU(r1)
            return
        L_0x0b6d:
            r7.APb(r9)
            return
        L_0x0b71:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0b71 }
            throw r1
        L_0x0b74:
            r8 = 503(0x1f7, float:7.05E-43)
            java.lang.String r1 = "ExportFlowManager/Failed to register encryption metadata file."
            X.40S r0 = new X.40S     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r0.<init>(r8, r1)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            throw r0     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
        L_0x0b7e:
            r0 = move-exception
            r9.endObject()     // Catch:{ all -> 0x0b88 }
            r9.flush()     // Catch:{ all -> 0x0b88 }
            r11.closeEntry()     // Catch:{ all -> 0x0b88 }
        L_0x0b88:
            throw r0     // Catch:{ all -> 0x0b89 }
        L_0x0b89:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0b8d }
        L_0x0b8d:
            throw r0     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
        L_0x0b8e:
            r8 = 502(0x1f6, float:7.03E-43)
            java.lang.String r1 = "ExportFlowManager/Failed to register master file."
            X.40S r0 = new X.40S     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            r0.<init>(r8, r1)     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
            throw r0     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
        L_0x0b98:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0b98 }
            throw r0     // Catch:{ OperationCanceledException -> 0x0c7f, Exception -> 0x0b9b }
        L_0x0b9b:
            r10 = move-exception
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/failed"
            com.whatsapp.util.Log.e(r0, r10)     // Catch:{ all -> 0x0c67 }
            boolean r0 = r10 instanceof X.C108875Pv     // Catch:{ all -> 0x0c67 }
            if (r0 == 0) goto L_0x0bcc
            r0 = r10
            X.5Pv r0 = (X.C108875Pv) r0     // Catch:{ all -> 0x0c67 }
            int r4 = r0.ADj()     // Catch:{ all -> 0x0c67 }
            r0 = 103(0x67, float:1.44E-43)
            if (r4 == r0) goto L_0x0bbd
            switch(r4) {
                case 501: goto L_0x0bba;
                case 502: goto L_0x0bb7;
                case 503: goto L_0x0bb4;
                default: goto L_0x0bb3;
            }     // Catch:{ all -> 0x0c67 }
        L_0x0bb3:
            goto L_0x0bc0
        L_0x0bb4:
            r18 = 12
            goto L_0x0bcc
        L_0x0bb7:
            r18 = 8
            goto L_0x0bcc
        L_0x0bba:
            r18 = 9
            goto L_0x0bcc
        L_0x0bbd:
            r18 = 13
            goto L_0x0bcc
        L_0x0bc0:
            X.0so r8 = r7.A02     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0c67 }
            java.lang.String r0 = "xpm-export-unexpected-migration-error-code"
            r8.AcB(r0, r1, r6)     // Catch:{ all -> 0x0c67 }
        L_0x0bcc:
            boolean r0 = r10 instanceof X.C76983v2     // Catch:{ all -> 0x0c67 }
            if (r0 == 0) goto L_0x0beb
            java.lang.String r9 = "EncryptionKeyException"
        L_0x0bd2:
            X.0so r8 = r7.A02     // Catch:{ all -> 0x0c67 }
            java.lang.String r6 = "xpm-export-failed"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0c67 }
            r1.append(r4)     // Catch:{ all -> 0x0c67 }
            java.lang.String r0 = "; "
            r1.append(r0)     // Catch:{ all -> 0x0c67 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r9, r1)     // Catch:{ all -> 0x0c67 }
            r8.A03(r6, r0, r10)     // Catch:{ all -> 0x0c67 }
            goto L_0x0bf0
        L_0x0beb:
            java.lang.String r9 = X.AnonymousClass000.A0c(r10)     // Catch:{ all -> 0x0c67 }
            goto L_0x0bd2
        L_0x0bf0:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r7)
            java.util.concurrent.CountDownLatch r0 = r7.A01     // Catch:{ all -> 0x0c64 }
            r0.countDown()     // Catch:{ all -> 0x0c64 }
            r7.A01 = r2     // Catch:{ all -> 0x0c64 }
            r7.A00 = r2     // Catch:{ all -> 0x0c64 }
            monitor-exit(r7)     // Catch:{ all -> 0x0c64 }
            X.C13690nt.A10(r3)
            X.0su r6 = r7.A0B
            java.lang.String r8 = r6.A02()
            X.01D r0 = r7.A0L
            java.lang.Object r10 = r0.get()
            X.1Hj r10 = (X.C24811Hj) r10
            X.01D r0 = r7.A0M
            java.lang.Object r0 = r0.get()
            X.0pf r0 = (X.C14730pf) r0
            long r1 = r0.A02()
            X.3sl r3 = new X.3sl
            r3.<init>()
            r3.A09 = r8
            java.lang.Integer r0 = X.C13680ns.A0Y()
            r3.A03 = r0
            java.lang.Integer r0 = X.C13690nt.A0T()
            r3.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r3.A04 = r0
            long r8 = r7.A00()
            long r8 = X.C13690nt.A09(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r3.A07 = r0
            int r0 = r5.A00
            java.lang.Long r0 = X.C13690nt.A0W(r0)
            r3.A08 = r0
            long r0 = r10.A01(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A06 = r0
            X.0t9 r0 = r7.A06
            r0.A04(r3)
            r6.A03()
            X.0ut r0 = r7.A0F
            r0.A04(r4)
            goto L_0x0c92
        L_0x0c64:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0c64 }
            throw r1
        L_0x0c67:
            r1 = move-exception
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r7)
            java.util.concurrent.CountDownLatch r0 = r7.A01     // Catch:{ all -> 0x0c7c }
            r0.countDown()     // Catch:{ all -> 0x0c7c }
            r7.A01 = r2     // Catch:{ all -> 0x0c7c }
            r7.A00 = r2     // Catch:{ all -> 0x0c7c }
            monitor-exit(r7)     // Catch:{ all -> 0x0c7c }
            X.C13690nt.A10(r3)
            throw r1
        L_0x0c7c:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0c7c }
            throw r1
        L_0x0c7f:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r7)
            java.util.concurrent.CountDownLatch r0 = r7.A01     // Catch:{ all -> 0x0c9b }
            r0.countDown()     // Catch:{ all -> 0x0c9b }
            r7.A01 = r2     // Catch:{ all -> 0x0c9b }
            r7.A00 = r2     // Catch:{ all -> 0x0c9b }
            monitor-exit(r7)     // Catch:{ all -> 0x0c9b }
            X.C13690nt.A10(r3)
        L_0x0c92:
            X.0ut r0 = r7.A0F
            r0.A03(r5)
            r7.A05()
            return
        L_0x0c9b:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0c9b }
            throw r1
        L_0x0c9e:
            java.lang.String r0 = "ExportFlowManager/prepareExportData() already running, cannot start another export."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0ca5 }
            throw r0     // Catch:{ all -> 0x0ca5 }
        L_0x0ca5:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0ca5 }
            throw r1
        L_0x0ca8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape14S0200000_I1_2.run():void");
    }
}
