package X;

/* renamed from: X.12o  reason: invalid class name and case insensitive filesystem */
public class C210412o implements C16240sh {
    public final C16040sK A00;
    public final C16200sd A01;
    public final C16190sc A02;
    public final AnonymousClass12W A03;
    public final C16980tz A04;
    public final C15860rz A05;
    public final C18790xG A06;
    public final AnonymousClass12X A07;
    public final C16990u0 A08;
    public final AnonymousClass12V A09;

    public C210412o(C16040sK r1, C16200sd r2, C16190sc r3, AnonymousClass12W r4, C16980tz r5, C15860rz r6, C18790xG r7, AnonymousClass12X r8, C16990u0 r9, AnonymousClass12V r10) {
        this.A04 = r5;
        this.A09 = r10;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r9;
        this.A07 = r8;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00d2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A5J() {
        /*
            r16 = this;
            r3 = r16
            X.0sd r8 = r3.A01
            X.0tx r13 = X.C40691uX.A06(r8)
            monitor-enter(r3)
            X.12X r11 = r3.A07     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "backup_settings.json"
            X.1XH r0 = r11.A00     // Catch:{ all -> 0x00eb }
            r0.A01()     // Catch:{ all -> 0x00eb }
            java.io.File r0 = r0.A03     // Catch:{ all -> 0x00eb }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00eb }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00eb }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00d3 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x00ce }
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ce }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x00ce }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x00c9 }
            r6.<init>()     // Catch:{ all -> 0x00c9 }
            X.0rz r7 = r3.A05     // Catch:{ all -> 0x00c9 }
            int r0 = r7.A06()     // Catch:{ all -> 0x00c9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "backupFrequency"
            r6.put(r0, r1)     // Catch:{ all -> 0x00c9 }
            int r0 = r7.A07()     // Catch:{ all -> 0x00c9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "backupNetworkSettings"
            r6.put(r0, r1)     // Catch:{ all -> 0x00c9 }
            boolean r0 = r7.A1a()     // Catch:{ all -> 0x00c9 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "includeVideosInBackup"
            r6.put(r0, r1)     // Catch:{ all -> 0x00c9 }
            java.util.Map r1 = r7.A0T()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "localSettings"
            r6.put(r0, r1)     // Catch:{ all -> 0x00c9 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00c9 }
            r1.<init>(r6)     // Catch:{ all -> 0x00c9 }
            r0 = 2
            java.lang.String r0 = r1.toString(r0)     // Catch:{ all -> 0x00c9 }
            r5.write(r0)     // Catch:{ all -> 0x00c9 }
            r5.close()     // Catch:{ all -> 0x00ce }
            r2.close()     // Catch:{ Exception -> 0x00d3 }
            X.0sc r0 = r3.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            java.io.File r5 = r0.A02()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            java.lang.String r0 = "backup_settings.json.crypt"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            r1.<init>(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            int r0 = r13.version     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            r1.append(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            r2.<init>(r5, r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            r1.<init>()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            java.lang.String r0 = "backup_settings/backup/to "
            r1.append(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            r1.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            X.12V r0 = r3.A09     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            X.0sK r6 = r3.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            X.0xG r10 = r3.A06     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            X.12W r9 = r3.A03     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            X.0u0 r12 = r3.A08     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            r7 = 0
            r14 = r0
            r15 = r2
            X.1uz r1 = X.C40951ux.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            X.0tz r0 = r3.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            boolean r0 = r1.A04(r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = "backup_settings/backup/prepare for backup failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            goto L_0x00e8
        L_0x00bf:
            r1.A03(r7, r4)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00c5 }
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x00c5:
            r2 = move-exception
            java.lang.String r0 = "backup_settings/backup failed"
            goto L_0x00e5
        L_0x00c9:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            throw r0     // Catch:{ Exception -> 0x00d3 }
        L_0x00d3:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r1.<init>()     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "backup_settings/backup/exception while writing to temp file"
            r1.append(r0)     // Catch:{ all -> 0x00eb }
            r1.append(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00eb }
        L_0x00e5:
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00eb }
        L_0x00e8:
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210412o.A5J():boolean");
    }

    public String AA3() {
        return "backup-settings";
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00eb */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x00e1=Splitter:B:41:0x00e1, B:48:0x00eb=Splitter:B:48:0x00eb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Aca(android.content.Context r16) {
        /*
            r15 = this;
            X.0tx r1 = X.C16960tx.A06
            X.0tx r0 = X.C16960tx.A00()
            java.util.List r5 = X.C40691uX.A08(r1, r0)
            r1 = r15
            X.0sc r0 = r15.A02
            java.io.File r2 = r0.A02()
            java.lang.String r4 = "backup_settings.json"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r4)
            r3 = 0
            java.util.ArrayList r2 = X.C40691uX.A07(r0, r5)
            X.C40691uX.A0D(r0, r2)
            boolean r0 = r2.isEmpty()
            r12 = 0
            if (r0 == 0) goto L_0x0028
            return r3
        L_0x0028:
            java.lang.Object r11 = r2.get(r3)
            java.io.File r11 = (java.io.File) r11
            monitor-enter(r1)
            X.12X r7 = r15.A07     // Catch:{ Exception -> 0x00f3 }
            X.1XH r0 = r7.A00     // Catch:{ Exception -> 0x00f3 }
            r0.A01()     // Catch:{ Exception -> 0x00f3 }
            java.io.File r2 = r0.A03     // Catch:{ Exception -> 0x00f3 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00f3 }
            r0.<init>(r2, r4)     // Catch:{ Exception -> 0x00f3 }
            r11.length()     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r2 = r11.getName()     // Catch:{ Exception -> 0x00f3 }
            int r2 = X.C40691uX.A01(r2, r4)     // Catch:{ Exception -> 0x00f3 }
            if (r2 <= 0) goto L_0x006c
            X.0tx r9 = X.C16960tx.A02(r2)     // Catch:{ Exception -> 0x00f3 }
            if (r9 == 0) goto L_0x006c
        L_0x0050:
            X.12V r10 = r15.A09     // Catch:{ Exception -> 0x00f3 }
            X.0sK r2 = r15.A00     // Catch:{ Exception -> 0x00f3 }
            X.0xG r6 = r15.A06     // Catch:{ Exception -> 0x00f3 }
            X.0sd r4 = r15.A01     // Catch:{ Exception -> 0x00f3 }
            X.12W r5 = r15.A03     // Catch:{ Exception -> 0x00f3 }
            X.0u0 r8 = r15.A08     // Catch:{ Exception -> 0x00f3 }
            r3 = 0
            X.1uz r8 = X.C40951ux.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00f3 }
            X.0tz r2 = r15.A04     // Catch:{ Exception -> 0x00f3 }
            r13 = 0
            r14 = 0
            r9 = r3
            r10 = r2
            r11 = r0
            r8.A01(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x006f
        L_0x006c:
            X.0tx r9 = X.C16960tx.A08     // Catch:{ Exception -> 0x00f3 }
            goto L_0x0050
        L_0x006f:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00ec }
            r3.<init>(r0)     // Catch:{ Exception -> 0x00ec }
            org.json.JSONObject r5 = X.C30311c8.A03(r3)     // Catch:{ all -> 0x00e7 }
            if (r5 != 0) goto L_0x0083
            java.lang.String r0 = "backup_settings/restore/could not read JSON metadata from the backup file"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00e7 }
            r3.close()     // Catch:{ Exception -> 0x00ec }
            goto L_0x00f9
        L_0x0083:
            java.lang.String r2 = "backupFrequency"
            boolean r0 = r5.has(r2)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x0096
            int r2 = r5.getInt(r2)     // Catch:{ all -> 0x00e7 }
            if (r2 < 0) goto L_0x0096
            X.0rz r0 = r15.A05     // Catch:{ all -> 0x00e7 }
            r0.A1l(r2)     // Catch:{ all -> 0x00e7 }
        L_0x0096:
            java.lang.String r2 = "backupNetworkSettings"
            boolean r0 = r5.has(r2)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00b7
            int r2 = r5.getInt(r2)     // Catch:{ all -> 0x00e7 }
            if (r2 < 0) goto L_0x00b7
            X.0rz r0 = r15.A05     // Catch:{ all -> 0x00e7 }
            android.content.SharedPreferences$Editor r4 = r0.A0K()     // Catch:{ all -> 0x00e7 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "interface_gdrive_backup_network_setting"
            android.content.SharedPreferences$Editor r0 = r4.putString(r0, r2)     // Catch:{ all -> 0x00e7 }
            r0.apply()     // Catch:{ all -> 0x00e7 }
        L_0x00b7:
            java.lang.String r2 = "includeVideosInBackup"
            boolean r0 = r5.has(r2)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00c8
            boolean r2 = r5.getBoolean(r2)     // Catch:{ all -> 0x00e7 }
            X.0rz r0 = r15.A05     // Catch:{ all -> 0x00e7 }
            r0.A1J(r2)     // Catch:{ all -> 0x00e7 }
        L_0x00c8:
            java.lang.String r2 = "localSettings"
            boolean r0 = r5.has(r2)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00e1
            org.json.JSONObject r2 = r5.getJSONObject(r2)     // Catch:{ all -> 0x00e7 }
            if (r2 == 0) goto L_0x00dc
            X.0rz r0 = r15.A05     // Catch:{ all -> 0x00e7 }
            r0.A1D(r2)     // Catch:{ all -> 0x00e7 }
            goto L_0x00e1
        L_0x00dc:
            java.lang.String r0 = "backup_settings/restore/settings/local-settings-object-is-null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e7 }
        L_0x00e1:
            r3.close()     // Catch:{ Exception -> 0x00ec }
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x00e7:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            throw r0     // Catch:{ Exception -> 0x00ec }
        L_0x00ec:
            r2 = move-exception
            java.lang.String r0 = "backup_settingsbackup/exception while reading temp JSON file"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00f9
        L_0x00f3:
            r2 = move-exception
            java.lang.String r0 = "backup_settings/restore/error"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x00fc }
        L_0x00f9:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210412o.Aca(android.content.Context):boolean");
    }
}
