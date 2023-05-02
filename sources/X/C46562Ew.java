package X;

/* renamed from: X.2Ew  reason: invalid class name and case insensitive filesystem */
public final class C46562Ew extends C46572Ex {
    public final /* synthetic */ C46542Eu A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46562Ew(C46542Eu r3) {
        super(r3, true, false, false);
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0113, code lost:
        if (r2 == false) goto L_0x0115;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00bc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r13 = this;
            X.2Eu r4 = r13.A00
            X.0sf r0 = r4.A03
            X.12l r2 = r0.A0R
            X.0tz r0 = r0.A0G
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "chatsettings.db"
            java.io.File r1 = r1.getDatabasePath(r0)
            java.lang.String r0 = "chat_setting_store"
            int r1 = r2.A03(r1, r0)
            r0 = 19
            r5 = 0
            if (r1 != r0) goto L_0x001c
            r5 = 1
        L_0x001c:
            java.lang.String r1 = "restore>PrepareMessageStoreTransferTask/successfully replaced chat setting "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0se r0 = r4.A04
            boolean r2 = r0.A0A()
            java.lang.String r1 = "restore>PrepareMessageStoreTransferTask/successfully replaced wall paper "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sl r6 = r4.A05
            monitor-enter(r6)
            X.12X r0 = r6.A08     // Catch:{ IOException -> 0x00bd }
            X.1XH r1 = r0.A00     // Catch:{ IOException -> 0x00bd }
            java.lang.String r0 = ""
            java.io.File r2 = r1.A00(r0)     // Catch:{ IOException -> 0x00bd }
            X.12l r1 = r6.A09     // Catch:{ IOException -> 0x00bd }
            java.lang.String r0 = "sticker_store"
            int r1 = r1.A03(r2, r0)     // Catch:{ IOException -> 0x00bd }
            r0 = 19
            if (r1 != r0) goto L_0x00c3
            boolean r3 = r6.A01(r2)     // Catch:{ all -> 0x01dc }
            if (r3 == 0) goto L_0x00c4
            X.12k r0 = r6.A0A     // Catch:{ all -> 0x01dc }
            java.lang.String r8 = "/com.obwhatsapp/"
            java.lang.String r1 = "/com.obwhatsapp.w4b/"
            X.12j r0 = r0.A00     // Catch:{ all -> 0x01dc }
            X.0tf r9 = r0.A02()     // Catch:{ all -> 0x01dc }
            X.1cj r7 = r9.A00()     // Catch:{ all -> 0x00b8 }
            X.0tg r2 = r9.A02     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "UPDATE stickers SET file_path = REPLACE(file_path, ?, ?);"
            X.1ou r2 = r2.A0A(r0)     // Catch:{ all -> 0x00b3 }
            r0 = 1
            r2.A02(r0, r8)     // Catch:{ all -> 0x00b3 }
            r0 = 2
            r2.A02(r0, r1)     // Catch:{ all -> 0x00b3 }
            r2.A00()     // Catch:{ all -> 0x00b3 }
            r7.A00()     // Catch:{ all -> 0x00b3 }
            r7.close()     // Catch:{ all -> 0x00b8 }
            r9.close()     // Catch:{ all -> 0x01dc }
            X.01Z r0 = r6.A01     // Catch:{ all -> 0x01dc }
            X.01a r0 = r0.A03     // Catch:{ all -> 0x01dc }
            X.0tq r0 = r0.A01     // Catch:{ all -> 0x01dc }
            X.0tf r7 = r0.A02()     // Catch:{ all -> 0x01dc }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00ae }
            r0 = 0
            r2[r0] = r8     // Catch:{ all -> 0x00ae }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x00ae }
            X.0tg r1 = r7.A02     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "UPDATE media_refs SET path = REPLACE (path, ?, ?);"
            r1.A0C(r0, r2)     // Catch:{ all -> 0x00ae }
            r7.close()     // Catch:{ all -> 0x01dc }
            goto L_0x00c4
        L_0x00ae:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00bc
        L_0x00b3:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x00bd:
            r1 = move-exception
            java.lang.String r0 = "StickerDBStorage/getFileToRestoreFrom: failed to copy sticker file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01dc }
        L_0x00c3:
            r3 = 0
        L_0x00c4:
            monitor-exit(r6)
            java.lang.String r1 = "restore>PrepareMessageStoreTransferTask/successfully restored stickers "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12l r7 = r4.A02
            X.0rz r2 = r7.A02
            java.lang.String r6 = r2.A0O()
            java.lang.String r1 = r2.A0Q()
            java.lang.String r0 = "share_preferences"
            android.net.Uri r8 = X.C210112l.A00(r0, r6, r1)
            X.0tz r0 = r7.A01
            android.content.Context r0 = r0.A00
            android.content.ContentResolver r7 = r0.getContentResolver()
            r9 = 0
            r11 = r9
            r12 = r9
            r10 = r9
            android.database.Cursor r6 = r7.query(r8, r9, r10, r11, r12)
            r7 = 0
            if (r6 != 0) goto L_0x0123
            r2 = 0
        L_0x00fd:
            java.lang.String r1 = "restore>PrepareMessageStoreTransferTask/successfully restored some shared preferences setting "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r5 == 0) goto L_0x0115
            if (r3 == 0) goto L_0x0115
            r0 = 1
            if (r2 != 0) goto L_0x0116
        L_0x0115:
            r0 = 0
        L_0x0116:
            X.1Tj r1 = r4.A01
            r0 = r0 ^ 1
            X.2Ep r1 = r1.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            return
        L_0x0123:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x01d7 }
            r1 = 1
            if (r0 == 0) goto L_0x01d1
            r0 = 2
            java.lang.String r9 = r6.getString(r0)     // Catch:{ all -> 0x01d7 }
            java.lang.String r8 = r6.getString(r7)     // Catch:{ all -> 0x01d7 }
            int r0 = r9.hashCode()     // Catch:{ all -> 0x01d7 }
            switch(r0) {
                case -1572742348: goto L_0x017f;
                case -891985903: goto L_0x016e;
                case 104431: goto L_0x0156;
                case 64711720: goto L_0x013b;
                default: goto L_0x013a;
            }     // Catch:{ all -> 0x01d7 }
        L_0x013a:
            goto L_0x0123
        L_0x013b:
            java.lang.String r0 = "boolean"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x0123
            int r0 = r6.getInt(r1)     // Catch:{ all -> 0x01d7 }
            if (r0 == r1) goto L_0x014a
            r1 = 0
        L_0x014a:
            android.content.SharedPreferences$Editor r0 = r2.A0K()     // Catch:{ all -> 0x01d7 }
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r8, r1)     // Catch:{ all -> 0x01d7 }
            r0.apply()     // Catch:{ all -> 0x01d7 }
            goto L_0x0123
        L_0x0156:
            java.lang.String r0 = "int"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x0123
            int r1 = r6.getInt(r1)     // Catch:{ all -> 0x01d7 }
            android.content.SharedPreferences$Editor r0 = r2.A0K()     // Catch:{ all -> 0x01d7 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r8, r1)     // Catch:{ all -> 0x01d7 }
            r0.apply()     // Catch:{ all -> 0x01d7 }
            goto L_0x0123
        L_0x016e:
            java.lang.String r0 = "string"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r6.getString(r1)     // Catch:{ all -> 0x01d7 }
            r2.A1A(r8, r0)     // Catch:{ all -> 0x01d7 }
            goto L_0x0123
        L_0x017f:
            java.lang.String r0 = "string_set"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r6.getString(r1)     // Catch:{ JSONException -> 0x01ba }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01ba }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x01ba }
            int r0 = r10.length()     // Catch:{ JSONException -> 0x01ba }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ JSONException -> 0x01ba }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x01ba }
            r1 = 0
        L_0x019b:
            int r0 = r10.length()     // Catch:{ JSONException -> 0x01ba }
            if (r1 >= r0) goto L_0x01ad
            java.lang.Object r0 = r10.get(r1)     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01ba }
            r9.add(r0)     // Catch:{ JSONException -> 0x01ba }
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01ad:
            android.content.SharedPreferences$Editor r0 = r2.A0K()     // Catch:{ JSONException -> 0x01ba }
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r8, r9)     // Catch:{ JSONException -> 0x01ba }
            r0.apply()     // Catch:{ JSONException -> 0x01ba }
            goto L_0x0123
        L_0x01ba:
            r9 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d7 }
            r1.<init>()     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = "MigrateFileDirectlyHelper/replaceSharedPreferencesSetting/ failed to create json array for key: "
            r1.append(r0)     // Catch:{ all -> 0x01d7 }
            r1.append(r8)     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d7 }
            com.whatsapp.util.Log.e(r0, r9)     // Catch:{ all -> 0x01d7 }
            goto L_0x0123
        L_0x01d1:
            r6.close()
            r2 = 1
            goto L_0x00fd
        L_0x01d7:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x01db }
        L_0x01db:
            throw r0
        L_0x01dc:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46562Ew.A0B():void");
    }
}
