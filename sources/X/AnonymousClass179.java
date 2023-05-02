package X;

/* renamed from: X.179  reason: invalid class name */
public class AnonymousClass179 extends AnonymousClass17A {
    public final C16920ts A00;

    public AnonymousClass179(C16300so r7, C16920ts r8, C216314v r9, C19650ym r10, C16900tq r11, AnonymousClass178 r12) {
        super(r7, r9, r10, r11, r12);
        this.A00 = r8;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42641yA A05(X.C28381Vw r11) {
        /*
            r10 = this;
            X.1yA r7 = new X.1yA
            r7.<init>()
            X.0rv r1 = r11.A00
            X.AnonymousClass00B.A06(r1)
            X.0ts r0 = r10.A00
            long r3 = r0.A02(r1)
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0 = 0
            r2[r0] = r1
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = "1"
        L_0x0020:
            r0 = 1
            r2[r0] = r1
            r1 = 2
            java.lang.String r0 = r11.A01
            r2[r1] = r0
            X.0tq r0 = r10.A04
            X.0tf r5 = r0.get()
            goto L_0x0032
        L_0x002f:
            java.lang.String r1 = "0"
            goto L_0x0020
        L_0x0032:
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ?"
            android.database.Cursor r6 = r1.A08(r0, r2)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "receipt_device_jid_row_id"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "receipt_device_timestamp"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009b }
        L_0x0046:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0094
            long r1 = r6.getLong(r4)     // Catch:{ all -> 0x009b }
            X.14v r9 = r10.A02     // Catch:{ all -> 0x009b }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r8 = r9.A07(r0, r1)     // Catch:{ all -> 0x009b }
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8     // Catch:{ all -> 0x009b }
            if (r8 == 0) goto L_0x006b
            long r0 = r6.getLong(r3)     // Catch:{ all -> 0x009b }
            X.1yB r2 = new X.1yB     // Catch:{ all -> 0x009b }
            r2.<init>(r0)     // Catch:{ all -> 0x009b }
            java.util.concurrent.ConcurrentHashMap r0 = r7.A00     // Catch:{ all -> 0x009b }
            r0.put(r8, r2)     // Catch:{ all -> 0x009b }
            goto L_0x0046
        L_0x006b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r8.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore//getmessagedevicereceipts: got a null deviceJid for "
            r8.append(r0)     // Catch:{ all -> 0x009b }
            r8.append(r11)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = ", deviceJidRowId="
            r8.append(r0)     // Catch:{ all -> 0x009b }
            r8.append(r1)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = ", jid="
            r8.append(r0)     // Catch:{ all -> 0x009b }
            com.whatsapp.jid.Jid r0 = r9.A03(r1)     // Catch:{ all -> 0x009b }
            r8.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x009b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x009b }
            goto L_0x0046
        L_0x0094:
            r6.close()     // Catch:{ all -> 0x00a2 }
            r5.close()
            return r7
        L_0x009b:
            r0 = move-exception
            if (r6 == 0) goto L_0x00a1
            r6.close()     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass179.A05(X.1Vw):X.1yA");
    }
}
