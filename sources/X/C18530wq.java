package X;

import android.content.Context;

/* renamed from: X.0wq  reason: invalid class name and case insensitive filesystem */
public final class C18530wq implements C18540wr {
    public final Context A00;
    public final C18260wP A01;
    public final AnonymousClass01V A02;
    public final C16440t3 A03;
    public final C16260sj A04;
    public final C15860rz A05;
    public final AnonymousClass013 A06;
    public final C14730pf A07;
    public final C18520wp A08;

    public C18530wq(Context context, C18260wP r3, AnonymousClass01V r4, C16440t3 r5, C16260sj r6, C15860rz r7, AnonymousClass013 r8, C14730pf r9, C18520wp r10) {
        C18450wi.A0H(r5, 2);
        C18450wi.A0H(r8, 3);
        C18450wi.A0H(r9, 4);
        C18450wi.A0H(r4, 5);
        C18450wi.A0H(r7, 6);
        C18450wi.A0H(r6, 7);
        C18450wi.A0H(r10, 8);
        C18450wi.A0H(r3, 9);
        this.A00 = context;
        this.A03 = r5;
        this.A06 = r8;
        this.A07 = r9;
        this.A02 = r4;
        this.A05 = r7;
        this.A04 = r6;
        this.A08 = r10;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00eb, code lost:
        if (r7 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0146, code lost:
        if (r6.A0T("android.hardware.ram.low") == false) goto L_0x0148;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00d7 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fa A[SYNTHETIC, Splitter:B:74:0x00fa] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ff A[SYNTHETIC, Splitter:B:78:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUu(X.C75983t2 r15) {
        /*
            r14 = this;
            r3 = 0
            X.C18450wi.A0H(r15, r3)
            java.lang.String r0 = "org.acra.ACRA"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000a }
            goto L_0x000c
        L_0x000a:
            r0 = 0
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0P = r0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x0022 }
            java.lang.String r0 = "mounted"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0022 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r15.A00 = r0
            X.01V r6 = r14.A02
            boolean r0 = X.C004101u.A0C(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0N = r0
            java.lang.Boolean r0 = X.C004101u.A01
            if (r0 != 0) goto L_0x0050
            java.lang.String r1 = "/system/lib/libc_malloc_debug_qemu.so"
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x004c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x004c }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x004c }
            if (r0 == 0) goto L_0x0047
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x004c }
            X.C004101u.A01 = r0     // Catch:{ Exception -> 0x004c }
            goto L_0x0050
        L_0x0047:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x004c }
            X.C004101u.A01 = r0     // Catch:{ Exception -> 0x004c }
            goto L_0x0050
        L_0x004c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.C004101u.A01 = r0
        L_0x0050:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0Q = r0
            android.content.Context r4 = r14.A00
            java.lang.Boolean r0 = X.C004101u.A00
            if (r0 != 0) goto L_0x0084
            r7 = 0
            r5 = 1
            java.lang.String r1 = "/dev/com.genymotion.superuser.daemon"
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0070 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0070 }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x0070
            goto L_0x007c
        L_0x0070:
            android.content.pm.PackageManager r2 = r4.getPackageManager()
            java.lang.String r1 = "com.genymotion.superuser"
            r0 = 128(0x80, float:1.794E-43)
            r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x007d }
            goto L_0x007e
        L_0x007c:
            r7 = 1
        L_0x007d:
            r5 = r7
        L_0x007e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.C004101u.A00 = r0
        L_0x0084:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0L = r0
            r2 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00e3, all -> 0x00f6 }
            java.lang.String r0 = "ps"
            java.lang.Process r1 = r1.exec(r0)     // Catch:{ Exception -> 0x00e3, all -> 0x00f6 }
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x00e3, all -> 0x00f6 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e3, all -> 0x00f6 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00e3, all -> 0x00f6 }
            java.io.InputStream r0 = r1.getErrorStream()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r1.waitFor()     // Catch:{ Exception -> 0x00db }
            int r1 = r5.available()     // Catch:{ Exception -> 0x00db }
            byte[] r0 = new byte[r1]     // Catch:{ Exception -> 0x00db }
            r5.read(r0, r3, r1)     // Catch:{ Exception -> 0x00db }
            int r1 = r7.available()     // Catch:{ Exception -> 0x00db }
            byte[] r0 = new byte[r1]     // Catch:{ Exception -> 0x00db }
            r7.read(r0, r3, r1)     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x00db }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = "com.android.commands.monkey"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x00db }
            if (r0 == 0) goto L_0x00d4
            r7.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            r5.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0103
        L_0x00d4:
            r7.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            r5.close()     // Catch:{ IOException -> 0x0107 }
            goto L_0x0107
        L_0x00db:
            r0 = move-exception
            goto L_0x00e6
        L_0x00dd:
            r0 = move-exception
            r5 = r2
            goto L_0x00ed
        L_0x00e0:
            r0 = move-exception
            r5 = r2
            goto L_0x00e6
        L_0x00e3:
            r0 = move-exception
            r7 = r2
            r5 = r2
        L_0x00e6:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x00ea }
            goto L_0x00f8
        L_0x00ea:
            r0 = move-exception
            if (r7 == 0) goto L_0x00f0
        L_0x00ed:
            r7.close()     // Catch:{ IOException -> 0x00f0 }
        L_0x00f0:
            if (r5 == 0) goto L_0x00f7
            r5.close()     // Catch:{ IOException -> 0x00f7 }
            throw r0
        L_0x00f6:
            r0 = move-exception
        L_0x00f7:
            throw r0
        L_0x00f8:
            if (r7 == 0) goto L_0x00fd
            r7.close()     // Catch:{ IOException -> 0x00fd }
        L_0x00fd:
            if (r5 == 0) goto L_0x0107
            r5.close()     // Catch:{ IOException -> 0x0107 }
            goto L_0x0107
        L_0x0103:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r15.A0M = r0
        L_0x0107:
            boolean r0 = X.C004101u.A0A()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0O = r0
            android.accounts.AccountManager r5 = android.accounts.AccountManager.get(r4)
            r1 = -1
            if (r5 == 0) goto L_0x011f
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r0 = r5.getAccountsByType(r0)     // Catch:{ Exception -> 0x011f }
            int r1 = r0.length     // Catch:{ Exception -> 0x011f }
        L_0x011f:
            long r0 = (long) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0m = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0d = r0
            java.lang.String r0 = android.os.Build.DISPLAY
            r15.A1I = r0
            java.lang.String r0 = X.AnonymousClass1U8.A02()
            r15.A1C = r0
            boolean r0 = X.C15450qv.A07()
            if (r0 == 0) goto L_0x0148
            java.lang.String r0 = "android.hardware.ram.low"
            boolean r1 = r6.A0T(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0149
        L_0x0148:
            r0 = 0
        L_0x0149:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A04 = r0
            X.013 r5 = r14.A06
            java.lang.String r0 = r5.A06()
            r15.A1G = r0
            java.lang.String r0 = r5.A05()
            r15.A1H = r0
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r0 = "com.android.vending"
            r15.A1E = r0
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp"
            r15.A1J = r0
            byte[] r0 = X.C004101u.A0F(r4)
            byte[] r0 = com.obwhatsapp.yo.yo.md()
            java.lang.String r0 = X.C004101u.A05(r0)
            r15.A1B = r0
            android.content.pm.Signature[] r8 = com.obwhatsapp.yo.yo.getYoSig()
            if (r8 == 0) goto L_0x01ae
            int r7 = r8.length
            if (r7 == 0) goto L_0x01ae
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0193 }
            r2.reset()
            r1 = 0
            goto L_0x0198
        L_0x0193:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x01ae
        L_0x0198:
            r0 = r8[r1]
            byte[] r0 = r0.toByteArray()
            r2.update(r0)
            int r1 = r1 + 1
            if (r1 < r7) goto L_0x0198
            byte[] r1 = r2.digest()
            r0 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
        L_0x01ae:
            r15.A1K = r2
            int r0 = X.AnonymousClass1U8.A00()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A14 = r0
            X.0sj r2 = r14.A04
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            int r0 = r2.A03(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0y = r0
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            int r0 = r2.A03(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A12 = r0
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            int r0 = r2.A03(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0x = r0
            boolean r0 = X.C15450qv.A04()
            if (r0 == 0) goto L_0x0410
            r0 = 0
        L_0x01ec:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0z = r0
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r0 = r2.A03(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A13 = r0
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r0 = r2.A03(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A11 = r0
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r2.A03(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0w = r0
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = r2.A03(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0u = r0
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r2.A03(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0v = r0
            java.lang.String r0 = "android.permission.RECEIVE_SMS"
            int r0 = r2.A03(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A10 = r0
            X.0pf r2 = r14.A07
            long r0 = r2.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A15 = r0
            long r0 = r2.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A16 = r0
            long r0 = r2.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0i = r0
            long r0 = r2.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0j = r0
            boolean r0 = X.C14730pf.A00()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A03 = r0
            X.0rz r2 = r14.A05
            int r7 = r2.A03()
            r1 = r7 & 2
            r0 = 0
            if (r1 == 0) goto L_0x0280
            r0 = 1
        L_0x0280:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A06 = r0
            r1 = r7 & 8
            r0 = 0
            if (r1 == 0) goto L_0x028c
            r0 = 1
        L_0x028c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A09 = r0
            r1 = r7 & 1
            r0 = 0
            if (r1 == 0) goto L_0x0298
            r0 = 1
        L_0x0298:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0C = r0
            r1 = r7 & 4
            r0 = 0
            if (r1 == 0) goto L_0x02a4
            r0 = 1
        L_0x02a4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0F = r0
            X.01D r11 = r2.A01
            java.lang.Object r1 = r11.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "autodownload_roaming_mask"
            int r2 = r1.getInt(r0, r3)
            r1 = r2 & 2
            r0 = 0
            if (r1 == 0) goto L_0x02be
            r0 = 1
        L_0x02be:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A07 = r0
            r1 = r2 & 8
            r0 = 0
            if (r1 == 0) goto L_0x02ca
            r0 = 1
        L_0x02ca:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0A = r0
            r1 = r2 & 1
            r0 = 0
            if (r1 == 0) goto L_0x02d6
            r0 = 1
        L_0x02d6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0D = r0
            r1 = r2 & 4
            r0 = 0
            if (r1 == 0) goto L_0x02e2
            r0 = 1
        L_0x02e2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0G = r0
            java.lang.Object r2 = r11.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "autodownload_wifi_mask"
            r0 = 15
            int r2 = r2.getInt(r1, r0)
            r1 = r2 & 2
            r0 = 0
            if (r1 == 0) goto L_0x02fc
            r0 = 1
        L_0x02fc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A08 = r0
            r1 = r2 & 8
            r0 = 0
            if (r1 == 0) goto L_0x0308
            r0 = 1
        L_0x0308:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0B = r0
            r1 = r2 & 1
            r0 = 0
            if (r1 == 0) goto L_0x0314
            r0 = 1
        L_0x0314:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0E = r0
            r0 = r2 & 4
            if (r0 == 0) goto L_0x031f
            r3 = 1
        L_0x031f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r15.A0H = r0
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r7 = r11.get()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.lang.String r10 = "last_daily_event"
            r0 = 0
            long r12 = r7.getLong(r10, r0)
            r8 = 0
            int r7 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0345
            long r8 = r2 - r12
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0345
            r8 = 1
        L_0x0345:
            java.lang.Object r0 = r11.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r10, r2)
            r0.apply()
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r15.A17 = r0
            X.0wP r7 = r14.A01
            r3 = 1
            int r2 = r7.A04(r3)
            r1 = 3
            r0 = 0
            if (r2 != r1) goto L_0x0368
            r0 = 1
        L_0x0368:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0S = r0
            boolean r0 = X.C15450qv.A05()
            if (r0 == 0) goto L_0x0380
            boolean r0 = r7.A0B()
            if (r0 == 0) goto L_0x040a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x037e:
            r15.A0Z = r0
        L_0x0380:
            boolean r0 = X.C15450qv.A08()
            if (r0 == 0) goto L_0x03a7
            android.app.usage.UsageStatsManager r0 = r6.A0A()
            if (r0 == 0) goto L_0x0397
            int r0 = r0.getAppStandbyBucket()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15.A0e = r0
        L_0x0397:
            android.app.ActivityManager r0 = r6.A03()
            if (r0 == 0) goto L_0x03a7
            boolean r0 = r0.isBackgroundRestricted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0I = r0
        L_0x03a7:
            boolean r0 = X.C15450qv.A02()
            if (r0 == 0) goto L_0x0408
            X.03S r0 = new X.03S
            r0.<init>(r4)
            boolean r1 = r0.A03()
            r0 = 2
            if (r1 == 0) goto L_0x03ba
            r0 = 1
        L_0x03ba:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.A0a = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.getLanguage()
            r15.A1D = r0
            boolean r0 = r5.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A05 = r0
            X.0wp r0 = r14.A08
            java.util.Locale r0 = r0.A00()
            if (r0 == 0) goto L_0x0405
            java.lang.String r2 = r0.getLanguage()
            if (r2 == 0) goto L_0x03ee
            java.lang.String r0 = "[a-z]{2}"
            boolean r0 = java.util.regex.Pattern.matches(r0, r2)
            if (r0 != 0) goto L_0x0402
        L_0x03ee:
            java.lang.String r1 = "KeyboardLanguageExtractor/getCurrentKeyboardLanguage/invalid-language "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r2 = "zz"
        L_0x0402:
            r15.A1F = r2
            return
        L_0x0405:
            java.lang.String r2 = ""
            goto L_0x0402
        L_0x0408:
            r0 = 3
            goto L_0x03ba
        L_0x040a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x037e
        L_0x0410:
            java.lang.String[] r0 = X.C28971Zm.A00(r4, r3, r3)
            int r0 = r2.A04(r0)
            long r0 = (long) r0
            goto L_0x01ec
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18530wq.AUu(X.3t2):void");
    }
}
