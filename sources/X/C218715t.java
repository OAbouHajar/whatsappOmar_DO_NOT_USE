package X;

/* renamed from: X.15t  reason: invalid class name and case insensitive filesystem */
public class C218715t {
    public final C16300so A00;
    public final C16440t3 A01;
    public final C16920ts A02;
    public final C17620vN A03;
    public final C19650ym A04;
    public final C16900tq A05;

    public C218715t(C16300so r1, C16440t3 r2, C16920ts r3, C17620vN r4, C19650ym r5, C16900tq r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C16030sJ.A0Q(r2) != false) goto L_0x0013;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0115 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x011a */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21M A00(X.C16740tZ r13) {
        /*
            r12 = this;
            X.1Vw r4 = r13.A11
            X.0rv r2 = r4.A00
            boolean r0 = X.C16030sJ.A0L(r2)
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0013
            boolean r1 = X.C16030sJ.A0Q(r2)
            r0 = 1
            if (r1 == 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            X.AnonymousClass00B.A0F(r0)
            boolean r0 = X.C16030sJ.A0G(r2)
            if (r0 == 0) goto L_0x007d
            java.util.List r7 = r13.A0Q()
            if (r7 == 0) goto L_0x009c
            int r1 = r7.size()
            int r0 = r13.A0A
            if (r1 < r0) goto L_0x009c
            int r0 = r7.size()
            int r0 = r0 + 1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.lang.String r0 = r4.A01
            r3.add(r0)
            java.util.Iterator r2 = r7.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r2.next()
            X.0rv r1 = (X.C15830rv) r1
            X.0ts r0 = r12.A02
            long r0 = r0.A02(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            goto L_0x003f
        L_0x0059:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            int r2 = r7.size()
            java.lang.String r0 = "SELECT chat_row_id, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM available_message_view WHERE from_me = 1 AND broadcast = 2 AND (receipt_device_timestamp > 0 OR read_device_timestamp > 0 OR played_device_timestamp > 0) AND key_id = ? AND "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "chat_row_id IN "
            r1.append(r0)
            java.lang.String r0 = X.C34111ji.A00(r2)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            goto L_0x00b2
        L_0x007d:
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]
            X.0ts r0 = r12.A02
            long r0 = r0.A02(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r6] = r0
            boolean r0 = r4.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r5] = r0
            r1 = 2
            java.lang.String r0 = r4.A01
            r3[r1] = r0
            java.lang.String r4 = "SELECT chat_row_id, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM available_message_view WHERE chat_row_id = ? AND from_me = ? AND key_id = ?"
            goto L_0x00b2
        L_0x009c:
            java.lang.String r0 = "msgstore/getMessageReceiptsForBroadcastMessage falling back to table scan"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0so r2 = r12.A00
            java.lang.String r1 = "message-table-scan"
            java.lang.String r0 = "get-broadcast-receipts"
            r2.AcB(r1, r0, r5)
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r0 = r4.A01
            r3[r6] = r0
            java.lang.String r4 = "SELECT chat_row_id, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM available_message_view WHERE from_me = 1 AND broadcast = 2 AND (receipt_device_timestamp > 0 OR read_device_timestamp > 0 OR played_device_timestamp > 0) AND key_id = ?"
        L_0x00b2:
            X.21M r1 = new X.21M
            r1.<init>()
            X.0tq r0 = r12.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x011b }
            X.0tf r2 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x011b }
            X.0tg r0 = r2.A02     // Catch:{ all -> 0x0116 }
            android.database.Cursor r3 = r0.A08(r4, r3)     // Catch:{ all -> 0x0116 }
        L_0x00c3:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x0108
            X.0ts r6 = r12.A02     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "chat_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010f }
            long r4 = r3.getLong(r0)     // Catch:{ all -> 0x010f }
            X.0rv r0 = r6.A05(r4)     // Catch:{ all -> 0x010f }
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x00c3
            java.lang.String r0 = "receipt_device_timestamp"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010f }
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "read_device_timestamp"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010f }
            long r8 = r3.getLong(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "played_device_timestamp"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010f }
            long r10 = r3.getLong(r0)     // Catch:{ all -> 0x010f }
            X.21N r5 = new X.21N     // Catch:{ all -> 0x010f }
            r5.<init>(r6, r8, r10)     // Catch:{ all -> 0x010f }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A00     // Catch:{ all -> 0x010f }
            r0.put(r4, r5)     // Catch:{ all -> 0x010f }
            goto L_0x00c3
        L_0x0108:
            r3.close()     // Catch:{ all -> 0x0116 }
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x011b }
            return r1
        L_0x010f:
            r0 = move-exception
            if (r3 == 0) goto L_0x0115
            r3.close()     // Catch:{ all -> 0x0115 }
        L_0x0115:
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x011a }
        L_0x011a:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x011b }
        L_0x011b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r12.A04
            r0.A02()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218715t.A00(X.0tZ):X.21M");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (X.C16030sJ.A0Q(r4) != false) goto L_0x0017;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00b9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21M A01(X.C28381Vw r21) {
        /*
            r20 = this;
            long r11 = android.os.SystemClock.uptimeMillis()
            r6 = r21
            X.0rv r4 = r6.A00
            boolean r0 = X.C16030sJ.A0L(r4)
            r5 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0017
            boolean r0 = X.C16030sJ.A0Q(r4)
            r2 = 0
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r2 = 1
        L_0x0018:
            java.lang.String r1 = "jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            X.AnonymousClass00B.A06(r4)
            java.lang.String r1 = r4.getRawString()
            X.21M r4 = new X.21M
            r4.<init>()
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            r2[r5] = r1
            java.lang.String r0 = r6.A01
            r2[r3] = r0
            r5 = r20
            X.0tq r0 = r5.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ba }
            X.0tf r6 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ba }
            X.0tg r1 = r6.A02     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "SELECT remote_resource, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM receipts WHERE key_remote_jid = ? AND key_id = ?"
            android.database.Cursor r7 = r1.A08(r0, r2)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "remote_resource"
            int r8 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "receipt_device_timestamp"
            int r3 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "read_device_timestamp"
            int r2 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "played_device_timestamp"
            int r1 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ae }
        L_0x0066:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r7.getString(r8)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x0075
            X.1jg r0 = X.C34091jg.A00     // Catch:{ all -> 0x00ae }
            goto L_0x0079
        L_0x0075:
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x00ae }
        L_0x0079:
            r10 = 0
            if (r0 == 0) goto L_0x007d
            r10 = 1
        L_0x007d:
            java.lang.String r9 = "receiptsmsgstore/invalid participant jid when getting receipts for group or status message"
            X.AnonymousClass00B.A0B(r9, r10)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0066
            long r14 = r7.getLong(r3)     // Catch:{ all -> 0x00ae }
            long r16 = r7.getLong(r2)     // Catch:{ all -> 0x00ae }
            long r18 = r7.getLong(r1)     // Catch:{ all -> 0x00ae }
            X.21N r13 = new X.21N     // Catch:{ all -> 0x00ae }
            r13.<init>(r14, r16, r18)     // Catch:{ all -> 0x00ae }
            java.util.concurrent.ConcurrentHashMap r9 = r4.A00     // Catch:{ all -> 0x00ae }
            r9.put(r0, r13)     // Catch:{ all -> 0x00ae }
            goto L_0x0066
        L_0x009b:
            X.0vN r3 = r5.A03     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = "ReceiptsMessageStore/getMessageReceiptsForGroupOrStatusMessage"
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00ae }
            long r0 = r0 - r11
            r3.A00(r2, r0)     // Catch:{ all -> 0x00ae }
            r7.close()     // Catch:{ all -> 0x00b5 }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ba }
            return r4
        L_0x00ae:
            r0 = move-exception
            if (r7 == 0) goto L_0x00b4
            r7.close()     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r5.A04
            r0.A02()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218715t.A01(X.1Vw):X.21M");
    }
}
