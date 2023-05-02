package X;

/* renamed from: X.1f9  reason: invalid class name and case insensitive filesystem */
public class C31861f9 {
    public final C16440t3 A00;
    public final C002601d A01;

    public C31861f9(C16440t3 r1, C002601d r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C31871fA A00(X.C30981dH r14) {
        /*
            r13 = this;
            java.lang.String r1 = "record"
            X.01d r0 = r13.A01
            X.0tf r4 = r0.get()
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = "fast_ratchet_sender_keys"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x0050 }
            r0 = 0
            r7[r0] = r1     // Catch:{ all -> 0x0050 }
            java.lang.String r8 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r9 = r14.A00()     // Catch:{ all -> 0x0050 }
            r10 = 0
            r12 = r10
            r11 = r10
            android.database.Cursor r6 = r5.A09(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0050 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x002c
            r6.close()     // Catch:{ all -> 0x0050 }
            r4.close()
            return r10
        L_0x002c:
            int r0 = r6.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0049 }
            byte[] r5 = r6.getBlob(r0)     // Catch:{ all -> 0x0049 }
            X.0t3 r0 = r13.A00     // Catch:{ all -> 0x0049 }
            long r2 = r0.A00()     // Catch:{ all -> 0x0049 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            X.1fA r0 = new X.1fA     // Catch:{ all -> 0x0049 }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x0049 }
            r6.close()     // Catch:{ all -> 0x0050 }
            r4.close()
            return r0
        L_0x0049:
            r0 = move-exception
            if (r6 == 0) goto L_0x004f
            r6.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31861f9.A00(X.1dH):X.1fA");
    }
}
