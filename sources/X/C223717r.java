package X;

/* renamed from: X.17r  reason: invalid class name and case insensitive filesystem */
public class C223717r {
    public final C16300so A00;
    public final C16920ts A01;
    public final C216314v A02;
    public final C16900tq A03;
    public final AnonymousClass19C A04;
    public final AnonymousClass11I A05;
    public final C222617g A06;

    public C223717r(C16300so r1, C16920ts r2, C216314v r3, C16900tq r4, AnonymousClass19C r5, AnonymousClass11I r6, C222617g r7) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A00(X.C15830rv r6) {
        /*
            r5 = this;
            X.0tq r0 = r5.A03
            X.0tf r3 = r0.get()
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0050 }
            r2 = 0
            X.0ts r0 = r5.A01     // Catch:{ all -> 0x0050 }
            long r0 = r0.A02(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0050 }
            r4[r2] = r0     // Catch:{ all -> 0x0050 }
            boolean r0 = r5.A02()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = "SELECT _id FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND (action_type = 19 OR action_type = 67)"
        L_0x001e:
            X.0tg r0 = r3.A02     // Catch:{ all -> 0x0050 }
            android.database.Cursor r2 = r0.A08(r1, r4)     // Catch:{ all -> 0x0050 }
            goto L_0x0028
        L_0x0025:
            java.lang.String r1 = "SELECT _id FROM message_view WHERE chat_row_id = ? AND from_me = 1 AND message_type = 7 AND (media_size = 19 OR media_size = 67)"
            goto L_0x001e
        L_0x0028:
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0049 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0049 }
            long r0 = (long) r0     // Catch:{ all -> 0x0049 }
            r2.close()     // Catch:{ all -> 0x0050 }
            r3.close()
            return r0
        L_0x0040:
            r2.close()     // Catch:{ all -> 0x0050 }
            r3.close()
            r0 = -1
            return r0
        L_0x0049:
            r0 = move-exception
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223717r.A00(X.0rv):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x03c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x056e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass1WU r19) {
        /*
            r18 = this;
            r6 = r19
            r5 = r18
            X.0tq r7 = r5.A03
            X.0tf r4 = r7.A02()
            X.1cj r15 = r4.A00()     // Catch:{ all -> 0x056f }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r9.<init>()     // Catch:{ all -> 0x056a }
            java.lang.String r3 = "message_row_id"
            long r0 = r6.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r9.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = "action_type"
            int r0 = r6.A00     // Catch:{ all -> 0x056a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            r9.put(r1, r0)     // Catch:{ all -> 0x056a }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "message_system"
            r8 = 5
            r2.A06(r9, r0, r8)     // Catch:{ all -> 0x056a }
            boolean r0 = r6 instanceof X.C39281sD     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0052
            r10 = r6
            X.1sD r10 = (X.C39281sD) r10     // Catch:{ all -> 0x056a }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r9.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r10.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r9.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = "old_data"
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x056a }
            X.C38611r4.A04(r9, r1, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "message_system_value_change"
            r2.A06(r9, r0, r8)     // Catch:{ all -> 0x056a }
        L_0x0052:
            boolean r0 = r6 instanceof X.C39301sF     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0073
            r10 = r6
            X.1sF r10 = (X.C39301sF) r10     // Catch:{ all -> 0x056a }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r9.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r10.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r9.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = "old_data"
            java.lang.String r0 = r10.A00     // Catch:{ all -> 0x056a }
            X.C38611r4.A04(r9, r1, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "message_system_value_change"
            r2.A06(r9, r0, r8)     // Catch:{ all -> 0x056a }
        L_0x0073:
            boolean r0 = r6 instanceof X.C39311sG     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0094
            r10 = r6
            X.1sG r10 = (X.C39311sG) r10     // Catch:{ all -> 0x056a }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r9.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r10.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r9.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = "old_data"
            java.lang.String r0 = r10.A00     // Catch:{ all -> 0x056a }
            X.C38611r4.A04(r9, r1, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "message_system_value_change"
            r2.A06(r9, r0, r8)     // Catch:{ all -> 0x056a }
        L_0x0094:
            boolean r0 = r6 instanceof X.C39291sE     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x00f6
            r9 = r6
            X.1sE r9 = (X.C39291sE) r9     // Catch:{ all -> 0x056a }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r11.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r9.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r11.put(r3, r0)     // Catch:{ all -> 0x056a }
            int r0 = r9.A00     // Catch:{ all -> 0x056a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "is_me_joined"
            r11.put(r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "message_system_group"
            r10 = 5
            r2.A06(r11, r0, r8)     // Catch:{ all -> 0x056a }
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x056a }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x056a }
        L_0x00c0:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x056a }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x056a }
            X.14v r0 = r5.A02     // Catch:{ all -> 0x056a }
            long r13 = r0.A01(r1)     // Catch:{ all -> 0x056a }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00c0
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r8.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r9.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r8.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "user_jid_row_id"
            r8.put(r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "message_system_chat_participant"
            r2.A06(r8, r0, r10)     // Catch:{ all -> 0x056a }
            goto L_0x00c0
        L_0x00f6:
            boolean r0 = r6 instanceof X.C39321sH     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0147
            r9 = r6
            X.1sH r9 = (X.C39321sH) r9     // Catch:{ all -> 0x056a }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r8.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r9.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r8.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = r9.A13()     // Catch:{ all -> 0x056a }
            java.lang.String r10 = "new_photo_id"
            X.C38611r4.A04(r8, r10, r0)     // Catch:{ all -> 0x056a }
            com.obwhatsapp.data.ProfilePhotoChange r0 = r9.A00     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0133
            byte[] r1 = r0.oldPhoto     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "old_photo"
            X.C38611r4.A06(r8, r0, r1)     // Catch:{ all -> 0x056a }
            com.obwhatsapp.data.ProfilePhotoChange r0 = r9.A00     // Catch:{ all -> 0x056a }
            byte[] r1 = r0.newPhoto     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "new_photo"
            X.C38611r4.A06(r8, r0, r1)     // Catch:{ all -> 0x056a }
            com.obwhatsapp.data.ProfilePhotoChange r0 = r9.A00     // Catch:{ all -> 0x056a }
            int r0 = r0.newPhotoId     // Catch:{ all -> 0x056a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x056a }
            X.C38611r4.A04(r8, r10, r0)     // Catch:{ all -> 0x056a }
        L_0x0133:
            java.lang.String r0 = r9.A13()     // Catch:{ all -> 0x056a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0141
            com.obwhatsapp.data.ProfilePhotoChange r0 = r9.A00     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0147
        L_0x0141:
            r1 = 5
            java.lang.String r0 = "message_system_photo_change"
            r2.A06(r8, r0, r1)     // Catch:{ all -> 0x056a }
        L_0x0147:
            boolean r0 = r6 instanceof X.AnonymousClass1WT     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x019c
            r11 = r6
            X.1WT r11 = (X.AnonymousClass1WT) r11     // Catch:{ all -> 0x056a }
            com.whatsapp.jid.UserJid r1 = r11.A01     // Catch:{ all -> 0x056a }
            r16 = -1
            if (r1 == 0) goto L_0x0165
            X.14v r0 = r5.A02     // Catch:{ all -> 0x056a }
            long r12 = r0.A01(r1)     // Catch:{ all -> 0x056a }
        L_0x015a:
            com.whatsapp.jid.UserJid r1 = r11.A00     // Catch:{ all -> 0x056a }
            if (r1 == 0) goto L_0x0168
            X.14v r0 = r5.A02     // Catch:{ all -> 0x056a }
            long r9 = r0.A01(r1)     // Catch:{ all -> 0x056a }
            goto L_0x016a
        L_0x0165:
            r12 = -1
            goto L_0x015a
        L_0x0168:
            r9 = -1
        L_0x016a:
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0172
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x019c
        L_0x0172:
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r8.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r11.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r8.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "old_jid_row_id"
            if (r1 != 0) goto L_0x0309
            r8.putNull(r0)     // Catch:{ all -> 0x056a }
        L_0x018b:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "new_jid_row_id"
            if (r1 != 0) goto L_0x0304
            r8.putNull(r0)     // Catch:{ all -> 0x056a }
        L_0x0196:
            r1 = 5
            java.lang.String r0 = "message_system_number_change"
            r2.A06(r8, r0, r1)     // Catch:{ all -> 0x056a }
        L_0x019c:
            boolean r0 = r6 instanceof X.C39331sJ     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x01d3
            r9 = r6
            X.1sJ r9 = (X.C39331sJ) r9     // Catch:{ all -> 0x056a }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r8.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r9.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r8.put(r3, r0)     // Catch:{ all -> 0x056a }
            int r0 = r9.A00     // Catch:{ all -> 0x056a }
            long r0 = (long) r0     // Catch:{ all -> 0x056a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "device_added_count"
            if (r1 != 0) goto L_0x02ff
            r8.putNull(r0)     // Catch:{ all -> 0x056a }
        L_0x01bf:
            int r0 = r9.A01     // Catch:{ all -> 0x056a }
            long r0 = (long) r0     // Catch:{ all -> 0x056a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "device_removed_count"
            if (r1 != 0) goto L_0x02fa
            r8.putNull(r0)     // Catch:{ all -> 0x056a }
        L_0x01cd:
            java.lang.String r1 = "message_system_device_change"
            r0 = 5
            r2.A06(r8, r1, r0)     // Catch:{ all -> 0x056a }
        L_0x01d3:
            boolean r0 = r6 instanceof X.C39341sK     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x01f9
            r9 = r6
            X.1sK r9 = (X.C39341sK) r9     // Catch:{ all -> 0x056a }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r8.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r9.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r8.put(r3, r0)     // Catch:{ all -> 0x056a }
            int r0 = r9.A00     // Catch:{ all -> 0x056a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "biz_state_id"
            r8.put(r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = "message_system_initial_privacy_provider"
            r0 = 5
            r2.A06(r8, r1, r0)     // Catch:{ all -> 0x056a }
        L_0x01f9:
            boolean r0 = r6 instanceof X.C39351sL     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x02ea
            r8 = r6
            X.1sL r8 = (X.C39351sL) r8     // Catch:{ all -> 0x056a }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r9.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r8.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r9.put(r3, r0)     // Catch:{ all -> 0x056a }
            com.whatsapp.jid.UserJid r1 = r8.A01     // Catch:{ all -> 0x056a }
            if (r1 == 0) goto L_0x0222
            X.14v r0 = r5.A02     // Catch:{ all -> 0x056a }
            long r0 = r0.A01(r1)     // Catch:{ all -> 0x056a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "sender_jid_row_id"
            r9.put(r0, r1)     // Catch:{ all -> 0x056a }
        L_0x0222:
            com.whatsapp.jid.UserJid r1 = r8.A00     // Catch:{ all -> 0x056a }
            if (r1 == 0) goto L_0x0235
            X.14v r0 = r5.A02     // Catch:{ all -> 0x056a }
            long r0 = r0.A01(r1)     // Catch:{ all -> 0x056a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "receiver_jid_row_id"
            r9.put(r0, r1)     // Catch:{ all -> 0x056a }
        L_0x0235:
            java.lang.String r1 = r8.A03     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "amount_with_symbol"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
            X.1Vw r8 = r8.A02     // Catch:{ all -> 0x056a }
            if (r8 == 0) goto L_0x0261
            X.0rv r1 = r8.A00     // Catch:{ all -> 0x056a }
            if (r1 == 0) goto L_0x0253
            X.14v r0 = r5.A02     // Catch:{ all -> 0x056a }
            long r0 = r0.A01(r1)     // Catch:{ all -> 0x056a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "remote_message_sender_jid_row_id"
            r9.put(r0, r1)     // Catch:{ all -> 0x056a }
        L_0x0253:
            boolean r1 = r8.A02     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "remote_message_from_me"
            X.C38611r4.A05(r9, r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r8.A01     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "remote_message_key"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
        L_0x0261:
            r8 = 5
            java.lang.String r0 = "message_payment"
            r2.A06(r9, r0, r8)     // Catch:{ all -> 0x056a }
            boolean r0 = r6 instanceof X.C39361sM     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x02aa
            r10 = r6
            X.1sM r10 = (X.C39361sM) r10     // Catch:{ all -> 0x056a }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r9.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r10.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r9.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r10.A02     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "web_stub"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r10.A01     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "amount"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r10.A04     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "transfer_date"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r10.A03     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "payment_sender_name"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
            int r0 = r10.A00     // Catch:{ all -> 0x056a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "expiration"
            r9.put(r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "message_payment_transaction_reminder"
            r2.A06(r9, r0, r8)     // Catch:{ all -> 0x056a }
        L_0x02aa:
            boolean r0 = r6 instanceof X.C39371sN     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x02ea
            r10 = r6
            X.1sN r10 = (X.C39371sN) r10     // Catch:{ all -> 0x056a }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r9.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r10.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r9.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r10.A03     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "transaction_info"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r10.A01     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "transaction_data"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r10.A02     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "init_timestamp"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r10.A04     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "update_timestamp"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r10.A00     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "amount_data"
            X.C38611r4.A04(r9, r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "message_payment_status_update"
            r2.A06(r9, r0, r8)     // Catch:{ all -> 0x056a }
        L_0x02ea:
            boolean r0 = r6 instanceof X.C39381sO     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x033e
            X.19C r0 = r5.A04     // Catch:{ all -> 0x056a }
            r10 = r6
            X.1sO r10 = (X.C39381sO) r10     // Catch:{ all -> 0x056a }
            X.0tq r0 = r0.A00     // Catch:{ all -> 0x056a }
            X.0tf r8 = r0.A02()     // Catch:{ all -> 0x056a }
            goto L_0x030e
        L_0x02fa:
            r8.put(r0, r1)     // Catch:{ all -> 0x056a }
            goto L_0x01cd
        L_0x02ff:
            r8.put(r0, r1)     // Catch:{ all -> 0x056a }
            goto L_0x01bf
        L_0x0304:
            r8.put(r0, r1)     // Catch:{ all -> 0x056a }
            goto L_0x0196
        L_0x0309:
            r8.put(r0, r1)     // Catch:{ all -> 0x056a }
            goto L_0x018b
        L_0x030e:
            r0 = 3
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x03be }
            r9.<init>(r0)     // Catch:{ all -> 0x03be }
            long r0 = r10.A13     // Catch:{ all -> 0x03be }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03be }
            r9.put(r3, r0)     // Catch:{ all -> 0x03be }
            java.lang.String r1 = "service"
            int r0 = r10.A00     // Catch:{ all -> 0x03be }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03be }
            r9.put(r1, r0)     // Catch:{ all -> 0x03be }
            java.lang.String r1 = "invite_used"
            boolean r0 = r10.A01     // Catch:{ all -> 0x03be }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x03be }
            r9.put(r1, r0)     // Catch:{ all -> 0x03be }
            X.0tg r1 = r8.A02     // Catch:{ all -> 0x03be }
            java.lang.String r0 = "message_system_payment_invite_setup"
            r1.A02(r9, r0)     // Catch:{ all -> 0x03be }
            r8.close()     // Catch:{ all -> 0x056a }
        L_0x033e:
            boolean r0 = r6 instanceof X.C39391sP     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0364
            r9 = r6
            X.1sP r9 = (X.C39391sP) r9     // Catch:{ all -> 0x056a }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r8.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r9.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r8.put(r3, r0)     // Catch:{ all -> 0x056a }
            boolean r0 = r9.A00     // Catch:{ all -> 0x056a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "is_blocked"
            r8.put(r0, r1)     // Catch:{ all -> 0x056a }
            r1 = 5
            java.lang.String r0 = "message_system_block_contact"
            r2.A06(r8, r0, r1)     // Catch:{ all -> 0x056a }
        L_0x0364:
            boolean r0 = r6 instanceof X.C39401sQ     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x038b
            r9 = r6
            X.1sQ r9 = (X.C39401sQ) r9     // Catch:{ all -> 0x056a }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r8.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r9.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r8.put(r3, r0)     // Catch:{ all -> 0x056a }
            int r0 = r9.A00     // Catch:{ all -> 0x056a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "setting_duration"
            r8.put(r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = "message_system_ephemeral_setting_not_applied"
            r0 = 5
            r2.A06(r8, r1, r0)     // Catch:{ all -> 0x056a }
        L_0x038b:
            boolean r0 = r6 instanceof X.C39411sR     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x03c6
            r9 = r6
            X.1sR r9 = (X.C39411sR) r9     // Catch:{ all -> 0x056a }
            X.0tf r8 = r7.A02()     // Catch:{ all -> 0x056a }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x03be }
            r7.<init>()     // Catch:{ all -> 0x03be }
            long r0 = r9.A13     // Catch:{ all -> 0x03be }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03be }
            r7.put(r3, r0)     // Catch:{ all -> 0x03be }
            java.lang.String r1 = "business_name"
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x03be }
            r7.put(r1, r0)     // Catch:{ all -> 0x03be }
            java.lang.String r1 = "privacy_message_type"
            int r0 = r9.A00     // Catch:{ all -> 0x03be }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03be }
            r7.put(r1, r0)     // Catch:{ all -> 0x03be }
            X.0tg r1 = r8.A02     // Catch:{ all -> 0x03be }
            java.lang.String r0 = "message_system_business_state"
            r1.A02(r7, r0)     // Catch:{ all -> 0x03be }
            goto L_0x03c3
        L_0x03be:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x03c2 }
        L_0x03c2:
            throw r0     // Catch:{ all -> 0x056a }
        L_0x03c3:
            r8.close()     // Catch:{ all -> 0x056a }
        L_0x03c6:
            boolean r0 = r6 instanceof X.C39421sS     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x03f3
            r8 = r6
            X.1sS r8 = (X.C39421sS) r8     // Catch:{ all -> 0x056a }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r7.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r8.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r7.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r8.A00     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "call_id"
            X.C38611r4.A04(r7, r0, r1)     // Catch:{ all -> 0x056a }
            boolean r0 = r8.A01     // Catch:{ all -> 0x056a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "is_video_call"
            r7.put(r0, r1)     // Catch:{ all -> 0x056a }
            r1 = 5
            java.lang.String r0 = "message_system_linked_group_call"
            r2.A06(r7, r0, r1)     // Catch:{ all -> 0x056a }
        L_0x03f3:
            boolean r0 = r6 instanceof X.C39431sT     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x043c
            r8 = r6
            X.1sT r8 = (X.C39431sT) r8     // Catch:{ all -> 0x056a }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r7.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r8.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r7.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.Integer r0 = r8.A02     // Catch:{ all -> 0x056a }
            if (r0 != 0) goto L_0x040e
            r1 = 0
            goto L_0x0416
        L_0x040e:
            long r0 = r0.longValue()     // Catch:{ all -> 0x056a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
        L_0x0416:
            java.lang.String r0 = "old_group_type"
            if (r1 != 0) goto L_0x04c7
            r7.putNull(r0)     // Catch:{ all -> 0x056a }
        L_0x041d:
            int r0 = r8.A00     // Catch:{ all -> 0x056a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "new_group_type"
            r7.put(r0, r1)     // Catch:{ all -> 0x056a }
            com.whatsapp.jid.GroupJid r1 = r8.A01     // Catch:{ all -> 0x056a }
            java.lang.String r8 = "linked_parent_group_jid_row_id"
            if (r1 != 0) goto L_0x04b8
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            r7.put(r8, r0)     // Catch:{ all -> 0x056a }
        L_0x0436:
            r1 = 5
            java.lang.String r0 = "message_system_community_link_changed"
            r2.A06(r7, r0, r1)     // Catch:{ all -> 0x056a }
        L_0x043c:
            boolean r0 = r6 instanceof X.C39441sU     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0460
            r8 = r6
            X.1sU r8 = (X.C39441sU) r8     // Catch:{ all -> 0x056a }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r7.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r8.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r7.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r8.A00     // Catch:{ all -> 0x056a }
            if (r1 == 0) goto L_0x045a
            java.lang.String r0 = "linked_parent_group_name"
            r7.put(r0, r1)     // Catch:{ all -> 0x056a }
        L_0x045a:
            r1 = 5
            java.lang.String r0 = "message_system_group_with_parent"
            r2.A06(r7, r0, r1)     // Catch:{ all -> 0x056a }
        L_0x0460:
            boolean r0 = r6 instanceof X.C39451sV     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x04cc
            r9 = r6
            X.1sV r9 = (X.C39451sV) r9     // Catch:{ all -> 0x056a }
            java.util.Set r0 = r9.A03     // Catch:{ all -> 0x056a }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x056a }
        L_0x046d:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x04cc
            java.lang.Object r7 = r10.next()     // Catch:{ all -> 0x056a }
            X.1sW r7 = (X.C39461sW) r7     // Catch:{ all -> 0x056a }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r8.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r9.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r8.put(r3, r0)     // Catch:{ all -> 0x056a }
            com.whatsapp.jid.GroupJid r0 = r7.A02     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "subgroup_raw_jid"
            r8.put(r0, r1)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "subgroup_subject"
            X.C38611r4.A04(r8, r0, r1)     // Catch:{ all -> 0x056a }
            X.0sL r1 = r9.A01     // Catch:{ all -> 0x056a }
            java.lang.String r7 = "parent_group_jid_row_id"
            if (r1 != 0) goto L_0x04a4
            r0 = -1
            goto L_0x04aa
        L_0x04a4:
            X.14v r0 = r5.A02     // Catch:{ all -> 0x056a }
            long r0 = r0.A01(r1)     // Catch:{ all -> 0x056a }
        L_0x04aa:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r8.put(r7, r0)     // Catch:{ all -> 0x056a }
            r1 = 5
            java.lang.String r0 = "message_system_sibling_group_link_change"
            r2.A06(r8, r0, r1)     // Catch:{ all -> 0x056a }
            goto L_0x046d
        L_0x04b8:
            X.14v r0 = r5.A02     // Catch:{ all -> 0x056a }
            long r0 = r0.A01(r1)     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r7.put(r8, r0)     // Catch:{ all -> 0x056a }
            goto L_0x0436
        L_0x04c7:
            r7.put(r0, r1)     // Catch:{ all -> 0x056a }
            goto L_0x041d
        L_0x04cc:
            boolean r0 = r6 instanceof X.C39471sX     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0534
            r8 = r6
            X.1sX r8 = (X.C39471sX) r8     // Catch:{ all -> 0x056a }
            java.util.List r0 = r8.A00     // Catch:{ all -> 0x056a }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x056a }
        L_0x04d9:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0534
            java.lang.Object r11 = r14.next()     // Catch:{ all -> 0x056a }
            X.1sY r11 = (X.C39481sY) r11     // Catch:{ all -> 0x056a }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r7.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r8.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r7.put(r3, r0)     // Catch:{ all -> 0x056a }
            com.whatsapp.jid.GroupJid r9 = r11.A01     // Catch:{ all -> 0x056a }
            X.14v r0 = r5.A02     // Catch:{ all -> 0x056a }
            java.lang.String r1 = "group_jid_row_id"
            long r12 = r0.A01(r9)     // Catch:{ all -> 0x056a }
            r9 = -1
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0514
            java.lang.String r0 = "BindMessageUtil/bindJidRowId/no jid row found"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x056a }
            X.0so r9 = r5.A00     // Catch:{ all -> 0x056a }
            r7 = 1
            java.lang.String r1 = "wa-community-event"
            java.lang.String r0 = "SystemMessageStore/insertSystemMessageWithGroupNodes/could not bind jid row id"
            r9.AcB(r1, r0, r7)     // Catch:{ all -> 0x056a }
            goto L_0x04d9
        L_0x0514:
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x056a }
            r7.put(r1, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r11.A02     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "group_subject"
            X.C38611r4.A04(r7, r0, r1)     // Catch:{ all -> 0x056a }
            int r0 = r11.A00     // Catch:{ all -> 0x056a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "group_node_type"
            r7.put(r0, r1)     // Catch:{ all -> 0x056a }
            r1 = 5
            java.lang.String r0 = "message_system_with_group_nodes"
            r2.A06(r7, r0, r1)     // Catch:{ all -> 0x056a }
            goto L_0x04d9
        L_0x0534:
            boolean r0 = r6 instanceof X.C39491sZ     // Catch:{ all -> 0x056a }
            if (r0 == 0) goto L_0x0560
            X.1sZ r6 = (X.C39491sZ) r6     // Catch:{ all -> 0x056a }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x056a }
            r5.<init>()     // Catch:{ all -> 0x056a }
            long r0 = r6.A13     // Catch:{ all -> 0x056a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056a }
            r5.put(r3, r0)     // Catch:{ all -> 0x056a }
            java.lang.String r1 = r6.A00     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "agent_name"
            X.C38611r4.A04(r5, r0, r1)     // Catch:{ all -> 0x056a }
            boolean r0 = r6.A01     // Catch:{ all -> 0x056a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = "is_unassigned_chat"
            r5.put(r0, r1)     // Catch:{ all -> 0x056a }
            r1 = 5
            java.lang.String r0 = "message_system_chat_assignment"
            r2.A06(r5, r0, r1)     // Catch:{ all -> 0x056a }
        L_0x0560:
            r15.A00()     // Catch:{ all -> 0x056a }
            r15.close()     // Catch:{ all -> 0x056f }
            r4.close()
            return
        L_0x056a:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x056e }
        L_0x056e:
            throw r0     // Catch:{ all -> 0x056f }
        L_0x056f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0573 }
        L_0x0573:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223717r.A01(X.1WU):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r7.A05.A01("system_message_ready", 0) == 2) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r7 = this;
            X.0tq r0 = r7.A03
            X.0tf r6 = r0.get()
            r0.A04()     // Catch:{ all -> 0x002a }
            X.1jC r1 = r0.A04     // Catch:{ all -> 0x002a }
            X.0tg r0 = r6.A02     // Catch:{ all -> 0x002a }
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0025
            X.11I r3 = r7.A05     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "system_message_ready"
            r0 = 0
            long r4 = r3.A01(r2, r0)     // Catch:{ all -> 0x002a }
            r2 = 2
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            r6.close()
            return r0
        L_0x002a:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223717r.A02():boolean");
    }
}
