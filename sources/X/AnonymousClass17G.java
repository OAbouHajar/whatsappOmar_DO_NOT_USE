package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.17G  reason: invalid class name */
public class AnonymousClass17G {
    public final C16300so A00;
    public final C16190sc A01;
    public final C16440t3 A02;
    public final C16920ts A03;
    public final C216314v A04;
    public final C16900tq A05;
    public final AnonymousClass11I A06;
    public final C223717r A07;
    public final C222617g A08;

    public AnonymousClass17G(C16300so r1, C16190sc r2, C16440t3 r3, C16920ts r4, C216314v r5, C16900tq r6, AnonymousClass11I r7, C223717r r8, C222617g r9) {
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A08 = r9;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
    }

    public C16740tZ A00(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean z2 = true;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("from_me")) != 1) {
            z2 = false;
        }
        C15830rv A052 = this.A03.A05(cursor.getLong(cursor.getColumnIndexOrThrow("chat_row_id")));
        if (A052 == null) {
            return null;
        }
        return A01(cursor, new C28381Vw(A052, string, z2));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16740tZ A01(android.database.Cursor r7, X.C28381Vw r8) {
        /*
            r6 = this;
            java.lang.String r0 = "table_version"
            int r1 = r7.getColumnIndex(r0)
            r0 = -1
            if (r1 != r0) goto L_0x005e
            X.0tq r5 = r6.A05
            X.0tf r4 = r5.get()
            r5.A04()     // Catch:{ all -> 0x0059 }
            X.1jC r1 = r5.A04     // Catch:{ all -> 0x0059 }
            X.0tg r0 = r4.A02     // Catch:{ all -> 0x0059 }
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0026
            X.0so r3 = r6.A00     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "MainMessageStore/readMessage/read directly from old table instead of view."
            r1 = 0
            r0 = 1
            r3.AcB(r2, r1, r0)     // Catch:{ all -> 0x0059 }
        L_0x0026:
            r4.close()
            X.0tf r4 = r5.get()
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = X.C39511sb.A04     // Catch:{ all -> 0x0059 }
            java.lang.String[] r0 = r6.A0B(r8)     // Catch:{ all -> 0x0059 }
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x0059 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x004a
            X.0tZ r0 = r6.A02(r1, r8)     // Catch:{ all -> 0x0052 }
            r1.close()     // Catch:{ all -> 0x0059 }
            r4.close()
            return r0
        L_0x004a:
            r1.close()     // Catch:{ all -> 0x0059 }
            r4.close()
            r0 = 0
            return r0
        L_0x0052:
            r0 = move-exception
            if (r1 == 0) goto L_0x0058
            r1.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            throw r0
        L_0x005e:
            X.0tZ r0 = r6.A02(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17G.A01(android.database.Cursor, X.1Vw):X.0tZ");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:278:0x0702 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:299:0x0723 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:304:0x0728 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:310:0x072f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:265:0x06e0=Splitter:B:265:0x06e0, B:304:0x0728=Splitter:B:304:0x0728} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:267:0x06e3=Splitter:B:267:0x06e3, B:310:0x072f=Splitter:B:310:0x072f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:278:0x0702=Splitter:B:278:0x0702, B:187:0x04ee=Splitter:B:187:0x04ee} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C16740tZ A02(android.database.Cursor r27, X.C28381Vw r28) {
        /*
            r26 = this;
            java.lang.String r0 = "message_type"
            r7 = r27
            int r0 = r7.getColumnIndexOrThrow(r0)
            int r0 = r7.getInt(r0)
            byte r2 = (byte) r0
            java.lang.String r0 = "timestamp"
            int r0 = r7.getColumnIndexOrThrow(r0)
            long r14 = r7.getLong(r0)
            java.lang.String r0 = "status"
            int r0 = r7.getColumnIndexOrThrow(r0)
            int r1 = r7.getInt(r0)
            r25 = r26
            r11 = r28
            if (r2 != 0) goto L_0x0038
            r0 = 6
            if (r1 == r0) goto L_0x003b
        L_0x002c:
            r0 = r25
            X.17g r0 = r0.A08
            X.0tZ r5 = r0.A01(r11, r2, r14)
        L_0x0034:
            if (r5 != 0) goto L_0x06eb
            r0 = 0
            return r0
        L_0x0038:
            r0 = 7
            if (r2 != r0) goto L_0x002c
        L_0x003b:
            r0 = r25
            X.17r r2 = r0.A07
            boolean r0 = r2.A02()
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "media_size"
            int r0 = r7.getColumnIndexOrThrow(r0)
            int r13 = r7.getInt(r0)
            r0 = 38
            if (r13 != r0) goto L_0x005c
            X.17g r1 = r2.A06
            r0 = 33
            X.0tZ r5 = r1.A01(r11, r0, r14)
            goto L_0x0034
        L_0x005c:
            X.0so r10 = r2.A00
            r12 = 0
            X.1WU r5 = X.AnonymousClass122.A00(r10, r11, r12, r13, r14)
            goto L_0x0034
        L_0x0064:
            java.lang.String r0 = "_id"
            int r0 = r7.getColumnIndexOrThrow(r0)
            long r0 = r7.getLong(r0)
            X.0tq r8 = r2.A03
            X.0tf r16 = r8.get()
            r3 = r16
            X.0tg r10 = r3.A02     // Catch:{ all -> 0x0730 }
            java.lang.String r9 = "SELECT action_type FROM message_system WHERE message_row_id = ?"
            r3 = 1
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x0730 }
            r5 = 0
            java.lang.String r4 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0730 }
            r6[r5] = r4     // Catch:{ all -> 0x0730 }
            android.database.Cursor r13 = r10.A08(r9, r6)     // Catch:{ all -> 0x0730 }
            boolean r4 = r13.moveToFirst()     // Catch:{ all -> 0x0729 }
            if (r4 != 0) goto L_0x0091
            r5 = 0
            goto L_0x06e3
        L_0x0091:
            java.lang.String r4 = "action_type"
            int r4 = r13.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0729 }
            int r20 = r13.getInt(r4)     // Catch:{ all -> 0x0729 }
            X.0so r4 = r2.A00     // Catch:{ all -> 0x0729 }
            r24 = r4
            r19 = 0
            r17 = r4
            r18 = r11
            r21 = r14
            X.1WU r5 = X.AnonymousClass122.A00(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0729 }
            r5.A0X(r3)     // Catch:{ all -> 0x0729 }
            r5.A13 = r0     // Catch:{ all -> 0x0729 }
            java.lang.String r9 = "remote_message_from_me"
            java.lang.String r6 = "new_photo_id"
            X.0tf r4 = r8.get()     // Catch:{ all -> 0x0729 }
            boolean r0 = r5 instanceof X.C39281sD     // Catch:{ all -> 0x0724 }
            r17 = 0
            if (r0 == 0) goto L_0x00e8
            X.0tg r11 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String r10 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r5.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            android.database.Cursor r8 = r11.A08(r10, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x00e5
            r1 = r5
            X.1sD r1 = (X.C39281sD) r1     // Catch:{ all -> 0x070f }
            java.lang.String r0 = "old_data"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x070f }
            r1.A01 = r0     // Catch:{ all -> 0x070f }
        L_0x00e5:
            r8.close()     // Catch:{ all -> 0x0724 }
        L_0x00e8:
            boolean r0 = r5 instanceof X.C39301sF     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x0116
            X.0tg r11 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String r10 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r5.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            android.database.Cursor r8 = r11.A08(r10, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x0113
            r1 = r5
            X.1sF r1 = (X.C39301sF) r1     // Catch:{ all -> 0x070f }
            java.lang.String r0 = "old_data"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x070f }
            r1.A00 = r0     // Catch:{ all -> 0x070f }
        L_0x0113:
            r8.close()     // Catch:{ all -> 0x0724 }
        L_0x0116:
            boolean r0 = r5 instanceof X.C39311sG     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x0144
            X.0tg r11 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String r10 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r5.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            android.database.Cursor r8 = r11.A08(r10, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x0141
            r1 = r5
            X.1sG r1 = (X.C39311sG) r1     // Catch:{ all -> 0x070f }
            java.lang.String r0 = "old_data"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x070f }
            r1.A00 = r0     // Catch:{ all -> 0x070f }
        L_0x0141:
            r8.close()     // Catch:{ all -> 0x0724 }
        L_0x0144:
            boolean r0 = r5 instanceof X.C39291sE     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x01b4
            X.0tg r10 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String r11 = "SELECT is_me_joined FROM message_system_group WHERE message_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r5.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            android.database.Cursor r8 = r10.A08(r11, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x016f
            r1 = r5
            X.1sE r1 = (X.C39291sE) r1     // Catch:{ all -> 0x070f }
            java.lang.String r0 = "is_me_joined"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            int r0 = r8.getInt(r0)     // Catch:{ all -> 0x070f }
            r1.A00 = r0     // Catch:{ all -> 0x070f }
        L_0x016f:
            r8.close()     // Catch:{ all -> 0x0724 }
            java.lang.String r11 = "SELECT user_jid_row_id FROM message_system_chat_participant WHERE message_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r5.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            android.database.Cursor r8 = r10.A08(r11, r8)     // Catch:{ all -> 0x0724 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x070f }
            r10.<init>()     // Catch:{ all -> 0x070f }
        L_0x0187:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x01a8
            java.lang.String r0 = "user_jid_row_id"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            long r0 = r8.getLong(r0)     // Catch:{ all -> 0x070f }
            X.14v r11 = r2.A02     // Catch:{ all -> 0x070f }
            com.whatsapp.jid.Jid r0 = r11.A03(r0)     // Catch:{ all -> 0x070f }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x0187
            r10.add(r0)     // Catch:{ all -> 0x070f }
            goto L_0x0187
        L_0x01a8:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x070f }
            if (r0 != 0) goto L_0x01b1
            r5.A0t(r10)     // Catch:{ all -> 0x070f }
        L_0x01b1:
            r8.close()     // Catch:{ all -> 0x0724 }
        L_0x01b4:
            boolean r0 = r5 instanceof X.C39321sH     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x020e
            X.0tg r11 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String r10 = "SELECT new_photo_id, old_photo, new_photo FROM message_system_photo_change WHERE message_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r5.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            android.database.Cursor r8 = r11.A08(r10, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x020b
            r10 = r5
            X.1sH r10 = (X.C39321sH) r10     // Catch:{ all -> 0x070f }
            int r0 = r8.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x070f }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x070f }
            r10.A14(r0)     // Catch:{ all -> 0x070f }
            com.obwhatsapp.data.ProfilePhotoChange r1 = new com.obwhatsapp.data.ProfilePhotoChange     // Catch:{ all -> 0x070f }
            r1.<init>()     // Catch:{ all -> 0x070f }
            int r0 = r8.getColumnIndexOrThrow(r6)     // Catch:{ NumberFormatException -> 0x01f1 }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ NumberFormatException -> 0x01f1 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01f1 }
            r1.newPhotoId = r0     // Catch:{ NumberFormatException -> 0x01f1 }
        L_0x01f1:
            java.lang.String r0 = "new_photo"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            byte[] r0 = r8.getBlob(r0)     // Catch:{ all -> 0x070f }
            r1.newPhoto = r0     // Catch:{ all -> 0x070f }
            java.lang.String r0 = "old_photo"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            byte[] r0 = r8.getBlob(r0)     // Catch:{ all -> 0x070f }
            r1.oldPhoto = r0     // Catch:{ all -> 0x070f }
            r10.A00 = r1     // Catch:{ all -> 0x070f }
        L_0x020b:
            r8.close()     // Catch:{ all -> 0x0724 }
        L_0x020e:
            boolean r0 = r5 instanceof X.AnonymousClass1WT     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x025a
            X.0tg r10 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String r8 = "SELECT old_jid_row_id, new_jid_row_id FROM message_system_number_change WHERE message_row_id = ?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r5.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r6[r17] = r0     // Catch:{ all -> 0x0724 }
            android.database.Cursor r6 = r10.A08(r8, r6)     // Catch:{ all -> 0x0724 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0708 }
            if (r0 == 0) goto L_0x0257
            r8 = r5
            X.1WT r8 = (X.AnonymousClass1WT) r8     // Catch:{ all -> 0x0708 }
            java.lang.String r0 = "old_jid_row_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0708 }
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x0708 }
            X.14v r10 = r2.A02     // Catch:{ all -> 0x0708 }
            com.whatsapp.jid.Jid r0 = r10.A03(r0)     // Catch:{ all -> 0x0708 }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x0708 }
            r8.A01 = r0     // Catch:{ all -> 0x0708 }
            java.lang.String r0 = "new_jid_row_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0708 }
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x0708 }
            com.whatsapp.jid.Jid r0 = r10.A03(r0)     // Catch:{ all -> 0x0708 }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x0708 }
            r8.A00 = r0     // Catch:{ all -> 0x0708 }
        L_0x0257:
            r6.close()     // Catch:{ all -> 0x0724 }
        L_0x025a:
            boolean r0 = r5 instanceof X.C39351sL     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x03a7
            X.0tg r8 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String r10 = "SELECT sender_jid_row_id, receiver_jid_row_id, amount_with_symbol, remote_message_sender_jid_row_id, remote_message_from_me, remote_message_key FROM message_payment WHERE message_row_id = ?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r5.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r6[r17] = r0     // Catch:{ all -> 0x0724 }
            android.database.Cursor r6 = r8.A08(r10, r6)     // Catch:{ all -> 0x0724 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0708 }
            if (r0 == 0) goto L_0x02e7
            r11 = r5
            X.1sL r11 = (X.C39351sL) r11     // Catch:{ all -> 0x0708 }
            X.14v r10 = r2.A02     // Catch:{ all -> 0x0708 }
            java.lang.Class<com.whatsapp.jid.UserJid> r12 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "sender_jid_row_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0708 }
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x0708 }
            com.whatsapp.jid.Jid r0 = r10.A07(r12, r0)     // Catch:{ all -> 0x0708 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0708 }
            r11.A01 = r0     // Catch:{ all -> 0x0708 }
            java.lang.String r0 = "receiver_jid_row_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0708 }
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x0708 }
            com.whatsapp.jid.Jid r0 = r10.A07(r12, r0)     // Catch:{ all -> 0x0708 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0708 }
            r11.A00 = r0     // Catch:{ all -> 0x0708 }
            java.lang.String r0 = "amount_with_symbol"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0708 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0708 }
            r11.A03 = r0     // Catch:{ all -> 0x0708 }
            int r0 = r6.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0708 }
            boolean r0 = r6.isNull(r0)     // Catch:{ all -> 0x0708 }
            if (r0 != 0) goto L_0x02e7
            java.lang.Class<X.0rv> r12 = X.C15830rv.class
            java.lang.String r0 = "remote_message_sender_jid_row_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0708 }
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x0708 }
            com.whatsapp.jid.Jid r10 = r10.A07(r12, r0)     // Catch:{ all -> 0x0708 }
            X.0rv r10 = (X.C15830rv) r10     // Catch:{ all -> 0x0708 }
            int r0 = r6.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0708 }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0708 }
            r9 = 0
            if (r0 != r3) goto L_0x02d6
            r9 = 1
        L_0x02d6:
            java.lang.String r0 = "remote_message_key"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0708 }
            java.lang.String r1 = r6.getString(r0)     // Catch:{ all -> 0x0708 }
            X.1Vw r0 = new X.1Vw     // Catch:{ all -> 0x0708 }
            r0.<init>(r10, r1, r9)     // Catch:{ all -> 0x0708 }
            r11.A02 = r0     // Catch:{ all -> 0x0708 }
        L_0x02e7:
            r6.close()     // Catch:{ all -> 0x0724 }
            boolean r0 = r5 instanceof X.C39361sM     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x0348
            java.lang.String r9 = "SELECT web_stub , amount , transfer_date , payment_sender_name , expiration FROM message_payment_transaction_reminder WHERE message_row_id = ?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r5.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r6[r17] = r0     // Catch:{ all -> 0x0724 }
            android.database.Cursor r1 = r8.A08(r9, r6)     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x071d }
            if (r0 == 0) goto L_0x0345
            r6 = r5
            X.1sM r6 = (X.C39361sM) r6     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "web_stub"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A02 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "amount"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A01 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "transfer_date"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A04 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "payment_sender_name"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A03 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "expiration"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x071d }
            r6.A00 = r0     // Catch:{ all -> 0x071d }
        L_0x0345:
            r1.close()     // Catch:{ all -> 0x0724 }
        L_0x0348:
            boolean r0 = r5 instanceof X.C39371sN     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x03a7
            java.lang.String r9 = "SELECT transaction_info, transaction_data, init_timestamp, update_timestamp, amount_data FROM message_payment_status_update WHERE message_row_id  = ?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r5.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r6[r17] = r0     // Catch:{ all -> 0x0724 }
            android.database.Cursor r1 = r8.A08(r9, r6)     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x071d }
            if (r0 == 0) goto L_0x03a4
            r6 = r5
            X.1sN r6 = (X.C39371sN) r6     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "transaction_info"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A03 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "transaction_data"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A01 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "init_timestamp"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A02 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "update_timestamp"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A04 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "amount_data"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A00 = r0     // Catch:{ all -> 0x071d }
        L_0x03a4:
            r1.close()     // Catch:{ all -> 0x0724 }
        L_0x03a7:
            boolean r0 = r5 instanceof X.C39331sJ     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x03e1
            r6 = r5
            X.1sJ r6 = (X.C39331sJ) r6     // Catch:{ all -> 0x0724 }
            X.0tg r9 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r6.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT device_added_count, device_removed_count FROM message_system_device_change WHERE message_row_id = ?"
            android.database.Cursor r1 = r9.A08(r0, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x071d }
            if (r0 == 0) goto L_0x03de
            java.lang.String r0 = "device_added_count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x071d }
            r6.A00 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "device_removed_count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x071d }
            r6.A01 = r0     // Catch:{ all -> 0x071d }
        L_0x03de:
            r1.close()     // Catch:{ all -> 0x0724 }
        L_0x03e1:
            boolean r0 = r5 instanceof X.C39341sK     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x040f
            r6 = r5
            X.1sK r6 = (X.C39341sK) r6     // Catch:{ all -> 0x0724 }
            X.0tg r9 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r6.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT privacy_provider, verified_biz_name, biz_state_id FROM message_system_initial_privacy_provider WHERE message_row_id = ?"
            android.database.Cursor r1 = r9.A08(r0, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x071d }
            if (r0 == 0) goto L_0x040c
            java.lang.String r0 = "biz_state_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x071d }
            r6.A00 = r0     // Catch:{ all -> 0x071d }
        L_0x040c:
            r1.close()     // Catch:{ all -> 0x0724 }
        L_0x040f:
            boolean r0 = r5 instanceof X.C39391sP     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x0441
            r8 = r5
            X.1sP r8 = (X.C39391sP) r8     // Catch:{ all -> 0x0724 }
            X.0tg r10 = r4.A02     // Catch:{ all -> 0x0724 }
            r6 = 1
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r8.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r9[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT is_blocked FROM message_system_block_contact WHERE message_row_id = ?"
            android.database.Cursor r1 = r10.A08(r0, r9)     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x071d }
            if (r0 == 0) goto L_0x043e
            java.lang.String r0 = "is_blocked"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x071d }
            if (r0 == r3) goto L_0x043c
            r6 = 0
        L_0x043c:
            r8.A00 = r6     // Catch:{ all -> 0x071d }
        L_0x043e:
            r1.close()     // Catch:{ all -> 0x0724 }
        L_0x0441:
            boolean r0 = r5 instanceof X.C39401sQ     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x0470
            r6 = r5
            X.1sQ r6 = (X.C39401sQ) r6     // Catch:{ all -> 0x0724 }
            X.0tg r9 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r6.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT setting_duration FROM message_system_ephemeral_setting_not_applied WHERE message_row_id = ?"
            android.database.Cursor r1 = r9.A08(r0, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x071d }
            if (r0 == 0) goto L_0x046d
            java.lang.String r0 = "setting_duration"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x071d }
            r6.A00 = r0     // Catch:{ all -> 0x071d }
        L_0x046d:
            r1.close()     // Catch:{ all -> 0x0724 }
        L_0x0470:
            boolean r0 = r5 instanceof X.C39411sR     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x04aa
            r6 = r5
            X.1sR r6 = (X.C39411sR) r6     // Catch:{ all -> 0x0724 }
            X.0tg r9 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r6.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT message_row_id, privacy_message_type, business_name FROM message_system_business_state WHERE message_row_id = ?"
            android.database.Cursor r1 = r9.A08(r0, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x071d }
            if (r0 == 0) goto L_0x04a7
            java.lang.String r0 = "privacy_message_type"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x071d }
            r6.A00 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "business_name"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A01 = r0     // Catch:{ all -> 0x071d }
        L_0x04a7:
            r1.close()     // Catch:{ all -> 0x0724 }
        L_0x04aa:
            boolean r0 = r5 instanceof X.C39381sO     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x04f4
            X.19C r0 = r2.A04     // Catch:{ all -> 0x0724 }
            r9 = r5
            X.1sO r9 = (X.C39381sO) r9     // Catch:{ all -> 0x0724 }
            X.0tq r0 = r0.A00     // Catch:{ all -> 0x0724 }
            X.0tf r6 = r0.get()     // Catch:{ all -> 0x0724 }
            X.0tg r12 = r6.A02     // Catch:{ all -> 0x0703 }
            java.lang.String r11 = "SELECT service, invite_used FROM message_system_payment_invite_setup WHERE message_row_id =?"
            r8 = 1
            java.lang.String[] r10 = new java.lang.String[r3]     // Catch:{ all -> 0x0703 }
            long r0 = r9.A13     // Catch:{ all -> 0x0703 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0703 }
            r10[r17] = r0     // Catch:{ all -> 0x0703 }
            android.database.Cursor r1 = r12.A08(r11, r10)     // Catch:{ all -> 0x0703 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x06fc }
            if (r0 == 0) goto L_0x04ee
            java.lang.String r0 = "service"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x06fc }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x06fc }
            r9.A00 = r0     // Catch:{ all -> 0x06fc }
            java.lang.String r0 = "invite_used"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x06fc }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x06fc }
            if (r0 == r3) goto L_0x04ec
            r8 = 0
        L_0x04ec:
            r9.A01 = r8     // Catch:{ all -> 0x06fc }
        L_0x04ee:
            r1.close()     // Catch:{ all -> 0x0703 }
            r6.close()     // Catch:{ all -> 0x0724 }
        L_0x04f4:
            boolean r0 = r5 instanceof X.C39421sS     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x0532
            r8 = r5
            X.1sS r8 = (X.C39421sS) r8     // Catch:{ all -> 0x0724 }
            X.0tg r10 = r4.A02     // Catch:{ all -> 0x0724 }
            r6 = 1
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r8.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r9[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT call_id, is_video_call FROM message_system_linked_group_call WHERE message_row_id = ?"
            android.database.Cursor r1 = r10.A08(r0, r9)     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x071d }
            if (r0 == 0) goto L_0x052f
            java.lang.String r0 = "call_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r8.A00 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "is_video_call"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x071d }
            if (r0 == r3) goto L_0x052d
            r6 = 0
        L_0x052d:
            r8.A01 = r6     // Catch:{ all -> 0x071d }
        L_0x052f:
            r1.close()     // Catch:{ all -> 0x0724 }
        L_0x0532:
            boolean r0 = r5 instanceof X.C39431sT     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x058f
            r9 = r5
            X.1sT r9 = (X.C39431sT) r9     // Catch:{ all -> 0x0724 }
            X.0tg r8 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r9.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r6[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT old_group_type, new_group_type, linked_parent_group_jid_row_id FROM message_system_community_link_changed WHERE message_row_id = ?"
            android.database.Cursor r6 = r8.A08(r0, r6)     // Catch:{ all -> 0x0724 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0708 }
            if (r0 == 0) goto L_0x058c
            java.lang.String r0 = "old_group_type"
            int r1 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0708 }
            boolean r0 = r6.isNull(r1)     // Catch:{ all -> 0x0708 }
            if (r0 == 0) goto L_0x055f
            r0 = 0
            goto L_0x0567
        L_0x055f:
            int r0 = r6.getInt(r1)     // Catch:{ all -> 0x0708 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0708 }
        L_0x0567:
            r9.A02 = r0     // Catch:{ all -> 0x0708 }
            java.lang.String r0 = "new_group_type"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0708 }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0708 }
            r9.A00 = r0     // Catch:{ all -> 0x0708 }
            java.lang.String r0 = "linked_parent_group_jid_row_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0708 }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0708 }
            X.14v r8 = r2.A02     // Catch:{ all -> 0x0708 }
            long r0 = (long) r0     // Catch:{ all -> 0x0708 }
            com.whatsapp.jid.Jid r0 = r8.A03(r0)     // Catch:{ all -> 0x0708 }
            X.0sL r0 = X.C16050sL.A03(r0)     // Catch:{ all -> 0x0708 }
            r9.A01 = r0     // Catch:{ all -> 0x0708 }
        L_0x058c:
            r6.close()     // Catch:{ all -> 0x0724 }
        L_0x058f:
            boolean r0 = r5 instanceof X.C39441sU     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x05bd
            r6 = r5
            X.1sU r6 = (X.C39441sU) r6     // Catch:{ all -> 0x0724 }
            X.0tg r9 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r6.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT linked_parent_group_name FROM message_system_group_with_parent WHERE message_row_id = ?"
            android.database.Cursor r1 = r9.A08(r0, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x071d }
            if (r0 == 0) goto L_0x05ba
            java.lang.String r0 = "linked_parent_group_name"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A00 = r0     // Catch:{ all -> 0x071d }
        L_0x05ba:
            r1.close()     // Catch:{ all -> 0x0724 }
        L_0x05bd:
            boolean r0 = r5 instanceof X.C39451sV     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x0636
            r6 = r5
            X.1sV r6 = (X.C39451sV) r6     // Catch:{ all -> 0x0724 }
            X.0tg r9 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r6.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT subgroup_raw_jid, subgroup_subject, parent_group_jid_row_id FROM message_system_sibling_group_link_change WHERE message_row_id = ?"
            android.database.Cursor r8 = r9.A08(r0, r8)     // Catch:{ all -> 0x0724 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x070f }
            r10.<init>()     // Catch:{ all -> 0x070f }
            java.lang.String r0 = "subgroup_raw_jid"
            int r12 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            java.lang.String r0 = "subgroup_subject"
            int r11 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            java.lang.String r0 = "parent_group_jid_row_id"
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            r1 = 0
        L_0x05f0:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x0620
            java.lang.String r0 = r8.getString(r12)     // Catch:{ all -> 0x070f }
            X.0sL r19 = X.C16050sL.A05(r0)     // Catch:{ all -> 0x070f }
            java.lang.String r20 = r8.getString(r11)     // Catch:{ all -> 0x070f }
            r22 = 0
            r21 = 2
            X.1sW r0 = new X.1sW     // Catch:{ all -> 0x070f }
            r18 = r0
            r18.<init>(r19, r20, r21, r22)     // Catch:{ all -> 0x070f }
            r10.add(r0)     // Catch:{ all -> 0x070f }
            int r0 = r8.getInt(r9)     // Catch:{ all -> 0x070f }
            X.14v r14 = r2.A02     // Catch:{ all -> 0x070f }
            long r0 = (long) r0     // Catch:{ all -> 0x070f }
            com.whatsapp.jid.Jid r0 = r14.A03(r0)     // Catch:{ all -> 0x070f }
            X.0sL r1 = X.C16050sL.A03(r0)     // Catch:{ all -> 0x070f }
            goto L_0x05f0
        L_0x0620:
            r6.A01 = r1     // Catch:{ all -> 0x070f }
            int r0 = r10.size()     // Catch:{ all -> 0x070f }
            if (r0 >= 0) goto L_0x0629
            r0 = 0
        L_0x0629:
            r6.A00 = r0     // Catch:{ all -> 0x070f }
            java.util.Set r0 = r6.A03     // Catch:{ all -> 0x070f }
            r0.clear()     // Catch:{ all -> 0x070f }
            r0.addAll(r10)     // Catch:{ all -> 0x070f }
            r8.close()     // Catch:{ all -> 0x0724 }
        L_0x0636:
            boolean r0 = r5 instanceof X.C39471sX     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x06a2
            r10 = r5
            X.1sX r10 = (X.C39471sX) r10     // Catch:{ all -> 0x0724 }
            X.0tg r8 = r4.A02     // Catch:{ all -> 0x0724 }
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r10.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r6[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT group_jid_row_id, group_subject, group_node_type FROM message_system_with_group_nodes WHERE message_row_id = ?"
            android.database.Cursor r11 = r8.A08(r0, r6)     // Catch:{ all -> 0x0724 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0716 }
            r12.<init>()     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "group_jid_row_id"
            int r9 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "group_subject"
            int r8 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r0 = "group_node_type"
            int r6 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0716 }
        L_0x0666:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0716 }
            if (r0 == 0) goto L_0x069c
            int r0 = r11.getInt(r9)     // Catch:{ all -> 0x0716 }
            X.14v r14 = r2.A02     // Catch:{ all -> 0x0716 }
            long r0 = (long) r0     // Catch:{ all -> 0x0716 }
            com.whatsapp.jid.Jid r0 = r14.A03(r0)     // Catch:{ all -> 0x0716 }
            X.0sL r15 = X.C16050sL.A03(r0)     // Catch:{ all -> 0x0716 }
            java.lang.String r14 = r11.getString(r8)     // Catch:{ all -> 0x0716 }
            int r1 = r11.getInt(r6)     // Catch:{ all -> 0x0716 }
            if (r15 == 0) goto L_0x068e
            X.1sY r0 = new X.1sY     // Catch:{ all -> 0x0716 }
            r0.<init>(r15, r14, r1)     // Catch:{ all -> 0x0716 }
            r12.add(r0)     // Catch:{ all -> 0x0716 }
            goto L_0x0666
        L_0x068e:
            java.lang.String r14 = "SystemMessageStore/fillMessageSystemWithGroupNodes/no jid found"
            X.AnonymousClass00B.A08(r14)     // Catch:{ all -> 0x0716 }
            java.lang.String r1 = "wa-community-event"
            r0 = r24
            r0.AcB(r1, r14, r3)     // Catch:{ all -> 0x0716 }
            goto L_0x0666
        L_0x069c:
            r10.A17(r12)     // Catch:{ all -> 0x0716 }
            r11.close()     // Catch:{ all -> 0x0724 }
        L_0x06a2:
            boolean r0 = r5 instanceof X.C39491sZ     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x06e0
            r6 = r5
            X.1sZ r6 = (X.C39491sZ) r6     // Catch:{ all -> 0x0724 }
            X.0tg r9 = r4.A02     // Catch:{ all -> 0x0724 }
            r2 = 1
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0724 }
            long r0 = r6.A13     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0724 }
            r8[r17] = r0     // Catch:{ all -> 0x0724 }
            java.lang.String r0 = "SELECT agent_name, is_unassigned_chat FROM message_system_chat_assignment WHERE message_row_id = ?"
            android.database.Cursor r1 = r9.A08(r0, r8)     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x071d }
            if (r0 == 0) goto L_0x06dd
            java.lang.String r0 = "agent_name"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x071d }
            r6.A00 = r0     // Catch:{ all -> 0x071d }
            java.lang.String r0 = "is_unassigned_chat"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x071d }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x071d }
            if (r0 == r3) goto L_0x06db
            r2 = 0
        L_0x06db:
            r6.A01 = r2     // Catch:{ all -> 0x071d }
        L_0x06dd:
            r1.close()     // Catch:{ all -> 0x0724 }
        L_0x06e0:
            r4.close()     // Catch:{ all -> 0x0729 }
        L_0x06e3:
            r13.close()     // Catch:{ all -> 0x0730 }
            r16.close()
            goto L_0x0034
        L_0x06eb:
            r0 = r25
            X.14v r0 = r0.A04
            r5.A0a(r7, r0)
            boolean r0 = r25.A09()
            if (r0 != 0) goto L_0x06fb
            r5.A0Z(r7)
        L_0x06fb:
            return r5
        L_0x06fc:
            r0 = move-exception
            if (r1 == 0) goto L_0x0702
            r1.close()     // Catch:{ all -> 0x0702 }
        L_0x0702:
            throw r0     // Catch:{ all -> 0x0703 }
        L_0x0703:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0723 }
            goto L_0x0723
        L_0x0708:
            r0 = move-exception
            if (r6 == 0) goto L_0x0723
            r6.close()     // Catch:{ all -> 0x0723 }
            goto L_0x0723
        L_0x070f:
            r0 = move-exception
            if (r8 == 0) goto L_0x0723
            r8.close()     // Catch:{ all -> 0x0723 }
            goto L_0x0723
        L_0x0716:
            r0 = move-exception
            if (r11 == 0) goto L_0x0723
            r11.close()     // Catch:{ all -> 0x0723 }
            goto L_0x0723
        L_0x071d:
            r0 = move-exception
            if (r1 == 0) goto L_0x0723
            r1.close()     // Catch:{ all -> 0x0723 }
        L_0x0723:
            throw r0     // Catch:{ all -> 0x0724 }
        L_0x0724:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0728 }
        L_0x0728:
            throw r0     // Catch:{ all -> 0x0729 }
        L_0x0729:
            r0 = move-exception
            if (r13 == 0) goto L_0x072f
            r13.close()     // Catch:{ all -> 0x072f }
        L_0x072f:
            throw r0     // Catch:{ all -> 0x0730 }
        L_0x0730:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x0734 }
        L_0x0734:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17G.A02(android.database.Cursor, X.1Vw):X.0tZ");
    }

    public final void A03(ContentValues contentValues, C16740tZ r7) {
        contentValues.put("sort_id", Long.valueOf(r7.A14));
        C16920ts r1 = this.A03;
        C28381Vw r2 = r7.A11;
        C15830rv r0 = r2.A00;
        AnonymousClass00B.A06(r0);
        contentValues.put("chat_row_id", Long.valueOf(r1.A02(r0)));
        C38611r4.A05(contentValues, "from_me", r2.A02);
        contentValues.put("key_id", r2.A01);
        C15830rv A0B = r7.A0B();
        contentValues.put("sender_jid_row_id", Long.valueOf(A0B == null ? 0 : this.A04.A01(A0B)));
        contentValues.put("status", Integer.valueOf(r7.A0C));
        C38611r4.A05(contentValues, "broadcast", r7.A0t);
        contentValues.put("recipient_count", Integer.valueOf(r7.A0A));
        C38611r4.A04(contentValues, "participant_hash", r7.A0m);
        contentValues.put("origination_flags", Integer.valueOf(r7.A07()));
        contentValues.put("origin", Integer.valueOf(r7.A08));
        contentValues.put("timestamp", Long.valueOf(r7.A0I));
        contentValues.put("received_timestamp", Long.valueOf(r7.A0G));
        contentValues.put("receipt_server_timestamp", Long.valueOf(r7.A0H));
        contentValues.put("message_type", Byte.valueOf(r7.A10));
        C38611r4.A04(contentValues, "text_data", r7.A0P());
        C38611r4.A05(contentValues, "starred", r7.A0x);
        contentValues.put("lookup_tables", Long.valueOf(r7.A0A()));
        contentValues.put("message_add_on_flags", Integer.valueOf(r7.A07));
        if (r7.A13 > 0) {
            contentValues.put("_id", Long.valueOf(r7.A13));
        }
    }

    public final void A04(ContentValues contentValues, C16740tZ r7) {
        contentValues.put("status", Integer.valueOf(r7.A0C));
        contentValues.put("recipient_count", Integer.valueOf(r7.A0A));
        contentValues.put("origination_flags", Integer.valueOf(r7.A07()));
        contentValues.put("origin", Integer.valueOf(r7.A08));
        contentValues.put("timestamp", Long.valueOf(r7.A0I));
        long j2 = r7.A0G;
        if (j2 == 0) {
            j2 = this.A02.A00();
        }
        contentValues.put("received_timestamp", Long.valueOf(j2));
        contentValues.put("receipt_server_timestamp", Long.valueOf(r7.A0H));
        contentValues.put("message_type", Byte.valueOf(r7.A10));
        C38611r4.A04(contentValues, "text_data", r7.A0P());
        contentValues.put("lookup_tables", Long.valueOf(r7.A0A()));
        contentValues.put("sort_id", Long.valueOf(r7.A14));
        contentValues.put("message_add_on_flags", Integer.valueOf(r7.A07));
    }

    public final void A05(ContentValues contentValues, C16740tZ r7) {
        C16920ts r1 = this.A03;
        C28381Vw r2 = r7.A11;
        C15830rv r0 = r2.A00;
        AnonymousClass00B.A06(r0);
        contentValues.put("chat_row_id", Long.valueOf(r1.A02(r0)));
        C38611r4.A05(contentValues, "from_me", r2.A02);
        contentValues.put("key_id", r2.A01);
        contentValues.put("status", Integer.valueOf(r7.A0C));
        C38611r4.A05(contentValues, "broadcast", r7.A0t);
        contentValues.put("recipient_count", Integer.valueOf(r7.A0A));
        C38611r4.A04(contentValues, "participant_hash", r7.A0m);
        contentValues.put("origination_flags", Integer.valueOf(r7.A07()));
        contentValues.put("origin", Integer.valueOf(r7.A08));
        contentValues.put("timestamp", Long.valueOf(r7.A0I));
        long j2 = r7.A0G;
        if (j2 == 0) {
            j2 = this.A02.A00();
        }
        contentValues.put("received_timestamp", Long.valueOf(j2));
        contentValues.put("receipt_server_timestamp", Long.valueOf(r7.A0H));
        contentValues.put("message_type", Byte.valueOf(r7.A10));
        C38611r4.A04(contentValues, "text_data", r7.A0P());
        contentValues.put("lookup_tables", Long.valueOf(r7.A0A()));
        contentValues.put("sort_id", Long.valueOf(r7.A14));
        contentValues.put("message_add_on_flags", Integer.valueOf(r7.A07));
    }

    public final void A06(ContentValues contentValues, C16740tZ r5) {
        contentValues.put("status", Integer.valueOf(r5.A0C));
        contentValues.put("needs_push", 2);
        C38611r4.A02(contentValues, r5);
        contentValues.put("timestamp", Long.valueOf(r5.A0I));
        C38611r4.A04(contentValues, "media_url", r5.A0O());
        C38611r4.A04(contentValues, "media_mime_type", r5.A0M());
        contentValues.put("media_wa_type", Byte.valueOf(r5.A10));
        contentValues.put("media_size", Long.valueOf(r5.A09()));
        C38611r4.A04(contentValues, "media_name", r5.A0N());
        C38611r4.A04(contentValues, "media_caption", r5.A0J());
        C38611r4.A04(contentValues, "media_hash", r5.A0L());
        contentValues.put("media_duration", Integer.valueOf(r5.A04()));
        contentValues.put("origin", Integer.valueOf(r5.A08));
        boolean z2 = r5 instanceof C30901d9;
        contentValues.put("latitude", Double.valueOf(z2 ? ((C30901d9) r5).A00 : 0.0d));
        contentValues.put("longitude", Double.valueOf(z2 ? ((C30901d9) r5).A01 : 0.0d));
        C38611r4.A04(contentValues, "mentioned_jids", C39501sa.A00(r5.A0q));
        C38611r4.A03(contentValues, C38611r4.A00(this.A01, r5.A0H()));
        C38611r4.A04(contentValues, "media_enc_hash", r5.A0K());
        contentValues.put("message_add_on_flags", Integer.valueOf(r5.A07));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0336 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0348 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C16740tZ r11, boolean r12) {
        /*
            r10 = this;
            r0 = 1
            r11.A0X(r0)
            X.0tq r0 = r10.A05
            X.0tf r4 = r0.A02()
            X.1cj r9 = r4.A00()     // Catch:{ all -> 0x0349 }
            r0.A04()     // Catch:{ all -> 0x0344 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x0344 }
            boolean r0 = r0.A0D(r4)     // Catch:{ all -> 0x0344 }
            if (r0 == 0) goto L_0x0243
            r3 = 0
            r2 = 1
            if (r12 == 0) goto L_0x00a1
            java.util.List r6 = r11.A0Q()     // Catch:{ all -> 0x0344 }
            if (r6 == 0) goto L_0x007f
            int r1 = r6.size()     // Catch:{ all -> 0x0344 }
            int r0 = r11.A0A     // Catch:{ all -> 0x0344 }
            if (r1 < r0) goto L_0x007f
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0344 }
            r5.<init>(r6)     // Catch:{ all -> 0x0344 }
            X.1Vw r1 = r11.A11     // Catch:{ all -> 0x0344 }
            X.0rv r0 = r1.A00     // Catch:{ all -> 0x0344 }
            r5.add(r0)     // Catch:{ all -> 0x0344 }
            java.util.ArrayList r7 = X.C16030sJ.A06(r5)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x0344 }
            r7.add(r0)     // Catch:{ all -> 0x0344 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0344 }
            r5.<init>()     // Catch:{ all -> 0x0344 }
            r10.A06(r5, r11)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "key_remote_jid IN "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0344 }
            r6.<init>(r0)     // Catch:{ all -> 0x0344 }
            int r0 = r7.size()     // Catch:{ all -> 0x0344 }
            int r0 = r0 - r2
            java.lang.String r0 = X.C34111ji.A00(r0)     // Catch:{ all -> 0x0344 }
            r6.append(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = " AND "
            r6.append(r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "key_from_me = 1"
            r6.append(r0)     // Catch:{ all -> 0x0344 }
            r6.append(r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "key_id = ?"
            r6.append(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0344 }
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x0344 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ all -> 0x0344 }
            java.lang.Object[] r1 = r7.toArray(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "messages"
            goto L_0x0240
        L_0x007f:
            X.0so r5 = r10.A00     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = "message-table-scan"
            java.lang.String r0 = "update-main-message-v1"
            r5.AcB(r1, r0, r2)     // Catch:{ all -> 0x0344 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0344 }
            r5.<init>()     // Catch:{ all -> 0x0344 }
            r10.A06(r5, r11)     // Catch:{ all -> 0x0344 }
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x0344 }
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x0344 }
            X.1Vw r0 = r11.A11     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0344 }
            r1[r3] = r0     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "messages"
            java.lang.String r2 = "needs_push = 2 AND key_from_me = 1 AND key_id = ?"
            goto L_0x0240
        L_0x00a1:
            boolean r0 = r10.A09()     // Catch:{ all -> 0x0344 }
            if (r0 == 0) goto L_0x00e5
            X.0tZ r0 = r11.A0D()     // Catch:{ all -> 0x0344 }
            if (r0 == 0) goto L_0x00e5
            long r0 = r11.A0F     // Catch:{ all -> 0x0344 }
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x00e5
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x0344 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0344 }
            long r0 = r11.A13     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0344 }
            r5[r3] = r0     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "SELECT quoted_row_id FROM messages WHERE _id = ?"
            android.database.Cursor r5 = r6.A08(r0, r5)     // Catch:{ all -> 0x0344 }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "quoted_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00da }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x00da }
            r11.A0F = r0     // Catch:{ all -> 0x00da }
            goto L_0x00e2
        L_0x00da:
            r0 = move-exception
            if (r5 == 0) goto L_0x0336
            r5.close()     // Catch:{ all -> 0x0336 }
            goto L_0x0336
        L_0x00e2:
            r5.close()     // Catch:{ all -> 0x0344 }
        L_0x00e5:
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0344 }
            r5.<init>()     // Catch:{ all -> 0x0344 }
            int r0 = r11.A0C     // Catch:{ all -> 0x0344 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "status"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            boolean r1 = r11.A0t     // Catch:{ all -> 0x0344 }
            r0 = 0
            if (r1 == 0) goto L_0x00fc
            r0 = 2
        L_0x00fc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "needs_push"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            X.C38611r4.A02(r5, r11)     // Catch:{ all -> 0x0344 }
            long r0 = r11.A0I     // Catch:{ all -> 0x0344 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "timestamp"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = r11.A0O()     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "media_url"
            X.C38611r4.A04(r5, r0, r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = r11.A0M()     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "media_mime_type"
            X.C38611r4.A04(r5, r0, r1)     // Catch:{ all -> 0x0344 }
            byte r0 = r11.A10     // Catch:{ all -> 0x0344 }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "media_wa_type"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            long r0 = r11.A09()     // Catch:{ all -> 0x0344 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "media_size"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = r11.A0N()     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "media_name"
            X.C38611r4.A04(r5, r0, r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = r11.A0J()     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "media_caption"
            X.C38611r4.A04(r5, r0, r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = r11.A0L()     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "media_hash"
            X.C38611r4.A04(r5, r0, r1)     // Catch:{ all -> 0x0344 }
            int r0 = r11.A04()     // Catch:{ all -> 0x0344 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "media_duration"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            int r0 = r11.A08     // Catch:{ all -> 0x0344 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "origin"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            boolean r6 = r11 instanceof X.C30901d9     // Catch:{ all -> 0x0344 }
            if (r6 == 0) goto L_0x0184
            r0 = r11
            X.1d9 r0 = (X.C30901d9) r0     // Catch:{ all -> 0x0344 }
            double r0 = r0.A00     // Catch:{ all -> 0x0344 }
        L_0x017a:
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "latitude"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            goto L_0x0187
        L_0x0184:
            r0 = 0
            goto L_0x017a
        L_0x0187:
            if (r6 == 0) goto L_0x018a
            goto L_0x018d
        L_0x018a:
            r0 = 0
            goto L_0x0192
        L_0x018d:
            r0 = r11
            X.1d9 r0 = (X.C30901d9) r0     // Catch:{ all -> 0x0344 }
            double r0 = r0.A01     // Catch:{ all -> 0x0344 }
        L_0x0192:
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "longitude"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            java.util.List r0 = r11.A0q     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = X.C39501sa.A00(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "mentioned_jids"
            X.C38611r4.A04(r5, r0, r1)     // Catch:{ all -> 0x0344 }
            java.lang.Object r1 = r11.A0H()     // Catch:{ all -> 0x0344 }
            X.0sc r0 = r10.A01     // Catch:{ all -> 0x0344 }
            java.lang.Object r0 = X.C38611r4.A00(r0, r1)     // Catch:{ all -> 0x0344 }
            X.C38611r4.A03(r5, r0)     // Catch:{ all -> 0x0344 }
            int r0 = r11.A01     // Catch:{ all -> 0x0344 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "edit_version"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = r11.A0K()     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "media_enc_hash"
            X.C38611r4.A04(r5, r0, r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = r11.A0n     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "payment_transaction_id"
            X.C38611r4.A04(r5, r0, r1)     // Catch:{ all -> 0x0344 }
            int r0 = r11.A07()     // Catch:{ all -> 0x0344 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "forwarded"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            int r0 = r11.A05()     // Catch:{ all -> 0x0344 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "preview_type"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            long r0 = r11.A0F     // Catch:{ all -> 0x0344 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "quoted_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            long r0 = r11.A0A()     // Catch:{ all -> 0x0344 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "lookup_tables"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            boolean r0 = r11 instanceof X.C38791rQ     // Catch:{ all -> 0x0344 }
            if (r0 == 0) goto L_0x024a
            r0 = r11
            X.1rQ r0 = (X.C38791rQ) r0     // Catch:{ all -> 0x0344 }
            int r0 = r0.A00     // Catch:{ all -> 0x0344 }
        L_0x0209:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "future_message_type"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            int r0 = r11.A07     // Catch:{ all -> 0x0344 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "message_add_on_flags"
            r5.put(r0, r1)     // Catch:{ all -> 0x0344 }
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0344 }
            X.1Vw r6 = r11.A11     // Catch:{ all -> 0x0344 }
            X.0rv r0 = r6.A00     // Catch:{ all -> 0x0344 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0344 }
            r1[r3] = r0     // Catch:{ all -> 0x0344 }
            boolean r0 = r6.A02     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0344 }
            r1[r2] = r0     // Catch:{ all -> 0x0344 }
            r2 = 2
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x0344 }
            r1[r2] = r0     // Catch:{ all -> 0x0344 }
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "messages"
            java.lang.String r2 = "key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
        L_0x0240:
            r6.A00(r0, r5, r2, r1)     // Catch:{ all -> 0x0344 }
        L_0x0243:
            boolean r0 = r10.A08()     // Catch:{ all -> 0x0344 }
            if (r0 == 0) goto L_0x033a
            goto L_0x024c
        L_0x024a:
            r0 = 0
            goto L_0x0209
        L_0x024c:
            if (r12 == 0) goto L_0x02af
            java.util.List r2 = r11.A0Q()     // Catch:{ all -> 0x0344 }
            r6 = 0
            r3 = 1
            if (r2 == 0) goto L_0x0294
            int r0 = r2.size()     // Catch:{ all -> 0x0344 }
            if (r0 <= 0) goto L_0x0294
            int r0 = r2.size()     // Catch:{ all -> 0x0344 }
            int r0 = r0 + 1
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0344 }
            r8.<init>(r0)     // Catch:{ all -> 0x0344 }
            X.0ts r5 = r10.A03     // Catch:{ all -> 0x0344 }
            X.1Vw r7 = r11.A11     // Catch:{ all -> 0x0344 }
            X.0rv r0 = r7.A00     // Catch:{ all -> 0x0344 }
            long r0 = r5.A02(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0344 }
            r8.add(r0)     // Catch:{ all -> 0x0344 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0344 }
        L_0x027c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0344 }
            if (r0 == 0) goto L_0x02c4
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0344 }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x0344 }
            long r0 = r5.A02(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0344 }
            r8.add(r0)     // Catch:{ all -> 0x0344 }
            goto L_0x027c
        L_0x0294:
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0344 }
            r5.<init>()     // Catch:{ all -> 0x0344 }
            r10.A04(r5, r11)     // Catch:{ all -> 0x0344 }
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x0344 }
            X.1Vw r7 = r11.A11     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0344 }
            r1[r6] = r0     // Catch:{ all -> 0x0344 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "message"
            java.lang.String r2 = "broadcast = 1 AND from_me = 1 AND key_id = ?"
            goto L_0x0306
        L_0x02af:
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0344 }
            r5.<init>()     // Catch:{ all -> 0x0344 }
            r10.A05(r5, r11)     // Catch:{ all -> 0x0344 }
            X.1Vw r7 = r11.A11     // Catch:{ all -> 0x0344 }
            java.lang.String[] r1 = r10.A0B(r7)     // Catch:{ all -> 0x0344 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "message"
            java.lang.String r2 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            goto L_0x0306
        L_0x02c4:
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0344 }
            r8.add(r0)     // Catch:{ all -> 0x0344 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0344 }
            r5.<init>()     // Catch:{ all -> 0x0344 }
            r10.A04(r5, r11)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "chat_row_id IN "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0344 }
            r2.<init>(r0)     // Catch:{ all -> 0x0344 }
            int r0 = r8.size()     // Catch:{ all -> 0x0344 }
            int r0 = r0 - r3
            java.lang.String r0 = X.C34111ji.A00(r0)     // Catch:{ all -> 0x0344 }
            r2.append(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r1 = " AND "
            r2.append(r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "from_me = 1"
            r2.append(r0)     // Catch:{ all -> 0x0344 }
            r2.append(r1)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "key_id = ?"
            r2.append(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0344 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0344 }
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x0344 }
            java.lang.Object[] r1 = r8.toArray(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "message"
        L_0x0306:
            r3.A00(r0, r5, r2, r1)     // Catch:{ all -> 0x0344 }
            long r1 = r11.A13     // Catch:{ all -> 0x0344 }
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x033a
            if (r12 != 0) goto L_0x033a
            java.lang.String[] r1 = r10.A0B(r7)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "SELECT _id FROM message_view WHERE chat_row_id = ? AND from_me = ? AND key_id = ?"
            android.database.Cursor r2 = r3.A08(r0, r1)     // Catch:{ all -> 0x0344 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0337
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0330 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0330 }
            r11.A13 = r0     // Catch:{ all -> 0x0330 }
            goto L_0x0337
        L_0x0330:
            r0 = move-exception
            if (r2 == 0) goto L_0x0336
            r2.close()     // Catch:{ all -> 0x0336 }
        L_0x0336:
            throw r0     // Catch:{ all -> 0x0344 }
        L_0x0337:
            r2.close()     // Catch:{ all -> 0x0344 }
        L_0x033a:
            r9.A00()     // Catch:{ all -> 0x0344 }
            r9.close()     // Catch:{ all -> 0x0349 }
            r4.close()
            return
        L_0x0344:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0348 }
        L_0x0348:
            throw r0     // Catch:{ all -> 0x0349 }
        L_0x0349:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x034d }
        L_0x034d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17G.A07(X.0tZ, boolean):void");
    }

    public boolean A08() {
        return A09() || this.A06.A01("migration_message_main_index", 0) > 0;
    }

    public boolean A09() {
        return this.A06.A01("main_message_ready", 0) == 1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0137 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x013c */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae A[Catch:{ all -> 0x0133, all -> 0x0137, all -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b0 A[Catch:{ all -> 0x0133, all -> 0x0137, all -> 0x0138 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(java.util.Set r17, boolean r18) {
        /*
            r16 = this;
            r3 = r16
            X.0tq r2 = r3.A05
            X.0tf r4 = r2.A02()
            X.1cj r15 = r4.A00()     // Catch:{ all -> 0x013d }
            r2.A04()     // Catch:{ all -> 0x0138 }
            X.1jC r0 = r2.A04     // Catch:{ all -> 0x0138 }
            boolean r0 = r0.A0D(r4)     // Catch:{ all -> 0x0138 }
            r14 = 0
            r10 = r18
            r7 = r17
            if (r0 == 0) goto L_0x00a7
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0138 }
            r5.<init>()     // Catch:{ all -> 0x0138 }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0138 }
        L_0x0025:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0138 }
            r5.add(r0)     // Catch:{ all -> 0x0138 }
            goto L_0x0025
        L_0x0037:
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x0138 }
            java.lang.Object[] r1 = r5.toArray(r0)     // Catch:{ all -> 0x0138 }
            X.0tf r9 = r2.A02()     // Catch:{ all -> 0x0138 }
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r11 = new X.1jh     // Catch:{ all -> 0x0133 }
            r11.<init>(r1, r0)     // Catch:{ all -> 0x0133 }
            r8 = 0
        L_0x0049:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x0133 }
            r0 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0133 }
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch:{ all -> 0x0133 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0133 }
            r6.<init>()     // Catch:{ all -> 0x0133 }
            java.lang.String r1 = "starred"
            if (r18 != 0) goto L_0x0061
            r0 = 0
        L_0x0061:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0133 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0133 }
            X.0tg r5 = r9.A02     // Catch:{ all -> 0x0133 }
            java.lang.String r1 = "messages"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r13.<init>()     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "_id IN "
            r13.append(r0)     // Catch:{ all -> 0x0133 }
            int r0 = r12.length     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = X.C34111ji.A00(r0)     // Catch:{ all -> 0x0133 }
            r13.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0133 }
            int r0 = r5.A00(r1, r6, r0, r12)     // Catch:{ all -> 0x0133 }
            int r8 = r8 + r0
            goto L_0x0049
        L_0x0088:
            int r0 = r7.size()     // Catch:{ all -> 0x0133 }
            if (r8 != r0) goto L_0x0093
            r9.close()     // Catch:{ all -> 0x0138 }
            r13 = 1
            goto L_0x00a8
        L_0x0093:
            r9.close()     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "MainMessageStore/updateMessageStarredStatus/did not update; rowIds="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r0.<init>(r1)     // Catch:{ all -> 0x0138 }
            r0.append(r7)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0138 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0138 }
        L_0x00a7:
            r13 = 0
        L_0x00a8:
            boolean r0 = r3.A08()     // Catch:{ all -> 0x0138 }
            if (r0 != 0) goto L_0x00b0
            r0 = 0
            goto L_0x0124
        L_0x00b0:
            java.lang.Long[] r0 = X.AnonymousClass01S.A0G     // Catch:{ all -> 0x0138 }
            java.lang.Object[] r1 = r7.toArray(r0)     // Catch:{ all -> 0x0138 }
            X.0tf r9 = r2.A02()     // Catch:{ all -> 0x0138 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0133 }
            r8.<init>()     // Catch:{ all -> 0x0133 }
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r6 = new X.1jh     // Catch:{ all -> 0x0133 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x0133 }
            r5 = 0
        L_0x00c7:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0109
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x0133 }
            java.lang.Long[] r2 = (java.lang.Long[]) r2     // Catch:{ all -> 0x0133 }
            int r12 = r2.length     // Catch:{ all -> 0x0133 }
            java.lang.String[] r11 = new java.lang.String[r12]     // Catch:{ all -> 0x0133 }
            r1 = 0
        L_0x00d7:
            if (r1 >= r12) goto L_0x00e4
            r0 = r2[r1]     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0133 }
            r11[r1] = r0     // Catch:{ all -> 0x0133 }
            int r1 = r1 + 1
            goto L_0x00d7
        L_0x00e4:
            java.lang.String r0 = "starred"
            X.C38611r4.A05(r8, r0, r10)     // Catch:{ all -> 0x0133 }
            X.0tg r3 = r9.A02     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = "message"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r1.<init>()     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "_id IN "
            r1.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = X.C34111ji.A00(r12)     // Catch:{ all -> 0x0133 }
            r1.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0133 }
            int r0 = r3.A00(r2, r8, r0, r11)     // Catch:{ all -> 0x0133 }
            int r5 = r5 + r0
            goto L_0x00c7
        L_0x0109:
            r9.close()     // Catch:{ all -> 0x0138 }
            int r0 = r7.size()     // Catch:{ all -> 0x0138 }
            if (r5 == r0) goto L_0x0123
            java.lang.String r1 = "MainMessageStore/updateMessageStarredStatusV2/update failed; rowIds="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r0.<init>(r1)     // Catch:{ all -> 0x0138 }
            r0.append(r7)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0138 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0138 }
        L_0x0123:
            r0 = 1
        L_0x0124:
            if (r13 != 0) goto L_0x0128
            if (r0 == 0) goto L_0x0129
        L_0x0128:
            r14 = 1
        L_0x0129:
            r15.A00()     // Catch:{ all -> 0x0138 }
            r15.close()     // Catch:{ all -> 0x013d }
            r4.close()
            return r14
        L_0x0133:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0137 }
        L_0x0137:
            throw r0     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x013c }
        L_0x013c:
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0141 }
        L_0x0141:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17G.A0A(java.util.Set, boolean):boolean");
    }

    public final String[] A0B(C28381Vw r4) {
        String[] strArr = new String[3];
        C16920ts r1 = this.A03;
        C15830rv r0 = r4.A00;
        AnonymousClass00B.A06(r0);
        strArr[0] = String.valueOf(r1.A02(r0));
        strArr[1] = r4.A02 ? "1" : "0";
        strArr[2] = r4.A01;
        return strArr;
    }
}
