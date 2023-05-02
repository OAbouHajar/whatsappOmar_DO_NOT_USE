package X;

import android.content.ContentValues;

/* renamed from: X.182  reason: invalid class name */
public class AnonymousClass182 {
    public final C16000sG A00;
    public final AnonymousClass10R A01;
    public final C16920ts A02;
    public final C15810rt A03;
    public final C16070sO A04;
    public final C16900tq A05;
    public final C224417y A06;
    public final C18600wx A07;
    public final C14710pd A08;
    public final C16490t9 A09;
    public final C18040w3 A0A;
    public final C16320sq A0B;

    public AnonymousClass182(C16000sG r1, AnonymousClass10R r2, C16920ts r3, C15810rt r4, C16070sO r5, C16900tq r6, C224417y r7, C18600wx r8, C14710pd r9, C16490t9 r10, C18040w3 r11, C16320sq r12) {
        this.A08 = r9;
        this.A02 = r3;
        this.A0B = r12;
        this.A03 = r4;
        this.A09 = r10;
        this.A00 = r1;
        this.A01 = r2;
        this.A0A = r11;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
        this.A07 = r8;
    }

    public static final int A00(C16800tf r5, C16740tZ r6) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("duration", Integer.valueOf(r6.A04));
        Long l2 = r6.A0Z;
        AnonymousClass00B.A06(l2);
        contentValues.put("expire_timestamp", l2);
        return r5.A02.A00("message_ephemeral", contentValues, "message_row_id = ?", new String[]{String.valueOf(r6.A13)});
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(java.lang.String r6) {
        /*
            r5 = this;
            X.0tq r0 = r5.A05
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "SELECT no_of_retries_sent_already FROM message_ephemeral_sync_response WHERE chat_jid = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0039 }
            r2 = 0
            r0[r2] = r6     // Catch:{ all -> 0x0039 }
            android.database.Cursor r1 = r3.A08(r1, r0)     // Catch:{ all -> 0x0039 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "no_of_retries_sent_already"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0032 }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0032 }
            r1.close()     // Catch:{ all -> 0x0039 }
            r4.close()
            return r0
        L_0x002b:
            r1.close()     // Catch:{ all -> 0x0039 }
            r4.close()
            return r2
        L_0x0032:
            r0 = move-exception
            if (r1 == 0) goto L_0x0038
            r1.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass182.A01(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1WV A02(X.C16740tZ r13, long r14) {
        /*
            r12 = this;
            X.1Vw r5 = r13.A11
            boolean r4 = r5.A02
            if (r4 != 0) goto L_0x0019
            boolean r0 = r13 instanceof X.C39231s8
            if (r0 == 0) goto L_0x00a1
            r0 = r13
            X.1s8 r0 = (X.C39231s8) r0
            int r4 = r0.A00
            long r2 = r0.A01
        L_0x0011:
            int r1 = r13.A00
            X.1WV r0 = new X.1WV
            r0.<init>(r4, r2, r1)
            return r0
        L_0x0019:
            boolean r0 = r13.A0z()
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r13.A1D
            if (r0 != 0) goto L_0x00c6
            boolean r0 = r13 instanceof X.C38971ri
            if (r0 != 0) goto L_0x00c6
            boolean r0 = r13 instanceof X.C39231s8
            if (r0 != 0) goto L_0x00c6
            r7 = 1
            X.0rv r9 = r5.A00
            boolean r0 = X.C16030sJ.A0L(r9)
            r6 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0047
            X.0sG r0 = r12.A00
            X.0sH r0 = r0.A08(r9)
            if (r0 == 0) goto L_0x00c6
            int r0 = r0.A01
            if (r0 <= 0) goto L_0x00c6
            r13.A0T(r0)
            goto L_0x00c6
        L_0x0047:
            boolean r0 = r9 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00c6
            X.0rt r0 = r12.A03
            X.0rx r0 = r0.A06(r9)
            if (r0 == 0) goto L_0x007d
            X.1WV r8 = r0.A0X
            r3 = 2
            int r11 = r8.expiration
            if (r11 > 0) goto L_0x0062
            long r0 = r8.ephemeralSettingTimestamp
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c6
        L_0x0062:
            r13.A0T(r11)
            long r0 = r8.ephemeralSettingTimestamp
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r13.A0i(r0)
            int r0 = r8.disappearingMessagesInitiator
            if (r0 != r3) goto L_0x0075
            r13.A00 = r3
            goto L_0x00c6
        L_0x0075:
            if (r0 != r7) goto L_0x007a
            r13.A00 = r7
            goto L_0x00c6
        L_0x007a:
            r13.A00 = r6
            goto L_0x00c6
        L_0x007d:
            X.0wx r1 = r12.A07
            com.whatsapp.jid.UserJid r0 = r1.A02(r9)
            if (r0 == 0) goto L_0x00c6
            int r3 = r1.A00(r0)
            long r1 = r1.A01(r0)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0094
            r8 = 2
        L_0x0094:
            r13.A0T(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r13.A0i(r0)
            r13.A00 = r8
            goto L_0x00c6
        L_0x00a1:
            int r1 = r13.A04
            if (r1 <= 0) goto L_0x00c6
            X.10R r0 = r12.A01
            boolean r0 = r0.A01(r1)
            if (r0 != 0) goto L_0x00c6
            X.0rt r2 = r12.A03
            X.0sG r1 = r12.A00
            X.0rv r0 = r5.A00
            X.AnonymousClass00B.A06(r0)
            int r0 = X.C40491uD.A00(r1, r2, r0)
            r13.A0T(r0)
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r13.A0i(r0)
        L_0x00c6:
            int r0 = r13.A04
            if (r0 <= 0) goto L_0x00d5
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r14 = r14 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r13.A0Z = r0
        L_0x00d5:
            java.lang.Long r2 = r13.A0Y
            if (r2 != 0) goto L_0x00df
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x00df:
            X.0pd r3 = r12.A08
            r1 = 2561(0xa01, float:3.589E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x017e
            if (r4 != 0) goto L_0x017e
            X.0rv r4 = r5.A00
            if (r4 == 0) goto L_0x018b
            X.0rt r0 = r12.A03
            X.0rx r6 = r0.A06(r4)
            if (r6 == 0) goto L_0x018b
            X.0sG r5 = r12.A00
            boolean r0 = X.C40491uD.A07(r5, r0, r13)
            if (r0 == 0) goto L_0x018b
            X.1uE r3 = new X.1uE
            r3.<init>()
            X.0w3 r1 = r12.A0A
            java.lang.String r0 = r4.getRawString()
            java.lang.String r0 = r1.A03(r0)
            r3.A07 = r0
            X.1WV r0 = r6.A0X
            int r0 = r0.expiration
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            int r0 = r13.A04
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A03 = r0
            boolean r1 = X.C16030sJ.A0L(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A00 = r0
            if (r1 == 0) goto L_0x0186
            X.0sO r1 = r12.A04
            r0 = r4
            X.0sN r0 = (X.C16060sN) r0
            int r0 = r1.A01(r0)
            int r0 = X.C40511uF.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
            X.0rv r0 = r13.A0B()
            if (r0 == 0) goto L_0x015a
            X.0sH r0 = r5.A08(r0)
        L_0x014f:
            if (r0 == 0) goto L_0x015a
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A04 = r0
        L_0x015a:
            X.0wx r0 = r12.A07
            java.lang.Integer r0 = r0.A04()
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A06 = r0
            X.10R r0 = r12.A01
            boolean r0 = r0.A02(r4)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            X.0t9 r0 = r12.A09
            r0.A06(r3)
        L_0x017e:
            int r4 = r13.A04
            long r2 = r2.longValue()
            goto L_0x0011
        L_0x0186:
            X.0sH r0 = r5.A08(r4)
            goto L_0x014f
        L_0x018b:
            X.0sq r3 = r12.A0B
            r1 = 31
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r12, r1, r13)
            r3.Acl(r0)
            goto L_0x017e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass182.A02(X.0tZ, long):X.1WV");
    }

    public void A03(int i2, String str, long j2) {
        C16800tf A022 = this.A05.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("chat_jid", str);
            contentValues.put("last_sync_response_sent_timestamp", Long.valueOf(j2));
            contentValues.put("no_of_retries_sent_already", Integer.valueOf(i2));
            A022.A02.A06(contentValues, "message_ephemeral_sync_response", 5);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A04(C16740tZ r6) {
        C16800tf A022 = this.A05.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(r6.A13));
            contentValues.put("duration", Integer.valueOf(r6.A04));
            Long l2 = r6.A0Z;
            AnonymousClass00B.A06(l2);
            contentValues.put("expire_timestamp", l2);
            A022.A02.A02(contentValues, "message_ephemeral");
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A05(C16740tZ r8) {
        boolean z2 = false;
        if (r8.A04 > 0) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        C16800tf A022 = this.A05.A02();
        try {
            A022.A02.A0C("UPDATE message_ephemeral SET keep_in_chat=?  WHERE message_row_id =? ", new Object[]{Integer.valueOf(r8.A06()), Long.valueOf(r8.A13)});
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
