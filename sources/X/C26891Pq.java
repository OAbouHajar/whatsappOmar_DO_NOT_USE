package X;

/* renamed from: X.1Pq  reason: invalid class name and case insensitive filesystem */
public class C26891Pq {
    public final AnonymousClass03L A00 = new AnonymousClass03L(250);
    public final C216314v A01;
    public final C16900tq A02;
    public final AnonymousClass11I A03;

    public C26891Pq(C216314v r3, C16900tq r4, AnonymousClass11I r5) {
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:35|36|37|38|39) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0093 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21M A00(long r23) {
        /*
            r22 = this;
            r8 = r22
            X.03L r7 = r8.A00
            monitor-enter(r7)
            java.lang.Long r6 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x009c }
            java.lang.Object r0 = r7.A02(r6)     // Catch:{ all -> 0x009c }
            X.21M r0 = (X.AnonymousClass21M) r0     // Catch:{ all -> 0x009c }
            monitor-exit(r7)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0013
            return r0
        L_0x0013:
            X.0tq r0 = r8.A02
            X.0tf r14 = r0.get()
            monitor-enter(r7)     // Catch:{ all -> 0x0097 }
            X.21M r5 = new X.21M     // Catch:{ all -> 0x0094 }
            r5.<init>()     // Catch:{ all -> 0x0094 }
            X.0tf r11 = r0.get()     // Catch:{ all -> 0x0094 }
            X.0tg r4 = r11.A02     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "SELECT receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp FROM receipt_user WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x008f }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r23)     // Catch:{ all -> 0x008f }
            r2[r1] = r0     // Catch:{ all -> 0x008f }
            android.database.Cursor r4 = r4.A08(r3, r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = "receipt_user_jid_row_id"
            int r10 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "receipt_timestamp"
            int r9 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "read_timestamp"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "played_timestamp"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0088 }
        L_0x004d:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x007a
            long r0 = r4.getLong(r10)     // Catch:{ all -> 0x0088 }
            X.14v r13 = r8.A01     // Catch:{ all -> 0x0088 }
            java.lang.Class<com.whatsapp.jid.UserJid> r12 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r13.A07(r12, r0)     // Catch:{ all -> 0x0088 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x004d
            long r16 = r4.getLong(r9)     // Catch:{ all -> 0x0088 }
            long r18 = r4.getLong(r3)     // Catch:{ all -> 0x0088 }
            long r20 = r4.getLong(r2)     // Catch:{ all -> 0x0088 }
            X.21N r15 = new X.21N     // Catch:{ all -> 0x0088 }
            r15.<init>(r16, r18, r20)     // Catch:{ all -> 0x0088 }
            java.util.concurrent.ConcurrentHashMap r1 = r5.A00     // Catch:{ all -> 0x0088 }
            r1.put(r0, r15)     // Catch:{ all -> 0x0088 }
            goto L_0x004d
        L_0x007a:
            r4.close()     // Catch:{ all -> 0x008f }
            r11.close()     // Catch:{ all -> 0x0094 }
            r7.A06(r6, r5)     // Catch:{ all -> 0x0094 }
            monitor-exit(r7)     // Catch:{ all -> 0x0094 }
            r14.close()
            return r5
        L_0x0088:
            r0 = move-exception
            if (r4 == 0) goto L_0x008e
            r4.close()     // Catch:{ all -> 0x008e }
        L_0x008e:
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0093 }
        L_0x0093:
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0094 }
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x009b }
        L_0x009b:
            throw r0
        L_0x009c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x009c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26891Pq.A00(long):X.21M");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00dd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(com.whatsapp.jid.UserJid r18, int r19, long r20, long r22) {
        /*
            r17 = this;
            r6 = r17
            X.11I r5 = r6.A03
            java.lang.String r1 = "receipt_user_ready"
            r0 = 0
            int r0 = r5.A00(r1, r0)
            r7 = 2
            r3 = r20
            if (r0 == r7) goto L_0x0020
            r1 = 0
            int r0 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fc
            java.lang.String r0 = "migration_receipt_index"
            long r1 = r5.A01(r0, r1)
            int r0 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fc
        L_0x0020:
            X.21M r2 = r6.A00(r3)
            r8 = r18
            r5 = r19
            r0 = r22
            boolean r2 = r2.A00(r8, r5, r0)
            java.lang.String r10 = "; status="
            if (r2 == 0) goto L_0x00fc
            java.lang.String r2 = "receiptuserstore/insertOrUpdateUserReceiptForMessage/rowId="
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r2)
            r9.append(r3)
            r9.append(r10)
            r9.append(r5)
            java.lang.String r2 = " timestamp="
            r9.append(r2)
            r9.append(r0)
            java.lang.String r2 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r2 = 1
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>(r2)
            r2 = 5
            if (r5 == r2) goto L_0x0075
            r2 = 8
            if (r5 == r2) goto L_0x0072
            r2 = 13
            if (r5 != r2) goto L_0x00e3
            java.lang.String r2 = "read_timestamp"
        L_0x0064:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.put(r2, r0)
            X.0tq r0 = r6.A02
            X.0tf r5 = r0.A02()
            goto L_0x0078
        L_0x0072:
            java.lang.String r2 = "played_timestamp"
            goto L_0x0064
        L_0x0075:
            java.lang.String r2 = "receipt_timestamp"
            goto L_0x0064
        L_0x0078:
            X.1cj r16 = r5.A00()     // Catch:{ all -> 0x00de }
            X.14v r0 = r6.A01     // Catch:{ all -> 0x00d9 }
            long r14 = r0.A01(r8)     // Catch:{ all -> 0x00d9 }
            r13 = 0
            r11 = -1
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x008b
            r1 = 1
        L_0x008b:
            java.lang.String r0 = "invalid jid"
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ all -> 0x00d9 }
            X.0tg r9 = r5.A02     // Catch:{ all -> 0x00d9 }
            java.lang.String r8 = "receipt_user"
            java.lang.String r6 = "message_row_id=? AND receipt_user_jid_row_id=?"
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00d9 }
            r2[r13] = r0     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x00d9 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x00d9 }
            int r0 = r9.A00(r8, r10, r6, r2)     // Catch:{ all -> 0x00d9 }
            long r6 = (long) r0     // Catch:{ all -> 0x00d9 }
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00cf
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00d9 }
            r10.put(r1, r0)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "receipt_user_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x00d9 }
            r10.put(r1, r0)     // Catch:{ all -> 0x00d9 }
            long r1 = r9.A02(r10, r8)     // Catch:{ all -> 0x00d9 }
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = "ReceiptUserStore/insertOrUpdateUserReceiptForMessage/insert failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d9 }
        L_0x00cf:
            r16.A00()     // Catch:{ all -> 0x00d9 }
            r16.close()     // Catch:{ all -> 0x00de }
            r5.close()
            return
        L_0x00d9:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            throw r0
        L_0x00e3:
            java.lang.String r0 = "Unexpected message status "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = " for user receipt"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26891Pq.A01(com.whatsapp.jid.UserJid, int, long, long):void");
    }
}
