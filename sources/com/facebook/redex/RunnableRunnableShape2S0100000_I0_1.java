package com.facebook.redex;

public class RunnableRunnableShape2S0100000_I0_1 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape2S0100000_I0_1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02cf, code lost:
        r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04ab, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04ae, code lost:
        if (r3.A0F != false) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04b0, code lost:
        r3.A0F = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04b3, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r10 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04b6, code lost:
        if (r10 != null) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04b8, code lost:
        r10 = new org.whispersystems.curve25519.NativeVOPRFExtension();
        r3.A01 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04bf, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        r6 = r3.A05;
        r0 = new byte[r6.A00().getInt("token_length", 0)];
        r4 = r10.A00;
        r4.A00(r0);
        r3.A0I = r0;
        r7 = null;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04dd, code lost:
        if (r12 >= 256) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04df, code lost:
        r7 = new byte[r6.A00().getInt("token_length", 0)];
        r4.A00(r7);
        r7[31] = (byte) (r7[31] & 31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04f9, code lost:
        if (r10.A00(r7) != false) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04fb, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04ff, code lost:
        if (r12 < 256) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0501, code lost:
        com.whatsapp.util.Log.w("ACSToken/generateCredentialToken cannot generate valid blindingFactor");
        r6.A01(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x050a, code lost:
        r0 = r10.A02(r3.A0I, r7, r6.A00().getInt("token_length", 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0518, code lost:
        if (r0 != null) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x051a, code lost:
        com.whatsapp.util.Log.e("ACSToken/generateCredentialToken failed to blind the token");
        r6.A01(7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0523, code lost:
        r3.A02(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0527, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        r3.A0G = r9;
        r3.A0H = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x052e, code lost:
        if (r9 == false) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0531, code lost:
        r6.A04("original_token_string", android.util.Base64.encodeToString(r3.A0I, 10));
        r6.A04("blinding_factor_string", android.util.Base64.encodeToString(r7, 10));
        r6.A04("shared_secret_string", (java.lang.String) null);
        r6.A02("redeem_count", -1);
        r6.A03("base_timestamp", 0);
        r6.A03("time_to_live_in_seconds", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x055f, code lost:
        r6.A04("next_original_token_string", android.util.Base64.encodeToString(r3.A0I, 10));
        r6.A04("blinding_factor_string", android.util.Base64.encodeToString(r7, 10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0573, code lost:
        r3.A0B = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x057b, code lost:
        if (r3.A03.A08() == false) goto L_0x058b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x057d, code lost:
        r3.A0E = r3.A06.A00(r3.A0H, r3.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0589, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x058b, code lost:
        r3.A01(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x058f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0592, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0595, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0596, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0616, code lost:
        r2.A0K(new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1(r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x061e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x062d, code lost:
        X.AnonymousClass29T.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0630, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06ca, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        r1 = r0.A01().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r1.hasNext() == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
        ((X.C33391iV) r1.next()).ATq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x028b, code lost:
        r1.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x028e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x06ac;
                case 1: goto L_0x010b;
                case 2: goto L_0x069c;
                case 3: goto L_0x0692;
                case 4: goto L_0x0687;
                case 5: goto L_0x0675;
                case 6: goto L_0x0663;
                case 7: goto L_0x00ee;
                case 8: goto L_0x00c0;
                case 9: goto L_0x00a4;
                case 10: goto L_0x0098;
                case 11: goto L_0x0659;
                case 12: goto L_0x0651;
                case 13: goto L_0x008a;
                case 14: goto L_0x0643;
                case 15: goto L_0x0639;
                case 16: goto L_0x0631;
                case 17: goto L_0x061f;
                case 18: goto L_0x060e;
                case 19: goto L_0x05ff;
                case 20: goto L_0x05e3;
                case 21: goto L_0x05d8;
                case 22: goto L_0x05d0;
                case 23: goto L_0x05c6;
                case 24: goto L_0x0072;
                case 25: goto L_0x05a4;
                case 26: goto L_0x0597;
                case 27: goto L_0x0005;
                case 28: goto L_0x04a6;
                case 29: goto L_0x04a0;
                case 30: goto L_0x047c;
                case 31: goto L_0x04a0;
                case 32: goto L_0x04a6;
                case 33: goto L_0x0472;
                case 34: goto L_0x0444;
                case 35: goto L_0x043c;
                case 36: goto L_0x03fe;
                case 37: goto L_0x03ba;
                case 38: goto L_0x03aa;
                case 39: goto L_0x0394;
                case 40: goto L_0x0005;
                case 41: goto L_0x02e7;
                case 42: goto L_0x0040;
                case 43: goto L_0x000d;
                case 44: goto L_0x02db;
                case 45: goto L_0x02d3;
                case 46: goto L_0x028f;
                case 47: goto L_0x018e;
                case 48: goto L_0x014f;
                case 49: goto L_0x0149;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A00
            X.13d r0 = (X.C211913d) r0
            r0.A04()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r14.A00
            X.1Qk r0 = (X.C27091Qk) r0
            X.14W r0 = r0.A03
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r2 = r0.iterator()
        L_0x001b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r1 = r2.next()
            X.1we r1 = (X.C41781we) r1
            boolean r0 = r1 instanceof com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0
            if (r0 == 0) goto L_0x001b
            com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0 r1 = (com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0) r1
            int r0 = r1.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x001b
            java.lang.Object r0 = r1.A00
            X.1wf r0 = (X.C41791wf) r0
            X.1wg r1 = r0.A03
            if (r1 == 0) goto L_0x001b
            r0 = 0
            r1.AQw(r0, r0)
            goto L_0x001b
        L_0x0040:
            java.lang.Object r0 = r14.A00
            X.1Qk r0 = (X.C27091Qk) r0
            X.14W r0 = r0.A03
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r2 = r0.iterator()
        L_0x004e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r1 = r2.next()
            X.1we r1 = (X.C41781we) r1
            boolean r0 = r1 instanceof com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0
            if (r0 == 0) goto L_0x004e
            com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0 r1 = (com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0) r1
            int r0 = r1.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x004e
            java.lang.Object r0 = r1.A00
            X.1wf r0 = (X.C41791wf) r0
            X.1wg r0 = r0.A03
            if (r0 == 0) goto L_0x004e
            r0.AVr()
            goto L_0x004e
        L_0x0072:
            java.lang.Object r2 = r14.A00
            com.obwhatsapp.WaEditText r2 = (com.obwhatsapp.WaEditText) r2
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x000c
            X.01V r0 = r2.A02
            android.view.inputmethod.InputMethodManager r1 = r0.A0Q()
            X.AnonymousClass00B.A06(r1)
            r0 = 0
            r1.showSoftInput(r2, r0)
            r2.A04 = r0
            return
        L_0x008a:
            java.lang.Object r0 = r14.A00
            X.138 r0 = (X.AnonymousClass138) r0
            X.4F9 r0 = r0.A00
            if (r0 == 0) goto L_0x000c
            com.obwhatsapp.settings.SettingsPrivacy r0 = r0.A00
            r0.A3A()
            return
        L_0x0098:
            java.lang.Object r0 = r14.A00
            X.1kV r0 = (X.C34581kV) r0
            X.12w r1 = r0.A01
            r0 = 0
            r1.A01 = r0
            X.1iW r0 = r1.A05
            goto L_0x00a8
        L_0x00a4:
            java.lang.Object r0 = r14.A00
            X.0tJ r0 = (X.C16590tJ) r0
        L_0x00a8:
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x00b0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r1.next()
            X.1iV r0 = (X.C33391iV) r0
            r0.ATq()
            goto L_0x00b0
        L_0x00c0:
            java.lang.Object r3 = r14.A00
            X.12z r3 = (X.C211512z) r3
            X.0xT r0 = r3.A0D
            java.util.concurrent.locks.Lock r2 = r0.A01()
            if (r2 == 0) goto L_0x00cf
            r2.lock()     // Catch:{ all -> 0x06bc }
        L_0x00cf:
            X.11s r1 = r3.A0B     // Catch:{ all -> 0x06bc }
            boolean r0 = r1.A0c()     // Catch:{ all -> 0x06bc }
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = "pre key is not yet sent to server; scheduling pre key sending"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06bc }
            r3.A03()     // Catch:{ all -> 0x06bc }
            goto L_0x00e8
        L_0x00e0:
            java.lang.String r0 = "no prekeys to send on new axolotl store, generating more keys"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06bc }
            r1.A0P()     // Catch:{ all -> 0x06bc }
        L_0x00e8:
            if (r2 == 0) goto L_0x000c
            r2.unlock()
            return
        L_0x00ee:
            java.lang.Object r2 = r14.A00
            X.12z r2 = (X.C211512z) r2
            X.0xT r0 = r2.A0D
            java.util.concurrent.locks.Lock r1 = r0.A01()
            if (r1 == 0) goto L_0x00fd
            r1.lock()     // Catch:{ all -> 0x06c3 }
        L_0x00fd:
            X.11s r0 = r2.A0B     // Catch:{ all -> 0x06c3 }
            r0.A0O()     // Catch:{ all -> 0x06c3 }
            r2.A03()     // Catch:{ all -> 0x06c3 }
            if (r1 == 0) goto L_0x000c
            r1.unlock()
            return
        L_0x010b:
            java.lang.Object r4 = r14.A00
            X.2JI r4 = (X.AnonymousClass2JI) r4
            X.0qs r3 = r4.A05
            r1 = r3
            com.obwhatsapp.KeyboardPopupLayout r1 = (com.obwhatsapp.KeyboardPopupLayout) r1
            r0 = 0
            r1.A06 = r0
            android.app.Activity r2 = r4.A03
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 1
            if (r0 != r1) goto L_0x0143
            boolean r0 = r4.A09()
            if (r0 != 0) goto L_0x0143
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.keyboard
            if (r0 != r1) goto L_0x0143
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x000c
        L_0x0143:
            android.view.View r3 = (android.view.View) r3
            r3.requestLayout()
            return
        L_0x0149:
            java.lang.Object r0 = r14.A00
            X.1b6 r0 = (X.C29731b6) r0
            goto L_0x02cf
        L_0x014f:
            java.lang.Object r5 = r14.A00
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r5 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r5
            X.027 r4 = r5.A02
            X.0sd r0 = r5.A0B
            X.0sk r1 = r0.A01     // Catch:{ IOException -> 0x017a }
            byte[] r0 = r1.A03()     // Catch:{ IOException -> 0x017a }
            if (r0 != 0) goto L_0x0168
            r0 = 32
            byte[] r0 = X.C004101u.A0E(r0)     // Catch:{ IOException -> 0x017a }
            r1.A02(r0)     // Catch:{ IOException -> 0x017a }
        L_0x0168:
            java.lang.String r3 = X.AnonymousClass1ZW.A0D(r0)     // Catch:{ IOException -> 0x017a }
            int r2 = r3.length()     // Catch:{ IOException -> 0x017a }
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L_0x0176
            r0 = 1
        L_0x0176:
            X.AnonymousClass00B.A0F(r0)     // Catch:{ IOException -> 0x017a }
            goto L_0x0181
        L_0x017a:
            r1 = move-exception
            java.lang.String r0 = "EncBackupManager/getAndSaveRootKey/failed to get and save root key"
            com.whatsapp.util.Log.e(r0, r1)
            r3 = 0
        L_0x0181:
            r4.A09(r3)
            X.027 r1 = r5.A03
            r0 = 301(0x12d, float:4.22E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x028b
        L_0x018e:
            java.lang.Object r2 = r14.A00
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r2 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r2
            X.0sd r1 = r2.A0B
            X.027 r0 = r2.A05
            java.lang.Object r0 = r0.A01()
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.4Cx r9 = new X.4Cx
            r9.<init>(r2)
            byte[] r10 = r0.getBytes()
            X.0sk r0 = r1.A01
            X.0tw r8 = r0.A00()
            X.AnonymousClass00B.A06(r8)
            byte[] r7 = r8.A02
            int r6 = r8.A00
            java.lang.String r5 = "PBKDF2WithHmacSHA512"
            r4 = 512(0x200, float:7.175E-43)
            int r3 = r10.length
            char[] r2 = new char[r3]
            r1 = 0
        L_0x01bd:
            if (r1 >= r3) goto L_0x01c7
            byte r0 = r10[r1]
            char r0 = (char) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x01bd
        L_0x01c7:
            javax.crypto.SecretKey r0 = X.C004101u.A06(r5, r7, r2, r6, r4)
            byte[] r1 = r0.getEncoded()
            byte[] r0 = r8.A01
            boolean r0 = java.security.MessageDigest.isEqual(r1, r0)
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r3 = r9.A00
            r4 = 5
            if (r0 == 0) goto L_0x0214
            java.lang.String r0 = "EncBackupViewModel/successfully verified password"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.027 r1 = r3.A0A
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            X.0rz r0 = r3.A0D
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "encrypted_backup_num_attempts_remaining"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r4)
            r0.apply()
            int r1 = r3.A05()
            r0 = 3
            r2 = 4
            if (r1 == r2) goto L_0x0203
            if (r1 == r4) goto L_0x0277
            r3.A07()
            return
        L_0x0203:
            X.027 r1 = r3.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09(r0)
            r3.A0A(r2)
            X.027 r1 = r3.A03
            r4 = 302(0x12e, float:4.23E-43)
            goto L_0x0287
        L_0x0214:
            java.lang.String r0 = "EncBackupViewModel/invalid password"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r8 = r3.A0D
            X.01D r0 = r8.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r7 = "encrypted_backup_num_attempts_remaining"
            r0 = 0
            int r0 = r1.getInt(r7, r0)
            int r5 = r0 + -1
            if (r5 > 0) goto L_0x0260
            X.0sd r0 = r3.A0B
            X.0sk r0 = r0.A01
            X.0tz r0 = r0.A00
            android.content.Context r6 = r0.A00
            java.io.File r2 = r6.getFilesDir()
            java.lang.String r1 = "password_hash.key"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            X.AnonymousClass1XI.A0N(r0)
            java.io.File r2 = r6.getFilesDir()
            java.lang.String r1 = "password_hash_salt.key"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            X.AnonymousClass1XI.A0N(r0)
            java.io.File r2 = r6.getFilesDir()
            java.lang.String r1 = "password_data.key"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            X.AnonymousClass1XI.A0N(r0)
        L_0x0260:
            android.content.SharedPreferences$Editor r0 = r8.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r7, r5)
            r0.apply()
            X.027 r1 = r3.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A09(r0)
            X.027 r1 = r3.A04
            goto L_0x0287
        L_0x0277:
            X.027 r1 = r3.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09(r0)
            r3.A0A(r2)
            X.027 r1 = r3.A03
            r4 = 300(0x12c, float:4.2E-43)
        L_0x0287:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x028b:
            r1.A09(r0)
            return
        L_0x028f:
            java.lang.Object r3 = r14.A00
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r3 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r3
            X.0ug r2 = r3.A0G     // Catch:{ 1kR -> 0x029b }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A07(r0)     // Catch:{ 1kR -> 0x029b }
            goto L_0x02b0
        L_0x029b:
            r1 = move-exception
            java.lang.String r0 = "Failed to connect to chatd"
            com.whatsapp.util.Log.w(r0, r1)
            r2 = 4
            java.lang.String r0 = "EncBackupViewModel/failed to retrieve and save backup key due to a server error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.027 r1 = r3.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A09(r0)
        L_0x02b0:
            X.0sd r2 = r3.A0B
            X.027 r0 = r3.A05
            java.lang.Object r7 = r0.A01()
            X.AnonymousClass00B.A06(r7)
            java.lang.String r7 = (java.lang.String) r7
            X.4v3 r1 = new X.4v3
            r1.<init>(r3)
            X.0sq r5 = r2.A07
            com.whatsapp.wamsys.JniBridge r6 = r2.A08
            X.18X r3 = r2.A05
            X.1ue r4 = r2.A06
            X.1b5 r0 = new X.1b5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x02cf:
            r0.A01()
            return
        L_0x02d3:
            java.lang.Object r0 = r14.A00
            X.0sd r0 = (X.C16200sd) r0
            r0.A02()
            return
        L_0x02db:
            java.lang.Object r0 = r14.A00
            X.1RH r0 = (X.AnonymousClass1RH) r0
            X.0tz r0 = r0.A00
            android.content.Context r0 = r0.A00
            X.C40691uX.A09(r0)
            return
        L_0x02e7:
            java.lang.Object r0 = r14.A00
            X.1Qm r0 = (X.C27111Qm) r0
            X.1Ql r4 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0F
            r0 = 1
            r1.set(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r4.A00
            java.lang.Object r3 = r0.get()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0308
            X.0pt r2 = r4.A01
            r1 = 5
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r0.<init>(r1, r3, r4)
            r2.A0K(r0)
        L_0x0308:
            X.1Qh r3 = r4.A0D
            r2 = 0
            r1 = 1
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1[r2] = r0
            java.lang.String r0 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id) WHERE installed_is_avatar_pack = ?"
            java.util.List r0 = r3.A00(r0, r1)
            java.util.Iterator r6 = r0.iterator()
        L_0x031f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0348
            java.lang.Object r1 = r6.next()
            X.1pi r1 = (X.C37771pi) r1
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x031f
            X.1CX r5 = r4.A0A
            java.lang.String r3 = r1.A0F
            X.1qu r1 = r4.A09
            X.14W r0 = r5.A0K
            X.1qv r2 = new X.1qv
            r2.<init>(r0, r1, r5)
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r3
            X.0sq r0 = r5.A0Y
            r0.Ack(r2, r1)
            goto L_0x031f
        L_0x0348:
            X.13g r0 = r4.A06
            X.4QQ r0 = r0.A02
            r1 = 1
            X.0qW r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.1zV r0 = (X.C43201zV) r0
            r0.A03(r1)
            X.13k r3 = r4.A08
            X.1WA r2 = r3.A09
            r1 = 8
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r3, r1)
            r2.execute(r0)
            X.1Go r5 = r4.A0C
            X.AnonymousClass00B.A00()
            r5.A01()
            X.1Qj r0 = r5.A04
            X.12j r0 = r0.A01
            X.0tf r4 = r0.A02()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x038f }
            r1 = 0
            java.lang.String r0 = "1"
            r3[r1] = r0     // Catch:{ all -> 0x038f }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x038f }
            java.lang.String r1 = "starred_stickers"
            java.lang.String r0 = "is_avatar = ?"
            r2.A01(r1, r0, r3)     // Catch:{ all -> 0x038f }
            r4.close()
            r5.A01()
            return
        L_0x038f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0393 }
        L_0x0393:
            throw r0
        L_0x0394:
            java.lang.Object r3 = r14.A00
            com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r3 = (com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r3
            X.0pt r0 = r3.A04
            r0.A05()
            X.0pt r2 = r3.A04
            r1 = 2131892286(0x7f12183e, float:1.9419316E38)
            r0 = 0
            r2.A09(r1, r0)
            r3.A1O()
            return
        L_0x03aa:
            java.lang.Object r1 = r14.A00
            com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r1 = (com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r1
            com.obwhatsapp.CodeInputField r0 = r1.A03
            r0.requestFocus()
            com.obwhatsapp.CodeInputField r1 = r1.A03
            r0 = 0
            r1.A04(r0)
            return
        L_0x03ba:
            java.lang.Object r4 = r14.A00
            com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            X.0pt r0 = r4.A04
            r0.A05()
            android.content.Context r0 = r4.A0u()
            X.1fu r1 = new X.1fu
            r1.<init>(r0)
            r0 = 2131892306(0x7f121852, float:1.9419357E38)
            r1.A01(r0)
            X.02l r3 = r1.create()
            r0 = 2131891306(0x7f12146a, float:1.9417328E38)
            java.lang.String r2 = r4.A0J(r0)
            r0 = 15
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r1.<init>(r4, r0)
            r0 = -1
            r3.A03(r0, r2, r1)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            java.lang.String r2 = r4.A0J(r0)
            r0 = 17
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r1.<init>(r4, r0)
            r0 = -2
            r3.A03(r0, r2, r1)
            r3.show()
            return
        L_0x03fe:
            java.lang.Object r4 = r14.A00
            X.01A r4 = (X.AnonymousClass01A) r4
            android.content.Context r0 = r4.A0u()
            X.1fu r1 = new X.1fu
            r1.<init>(r0)
            r0 = 2131891677(0x7f1215dd, float:1.941808E38)
            r1.A01(r0)
            X.02l r3 = r1.create()
            r0 = 2131891676(0x7f1215dc, float:1.9418079E38)
            java.lang.String r2 = r4.A0J(r0)
            r0 = 16
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r1.<init>(r4, r0)
            r0 = -1
            r3.A03(r0, r2, r1)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            java.lang.String r2 = r4.A0J(r0)
            r0 = 4
            com.facebook.redex.IDxCListenerShape23S0000000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape23S0000000_2_I1
            r1.<init>(r0)
            r0 = -2
            r3.A03(r0, r2, r1)
            r3.show()
            return
        L_0x043c:
            java.lang.Object r0 = r14.A00
            com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r0 = (com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r0
            r0.AZH()
            return
        L_0x0444:
            java.lang.Object r0 = r14.A00
            X.1gt r0 = (X.C32641gt) r0
            com.whatsapp.anr.SigquitBasedANRDetector r1 = r0.A01
            java.io.File r2 = r0.A00
            java.lang.String r0 = "SigquitBasedANRDetector/abortANRAndDiscardReport"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "SigquitBasedANRDetector/abortANR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r1.A0A = r0
            java.lang.String r0 = "anr-helper/discarding anr report: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.delete()
            return
        L_0x0472:
            java.lang.Object r0 = r14.A00
            X.1gt r0 = (X.C32641gt) r0
            com.whatsapp.anr.SigquitBasedANRDetector r1 = r0.A01
            r0 = 0
            r1.A0A = r0
            return
        L_0x047c:
            java.lang.Object r3 = r14.A00
            X.0tD r3 = (X.C16530tD) r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A0D = r0
            X.0tK r0 = r3.A03
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x049b
            X.3Gc r2 = r3.A06
            byte[] r1 = r3.A0H
            java.lang.String r0 = r3.A0A
            java.lang.String r0 = r2.A00(r1, r0)
            r3.A0E = r0
            return
        L_0x049b:
            r0 = 5
            r3.A01(r0)
            return
        L_0x04a0:
            java.lang.Object r3 = r14.A00
            X.0tD r3 = (X.C16530tD) r3
            r9 = 0
            goto L_0x04ab
        L_0x04a6:
            java.lang.Object r3 = r14.A00
            X.0tD r3 = (X.C16530tD) r3
            r9 = 1
        L_0x04ab:
            monitor-enter(r3)
            boolean r0 = r3.A0F     // Catch:{ all -> 0x06ca }
            if (r0 != 0) goto L_0x0595
            r2 = 1
            r3.A0F = r2     // Catch:{ all -> 0x06ca }
            monitor-enter(r3)     // Catch:{ all -> 0x06ca }
            org.whispersystems.curve25519.NativeVOPRFExtension r10 = r3.A01     // Catch:{ all -> 0x0592 }
            if (r10 != 0) goto L_0x04bf
            org.whispersystems.curve25519.NativeVOPRFExtension r10 = new org.whispersystems.curve25519.NativeVOPRFExtension     // Catch:{ all -> 0x0592 }
            r10.<init>()     // Catch:{ all -> 0x0592 }
            r3.A01 = r10     // Catch:{ all -> 0x0592 }
        L_0x04bf:
            monitor-exit(r3)     // Catch:{ all -> 0x0592 }
            X.0tE r6 = r3.A05     // Catch:{ all -> 0x06ca }
            android.content.SharedPreferences r1 = r6.A00()     // Catch:{ all -> 0x06ca }
            java.lang.String r11 = "token_length"
            r0 = 0
            int r0 = r1.getInt(r11, r0)     // Catch:{ all -> 0x06ca }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x06ca }
            X.2Iu r4 = r10.A00     // Catch:{ all -> 0x06ca }
            r4.A00(r0)     // Catch:{ all -> 0x06ca }
            r3.A0I = r0     // Catch:{ all -> 0x06ca }
            r8 = 0
            r5 = 0
            r7 = r8
            r12 = 0
        L_0x04db:
            r1 = 256(0x100, float:3.59E-43)
            if (r12 >= r1) goto L_0x04fe
            android.content.SharedPreferences r0 = r6.A00()     // Catch:{ all -> 0x06ca }
            int r0 = r0.getInt(r11, r5)     // Catch:{ all -> 0x06ca }
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x06ca }
            r4.A00(r7)     // Catch:{ all -> 0x06ca }
            r13 = 31
            byte r0 = r7[r13]     // Catch:{ all -> 0x06ca }
            r0 = r0 & 31
            byte r0 = (byte) r0     // Catch:{ all -> 0x06ca }
            r7[r13] = r0     // Catch:{ all -> 0x06ca }
            boolean r0 = r10.A00(r7)     // Catch:{ all -> 0x06ca }
            if (r0 != 0) goto L_0x04fe
            int r12 = r12 + 1
            goto L_0x04db
        L_0x04fe:
            r4 = 5
            if (r12 < r1) goto L_0x050a
            java.lang.String r0 = "ACSToken/generateCredentialToken cannot generate valid blindingFactor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x06ca }
            r6.A01(r4)     // Catch:{ all -> 0x06ca }
            goto L_0x0523
        L_0x050a:
            byte[] r1 = r3.A0I     // Catch:{ all -> 0x06ca }
            android.content.SharedPreferences r0 = r6.A00()     // Catch:{ all -> 0x06ca }
            int r0 = r0.getInt(r11, r5)     // Catch:{ all -> 0x06ca }
            byte[] r0 = r10.A02(r1, r7, r0)     // Catch:{ all -> 0x06ca }
            if (r0 != 0) goto L_0x0527
            java.lang.String r0 = "ACSToken/generateCredentialToken failed to blind the token"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06ca }
            r0 = 7
            r6.A01(r0)     // Catch:{ all -> 0x06ca }
        L_0x0523:
            r3.A02(r2)     // Catch:{ all -> 0x06ca }
            goto L_0x0595
        L_0x0527:
            monitor-enter(r3)     // Catch:{ all -> 0x06ca }
            r3.A0G = r9     // Catch:{ all -> 0x058f }
            r3.A0H = r0     // Catch:{ all -> 0x058f }
            r2 = 10
            if (r9 == 0) goto L_0x0531
            goto L_0x055f
        L_0x0531:
            byte[] r0 = r3.A0I     // Catch:{ all -> 0x058f }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ all -> 0x058f }
            java.lang.String r0 = "original_token_string"
            r6.A04(r0, r1)     // Catch:{ all -> 0x058f }
            java.lang.String r1 = android.util.Base64.encodeToString(r7, r2)     // Catch:{ all -> 0x058f }
            java.lang.String r0 = "blinding_factor_string"
            r6.A04(r0, r1)     // Catch:{ all -> 0x058f }
            java.lang.String r0 = "shared_secret_string"
            r6.A04(r0, r8)     // Catch:{ all -> 0x058f }
            r1 = -1
            java.lang.String r0 = "redeem_count"
            r6.A02(r0, r1)     // Catch:{ all -> 0x058f }
            r1 = 0
            java.lang.String r0 = "base_timestamp"
            r6.A03(r0, r1)     // Catch:{ all -> 0x058f }
            java.lang.String r0 = "time_to_live_in_seconds"
            r6.A03(r0, r1)     // Catch:{ all -> 0x058f }
            goto L_0x0573
        L_0x055f:
            byte[] r0 = r3.A0I     // Catch:{ all -> 0x058f }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ all -> 0x058f }
            java.lang.String r0 = "next_original_token_string"
            r6.A04(r0, r1)     // Catch:{ all -> 0x058f }
            java.lang.String r1 = android.util.Base64.encodeToString(r7, r2)     // Catch:{ all -> 0x058f }
            java.lang.String r0 = "blinding_factor_string"
            r6.A04(r0, r1)     // Catch:{ all -> 0x058f }
        L_0x0573:
            r3.A0B = r5     // Catch:{ all -> 0x058f }
            X.0tK r0 = r3.A03     // Catch:{ all -> 0x058f }
            boolean r0 = r0.A08()     // Catch:{ all -> 0x058f }
            if (r0 == 0) goto L_0x058b
            X.3Gc r2 = r3.A06     // Catch:{ all -> 0x058f }
            byte[] r1 = r3.A0H     // Catch:{ all -> 0x058f }
            java.lang.String r0 = r3.A0A     // Catch:{ all -> 0x058f }
            java.lang.String r0 = r2.A00(r1, r0)     // Catch:{ all -> 0x058f }
            r3.A0E = r0     // Catch:{ all -> 0x058f }
        L_0x0589:
            monitor-exit(r3)     // Catch:{ all -> 0x058f }
            goto L_0x0595
        L_0x058b:
            r3.A01(r4)     // Catch:{ all -> 0x058f }
            goto L_0x0589
        L_0x058f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x058f }
            goto L_0x0594
        L_0x0592:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0592 }
        L_0x0594:
            throw r0     // Catch:{ all -> 0x06ca }
        L_0x0595:
            monitor-exit(r3)
            return
        L_0x0597:
            java.lang.Object r1 = r14.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "acceptlink/wait/timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.finish()
            return
        L_0x05a4:
            java.lang.Object r1 = r14.A00
            X.0yv r1 = (X.C19740yv) r1
            X.0tz r0 = r1.A08
            android.content.Context r2 = r0.A00
            X.0so r3 = r1.A00
            X.0rt r10 = r1.A0B
            X.0ud r5 = r1.A04
            X.0sG r6 = r1.A05
            X.0sP r7 = r1.A06
            X.01Y r4 = r1.A03
            X.0sj r9 = r1.A09
            X.151 r12 = r1.A0D
            X.0sO r13 = r1.A0E
            X.152 r8 = r1.A07
            X.14t r11 = r1.A0C
            X.AnonymousClass2EA.A0D(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x05c6:
            java.lang.Object r0 = r14.A00
            X.2SX r0 = (X.AnonymousClass2SX) r0
            android.widget.ListView r0 = r0.A01
            r0.focusableViewAvailable(r0)
            return
        L_0x05d0:
            java.lang.Object r0 = r14.A00
            X.0pP r0 = (X.C14570pP) r0
            r0.A29()
            return
        L_0x05d8:
            java.lang.Object r0 = r14.A00
            X.2bW r0 = (X.C51372bW) r0
            X.2RY r0 = r0.A01
            android.app.Activity r1 = r0.A01
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x062d
        L_0x05e3:
            java.lang.Object r5 = r14.A00
            X.2RY r5 = (X.AnonymousClass2RY) r5
            X.2bV r0 = r5.A04
            r4 = 1
            r0.removeMessages(r4)
            X.0sq r3 = r5.A06
            boolean r2 = r5.A0F
            boolean r0 = r5.A0E
            X.2bW r1 = new X.2bW
            r1.<init>(r5, r2, r4, r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3.Ack(r1, r0)
            return
        L_0x05ff:
            java.lang.Object r3 = r14.A00
            X.2RY r3 = (X.AnonymousClass2RY) r3
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/preparedb/cannot-start-db-restore-missing-key"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0pt r2 = r3.A02
            r1 = 17
            goto L_0x0616
        L_0x060e:
            java.lang.Object r3 = r14.A00
            X.2RY r3 = (X.AnonymousClass2RY) r3
            X.0pt r2 = r3.A02
            r1 = 20
        L_0x0616:
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r0.<init>(r3, r1)
            r2.A0K(r0)
            return
        L_0x061f:
            java.lang.Object r2 = r14.A00
            X.2RY r2 = (X.AnonymousClass2RY) r2
            X.2bV r1 = r2.A04
            r0 = 1
            r1.removeMessages(r0)
            android.app.Activity r1 = r2.A01
            r0 = 201(0xc9, float:2.82E-43)
        L_0x062d:
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x0631:
            java.lang.Object r0 = r14.A00
            X.0pj r0 = (X.C14770pj) r0
            r0.A08()
            return
        L_0x0639:
            java.lang.Object r0 = r14.A00
            X.138 r0 = (X.AnonymousClass138) r0
            X.125 r0 = r0.A04
            r0.A03()
            return
        L_0x0643:
            java.lang.Object r0 = r14.A00
            X.138 r0 = (X.AnonymousClass138) r0
            X.0pt r2 = r0.A01
            r1 = 2131888333(0x7f1208cd, float:1.9411298E38)
            r0 = 1
            r2.A09(r1, r0)
            return
        L_0x0651:
            java.lang.Object r0 = r14.A00
            X.1HD r0 = (X.AnonymousClass1HD) r0
            r0.A01()
            return
        L_0x0659:
            java.lang.Object r0 = r14.A00
            X.1kV r0 = (X.C34581kV) r0
            X.12w r1 = r0.A01
            r0 = 0
            r1.A01 = r0
            return
        L_0x0663:
            java.lang.Object r1 = r14.A00
            X.12z r1 = (X.C211512z) r1
            monitor-enter(r1)
            boolean r0 = r1.A03     // Catch:{ all -> 0x0672 }
            if (r0 == 0) goto L_0x0670
            r0 = 0
            r1.A06(r0)     // Catch:{ all -> 0x0672 }
        L_0x0670:
            monitor-exit(r1)     // Catch:{ all -> 0x0672 }
            return
        L_0x0672:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0672 }
            throw r0
        L_0x0675:
            java.lang.Object r3 = r14.A00
            X.12z r3 = (X.C211512z) r3
            X.16P r2 = r3.A0C
            r0 = 6
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r1 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r1.<init>(r3, r0)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00
            r0.execute(r1)
            return
        L_0x0687:
            java.lang.Object r0 = r14.A00
            com.obwhatsapp.MuteDialogFragment r0 = (com.obwhatsapp.MuteDialogFragment) r0
            X.11A r1 = r0.A08
            r0 = 1
            r1.A05(r0)
            return
        L_0x0692:
            java.lang.Object r0 = r14.A00
            X.0yD r0 = (X.C19300yD) r0
            X.17L r0 = r0.A0c
            r0.A00()
            return
        L_0x069c:
            java.lang.Object r0 = r14.A00
            X.2JI r0 = (X.AnonymousClass2JI) r0
            X.0qs r3 = r0.A05
            android.view.View r3 = (android.view.View) r3
            java.lang.Runnable r2 = r0.A09
            r0 = 100
            r3.postDelayed(r2, r0)
            return
        L_0x06ac:
            java.lang.Object r2 = r14.A00
            X.0qs r2 = (X.C15430qs) r2
            r1 = r2
            com.obwhatsapp.KeyboardPopupLayout r1 = (com.obwhatsapp.KeyboardPopupLayout) r1
            r0 = 0
            r1.A06 = r0
            android.view.View r2 = (android.view.View) r2
            r2.requestLayout()
            return
        L_0x06bc:
            r0 = move-exception
            if (r2 == 0) goto L_0x06cc
            r2.unlock()
            throw r0
        L_0x06c3:
            r0 = move-exception
            if (r1 == 0) goto L_0x06cc
            r1.unlock()
            throw r0
        L_0x06ca:
            r0 = move-exception
            monitor-exit(r3)
        L_0x06cc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape2S0100000_I0_1.run():void");
    }
}
