package X;

/* renamed from: X.170  reason: invalid class name */
public final class AnonymousClass170 {
    public final C16900tq A00;

    public AnonymousClass170(C16900tq r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C41191vO.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        X.C41191vO.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(long r7) {
        /*
            r6 = this;
            X.0tq r0 = r6.A00
            X.0tf r3 = r0.get()
            X.0tg r5 = r3.A02     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "SELECT pn_requested_ts FROM lid_chat_state WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x003e }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x003e }
            r2[r1] = r0     // Catch:{ all -> 0x003e }
            android.database.Cursor r2 = r5.A08(r4, r2)     // Catch:{ all -> 0x003e }
            X.C18450wi.A0B(r2)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "pn_requested_ts"
            int r1 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0037 }
            if (r1 < 0) goto L_0x002e
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x002e
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x0037 }
            goto L_0x0030
        L_0x002e:
            r0 = 0
        L_0x0030:
            r2.close()     // Catch:{ all -> 0x003e }
            r3.close()
            return r0
        L_0x0037:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            X.C41191vO.A00(r2, r1)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.C41191vO.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass170.A00(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C41191vO.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        X.C41191vO.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean A01(long r7) {
        /*
            r6 = this;
            X.0tq r0 = r6.A00
            X.0tf r4 = r0.get()
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x0046 }
            java.lang.String r3 = "SELECT is_pn_shared FROM lid_chat_state WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0046 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0046 }
            r2[r1] = r0     // Catch:{ all -> 0x0046 }
            android.database.Cursor r3 = r5.A08(r3, r2)     // Catch:{ all -> 0x0046 }
            X.C18450wi.A0B(r3)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "is_pn_shared"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r1 < 0) goto L_0x0038
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0038
            int r1 = r3.getInt(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0036
            r0 = 1
            if (r1 != r0) goto L_0x0038
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x003f }
            goto L_0x0038
        L_0x0036:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x003f }
        L_0x0038:
            r3.close()     // Catch:{ all -> 0x0046 }
            r4.close()
            return r2
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.C41191vO.A00(r3, r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            X.C41191vO.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass170.A01(long):java.lang.Boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C41191vO.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        X.C41191vO.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(long r7) {
        /*
            r6 = this;
            X.0tq r0 = r6.A00
            X.0tf r4 = r0.get()
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x0040 }
            java.lang.String r3 = "SELECT pnh_duplicate_lid_thread FROM lid_chat_state WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0040 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0040 }
            r2[r1] = r0     // Catch:{ all -> 0x0040 }
            android.database.Cursor r3 = r5.A08(r3, r2)     // Catch:{ all -> 0x0040 }
            X.C18450wi.A0B(r3)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "pnh_duplicate_lid_thread"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0039 }
            r2 = 0
            if (r1 < 0) goto L_0x0032
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0032
            int r1 = r3.getInt(r1)     // Catch:{ all -> 0x0039 }
            r0 = 1
            if (r1 != r0) goto L_0x0032
            r2 = 1
        L_0x0032:
            r3.close()     // Catch:{ all -> 0x0040 }
            r4.close()
            return r2
        L_0x0039:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            X.C41191vO.A00(r3, r1)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            X.C41191vO.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass170.A02(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.C41191vO.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C41191vO.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(long r7, long r9) {
        /*
            r6 = this;
            X.0tq r0 = r6.A00     // Catch:{ all -> 0x0043 }
            X.0tf r5 = r0.A02()     // Catch:{ all -> 0x0043 }
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x003c }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0035 }
            r3.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0035 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "pn_requested_ts"
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0035 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0035 }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "lid_chat_state"
            r0 = 5
            r2.A06(r3, r1, r0)     // Catch:{ all -> 0x0035 }
            r4.A00()     // Catch:{ all -> 0x0035 }
            r4.close()     // Catch:{ all -> 0x003c }
            r5.close()     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0043 }
            goto L_0x0049
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.C41191vO.A00(r4, r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.C41191vO.A00(r5, r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.1vQ r2 = new X.1vQ
            r2.<init>(r0)
        L_0x0049:
            java.lang.Throwable r1 = X.C41201vP.A00(r2)
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = "{LidChatStateStore/}failed to set phone requested time"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0055:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = r2 instanceof X.C41211vQ
            if (r0 == 0) goto L_0x005c
            r2 = r1
        L_0x005c:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass170.A03(long, long):boolean");
    }
}
