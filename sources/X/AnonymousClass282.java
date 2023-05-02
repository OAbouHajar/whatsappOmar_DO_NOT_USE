package X;

/* renamed from: X.282  reason: invalid class name */
public class AnonymousClass282 {
    public static final String[] A08 = {"com.google", "com.microsoft.office.outlook.USER_ACCOUNT"};
    public static final String[] A09 = {"com.google.android.apps.tachyon"};
    public final AnonymousClass12D A00;
    public final C452427q A01;
    public final AnonymousClass01V A02;
    public final C16980tz A03;
    public final C16260sj A04;
    public final C15860rz A05;
    public final AnonymousClass013 A06;
    public final C14710pd A07;

    public AnonymousClass282(AnonymousClass12D r1, C452427q r2, AnonymousClass01V r3, C16980tz r4, C16260sj r5, C15860rz r6, AnonymousClass013 r7, C14710pd r8) {
        this.A07 = r8;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d4, code lost:
        if (android.text.TextUtils.equals(r6.A0R, r5.A04) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.AnonymousClass285 r4, X.AnonymousClass286 r5, X.C16010sH r6) {
        /*
            long r2 = r5.A01
            java.lang.String r0 = r5.A05
            X.1ko r1 = new X.1ko
            r1.<init>(r0, r2)
            X.1ko r0 = r6.A0D
            r3 = 1
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d9
            r2 = 0
        L_0x0015:
            java.lang.String r1 = r5.A03
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r6.A09()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x002a
            r6.A0L = r1
            r2 = 1
        L_0x002a:
            java.lang.String r1 = r5.A06
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = r6.A0S
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x003d
            r6.A0S = r1
            r2 = 1
        L_0x003d:
            if (r4 == 0) goto L_0x006d
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = r6.A0N
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = r4.A02
            r6.A0N = r0
            r2 = 1
        L_0x0056:
            java.lang.String r0 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r1 = r6.A0M
            java.lang.String r0 = r4.A01
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = r4.A01
            r6.A0M = r0
            r2 = 1
        L_0x006d:
            java.lang.Integer r0 = r6.A0I
            int r0 = r0.intValue()
            int r1 = r5.A00
            if (r0 == r1) goto L_0x00ca
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A0I = r0
            if (r1 == 0) goto L_0x00d6
            r0 = 0
        L_0x0080:
            r6.A0R = r0
            r2 = 1
        L_0x0083:
            if (r4 == 0) goto L_0x00de
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r1 = r6.A0Q
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = r4.A03
            r6.A0Q = r0
            r2 = 1
        L_0x009c:
            java.lang.String r0 = r4.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r1 = r6.A0K
            java.lang.String r0 = r4.A00
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = r4.A00
            r6.A0K = r0
            r2 = 1
        L_0x00b3:
            java.lang.String r0 = r4.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00de
            java.lang.String r1 = r6.A0U
            java.lang.String r0 = r4.A04
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = r4.A04
            r6.A0U = r0
            return r3
        L_0x00ca:
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = r6.A0R
            java.lang.String r0 = r5.A04
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0083
        L_0x00d6:
            java.lang.String r0 = r5.A04
            goto L_0x0080
        L_0x00d9:
            r6.A0D = r1
            r2 = 1
            goto L_0x0015
        L_0x00de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass282.A00(X.285, X.286, X.0sH):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00d5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0176 */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0182 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass287 A01(java.lang.String r34, java.util.List r35, java.util.List r36) {
        /*
            r33 = this;
            r0 = r33
            X.0tz r1 = r0.A03
            android.content.Context r10 = r1.A00
            X.01V r9 = r0.A02
            X.0sj r8 = r0.A04
            X.0rz r7 = r0.A05
            X.12D r4 = r0.A00
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            int r3 = r8.A03(r1)
            if (r3 == 0) goto L_0x00de
            java.lang.String r3 = "phonebook/getPhones/permission_denied"
            com.whatsapp.util.Log.i((java.lang.String) r3)
        L_0x0020:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.lang.String r5 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "lge"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x003f
            java.lang.String r4 = "phonebook/get_sim_card_phones/lge"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            android.content.ContentResolver r11 = r9.A0C()
            if (r11 != 0) goto L_0x0078
            java.lang.String r4 = "phonebook/get-sim-card-phones cr=null"
            com.whatsapp.util.Log.e((java.lang.String) r4)
        L_0x003f:
            r2.addAll(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r7 = r2.iterator()
        L_0x004b:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x017e
            java.lang.Object r6 = r7.next()
            X.286 r6 = (X.AnonymousClass286) r6
            java.lang.String r5 = r6.A05
            java.lang.String r2 = r6.A03
            X.01Q r4 = new X.01Q
            r4.<init>(r5, r2)
            boolean r2 = r3.containsKey(r4)
            if (r2 != 0) goto L_0x006e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.put(r4, r2)
        L_0x006e:
            java.lang.Object r2 = r3.get(r4)
            java.util.List r2 = (java.util.List) r2
            r2.add(r6)
            goto L_0x004b
        L_0x0078:
            java.lang.String r4 = "content://icc/adn"
            android.net.Uri r12 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00d6 }
            r13 = 0
            r14 = r13
            r15 = r13
            r16 = r13
            android.database.Cursor r6 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00d6 }
            if (r6 != 0) goto L_0x008f
            java.lang.String r4 = "phonebook/get-sim-card-phones null cursor returned from sim card phones query"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x00cf }
            goto L_0x003f
        L_0x008f:
            java.lang.String r4 = "name"
            int r7 = r6.getColumnIndex(r4)     // Catch:{ all -> 0x00cf }
            java.lang.String r4 = "number"
            int r5 = r6.getColumnIndex(r4)     // Catch:{ all -> 0x00cf }
        L_0x009b:
            boolean r4 = r6.moveToNext()     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x00ca
            java.lang.String r12 = r6.getString(r7)     // Catch:{ all -> 0x00cf }
            java.lang.String r4 = r6.getString(r5)     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x009b
            java.lang.String r13 = android.telephony.PhoneNumberUtils.stripSeparators(r4)     // Catch:{ all -> 0x00cf }
            boolean r4 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r13)     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x009b
            r18 = -2
            r17 = 0
            r4 = 2131887505(0x7f120591, float:1.9409619E38)
            java.lang.String r14 = r10.getString(r4)     // Catch:{ all -> 0x00cf }
            X.286 r4 = new X.286     // Catch:{ all -> 0x00cf }
            r11 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00cf }
            r3.add(r4)     // Catch:{ all -> 0x00cf }
            goto L_0x009b
        L_0x00ca:
            r6.close()     // Catch:{ Exception -> 0x00d6 }
            goto L_0x003f
        L_0x00cf:
            r4 = move-exception
            if (r6 == 0) goto L_0x00d5
            r6.close()     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            throw r4     // Catch:{ Exception -> 0x00d6 }
        L_0x00d6:
            r5 = move-exception
            java.lang.String r4 = "exception while retrieving sim card contacts, will continue without them "
            com.whatsapp.util.Log.w(r4, r5)
            goto L_0x003f
        L_0x00de:
            java.lang.String r3 = "phonebook/get_phones/"
            android.database.Cursor r6 = X.AnonymousClass286.A00(r9, r3)     // Catch:{ Exception -> 0x0177 }
            r5 = 0
            if (r6 != 0) goto L_0x0114
            java.lang.String r3 = "phonebook/Cursor is null"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0170 }
            X.01D r3 = r7.A01     // Catch:{ all -> 0x0170 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0170 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x0170 }
            java.lang.String r11 = "phonebook_null_cursor_count"
            int r12 = r3.getInt(r11, r5)     // Catch:{ all -> 0x0170 }
            android.content.SharedPreferences r14 = r4.A01()     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = "last_contact_full_sync"
            r3 = -1
            long r15 = r14.getLong(r13, r3)     // Catch:{ all -> 0x0170 }
            r13 = 0
            int r3 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x010d
            r5 = 1
        L_0x010d:
            r3 = 10
            if (r12 >= r3) goto L_0x0020
            if (r5 != 0) goto L_0x0020
            goto L_0x0162
        L_0x0114:
            boolean r3 = r6.moveToNext()     // Catch:{ all -> 0x0170 }
            if (r3 == 0) goto L_0x0150
            r3 = 2
            java.lang.String r3 = r6.getString(r3)     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = android.telephony.PhoneNumberUtils.stripSeparators(r3)     // Catch:{ all -> 0x0170 }
            boolean r3 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r13)     // Catch:{ all -> 0x0170 }
            if (r3 == 0) goto L_0x0114
            long r18 = r6.getLong(r5)     // Catch:{ all -> 0x0170 }
            r3 = 1
            java.lang.String r12 = r6.getString(r3)     // Catch:{ all -> 0x0170 }
            r3 = 3
            int r17 = r6.getInt(r3)     // Catch:{ all -> 0x0170 }
            r3 = 4
            java.lang.String r14 = r6.getString(r3)     // Catch:{ all -> 0x0170 }
            r3 = 5
            java.lang.String r15 = r6.getString(r3)     // Catch:{ all -> 0x0170 }
            r3 = 6
            java.lang.String r16 = r6.getString(r3)     // Catch:{ all -> 0x0170 }
            X.286 r3 = new X.286     // Catch:{ all -> 0x0170 }
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0170 }
            r2.add(r3)     // Catch:{ all -> 0x0170 }
            goto L_0x0114
        L_0x0150:
            r6.close()     // Catch:{ Exception -> 0x0177 }
            android.content.SharedPreferences$Editor r4 = r7.A0K()
            java.lang.String r3 = "phonebook_null_cursor_count"
            android.content.SharedPreferences$Editor r3 = r4.putInt(r3, r5)
            r3.apply()
            goto L_0x0020
        L_0x0162:
            int r3 = r12 + 1
            android.content.SharedPreferences$Editor r2 = r7.A0K()     // Catch:{ all -> 0x0170 }
            android.content.SharedPreferences$Editor r2 = r2.putInt(r11, r3)     // Catch:{ all -> 0x0170 }
            r2.apply()     // Catch:{ all -> 0x0170 }
            goto L_0x017d
        L_0x0170:
            r2 = move-exception
            if (r6 == 0) goto L_0x0176
            r6.close()     // Catch:{ all -> 0x0176 }
        L_0x0176:
            throw r2     // Catch:{ Exception -> 0x0177 }
        L_0x0177:
            r3 = move-exception
            java.lang.String r2 = "phonebook/error in retrieving phone numbers"
            com.whatsapp.util.Log.e(r2, r3)
        L_0x017d:
            r3 = 0
        L_0x017e:
            r22 = 0
            if (r3 != 0) goto L_0x0183
            return r22
        L_0x0183:
            java.util.HashMap r21 = new java.util.HashMap
            r21.<init>()
            java.util.HashMap r20 = new java.util.HashMap
            r20.<init>()
            java.util.Iterator r7 = r35.iterator()
        L_0x0191:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x01b8
            java.lang.Object r6 = r7.next()
            X.0sH r6 = (X.C16010sH) r6
            X.1ko r2 = r6.A0D
            X.AnonymousClass00B.A06(r2)
            java.lang.String r5 = r2.A01
            java.lang.String r2 = r6.A09()
            X.01Q r4 = new X.01Q
            r4.<init>(r5, r2)
            r2 = r21
            r2.put(r4, r6)
            r2 = r20
            r2.put(r5, r6)
            goto L_0x0191
        L_0x01b8:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r1 = r8.A03(r1)
            if (r1 == 0) goto L_0x01de
            java.lang.String r1 = "returning empty name map because contact permissions are denied"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x01c9:
            X.287 r9 = new X.287
            r9.<init>()
            X.27q r1 = r0.A01
            java.util.HashSet r19 = r1.A00()
            r32 = r36
            boolean r1 = r32.isEmpty()
            if (r1 != 0) goto L_0x0339
            goto L_0x032b
        L_0x01de:
            r1 = 6
            java.lang.String[] r12 = new java.lang.String[r1]
            r15 = 0
            java.lang.String r11 = "raw_contact_id"
            r12[r15] = r11
            r14 = 1
            java.lang.String r7 = "mimetype"
            r12[r14] = r7
            r13 = 2
            java.lang.String r2 = "data1"
            r12[r13] = r2
            r9 = 3
            java.lang.String r6 = "data2"
            r12[r9] = r6
            r1 = 4
            java.lang.String r5 = "data3"
            r12[r1] = r5
            r8 = 5
            java.lang.String r1 = "data4"
            r12[r8] = r1
            java.lang.String[] r8 = new java.lang.String[r9]
            java.lang.String r17 = "vnd.android.cursor.item/name"
            r8[r15] = r17
            java.lang.String r16 = "vnd.android.cursor.item/nickname"
            r8[r14] = r16
            java.lang.String r9 = "vnd.android.cursor.item/organization"
            r8[r13] = r9
            android.content.ContentResolver r23 = r10.getContentResolver()
            android.net.Uri r24 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String r26 = "mimetype IN (?,?,?)"
            r25 = r12
            r27 = r8
            r28 = r22
            android.database.Cursor r12 = r23.query(r24, r25, r26, r27, r28)
            if (r12 != 0) goto L_0x022a
            java.lang.String r1 = "null cursor returned from structured name query"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x01c9
        L_0x022a:
            int r13 = r12.getColumnIndex(r11)     // Catch:{ all -> 0x0616 }
            r14 = -1
            if (r13 != r14) goto L_0x0238
            java.lang.String r1 = "invalid column index for the raw contact id"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x0326
        L_0x0238:
            int r11 = r12.getColumnIndex(r7)     // Catch:{ all -> 0x0616 }
            if (r11 != r14) goto L_0x0245
            java.lang.String r1 = "invalid column index for the mimetype"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x0326
        L_0x0245:
            int r10 = r12.getColumnIndex(r6)     // Catch:{ all -> 0x0616 }
            if (r10 != r14) goto L_0x0252
            java.lang.String r1 = "invalid column index for the given name"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x0326
        L_0x0252:
            int r8 = r12.getColumnIndex(r5)     // Catch:{ all -> 0x0616 }
            if (r8 != r14) goto L_0x025f
            java.lang.String r1 = "invalid column index for the family name"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x0326
        L_0x025f:
            int r7 = r12.getColumnIndex(r2)     // Catch:{ all -> 0x0616 }
            if (r7 != r14) goto L_0x026c
            java.lang.String r1 = "invalid column index for the nickname"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x0326
        L_0x026c:
            int r6 = r12.getColumnIndex(r2)     // Catch:{ all -> 0x0616 }
            if (r6 != r14) goto L_0x0279
            java.lang.String r1 = "invalid column index for the company"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x0326
        L_0x0279:
            int r5 = r12.getColumnIndex(r1)     // Catch:{ all -> 0x0616 }
            if (r5 != r14) goto L_0x0286
            java.lang.String r1 = "invalid column index for the title"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x0326
        L_0x0286:
            boolean r1 = r12.moveToNext()     // Catch:{ all -> 0x0616 }
            if (r1 == 0) goto L_0x0326
            boolean r1 = r12.isNull(r13)     // Catch:{ all -> 0x0616 }
            if (r1 == 0) goto L_0x0298
            java.lang.String r1 = "null raw contact id for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x0286
        L_0x0298:
            boolean r1 = r12.isNull(r11)     // Catch:{ all -> 0x0616 }
            if (r1 == 0) goto L_0x02a4
            java.lang.String r1 = "null mimetype for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x0286
        L_0x02a4:
            long r1 = r12.getLong(r13)     // Catch:{ all -> 0x0616 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0616 }
            java.lang.Object r14 = r4.get(r1)     // Catch:{ all -> 0x0616 }
            X.285 r14 = (X.AnonymousClass285) r14     // Catch:{ all -> 0x0616 }
            if (r14 != 0) goto L_0x02bc
            X.285 r14 = new X.285     // Catch:{ all -> 0x0616 }
            r14.<init>()     // Catch:{ all -> 0x0616 }
            r4.put(r1, r14)     // Catch:{ all -> 0x0616 }
        L_0x02bc:
            java.lang.String r2 = r12.getString(r11)     // Catch:{ all -> 0x0616 }
            if (r2 != 0) goto L_0x02c8
            java.lang.String r1 = "mimetype was returned as null even though cursor said it wasn't null; skipping"
        L_0x02c4:
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0616 }
            goto L_0x0286
        L_0x02c8:
            int r15 = r2.hashCode()     // Catch:{ all -> 0x0616 }
            r1 = -1079224304(0xffffffffbfac5810, float:-1.3464375)
            if (r15 == r1) goto L_0x02fd
            r1 = 689862072(0x291e75b8, float:3.5185152E-14)
            if (r15 == r1) goto L_0x02ea
            r1 = 2034973555(0x794b3b73, float:6.5952627E34)
            if (r15 != r1) goto L_0x0313
            r1 = r16
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x0616 }
            if (r1 == 0) goto L_0x0313
            java.lang.String r1 = r12.getString(r7)     // Catch:{ all -> 0x0616 }
            r14.A03 = r1     // Catch:{ all -> 0x0616 }
            goto L_0x0286
        L_0x02ea:
            boolean r1 = r2.equals(r9)     // Catch:{ all -> 0x0616 }
            if (r1 == 0) goto L_0x0313
            java.lang.String r1 = r12.getString(r6)     // Catch:{ all -> 0x0616 }
            r14.A00 = r1     // Catch:{ all -> 0x0616 }
            java.lang.String r1 = r12.getString(r5)     // Catch:{ all -> 0x0616 }
            r14.A04 = r1     // Catch:{ all -> 0x0616 }
            goto L_0x0286
        L_0x02fd:
            r1 = r17
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x0616 }
            if (r1 == 0) goto L_0x0313
            java.lang.String r1 = r12.getString(r10)     // Catch:{ all -> 0x0616 }
            r14.A02 = r1     // Catch:{ all -> 0x0616 }
            java.lang.String r1 = r12.getString(r8)     // Catch:{ all -> 0x0616 }
            r14.A01 = r1     // Catch:{ all -> 0x0616 }
            goto L_0x0286
        L_0x0313:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0616 }
            r14.<init>()     // Catch:{ all -> 0x0616 }
            java.lang.String r1 = "unrecognized mimetype; skipping; mimetype="
            r14.append(r1)     // Catch:{ all -> 0x0616 }
            r14.append(r2)     // Catch:{ all -> 0x0616 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0616 }
            goto L_0x02c4
        L_0x0326:
            r12.close()
            goto L_0x01c9
        L_0x032b:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r22 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0332 }
            goto L_0x0339
        L_0x0332:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0339:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.Set r1 = r3.entrySet()
            java.util.Iterator r18 = r1.iterator()
        L_0x034b:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x04a0
            java.lang.Object r10 = r18.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r14 = r10.getValue()
            java.util.List r14 = (java.util.List) r14
            r13 = 0
            java.lang.Object r6 = r14.get(r13)
            X.286 r6 = (X.AnonymousClass286) r6
            java.lang.String[] r12 = A08
            int r11 = r12.length
            java.util.Iterator r17 = r14.iterator()
            r16 = 0
        L_0x036d:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x038e
            java.lang.Object r5 = r17.next()
            X.286 r5 = (X.AnonymousClass286) r5
            r2 = 0
        L_0x037a:
            if (r2 >= r11) goto L_0x036d
            r15 = r12[r2]
            java.lang.String r1 = r5.A02
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x038b
            r6 = r5
            r11 = r2
            r16 = 1
            goto L_0x036d
        L_0x038b:
            int r2 = r2 + 1
            goto L_0x037a
        L_0x038e:
            if (r16 != 0) goto L_0x03ba
            java.lang.Object r6 = r14.get(r13)
            X.286 r6 = (X.AnonymousClass286) r6
            java.util.Iterator r12 = r14.iterator()
        L_0x039a:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x03ba
            java.lang.Object r11 = r12.next()
            X.286 r11 = (X.AnonymousClass286) r11
            r5 = 0
        L_0x03a7:
            java.lang.String[] r2 = A09
            int r1 = r2.length
            if (r5 >= r1) goto L_0x03b9
            r2 = r2[r5]
            java.lang.String r1 = r11.A02
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x039a
            int r5 = r5 + 1
            goto L_0x03a7
        L_0x03b9:
            r6 = r11
        L_0x03ba:
            java.lang.Object r2 = r10.getKey()
            r1 = r21
            java.lang.Object r5 = r1.get(r2)
            X.0sH r5 = (X.C16010sH) r5
            if (r5 == 0) goto L_0x03f8
            boolean r1 = r32.isEmpty()
            if (r1 != 0) goto L_0x03e3
            boolean r1 = r5.A0i
            if (r1 != 0) goto L_0x03e3
            r2 = r22
            r1 = r32
            boolean r1 = X.AnonymousClass288.A02(r5, r2, r1)
            if (r1 == 0) goto L_0x03e3
            java.util.List r1 = r9.A02
        L_0x03de:
            r1.add(r5)
            goto L_0x034b
        L_0x03e3:
            long r1 = r6.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            X.285 r1 = (X.AnonymousClass285) r1
            boolean r1 = A00(r1, r6, r5)
            if (r1 == 0) goto L_0x048f
            java.util.List r1 = r9.A06
            goto L_0x03de
        L_0x03f8:
            java.lang.Object r1 = r10.getKey()
            X.01Q r1 = (X.AnonymousClass01Q) r1
            java.lang.Object r2 = r1.A00
            r1 = r20
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x046e
            X.0pd r5 = r0.A07
            r2 = 1880(0x758, float:2.634E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r1 = r5.A0E(r1, r2)
            if (r1 == 0) goto L_0x046e
            java.lang.Object r1 = r10.getKey()
            X.01Q r1 = (X.AnonymousClass01Q) r1
            java.lang.Object r2 = r1.A00
            r1 = r20
            java.lang.Object r1 = r1.get(r2)
            X.0sH r1 = (X.C16010sH) r1
            if (r1 == 0) goto L_0x046e
            X.0sH r15 = r1.A06()
            if (r15 == 0) goto L_0x046f
            r5 = r15
        L_0x042d:
            r1 = -1
            r5.A0D(r1)
            java.lang.String r1 = r6.A06
            r5.A0S = r1
            java.lang.Object r1 = r10.getKey()
            X.01Q r1 = (X.AnonymousClass01Q) r1
            java.lang.Object r2 = r1.A00
            r1 = r19
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x048f
            long r1 = r6.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            X.285 r1 = (X.AnonymousClass285) r1
            A00(r1, r6, r5)
            java.util.List r1 = r9.A00
            r1.add(r5)
            if (r15 != 0) goto L_0x0493
            java.util.List r1 = r9.A01
            r1.add(r5)
            java.lang.Object r1 = r10.getKey()
            X.01Q r1 = (X.AnonymousClass01Q) r1
            java.lang.Object r1 = r1.A00
            r7.add(r1)
            goto L_0x034b
        L_0x046e:
            r15 = 0
        L_0x046f:
            r24 = 0
            java.lang.String r14 = r6.A05
            long r1 = r6.A01
            java.lang.String r13 = r6.A03
            int r12 = r6.A00
            java.lang.String r11 = r6.A04
            X.0sH r5 = new X.0sH
            r31 = 0
            r23 = r5
            r25 = r14
            r26 = r13
            r27 = r11
            r28 = r12
            r29 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29, r31)
            goto L_0x042d
        L_0x048f:
            java.util.List r1 = r9.A05
            goto L_0x03de
        L_0x0493:
            java.lang.Object r1 = r10.getKey()
            X.01Q r1 = (X.AnonymousClass01Q) r1
            java.lang.Object r1 = r1.A00
            r8.add(r1)
            goto L_0x034b
        L_0x04a0:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Set r0 = r21.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x04ad:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04e7
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x04ad
            java.lang.Object r1 = r2.getValue()
            java.util.List r0 = r9.A03
            r0.add(r1)
            java.lang.Object r1 = r2.getValue()
            java.util.List r0 = r9.A04
            r0.add(r1)
            java.lang.Object r1 = r2.getValue()
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x04ad
            r6.add(r0)
            goto L_0x04ad
        L_0x04e7:
            java.util.Set r0 = r21.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x04ef:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x056c
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            X.01Q r0 = (X.AnonymousClass01Q) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x054b
            java.util.List r1 = r9.A03
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x054b
            java.lang.Object r1 = r3.getValue()
            java.util.List r0 = r9.A00
            r0.add(r1)
            java.lang.Object r1 = r3.getValue()
            java.util.List r0 = r9.A01
        L_0x0524:
            r0.add(r1)
        L_0x0527:
            java.lang.Object r1 = r3.getValue()
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r1.A08(r0)
            if (r2 == 0) goto L_0x04ef
            boolean r0 = r6.contains(r2)
            if (r0 == 0) goto L_0x04ef
            java.util.List r1 = r9.A04
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x04ef
            r6.remove(r2)
            goto L_0x04ef
        L_0x054b:
            java.lang.Object r0 = r3.getKey()
            X.01Q r0 = (X.AnonymousClass01Q) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0527
            java.util.List r1 = r9.A03
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0527
            java.lang.Object r1 = r3.getValue()
            java.util.List r0 = r9.A00
            goto L_0x0524
        L_0x056c:
            java.util.List r5 = r9.A04
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x05a2
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x057d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x059f
            java.lang.Object r2 = r3.next()
            X.0sH r2 = (X.C16010sH) r2
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r2.A08(r1)
            if (r0 == 0) goto L_0x057d
            com.whatsapp.jid.Jid r0 = r2.A08(r1)
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x057d
            r4.add(r2)
            goto L_0x057d
        L_0x059f:
            r5.removeAll(r4)
        L_0x05a2:
            java.util.List r2 = r9.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = r34
            r1.append(r3)
            java.lang.String r0 = "add"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C16000sG.A02(r0, r2)
            java.util.List r2 = r9.A06
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = "update"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C16000sG.A02(r0, r2)
            java.util.List r2 = r9.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = "remove"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C16000sG.A02(r0, r2)
            java.util.List r2 = r9.A05
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = "unchanged"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C16000sG.A02(r0, r2)
            java.util.List r2 = r9.A02
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = "updateContactsMatchingJidHash"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C16000sG.A02(r0, r2)
            return r9
        L_0x0616:
            r0 = move-exception
            if (r12 == 0) goto L_0x061c
            r12.close()     // Catch:{ all -> 0x061c }
        L_0x061c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass282.A01(java.lang.String, java.util.List, java.util.List):X.287");
    }
}
