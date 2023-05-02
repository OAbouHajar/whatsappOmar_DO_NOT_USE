package X;

/* renamed from: X.18P  reason: invalid class name */
public class AnonymousClass18P {
    public final C16040sK A00;
    public final C16820th A01;
    public final C16460t6 A02;
    public final AnonymousClass185 A03;
    public final AnonymousClass124 A04;
    public final C16320sq A05;

    public AnonymousClass18P(C16040sK r1, C16820th r2, C16460t6 r3, AnonymousClass185 r4, AnonymousClass124 r5, C16320sq r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x008d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00(X.C16050sL r8, long r9) {
        /*
            r7 = this;
            X.185 r4 = r7.A03
            X.0sK r0 = r7.A00
            r0.A0B()
            X.1ZT r6 = r0.A05
            X.AnonymousClass00B.A06(r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]
            X.14v r3 = r4.A01
            long r0 = r3.A01(r8)
            java.lang.String r1 = java.lang.Long.toString(r0)
            r0 = 0
            r2[r0] = r1
            long r0 = r3.A01(r6)
            java.lang.String r1 = java.lang.Long.toString(r0)
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = java.lang.Long.toString(r9)
            r0 = 2
            r2[r0] = r1
            X.0tq r0 = r4.A02
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "SELECT chat_row_id, message_row_id FROM message_group_invite invite INNER JOIN message_view message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND invite.admin_jid_row_id = ? AND invite.expiration > ? AND invite.expired = 0"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x008e }
        L_0x0041:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0087 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0087 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0087 }
            r5.add(r0)     // Catch:{ all -> 0x0087 }
            goto L_0x0041
        L_0x0059:
            r2.close()     // Catch:{ all -> 0x008e }
            r3.close()
            int r0 = r5.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r5.iterator()
        L_0x006c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            X.0th r2 = r7.A01
            long r0 = r0.longValue()
            X.0tZ r0 = r2.A00(r0)
            r4.add(r0)
            goto L_0x006c
        L_0x0086:
            return r4
        L_0x0087:
            r0 = move-exception
            if (r2 == 0) goto L_0x008d
            r2.close()     // Catch:{ all -> 0x008d }
        L_0x008d:
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0092 }
        L_0x0092:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18P.A00(X.0sL, long):java.util.List");
    }
}
