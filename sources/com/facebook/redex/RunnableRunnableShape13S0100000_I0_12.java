package com.facebook.redex;

import com.mod.bomfab.R$styleable;
import com.obwhatsapp.registration.VerifyTwoFactorAuth;

public class RunnableRunnableShape13S0100000_I0_12 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape13S0100000_I0_12(VerifyTwoFactorAuth verifyTwoFactorAuth, int i2) {
        this.A01 = i2;
        switch (i2) {
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
            case 39:
                this.A00 = verifyTwoFactorAuth;
                return;
            default:
                this.A00 = verifyTwoFactorAuth;
                return;
        }
    }

    public RunnableRunnableShape13S0100000_I0_12(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02e1, code lost:
        r2.A0B(java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04a1, code lost:
        if (r9 != null) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04c5, code lost:
        if (r9 != null) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04d1, code lost:
        if (r9.contains("@") == false) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04d3, code lost:
        r9 = r9.substring(0, r9.indexOf("@")).replace(org.apache.commons.io.FilenameUtils.EXTENSION_SEPARATOR, ' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04e4, code lost:
        r9 = r9.replace(org.apache.commons.io.FilenameUtils.EXTENSION_SEPARATOR, ' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0537, code lost:
        r2 = r3.A08;
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0546, code lost:
        r4.A08.Acl(new com.facebook.redex.RunnableRunnableShape0S0101000_I0((java.lang.Object) r4, 0, 27));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0553, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x055a, code lost:
        r3.A02.A0B(3);
        r2 = r3.A08;
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0567, code lost:
        r2.Acl(new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13((java.lang.Object) r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x056f, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:174:0x049a */
    /* JADX WARNING: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:169:0x0492=Splitter:B:169:0x0492, B:174:0x049a=Splitter:B:174:0x049a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x0671;
                case 1: goto L_0x065a;
                case 2: goto L_0x0229;
                case 3: goto L_0x0652;
                case 4: goto L_0x0644;
                case 5: goto L_0x063c;
                case 6: goto L_0x0634;
                case 7: goto L_0x061f;
                case 8: goto L_0x0617;
                case 9: goto L_0x018b;
                case 10: goto L_0x060b;
                case 11: goto L_0x05f7;
                case 12: goto L_0x05e0;
                case 13: goto L_0x05bc;
                case 14: goto L_0x00a3;
                case 15: goto L_0x0570;
                case 16: goto L_0x0554;
                case 17: goto L_0x053b;
                case 18: goto L_0x0369;
                case 19: goto L_0x052c;
                case 20: goto L_0x0505;
                case 21: goto L_0x006d;
                case 22: goto L_0x04ea;
                case 23: goto L_0x043e;
                case 24: goto L_0x0430;
                case 25: goto L_0x005a;
                case 26: goto L_0x040e;
                case 27: goto L_0x03f8;
                case 28: goto L_0x0032;
                case 29: goto L_0x03ed;
                case 30: goto L_0x0011;
                case 31: goto L_0x03e0;
                case 32: goto L_0x0394;
                case 33: goto L_0x038c;
                case 34: goto L_0x037f;
                case 35: goto L_0x0377;
                case 36: goto L_0x0369;
                case 37: goto L_0x035b;
                case 38: goto L_0x0347;
                case 39: goto L_0x0326;
                case 40: goto L_0x0308;
                case 41: goto L_0x02ad;
                case 42: goto L_0x02a3;
                case 43: goto L_0x0298;
                case 44: goto L_0x0005;
                case 45: goto L_0x0005;
                case 46: goto L_0x0290;
                case 47: goto L_0x027d;
                case 48: goto L_0x026e;
                case 49: goto L_0x0262;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r2 = (com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r2
            X.1BZ r1 = r2.A05
            java.lang.String r0 = "notification-problems-troubleshooting"
            r1.A00(r2, r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r4 = r13.A00
            X.0yx r4 = (X.C19760yx) r4
            X.0pt r0 = r4.A04
            X.0pS r0 = r0.A00
            if (r0 == 0) goto L_0x0021
            boolean r0 = X.C46052Cd.A00(r0)
            if (r0 != 0) goto L_0x0010
        L_0x0021:
            X.0tz r0 = r4.A0M
            android.content.Context r3 = r0.A00
            X.0sq r2 = r4.A0q
            r1 = 16
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            return
        L_0x0032:
            java.lang.Object r4 = r13.A00
            X.0yx r4 = (X.C19760yx) r4
            X.0yO r3 = r4.A0W
            X.16S r0 = r3.A0L
            X.0rz r0 = r0.A01
            boolean r0 = r0.A1d()
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "companion-device-manager/removeAllDevicesFromDatabase"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1WA r2 = r3.A0M
            r1 = 46
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r0.<init>(r3, r1)
            r2.execute(r0)
            X.0xU r1 = r4.A0F
            r0 = 6
            r1.A0P(r0)
            return
        L_0x005a:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.registration.RegisterName r1 = (com.obwhatsapp.registration.RegisterName) r1
            X.29I r0 = r1.A0h
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0010
            X.29I r1 = r1.A0h
            r0 = 1
            r1.A00(r0)
            return
        L_0x006d:
            java.lang.Object r5 = r13.A00
            com.obwhatsapp.registration.RegisterName r5 = (com.obwhatsapp.registration.RegisterName) r5
            X.10K r1 = r5.A0c
            java.lang.String r0 = "user_profile_photo"
            java.lang.String r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0010
            r4 = 0
            byte[] r3 = android.util.Base64.decode(r0, r4)     // Catch:{ IllegalArgumentException -> 0x067b }
            boolean r0 = r5.A1V     // Catch:{ IllegalArgumentException -> 0x067b }
            if (r0 != 0) goto L_0x0010
            X.121 r2 = r5.A0y     // Catch:{ IllegalArgumentException -> 0x067b }
            X.0sH r1 = r5.A0d     // Catch:{ IllegalArgumentException -> 0x067b }
            r0 = 0
            boolean r0 = r2.A0B(r1, r0, r3, r4)     // Catch:{ IllegalArgumentException -> 0x067b }
            if (r0 == 0) goto L_0x0010
            int r0 = r3.length     // Catch:{ IllegalArgumentException -> 0x067b }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r4, r0)     // Catch:{ IllegalArgumentException -> 0x067b }
            X.0pt r2 = r5.A05     // Catch:{ IllegalArgumentException -> 0x067b }
            r1 = 13
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8     // Catch:{ IllegalArgumentException -> 0x067b }
            r0.<init>(r5, r1, r3)     // Catch:{ IllegalArgumentException -> 0x067b }
            r2.A0K(r0)     // Catch:{ IllegalArgumentException -> 0x067b }
            goto L_0x067a
        L_0x00a3:
            java.lang.Object r5 = r13.A00
            com.obwhatsapp.registration.EULA r5 = (com.obwhatsapp.registration.EULA) r5
            X.0yg r6 = r5.A06
            X.0rz r0 = r6.A08
            boolean r0 = r0.A1k()
            if (r0 == 0) goto L_0x00fe
            X.1KP r1 = r6.A0A
            java.lang.String r0 = ""
            X.2Ez r2 = r1.A01(r0, r0)
            if (r2 == 0) goto L_0x00f9
            int r1 = r2.A01
            r0 = 1
            if (r1 != r0) goto L_0x00f9
            java.lang.String r2 = r2.A04
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00f9
            X.0pd r1 = r6.A09
            r4 = 2242(0x8c2, float:3.142E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r7 = r1.A0E(r0, r4)
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0105 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x0105 }
            r2 = 0
        L_0x00d8:
            int r0 = r3.length()     // Catch:{ JSONException -> 0x0105 }
            if (r2 >= r0) goto L_0x0111
            org.json.JSONObject r1 = r3.getJSONObject(r2)     // Catch:{ JSONException -> 0x0105 }
            if (r1 == 0) goto L_0x00f6
            java.lang.String r0 = "config_code"
            int r0 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0105 }
            if (r0 != r4) goto L_0x00f6
            java.lang.String r0 = "config_value"
            int r0 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0105 }
            r7 = 0
            if (r0 == 0) goto L_0x00f6
            r7 = 1
        L_0x00f6:
            int r2 = r2 + 1
            goto L_0x00d8
        L_0x00f9:
            java.lang.String r0 = "CompanionModeGatingManager/fetchIfCompanionModeKillswitchEnabled/failed to fetch pre-reg ABProps"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00fe:
            X.1RE r0 = r6.A04
            boolean r7 = r0.A01()
            goto L_0x0111
        L_0x0105:
            r1 = move-exception
            java.lang.String r0 = "CompanionModeGatingManager/fetchIfCompanionModeKillswitchEnabled/failed to parse pre-reg ABProps"
            com.whatsapp.util.Log.e(r0, r1)
            X.1RE r0 = r6.A04
            boolean r7 = r0.A01()
        L_0x0111:
            X.1RE r0 = r5.A07
            boolean r0 = r0.A01()
            if (r0 == r7) goto L_0x0010
            X.1RE r8 = r5.A07
            r6 = 1
            r4 = 2
            if (r7 == 0) goto L_0x0120
            r4 = 1
        L_0x0120:
            X.0tz r1 = r8.A03
            android.content.Context r0 = r1.A00
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            android.content.ComponentName r2 = r8.A00
            if (r2 != 0) goto L_0x0137
            android.content.Context r1 = r1.A00
            java.lang.Class<com.obwhatsapp.companionmode.CompanionStateHolder$CompanionKillswitchStateReceiver> r0 = com.obwhatsapp.companionmode.CompanionStateHolder$CompanionKillswitchStateReceiver.class
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r1, r0)
            r8.A00 = r2
        L_0x0137:
            r3.setComponentEnabledSetting(r2, r4, r6)
            X.0yg r4 = r5.A06
            java.lang.Iterable r0 = r4.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0144:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r0 = r1.next()
            X.2F1 r0 = (X.AnonymousClass2F1) r0
            com.obwhatsapp.registration.RegisterPhone r0 = r0.A00
            r0.invalidateOptionsMenu()
            goto L_0x0144
        L_0x0156:
            if (r7 == 0) goto L_0x0010
            X.0ys r1 = r4.A03
            int r3 = r1.A00()
            X.0sK r0 = r4.A01
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0169
            r0 = 2
            if (r3 < r0) goto L_0x0010
        L_0x0169:
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x017e
            X.0r5 r0 = r4.A02
            X.0xm r1 = r0.A00
            java.lang.Class<X.1CB> r0 = X.AnonymousClass1CB.class
            X.0vg r0 = r1.A00(r0)
            X.1CB r0 = (X.AnonymousClass1CB) r0
            r0.A05()
        L_0x017e:
            X.0pt r2 = r4.A00
            r1 = 10
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1)
            r2.Acq(r0)
            return
        L_0x018b:
            java.lang.Object r4 = r13.A00
            X.18h r4 = (X.C225318h) r4
            X.18g r5 = r4.A02     // Catch:{ all -> 0x0682 }
            java.util.concurrent.Semaphore r3 = r5.A05     // Catch:{ all -> 0x0682 }
            boolean r0 = r3.tryAcquire()     // Catch:{ all -> 0x0682 }
            if (r0 == 0) goto L_0x01ab
            java.lang.String r0 = ".gz"
            java.io.File[] r2 = r5.A01(r0)     // Catch:{ all -> 0x0682 }
            r1 = 0
        L_0x01a0:
            int r0 = r2.length     // Catch:{ all -> 0x0682 }
            if (r1 >= r0) goto L_0x01ab
            r0 = r2[r1]     // Catch:{ all -> 0x0682 }
            r5.A00(r0)     // Catch:{ all -> 0x0682 }
            int r1 = r1 + 1
            goto L_0x01a0
        L_0x01ab:
            r3.release()
            X.18f r1 = r4.A01
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0010
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            X.0pd r2 = r1.A00
            r1 = 215(0xd7, float:3.01E-43)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            long r0 = (long) r0
            long r6 = r5.toMillis(r0)
            X.18e r0 = r4.A03
            X.01D r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.0rz r0 = (X.C15860rz) r0
            X.01D r0 = r0.A01
            java.lang.Object r3 = r0.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "qpl_last_upload_ts"
            r0 = -1
            long r2 = r3.getLong(r2, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            long r1 = java.lang.Math.abs(r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0010
            java.lang.Class<com.obwhatsapp.quicklog.QplUploadScheduler$QPLUploadWorker> r0 = com.obwhatsapp.quicklog.QplUploadScheduler$QPLUploadWorker.class
            X.03e r3 = new X.03e
            r3.<init>(r0)
            X.040 r1 = new X.040
            r1.<init>()
            X.041 r0 = X.AnonymousClass041.CONNECTED
            r1.A01(r0)
            X.042 r1 = r1.A00()
            X.03i r0 = r3.A00
            r0.A0A = r1
            r0 = 5
            r3.A02(r0, r5)
            X.04P r2 = X.AnonymousClass04P.EXPONENTIAL
            r0 = 15
            r3.A03(r2, r5, r0)
            X.03k r3 = r3.A00()
            X.043 r3 = (X.AnonymousClass043) r3
            X.12P r0 = r4.A04
            java.lang.Object r2 = r0.get()
            X.022 r2 = (X.AnonymousClass022) r2
            X.03z r1 = X.AnonymousClass03z.KEEP
            java.lang.String r0 = "name.whatsapp.qpl.upload"
            r2.A06(r1, r3, r0)
            return
        L_0x0229:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.quickcontact.QuickContactActivity r4 = (com.obwhatsapp.quickcontact.QuickContactActivity) r4
            com.whatsapp.util.FloatingChildLayout r3 = r4.A0j
            int r0 = r3.A02
            if (r0 != 0) goto L_0x024e
            r0 = 1
            r3.A02 = r0
            android.view.View r0 = r3.A09
            r0.invalidate()
            r0 = 7
            com.facebook.redex.RunnableRunnableShape16S0100000_I0_15 r2 = new com.facebook.redex.RunnableRunnableShape16S0100000_I0_15
            r2.<init>(r3, r0)
            r0 = 4
            com.facebook.redex.IDxDListenerShape57S0200000_2_I0 r1 = new com.facebook.redex.IDxDListenerShape57S0200000_2_I0
            r1.<init>(r3, r0, r2)
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
        L_0x024e:
            com.whatsapp.util.FloatingChildLayout r2 = r4.A0j
            r0 = 3
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r1 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r1.<init>((java.lang.Object) r4, (int) r0)
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0010
            r0 = 1
            r2.A03 = r0
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0262:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity r2 = (com.obwhatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity) r2
            X.1BZ r1 = r2.A00
            java.lang.String r0 = "received-verification-code"
            r1.A00(r2, r0)
            return
        L_0x026e:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.obwhatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1cy r1 = r0.A0I
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09(r0)
            return
        L_0x027d:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.obwhatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r3 = r0.A06
            X.1BN r2 = r3.A0F
            java.lang.String r1 = "device_confirm"
            java.lang.String r0 = "confirm_with_second_sms"
            r2.A04(r1, r0)
            X.1cy r2 = r3.A0I
            r1 = 2
            goto L_0x02e1
        L_0x0290:
            java.lang.Object r0 = r13.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0298:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.obwhatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = r0.A06
            X.1cy r2 = r0.A0H
            r1 = 9
            goto L_0x02e1
        L_0x02a3:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 12
            X.AnonymousClass29T.A00(r1, r0)
            return
        L_0x02ad:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.obwhatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r5 = r0.A06
            X.1Pl r0 = r5.A0E
            X.1Pk r1 = r0.A06
            java.lang.String r0 = "AccountDefenceLocalDataRepository/isRetryLimitReachedForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0u3 r1 = r1.A01
            java.lang.String r0 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r2 = r1.A00(r0)
            java.lang.String r1 = "com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            r0 = 0
            boolean r2 = r2.getBoolean(r1, r0)
            java.lang.String r1 = "AccountDefenceLocalDataRepository/isRetryLimitReachedForResendingNotice/result "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x02e9
            X.1cy r2 = r5.A0H
            r1 = 5
        L_0x02e1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A0B(r0)
            return
        L_0x02e9:
            X.1Pl r0 = r5.A0E
            X.1Pk r0 = r0.A06
            long r3 = r0.A02()
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0305
            long r3 = r3 - r1
        L_0x02fa:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            X.1cy r2 = r5.A0H
            r1 = 1
            if (r0 <= 0) goto L_0x02e1
            r1 = 6
            goto L_0x02e1
        L_0x0305:
            r3 = -1
            goto L_0x02fa
        L_0x0308:
            java.lang.Object r6 = r13.A00
            com.obwhatsapp.registration.VerifyTwoFactorAuth r6 = (com.obwhatsapp.registration.VerifyTwoFactorAuth) r6
            X.0sq r1 = r6.A05
            X.0rz r4 = r6.A09
            X.1KP r5 = r6.A0K
            java.lang.String r7 = r6.A0T
            java.lang.String r8 = r6.A0U
            X.0tz r3 = r6.A0D
            X.2FL r2 = new X.2FL
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r6.A0N = r2
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Ack(r2, r0)
            return
        L_0x0326:
            java.lang.Object r7 = r13.A00
            com.obwhatsapp.registration.VerifyTwoFactorAuth r7 = (com.obwhatsapp.registration.VerifyTwoFactorAuth) r7
            int r6 = r7.A35()
            long r2 = r7.A03
            long r4 = r7.A05
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            long r2 = r2 + r4
            X.0t3 r0 = r7.A05
            long r0 = r0.A00()
            long r2 = r2 - r0
            com.obwhatsapp.registration.VerifyTwoFactorAuth$ConfirmResetCode r1 = com.obwhatsapp.registration.VerifyTwoFactorAuth.ConfirmResetCode.A01(r6, r2)
            java.lang.String r0 = "forgotPinDialogTag"
            r7.Afb(r1, r0)
            return
        L_0x0347:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.registration.VerifyTwoFactorAuth r1 = (com.obwhatsapp.registration.VerifyTwoFactorAuth) r1
            X.0yx r0 = r1.A0L
            r0.A08()
            android.content.Intent r0 = X.C14750ph.A06(r1)
            r1.startActivity(r0)
            r1.finish()
            return
        L_0x035b:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.registration.VerifyPhoneNumber r1 = (com.obwhatsapp.registration.VerifyPhoneNumber) r1
            java.lang.String r0 = "verifyphonenumber/edit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A3L()
            return
        L_0x0369:
            java.lang.Object r0 = r13.A00
            X.0pN r0 = (X.C14550pN) r0
            X.0pt r2 = r0.A05
            r1 = 2131891893(0x7f1216b5, float:1.9418519E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x0377:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.registration.VerifyPhoneNumber r0 = (com.obwhatsapp.registration.VerifyPhoneNumber) r0
            com.obwhatsapp.registration.report.BanReportViewModel r3 = r0.A18
            goto L_0x055a
        L_0x037f:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.registration.VerifyPhoneNumber r1 = (com.obwhatsapp.registration.VerifyPhoneNumber) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass29T.A01(r1, r0)
            com.obwhatsapp.registration.report.BanReportViewModel r3 = r1.A18
            goto L_0x0537
        L_0x038c:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.registration.VerifyPhoneNumber r0 = (com.obwhatsapp.registration.VerifyPhoneNumber) r0
            r0.A3L()
            return
        L_0x0394:
            java.lang.Object r5 = r13.A00
            com.obwhatsapp.registration.VerifyPhoneNumber r5 = (com.obwhatsapp.registration.VerifyPhoneNumber) r5
            X.0sK r0 = r5.A01
            com.obwhatsapp.Me r0 = r0.A01()
            if (r0 == 0) goto L_0x03ba
            java.lang.String r0 = "VerifyPhoneNumber/saveBackupToken/delete old phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0pd r4 = r5.A0C
            android.content.Context r3 = r5.getApplicationContext()
            X.10J r2 = r5.A0l
            X.0rz r1 = r5.A09
            X.0sK r0 = r5.A01
            com.obwhatsapp.Me r0 = r0.A01()
            java.lang.String r0 = r0.number
            X.AnonymousClass2FR.A02(r3, r1, r2, r4, r0)
        L_0x03ba:
            java.lang.String r0 = "VerifyPhoneNumber/saveBackupToken/encrypt and save (new) phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x03d9 }
            X.0t3 r7 = r5.A05     // Catch:{ IOException -> 0x03d9 }
            X.0pd r10 = r5.A0C     // Catch:{ IOException -> 0x03d9 }
            android.content.Context r6 = r5.getApplicationContext()     // Catch:{ IOException -> 0x03d9 }
            X.10J r9 = r5.A0l     // Catch:{ IOException -> 0x03d9 }
            X.0rz r8 = r5.A09     // Catch:{ IOException -> 0x03d9 }
            byte[] r12 = r8.A1o()     // Catch:{ IOException -> 0x03d9 }
            X.0rz r0 = r5.A09     // Catch:{ IOException -> 0x03d9 }
            java.lang.String r11 = r0.A0Q()     // Catch:{ IOException -> 0x03d9 }
            X.AnonymousClass2FR.A01(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x03d9 }
            return
        L_0x03d9:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/saveBackupToken/failed with IOException:"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x03e0:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.registration.VerifyPhoneNumber r1 = (com.obwhatsapp.registration.VerifyPhoneNumber) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass29T.A01(r1, r0)
            com.obwhatsapp.registration.report.BanReportViewModel r4 = r1.A18
            goto L_0x0546
        L_0x03ed:
            java.lang.Object r0 = r13.A00
            X.0yx r0 = (X.C19760yx) r0
            X.0xU r1 = r0.A0F
            r0 = 6
            r1.A0P(r0)
            return
        L_0x03f8:
            java.lang.Object r0 = r13.A00
            X.2F3 r0 = (X.AnonymousClass2F3) r0
            X.0pd r4 = r0.A0C
            android.content.Context r3 = r0.getApplicationContext()
            X.10J r2 = r0.A0A
            X.0rz r1 = r0.A09
            java.lang.String r0 = r1.A0Q()
            X.AnonymousClass2FR.A02(r3, r1, r2, r4, r0)
            return
        L_0x040e:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.registration.RegisterPhone r2 = (com.obwhatsapp.registration.RegisterPhone) r2
            java.lang.String r0 = "register/phone/whats-my-number/link-clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Fb r1 = r2.A0c
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.0sj r0 = r2.A08
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x042c
            com.obwhatsapp.RequestPermissionActivity.A0B(r2)
            return
        L_0x042c:
            r2.A3A()
            return
        L_0x0430:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "RegisterName/dialog/initprogress/removedialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.AnonymousClass29T.A00(r1, r0)
            return
        L_0x043e:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.registration.RegisterName r4 = (com.obwhatsapp.registration.RegisterName) r4
            X.10K r0 = r4.A0c
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0462
            X.10K r1 = r4.A0c
            java.lang.String r0 = "user_push_name"
            java.lang.String r9 = r1.A00(r0)
            if (r9 == 0) goto L_0x0462
        L_0x0455:
            X.0pt r2 = r4.A05
            r1 = 39
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r0.<init>(r1, r9, r4)
            r2.A0K(r0)
            return
        L_0x0462:
            java.lang.String r2 = "display_name"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r9 = 0
            if (r0 != 0) goto L_0x0455
            r5 = 0
            android.content.ContentResolver r6 = r4.getContentResolver()     // Catch:{ Exception -> 0x049b }
            android.net.Uri r7 = android.provider.ContactsContract.Profile.CONTENT_URI     // Catch:{ Exception -> 0x049b }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ Exception -> 0x049b }
            r8[r5] = r2     // Catch:{ Exception -> 0x049b }
            r11 = r9
            r10 = r9
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x049b }
            if (r1 == 0) goto L_0x04a3
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0496 }
            if (r0 == 0) goto L_0x0492
            int r0 = r1.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0496 }
            java.lang.String r9 = r1.getString(r0)     // Catch:{ all -> 0x0496 }
        L_0x0492:
            r1.close()     // Catch:{ Exception -> 0x049b }
            goto L_0x04a1
        L_0x0496:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x049a }
        L_0x049a:
            throw r0     // Catch:{ Exception -> 0x049b }
        L_0x049b:
            r1 = move-exception
            java.lang.String r0 = "RegisterName/getmename "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x04a1:
            if (r9 != 0) goto L_0x04c7
        L_0x04a3:
            android.content.Context r0 = r4.getApplicationContext()
            android.accounts.AccountManager r0 = android.accounts.AccountManager.get(r0)
            if (r0 == 0) goto L_0x0455
            android.accounts.Account[] r7 = r0.getAccounts()
            if (r7 == 0) goto L_0x0455
            int r6 = r7.length
            r3 = 0
        L_0x04b5:
            if (r3 >= r6) goto L_0x0455
            r2 = r7[r3]
            java.lang.String r1 = r2.type
            java.lang.String r0 = "com.google"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04e1
            java.lang.String r9 = r2.name
            if (r9 == 0) goto L_0x0455
        L_0x04c7:
            java.lang.String r3 = "@"
            boolean r0 = r9.contains(r3)
            r2 = 32
            r1 = 46
            if (r0 == 0) goto L_0x04e4
            int r0 = r9.indexOf(r3)
            java.lang.String r0 = r9.substring(r5, r0)
            java.lang.String r9 = r0.replace(r1, r2)
            goto L_0x0455
        L_0x04e1:
            int r3 = r3 + 1
            goto L_0x04b5
        L_0x04e4:
            java.lang.String r9 = r9.replace(r1, r2)
            goto L_0x0455
        L_0x04ea:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.registration.RegisterName r0 = (com.obwhatsapp.registration.RegisterName) r0
            X.0t3 r1 = r0.A05
            X.0pd r5 = r0.A0C
            X.0tz r2 = r0.A0S
            X.0sq r7 = r0.A05
            X.0ug r6 = r0.A0q
            X.10J r4 = r0.A0k
            X.0rz r3 = r0.A09
            X.2Fc r0 = new X.2Fc
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.A00()
            return
        L_0x0505:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.registration.RegisterName r0 = (com.obwhatsapp.registration.RegisterName) r0
            X.01D r0 = r0.A1N
            java.lang.Object r0 = r0.get()
            X.1LC r0 = (X.AnonymousClass1LC) r0
            X.0xm r1 = r0.A00
            java.lang.Class<X.1CC> r0 = X.AnonymousClass1CC.class
            X.0vg r1 = r1.A00(r0)
            X.1CC r1 = (X.AnonymousClass1CC) r1
            java.lang.String r0 = "ConsumerBridge/onSyncExportMigrationFeatureState"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.01D r0 = r1.A02
            java.lang.Object r0 = r0.get()
            X.0sr r0 = (X.C16330sr) r0
            r0.A04()
            return
        L_0x052c:
            java.lang.Object r1 = r13.A00
            X.2F3 r1 = (X.AnonymousClass2F3) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass29T.A01(r1, r0)
            com.obwhatsapp.registration.report.BanReportViewModel r3 = r1.A0L
        L_0x0537:
            X.0sq r2 = r3.A08
            r1 = 3
            goto L_0x0567
        L_0x053b:
            java.lang.Object r1 = r13.A00
            X.2F3 r1 = (X.AnonymousClass2F3) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass29T.A01(r1, r0)
            com.obwhatsapp.registration.report.BanReportViewModel r4 = r1.A0L
        L_0x0546:
            r3 = 0
            X.0sq r2 = r4.A08
            r1 = 27
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1)
            r2.Acl(r0)
            return
        L_0x0554:
            java.lang.Object r0 = r13.A00
            X.2F3 r0 = (X.AnonymousClass2F3) r0
            com.obwhatsapp.registration.report.BanReportViewModel r3 = r0.A0L
        L_0x055a:
            X.027 r1 = r3.A02
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r0)
            X.0sq r2 = r3.A08
            r1 = 2
        L_0x0567:
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r0 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            return
        L_0x0570:
            java.lang.Object r5 = r13.A00
            X.2F3 r5 = (X.AnonymousClass2F3) r5
            X.0sK r0 = r5.A01
            com.obwhatsapp.Me r0 = r0.A01()
            if (r0 == 0) goto L_0x0596
            java.lang.String r0 = "EnterPhoneNumber/saveBackupToken/delete old phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0pd r4 = r5.A0C
            android.content.Context r3 = r5.getApplicationContext()
            X.10J r2 = r5.A0A
            X.0rz r1 = r5.A09
            X.0sK r0 = r5.A01
            com.obwhatsapp.Me r0 = r0.A01()
            java.lang.String r0 = r0.number
            X.AnonymousClass2FR.A02(r3, r1, r2, r4, r0)
        L_0x0596:
            java.lang.String r0 = "EnterPhoneNumber/saveBackupToken/encrypt and save (new) phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x05b5 }
            X.0t3 r7 = r5.A05     // Catch:{ IOException -> 0x05b5 }
            X.0pd r10 = r5.A0C     // Catch:{ IOException -> 0x05b5 }
            android.content.Context r6 = r5.getApplicationContext()     // Catch:{ IOException -> 0x05b5 }
            X.10J r9 = r5.A0A     // Catch:{ IOException -> 0x05b5 }
            X.0rz r8 = r5.A09     // Catch:{ IOException -> 0x05b5 }
            byte[] r12 = r8.A1o()     // Catch:{ IOException -> 0x05b5 }
            X.0rz r0 = r5.A09     // Catch:{ IOException -> 0x05b5 }
            java.lang.String r11 = r0.A0Q()     // Catch:{ IOException -> 0x05b5 }
            X.AnonymousClass2FR.A01(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x05b5 }
            return
        L_0x05b5:
            r1 = move-exception
            java.lang.String r0 = "EnterPhoneNumber/saveBackupToken/failed with IOException:"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x05bc:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.registration.ChangeNumberOverview r4 = (com.obwhatsapp.registration.ChangeNumberOverview) r4
            X.0wS r0 = r4.A04
            r0.A06()
            X.16r r0 = r0.A08
            r3 = 1
            java.util.List r0 = r0.A0T(r3)
            int r0 = r0.size()
            if (r0 > 0) goto L_0x05d3
            r3 = 0
        L_0x05d3:
            X.0pt r2 = r4.A05
            r1 = 25
            com.facebook.redex.RunnableRunnableShape0S0110000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0110000_I0
            r0.<init>(r4, r1, r3)
            r2.Acq(r0)
            return
        L_0x05e0:
            java.lang.Object r0 = r13.A00
            X.2FT r0 = (X.AnonymousClass2FT) r0
            com.obwhatsapp.registration.ChangeNumber r2 = r0.A00
            X.0t6 r1 = r2.A0B
            r0 = 0
            r1.A0Q(r0, r0)
            X.0t6 r0 = r2.A0B
            r0.A0K()
            X.0t6 r0 = r2.A0B
            r0.A0L()
            return
        L_0x05f7:
            java.lang.Object r0 = r13.A00
            X.0pL r0 = (X.C14530pL) r0
            X.0sK r2 = r0.A01
            r2.A0B()
            com.obwhatsapp.Me r1 = r2.A00
            r2.A0B()
            java.lang.String r0 = "me_old"
            r2.A0H(r1, r0)
            return
        L_0x060b:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment r0 = (com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment) r0
            com.obwhatsapp.WaTabLayout r1 = r0.A05
            X.2FZ r0 = r0.A00
            r1.A0D(r0)
            return
        L_0x0617:
            java.lang.Object r0 = r13.A00
            X.0yX r0 = (X.C19500yX) r0
            r0.AiF()
            return
        L_0x061f:
            java.lang.Object r0 = r13.A00
            X.1iP r0 = (X.C33331iP) r0
            X.0yX r2 = r0.A00
            r1 = 630(0x276, float:8.83E-43)
            r0 = 1
            r2.A8R(r1, r0)
            r1 = 113(0x71, float:1.58E-43)
            r0 = 300000(0x493e0, float:4.2039E-40)
            r2.A8S(r0, r1)
            return
        L_0x0634:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.quickcontact.QuickContactActivity r0 = (com.obwhatsapp.quickcontact.QuickContactActivity) r0
            com.obwhatsapp.quickcontact.QuickContactActivity.A09(r0)
            return
        L_0x063c:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.quickcontact.QuickContactActivity r0 = (com.obwhatsapp.quickcontact.QuickContactActivity) r0
            com.obwhatsapp.quickcontact.QuickContactActivity.A03(r0)
            return
        L_0x0644:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.quickcontact.QuickContactActivity r0 = (com.obwhatsapp.quickcontact.QuickContactActivity) r0
            X.15p r2 = r0.A0d
            X.0sH r1 = r0.A0R
            android.view.View r0 = r0.A00
            r2.A0Z(r0, r1)
            return
        L_0x0652:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.quickcontact.QuickContactActivity r1 = (com.obwhatsapp.quickcontact.QuickContactActivity) r1
            r0 = 0
            r1.A0o = r0
            return
        L_0x065a:
            java.lang.Object r1 = r13.A00
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r0)
            r0 = 5
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r2 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r2.<init>((java.lang.Object) r1, (int) r0)
            r0 = 60
            r3.postDelayed(r2, r0)
            return
        L_0x0671:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.quickcontact.QuickContactActivity r1 = (com.obwhatsapp.quickcontact.QuickContactActivity) r1
            r0 = 0
            r1.A37(r0)
            return
        L_0x067a:
            return
        L_0x067b:
            r1 = move-exception
            java.lang.String r0 = "populateProfilePhotoFromUserSettings"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0682:
            r1 = move-exception
            X.18g r0 = r4.A02
            java.util.concurrent.Semaphore r0 = r0.A05
            r0.release()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape13S0100000_I0_12.run():void");
    }
}
