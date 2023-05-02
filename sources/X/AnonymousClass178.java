package X;

/* renamed from: X.178  reason: invalid class name */
public class AnonymousClass178 {
    public final AnonymousClass03L A00 = new AnonymousClass03L(2500);
    public final C216314v A01;
    public final C16900tq A02;

    public AnonymousClass178(C216314v r3, C16900tq r4) {
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = r3.A02.A08("SELECT version FROM primary_device_version WHERE user_jid_row_id = ?", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r2.moveToNext() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0 = r2.getLong(r2.getColumnIndexOrThrow("version"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = java.lang.Long.valueOf(r0);
        r4.A06(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0053, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
        if (r2 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0063, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r5 = new java.lang.String[]{java.lang.String.valueOf(r6.A01.A01(r7))};
        r3 = r6.A02.get();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Long A00(com.whatsapp.jid.UserJid r7) {
        /*
            r6 = this;
            X.03L r4 = r6.A00
            monitor-enter(r4)
            java.lang.Object r0 = r4.A02(r7)     // Catch:{ all -> 0x0064 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            return r0
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            r2 = 0
            X.14v r0 = r6.A01
            long r0 = r0.A01(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r2] = r0
            X.0tq r0 = r6.A02
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "SELECT version FROM primary_device_version WHERE user_jid_row_id = ?"
            android.database.Cursor r2 = r1.A08(r0, r5)     // Catch:{ all -> 0x005f }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "version"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0058 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0058 }
            monitor-enter(r4)     // Catch:{ all -> 0x0058 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x004d }
            r4.A06(r7, r0)     // Catch:{ all -> 0x004d }
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            r2.close()     // Catch:{ all -> 0x005f }
            r3.close()
            return r0
        L_0x004d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0050:
            r2.close()     // Catch:{ all -> 0x005f }
            r3.close()
            r0 = 0
            return r0
        L_0x0058:
            r0 = move-exception
            if (r2 == 0) goto L_0x005e
            r2.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            throw r0
        L_0x0064:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass178.A00(com.whatsapp.jid.UserJid):java.lang.Long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00ce */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A01(java.util.Set r12) {
        /*
            r11 = this;
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.03L r8 = r11.A00
            monitor-enter(r8)
            java.util.Iterator r2 = r12.iterator()     // Catch:{ all -> 0x00d8 }
        L_0x0011:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0031
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00d8 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x00d8 }
            java.lang.Object r0 = r8.A02(r1)     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r8.A02(r1)     // Catch:{ all -> 0x00d8 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00d8 }
            r10.put(r1, r0)     // Catch:{ all -> 0x00d8 }
            goto L_0x0011
        L_0x002d:
            r3.add(r1)     // Catch:{ all -> 0x00d8 }
            goto L_0x0011
        L_0x0031:
            monitor-exit(r8)     // Catch:{ all -> 0x00d8 }
            int r0 = r3.size()
            java.lang.String[] r4 = new java.lang.String[r0]
            r5 = 0
            java.util.Iterator r3 = r3.iterator()
        L_0x003d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r3.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            int r2 = r5 + 1
            X.14v r0 = r11.A01
            long r0 = r0.A01(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4[r5] = r0
            r5 = r2
            goto L_0x003d
        L_0x0059:
            X.0tq r0 = r11.A02
            X.0tf r7 = r0.get()
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r9 = new X.1jh     // Catch:{ all -> 0x00d3 }
            r9.<init>(r4, r0)     // Catch:{ all -> 0x00d3 }
        L_0x0066:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r4 = r9.next()     // Catch:{ all -> 0x00d3 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x00d3 }
            X.0tg r3 = r7.A02     // Catch:{ all -> 0x00d3 }
            int r2 = r4.length     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "SELECT user_jid_row_id, version FROM primary_device_version WHERE user_jid_row_id IN "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = X.C34111ji.A00(r2)     // Catch:{ all -> 0x00d3 }
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d3 }
            android.database.Cursor r6 = r3.A08(r0, r4)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "user_jid_row_id"
            int r5 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "version"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c8 }
        L_0x0099:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c1
            X.14v r3 = r11.A01     // Catch:{ all -> 0x00c8 }
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            long r0 = r6.getLong(r5)     // Catch:{ all -> 0x00c8 }
            com.whatsapp.jid.Jid r2 = r3.A07(r2, r0)     // Catch:{ all -> 0x00c8 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x00c8 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x00c8 }
            long r0 = r6.getLong(r4)     // Catch:{ all -> 0x00c8 }
            monitor-enter(r8)     // Catch:{ all -> 0x00c8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c5 }
            r8.A06(r2, r0)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r8)     // Catch:{ all -> 0x00c5 }
            r10.put(r2, r0)     // Catch:{ all -> 0x00c8 }
            goto L_0x0099
        L_0x00c1:
            r6.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x0066
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c5 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            if (r6 == 0) goto L_0x00ce
            r6.close()     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00cf:
            r7.close()
            return r10
        L_0x00d3:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            throw r0
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00d8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass178.A01(java.util.Set):java.util.Map");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A02(com.whatsapp.jid.UserJid r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.Long r0 = r9.A00(r10)     // Catch:{ all -> 0x0050 }
            r7 = 1
            if (r0 == 0) goto L_0x000e
            long r0 = r0.longValue()     // Catch:{ all -> 0x0050 }
            long r7 = r7 + r0
        L_0x000e:
            X.14v r0 = r9.A01     // Catch:{ all -> 0x0050 }
            long r5 = r0.A01(r10)     // Catch:{ all -> 0x0050 }
            X.0tq r0 = r9.A02     // Catch:{ all -> 0x0050 }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x0050 }
            r0 = 2
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x004b }
            r3.<init>(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "user_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x004b }
            r3.put(r1, r0)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "version"
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x004b }
            r3.put(r1, r0)     // Catch:{ all -> 0x004b }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "primary_device_version"
            r0 = 5
            r2.A06(r3, r1, r0)     // Catch:{ all -> 0x004b }
            X.03L r1 = r9.A00     // Catch:{ all -> 0x004b }
            monitor-enter(r1)     // Catch:{ all -> 0x004b }
            r1.A03(r10)     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            r4.close()     // Catch:{ all -> 0x0050 }
            monitor-exit(r9)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass178.A02(com.whatsapp.jid.UserJid):void");
    }
}
