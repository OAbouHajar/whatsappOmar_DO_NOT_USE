package X;

import android.database.Cursor;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Sn  reason: invalid class name and case insensitive filesystem */
public class C27631Sn {
    public final C16040sK A00;
    public final C16440t3 A01;
    public final AnonymousClass126 A02;
    public final C16820th A03;
    public final C18910xS A04;
    public final C16920ts A05;
    public final C15810rt A06;
    public final C16460t6 A07;
    public final AnonymousClass182 A08;
    public final AnonymousClass188 A09;
    public final AnonymousClass183 A0A;
    public final AnonymousClass185 A0B;
    public final AnonymousClass17E A0C;
    public final C17610vM A0D;
    public final C216314v A0E;
    public final AnonymousClass17G A0F;
    public final AnonymousClass17H A0G;
    public final C221816y A0H;
    public final C17400v1 A0I;
    public final C19150xq A0J;
    public final C16900tq A0K;
    public final C223117l A0L;
    public final AnonymousClass186 A0M;
    public final AnonymousClass1HF A0N;
    public final C224117v A0O;
    public final AnonymousClass11G A0P;
    public final C224517z A0Q;
    public final C18860xN A0R;
    public final C223217m A0S;
    public final AnonymousClass15G A0T;
    public final C24811Hj A0U;
    public final C14710pd A0V;
    public final C16490t9 A0W;
    public final C209212c A0X;
    public final C222517f A0Y;
    public final C222617g A0Z;
    public final AnonymousClass18A A0a;
    public final Object A0b = new Object();

    public C27631Sn(C16040sK r2, C16440t3 r3, AnonymousClass126 r4, C16820th r5, C18910xS r6, C16920ts r7, C15810rt r8, C16460t6 r9, AnonymousClass182 r10, AnonymousClass188 r11, AnonymousClass183 r12, AnonymousClass185 r13, AnonymousClass17E r14, C17610vM r15, C216314v r16, AnonymousClass17G r17, AnonymousClass17H r18, C221816y r19, C17400v1 r20, C19150xq r21, C16900tq r22, C223117l r23, AnonymousClass186 r24, AnonymousClass1HF r25, C224117v r26, AnonymousClass11G r27, C224517z r28, C18860xN r29, C223217m r30, AnonymousClass15G r31, C24811Hj r32, C14710pd r33, C16490t9 r34, C209212c r35, C222517f r36, C222617g r37, AnonymousClass18A r38) {
        this.A01 = r3;
        this.A0V = r33;
        this.A0E = r16;
        this.A05 = r7;
        this.A00 = r2;
        this.A06 = r8;
        this.A0W = r34;
        this.A04 = r6;
        this.A0P = r27;
        this.A0Y = r36;
        this.A0C = r14;
        this.A0N = r25;
        this.A0Z = r37;
        this.A07 = r9;
        this.A0F = r17;
        this.A0J = r21;
        this.A0L = r23;
        this.A0S = r30;
        this.A02 = r4;
        this.A03 = r5;
        this.A0T = r31;
        this.A0G = r18;
        this.A0K = r22;
        this.A0O = r26;
        this.A0X = r35;
        this.A0I = r20;
        this.A0Q = r28;
        this.A0A = r12;
        this.A0R = r29;
        this.A08 = r10;
        this.A0U = r32;
        this.A0D = r15;
        this.A0B = r13;
        this.A0M = r24;
        this.A09 = r11;
        this.A0H = r19;
        this.A0a = r38;
    }

    public AnonymousClass2EB A00(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean z2 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("from_me")) > 0) {
            z2 = true;
        }
        C15830rv A052 = this.A05.A05(cursor.getLong(cursor.getColumnIndexOrThrow("chat_row_id")));
        if (A052 == null) {
            return null;
        }
        cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        C28381Vw r6 = new C28381Vw(A052, string, z2);
        Class<C15830rv> cls = C15830rv.class;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("sender_jid_row_id");
        C15830rv r4 = (C15830rv) (cursor.isNull(columnIndexOrThrow) ? null : this.A0E.A07(cls, cursor.getLong(columnIndexOrThrow)));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("message_type"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("revoked_key_id"));
        Class<UserJid> cls2 = UserJid.class;
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("admin_jid_row_id");
        return new AnonymousClass2EB(r4, (UserJid) (cursor.isNull(columnIndexOrThrow2) ? null : this.A0E.A07(cls2, cursor.getLong(columnIndexOrThrow2))), r6, string2, cursor.getBlob(cursor.getColumnIndexOrThrow("orphan_message_data")), i2, cursor.getInt(cursor.getColumnIndexOrThrow("retry_count")), j2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0116 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x011b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass2EB r19) {
        /*
            r18 = this;
            r7 = r19
            X.1Vw r4 = r7.A05
            r9 = r18
            X.0ts r11 = r9.A05
            X.0rv r10 = r4.A00
            X.AnonymousClass00B.A06(r10)
            long r0 = r11.A02(r10)
            java.lang.String r17 = java.lang.Long.toString(r0)
            X.0rv r12 = r7.A03
            if (r12 != 0) goto L_0x0022
            java.lang.String r16 = ""
        L_0x001b:
            X.0tq r0 = r9.A0K
            X.0tf r3 = r0.get()
            goto L_0x002d
        L_0x0022:
            X.14v r0 = r9.A0E
            long r0 = r0.A01(r12)
            java.lang.String r16 = java.lang.Long.toString(r0)
            goto L_0x001b
        L_0x002d:
            X.1cj r15 = r3.A00()     // Catch:{ all -> 0x011c }
            X.0tg r6 = r3.A02     // Catch:{ all -> 0x0117 }
            java.lang.String r8 = "SELECT _id, key_id, from_me, chat_row_id, sender_jid_row_id, timestamp, message_type, revoked_key_id, retry_count, admin_jid_row_id, orphan_message_data  FROM message_orphaned_edit WHERE key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?"
            r0 = 4
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0117 }
            java.lang.String r1 = r4.A01     // Catch:{ all -> 0x0117 }
            r14 = 0
            r5[r14] = r1     // Catch:{ all -> 0x0117 }
            boolean r2 = r4.A02     // Catch:{ all -> 0x0117 }
            r13 = 1
            r0 = 0
            if (r2 == 0) goto L_0x0044
            r0 = 1
        L_0x0044:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0117 }
            r5[r13] = r0     // Catch:{ all -> 0x0117 }
            r0 = 2
            r5[r0] = r17     // Catch:{ all -> 0x0117 }
            r0 = 3
            r5[r0] = r16     // Catch:{ all -> 0x0117 }
            android.database.Cursor r5 = r6.A08(r8, r5)     // Catch:{ all -> 0x0117 }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x0110 }
            r8 = 0
            if (r0 == 0) goto L_0x0069
            X.2EB r0 = r9.A00(r5)     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0069
            int r0 = r0.A01     // Catch:{ all -> 0x0110 }
            if (r0 != r13) goto L_0x00ef
            int r0 = r7.A01     // Catch:{ all -> 0x0110 }
            if (r0 != 0) goto L_0x00ef
        L_0x0069:
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0110 }
            r4.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "key_id"
            r4.put(r0, r1)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "from_me"
            if (r2 == 0) goto L_0x0078
            r14 = 1
        L_0x0078:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0110 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0110 }
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x0110 }
            long r10 = r11.A02(r10)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "chat_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0110 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = "sender_jid_row_id"
            if (r12 != 0) goto L_0x0097
            r0 = 0
            goto L_0x009d
        L_0x0097:
            X.14v r0 = r9.A0E     // Catch:{ all -> 0x0110 }
            long r0 = r0.A01(r12)     // Catch:{ all -> 0x0110 }
        L_0x009d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0110 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = "timestamp"
            long r0 = r7.A02     // Catch:{ all -> 0x0110 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0110 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "message_type"
            int r0 = r7.A01     // Catch:{ all -> 0x0110 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0110 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "revoked_key_id"
            java.lang.String r0 = r7.A06     // Catch:{ all -> 0x0110 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "retry_count"
            int r0 = r7.A00     // Catch:{ all -> 0x0110 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0110 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = "admin_jid_row_id"
            com.whatsapp.jid.UserJid r1 = r7.A04     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x00df
            X.14v r0 = r9.A0E     // Catch:{ all -> 0x0110 }
            long r0 = r0.A01(r1)     // Catch:{ all -> 0x0110 }
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0110 }
        L_0x00df:
            r4.put(r2, r8)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "orphan_message_data"
            byte[] r0 = r7.A07     // Catch:{ all -> 0x0110 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "message_orphaned_edit"
            r6.A04(r4, r0)     // Catch:{ all -> 0x0110 }
            goto L_0x0103
        L_0x00ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r1.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "EditMessageStore/storeOrphanedEditMessage/skipping-edit-store old message exists; msg.key="
            r1.append(r0)     // Catch:{ all -> 0x0110 }
            r1.append(r4)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0110 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0110 }
        L_0x0103:
            r15.A00()     // Catch:{ all -> 0x0110 }
            r5.close()     // Catch:{ all -> 0x0117 }
            r15.close()     // Catch:{ all -> 0x011c }
            r3.close()
            return
        L_0x0110:
            r0 = move-exception
            if (r5 == 0) goto L_0x0116
            r5.close()     // Catch:{ all -> 0x0116 }
        L_0x0116:
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x011b }
        L_0x011b:
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0120 }
        L_0x0120:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27631Sn.A01(X.2EB):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        if (r3 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0123, code lost:
        if (r5.A1D == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a7, code lost:
        if (r3.A08() != 1) goto L_0x01a9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:252:0x0898 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:263:0x08a7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:268:0x08ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:273:0x08b1 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0247 A[Catch:{ all -> 0x0894, all -> 0x0898, all -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x037b A[Catch:{ all -> 0x0894, all -> 0x0898, all -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x046b A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x059d A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0633 A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0653 A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x06a9 A[SYNTHETIC, Splitter:B:165:0x06a9] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0739 A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x075b A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0784 A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x07ef A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e5 A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fa A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0207 A[Catch:{ all -> 0x08ad, all -> 0x08b1, all -> 0x08b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C38831rU r28, int r29, boolean r30, boolean r31) {
        /*
            r27 = this;
            r5 = r28
            java.lang.String r2 = r5.A01
            if (r2 != 0) goto L_0x0026
            java.lang.String r0 = "msgstore/revoke/missing-old-id "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r5.A11
            r1.append(r0)
            java.lang.String r0 = " from="
            r1.append(r0)
            X.0rv r0 = r5.A0B()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0025:
            return
        L_0x0026:
            X.1Vw r9 = r5.A11
            X.0rv r1 = r9.A00
            boolean r0 = r9.A02
            X.1Vw r7 = new X.1Vw
            r7.<init>(r1, r2, r0)
            r6 = r27
            X.0sK r0 = r6.A00
            r26 = r0
            boolean r16 = X.C38621r6.A0V(r0, r5)
            byte r2 = r5.A10
            r0 = 64
            r4 = 0
            r1 = 1
            r11 = 0
            if (r2 != r0) goto L_0x0045
            r11 = 1
        L_0x0045:
            X.0th r10 = r6.A03
            X.0tZ r8 = r10.A03(r9)
            if (r8 == 0) goto L_0x006b
            java.lang.String r0 = "msgstore/revoking/has-placeholder "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            X.1Vw r0 = r8.A11
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            boolean r0 = X.C41061vA.A0I(r8)
            if (r0 == 0) goto L_0x086d
            X.0t6 r0 = r6.A07
            r0.A0g(r8, r1, r4)
        L_0x006b:
            X.0tZ r3 = r10.A03(r7)
            if (r3 != 0) goto L_0x008c
            X.0v1 r0 = r6.A0I
            android.database.Cursor r7 = r0.A00(r7)
            if (r7 == 0) goto L_0x085a
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x088f }
            if (r0 == 0) goto L_0x0087
            X.0t6 r0 = r6.A07     // Catch:{ all -> 0x088f }
            X.0th r0 = r0.A0K     // Catch:{ all -> 0x088f }
            X.0tZ r3 = r0.A01(r7)     // Catch:{ all -> 0x088f }
        L_0x0087:
            r7.close()
            if (r3 == 0) goto L_0x085a
        L_0x008c:
            X.1sC r0 = r3.A0G()
            if (r0 == 0) goto L_0x009c
            X.1sC r0 = r3.A0G()
            X.1Vw r0 = r0.A02
            java.lang.String r0 = r0.A01
            r5.A01 = r0
        L_0x009c:
            X.0rv r7 = r3.A0B()
            X.0rv r0 = r5.A0B()
            boolean r0 = X.C34901l3.A00(r7, r0)
            if (r0 != 0) goto L_0x00ac
            if (r11 == 0) goto L_0x085a
        L_0x00ac:
            X.1Vw r0 = r3.A11
            r25 = r0
            X.0rv r0 = r0.A00
            r24 = r0
            boolean r17 = X.C16030sJ.A0Q(r24)
            if (r17 == 0) goto L_0x00ec
            r0 = r25
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r3 instanceof X.C16730tY
            if (r0 == 0) goto L_0x00cc
            X.12c r2 = r6.A0X
            r0 = r3
            X.0tY r0 = (X.C16730tY) r0
            r2.A0B(r0, r4, r4)
        L_0x00cc:
            X.0t6 r0 = r6.A07
            r0.A0g(r3, r1, r1)
            X.17f r0 = r6.A0Y
            r0.A03(r5)
            X.17E r0 = r6.A0C
            android.os.Handler r2 = r0.A01
            r1 = 27
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r6, r1, r3)
            r2.post(r0)
        L_0x00e4:
            X.17H r1 = r6.A0G
            r0 = r25
            r1.A03(r0)
            return
        L_0x00ec:
            boolean r0 = X.C38621r6.A0o(r5)
            if (r0 == 0) goto L_0x00e4
            long r0 = r5.A0I
            long r7 = r3.A0I
            long r0 = r0 - r7
            boolean r8 = r3 instanceof X.C38831rU
            r10 = 259200000(0xf731400, double:1.280618154E-315)
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r11 = 0
            if (r7 <= 0) goto L_0x0102
            r11 = 1
        L_0x0102:
            java.lang.String r0 = r3.A0n
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r10 = r0 ^ 1
            r0 = r25
            boolean r7 = r0.A02
            if (r7 == 0) goto L_0x0125
            r0 = 64
            if (r2 != r0) goto L_0x0140
            r0 = r5
            X.1s1 r0 = (X.C39161s1) r0
            com.whatsapp.jid.UserJid r1 = r0.A00
            r0 = r26
            boolean r0 = r0.A0I(r1)
            if (r0 == 0) goto L_0x0125
            boolean r0 = r5.A1D
            if (r0 == 0) goto L_0x0140
        L_0x0125:
            if (r10 != 0) goto L_0x013a
            if (r11 != 0) goto L_0x0134
            if (r8 == 0) goto L_0x0140
            X.17f r1 = r6.A0Y
            java.lang.String r0 = "revoke-drop-terminal"
        L_0x0130:
            r1.A06(r5, r0)
            goto L_0x00e4
        L_0x0134:
            X.17f r1 = r6.A0Y
            java.lang.String r0 = "revoke-drop-old"
            goto L_0x0130
        L_0x013a:
            X.17f r1 = r6.A0Y
            java.lang.String r0 = "revoke-drop-payment"
            goto L_0x0130
        L_0x0140:
            boolean r0 = r5 instanceof X.C38821rT
            if (r0 == 0) goto L_0x01d1
            long r0 = r5.A0I
            X.1rT r2 = new X.1rT
            r2.<init>(r9, r5, r0)
        L_0x014b:
            long r0 = r3.A0I
            r2.A0I = r0
            long r0 = r5.A0G
            r2.A0G = r0
            long r0 = r5.A16
            r2.A16 = r0
            long r0 = r3.A13
            r2.A13 = r0
            long r0 = r3.A14
            r2.A14 = r0
            java.lang.String r0 = r3.A0m
            r2.A0m = r0
            r0 = 1
            r2.A0X(r0)
            int r0 = r3.A04
            r2.A0T(r0)
            java.lang.Long r0 = r3.A0Z
            r2.A0Z = r0
            r2.A06 = r4
            boolean r0 = r5.A1D
            if (r0 == 0) goto L_0x0179
            r0 = 1
            r2.A1D = r0
        L_0x0179:
            long r0 = r5.A00
            r2.A00 = r0
            X.0rv r0 = r3.A0B()
            r2.A0b(r0)
            X.1Vw r13 = r2.A11
            X.0rv r0 = r13.A00
            r23 = r0
            r1 = r26
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x01c7
            r0 = 13
        L_0x0194:
            r2.A0W(r0)
        L_0x0197:
            java.lang.String r15 = "message_row_id=?"
            java.lang.String r7 = "message_row_id = ?"
            int r0 = r2.A08()
            r8 = 1
            if (r0 != r8) goto L_0x01a9
            int r1 = r3.A08()
            r0 = 1
            if (r1 == r8) goto L_0x01aa
        L_0x01a9:
            r0 = 0
        L_0x01aa:
            X.AnonymousClass00B.A0F(r0)
            int r0 = r3.A06()
            if (r0 != r8) goto L_0x01be
            int r0 = r3.A04
            if (r0 <= 0) goto L_0x01be
            r3.A06 = r4
            X.182 r0 = r6.A08
            r0.A05(r3)
        L_0x01be:
            X.0tq r0 = r6.A0K
            r22 = r0
            X.0tf r19 = r22.A02()
            goto L_0x01dd
        L_0x01c7:
            boolean r0 = r2.A1D
            if (r0 != 0) goto L_0x01cf
            if (r7 == 0) goto L_0x0197
            if (r16 == 0) goto L_0x0197
        L_0x01cf:
            r0 = 4
            goto L_0x0194
        L_0x01d1:
            r8 = r5
            X.1s1 r8 = (X.C39161s1) r8
            long r0 = r8.A0I
            X.1s1 r2 = new X.1s1
            r2.<init>(r9, r8, r0)
            goto L_0x014b
        L_0x01dd:
            X.1cj r18 = r19.A00()     // Catch:{ all -> 0x08b2 }
            boolean r0 = r3 instanceof X.C16730tY     // Catch:{ all -> 0x08ad }
            if (r0 == 0) goto L_0x01f4
            r1 = r3
            X.0tY r1 = (X.C16730tY) r1     // Catch:{ all -> 0x08ad }
            X.12c r0 = r6.A0X     // Catch:{ all -> 0x08ad }
            r0.A0B(r1, r8, r4)     // Catch:{ all -> 0x08ad }
            X.0t6 r0 = r6.A07     // Catch:{ all -> 0x08ad }
            r9 = r31
            r0.A0j(r1, r9, r4)     // Catch:{ all -> 0x08ad }
        L_0x01f4:
            X.0tm r0 = r3.A0F()     // Catch:{ all -> 0x08ad }
            if (r0 == 0) goto L_0x01ff
            X.0xN r0 = r6.A0R     // Catch:{ all -> 0x08ad }
            r0.A01(r3)     // Catch:{ all -> 0x08ad }
        L_0x01ff:
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = r3.A10(r0)     // Catch:{ all -> 0x08ad }
            if (r0 == 0) goto L_0x020e
            X.186 r9 = r6.A0M     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            r9.A01(r0)     // Catch:{ all -> 0x08ad }
        L_0x020e:
            X.15G r9 = r6.A0T     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            X.1Py r9 = r9.A0G     // Catch:{ all -> 0x08ad }
            X.0tq r9 = r9.A02     // Catch:{ all -> 0x08ad }
            X.0tf r9 = r9.A02()     // Catch:{ all -> 0x08ad }
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08a8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08a8 }
            r10[r4] = r0     // Catch:{ all -> 0x08a8 }
            java.lang.String r11 = "message_add_on.parent_message_row_id = ?"
            X.0tg r1 = r9.A02     // Catch:{ all -> 0x08a8 }
            java.lang.String r0 = "message_add_on"
            r1.A01(r0, r11, r10)     // Catch:{ all -> 0x08a8 }
            r9.close()     // Catch:{ all -> 0x08ad }
            X.17G r10 = r6.A0F     // Catch:{ all -> 0x08ad }
            X.0tq r0 = r10.A05     // Catch:{ all -> 0x08ad }
            r21 = r0
            X.0tf r9 = r21.A02()     // Catch:{ all -> 0x08ad }
            X.1cj r20 = r9.A00()     // Catch:{ all -> 0x08a8 }
            r21.A04()     // Catch:{ all -> 0x08a3 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x08a3 }
            boolean r0 = r0.A0D(r9)     // Catch:{ all -> 0x08a3 }
            if (r0 == 0) goto L_0x0375
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x08a3 }
            r12.<init>()     // Catch:{ all -> 0x08a3 }
            java.lang.String r1 = r13.A01     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "key_id"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            r0 = 0
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "starred"
            r12.put(r0, r11)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "receipt_server_timestamp"
            r12.put(r0, r11)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "receipt_device_timestamp"
            r12.put(r0, r11)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "read_device_timestamp"
            r12.put(r0, r11)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "played_device_timestamp"
            r12.put(r0, r11)     // Catch:{ all -> 0x08a3 }
            long r0 = r2.A0G     // Catch:{ all -> 0x08a3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "received_timestamp"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            int r0 = r2.A0C     // Catch:{ all -> 0x08a3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "status"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "needs_push"
            r12.put(r0, r14)     // Catch:{ all -> 0x08a3 }
            X.C38611r4.A02(r12, r2)     // Catch:{ all -> 0x08a3 }
            long r0 = r2.A0I     // Catch:{ all -> 0x08a3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "timestamp"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "media_url"
            r12.putNull(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "media_mime_type"
            r12.putNull(r0)     // Catch:{ all -> 0x08a3 }
            byte r0 = r2.A10     // Catch:{ all -> 0x08a3 }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "media_wa_type"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            long r0 = r2.A00     // Catch:{ all -> 0x08a3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "media_size"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            java.lang.String r1 = r2.A01     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "media_name"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            java.lang.String r1 = r2.A0J()     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "media_caption"
            X.C38611r4.A04(r12, r0, r1)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "media_hash"
            r12.putNull(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "media_duration"
            r12.put(r0, r11)     // Catch:{ all -> 0x08a3 }
            int r0 = r2.A08     // Catch:{ all -> 0x08a3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "origin"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "latitude"
            r12.put(r0, r14)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "longitude"
            r12.put(r0, r14)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "mentioned_jids"
            r12.putNull(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "thumb_image"
            r12.putNull(r0)     // Catch:{ all -> 0x08a3 }
            int r0 = r2.A01     // Catch:{ all -> 0x08a3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "edit_version"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "media_enc_hash"
            r12.putNull(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "payment_transaction_id"
            r12.putNull(r0)     // Catch:{ all -> 0x08a3 }
            int r0 = r2.A07()     // Catch:{ all -> 0x08a3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "forwarded"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            int r0 = r2.A05()     // Catch:{ all -> 0x08a3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "preview_type"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "quoted_row_id"
            r12.put(r0, r14)     // Catch:{ all -> 0x08a3 }
            long r0 = r2.A0A()     // Catch:{ all -> 0x08a3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "lookup_tables"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "future_message_type"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            int r0 = r2.A07     // Catch:{ all -> 0x08a3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = "message_add_on_flags"
            r12.put(r0, r1)     // Catch:{ all -> 0x08a3 }
            r0 = 3
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ all -> 0x08a3 }
            X.AnonymousClass00B.A06(r23)     // Catch:{ all -> 0x08a3 }
            java.lang.String r0 = r23.getRawString()     // Catch:{ all -> 0x08a3 }
            r14[r4] = r0     // Catch:{ all -> 0x08a3 }
            boolean r0 = r13.A02     // Catch:{ all -> 0x08a3 }
            if (r0 == 0) goto L_0x0380
            java.lang.String r0 = "1"
        L_0x0363:
            r14[r8] = r0     // Catch:{ all -> 0x08a3 }
            r1 = 2
            r0 = r25
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x08a3 }
            r14[r1] = r0     // Catch:{ all -> 0x08a3 }
            X.0tg r11 = r9.A02     // Catch:{ all -> 0x08a3 }
            java.lang.String r1 = "messages"
            java.lang.String r0 = "key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
            r11.A00(r1, r12, r0, r14)     // Catch:{ all -> 0x08a3 }
        L_0x0375:
            boolean r0 = r10.A08()     // Catch:{ all -> 0x08a3 }
            if (r0 == 0) goto L_0x0459
            X.0tf r12 = r21.A02()     // Catch:{ all -> 0x08a3 }
            goto L_0x0383
        L_0x0380:
            java.lang.String r0 = "0"
            goto L_0x0363
        L_0x0383:
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0894 }
            r11.<init>()     // Catch:{ all -> 0x0894 }
            java.lang.String r1 = r13.A01     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "key_id"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "starred"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            int r0 = r2.A0C     // Catch:{ all -> 0x0894 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "status"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "broadcast"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            java.lang.String r1 = r2.A0m     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "participant_hash"
            X.C38611r4.A04(r11, r0, r1)     // Catch:{ all -> 0x0894 }
            int r0 = r2.A07()     // Catch:{ all -> 0x0894 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "origination_flags"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            int r0 = r2.A08     // Catch:{ all -> 0x0894 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "origin"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            long r0 = r2.A0I     // Catch:{ all -> 0x0894 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "timestamp"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            long r0 = r2.A0G     // Catch:{ all -> 0x0894 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "received_timestamp"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            long r0 = r2.A0H     // Catch:{ all -> 0x0894 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "receipt_server_timestamp"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            byte r0 = r2.A10     // Catch:{ all -> 0x0894 }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "message_type"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "text_data"
            r11.putNull(r0)     // Catch:{ all -> 0x0894 }
            long r0 = r2.A0A()     // Catch:{ all -> 0x0894 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "lookup_tables"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            int r0 = r2.A07     // Catch:{ all -> 0x0894 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "message_add_on_flags"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            long r0 = r2.A14     // Catch:{ all -> 0x0894 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = "sort_id"
            r11.put(r0, r1)     // Catch:{ all -> 0x0894 }
            r0 = 3
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ all -> 0x0894 }
            X.0ts r1 = r10.A03     // Catch:{ all -> 0x0894 }
            X.AnonymousClass00B.A06(r23)     // Catch:{ all -> 0x0894 }
            r0 = r23
            long r0 = r1.A02(r0)     // Catch:{ all -> 0x0894 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0894 }
            r14[r4] = r0     // Catch:{ all -> 0x0894 }
            boolean r0 = r13.A02     // Catch:{ all -> 0x0894 }
            if (r0 == 0) goto L_0x0453
            java.lang.String r0 = "1"
        L_0x0440:
            r14[r8] = r0     // Catch:{ all -> 0x0894 }
            r1 = 2
            r0 = r25
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0894 }
            r14[r1] = r0     // Catch:{ all -> 0x0894 }
            X.0tg r10 = r12.A02     // Catch:{ all -> 0x0894 }
            java.lang.String r1 = "message"
            java.lang.String r0 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            r10.A00(r1, r11, r0, r14)     // Catch:{ all -> 0x0894 }
            goto L_0x0456
        L_0x0453:
            java.lang.String r0 = "0"
            goto L_0x0440
        L_0x0456:
            r12.close()     // Catch:{ all -> 0x08a3 }
        L_0x0459:
            r20.A00()     // Catch:{ all -> 0x08a3 }
            r20.close()     // Catch:{ all -> 0x08a8 }
            r9.close()     // Catch:{ all -> 0x08ad }
            X.17v r0 = r6.A0O     // Catch:{ all -> 0x08ad }
            r0.A00(r2)     // Catch:{ all -> 0x08ad }
            boolean r0 = r3 instanceof X.C30591cd     // Catch:{ all -> 0x08ad }
            if (r0 == 0) goto L_0x0487
            X.17z r9 = r6.A0Q     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            X.0tq r9 = r9.A01     // Catch:{ all -> 0x08ad }
            X.0tf r11 = r9.A02()     // Catch:{ all -> 0x08ad }
            X.0tg r12 = r11.A02     // Catch:{ all -> 0x089e }
            java.lang.String r10 = "message_template"
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x089e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x089e }
            r9[r4] = r0     // Catch:{ all -> 0x089e }
            r12.A01(r10, r7, r9)     // Catch:{ all -> 0x089e }
            r11.close()     // Catch:{ all -> 0x08ad }
        L_0x0487:
            r0 = r19
            X.0tg r9 = r0.A02     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_media"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_streaming_sidecar"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "mms_thumbnail_metadata"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "audio_data"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_location"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_template"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_template_button"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_quoted"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_mentions"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_product"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r15, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_link"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_future"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r12 = "message_system"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ad }
            r1.<init>()     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = "message_row_id"
            r1.append(r0)     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = " = ?"
            r1.append(r0)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x08ad }
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r12, r11, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_text"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_send_count"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            java.lang.String r11 = "message_ephemeral_setting"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r11, r7, r10)     // Catch:{ all -> 0x08ad }
            r22.A04()     // Catch:{ all -> 0x08ad }
            r0 = r22
            X.1jC r10 = r0.A04     // Catch:{ all -> 0x08ad }
            r0 = r19
            boolean r0 = r10.A0D(r0)     // Catch:{ all -> 0x08ad }
            if (r0 == 0) goto L_0x05bd
            java.lang.String r12 = "messages_links"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r11[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r12, r7, r11)     // Catch:{ all -> 0x08ad }
            java.lang.String r14 = "messages_fts"
            java.lang.String r12 = "docid=?"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x08ad }
            r11[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r14, r12, r11)     // Catch:{ all -> 0x08ad }
        L_0x05bd:
            java.lang.String r14 = "message_ftsv2"
            java.lang.String r12 = "docid = ?"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x08ad }
            r11[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r14, r12, r11)     // Catch:{ all -> 0x08ad }
            java.lang.String r12 = "played_self_receipt"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r11[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r12, r15, r11)     // Catch:{ all -> 0x08ad }
            java.lang.String r12 = "message_poll"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r11[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r12, r15, r11)     // Catch:{ all -> 0x08ad }
            java.lang.String r12 = "message_secret"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r11[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r12, r15, r11)     // Catch:{ all -> 0x08ad }
            java.lang.String r12 = "message_view_once_media"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r11[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r12, r15, r11)     // Catch:{ all -> 0x08ad }
            X.0vM r0 = r6.A0D     // Catch:{ all -> 0x08ad }
            long r14 = r3.A13     // Catch:{ all -> 0x08ad }
            X.0tq r0 = r0.A00     // Catch:{ all -> 0x08ad }
            r20 = r0
            X.0tf r11 = r20.A02()     // Catch:{ all -> 0x08ad }
            X.0tg r12 = r11.A02     // Catch:{ all -> 0x089e }
            java.lang.String r1 = "DELETE FROM message_ui_elements WHERE message_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ all -> 0x089e }
            java.lang.String r14 = java.lang.Long.toString(r14)     // Catch:{ all -> 0x089e }
            r0[r4] = r14     // Catch:{ all -> 0x089e }
            r12.A0C(r1, r0)     // Catch:{ all -> 0x089e }
            r11.close()     // Catch:{ all -> 0x08ad }
            r22.A04()     // Catch:{ all -> 0x08ad }
            r0 = r19
            boolean r0 = r10.A0D(r0)     // Catch:{ all -> 0x08ad }
            if (r0 == 0) goto L_0x064a
            long r0 = r3.A0F     // Catch:{ all -> 0x08ad }
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x064a
            java.lang.String r12 = "messages_quotes"
            java.lang.String r11 = "_id = ?"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x08ad }
            r10[r4] = r0     // Catch:{ all -> 0x08ad }
            r9.A01(r12, r11, r10)     // Catch:{ all -> 0x08ad }
        L_0x064a:
            byte r9 = r3.A10     // Catch:{ all -> 0x08ad }
            r0 = 4
            if (r9 == r0) goto L_0x06a9
            r0 = 14
            if (r9 == r0) goto L_0x06a9
            r0 = 24
            if (r9 == r0) goto L_0x067f
            r0 = 44
            if (r9 == r0) goto L_0x0664
            r0 = 46
            if (r9 != r0) goto L_0x0731
            X.0tf r9 = r20.A02()     // Catch:{ all -> 0x08ad }
            goto L_0x0696
        L_0x0664:
            X.17l r0 = r6.A0L     // Catch:{ all -> 0x08ad }
            X.0tq r0 = r0.A01     // Catch:{ all -> 0x08ad }
            X.0tf r9 = r0.A02()     // Catch:{ all -> 0x08ad }
            X.0tg r12 = r9.A02     // Catch:{ all -> 0x08a8 }
            java.lang.String r11 = "message_order"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08a8 }
            long r0 = r3.A13     // Catch:{ all -> 0x08a8 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x08a8 }
            r10[r4] = r0     // Catch:{ all -> 0x08a8 }
            r12.A01(r11, r7, r10)     // Catch:{ all -> 0x08a8 }
            goto L_0x072e
        L_0x067f:
            X.185 r0 = r6.A0B     // Catch:{ all -> 0x08ad }
            X.0tq r0 = r0.A02     // Catch:{ all -> 0x08ad }
            X.0tf r9 = r0.A02()     // Catch:{ all -> 0x08ad }
            X.0tg r12 = r9.A02     // Catch:{ all -> 0x08a8 }
            java.lang.String r11 = "DELETE FROM message_group_invite WHERE message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08a8 }
            long r0 = r3.A13     // Catch:{ all -> 0x08a8 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x08a8 }
            r10[r4] = r0     // Catch:{ all -> 0x08a8 }
            goto L_0x06a4
        L_0x0696:
            X.0tg r12 = r9.A02     // Catch:{ all -> 0x08a8 }
            java.lang.String r11 = "DELETE FROM message_ui_elements_reply WHERE message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08a8 }
            long r0 = r3.A13     // Catch:{ all -> 0x08a8 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x08a8 }
            r10[r4] = r0     // Catch:{ all -> 0x08a8 }
        L_0x06a4:
            r12.A0C(r11, r10)     // Catch:{ all -> 0x08a8 }
            goto L_0x072e
        L_0x06a9:
            X.17m r1 = r6.A0S     // Catch:{ all -> 0x08ad }
            r0 = 4
            if (r9 == r0) goto L_0x06c4
            r0 = 14
            if (r9 == r0) goto L_0x06c4
            java.lang.String r1 = "VCardMessageStore/deleteVcardData attempted to deleteVcardData for non-contact message type="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ad }
            r0.<init>(r1)     // Catch:{ all -> 0x08ad }
            r0.append(r9)     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x08ad }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08ad }
            goto L_0x0731
        L_0x06c4:
            X.0tq r0 = r1.A09     // Catch:{ all -> 0x08ad }
            X.0tf r9 = r0.A02()     // Catch:{ all -> 0x08ad }
            X.1cj r14 = r9.A00()     // Catch:{ all -> 0x08a8 }
            r0.A04()     // Catch:{ all -> 0x0899 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x0899 }
            boolean r0 = r0.A0D(r9)     // Catch:{ all -> 0x0899 }
            if (r0 == 0) goto L_0x06f9
            X.0tg r11 = r9.A02     // Catch:{ all -> 0x0899 }
            java.lang.String r12 = "messages_vcards"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x0899 }
            long r0 = r3.A13     // Catch:{ all -> 0x0899 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0899 }
            r10[r4] = r0     // Catch:{ all -> 0x0899 }
            r11.A01(r12, r7, r10)     // Catch:{ all -> 0x0899 }
            java.lang.String r12 = "messages_vcards_jids"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x0899 }
            long r0 = r3.A13     // Catch:{ all -> 0x0899 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0899 }
            r10[r4] = r0     // Catch:{ all -> 0x0899 }
            r11.A01(r12, r7, r10)     // Catch:{ all -> 0x0899 }
        L_0x06f9:
            X.0tg r10 = r9.A02     // Catch:{ all -> 0x0899 }
            java.lang.String r12 = "message_vcard"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x0899 }
            long r0 = r3.A13     // Catch:{ all -> 0x0899 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0899 }
            r11[r4] = r0     // Catch:{ all -> 0x0899 }
            r10.A01(r12, r7, r11)     // Catch:{ all -> 0x0899 }
            java.lang.String r12 = "message_media_vcard_count"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x0899 }
            long r0 = r3.A13     // Catch:{ all -> 0x0899 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0899 }
            r11[r4] = r0     // Catch:{ all -> 0x0899 }
            r10.A01(r12, r7, r11)     // Catch:{ all -> 0x0899 }
            java.lang.String r12 = "message_vcard_jid"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x0899 }
            long r0 = r3.A13     // Catch:{ all -> 0x0899 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0899 }
            r11[r4] = r0     // Catch:{ all -> 0x0899 }
            r10.A01(r12, r7, r11)     // Catch:{ all -> 0x0899 }
            r14.A00()     // Catch:{ all -> 0x0899 }
            r14.close()     // Catch:{ all -> 0x08a8 }
        L_0x072e:
            r9.close()     // Catch:{ all -> 0x08ad }
        L_0x0731:
            r0 = 1024(0x400, float:1.435E-42)
            boolean r0 = r3.A10(r0)     // Catch:{ all -> 0x08ad }
            if (r0 == 0) goto L_0x0755
            X.188 r9 = r6.A09     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            X.0tq r9 = r9.A00     // Catch:{ all -> 0x08ad }
            X.0tf r9 = r9.A02()     // Catch:{ all -> 0x08ad }
            X.0tg r12 = r9.A02     // Catch:{ all -> 0x08a8 }
            java.lang.String r11 = "DELETE FROM message_external_ad_content WHERE message_row_id=?"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x08a8 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x08a8 }
            r10[r4] = r0     // Catch:{ all -> 0x08a8 }
            r12.A0C(r11, r10)     // Catch:{ all -> 0x08a8 }
            r9.close()     // Catch:{ all -> 0x08ad }
        L_0x0755:
            boolean r0 = r3.A10(r8)     // Catch:{ all -> 0x08ad }
            if (r0 == 0) goto L_0x0778
            X.183 r8 = r6.A0A     // Catch:{ all -> 0x08ad }
            long r0 = r3.A13     // Catch:{ all -> 0x08ad }
            X.0tq r8 = r8.A00     // Catch:{ all -> 0x08ad }
            X.0tf r9 = r8.A02()     // Catch:{ all -> 0x08ad }
            X.0tg r11 = r9.A02     // Catch:{ all -> 0x08a8 }
            java.lang.String r10 = "message_forwarded"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x08a8 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x08a8 }
            r8[r4] = r0     // Catch:{ all -> 0x08a8 }
            r11.A01(r10, r7, r8)     // Catch:{ all -> 0x08a8 }
            r9.close()     // Catch:{ all -> 0x08ad }
        L_0x0778:
            boolean r0 = r13.A02     // Catch:{ all -> 0x08ad }
            if (r0 != 0) goto L_0x07ef
            r0 = r26
            boolean r0 = X.C38621r6.A0T(r0, r2)     // Catch:{ all -> 0x08ad }
            if (r0 != 0) goto L_0x07ef
            X.17f r0 = r6.A0Y     // Catch:{ all -> 0x08ad }
            r0.A03(r5)     // Catch:{ all -> 0x08ad }
            X.0pd r5 = r6.A0V     // Catch:{ all -> 0x08ad }
            r1 = 1335(0x537, float:1.871E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x08ad }
            boolean r0 = r5.A0E(r0, r1)     // Catch:{ all -> 0x08ad }
            if (r0 == 0) goto L_0x07bc
            X.0xS r8 = r6.A04     // Catch:{ all -> 0x08ad }
            r1 = r24
            boolean r0 = r1.equals(r1)     // Catch:{ all -> 0x08ad }
            if (r0 != 0) goto L_0x07cb
            java.lang.String r0 = "msgstore/onMessageDeletedInChat/unequalchatjid/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ad }
            r1.<init>(r0)     // Catch:{ all -> 0x08ad }
            r0 = r24
            r1.append(r0)     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x08ad }
            r0 = r24
            r1.append(r0)     // Catch:{ all -> 0x08ad }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x08ad }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x08ad }
        L_0x07bc:
            r18.A00()     // Catch:{ all -> 0x08ad }
            r7 = 5
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r1 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1     // Catch:{ all -> 0x08ad }
            r1.<init>(r6, r3, r2, r7)     // Catch:{ all -> 0x08ad }
            r0 = r19
            r0.A03(r1)     // Catch:{ all -> 0x08ad }
            goto L_0x0826
        L_0x07cb:
            X.0rt r1 = r8.A0A     // Catch:{ all -> 0x08ad }
            r0 = r24
            X.0rx r7 = r1.A06(r0)     // Catch:{ all -> 0x08ad }
            if (r7 == 0) goto L_0x07bc
            X.10R r1 = r8.A08     // Catch:{ all -> 0x08ad }
            boolean r0 = r1.A04(r3)     // Catch:{ all -> 0x08ad }
            if (r0 != 0) goto L_0x07bc
            r1.A00(r7, r4)     // Catch:{ all -> 0x08ad }
            X.126 r5 = r8.A07     // Catch:{ all -> 0x08ad }
            r0 = 17
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r1 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ all -> 0x08ad }
            r1.<init>(r8, r0, r7)     // Catch:{ all -> 0x08ad }
            r0 = 55
            r5.A01(r1, r0)     // Catch:{ all -> 0x08ad }
            goto L_0x07bc
        L_0x07ef:
            if (r17 == 0) goto L_0x07fa
            X.0t6 r1 = r6.A07     // Catch:{ all -> 0x08ad }
            java.util.List r0 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x08ad }
            r1.A0l(r0)     // Catch:{ all -> 0x08ad }
        L_0x07fa:
            if (r16 != 0) goto L_0x07fd
            goto L_0x07ff
        L_0x07fd:
            r7 = 0
            goto L_0x080c
        L_0x07ff:
            X.17H r0 = r6.A0G     // Catch:{ all -> 0x08ad }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x08ad }
            r0.put(r13, r2)     // Catch:{ all -> 0x08ad }
            X.16y r0 = r6.A0H     // Catch:{ all -> 0x08ad }
            java.util.Set r7 = r0.A04(r2)     // Catch:{ all -> 0x08ad }
        L_0x080c:
            X.1HF r1 = r6.A0N     // Catch:{ all -> 0x08ad }
            r1.A01(r3)     // Catch:{ all -> 0x08ad }
            if (r7 == 0) goto L_0x081c
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x08ad }
            if (r0 != 0) goto L_0x081c
            r1.A02(r2, r7)     // Catch:{ all -> 0x08ad }
        L_0x081c:
            if (r30 == 0) goto L_0x07bc
            if (r16 == 0) goto L_0x07bc
            X.17f r0 = r6.A0Y     // Catch:{ all -> 0x08ad }
            r0.A03(r5)     // Catch:{ all -> 0x08ad }
            goto L_0x07bc
        L_0x0826:
            r18.close()     // Catch:{ all -> 0x08b2 }
            r19.close()
            X.0rt r1 = r6.A06
            r0 = r26
            X.C38621r6.A0K(r0, r1, r3)
            X.17E r5 = r6.A0C
            android.os.Handler r0 = r5.A00
            r1 = r29
            android.os.Message r0 = android.os.Message.obtain(r0, r7, r1, r4, r2)
            r0.sendToTarget()
            android.os.Handler r4 = r5.A01
            r1 = 28
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r6, r1, r3)
            r4.post(r0)
            android.os.Handler r3 = r5.A02
            r1 = 30
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r6, r1, r2)
            r3.post(r0)
            goto L_0x00e4
        L_0x085a:
            if (r16 == 0) goto L_0x0025
            if (r30 == 0) goto L_0x0025
            X.0rv r0 = r5.A0B()
            if (r0 == 0) goto L_0x0870
            int r1 = r0.getType()
            r0 = 11
            if (r1 != r0) goto L_0x0870
            return
        L_0x086d:
            if (r16 == 0) goto L_0x0025
            goto L_0x0889
        L_0x0870:
            X.2EB r0 = X.AnonymousClass2EB.A01(r5)
            r6.A01(r0)
            X.2EC r1 = r5.A0O
            X.2EC r0 = X.AnonymousClass2EC.RELAY
            if (r1 == r0) goto L_0x0881
            X.2EC r0 = X.AnonymousClass2EC.RETRY
            if (r1 != r0) goto L_0x0889
        L_0x0881:
            long r3 = r5.A14
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0025
        L_0x0889:
            X.17f r0 = r6.A0Y
            r0.A03(r5)
            return
        L_0x088f:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x08b6 }
            throw r0
        L_0x0894:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0898 }
        L_0x0898:
            throw r0     // Catch:{ all -> 0x08a3 }
        L_0x0899:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x08a7 }
            goto L_0x08a7
        L_0x089e:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x08ac }
            goto L_0x08ac
        L_0x08a3:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x08a7 }
        L_0x08a7:
            throw r0     // Catch:{ all -> 0x08a8 }
        L_0x08a8:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x08ac }
        L_0x08ac:
            throw r0     // Catch:{ all -> 0x08ad }
        L_0x08ad:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x08b1 }
        L_0x08b1:
            throw r0     // Catch:{ all -> 0x08b2 }
        L_0x08b2:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x08b6 }
        L_0x08b6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27631Sn.A02(X.1rU, int, boolean, boolean):void");
    }

    public void A03(C38831rU r5, boolean z2) {
        String str;
        StringBuilder sb = new StringBuilder("msgstore/edit/revoke ");
        C28381Vw r2 = r5.A11;
        if (r2.A02) {
            StringBuilder sb2 = new StringBuilder("send deleteMedia=");
            sb2.append(z2);
            str = sb2.toString();
        } else if (!yo.yoAntiRevoke(r5)) {
            str = "recv";
        } else {
            return;
        }
        sb.append(str);
        sb.append(" key=");
        sb.append(r2);
        Log.i(sb.toString());
        A02(r5, -1, true, z2);
    }
}
