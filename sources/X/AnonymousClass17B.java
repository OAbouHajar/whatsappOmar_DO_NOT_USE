package X;

/* renamed from: X.17B  reason: invalid class name */
public class AnonymousClass17B extends AnonymousClass17A {
    public final C16040sK A00;
    public final C16820th A01;
    public final AnonymousClass11I A02;

    public AnonymousClass17B(C16300so r7, C16040sK r8, C16820th r9, C216314v r10, C19650ym r11, C16900tq r12, AnonymousClass11I r13, AnonymousClass178 r14) {
        super(r7, r10, r11, r12, r14);
        this.A00 = r8;
        this.A02 = r13;
        this.A01 = r9;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean A00(X.AnonymousClass17B r6, com.whatsapp.jid.UserJid r7, long r8) {
        /*
            com.whatsapp.jid.DeviceJid r1 = r7.getPrimaryDevice()
            X.14v r0 = r6.A02
            long r3 = r0.A01(r1)
            X.0tq r0 = r6.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0044 }
            X.0tf r5 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0044 }
            r0 = 2
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x003f }
            r2.<init>(r0)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x003f }
            r2.put(r1, r0)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "receipt_device_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x003f }
            r2.put(r1, r0)     // Catch:{ all -> 0x003f }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x003f }
            java.lang.String r0 = "receipt_device"
            long r3 = r1.A02(r2, r0)     // Catch:{ all -> 0x003f }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
            r0 = 1
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0044 }
            return r0
        L_0x003b:
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0044 }
            goto L_0x004d
        L_0x003f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r6.A03
            r0.A02()
        L_0x004d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17B.A00(X.17B, com.whatsapp.jid.UserJid, long):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x008a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x008f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42641yA A05(X.C28381Vw r11, long r12) {
        /*
            r10 = this;
            X.1yA r3 = new X.1yA
            r3.<init>()
            r1 = -1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0099
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r2[r1] = r0
            X.0tq r0 = r10.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0090 }
            X.0tf r5 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0090 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?"
            android.database.Cursor r6 = r1.A08(r0, r2)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "receipt_device_timestamp"
            int r7 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "receipt_device_jid_row_id"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0084 }
        L_0x002f:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x007d
            long r1 = r6.getLong(r4)     // Catch:{ all -> 0x0084 }
            X.14v r9 = r10.A02     // Catch:{ all -> 0x0084 }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r8 = r9.A07(r0, r1)     // Catch:{ all -> 0x0084 }
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8     // Catch:{ all -> 0x0084 }
            if (r8 == 0) goto L_0x0054
            long r0 = r6.getLong(r7)     // Catch:{ all -> 0x0084 }
            X.1yB r2 = new X.1yB     // Catch:{ all -> 0x0084 }
            r2.<init>(r0)     // Catch:{ all -> 0x0084 }
            java.util.concurrent.ConcurrentHashMap r0 = r3.A00     // Catch:{ all -> 0x0084 }
            r0.put(r8, r2)     // Catch:{ all -> 0x0084 }
            goto L_0x002f
        L_0x0054:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r8.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "receiptsmessagestore/getmessagedevicereceipts: got a null deviceJid for key="
            r8.append(r0)     // Catch:{ all -> 0x0084 }
            r8.append(r11)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = ", deviceJidRowId="
            r8.append(r0)     // Catch:{ all -> 0x0084 }
            r8.append(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = ", jid="
            r8.append(r0)     // Catch:{ all -> 0x0084 }
            com.whatsapp.jid.Jid r0 = r9.A03(r1)     // Catch:{ all -> 0x0084 }
            r8.append(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0084 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0084 }
            goto L_0x002f
        L_0x007d:
            r6.close()     // Catch:{ all -> 0x008b }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0090 }
            return r3
        L_0x0084:
            r0 = move-exception
            if (r6 == 0) goto L_0x008a
            r6.close()     // Catch:{ all -> 0x008a }
        L_0x008a:
            throw r0     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x008f }
        L_0x008f:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r10.A03
            r0.A02()
        L_0x0099:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17B.A05(X.1Vw, long):X.1yA");
    }
}
