package X;

/* renamed from: X.17w  reason: invalid class name and case insensitive filesystem */
public class C224217w {
    public final C16040sK A00;
    public final C16920ts A01;
    public final C216314v A02;
    public final C16900tq A03;
    public final AnonymousClass11I A04;

    public C224217w(C16040sK r1, C16920ts r2, C216314v r3, C16900tq r4, AnonymousClass11I r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C16740tZ r9) {
        /*
            r8 = this;
            java.util.List r1 = r9.A0q
            if (r1 == 0) goto L_0x0066
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0066
            boolean r0 = r8.A02()
            if (r0 == 0) goto L_0x0066
            X.0tq r0 = r8.A03
            X.0tf r3 = r0.A02()
            X.1cj r7 = r3.A00()     // Catch:{ all -> 0x0061 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x005c }
        L_0x001e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0052
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x005c }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x005c }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x005c }
            r4.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "message_row_id"
            long r0 = r9.A13     // Catch:{ all -> 0x005c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x005c }
            r4.put(r2, r0)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "jid_row_id"
            X.14v r0 = r8.A02     // Catch:{ all -> 0x005c }
            long r0 = r0.A01(r5)     // Catch:{ all -> 0x005c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x005c }
            r4.put(r2, r0)     // Catch:{ all -> 0x005c }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "message_mentions"
            r0 = 4
            r2.A06(r4, r1, r0)     // Catch:{ all -> 0x005c }
            goto L_0x001e
        L_0x0052:
            r7.A00()     // Catch:{ all -> 0x005c }
            r7.close()     // Catch:{ all -> 0x0061 }
            r3.close()
            return
        L_0x005c:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224217w.A00(X.0tZ):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C16740tZ r9, long r10) {
        /*
            r8 = this;
            java.util.List r1 = r9.A0q
            if (r1 == 0) goto L_0x005e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x005e
            X.0tq r0 = r8.A03
            X.0tf r5 = r0.A02()
            X.1cj r7 = r5.A00()     // Catch:{ all -> 0x0059 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x0054 }
        L_0x0018:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004a
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x0054 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x0054 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0054 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "jid_row_id"
            X.14v r0 = r8.A02     // Catch:{ all -> 0x0054 }
            long r0 = r0.A01(r4)     // Catch:{ all -> 0x0054 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0054 }
            r3.put(r2, r0)     // Catch:{ all -> 0x0054 }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "message_quoted_mentions"
            r0 = 4
            r2.A06(r3, r1, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0018
        L_0x004a:
            r7.A00()     // Catch:{ all -> 0x0054 }
            r7.close()     // Catch:{ all -> 0x0059 }
            r5.close()
            return
        L_0x0054:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            throw r0
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224217w.A01(X.0tZ, long):void");
    }

    public boolean A02() {
        return this.A02.A0C() && this.A04.A00("mention_message_ready", 0) == 1;
    }
}
