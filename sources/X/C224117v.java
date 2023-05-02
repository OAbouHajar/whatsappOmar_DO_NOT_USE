package X;

/* renamed from: X.17v  reason: invalid class name and case insensitive filesystem */
public class C224117v {
    public final C16300so A00;
    public final C16040sK A01;
    public final C216314v A02;
    public final C16900tq A03;
    public final AnonymousClass11I A04;
    public final C18030w2 A05;

    public C224117v(C16300so r1, C16040sK r2, C216314v r3, C16900tq r4, AnonymousClass11I r5, C18030w2 r6) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
        r1 = ((X.C39161s1) r10).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C38831rU r10) {
        /*
            r9 = this;
            X.11I r5 = r9.A04
            java.lang.String r2 = "revoked_ready"
            r0 = 0
            long r3 = r5.A01(r2, r0)
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0025
            long r3 = r10.A13
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c8
            long r3 = r10.A13
            java.lang.String r0 = "migration_message_revoked_index"
            long r1 = r5.A01(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00c8
        L_0x0025:
            long r1 = r10.A13
            r7 = 0
            r6 = 0
            r4 = 1
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x0031
            r2 = 1
        L_0x0031:
            java.lang.String r1 = "RevokedMessageStore/insertOrUpdateRevokedMessage/message must have row_id set; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            X.1Vw r3 = r10.A11
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            int r0 = r10.A08()
            r2 = 0
            if (r0 != r4) goto L_0x004c
            r2 = 1
        L_0x004c:
            java.lang.String r1 = "RevokedMessageStore/insertOrUpdateRevokedMessage/message in main storage; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            X.0tq r0 = r9.A03
            X.0tf r5 = r0.A02()
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00c0 }
            r3.<init>()     // Catch:{ all -> 0x00c0 }
            long r0 = r10.A13     // Catch:{ all -> 0x00c0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "message_row_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = r10.A01     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "revoked_key_id"
            X.C38611r4.A04(r3, r0, r1)     // Catch:{ all -> 0x00c0 }
            boolean r0 = r10 instanceof X.C39161s1     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00b7
            r0 = r10
            X.1s1 r0 = (X.C39161s1) r0     // Catch:{ all -> 0x00c0 }
            com.whatsapp.jid.UserJid r1 = r0.A00     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x00b7
            X.14v r0 = r9.A02     // Catch:{ all -> 0x00c0 }
            long r0 = r0.A01(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c0 }
        L_0x0090:
            java.lang.String r0 = "admin_jid_row_id"
            if (r1 != 0) goto L_0x00b3
            r3.putNull(r0)     // Catch:{ all -> 0x00c0 }
        L_0x0097:
            long r0 = r10.A00     // Catch:{ all -> 0x00c0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "revoke_timestamp"
            r3.put(r0, r1)     // Catch:{ all -> 0x00c0 }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = "message_revoked"
            r0 = 5
            long r3 = r2.A06(r3, r1, r0)     // Catch:{ all -> 0x00c0 }
            long r1 = r10.A13     // Catch:{ all -> 0x00c0 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ba
            goto L_0x00b9
        L_0x00b3:
            r3.put(r0, r1)     // Catch:{ all -> 0x00c0 }
            goto L_0x0097
        L_0x00b7:
            r1 = 0
            goto L_0x0090
        L_0x00b9:
            r6 = 1
        L_0x00ba:
            java.lang.String r0 = "RevokedMessageStore/insertOrUpdateRevokedMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r6)     // Catch:{ all -> 0x00c0 }
            goto L_0x00c5
        L_0x00c0:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            throw r0
        L_0x00c5:
            r5.close()
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224117v.A00(X.1rU):void");
    }
}
