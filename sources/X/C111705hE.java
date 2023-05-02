package X;

import com.obwhatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.5hE  reason: invalid class name and case insensitive filesystem */
public class C111705hE extends AnonymousClass35s {
    public final C16000sG A00;
    public final C221116r A01;
    public final C18090w8 A02;
    public final C18290wS A03;

    public C111705hE(C16000sG r1, ContactPickerFragment contactPickerFragment, C221116r r3, C18090w8 r4, C18290wS r5) {
        super(contactPickerFragment);
        this.A00 = r1;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x01de */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r22) {
        /*
            r21 = this;
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()
            r3 = r21
            X.0sG r0 = r3.A00
            r0.A0Y(r9)
            X.0w8 r0 = r3.A02
            X.0pd r1 = r0.A03
            r0 = 2026(0x7ea, float:2.839E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0235
            X.16r r7 = r3.A01
            r14 = 4
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            java.lang.String r6 = "status"
            r7.A0i()
            r2.append(r6)
            java.lang.String r0 = " =? AND "
            r2.append(r0)
            java.lang.String r5 = "type"
            r7.A0i()
            r2.append(r5)
            java.lang.String r0 = "=? AND "
            r2.append(r0)
            java.lang.String r1 = "receiver_jid_row_id"
            r20 = r1
            java.lang.String r8 = "receiver"
            boolean r0 = r7.A0i()
            if (r0 != 0) goto L_0x0045
            r1 = r8
        L_0x0045:
            r2.append(r1)
            java.lang.String r0 = " is not null"
            java.lang.String r15 = X.AnonymousClass000.A0h(r0, r2)
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "405"
            r0 = 0
            r1[r0] = r2
            r2 = 1
            java.lang.String r0 = "1"
            r1[r2] = r0
            java.lang.String r4 = "readMostFrequentSuccessfulTransactions/QUERY_SUCCESSFUL_TRANSACTIONS"
            boolean r0 = r7.A0i()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            if (r0 == 0) goto L_0x00cd
            r2.append(r4)
            java.lang.String r0 = "/QUERY_PAY_TRANSACTION"
        L_0x006c:
            r2.append(r0)
            r2.toString()
            boolean r12 = r7.A0i()
            java.lang.String r11 = ","
            r10 = 1
            r4 = 0
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            if (r12 == 0) goto L_0x00c7
            java.lang.String r0 = "sender_jid_row_id"
            r2[r4] = r0
            r0 = r20
        L_0x0085:
            r2[r10] = r0
            java.lang.String r17 = android.text.TextUtils.join(r11, r2)
            java.lang.String r4 = "frequency"
            boolean r2 = r7.A0i()
            r13 = 3
            r12 = 2
            r11 = 1
            r10 = 0
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x00c1
            java.lang.String r2 = "sender_jid_row_id"
            r0[r10] = r2
            r2 = r20
        L_0x00a0:
            r0[r11] = r2
            r0[r12] = r6
            r0[r13] = r5
            java.lang.String r2 = "COUNT("
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0r(r2)
            r10.append(r6)
            java.lang.String r2 = ") AS "
            r10.append(r2)
            java.lang.String r2 = X.AnonymousClass000.A0h(r4, r10)
            r0[r14] = r2
            X.0tq r2 = r7.A04
            X.0tf r2 = r2.get()
            goto L_0x00d3
        L_0x00c1:
            java.lang.String r2 = "sender"
            r0[r10] = r2
            r2 = r8
            goto L_0x00a0
        L_0x00c7:
            java.lang.String r0 = "sender"
            r2[r4] = r0
            r0 = r8
            goto L_0x0085
        L_0x00cd:
            r2.append(r4)
            java.lang.String r0 = "/QUERY_PAY_TRANSACTIONS_DEPRECATED"
            goto L_0x006c
        L_0x00d3:
            X.0tg r12 = r2.A02     // Catch:{ all -> 0x0230 }
            java.lang.String r13 = r7.A0P()     // Catch:{ all -> 0x0230 }
            java.lang.String r18 = "frequency DESC"
            java.lang.String r19 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0230 }
            r16 = r1
            r14 = r0
            android.database.Cursor r13 = r12.A09(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0230 }
            if (r13 == 0) goto L_0x01df
            int r0 = r13.getCount()     // Catch:{ all -> 0x01da }
            java.util.ArrayList r12 = X.C13690nt.A0i(r0)     // Catch:{ all -> 0x01da }
        L_0x00f0:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x01be
            boolean r0 = r7.A0i()     // Catch:{ 1W4 -> 0x01b4 }
            if (r0 == 0) goto L_0x016e
            int r0 = r13.getColumnIndexOrThrow(r6)     // Catch:{ 1W4 -> 0x01b4 }
            int r11 = r13.getInt(r0)     // Catch:{ 1W4 -> 0x01b4 }
            X.14v r10 = r7.A03     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r0 = "sender_jid_row_id"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ 1W4 -> 0x01b4 }
            long r0 = r13.getLong(r0)     // Catch:{ 1W4 -> 0x01b4 }
            com.whatsapp.jid.Jid r0 = r10.A03(r0)     // Catch:{ 1W4 -> 0x01b4 }
            com.whatsapp.jid.UserJid r14 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ 1W4 -> 0x01b4 }
            r0 = r20
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ 1W4 -> 0x01b4 }
            long r0 = r13.getLong(r0)     // Catch:{ 1W4 -> 0x01b4 }
            com.whatsapp.jid.Jid r0 = r10.A03(r0)     // Catch:{ 1W4 -> 0x01b4 }
            com.whatsapp.jid.UserJid r15 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ 1W4 -> 0x01b4 }
            int r0 = r13.getColumnIndexOrThrow(r5)     // Catch:{ 1W4 -> 0x01b4 }
            int r0 = r13.getInt(r0)     // Catch:{ 1W4 -> 0x01b4 }
            int r1 = r13.getColumnIndexOrThrow(r4)     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r16 = r13.getString(r1)     // Catch:{ 1W4 -> 0x01b4 }
            X.1Vo r10 = r7.A09     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r1 = "readTransactionInfoByTransId got from db: type: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)     // Catch:{ 1W4 -> 0x01b4 }
            r1.append(r0)     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r0 = " status: "
            r1.append(r0)     // Catch:{ 1W4 -> 0x01b4 }
            r1.append(r11)     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r0 = " sender: "
            r1.append(r0)     // Catch:{ 1W4 -> 0x01b4 }
            r1.append(r14)     // Catch:{ 1W4 -> 0x01b4 }
        L_0x0155:
            java.lang.String r0 = " peer: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r15, r0, r1)     // Catch:{ 1W4 -> 0x01b4 }
            r10.A04(r0)     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ 1W4 -> 0x01b4 }
            r0.intValue()     // Catch:{ 1W4 -> 0x01b4 }
            X.5rc r0 = new X.5rc     // Catch:{ 1W4 -> 0x01b4 }
            r0.<init>(r14, r15)     // Catch:{ 1W4 -> 0x01b4 }
            r12.add(r0)     // Catch:{ 1W4 -> 0x01b4 }
            goto L_0x00f0
        L_0x016e:
            int r0 = r13.getColumnIndexOrThrow(r6)     // Catch:{ 1W4 -> 0x01b4 }
            int r11 = r13.getInt(r0)     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r0 = "sender"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r0 = r13.getString(r0)     // Catch:{ 1W4 -> 0x01b4 }
            com.whatsapp.jid.UserJid r14 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ 1W4 -> 0x01b4 }
            int r0 = r13.getColumnIndexOrThrow(r8)     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r0 = r13.getString(r0)     // Catch:{ 1W4 -> 0x01b4 }
            com.whatsapp.jid.UserJid r15 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ 1W4 -> 0x01b4 }
            int r0 = r13.getColumnIndexOrThrow(r5)     // Catch:{ 1W4 -> 0x01b4 }
            int r0 = r13.getInt(r0)     // Catch:{ 1W4 -> 0x01b4 }
            int r1 = r13.getColumnIndexOrThrow(r4)     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r16 = r13.getString(r1)     // Catch:{ 1W4 -> 0x01b4 }
            X.1Vo r10 = r7.A09     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r1 = "readTransactionInfoByTransId got from db: type: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)     // Catch:{ 1W4 -> 0x01b4 }
            r1.append(r0)     // Catch:{ 1W4 -> 0x01b4 }
            java.lang.String r0 = " status: "
            r1.append(r0)     // Catch:{ 1W4 -> 0x01b4 }
            r1.append(r11)     // Catch:{ 1W4 -> 0x01b4 }
            goto L_0x0155
        L_0x01b4:
            r10 = move-exception
            X.1Vo r1 = r7.A09     // Catch:{ all -> 0x01da }
            java.lang.String r0 = "extractPaymentTransactionInfo/InvalidJidException - Skipped transaction with invalid JID"
            r1.A0A(r0, r10)     // Catch:{ all -> 0x01da }
            goto L_0x00f0
        L_0x01be:
            X.1Vo r4 = r7.A09     // Catch:{ all -> 0x01da }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01da }
            java.lang.String r0 = "readMostFrequentSuccessfulTransactions returned: "
            r1.append(r0)     // Catch:{ all -> 0x01da }
            int r0 = r12.size()     // Catch:{ all -> 0x01da }
            r1.append(r0)     // Catch:{ all -> 0x01da }
            X.C110105dW.A1L(r4, r1)     // Catch:{ all -> 0x01da }
            r13.close()     // Catch:{ all -> 0x0230 }
            r2.close()
            goto L_0x01e6
        L_0x01da:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x01de }
        L_0x01de:
            throw r0     // Catch:{ all -> 0x0230 }
        L_0x01df:
            r2.close()
            java.util.ArrayList r12 = X.AnonymousClass000.A0u()
        L_0x01e6:
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0239
            java.util.HashMap r5 = X.AnonymousClass000.A0x()
            java.util.Iterator r4 = r9.iterator()
        L_0x01f8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0212
            java.lang.Object r1 = r4.next()
            X.0sH r1 = (X.C16010sH) r1
            X.0rv r0 = r1.A07()
            if (r0 == 0) goto L_0x01f8
            java.lang.String r0 = r0.getRawString()
            r5.put(r0, r1)
            goto L_0x01f8
        L_0x0212:
            java.util.Iterator r1 = r12.iterator()
        L_0x0216:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0239
            java.lang.Object r0 = r1.next()
            X.5rc r0 = (X.C116585rc) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            java.lang.String r0 = r0.getRawString()
            java.lang.Object r0 = r5.get(r0)
            r2.add(r0)
            goto L_0x0216
        L_0x0230:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0234 }
        L_0x0234:
            throw r0
        L_0x0235:
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
        L_0x0239:
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()
            java.util.ArrayList r11 = X.AnonymousClass000.A0u()
            r0 = 1
            X.4NB[] r1 = new X.AnonymousClass4NB[r0]
            r12 = 0
            X.4NB r7 = new X.4NB
            r8 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 0
            r1[r0] = r7
            r3.A07(r1)
            X.0wS r0 = r3.A03
            X.160 r0 = X.C110115dX.A0H(r0)
            java.util.List r12 = r0.A0C()
            X.4NB r7 = new X.4NB
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111705hE.A08(java.lang.Object[]):java.lang.Object");
    }
}
