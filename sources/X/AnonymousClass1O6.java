package X;

/* renamed from: X.1O6  reason: invalid class name */
public class AnonymousClass1O6 implements C23541Cj {
    public final C24891Hr A00;
    public final C20030zO A01;
    public final C19820z3 A02;
    public final AnonymousClass1HU A03;
    public final AnonymousClass1HR A04;
    public final AnonymousClass1O5 A05;
    public final C24871Hp A06;
    public final C24901Hs A07;

    public AnonymousClass1O6(C24891Hr r1, C20030zO r2, C19820z3 r3, AnonymousClass1HU r4, AnonymousClass1HR r5, AnonymousClass1O5 r6, C24871Hp r7, C24901Hs r8) {
        this.A00 = r1;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    public void APJ() {
        this.A01.A01();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APK() {
        /*
            r20 = this;
            r3 = r20
            X.1Hr r0 = r3.A00
            X.0pd r8 = r0.A00
            r1 = 1058(0x422, float:1.483E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r8.A0E(r0, r1)
            if (r0 == 0) goto L_0x0125
            X.1Hp r0 = r3.A06
            monitor-enter(r0)
            boolean r1 = r0.A00()     // Catch:{ all -> 0x011c }
            if (r1 != 0) goto L_0x011f
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x011c }
            r9.<init>()     // Catch:{ all -> 0x011c }
            X.1Hn r1 = r0.A04     // Catch:{ Exception -> 0x00ab }
            X.1O8 r7 = r1.A01     // Catch:{ Exception -> 0x00ab }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ab }
            r6.<init>()     // Catch:{ Exception -> 0x00ab }
            X.0tq r1 = r7.A02     // Catch:{ Exception -> 0x00ab }
            X.0tf r5 = r1.get()     // Catch:{ Exception -> 0x00ab }
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "SELECT * FROM conversion_tuples"
            r1 = 0
            android.database.Cursor r4 = r4.A08(r2, r1)     // Catch:{ all -> 0x00a6 }
        L_0x0036:
            boolean r1 = r4.moveToNext()     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0095
            X.14v r11 = r7.A01     // Catch:{ all -> 0x009f }
            java.lang.Class<com.whatsapp.jid.UserJid> r10 = com.whatsapp.jid.UserJid.class
            java.lang.String r1 = "jid_row_id"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x009f }
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009f }
            long r1 = (long) r1     // Catch:{ all -> 0x009f }
            com.whatsapp.jid.Jid r11 = r11.A07(r10, r1)     // Catch:{ all -> 0x009f }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x009f }
            if (r11 == 0) goto L_0x0036
            java.lang.String r1 = "data"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r12 = r4.getString(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = "source"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r13 = r4.getString(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = "biz_count"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x009f }
            int r14 = r4.getInt(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = "has_user_sent_last_message"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x009f }
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009f }
            r17 = 0
            if (r1 <= 0) goto L_0x0082
            r17 = 1
        L_0x0082:
            java.lang.String r1 = "last_interaction"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x009f }
            long r15 = r4.getLong(r1)     // Catch:{ all -> 0x009f }
            X.2IP r10 = new X.2IP     // Catch:{ all -> 0x009f }
            r10.<init>(r11, r12, r13, r14, r15, r17)     // Catch:{ all -> 0x009f }
            r6.add(r10)     // Catch:{ all -> 0x009f }
            goto L_0x0036
        L_0x0095:
            r4.close()     // Catch:{ all -> 0x00a6 }
            r5.close()     // Catch:{ Exception -> 0x00ab }
            r9.addAll(r6)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00c5
        L_0x009f:
            r1 = move-exception
            if (r4 == 0) goto L_0x00a5
            r4.close()     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            throw r1     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            throw r1     // Catch:{ Exception -> 0x00ab }
        L_0x00ab:
            r4 = move-exception
            X.0so r5 = r0.A00     // Catch:{ all -> 0x011c }
            java.lang.String r1 = "CTWA: ConversionTupleDataMigrator/getAllV1LoggingDataFromStorage/error retrieving v1 conversions from storage e="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x011c }
            r2.<init>(r1)     // Catch:{ all -> 0x011c }
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x011c }
            r2.append(r1)     // Catch:{ all -> 0x011c }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x011c }
            r2 = 0
            r1 = 1
            r5.AcB(r4, r2, r1)     // Catch:{ all -> 0x011c }
        L_0x00c5:
            java.util.Iterator r11 = r9.iterator()     // Catch:{ all -> 0x011c }
        L_0x00c9:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x011c }
            if (r1 == 0) goto L_0x0105
            java.lang.Object r7 = r11.next()     // Catch:{ all -> 0x011c }
            X.2IP r7 = (X.AnonymousClass2IP) r7     // Catch:{ all -> 0x011c }
            long r1 = r7.A01     // Catch:{ all -> 0x011c }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x011c }
            long r9 = r9 - r1
            long r5 = X.AnonymousClass2IP.A06     // Catch:{ all -> 0x011c }
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x00c9
            boolean r4 = r7.A02     // Catch:{ all -> 0x011c }
            if (r4 != 0) goto L_0x00c9
            int r4 = r7.A00     // Catch:{ all -> 0x011c }
            if (r4 != 0) goto L_0x00c9
            java.lang.String r14 = r7.A04     // Catch:{ all -> 0x011c }
            if (r14 == 0) goto L_0x00c9
            java.lang.String r15 = r7.A05     // Catch:{ all -> 0x011c }
            if (r15 == 0) goto L_0x00c9
            com.whatsapp.jid.UserJid r13 = r7.A03     // Catch:{ all -> 0x011c }
            java.lang.String r16 = ""
            r17 = -1
            X.21V r12 = new X.21V     // Catch:{ all -> 0x011c }
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x011c }
            X.0zO r1 = r0.A01     // Catch:{ all -> 0x011c }
            r1.A04(r12)     // Catch:{ all -> 0x011c }
            goto L_0x00c9
        L_0x0105:
            X.0u3 r2 = r0.A05     // Catch:{ all -> 0x011c }
            java.lang.String r1 = "ctwa_logging_v2_migration"
            android.content.SharedPreferences r1 = r2.A00(r1)     // Catch:{ all -> 0x011c }
            android.content.SharedPreferences$Editor r4 = r1.edit()     // Catch:{ all -> 0x011c }
            java.lang.String r2 = "ctwa_ads_customer_data_migrated"
            r1 = 1
            android.content.SharedPreferences$Editor r1 = r4.putBoolean(r2, r1)     // Catch:{ all -> 0x011c }
            r1.apply()     // Catch:{ all -> 0x011c }
            goto L_0x011f
        L_0x011c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x011f:
            monitor-exit(r0)
            r0 = 823(0x337, float:1.153E-42)
            r8.A0C(r0)
        L_0x0125:
            X.0z3 r1 = r3.A02
            X.1vU r0 = r1.A01
            r1.A01(r0)
            X.1vU r0 = r1.A00
            r1.A01(r0)
            X.1HU r0 = r3.A03
            X.2Il r6 = r0.A00
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.0u3 r4 = r6.A01
            java.lang.String r3 = "ctwa_ads_conversions_for_sending"
            android.content.SharedPreferences r0 = r4.A00(r3)
            java.util.Map r2 = r0.getAll()
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x014e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01dd
            java.lang.Object r7 = r8.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r0 = r7.getKey()
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = r0.toString()
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            r7.<init>(r0)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            java.lang.String r0 = "uj"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            com.whatsapp.jid.UserJid r10 = com.whatsapp.jid.UserJid.get(r0)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            java.lang.String r1 = "d"
            boolean r0 = r7.has(r1)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            r12 = 0
            if (r0 == 0) goto L_0x01aa
            java.lang.String r11 = r7.getString(r1)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
        L_0x0185:
            java.lang.String r1 = "s"
            boolean r0 = r7.has(r1)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            if (r0 == 0) goto L_0x0192
            java.lang.String r12 = r7.getString(r1)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
        L_0x0192:
            java.lang.String r0 = "bc"
            int r13 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            java.lang.String r0 = "huslm"
            boolean r16 = r7.getBoolean(r0)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            java.lang.String r0 = "lit"
            long r14 = r7.getLong(r0)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            X.2IP r9 = new X.2IP     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            r9.<init>(r10, r11, r12, r13, r14, r16)     // Catch:{ JSONException -> 0x01c3, 1W4 -> 0x01b0 }
            goto L_0x01ac
        L_0x01aa:
            r11 = r12
            goto L_0x0185
        L_0x01ac:
            r5.add(r9)
            goto L_0x014e
        L_0x01b0:
            r7 = move-exception
            java.lang.String r1 = "CTWA: ClickToWhatsAppAdsConversionStore/getConversion/invalid jid error"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r6.A00(r0, r7)
            goto L_0x014e
        L_0x01c3:
            r1 = move-exception
            java.lang.String r0 = "CTWA: ClickToWhatsAppAdsConversionStore/getConversionFromJson/json error"
            r6.A00(r0, r1)
            goto L_0x014e
        L_0x01ca:
            java.lang.String r1 = "CTWA: ClickToWhatsAppAdsConversionStore/getAllConversions/ null pref value for key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x014e
        L_0x01dd:
            java.util.Iterator r8 = r5.iterator()
        L_0x01e1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0210
            java.lang.Object r7 = r8.next()
            X.2IP r7 = (X.AnonymousClass2IP) r7
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r7.A01
            long r5 = r5 - r0
            long r1 = X.AnonymousClass2IP.A06
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e1
            com.whatsapp.jid.UserJid r2 = r7.A03
            android.content.SharedPreferences r0 = r4.A00(r3)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = r2.getRawString()
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            goto L_0x01e1
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1O6.APK():void");
    }
}
