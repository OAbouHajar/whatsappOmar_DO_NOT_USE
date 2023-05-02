package X;

/* renamed from: X.38l  reason: invalid class name and case insensitive filesystem */
public class C613238l {
    public final C16040sK A00;
    public final C16000sG A01;
    public final C16820th A02;
    public final C223217m A03;

    public C613238l(C16040sK r1, C16000sG r2, C16820th r3, C223217m r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0176 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0183 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A00(com.whatsapp.jid.UserJid r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0007
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
        L_0x0006:
            return r7
        L_0x0007:
            X.17m r1 = r11.A03
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r9 = "message_row_id"
            boolean r0 = r1.A09()
            if (r0 != 0) goto L_0x0053
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x001b:
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            java.util.Iterator r5 = r0.iterator()
        L_0x0023:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r5.next()
            long r1 = X.C13700nu.A01(r0)
            X.0th r0 = r11.A02
            X.0tZ r0 = r0.A00(r1)
            r4 = 0
            if (r0 == 0) goto L_0x004d
            com.whatsapp.jid.UserJid r0 = r0.A0C()
            if (r0 == 0) goto L_0x004d
            java.lang.String r3 = r12.getRawString()
            java.lang.String r0 = r0.getRawString()
            X.4jG r4 = new X.4jG
            r4.<init>(r3, r0, r1)
        L_0x004d:
            if (r4 == 0) goto L_0x0023
            r7.add(r4)
            goto L_0x0023
        L_0x0053:
            java.util.Comparator r0 = java.util.Collections.reverseOrder()
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>(r0)
            X.14v r0 = r1.A07
            long r2 = r0.A01(r12)
            X.0tq r0 = r1.A09
            X.0tf r7 = r0.get()
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x0177 }
            java.lang.String r1 = "SELECT message_row_id FROM message_vcard WHERE _id IN (SELECT vcard_row_id FROM message_vcard_jid WHERE vcard_jid_row_id = ?)"
            r10 = 1
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x0177 }
            java.lang.String r5 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0177 }
            r4 = 0
            r0[r4] = r5     // Catch:{ all -> 0x0177 }
            android.database.Cursor r3 = r6.A08(r1, r0)     // Catch:{ all -> 0x0177 }
            int r2 = r3.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0170 }
        L_0x007e:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x008c
            long r0 = r3.getLong(r2)     // Catch:{ all -> 0x0170 }
            X.C13700nu.A0d(r8, r0)     // Catch:{ all -> 0x0170 }
            goto L_0x007e
        L_0x008c:
            r3.close()     // Catch:{ all -> 0x0177 }
            java.lang.String r1 = "SELECT message_row_id FROM message_vcard_jid WHERE vcard_jid_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x0177 }
            r0[r4] = r5     // Catch:{ all -> 0x0177 }
            android.database.Cursor r6 = r6.A08(r1, r0)     // Catch:{ all -> 0x0177 }
            int r5 = r6.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0169 }
        L_0x009d:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x00b1
            long r3 = r6.getLong(r5)     // Catch:{ all -> 0x0169 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            X.C13700nu.A0d(r8, r3)     // Catch:{ all -> 0x0169 }
            goto L_0x009d
        L_0x00b1:
            r6.close()     // Catch:{ all -> 0x0177 }
            r7.close()
            java.util.ArrayList r0 = X.C13680ns.A0n(r8)
            goto L_0x001b
        L_0x00bd:
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            X.0tq r0 = r1.A09
            X.0tf r8 = r0.get()
            X.0tg r4 = r8.A02     // Catch:{ all -> 0x0184 }
            java.lang.String r3 = "SELECT sender_jid, message_row_id FROM messages_vcards WHERE _id IN (SELECT vcard_row_id FROM messages_vcards_jids WHERE vcard_jid = ?) ORDER BY message_row_id DESC"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0184 }
            r1 = 0
            java.lang.String r0 = r12.getRawString()     // Catch:{ all -> 0x0184 }
            r2[r1] = r0     // Catch:{ all -> 0x0184 }
            android.database.Cursor r9 = r4.A08(r3, r2)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "sender_jid"
            int r6 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "message_row_id"
            int r5 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
        L_0x00e6:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x0101
            java.lang.String r4 = r9.getString(r6)     // Catch:{ all -> 0x017d }
            long r2 = r9.getLong(r5)     // Catch:{ all -> 0x017d }
            java.lang.String r1 = r12.getRawString()     // Catch:{ all -> 0x017d }
            X.4jG r0 = new X.4jG     // Catch:{ all -> 0x017d }
            r0.<init>(r1, r4, r2)     // Catch:{ all -> 0x017d }
            r7.add(r0)     // Catch:{ all -> 0x017d }
            goto L_0x00e6
        L_0x0101:
            r9.close()     // Catch:{ all -> 0x0184 }
            r8.close()
        L_0x0107:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0006
            int r0 = r7.size()
            java.util.ArrayList r6 = X.C13690nt.A0i(r0)
            java.util.HashMap r5 = X.AnonymousClass000.A0x()
            java.util.Iterator r7 = r7.iterator()
        L_0x011d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x017c
            java.lang.Object r4 = r7.next()
            X.4jG r4 = (X.C93474jG) r4
            java.lang.String r0 = r4.A02
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.getNullable(r0)
            if (r3 == 0) goto L_0x011d
            boolean r0 = r5.containsKey(r3)
            if (r0 == 0) goto L_0x0148
            java.lang.Object r0 = r5.get(r3)
            X.AnonymousClass00B.A06(r0)
            boolean r1 = X.AnonymousClass000.A1X(r0)
        L_0x0142:
            if (r1 == 0) goto L_0x011d
            r6.add(r4)
            goto L_0x011d
        L_0x0148:
            X.0sG r0 = r11.A01
            X.0sH r2 = r0.A08(r3)
            if (r2 == 0) goto L_0x0167
            X.0sK r1 = r11.A00
            X.0rv r0 = r2.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x015e
            X.1ko r0 = r2.A0D
            if (r0 == 0) goto L_0x0167
        L_0x015e:
            r1 = 1
        L_0x015f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.put(r3, r0)
            goto L_0x0142
        L_0x0167:
            r1 = 0
            goto L_0x015f
        L_0x0169:
            r0 = move-exception
            if (r6 == 0) goto L_0x0176
            r6.close()     // Catch:{ all -> 0x0176 }
            goto L_0x0176
        L_0x0170:
            r0 = move-exception
            if (r3 == 0) goto L_0x0176
            r3.close()     // Catch:{ all -> 0x0176 }
        L_0x0176:
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0188 }
            throw r0
        L_0x017c:
            return r6
        L_0x017d:
            r0 = move-exception
            if (r9 == 0) goto L_0x0183
            r9.close()     // Catch:{ all -> 0x0183 }
        L_0x0183:
            throw r0     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0188 }
        L_0x0188:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613238l.A00(com.whatsapp.jid.UserJid):java.util.ArrayList");
    }
}
