package X;

import com.whatsapp.util.Log;

/* renamed from: X.14w  reason: invalid class name and case insensitive filesystem */
public class C216414w {
    public final C16440t3 A00;
    public final C16920ts A01;
    public final C216314v A02;
    public final C16900tq A03;

    public C216414w(C16440t3 r1, C16920ts r2, C216314v r3, C16900tq r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0094 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00(X.C28381Vw r18) {
        /*
            r17 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]
            r6 = r17
            X.0ts r1 = r6.A01
            r3 = r18
            X.0rv r0 = r3.A00
            X.AnonymousClass00B.A06(r0)
            long r0 = r1.A02(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r2[r0] = r1
            boolean r0 = r3.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1
            r2[r0] = r1
            r1 = 2
            java.lang.String r0 = r3.A01
            r2[r1] = r0
            X.0tq r0 = r6.A03
            X.0tf r9 = r0.get()
            X.0tg r1 = r9.A02     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "SELECT receipt_device_jid_row_id, receipt_recipient_jid_row_id, status, timestamp FROM receipt_orphaned WHERE chat_row_id = ? AND from_me = ? AND key_id = ? ORDER BY _id ASC"
            android.database.Cursor r5 = r1.A08(r0, r2)     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "receipt_device_jid_row_id"
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "receipt_recipient_jid_row_id"
            int r4 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "status"
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "timestamp"
            int r2 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x008e }
        L_0x0054:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0087
            X.14v r11 = r6.A02     // Catch:{ all -> 0x008e }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r10 = com.whatsapp.jid.DeviceJid.class
            long r0 = r5.getLong(r8)     // Catch:{ all -> 0x008e }
            com.whatsapp.jid.Jid r12 = r11.A07(r10, r0)     // Catch:{ all -> 0x008e }
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12     // Catch:{ all -> 0x008e }
            if (r12 == 0) goto L_0x0054
            java.lang.Class<com.whatsapp.jid.UserJid> r10 = com.whatsapp.jid.UserJid.class
            long r0 = r5.getLong(r4)     // Catch:{ all -> 0x008e }
            com.whatsapp.jid.Jid r13 = r11.A07(r10, r0)     // Catch:{ all -> 0x008e }
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13     // Catch:{ all -> 0x008e }
            int r14 = r5.getInt(r3)     // Catch:{ all -> 0x008e }
            long r15 = r5.getLong(r2)     // Catch:{ all -> 0x008e }
            X.2Bz r11 = new X.2Bz     // Catch:{ all -> 0x008e }
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x008e }
            r7.add(r11)     // Catch:{ all -> 0x008e }
            goto L_0x0054
        L_0x0087:
            r5.close()     // Catch:{ all -> 0x0095 }
            r9.close()
            return r7
        L_0x008e:
            r0 = move-exception
            if (r5 == 0) goto L_0x0094
            r5.close()     // Catch:{ all -> 0x0094 }
        L_0x0094:
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0099 }
        L_0x0099:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216414w.A00(X.1Vw):java.util.List");
    }

    public void A01(C28381Vw r6) {
        C16920ts r1 = this.A01;
        C15830rv r0 = r6.A00;
        AnonymousClass00B.A06(r0);
        String[] strArr = {String.valueOf(r1.A02(r0)), String.valueOf(r6.A02 ? 1 : 0), r6.A01};
        C16800tf A022 = this.A03.A02();
        try {
            A022.A02.A01("receipt_orphaned", "chat_row_id = ? AND from_me = ? AND key_id = ?", strArr);
            StringBuilder sb = new StringBuilder();
            sb.append("orphanedreceiptstore/deleteOrphanedReceipts/key:");
            sb.append(r6);
            Log.i(sb.toString());
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
