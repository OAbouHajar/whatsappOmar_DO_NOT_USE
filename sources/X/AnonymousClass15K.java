package X;

/* renamed from: X.15K  reason: invalid class name */
public class AnonymousClass15K extends AnonymousClass15L {
    public AnonymousClass15K(AnonymousClass11X r1) {
        super(r1);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.util.Set r9) {
        /*
            r8 = this;
            java.lang.String r7 = "wa_block_list"
            r0 = 1
            X.1Zf r6 = new X.1Zf
            r6.<init>((boolean) r0)
            r6.A03()
            X.11X r0 = r8.A00
            X.0tf r5 = r0.A02()
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x004f }
            r0 = 0
            X.AnonymousClass15L.A02(r5, r7, r0, r0)     // Catch:{ all -> 0x004a }
            r0 = 1
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x004a }
            r3.<init>(r0)     // Catch:{ all -> 0x004a }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x004a }
        L_0x0024:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x004a }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "jid"
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x004a }
            r3.put(r1, r0)     // Catch:{ all -> 0x004a }
            X.AnonymousClass15L.A00(r3, r5, r7)     // Catch:{ all -> 0x004a }
            goto L_0x0024
        L_0x003d:
            r4.A00()     // Catch:{ all -> 0x004a }
            r4.close()     // Catch:{ all -> 0x004f }
            r5.close()
            r6.A00()
            return
        L_0x004a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15K.A00(java.util.Set):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0034 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0034=Splitter:B:14:0x0034, B:8:0x002c=Splitter:B:8:0x002c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(com.whatsapp.jid.UserJid r8, boolean r9) {
        /*
            r7 = this;
            r6 = 0
            X.11X r0 = r7.A00     // Catch:{ IllegalArgumentException -> 0x0035 }
            X.0tf r5 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0035 }
            java.lang.String r4 = "wa_block_list"
            r3 = 1
            if (r9 == 0) goto L_0x001f
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0030 }
            r2.<init>(r3)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "jid"
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0030 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0030 }
            X.AnonymousClass15L.A04(r2, r5, r4)     // Catch:{ all -> 0x0030 }
            goto L_0x002c
        L_0x001f:
            java.lang.String r2 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0030 }
            r1[r6] = r0     // Catch:{ all -> 0x0030 }
            X.AnonymousClass15L.A02(r5, r4, r2, r1)     // Catch:{ all -> 0x0030 }
        L_0x002c:
            r5.close()     // Catch:{ IllegalArgumentException -> 0x0035 }
            return r3
        L_0x0030:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0035 }
        L_0x0035:
            r2 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update blocked state  "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A09(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15K.A01(com.whatsapp.jid.UserJid, boolean):boolean");
    }
}
