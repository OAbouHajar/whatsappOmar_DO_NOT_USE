package X;

/* renamed from: X.1CE  reason: invalid class name */
public class AnonymousClass1CE implements C17810vg {
    public final C16980tz A00;
    public final C16070sO A01;
    public final C16220sf A02;

    public AnonymousClass1CE(C16980tz r1, C16070sO r2, C16220sf r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d1, code lost:
        if (new X.AnonymousClass03S(r4.A00.A00).A03() != false) goto L_0x00d3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00f8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C53102ez A00(int r20) {
        /*
            r19 = this;
            r4 = r19
            X.0sf r2 = r4.A02
            java.lang.String r1 = "mute_end"
            java.lang.String r6 = "jid"
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.0ty r0 = r2.A01()
            X.0tf r3 = r0.get()
            X.0tg r11 = r3.A02     // Catch:{ all -> 0x00f9 }
            java.lang.String r12 = "settings"
            r7 = 2
            java.lang.String[] r13 = new java.lang.String[r7]     // Catch:{ all -> 0x00f9 }
            r8 = 0
            r13[r8] = r6     // Catch:{ all -> 0x00f9 }
            r10 = 1
            r13[r10] = r1     // Catch:{ all -> 0x00f9 }
            java.lang.String r14 = "muted_notifications = ? AND (mute_end > ? OR mute_end = ? )"
            r0 = 3
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00f9 }
            r15[r8] = r0     // Catch:{ all -> 0x00f9 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00f9 }
            r15[r10] = r0     // Catch:{ all -> 0x00f9 }
            r0 = -1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f9 }
            r15[r7] = r0     // Catch:{ all -> 0x00f9 }
            r16 = 0
            java.lang.String r17 = "jid ASC"
            r18 = r16
            android.database.Cursor r9 = r11.A09(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00f9 }
            int r8 = r9.getColumnIndex(r6)     // Catch:{ all -> 0x00f2 }
            int r7 = r9.getColumnIndex(r1)     // Catch:{ all -> 0x00f2 }
        L_0x0051:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r9.getString(r8)     // Catch:{ all -> 0x00f2 }
            X.0rv r6 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x00f2 }
            boolean r0 = r6 instanceof com.whatsapp.jid.GroupJid     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0051
            long r0 = r9.getLong(r7)     // Catch:{ all -> 0x00f2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00f2 }
            X.2f0 r0 = new X.2f0     // Catch:{ all -> 0x00f2 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x00f2 }
            r5.add(r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x0051
        L_0x0074:
            r9.close()     // Catch:{ all -> 0x00f9 }
            r3.close()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r5.iterator()
        L_0x0083:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r5 = r6.next()
            X.2f0 r5 = (X.AnonymousClass2f0) r5
            X.0rv r3 = r5.A01
            boolean r0 = r3 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0083
            X.0sO r1 = r4.A01
            r0 = r3
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0083
            X.0sN r3 = (X.C16060sN) r3
            int r0 = r1.A01(r3)
            r1 = r20
            if (r0 < r1) goto L_0x0083
            r7.add(r5)
            goto L_0x0083
        L_0x00ae:
            X.1WS r3 = r2.A03()
            X.1WS r2 = r2.A02()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00bd
            r7 = 0
        L_0x00bd:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x00d3
            X.0tz r0 = r4.A00
            android.content.Context r1 = r0.A00
            X.03S r0 = new X.03S
            r0.<init>(r1)
            boolean r0 = r0.A03()
            r8 = 1
            if (r0 == 0) goto L_0x00d4
        L_0x00d3:
            r8 = 0
        L_0x00d4:
            boolean r0 = r2.A0A()
            r9 = r0 ^ 1
            X.1WS r0 = r2.A02()
            boolean r10 = r0.A0F
            boolean r0 = r3.A0A()
            r11 = r0 ^ 1
            X.1WS r0 = r3.A02()
            boolean r12 = r0.A0F
            X.2ez r6 = new X.2ez
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x00f2:
            r0 = move-exception
            if (r9 == 0) goto L_0x00f8
            r9.close()     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CE.A00(int):X.2ez");
    }
}
