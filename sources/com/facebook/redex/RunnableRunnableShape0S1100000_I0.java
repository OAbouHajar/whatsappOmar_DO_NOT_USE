package com.facebook.redex;

import X.AnonymousClass1GF;
import X.AnonymousClass1N0;
import com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel;

public class RunnableRunnableShape0S1100000_I0 implements Runnable {
    public Object A00;
    public String A01;
    public final int A02;

    public RunnableRunnableShape0S1100000_I0(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public RunnableRunnableShape0S1100000_I0(AnonymousClass1GF r2) {
        this.A02 = 37;
        this.A00 = r2;
        this.A01 = "message-utils-build-fmessage";
    }

    public RunnableRunnableShape0S1100000_I0(AnonymousClass1N0 r2) {
        this.A02 = 17;
        this.A00 = r2;
        this.A01 = "daily_cron_job";
    }

    public RunnableRunnableShape0S1100000_I0(LinkedDevicesSharedViewModel linkedDevicesSharedViewModel, String str) {
        this.A02 = 25;
        this.A00 = linkedDevicesSharedViewModel;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0803, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0806, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:278:0x080b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:271:0x0800=Splitter:B:271:0x0800, B:278:0x080b=Splitter:B:278:0x080b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r5 = r16
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0811;
                case 1: goto L_0x0039;
                case 2: goto L_0x00a3;
                case 3: goto L_0x00b0;
                case 4: goto L_0x00c8;
                case 5: goto L_0x00e4;
                case 6: goto L_0x0105;
                case 7: goto L_0x0129;
                case 8: goto L_0x014e;
                case 9: goto L_0x0173;
                case 10: goto L_0x017d;
                case 11: goto L_0x018e;
                case 12: goto L_0x01b0;
                case 13: goto L_0x01bb;
                case 14: goto L_0x01e0;
                case 15: goto L_0x01ec;
                case 16: goto L_0x01f8;
                case 17: goto L_0x0205;
                case 18: goto L_0x020f;
                case 19: goto L_0x0228;
                case 20: goto L_0x0262;
                case 21: goto L_0x0283;
                case 22: goto L_0x0298;
                case 23: goto L_0x02a2;
                case 24: goto L_0x02ac;
                case 25: goto L_0x02c7;
                case 26: goto L_0x0343;
                case 27: goto L_0x0361;
                case 28: goto L_0x03a5;
                case 29: goto L_0x03ef;
                case 30: goto L_0x040c;
                case 31: goto L_0x0424;
                case 32: goto L_0x04ed;
                case 33: goto L_0x052c;
                case 34: goto L_0x05bd;
                case 35: goto L_0x05c7;
                case 36: goto L_0x05d3;
                case 37: goto L_0x05eb;
                case 38: goto L_0x060c;
                case 39: goto L_0x0694;
                case 40: goto L_0x06b5;
                case 41: goto L_0x06f8;
                case 42: goto L_0x0709;
                case 43: goto L_0x071b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A00
            X.1Lu r0 = (X.C25961Lu) r0
            java.lang.String r7 = r5.A01
            X.1Lx r0 = r0.A00
            X.AnonymousClass00B.A00()
            X.0tc r0 = r0.A00
            X.0tf r6 = r0.A02()
            X.1cj r5 = r6.A00()     // Catch:{ all -> 0x080c }
            X.0tg r4 = r6.A02     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = "draft_voice_note_metadata"
            java.lang.String r2 = "chat_jid=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0033 }
            r0 = 0
            r1[r0] = r7     // Catch:{ all -> 0x0033 }
            r4.A01(r3, r2, r1)     // Catch:{ all -> 0x0033 }
            r5.A00()     // Catch:{ all -> 0x0033 }
            r5.close()     // Catch:{ all -> 0x080c }
            goto L_0x0803
        L_0x0033:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x080b }
            goto L_0x080b
        L_0x0039:
            java.lang.Object r6 = r5.A00
            X.0pl r6 = (X.C14790pl) r6
            java.lang.String r4 = r5.A01
            android.widget.TextView r5 = r6.A05
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x085b
            android.view.ViewParent r3 = r5.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.07m r2 = new X.07m
            r2.<init>()
            r2.A06(r5)
            r0 = 300(0x12c, double:1.48E-321)
            r2.A04(r0)
            X.C015807o.A02(r3, r2)
            r5.setText(r4)
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r4 = r0.getResources()
            X.013 r0 = r6.A06
            boolean r0 = r0.A0T()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0093
            int r3 = r5.getPaddingLeft()
            int r2 = r5.getPaddingTop()
            r0 = 2131167078(0x7f070766, float:1.794842E38)
            int r1 = r4.getDimensionPixelSize(r0)
        L_0x0081:
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r3, r2, r1, r0)
            r0 = 2131167077(0x7f070765, float:1.7948417E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r5.setCompoundDrawablePadding(r0)
            return
        L_0x0093:
            r0 = 2131167078(0x7f070766, float:1.794842E38)
            int r3 = r4.getDimensionPixelSize(r0)
            int r2 = r5.getPaddingTop()
            int r1 = r5.getPaddingRight()
            goto L_0x0081
        L_0x00a3:
            java.lang.Object r0 = r5.A00
            X.1kV r0 = (X.C34581kV) r0
            java.lang.String r2 = r5.A01
            X.12w r1 = r0.A01
            r0 = 0
            r1.A02(r2, r0)
            return
        L_0x00b0:
            java.lang.Object r3 = r5.A00
            X.0tO r3 = (X.C16640tO) r3
            java.lang.String r2 = r5.A01
            java.lang.ref.WeakReference r0 = r3.A02
            java.lang.Object r1 = r0.get()
            X.0tP r1 = (X.C16650tP) r1
            if (r1 == 0) goto L_0x00c4
            r0 = 3
            r1.A06(r0)
        L_0x00c4:
            r3.A00(r2)
            return
        L_0x00c8:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            java.lang.String r1 = r5.A01
            X.0ps r0 = r4.A06
            java.lang.String r0 = r0.A01()
            boolean r3 = r0.equals(r1)
            X.0pt r2 = r4.A04
            r1 = 1
            com.facebook.redex.RunnableRunnableShape0S0110000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0110000_I0
            r0.<init>(r4, r1, r3)
            r2.A0K(r0)
            return
        L_0x00e4:
            java.lang.Object r0 = r5.A00
            X.1Ql r0 = (X.C27101Ql) r0
            java.lang.String r2 = r5.A01
            X.1CX r0 = r0.A0A
            X.0zT r1 = r0.A0L
            java.util.Map r0 = r1.A01
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x085b
            java.util.Map r0 = r1.A00
            java.lang.Object r1 = r0.get(r2)
            X.0tT r1 = (X.C16690tT) r1
            if (r1 == 0) goto L_0x085b
            r0 = 1
            r1.A06(r0)
            return
        L_0x0105:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r4 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r4
            java.lang.String r3 = r5.A01
            X.0sd r2 = r4.A0B
            int r1 = r3.length()
            r0 = 64
            if (r1 == r0) goto L_0x011a
            r0 = 0
        L_0x0116:
            r4.A0F(r0)
            return
        L_0x011a:
            byte[] r1 = X.AnonymousClass1ZW.A0G(r3)
            X.0sk r0 = r2.A01
            byte[] r0 = r0.A03()
            boolean r0 = java.util.Arrays.equals(r1, r0)
            goto L_0x0116
        L_0x0129:
            java.lang.Object r3 = r5.A00
            X.2YL r3 = (X.AnonymousClass2YL) r3
            java.lang.String r2 = r5.A01
            java.lang.String r1 = "settings-gdrive/auth-request unable to access "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131891589(0x7f121585, float:1.9417902E38)
            r3.Afg(r0)
            com.obwhatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel r1 = r3.A0I
            r0 = 0
            r1.A05(r0)
            return
        L_0x014e:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r4 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r4
            java.lang.String r3 = r5.A01
            r0 = 2131363837(0x7f0a07fd, float:1.8347494E38)
            android.view.View r2 = X.AnonymousClass00T.A05(r4, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = 2131362479(0x7f0a02af, float:1.834474E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r4, r0)
            boolean r0 = r4.A3V()
            if (r0 != 0) goto L_0x085b
            r2.setText(r3)
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0173:
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r1 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r1
            java.lang.String r0 = r5.A01
            com.obwhatsapp.backup.google.RestoreFromBackupActivity.A0r(r1, r0)
            return
        L_0x017d:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r2 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r2
            java.lang.String r1 = r5.A01
            r0 = 1
            boolean r0 = r2.A3Y(r1, r0)
            if (r0 == 0) goto L_0x085b
            r2.A3I()
            return
        L_0x018e:
            java.lang.Object r3 = r5.A00
            X.0pN r3 = (X.C14550pN) r3
            java.lang.String r2 = r5.A01
            java.lang.String r0 = "restore>RestoreFromBackupActivity/auth-request/unable to access "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131891589(0x7f121585, float:1.9417902E38)
            r3.Afg(r0)
            return
        L_0x01b0:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r2 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r2
            java.lang.String r1 = r5.A01
            r0 = 4
            r2.A3Y(r1, r0)
            return
        L_0x01bb:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r3 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r3
            java.lang.String r2 = r5.A01
            java.lang.String r1 = "settings-gdrive/auth-request unable to access "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131891589(0x7f121585, float:1.9417902E38)
            r3.Afg(r0)
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r1 = r3.A0a
            r0 = 0
            r1.A09(r0)
            return
        L_0x01e0:
            java.lang.Object r0 = r5.A00
            X.23A r0 = (X.AnonymousClass23A) r0
            X.1U3 r0 = r0.A00
            if (r0 == 0) goto L_0x085b
            r0.ARp()
            return
        L_0x01ec:
            java.lang.Object r0 = r5.A00
            X.1U2 r0 = (X.AnonymousClass1U2) r0
            java.lang.String r1 = r5.A01
            X.1Tz r0 = r0.A08
            r0.A04(r1)
            return
        L_0x01f8:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.blocklist.BlockConfirmationDialogFragment r0 = (com.obwhatsapp.blocklist.BlockConfirmationDialogFragment) r0
            java.lang.String r2 = r5.A01
            X.0pt r1 = r0.A00
            r0 = 1
            r1.A0H(r2, r0)
            return
        L_0x0205:
            java.lang.Object r1 = r5.A00
            X.1N0 r1 = (X.AnonymousClass1N0) r1
            java.lang.String r0 = "daily_cron_job"
            r1.A0D(r0)
            return
        L_0x020f:
            java.lang.Object r6 = r5.A00
            X.262 r6 = (X.AnonymousClass262) r6
            java.lang.String r4 = r5.A01
            if (r6 == 0) goto L_0x085b
            X.1Kl r0 = r6.A01
            X.0sq r3 = r0.A05
            X.260 r2 = r6.A00
            r1 = 16
            com.facebook.redex.RunnableRunnableShape0S1200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1200000_I0
            r0.<init>(r2, r4, r6, r1)
            r3.Acl(r0)
            return
        L_0x0228:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r3 = (com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r3
            java.lang.String r2 = r5.A01
            X.013 r0 = r3.A0B
            android.content.Context r0 = r0.A00
            java.util.Locale r0 = X.AnonymousClass013.A00(r0)
            android.location.Geocoder r1 = new android.location.Geocoder
            r1.<init>(r3, r0)
            r0 = 1
            java.util.List r1 = r1.getFromLocationName(r2, r0)     // Catch:{ Exception -> 0x0250 }
            if (r1 == 0) goto L_0x0256
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0250 }
            if (r0 != 0) goto L_0x0256
            r0 = 0
            java.lang.Object r2 = r1.get(r0)     // Catch:{ Exception -> 0x0250 }
            android.location.Address r2 = (android.location.Address) r2     // Catch:{ Exception -> 0x0250 }
            goto L_0x0257
        L_0x0250:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationUtil/geoLocateAddressFromLocationName/failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0256:
            r2 = 0
        L_0x0257:
            r1 = 34
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1
            r0.<init>(r3, r1, r2)
            r3.runOnUiThread(r0)
            return
        L_0x0262:
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r1 = (com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r1
            java.lang.String r6 = r5.A01
            X.2Z2 r2 = r1.A0O
            int r8 = r1.A04
            X.26B r5 = r1.A06()
            int r9 = r1.A05(r6)
            X.39q r0 = r1.A0V
            X.4R9 r4 = r0.A00()
            X.3FH r0 = r1.A0T
            java.lang.String r7 = r0.A0K
            r3 = 0
            r2.A04(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0283:
            java.lang.Object r0 = r5.A00
            X.25g r0 = (X.C447225g) r0
            java.lang.String r1 = r5.A01
            X.0sK r0 = r0.A1d
            if (r0 == 0) goto L_0x085b
            r0.A0B()
            X.1Zb r0 = r0.A01
            if (r0 == 0) goto L_0x085b
            com.whatsapp.voipcalling.Voip.timeoutPendingCall(r1)
            return
        L_0x0298:
            java.lang.Object r1 = r5.A00
            X.25g r1 = (X.C447225g) r1
            java.lang.String r0 = r5.A01
            r1.A0D(r0)
            return
        L_0x02a2:
            java.lang.Object r1 = r5.A00
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            java.lang.String r0 = r5.A01
            com.whatsapp.voipcalling.Voip.resendOfferOnDecryptionFailure(r1, r0)
            return
        L_0x02ac:
            java.lang.Object r0 = r5.A00
            X.2V2 r0 = (X.AnonymousClass2V2) r0
            java.lang.String r4 = r5.A01
            X.1aI r3 = r0.A00
            X.2bB r1 = r3.A0L
            r2 = 1
            r0 = 0
            boolean r0 = r1.A02(r4, r2, r2, r0)
            if (r0 != 0) goto L_0x085b
            X.0pt r1 = r3.A0d
            r0 = 2131887492(0x7f120584, float:1.9409593E38)
            r1.A09(r0, r2)
            return
        L_0x02c7:
            java.lang.Object r6 = r5.A00
            com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel r6 = (com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel) r6
            java.lang.String r5 = r5.A01
            X.0xU r4 = r6.A08
            X.1WD r3 = new X.1WD
            r3.<init>()
            boolean r0 = r4.A0X()
            if (r0 != 0) goto L_0x02f0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.A02(r0)
        L_0x02df:
            X.2bC r4 = new X.2bC
            r4.<init>(r6, r5)
            X.0sq r2 = r6.A0V
            r1 = 2
            com.facebook.redex.IDxExecutorShape280S0100000_2_I0 r0 = new com.facebook.redex.IDxExecutorShape280S0100000_2_I0
            r0.<init>(r2, r1)
            r3.A01(r4, r0)
            return
        L_0x02f0:
            java.lang.String r0 = "sync-manager/doPreCompanionLogoutTask start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 1
            com.facebook.redex.IDxObserverShape92S0200000_2_I1 r8 = new com.facebook.redex.IDxObserverShape92S0200000_2_I1
            r8.<init>(r3, r7, r4)
            X.11Q r0 = r4.A0C
            r0.A02(r8)
            X.0sq r10 = r4.A0n
            com.whatsapp.util.RunnableTRunnableShape1S0200000_I0 r9 = new com.whatsapp.util.RunnableTRunnableShape1S0200000_I0
            r9.<init>((X.AnonymousClass1WD) r3, (X.C18930xU) r4)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            X.0s5 r1 = r4.A08
            X.0tC r0 = X.C15910s6.A1Z
            int r0 = r1.A02(r0)
            long r0 = (long) r0
            long r1 = r2.toMillis(r0)
            java.lang.String r0 = "SyncManager/pre-companion-logout"
            java.lang.Runnable r1 = r10.Ad4(r9, r0, r1)
            X.2bD r0 = new X.2bD
            r0.<init>(r8, r4, r1)
            r3.A00(r0)
            X.15h r1 = r4.A0T
            java.lang.String r0 = "sentinel"
            java.lang.Object r1 = r1.A02(r0)
            X.1iz r1 = (X.C33691iz) r1
            if (r1 == 0) goto L_0x02df
            boolean r0 = r4.A0X()
            if (r0 == 0) goto L_0x02df
            java.util.List r0 = r1.A0A(r7)
            r4.A0S(r0)
            r4.A0N()
            goto L_0x02df
        L_0x0343:
            java.lang.Object r0 = r5.A00
            X.0tJ r0 = (X.C16590tJ) r0
            java.lang.String r2 = r5.A01
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0351:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x085b
            java.lang.Object r0 = r1.next()
            X.28A r0 = (X.AnonymousClass28A) r0
            r0.A04(r2)
            goto L_0x0351
        L_0x0361:
            java.lang.Object r0 = r5.A00
            X.28E r0 = (X.AnonymousClass28E) r0
            java.lang.String r5 = r5.A01
            com.obwhatsapp.companionmode.registration.RegisterAsCompanionActivity r4 = r0.A00
            android.widget.ProgressBar r1 = r4.A01     // Catch:{ 440 -> 0x0391 }
            r0 = 4
            r1.setVisibility(r0)     // Catch:{ 440 -> 0x0391 }
            com.obwhatsapp.QrImageView r0 = r4.A02     // Catch:{ 440 -> 0x0391 }
            r3 = 0
            r0.setVisibility(r3)     // Catch:{ 440 -> 0x0391 }
            com.obwhatsapp.QrImageView r2 = r4.A02     // Catch:{ 440 -> 0x0391 }
            X.2bE r0 = X.C51232bE.A03     // Catch:{ 440 -> 0x0391 }
            r1 = 0
            X.2bG r0 = X.C51242bF.A00(r0, r5, r1)     // Catch:{ 440 -> 0x0391 }
            r2.setQrCode(r0, r1)     // Catch:{ 440 -> 0x0391 }
            com.obwhatsapp.QrImageView r0 = r4.A02     // Catch:{ 440 -> 0x0391 }
            r0.setContentDescription(r5)     // Catch:{ 440 -> 0x0391 }
            com.obwhatsapp.QrImageView r0 = r4.A02     // Catch:{ 440 -> 0x0391 }
            r0.setVisibility(r3)     // Catch:{ 440 -> 0x0391 }
            com.obwhatsapp.QrImageView r0 = r4.A02     // Catch:{ 440 -> 0x0391 }
            r0.invalidate()     // Catch:{ 440 -> 0x0391 }
            return
        L_0x0391:
            X.0sq r3 = r4.A05
            X.0r5 r2 = r4.A04
            r1 = 40
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5
            r0.<init>(r2, r1)
            r3.Acl(r0)
            java.lang.String r0 = "companion/registration/qr/encoder error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x03a5:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r4 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.String r1 = r5.A01
            X.1QZ r0 = r4.A26     // Catch:{ 25G -> 0x03e1 }
            X.25P r3 = r0.A00(r1)     // Catch:{ 25G -> 0x03e1 }
            java.util.ArrayList r2 = r3.A01
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L_0x03c1
            r4.A2L = r2
            java.util.HashSet r2 = r4.A2u
            r1 = 14
            goto L_0x03d7
        L_0x03c1:
            int r0 = r2.size()
            if (r0 != r1) goto L_0x085b
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.A2G = r0
            java.lang.String r0 = r3.A00
            r4.A2H = r0
            java.util.HashSet r2 = r4.A2u
            r1 = 4
        L_0x03d7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.add(r0)
            r4.A00 = r1
            return
        L_0x03e1:
            r3 = move-exception
            X.0pt r2 = r4.A0P
            r1 = 47
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r4, r1, r3)
            r2.Acq(r0)
            return
        L_0x03ef:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = (com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment) r0
            java.lang.String r6 = r5.A01
            X.0pt r1 = r0.A08
            X.0sq r5 = r0.A0I
            X.013 r3 = r0.A02
            X.2bM r4 = new X.2bM
            r4.<init>(r0)
            X.0ua r0 = r0.A04
            X.1ZR r2 = new X.1ZR
            r2.<init>(r0, r6)
            r7 = 0
            X.C51292bO.A00(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x040c:
            java.lang.Object r0 = r5.A00
            X.2bP r0 = (X.C51302bP) r0
            java.lang.String r1 = r5.A01
            java.lang.ref.WeakReference r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.2bQ r0 = (X.C51312bQ) r0
            if (r0 == 0) goto L_0x085b
            r0.A01 = r1
            X.2bR r0 = r0.A03
            r0.ARv()
            return
        L_0x0424:
            java.lang.Object r4 = r5.A00
            X.0uV r4 = (X.C17080uV) r4
            java.lang.String r1 = r5.A01
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x085b
            byte[] r3 = r1.getBytes()
            int r5 = r3.length
            r0 = 100
            r10 = 1
            r1 = 0
            if (r5 >= r0) goto L_0x043a
            r1 = 1
        L_0x043a:
            java.lang.String r0 = "Log entry too large"
            X.AnonymousClass00B.A0B(r0, r1)
            int r1 = r5 + 1
            java.nio.MappedByteBuffer r0 = r4.A01
            int r0 = r0.position()
            int r1 = r1 + r0
            long r6 = (long) r1
            r1 = 1024(0x400, double:5.06E-321)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x04af
            java.nio.MappedByteBuffer r0 = r4.A01
            int r6 = X.C17080uV.A07
            r0.position(r6)
            java.nio.MappedByteBuffer r0 = r4.A01
            byte[] r1 = X.C17080uV.A09
            r0.put(r1)
            X.2QQ r0 = r4.A00
            int r0 = r0.byteSize
            int r8 = r6 + r0
            java.nio.MappedByteBuffer r0 = r4.A01
            r0.position(r8)
            java.nio.MappedByteBuffer r0 = r4.A01
            r0.put(r1)
            X.2QQ r0 = r4.A00
            java.util.Iterator r9 = r0.iterator()
        L_0x0473:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x04a3
            java.lang.Object r7 = r9.next()
            byte[] r7 = (byte[]) r7
            java.nio.MappedByteBuffer r1 = r4.A01
            int r0 = r8 + -1
            r1.position(r0)
            java.nio.MappedByteBuffer r1 = r4.A01
            r0 = 10
            r1.put(r0)
            java.nio.MappedByteBuffer r2 = r4.A01
            int r0 = r2.position()
            int r0 = r0 + -1
            int r1 = r7.length
            int r0 = r0 - r1
            r2.position(r0)
            java.nio.MappedByteBuffer r0 = r4.A01
            r0.put(r7)
            int r0 = r1 + 1
            int r8 = r8 - r0
            goto L_0x0473
        L_0x04a3:
            java.nio.MappedByteBuffer r1 = r4.A01
            X.2QQ r0 = r4.A00
            int r0 = r0.byteSize
            int r6 = r6 + r0
            int r0 = r6 + 2
            r1.position(r0)
        L_0x04af:
            java.nio.MappedByteBuffer r1 = r4.A01
            int r0 = r1.position()
            r2 = 2
            int r0 = r0 - r2
            int r0 = r0 + r5
            r1.position(r0)
            java.nio.MappedByteBuffer r1 = r4.A01
            r0 = 10
            r1.put(r0)
            java.nio.MappedByteBuffer r1 = r4.A01
            byte[] r0 = X.C17080uV.A09
            r1.put(r0)
            java.nio.MappedByteBuffer r1 = r4.A01
            int r0 = r1.position()
            int r0 = r0 - r2
            int r0 = r0 - r10
            int r0 = r0 - r5
            r1.position(r0)
            java.nio.MappedByteBuffer r0 = r4.A01
            r0.put(r3)
            java.nio.MappedByteBuffer r1 = r4.A01
            int r0 = r1.position()
            int r0 = r0 + 1
            int r0 = r0 + 2
            r1.position(r0)
            X.2QQ r0 = r4.A00
            r0.add(r3)
            return
        L_0x04ed:
            java.lang.Object r1 = r5.A00
            X.2Nz r1 = (X.AnonymousClass2Nz) r1
            java.lang.String r8 = r5.A01
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onSuccess uploading logs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ms r0 = r1.A01
            X.1Bc r7 = r0.A02
            monitor-enter(r7)
            X.1Bb r6 = r7.A04     // Catch:{ all -> 0x0529 }
            r6.A06()     // Catch:{ all -> 0x0529 }
            r2 = 0
            com.whatsapp.util.Log.rotate()     // Catch:{ all -> 0x0529 }
            com.whatsapp.util.Log.compress()     // Catch:{ all -> 0x0529 }
            boolean r1 = r7.A00()     // Catch:{ all -> 0x0529 }
            r0 = 1
            java.io.File r5 = r6.A02(r2, r0, r0, r1)     // Catch:{ all -> 0x0529 }
            if (r5 == 0) goto L_0x0524
            long r3 = r5.length()     // Catch:{ all -> 0x0529 }
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0524
            r0 = 1
            r6.A04(r5, r8, r0)     // Catch:{ all -> 0x0529 }
            goto L_0x0527
        L_0x0524:
            r6.A05(r8)     // Catch:{ all -> 0x0529 }
        L_0x0527:
            monitor-exit(r7)
            return
        L_0x0529:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x052c:
            java.lang.Object r4 = r5.A00
            X.1SZ r4 = (X.AnonymousClass1SZ) r4
            java.lang.String r3 = r5.A01
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x05b1 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x05b1 }
            java.lang.String r1 = r2.getHost()     // Catch:{ IOException -> 0x05b1 }
            java.lang.String r0 = ".whatsapp.net"
            boolean r0 = r1.endsWith(r0)     // Catch:{ IOException -> 0x05b1 }
            if (r0 == 0) goto L_0x059b
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x05b1 }
            boolean r0 = r2 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x05b1 }
            if (r0 == 0) goto L_0x0585
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x05b1 }
            r1.<init>()     // Catch:{ IOException -> 0x05b1 }
            java.lang.String r0 = "sonar connection success; url="
            r1.append(r0)     // Catch:{ IOException -> 0x05b1 }
            r1.append(r3)     // Catch:{ IOException -> 0x05b1 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x05b1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x05b1 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ IOException -> 0x05b1 }
            X.0vS r0 = r4.A00
            X.1ad r0 = r0.A02()
            r2.setSSLSocketFactory(r0)
            int r2 = r2.getResponseCode()     // Catch:{ IOException -> 0x05b5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x05b5 }
            r1.<init>()     // Catch:{ IOException -> 0x05b5 }
            java.lang.String r0 = "sonar response code: "
            r1.append(r0)     // Catch:{ IOException -> 0x05b5 }
            r1.append(r2)     // Catch:{ IOException -> 0x05b5 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x05b5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x05b5 }
            return
        L_0x0585:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x05b1 }
            r1.<init>()     // Catch:{ IOException -> 0x05b1 }
            java.lang.String r0 = "sonar pingback failed to open https url connection; url="
            r1.append(r0)     // Catch:{ IOException -> 0x05b1 }
            r1.append(r3)     // Catch:{ IOException -> 0x05b1 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x05b1 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x05b1 }
            return
        L_0x059b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x05b1 }
            r1.<init>()     // Catch:{ IOException -> 0x05b1 }
            java.lang.String r0 = "sonar pingback url did not end with *.whatsapp.net actual; url="
            r1.append(r0)     // Catch:{ IOException -> 0x05b1 }
            r1.append(r3)     // Catch:{ IOException -> 0x05b1 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x05b1 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x05b1 }
            return
        L_0x05b1:
            r1 = move-exception
            java.lang.String r0 = "IOException on sonar pingback"
            goto L_0x05b9
        L_0x05b5:
            r1 = move-exception
            java.lang.String r0 = "sonar IOException"
        L_0x05b9:
            com.whatsapp.util.Log.i(r0, r1)
            return
        L_0x05bd:
            java.lang.Object r1 = r5.A00
            X.109 r1 = (X.AnonymousClass109) r1
            java.lang.String r0 = r5.A01
            r1.A02(r0)
            return
        L_0x05c7:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.profile.ProfileInfoActivity r0 = (com.obwhatsapp.profile.ProfileInfoActivity) r0
            java.lang.String r1 = r5.A01
            X.1A8 r0 = r0.A0F
            r0.A00(r1)
            return
        L_0x05d3:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.profile.ProfilePhotoReminder r3 = (com.obwhatsapp.profile.ProfilePhotoReminder) r3
            java.lang.String r1 = r5.A01
            X.1A8 r0 = r3.A0H
            r0.A00(r1)
            X.0pt r2 = r3.A05
            r1 = 29
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0K(r0)
            return
        L_0x05eb:
            java.lang.Object r2 = r5.A00
            X.1GF r2 = (X.AnonymousClass1GF) r2
            java.lang.String r3 = "message-utils-build-fmessage"
            java.lang.String r1 = "SlowMethodWatcher found a thread stuck for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r2 = r2.A00
            java.lang.String r1 = "slow-method-watcher"
            r0 = 1
            r2.AcB(r1, r3, r0)
            return
        L_0x060c:
            java.lang.Object r4 = r5.A00
            X.2Bc r4 = (X.C45792Bc) r4
            java.lang.String r12 = r5.A01
            X.0uk r0 = r4.A01
            X.0sL r3 = r4.A03
            X.28n r0 = r0.A03
            java.util.List r1 = r0.A00(r3)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x068a
            r6 = 0
        L_0x0623:
            X.0ug r9 = r4.A04
            r5 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0688
            X.1lL[] r2 = new X.C35081lL[r5]
            java.lang.String r1 = "sub_group_jid"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r6, (java.lang.String) r1)
            r2[r8] = r0
        L_0x0635:
            java.lang.String r0 = "sub_groups"
            X.1Vv r7 = new X.1Vv
            r7.<init>(r0, r2)
            r0 = 4
            X.1lL[] r6 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r12)
            r6[r8] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "w:g2"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r6[r5] = r0
            r5 = 2
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r6[r5] = r0
            r2 = 3
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)
            r6[r2] = r0
            java.lang.String r0 = "iq"
            X.1Vv r11 = new X.1Vv
            r11.<init>((X.C28371Vv) r7, (java.lang.String) r0, (X.C35081lL[]) r6)
            X.0so r2 = r4.A00
            X.0sq r1 = r4.A05
            X.0ul r0 = r4.A02
            X.2Tc r10 = new X.2Tc
            r10.<init>(r2, r0, r3, r1)
            r13 = 297(0x129, float:4.16E-43)
            r14 = 32000(0x7d00, double:1.581E-319)
            r9.A0A(r10, r11, r12, r13, r14)
            return
        L_0x0688:
            r2 = 0
            goto L_0x0635
        L_0x068a:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            X.1sW r0 = (X.C39461sW) r0
            com.whatsapp.jid.GroupJid r6 = r0.A02
            goto L_0x0623
        L_0x0694:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.registration.RegisterName r2 = (com.obwhatsapp.registration.RegisterName) r2
            java.lang.String r1 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x085b
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x085b
            com.obwhatsapp.WaEditText r0 = r2.A0A
            r0.setText(r1)
            com.obwhatsapp.WaEditText r1 = r2.A0A
            int r0 = r1.length()
            r1.setSelection(r0)
            return
        L_0x06b5:
            java.lang.Object r6 = r5.A00
            com.obwhatsapp.registration.RegisterName r6 = (com.obwhatsapp.registration.RegisterName) r6
            java.lang.String r5 = r5.A01
            X.0si r0 = r6.A0X     // Catch:{ IOException -> 0x06c2 }
            java.io.File r7 = r0.A0A()     // Catch:{ IOException -> 0x06c2 }
            goto L_0x06ca
        L_0x06c2:
            r1 = move-exception
            java.lang.String r0 = "restorebackupdialog/create_restore_backup_dialog "
            com.whatsapp.util.Log.e(r0, r1)
            r7 = 0
        L_0x06ca:
            X.013 r4 = r6.A01
            X.0sb r0 = r6.A04
            X.1jH r0 = r0.A05()
            java.io.File r1 = r0.A0A
            r0 = 0
            X.C16180sb.A04(r1, r0)
            r0 = 0
            long r2 = X.AnonymousClass1XI.A00(r0, r1)
            if (r7 == 0) goto L_0x06f5
            long r0 = r7.length()
        L_0x06e3:
            long r2 = r2 + r0
            java.lang.String r3 = X.AnonymousClass2GQ.A03(r4, r2)
            X.0pt r2 = r6.A05
            r1 = 8
            com.facebook.redex.RunnableRunnableShape0S2100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S2100000_I0
            r0.<init>(r6, r5, r3, r1)
            r2.A0K(r0)
            return
        L_0x06f5:
            r0 = 0
            goto L_0x06e3
        L_0x06f8:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.registration.RegisterName r0 = (com.obwhatsapp.registration.RegisterName) r0
            java.lang.String r1 = r5.A01
            X.1A8 r0 = r0.A11
            r0.A00(r1)
            X.2bS r0 = com.obwhatsapp.registration.RegisterName.A1c
            r0.run()
            return
        L_0x0709:
            java.lang.Object r2 = r5.A00
            X.1Cr r2 = (X.C23621Cr) r2
            java.lang.String r1 = r5.A01
            java.util.Map r0 = r2.A03
            java.lang.Object r0 = r0.remove(r1)
            if (r0 == 0) goto L_0x085b
            r2.A09()
            return
        L_0x071b:
            java.lang.String r1 = r5.A01
            java.lang.Object r0 = r5.A00
            X.1yv r0 = (X.C42921yv) r0
            java.util.ArrayList r10 = X.C30931dC.A04(r1)
            X.17N r3 = r0.A00
            X.0tZ r7 = r0.A01
            if (r10 == 0) goto L_0x085b
            X.11I r4 = r3.A04
            java.lang.String r2 = "links_ready"
            r0 = 0
            long r4 = r4.A01(r2, r0)
            r1 = 2
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x07a1
            X.1Vw r1 = r7.A11
            X.0rv r8 = r1.A00
            X.AnonymousClass00B.A06(r8)
            X.0tq r0 = r3.A03
            X.0tf r6 = r0.A02()
            X.1cj r9 = r6.A00()     // Catch:{ all -> 0x080c }
            X.0th r0 = r3.A00     // Catch:{ all -> 0x0799 }
            X.0tZ r0 = r0.A03(r1)     // Catch:{ all -> 0x0799 }
            if (r0 == 0) goto L_0x0792
            boolean r0 = r0.A15     // Catch:{ all -> 0x0799 }
            if (r0 != 0) goto L_0x0792
            r5 = 0
        L_0x0759:
            int r0 = r10.size()     // Catch:{ all -> 0x0799 }
            if (r5 >= r0) goto L_0x0792
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0799 }
            r4.<init>()     // Catch:{ all -> 0x0799 }
            java.lang.String r2 = "chat_row_id"
            X.0ts r0 = r3.A01     // Catch:{ all -> 0x0799 }
            long r0 = r0.A02(r8)     // Catch:{ all -> 0x0799 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0799 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0799 }
            java.lang.String r2 = "message_row_id"
            long r0 = r7.A13     // Catch:{ all -> 0x0799 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0799 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0799 }
            java.lang.String r1 = "link_index"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0799 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0799 }
            X.0tg r2 = r6.A02     // Catch:{ all -> 0x0799 }
            java.lang.String r1 = "message_link"
            r0 = 4
            r2.A06(r4, r1, r0)     // Catch:{ all -> 0x0799 }
            int r5 = r5 + 1
            goto L_0x0759
        L_0x0792:
            r9.A00()     // Catch:{ all -> 0x0799 }
            r9.close()     // Catch:{ all -> 0x080c }
            goto L_0x079e
        L_0x0799:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x080b }
            goto L_0x080b
        L_0x079e:
            r6.close()
        L_0x07a1:
            X.0tq r0 = r3.A03
            X.0tf r6 = r0.A02()
            X.1cj r8 = r6.A00()     // Catch:{ all -> 0x080c }
            r0.A04()     // Catch:{ all -> 0x0807 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x0807 }
            boolean r0 = r0.A0D(r6)     // Catch:{ all -> 0x0807 }
            if (r0 == 0) goto L_0x0800
            X.1Vw r1 = r7.A11     // Catch:{ all -> 0x0807 }
            X.0rv r0 = r1.A00     // Catch:{ all -> 0x0807 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0807 }
            java.lang.String r5 = r0.getRawString()     // Catch:{ all -> 0x0807 }
            X.0th r0 = r3.A00     // Catch:{ all -> 0x0807 }
            X.0tZ r0 = r0.A03(r1)     // Catch:{ all -> 0x0807 }
            if (r0 == 0) goto L_0x07fd
            boolean r0 = r0.A15     // Catch:{ all -> 0x0807 }
            if (r0 != 0) goto L_0x07fd
            r4 = 0
        L_0x07ce:
            int r0 = r10.size()     // Catch:{ all -> 0x0807 }
            if (r4 >= r0) goto L_0x07fd
            r0 = 3
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0807 }
            r3.<init>(r0)     // Catch:{ all -> 0x0807 }
            java.lang.String r2 = "message_row_id"
            long r0 = r7.A13     // Catch:{ all -> 0x0807 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0807 }
            r3.put(r2, r0)     // Catch:{ all -> 0x0807 }
            java.lang.String r0 = "key_remote_jid"
            r3.put(r0, r5)     // Catch:{ all -> 0x0807 }
            java.lang.String r1 = "link_index"
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0807 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0807 }
            X.0tg r1 = r6.A02     // Catch:{ all -> 0x0807 }
            java.lang.String r0 = "messages_links"
            r1.A02(r3, r0)     // Catch:{ all -> 0x0807 }
            int r4 = r4 + 1
            goto L_0x07ce
        L_0x07fd:
            r8.A00()     // Catch:{ all -> 0x0807 }
        L_0x0800:
            r8.close()     // Catch:{ all -> 0x080c }
        L_0x0803:
            r6.close()
            return
        L_0x0807:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x080b }
        L_0x080b:
            throw r0     // Catch:{ all -> 0x080c }
        L_0x080c:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0810 }
        L_0x0810:
            throw r0
        L_0x0811:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.HomeActivity r3 = (com.obwhatsapp.HomeActivity) r3
            java.lang.String r2 = r5.A01
            android.view.View r1 = r3.A00
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 2131363646(0x7f0a073e, float:1.8347107E38)
            android.view.View r0 = r3.findViewById(r0)
            r6.add(r0)
            r0 = 2131363648(0x7f0a0740, float:1.834711E38)
            android.view.View r0 = r3.findViewById(r0)
            r6.add(r0)
            r0 = 2131363649(0x7f0a0741, float:1.8347113E38)
            android.view.View r0 = r3.findViewById(r0)
            r6.add(r0)
            X.01V r5 = r3.A08
            r0 = 2000(0x7d0, float:2.803E-42)
            r7 = 0
            X.1fz r4 = X.C32291fz.A01(r1, r2, r0)
            X.0pc r2 = new X.0pc
            r2.<init>(r3, r4, r5, r6, r7)
            r3.A1a = r2
            r1 = 44
            com.facebook.redex.RunnableRunnableShape1S0100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape1S0100000_I0
            r0.<init>((com.obwhatsapp.HomeActivity) r3, (int) r1)
            r2.A03(r0)
            X.0pc r0 = r3.A1a
            r0.A01()
        L_0x085b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S1100000_I0.run():void");
    }
}
