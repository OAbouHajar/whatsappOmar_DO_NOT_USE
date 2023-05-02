package com.facebook.redex;

public class RunnableRunnableShape3S0100000_I0_2 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape3S0100000_I0_2(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0666, code lost:
        if (r0.A0L == false) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0669, code lost:
        if (r1 != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x066b, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0672, code lost:
        if (r5.A04.A02(r4) != false) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0674, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0675, code lost:
        r1 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0677, code lost:
        if (r2 != false) goto L_0x067c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0679, code lost:
        if (r0 != false) goto L_0x067c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x067b, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x067c, code lost:
        r0 = java.lang.Boolean.valueOf(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x02f2;
                case 1: goto L_0x02fa;
                case 2: goto L_0x002d;
                case 3: goto L_0x0313;
                case 4: goto L_0x0321;
                case 5: goto L_0x0366;
                case 6: goto L_0x0371;
                case 7: goto L_0x0377;
                case 8: goto L_0x037f;
                case 9: goto L_0x0094;
                case 10: goto L_0x038a;
                case 11: goto L_0x03a3;
                case 12: goto L_0x03c2;
                case 13: goto L_0x0456;
                case 14: goto L_0x0460;
                case 15: goto L_0x00c2;
                case 16: goto L_0x046a;
                case 17: goto L_0x04b1;
                case 18: goto L_0x04c6;
                case 19: goto L_0x0366;
                case 20: goto L_0x04d1;
                case 21: goto L_0x0106;
                case 22: goto L_0x012c;
                case 23: goto L_0x0143;
                case 24: goto L_0x016c;
                case 25: goto L_0x04da;
                case 26: goto L_0x04f6;
                case 27: goto L_0x01dc;
                case 28: goto L_0x0509;
                case 29: goto L_0x0517;
                case 30: goto L_0x0366;
                case 31: goto L_0x0521;
                case 32: goto L_0x0529;
                case 33: goto L_0x055f;
                case 34: goto L_0x0586;
                case 35: goto L_0x059a;
                case 36: goto L_0x05d2;
                case 37: goto L_0x05fd;
                case 38: goto L_0x0209;
                case 39: goto L_0x021a;
                case 40: goto L_0x061e;
                case 41: goto L_0x0228;
                case 42: goto L_0x0626;
                case 43: goto L_0x02bc;
                case 44: goto L_0x02e1;
                case 45: goto L_0x063c;
                case 46: goto L_0x0646;
                case 47: goto L_0x0681;
                case 48: goto L_0x06a7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r13.A00
            X.2j5 r1 = (X.AnonymousClass2j5) r1
            r1.A02()
            X.0wz r0 = r1.A03
            X.2j6 r5 = r1.A04
            X.0pd r7 = r0.A05
            X.0ua r3 = r0.A00
            X.0rz r6 = r0.A04
            X.0uc r4 = r0.A01
            X.01D r9 = r0.A07
            X.01J r11 = r0.A08
            X.01J r12 = r0.A0C
            X.168 r8 = r0.A06
            X.0ue r0 = r0.A02
            java.lang.String r10 = r0.A00
            X.2j7 r2 = new X.2j7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.Aah(r1)
        L_0x002c:
            return
        L_0x002d:
            java.lang.Object r1 = r13.A00
            X.2ih r1 = (X.C55032ih) r1
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/taking-too-long"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2ii r0 = r1.A00
            java.lang.ref.WeakReference r0 = r0.A08
            java.lang.Object r9 = r0.get()
            android.app.Activity r9 = (android.app.Activity) r9
            if (r9 == 0) goto L_0x002c
            r0 = 2131888531(0x7f120993, float:1.94117E38)
            java.lang.String r0 = r9.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r0)
            int r1 = r8.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r10 = 0
            java.lang.Object[] r7 = r8.getSpans(r10, r1, r0)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            if (r7 == 0) goto L_0x06cb
            int r6 = r7.length
        L_0x0062:
            if (r10 >= r6) goto L_0x06cb
            r5 = r7[r10]
            java.lang.String r1 = r5.getURL()
            java.lang.String r0 = "skip-looking-for-backups"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = "restore>RestoreFromBackupActivity/one-time-setup/taking-too-long/allow-user-to-skip-looking-for-backups"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            int r4 = r8.getSpanStart(r5)
            int r3 = r8.getSpanEnd(r5)
            int r2 = r8.getSpanFlags(r5)
            r8.removeSpan(r5)
            r1 = 1
            com.facebook.redex.IDxCSpanShape14S0100000_2_I1 r0 = new com.facebook.redex.IDxCSpanShape14S0100000_2_I1
            r0.<init>(r9, r1)
            r8.setSpan(r0, r4, r3, r2)
        L_0x0091:
            int r10 = r10 + 1
            goto L_0x0062
        L_0x0094:
            java.lang.Object r1 = r13.A00
            X.0yo r1 = (X.C19670yo) r1
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x002c
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x06df
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x06df
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0e
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x06df
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x06df
            r1.A04()
            return
        L_0x00c2:
            java.lang.Object r6 = r13.A00
            X.12Q r6 = (X.AnonymousClass12Q) r6
            java.util.concurrent.atomic.AtomicReference r8 = r6.A0Q
            java.lang.Object r0 = r8.get()
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            X.0wP r1 = r6.A0I
            r0 = 1
            int r5 = r1.A04(r0)
            r2 = 100
            r0 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r1 = 2
            r0 = 28
            if (r7 != r0) goto L_0x00f4
            if (r5 == r1) goto L_0x00ea
            if (r5 != 0) goto L_0x002c
        L_0x00ea:
            r8.set(r4)
            int r0 = r6.A02
            long r0 = (long) r0
            r6.ATW(r0, r2)
            return
        L_0x00f4:
            r0 = 16
            if (r7 != r0) goto L_0x002c
            if (r5 == r1) goto L_0x00fc
            if (r5 != 0) goto L_0x002c
        L_0x00fc:
            r8.set(r4)
            int r0 = r6.A02
            long r0 = (long) r0
            r6.ANO(r0, r2)
            return
        L_0x0106:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r2 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r2
            android.os.ConditionVariable r0 = r2.A0m
            r0.block()
            X.0rz r0 = r2.A09
            boolean r0 = X.C62173By.A08(r0)
            if (r0 != 0) goto L_0x0121
            X.0rz r0 = r2.A09
            int r1 = r0.A08()
            r0 = 12
            if (r1 != r0) goto L_0x002c
        L_0x0121:
            X.12U r1 = r2.A0H
            r0 = 10
            r1.A05(r0)
            r2.A3I()
            return
        L_0x012c:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r1 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r1
            boolean r0 = r1.A3V()
            if (r0 != 0) goto L_0x002c
            r0 = 2131363882(0x7f0a082a, float:1.8347585E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r1, r0)
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0143:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r4 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r4
            X.0tz r0 = r4.A0N
            android.content.Context r0 = r0.A00
            int r3 = X.C437421i.A00(r0)
            r0 = 5
            com.facebook.redex.IDxCListenerShape162S0100000_2_I1 r2 = new com.facebook.redex.IDxCListenerShape162S0100000_2_I1
            r2.<init>(r4, r0)
            r1 = 0
            r0 = 1
            android.app.Dialog r1 = X.AnonymousClass2GK.A02(r4, r2, r3, r1, r0)
            if (r1 == 0) goto L_0x06e3
            boolean r0 = r4.A3V()
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-unavailable/prompting-user-to-fix"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.show()
            return
        L_0x016c:
            java.lang.Object r0 = r13.A00
            X.2ij r0 = (X.C55052ij) r0
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r3 = r0.A00
            r0 = 2131361938(0x7f0a0092, float:1.8343642E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131888963(0x7f120b43, float:1.9412576E38)
            r1.setText(r0)
            X.2ik r1 = r3.A0F
            r0 = 1
            r1.A01 = r0
            r4 = 0
            r3.A02 = r4
            X.0rz r0 = r3.A09
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "gdrive_approx_media_download_size"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r4)
            r0.apply()
            java.lang.String r1 = "washaredpreferences/save-gdrive-media-download-transfer-size/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0si r0 = r3.A0R
            r2 = 0
            java.io.File r0 = r0.A0A()     // Catch:{ IOException -> 0x01c2 }
            if (r0 == 0) goto L_0x01c7
            java.lang.String r0 = r0.getName()     // Catch:{ IOException -> 0x01c2 }
            X.0tx r1 = X.C40721ua.A00(r0)     // Catch:{ IOException -> 0x01c2 }
            X.0tx r0 = X.C16960tx.A07     // Catch:{ IOException -> 0x01c2 }
            if (r1 != r0) goto L_0x01c7
            r2 = 1
            goto L_0x01c7
        L_0x01c2:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/cannot determine whether local backup is encrypted"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01c7:
            boolean r0 = r3.A3X()
            if (r0 != 0) goto L_0x002c
            if (r2 == 0) goto L_0x06e9
            r0 = 2
            r3.A3J(r0)
            android.content.Intent r1 = X.C14750ph.A09(r3, r0)
            r0 = 0
            r3.startActivityForResult(r1, r0)
            return
        L_0x01dc:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r3 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r3
            X.0si r0 = r3.A0h
            boolean r1 = r0.A0J()
            X.0rz r0 = r3.A09
            boolean r0 = r0.A1f()
            if (r1 == 0) goto L_0x0202
            if (r0 != 0) goto L_0x002c
            X.0si r0 = r3.A0h
            r0.A0G()
            X.0pt r2 = r3.A05
            r1 = 29
        L_0x01f9:
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r3, r1)
            r2.A0K(r0)
            return
        L_0x0202:
            if (r0 == 0) goto L_0x002c
            X.0pt r2 = r3.A05
            r1 = 31
            goto L_0x01f9
        L_0x0209:
            java.lang.Object r1 = r13.A00
            X.0xj r1 = (X.C19080xj) r1
            r0 = 0
            r1.A04 = r0
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "foreground"
            r1.A01(r0)
            return
        L_0x021a:
            java.lang.Object r1 = r13.A00
            X.0xj r1 = (X.C19080xj) r1
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "background"
            r1.A01(r0)
            return
        L_0x0228:
            java.lang.Object r5 = r13.A00
            X.1Bl r5 = (X.C23301Bl) r5
            X.0pd r2 = r5.A05
            r1 = 1846(0x736, float:2.587E-42)
            X.0tM r0 = X.C16620tM.A02
            java.lang.String r6 = r2.A06(r0, r1)
            boolean r1 = r5.A01
            X.0uc r4 = r5.A03
            boolean r0 = r4.A09()
            if (r1 != r0) goto L_0x0248
            java.lang.String r0 = r5.A00
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x002c
        L_0x0248:
            java.lang.String r0 = r5.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0256
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x002c
        L_0x0256:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.lang.String r0 = r5.A00
            java.lang.String r2 = ","
            java.lang.String[] r1 = r0.split(r2)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x026d
            java.util.List r0 = java.util.Arrays.asList(r1)
            r3.addAll(r0)
        L_0x026d:
            java.lang.String[] r1 = r6.split(r2)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x027b
            java.util.List r0 = java.util.Arrays.asList(r1)
            r3.addAll(r0)
        L_0x027b:
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x002c
            java.util.Iterator r3 = r3.iterator()
        L_0x0285:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            X.1ZT r2 = X.AnonymousClass1ZT.A03(r0)     // Catch:{ 1W4 -> 0x02b3 }
            if (r2 == 0) goto L_0x0285
            X.0sG r0 = r5.A04
            boolean r0 = r0.A0Z(r2)
            if (r0 != 0) goto L_0x02a9
            X.16L r0 = r5.A02
            X.0rs r0 = r0.A00
            boolean r0 = r0.A0C(r2)
            if (r0 == 0) goto L_0x0285
        L_0x02a9:
            r1 = 0
            X.2il r0 = new X.2il
            r0.<init>(r5)
            r4.A05(r0, r2, r1)
            goto L_0x0285
        L_0x02b3:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0285
        L_0x02bc:
            java.lang.Object r2 = r13.A00
            X.2RR r2 = (X.AnonymousClass2RR) r2
            X.1Gf r1 = r2.A0C
            com.whatsapp.jid.UserJid r0 = r2.A0I
            java.util.concurrent.Future r0 = r1.A04(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x02d7 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x02d7 }
            X.027 r0 = r2.A00     // Catch:{ Exception -> 0x02d7 }
            if (r0 == 0) goto L_0x002c
            r0.A09(r1)     // Catch:{ Exception -> 0x02d7 }
            goto L_0x06f7
        L_0x02d7:
            X.027 r1 = r2.A06
            if (r1 == 0) goto L_0x002c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            return
        L_0x02e1:
            java.lang.Object r0 = r13.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r0 = r0.A03
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x002c
            r0 = 1
            r1.setSoftInputMode(r0)
            return
        L_0x02f2:
            java.lang.Object r0 = r13.A00
            X.1b6 r0 = (X.C29731b6) r0
            r0.A01()
            return
        L_0x02fa:
            java.lang.Object r2 = r13.A00
            X.1bE r2 = (X.C29801bE) r2
            X.0sd r1 = r2.A07
            java.lang.String r0 = r2.A0D
            r1.A03(r0)
            java.lang.String r0 = "EncBackupManager/encrypted backup enabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1bG r0 = r2.A08
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A00
            r0 = 0
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel.A01(r1, r0)
            return
        L_0x0313:
            java.lang.Object r0 = r13.A00
            X.1KN r0 = (X.AnonymousClass1KN) r0
            X.0yo r1 = r0.A04
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r1.A09(r0)
            return
        L_0x0321:
            java.lang.Object r3 = r13.A00
            X.2YL r3 = (X.AnonymousClass2YL) r3
            android.os.ConditionVariable r0 = r3.A0U
            r0.block()
            X.0rz r0 = r3.A09
            boolean r0 = X.C62173By.A08(r0)
            if (r0 != 0) goto L_0x033c
            X.0rz r0 = r3.A09
            int r1 = r0.A08()
            r0 = 12
            if (r1 != r0) goto L_0x0362
        L_0x033c:
            X.12U r0 = r3.A0F
            r1 = 10
            r0.A05(r1)
            X.0rz r0 = r3.A09
            boolean r0 = X.AnonymousClass2GK.A0H(r0)
            if (r0 != 0) goto L_0x0362
            X.12U r0 = r3.A0F
            r0.A05(r1)
            java.lang.String r0 = "action_backup"
            android.content.Intent r2 = X.C14750ph.A0d(r3, r0)
            java.lang.String r1 = "backup_mode"
            java.lang.String r0 = "user_initiated"
            r2.putExtra(r1, r0)
            X.C446524y.A00(r3, r2)
            return
        L_0x0362:
            X.0yo r0 = r3.A0E
            goto L_0x055b
        L_0x0366:
            java.lang.Object r1 = r13.A00
            X.0pN r1 = (X.C14550pN) r1
            r0 = 2131891572(0x7f121574, float:1.9417868E38)
            r1.Afg(r0)
            return
        L_0x0371:
            java.lang.Object r0 = r13.A00
            X.0yo r0 = (X.C19670yo) r0
            goto L_0x055b
        L_0x0377:
            java.lang.Object r0 = r13.A00
            X.0yo r0 = (X.C19670yo) r0
            r0.A07()
            return
        L_0x037f:
            java.lang.Object r0 = r13.A00
            X.0yo r0 = (X.C19670yo) r0
            r0.A07()
            r0.A04()
            return
        L_0x038a:
            java.lang.Object r2 = r13.A00
            X.12U r2 = (X.AnonymousClass12U) r2
            X.0yo r1 = r2.A07
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r1.A09(r0)
            r1.A05()
            r1.A07()
            X.12M r0 = r2.A08
            r0.A04()
            return
        L_0x03a3:
            java.lang.Object r2 = r13.A00
            X.12U r2 = (X.AnonymousClass12U) r2
            X.0yo r1 = r2.A07
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r1.A09(r0)
            r1.A05()
            r1.A07()
            X.12M r0 = r2.A08
            r0.A05()
            X.0rz r1 = r2.A0J
            r0 = 0
            r1.A0j(r0)
            return
        L_0x03c2:
            java.lang.Object r5 = r13.A00
            com.obwhatsapp.backup.google.GoogleDriveNewUserSetupActivity r5 = (com.obwhatsapp.backup.google.GoogleDriveNewUserSetupActivity) r5
            int r1 = r5.A00
            java.lang.String r0 = "gdrive-new-user-setup/next-setup-prompt-timestamp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r4 = r5.A09
            if (r1 == 0) goto L_0x041e
            java.lang.String r0 = "wa-shared-prefs/reset-gdrive-prompt-shown-count"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences$Editor r0 = r4.A0K()
            java.lang.String r3 = "gdrive_setup_user_prompted_count"
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)
            r0.apply()
        L_0x03e4:
            r1 = 4
            X.0rz r0 = r5.A09
            X.01D r0 = r0.A01
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            r7 = 0
            int r0 = r0.getInt(r3, r7)
            int r0 = java.lang.Math.min(r1, r0)
            int r6 = r0 * 30
            long r3 = (long) r6
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 * r0
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1[r7] = r0
            java.lang.String r0 = "gdrive-new-user-setup/next-setup-prompt-timestamp/increment-%d-days"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r2 = r5.A09
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r3
            r2.A0l(r0)
            return
        L_0x041e:
            java.lang.String r0 = "wa-shared-prefs/increment-gdrive-prompt-shown-count"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01D r0 = r4.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r3 = "gdrive_setup_user_prompted_count"
            r0 = 0
            int r0 = r1.getInt(r3, r0)
            if (r0 >= 0) goto L_0x0436
            r0 = 0
        L_0x0436:
            int r2 = r0 + 1
            android.content.SharedPreferences$Editor r0 = r4.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r2)
            r0.apply()
            java.lang.String r1 = "wa-shared-prefs/increment-gdriveprompt-shown-count/new-count/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x03e4
        L_0x0456:
            java.lang.Object r1 = r13.A00
            X.12Q r1 = (X.AnonymousClass12Q) r1
            X.0wP r0 = r1.A0I
            r0.A02(r1)
            return
        L_0x0460:
            java.lang.Object r1 = r13.A00
            X.12Q r1 = (X.AnonymousClass12Q) r1
            X.0wP r0 = r1.A0I
            r0.A03(r1)
            return
        L_0x046a:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r2 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r2
            com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r2.A0J
            if (r0 != 0) goto L_0x047d
            r0 = 2131363895(0x7f0a0837, float:1.8347612E38)
            android.view.View r0 = r2.findViewById(r0)
            com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = (com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView) r0
            r2.A0J = r0
        L_0x047d:
            r0 = 2131363882(0x7f0a082a, float:1.8347585E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r2, r0)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131365806(0x7f0a0fae, float:1.8351488E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r2, r0)
            r0.setVisibility(r1)
            com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r2.A0J
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.A05
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A08
            r0.setVisibility(r1)
            com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r2.A0J
            r0.A01()
            android.widget.TextView r1 = r2.A08
            r0 = 2131886235(0x7f12009b, float:1.9407043E38)
            r1.setText(r0)
            return
        L_0x04b1:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r2 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r2
            X.0t6 r1 = r2.A0Q
            r0 = 0
            r1.A0Q(r0, r0)
            X.0t6 r0 = r2.A0Q
            r0.A0K()
            X.0t6 r0 = r2.A0Q
            r0.A0L()
            return
        L_0x04c6:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r0 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r0
            X.0yo r1 = r0.A0G
            r0 = 0
            r1.A0D(r0)
            return
        L_0x04d1:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r1 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r1
            r0 = 1
            r1.A3Q(r0)
            return
        L_0x04da:
            java.lang.Object r0 = r13.A00
            X.2ij r0 = (X.C55052ij) r0
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r2 = r0.A00
            boolean r0 = r2.A3V()
            if (r0 != 0) goto L_0x04f0
            r1 = 29
            r0 = 0
            r2.A3O(r0, r1)
            r2.A3B()
            return
        L_0x04f0:
            java.lang.String r0 = "gdrive-activity-observer/backup-import-start/activity-already-exited"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x04f6:
            java.lang.Object r0 = r13.A00
            X.2jJ r0 = (X.C55312jJ) r0
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r0 = r0.A01
            android.widget.ProgressBar r1 = r0.A05
            r0 = 0
            r1.setIndeterminate(r0)
            java.lang.String r0 = "restore>RestoreFromBackupActivity/observer/msgstore download started"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0509:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r2 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r2
            X.12U r1 = r2.A0W
            r0 = 10
            r1.A05(r0)
            X.0yo r0 = r2.A0V
            goto L_0x055b
        L_0x0517:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r0 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r0
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r0.A0a
            r0.A07()
            return
        L_0x0521:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r0 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r0
            r0.A36()
            return
        L_0x0529:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r2 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r2
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r2.A0a
            android.os.ConditionVariable r0 = r0.A01
            r0.block()
            X.0rz r0 = r2.A09
            boolean r0 = X.C62173By.A08(r0)
            if (r0 != 0) goto L_0x0546
            X.0rz r0 = r2.A09
            int r1 = r0.A08()
            r0 = 12
            if (r1 != r0) goto L_0x0559
        L_0x0546:
            X.12U r1 = r2.A0W
            r0 = 10
            r1.A05(r0)
            X.0rz r0 = r2.A09
            boolean r0 = X.AnonymousClass2GK.A0H(r0)
            if (r0 != 0) goto L_0x0559
            r2.A3B()
            return
        L_0x0559:
            X.0yo r0 = r2.A0V
        L_0x055b:
            r0.A04()
            return
        L_0x055f:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r1 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r1
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r1.A0a
            r0.A07()
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r1 = r1.A0a
            X.4v5 r0 = new X.4v5
            r0.<init>(r1)
            X.1KN r3 = r1.A0Q
            X.3vy r1 = r3.A01
            r1.A02(r0)
            X.0xj r0 = r3.A06
            X.37Q r2 = new X.37Q
            r2.<init>(r1, r3, r0)
            X.0sq r1 = r3.A0C
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Ack(r2, r0)
            return
        L_0x0586:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = (com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel) r0
            X.027 r2 = r0.A02
            X.0si r0 = r0.A06
            long r0 = r0.A07()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A09(r0)
            return
        L_0x059a:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r2 = (com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel) r2
            X.0si r0 = r2.A06     // Catch:{ IOException -> 0x05a5 }
            java.io.File r5 = r0.A0A()     // Catch:{ IOException -> 0x05a5 }
            goto L_0x05ad
        L_0x05a5:
            r1 = move-exception
            java.lang.String r0 = "restore>RestoreFromBackupViewModel//show-restore-panel-for-local-backup"
            com.whatsapp.util.Log.e(r0, r1)
            r5 = 0
        L_0x05ad:
            X.027 r4 = r2.A01
            X.0sb r0 = r2.A03
            X.1jH r0 = r0.A05()
            java.io.File r1 = r0.A0A
            r0 = 0
            X.C16180sb.A04(r1, r0)
            r0 = 0
            long r2 = X.AnonymousClass1XI.A00(r0, r1)
            if (r5 == 0) goto L_0x05cf
            long r0 = r5.length()
        L_0x05c6:
            long r2 = r2 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A09(r0)
            return
        L_0x05cf:
            r0 = 0
            goto L_0x05c6
        L_0x05d2:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = (com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r0
            X.027 r3 = r0.A0O
            X.1I1 r2 = r0.A0T
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0 = 3
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1.add(r0)
            r0 = 28
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1.add(r0)
            long r1 = r2.A00(r1)
            X.2YH r0 = new X.2YH
            r0.<init>(r1)
            r3.A09(r0)
            return
        L_0x05fd:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r3 = (com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r3
            X.027 r2 = r3.A0G
            X.0si r1 = r3.A0a
            boolean r0 = r1.A0J()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A09(r0)
            X.027 r2 = r3.A0H
            long r0 = r1.A07()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A09(r0)
            return
        L_0x061e:
            java.lang.Object r0 = r13.A00
            X.0xt r0 = (X.C19180xt) r0
            X.C19180xt.A02(r0)
            return
        L_0x0626:
            java.lang.Object r0 = r13.A00
            X.2RU r0 = (X.AnonymousClass2RU) r0
            X.26Y r3 = r0.A01
            r0 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "Direct connection error"
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r3.AQT(r0)
            return
        L_0x063c:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r0 = (com.obwhatsapp.biz.cart.view.fragment.CartFragment) r0
            X.2JH r0 = r0.A0h
            r0.A06()
            return
        L_0x0646:
            java.lang.Object r5 = r13.A00
            X.2XA r5 = (X.AnonymousClass2XA) r5
            X.0uc r0 = r5.A01
            com.whatsapp.jid.UserJid r4 = r5.A05
            X.235 r0 = r0.A0A
            X.1mD r0 = r0.A00(r4)
            if (r0 != 0) goto L_0x065e
            X.027 r1 = r5.A00
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x065a:
            r1.A09(r0)
            return
        L_0x065e:
            boolean r1 = r0.A0J
            r3 = 1
            if (r1 == 0) goto L_0x0668
            boolean r0 = r0.A0L
            r2 = 1
            if (r0 != 0) goto L_0x066b
        L_0x0668:
            r2 = 0
            if (r1 == 0) goto L_0x0674
        L_0x066b:
            X.0uP r0 = r5.A04
            boolean r1 = r0.A02(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0675
        L_0x0674:
            r0 = 0
        L_0x0675:
            X.027 r1 = r5.A00
            if (r2 != 0) goto L_0x067c
            if (r0 != 0) goto L_0x067c
            r3 = 0
        L_0x067c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            goto L_0x065a
        L_0x0681:
            java.lang.Object r1 = r13.A00
            X.26K r1 = (X.AnonymousClass26K) r1
            r1.A02()
            X.0wz r0 = r1.A02
            X.26O r7 = r1.A05
            X.0pd r8 = r0.A05
            X.0ua r3 = r0.A00
            X.0rz r6 = r0.A04
            X.0uc r4 = r0.A01
            X.01D r10 = r0.A07
            X.01J r11 = r0.A08
            X.01J r12 = r0.A0B
            X.168 r9 = r0.A06
            X.0zy r5 = r0.A03
            X.26P r2 = new X.26P
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.Aah(r1)
            return
        L_0x06a7:
            java.lang.Object r1 = r13.A00
            X.26R r1 = (X.AnonymousClass26R) r1
            r1.A02()
            X.0wz r0 = r1.A04
            X.26S r6 = r1.A06
            X.0pd r7 = r0.A05
            X.0ua r3 = r0.A00
            X.0rz r5 = r0.A04
            X.0uc r4 = r0.A01
            X.01D r9 = r0.A07
            X.01J r10 = r0.A08
            X.01J r11 = r0.A0D
            X.168 r8 = r0.A06
            X.26T r2 = new X.26T
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2.Aah(r1)
            return
        L_0x06cb:
            r0 = 2131363827(0x7f0a07f3, float:1.8347474E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r9, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r8)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            return
        L_0x06df:
            r1.A07()
            return
        L_0x06e3:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-unavailable/ no way to install."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x06e9:
            r1 = 27
            r0 = 0
            r3.A3O(r0, r1)
            r3.A3C()
            r0 = 1
            r3.A3P(r0)
            return
        L_0x06f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape3S0100000_I0_2.run():void");
    }
}
