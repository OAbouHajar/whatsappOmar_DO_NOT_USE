package com.facebook.redex;

import android.content.BroadcastReceiver;

public class IDxBReceiverShape7S0100000_2_I0 extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public IDxBReceiverShape7S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0220, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0222, code lost:
        r2.setAction(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0225, code lost:
        r2.setFlags(335544320);
        r4.startActivity(r2);
        r4.unregisterReceiver(r6);
        r5.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0233, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        com.whatsapp.util.Log.i(r0);
        r1 = (com.obwhatsapp.gallery.MediaGalleryFragmentBase) r6.A00;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        com.whatsapp.util.Log.i(r0);
        r1 = (com.obwhatsapp.gallery.MediaGalleryFragmentBase) r6.A00;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        r1.A1I(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0124, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0127, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a0, code lost:
        com.whatsapp.util.Log.w(X.AnonymousClass000.A0g(r0, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x020f, code lost:
        r2 = X.C13680ns.A09();
        r2.setClassName(r4.getPackageName(), "com.obwhatsapp.backup.google.SettingsGoogleDrive");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0234;
                case 1: goto L_0x0200;
                case 2: goto L_0x01d5;
                case 3: goto L_0x01c5;
                case 4: goto L_0x01ac;
                case 5: goto L_0x0128;
                case 6: goto L_0x010f;
                case 7: goto L_0x00d8;
                case 8: goto L_0x0005;
                case 9: goto L_0x013b;
                case 10: goto L_0x0005;
                case 11: goto L_0x00c1;
                case 12: goto L_0x01a8;
                case 13: goto L_0x0088;
                case 14: goto L_0x0072;
                case 15: goto L_0x017e;
                case 16: goto L_0x0166;
                case 17: goto L_0x005e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = r8.getAction()
            if (r1 == 0) goto L_0x0012
            int r0 = r1.hashCode()
            switch(r0) {
                case -1514214344: goto L_0x0013;
                case -1142424621: goto L_0x0048;
                case -963871873: goto L_0x0035;
                case -625887599: goto L_0x002a;
                case 1412829408: goto L_0x001f;
                default: goto L_0x0012;
            }
        L_0x0012:
            return
        L_0x0013:
            java.lang.String r0 = "android.intent.action.MEDIA_MOUNTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_MOUNTED"
            goto L_0x0124
        L_0x001f:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_STARTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED"
            goto L_0x0052
        L_0x002a:
            java.lang.String r0 = "android.intent.action.MEDIA_EJECT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_EJECT"
            goto L_0x003f
        L_0x0035:
            java.lang.String r0 = "android.intent.action.MEDIA_UNMOUNTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED"
        L_0x003f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r6.A00
            com.obwhatsapp.gallery.MediaGalleryFragmentBase r1 = (com.obwhatsapp.gallery.MediaGalleryFragmentBase) r1
            r0 = 1
            goto L_0x005a
        L_0x0048:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_FINISHED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_FINISHED"
        L_0x0052:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r6.A00
            com.obwhatsapp.gallery.MediaGalleryFragmentBase r1 = (com.obwhatsapp.gallery.MediaGalleryFragmentBase) r1
            r0 = 0
        L_0x005a:
            r1.A1I(r0)
            return
        L_0x005e:
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "android.nfc.action.ADAPTER_STATE_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r6.A00
            X.00k r0 = (X.C000900k) r0
            r0.invalidateOptionsMenu()
            return
        L_0x0072:
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.obwhatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r6.A00
            X.0xk r0 = (X.C19090xk) r0
            X.1Vm r0 = r0.A0h
            r0.AcG()
            return
        L_0x0088:
            java.lang.String r0 = r8.getAction()
            if (r0 == 0) goto L_0x0012
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "android.location.PROVIDERS_CHANGED"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Object r4 = r6.A00
            X.291 r4 = (X.AnonymousClass291) r4
            X.16R r0 = r4.A0x
            boolean r3 = r0.A07()
            boolean r0 = r4.A0q
            if (r0 == r3) goto L_0x0012
            r4.A0q = r3
            X.1sx r0 = r4.A0n
            r1 = 0
            if (r0 == 0) goto L_0x00b5
            if (r3 == 0) goto L_0x00bb
            r0 = 1
            r4.A0p = r0
        L_0x00b5:
            r4.A0D = r1
            r4.A0I()
            return
        L_0x00bb:
            r0.A05 = r1
            r4.A0H()
            goto L_0x00b5
        L_0x00c1:
            java.lang.Object r2 = r6.A00
            X.0yu r2 = (X.C19730yu) r2
            X.0xR r1 = r2.A08
            r0 = 0
            r1.A00 = r0
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x0012
            X.0yL r1 = r2.A0e
            r0 = 8
            r1.A01(r0)
            return
        L_0x00d8:
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0012
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x0012
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0012
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0012
            java.lang.Object r2 = r6.A00
            X.25g r2 = (X.C447225g) r2
            X.1ZF r0 = r2.A0a
            if (r0 == 0) goto L_0x0104
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A1y
            if (r0 != 0) goto L_0x0012
        L_0x0104:
            java.lang.String r0 = "voip/unlockReceiver generate headsup notification when user unlock the screen in RECEIVED_CALL state"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 1
            r0 = 0
            r2.A0m(r3, r1, r0)
            return
        L_0x010f:
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r6.A00
            X.25g r0 = (X.C447225g) r0
            r0.A0K()
            java.lang.String r0 = "Screen is being turned off"
        L_0x0124:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0128:
            java.lang.Object r1 = r6.A00
            X.16G r1 = (X.AnonymousClass16G) r1
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "reload commerce translation metadata since locale changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A01()
            return
        L_0x013b:
            java.lang.Object r2 = r6.A00     // Catch:{ Exception -> 0x015f }
            X.1yj r2 = (X.C42821yj) r2     // Catch:{ Exception -> 0x015f }
            X.1yV r0 = r2.A22     // Catch:{ Exception -> 0x015f }
            r0.unregisterReceiver(r6)     // Catch:{ Exception -> 0x015f }
            java.lang.String r0 = "conversation/reset-ime"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x015f }
            X.1yV r0 = r2.A22     // Catch:{ Exception -> 0x015f }
            X.0pN r0 = (X.C14550pN) r0     // Catch:{ Exception -> 0x015f }
            X.01V r0 = r0.A08     // Catch:{ Exception -> 0x015f }
            android.view.inputmethod.InputMethodManager r1 = r0.A0Q()     // Catch:{ Exception -> 0x015f }
            X.AnonymousClass00B.A06(r1)     // Catch:{ Exception -> 0x015f }
            com.obwhatsapp.mentions.MentionableEntry r0 = r2.A37     // Catch:{ Exception -> 0x015f }
            r1.restartInput(r0)     // Catch:{ Exception -> 0x015f }
            r0 = 0
            r2.A04 = r0     // Catch:{ Exception -> 0x015f }
            return
        L_0x015f:
            r1 = move-exception
            java.lang.String r0 = "conversation/unregister user present receiver "
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0166:
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017b
            java.lang.Object r1 = r6.A00
            X.1Vl r1 = (X.AnonymousClass1Vl) r1
            r0 = 0
            r1.A00(r0)
            return
        L_0x017b:
            java.lang.String r0 = "unknown intent received in connectivity receiver "
            goto L_0x01a0
        L_0x017e:
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.obwhatsapp.MessageHandler.RECONNECT_ACTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = "xmpp/handler/reconnect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r6.A00
            X.0xk r2 = (X.C19090xk) r2
            r1 = 0
            java.lang.String r0 = "connect_reason"
            int r0 = r8.getIntExtra(r0, r1)
            r2.A08(r0)
            return
        L_0x019e:
            java.lang.String r0 = "unknown intent received in reconnect receiver "
        L_0x01a0:
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r8)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x01a8:
            X.C28891Zc.A09()
            return
        L_0x01ac:
            java.lang.String r0 = "gdrive-notification-manager/user-decided-to-restore-over-low-battery"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r6.A00
            X.12Q r1 = (X.AnonymousClass12Q) r1
            X.0yo r0 = r1.A0G
            r0.A03()
            X.0tz r0 = r1.A0J
            android.content.Context r0 = r0.A00
            r0.unregisterReceiver(r6)
            r1.A03()
            return
        L_0x01c5:
            java.lang.String r0 = "gdrive-notification-manager/user-decided-to-restore-over-data-connection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r5 = r6.A00
            X.12Q r5 = (X.AnonymousClass12Q) r5
            X.0tz r0 = r5.A0J
            android.content.Context r4 = r0.A00
            java.lang.String r3 = "action_perform_media_restore_over_cellular"
            goto L_0x020f
        L_0x01d5:
            java.lang.String r0 = "gdrive-notification-manager/user-decided-to-restore-over-low-battery"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r4 = r6.A00
            X.12Q r4 = (X.AnonymousClass12Q) r4
            X.0yo r3 = r4.A0G
            r0 = 1
            r3.A08 = r0
            X.12s r0 = r3.A0O
            X.2Cv r0 = r0.A00
            r3.A08(r0)
            X.0sq r2 = r3.A0Y
            r1 = 6
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r3, r1)
            r2.Acl(r0)
            X.0tz r0 = r4.A0J
            android.content.Context r0 = r0.A00
            r0.unregisterReceiver(r6)
            r4.A03()
            return
        L_0x0200:
            java.lang.String r0 = "gdrive-notification-manager/user-decided-to-backup-over-data-connection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r5 = r6.A00
            X.12Q r5 = (X.AnonymousClass12Q) r5
            X.0tz r0 = r5.A0J
            android.content.Context r4 = r0.A00
            java.lang.String r3 = "action_perform_backup_over_cellular"
        L_0x020f:
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.backup.google.SettingsGoogleDrive"
            r2.setClassName(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0225
            r2.setAction(r3)
        L_0x0225:
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r2.setFlags(r0)
            r4.startActivity(r2)
            r4.unregisterReceiver(r6)
            r5.A03()
            return
        L_0x0234:
            java.lang.Object r0 = r6.A00
            X.16k r0 = (X.C220416k) r0
            X.0sq r2 = r0.A05
            r1 = 30
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r0 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1
            r0.<init>(r6, r1, r7)
            r2.Acl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxBReceiverShape7S0100000_2_I0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
