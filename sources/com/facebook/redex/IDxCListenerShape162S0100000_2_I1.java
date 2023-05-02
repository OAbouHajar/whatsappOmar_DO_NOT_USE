package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape162S0100000_2_I1 implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape162S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r0.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        X.AnonymousClass29T.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0029;
                case 1: goto L_0x0031;
                case 2: goto L_0x0039;
                case 3: goto L_0x004d;
                case 4: goto L_0x0059;
                case 5: goto L_0x006a;
                case 6: goto L_0x0076;
                case 7: goto L_0x0085;
                case 8: goto L_0x008d;
                case 9: goto L_0x008d;
                case 10: goto L_0x0093;
                case 11: goto L_0x0005;
                case 12: goto L_0x000d;
                case 13: goto L_0x000e;
                case 14: goto L_0x009c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A00
            X.0tT r1 = (X.C16690tT) r1
            r0 = 1
            r1.A06(r0)
        L_0x000d:
            return
        L_0x000e:
            java.lang.Object r3 = r4.A00
            X.37E r3 = (X.AnonymousClass37E) r3
            android.app.ProgressDialog r0 = r3.A00
            if (r0 == 0) goto L_0x0019
            r0.dismiss()
        L_0x0019:
            r2 = 0
            r3.A00 = r2
            r0 = 1
            r3.A06(r0)
            com.obwhatsapp.profile.WebImagePicker r1 = r3.A02
            X.37E r0 = r1.A0B
            if (r0 != r3) goto L_0x000d
            r1.A0B = r2
            return
        L_0x0029:
            java.lang.Object r0 = r4.A00
            X.5RM r0 = (X.AnonymousClass5RM) r0
            r0.AVz()
            return
        L_0x0031:
            java.lang.Object r0 = r4.A00
            X.5OZ r0 = (X.AnonymousClass5OZ) r0
            r0.AVz()
            return
        L_0x0039:
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = (com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity) r0
            X.0qW r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r0 = (com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r0
            X.1cy r1 = r0.A0C
            X.41F r0 = X.AnonymousClass41F.CLOSE_SCREEN
            r1.A0B(r0)
            return
        L_0x004d:
            java.lang.Object r1 = r4.A00
            X.2YL r1 = (X.AnonymousClass2YL) r1
            java.lang.String r0 = "settings-gdrive/gps-unavailable-and-user-declined-install"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.ConditionVariable r0 = r1.A0V
            goto L_0x0081
        L_0x0059:
            java.lang.Object r0 = r4.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r1 = r0.A0C()
            X.AnonymousClass00B.A06(r1)
            X.2YL r1 = (X.AnonymousClass2YL) r1
            r0 = 1
            r1.A0X = r0
            return
        L_0x006a:
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r1 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r1
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-unavailable/user declined to install Google Play Services."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.ConditionVariable r0 = r1.A0o
            goto L_0x0081
        L_0x0076:
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r1 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r1
            java.lang.String r0 = "settings-gdrive/gps-unavailable-and-user-declined-install"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.ConditionVariable r0 = r1.A0n
        L_0x0081:
            r0.open()
            return
        L_0x0085:
            java.lang.Object r0 = r4.A00
            X.4v1 r0 = (X.C100054v1) r0
            android.app.Activity r1 = r0.A02
            r0 = 1
            goto L_0x00a2
        L_0x008d:
            java.lang.Object r0 = r4.A00
            X.AnonymousClass3K4.A0y(r0)
            return
        L_0x0093:
            java.lang.Object r0 = r4.A00
            X.2uz r0 = (X.C59182uz) r0
            android.app.Activity r1 = r0.A01
            int r0 = r0.A07
            goto L_0x00a2
        L_0x009c:
            java.lang.Object r1 = r4.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 13
        L_0x00a2:
            X.AnonymousClass29T.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape162S0100000_2_I1.onCancel(android.content.DialogInterface):void");
    }
}
