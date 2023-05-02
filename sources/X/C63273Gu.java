package X;

import com.obwhatsapp.backup.google.SettingsGoogleDrive;

/* renamed from: X.3Gu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63273Gu implements AnonymousClass5QK {
    public final /* synthetic */ SettingsGoogleDrive A00;
    public final /* synthetic */ AnonymousClass2GY A01;

    public /* synthetic */ C63273Gu(SettingsGoogleDrive settingsGoogleDrive, AnonymousClass2GY r2) {
        this.A00 = settingsGoogleDrive;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0118, code lost:
        if (r1 == 2) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011a, code lost:
        if (r2 == 1) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0140, code lost:
        com.whatsapp.util.Log.e(X.C13680ns.A0c(r1, "settings-gdrive/perform-backup/unknown-network-type/"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AT1(int r7) {
        /*
            r6 = this;
            com.obwhatsapp.backup.google.SettingsGoogleDrive r4 = r6.A00
            X.2GY r3 = r6.A01
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0a
            r5 = 1
            X.027 r0 = r0.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r0.A09(r1)
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0a
            X.027 r0 = r0.A0B
            r0.A09(r1)
            if (r7 != 0) goto L_0x0045
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0a
            r0.A07()
            X.0rz r0 = r4.A09
            int r0 = r0.A06()
            if (r0 == 0) goto L_0x0045
            X.AnonymousClass00B.A01()
            X.0yo r0 = r4.A0V
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0045
            X.0rz r0 = r4.A09
            java.lang.String r0 = r0.A0M()
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "settings-gdrive/perform-backup/account/null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131886416(0x7f120150, float:1.940741E38)
        L_0x0042:
            r4.Afg(r0)
        L_0x0045:
            r1 = 0
        L_0x0046:
            int r0 = X.C40691uX.A00(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
            java.lang.Integer r0 = X.C13690nt.A0T()
            r3.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A00 = r0
            X.0t9 r0 = r4.A0i
            r0.A06(r3)
            return
        L_0x0062:
            X.0rz r0 = r4.A09
            boolean r0 = X.AnonymousClass2GK.A0G(r0)
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = "settings-gdrive/perform-backup/backup/pending"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0a
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0e
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0084
            X.0rz r0 = r4.A09
            int r1 = r0.A08()
            r0 = 10
            if (r1 == r0) goto L_0x008d
        L_0x0084:
            android.view.View$OnClickListener r1 = r4.A02
            if (r1 == 0) goto L_0x008d
            r0 = 0
            r1.onClick(r0)
            goto L_0x0045
        L_0x008d:
            r0 = 2131891534(0x7f12154e, float:1.941779E38)
            goto L_0x0042
        L_0x0091:
            X.0rz r0 = r4.A09
            boolean r0 = X.AnonymousClass2GK.A0H(r0)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = "settings-gdrive/perform-backup/restore-media/running"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131891588(0x7f121584, float:1.94179E38)
            goto L_0x0042
        L_0x00a3:
            X.0rz r0 = r4.A09
            int r2 = r0.A07()
            X.0wP r0 = r4.A07
            int r1 = r0.A04(r5)
            if (r1 != 0) goto L_0x00c3
            r0 = 2131891572(0x7f121574, float:1.9417868E38)
            if (r2 != 0) goto L_0x00b9
            r0 = 2131891573(0x7f121575, float:1.941787E38)
        L_0x00b9:
            r4.Afg(r0)
            java.lang.String r0 = "settings-gdrive/perform-backup/no-data-connection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0045
        L_0x00c3:
            r0 = 3
            if (r1 != r0) goto L_0x00d7
            r0 = 2131888476(0x7f12095c, float:1.9411588E38)
            if (r2 != 0) goto L_0x00ce
            r0 = 2131888478(0x7f12095e, float:1.9411592E38)
        L_0x00ce:
            r4.Afg(r0)
        L_0x00d1:
            r4.A3B()
            r1 = 1
            goto L_0x0046
        L_0x00d7:
            r0 = 2
            if (r1 != r0) goto L_0x0116
            if (r2 != 0) goto L_0x011a
            r5 = 13
            X.2kX r1 = new X.2kX
            r1.<init>(r5)
            r0 = 2131893153(0x7f121ba1, float:1.9421074E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A06(r0)
            r0 = 2131888477(0x7f12095d, float:1.941159E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A02(r0)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A03(r0)
            r0 = 2131886415(0x7f12014f, float:1.9407408E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A05(r0)
            com.obwhatsapp.backup.google.PromptDialogFragment r2 = r1.A00()
            boolean r0 = r4.A3G()
            if (r0 != 0) goto L_0x0045
            goto L_0x0123
        L_0x0116:
            if (r1 == r5) goto L_0x011c
            if (r1 != r0) goto L_0x0140
        L_0x011a:
            if (r2 != r5) goto L_0x0140
        L_0x011c:
            java.lang.String r0 = "settings-gdrive/perform-backup/start-gdrive-backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00d1
        L_0x0123:
            X.050 r1 = X.C13680ns.A0O(r4)     // Catch:{ IllegalStateException -> 0x0133 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ IllegalStateException -> 0x0133 }
            r1.A0C(r2, r0)     // Catch:{ IllegalStateException -> 0x0133 }
            r1.A02()     // Catch:{ IllegalStateException -> 0x0133 }
            goto L_0x0045
        L_0x0133:
            r1 = move-exception
            java.lang.String r0 = "settings-gdrive/perform-backup"
            com.whatsapp.util.Log.e(r0, r1)
            r4.A3B()
            r1 = 1
            goto L_0x0046
        L_0x0140:
            java.lang.String r0 = "settings-gdrive/perform-backup/unknown-network-type/"
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63273Gu.AT1(int):void");
    }
}
