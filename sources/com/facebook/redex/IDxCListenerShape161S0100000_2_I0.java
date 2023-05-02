package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape161S0100000_2_I0 implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape161S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        X.AnonymousClass29T.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        X.AnonymousClass29T.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x009c;
                case 1: goto L_0x0096;
                case 2: goto L_0x0088;
                case 3: goto L_0x0077;
                case 4: goto L_0x006f;
                case 5: goto L_0x005c;
                case 6: goto L_0x0019;
                case 7: goto L_0x004f;
                case 8: goto L_0x0045;
                case 9: goto L_0x000d;
                case 10: goto L_0x0037;
                case 11: goto L_0x002d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.status.playback.MessageReplyActivity r0 = (com.obwhatsapp.status.playback.MessageReplyActivity) r0
            r0.A36()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r3.A00
            X.29S r1 = (X.AnonymousClass29S) r1
            boolean r0 = r1.A0r
            if (r0 == 0) goto L_0x000c
            r1.A06()
            return
        L_0x0019:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r2 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r2
            X.00l r1 = r2.A0C()
            r0 = 1
            X.AnonymousClass29T.A00(r1, r0)
            X.05J r0 = r2.A0J
            if (r0 == 0) goto L_0x000c
            r0.A05()
            return
        L_0x002d:
            java.lang.Object r1 = r3.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            X.AnonymousClass29T.A00(r1, r0)
            r0 = 6
            goto L_0x0041
        L_0x0037:
            java.lang.Object r1 = r3.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 7
            X.AnonymousClass29T.A00(r1, r0)
            r0 = 8
        L_0x0041:
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x0045:
            java.lang.Object r0 = r3.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r1 = r0.A0C()
            r0 = 3
            goto L_0x0058
        L_0x004f:
            java.lang.Object r0 = r3.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r1 = r0.A0C()
            r0 = 2
        L_0x0058:
            X.AnonymousClass29T.A00(r1, r0)
            return
        L_0x005c:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.269 r0 = r0.A0M
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "viewModel"
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x006b:
            r0.A08()
            return
        L_0x006f:
            java.lang.Object r0 = r3.A00
            X.0z7 r0 = (X.C19860z7) r0
            r0.A00()
            return
        L_0x0077:
            java.lang.Object r0 = r3.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r1 = r0.A0C()
            X.AnonymousClass00B.A06(r1)
            com.obwhatsapp.backup.google.SettingsGoogleDrive r1 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r1
            r0 = 1
            r1.A0p = r0
            return
        L_0x0088:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r1 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r1
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-error-dialog/user declined to install Google Play Services."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 1
            r1.A3R(r0)
            return
        L_0x0096:
            java.lang.Object r0 = r3.A00
            X.AnonymousClass3K4.A0y(r0)
            return
        L_0x009c:
            java.lang.Object r0 = r3.A00
            X.AnonymousClass3K4.A0y(r0)
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape161S0100000_2_I0.onCancel(android.content.DialogInterface):void");
    }
}
