package X;

/* renamed from: X.156  reason: invalid class name */
public class AnonymousClass156 {
    public final AnonymousClass2DZ A00;

    public AnonymousClass156(AnonymousClass11X r2) {
        this.A00 = new AnonymousClass2DZ(r2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x0050=Splitter:B:12:0x0050, B:20:0x0060=Splitter:B:20:0x0060} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass26U A00(X.C15830rv r13) {
        /*
            r12 = this;
            X.2DZ r1 = r12.A00
            r0 = 1
            X.1Zf r4 = new X.1Zf
            r4.<init>((boolean) r0)
            r4.A03()
            X.11X r0 = r1.A00
            X.0tf r5 = r0.get()
            java.lang.String r6 = "wa_last_entry_point"
            java.lang.String[] r10 = X.AnonymousClass2DZ.A00     // Catch:{ all -> 0x0061 }
            java.lang.String r7 = "wa_last_entry_point.jid = ?"
            r0 = 1
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x0061 }
            r1 = 0
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x0061 }
            r11[r1] = r0     // Catch:{ all -> 0x0061 }
            r8 = 0
            java.lang.String r9 = "CONTACT_ENTRY_POINT"
            android.database.Cursor r3 = X.AnonymousClass15L.A03(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0061 }
            r2 = 0
            if (r3 != 0) goto L_0x0045
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r1.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "contact-mgr-db/unable to get contact by jid "
            r1.append(r0)     // Catch:{ all -> 0x005a }
            r1.append(r13)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005a }
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x005a }
            r5.close()
            return r2
        L_0x0045:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0050
            X.26U r2 = new X.26U     // Catch:{ all -> 0x005a }
            r2.<init>(r3)     // Catch:{ all -> 0x005a }
        L_0x0050:
            r3.close()     // Catch:{ all -> 0x0061 }
            r5.close()
            r4.A00()
            return r2
        L_0x005a:
            r0 = move-exception
            if (r3 == 0) goto L_0x0060
            r3.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass156.A00(X.0rv):X.26U");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0053 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A01(X.AnonymousClass26U r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.2DZ r5 = r6.A00     // Catch:{ all -> 0x006c }
            com.whatsapp.jid.Jid r4 = r7.A01     // Catch:{ all -> 0x006c }
            if (r4 != 0) goto L_0x000e
            java.lang.String r0 = "setOrUpdateLastEntryPoint/jid is null"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x006c }
            goto L_0x006a
        L_0x000e:
            r0 = 1
            X.1Zf r3 = new X.1Zf     // Catch:{ all -> 0x006c }
            r3.<init>((boolean) r0)     // Catch:{ all -> 0x006c }
            r3.A03()     // Catch:{ all -> 0x006c }
            r0 = 4
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x006c }
            r2.<init>(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = r4.getRawString()     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "jid"
            r2.put(r0, r1)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "entry_point_type"
            r2.put(r0, r1)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = r7.A02     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "entry_point_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x006c }
            long r0 = r7.A00     // Catch:{ all -> 0x006c }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "entry_point_time"
            r2.put(r0, r1)     // Catch:{ all -> 0x006c }
            X.11X r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0054 }
            X.0tf r1 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0054 }
            java.lang.String r0 = "wa_last_entry_point"
            X.AnonymousClass15L.A04(r2, r1, r0)     // Catch:{ all -> 0x004f }
            r1.close()     // Catch:{ IllegalArgumentException -> 0x0054 }
            goto L_0x0067
        L_0x004f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0054 }
        L_0x0054:
            r2 = move-exception
            java.lang.String r1 = "setOrUpdateLastEntryPoint/unable to update entry point for jid "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r0.<init>(r1)     // Catch:{ all -> 0x006c }
            r0.append(r4)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006c }
            X.AnonymousClass00B.A09(r0, r2)     // Catch:{ all -> 0x006c }
        L_0x0067:
            r3.A00()     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r6)
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass156.A01(X.26U):void");
    }
}
