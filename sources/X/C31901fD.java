package X;

/* renamed from: X.1fD  reason: invalid class name and case insensitive filesystem */
public class C31901fD {
    public final C16440t3 A00;
    public final C002601d A01;

    public C31901fD(C16440t3 r1, C002601d r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static String A00(String str, boolean z2) {
        StringBuilder sb = new StringBuilder("sender_id = ? AND sender_type = ? AND device_id = ? AND group_id");
        sb.append(z2 ? " = '" : " != '");
        sb.append(str);
        sb.append("' AND ");
        sb.append("timestamp");
        sb.append(" < ?");
        return sb.toString();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0066 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C31911fE A01(X.C30981dH r14) {
        /*
            r13 = this;
            java.lang.String r1 = "timestamp"
            java.lang.String r2 = "record"
            java.lang.String r3 = "SenderKeyStore/getSenderKey/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01d r0 = r13.A01
            X.0tf r4 = r0.get()
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "sender_keys"
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x0067 }
            r0 = 0
            r7[r0] = r2     // Catch:{ all -> 0x0067 }
            r0 = 1
            r7[r0] = r1     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r9 = r14.A00()     // Catch:{ all -> 0x0067 }
            r10 = 0
            r12 = r10
            r11 = r10
            android.database.Cursor r5 = r5.A09(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0067 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0044
            r5.close()     // Catch:{ all -> 0x0067 }
            r4.close()
            return r10
        L_0x0044:
            int r0 = r5.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0060 }
            byte[] r3 = r5.getBlob(r0)     // Catch:{ all -> 0x0060 }
            int r0 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0060 }
            long r1 = r5.getLong(r0)     // Catch:{ all -> 0x0060 }
            X.1fE r0 = new X.1fE     // Catch:{ all -> 0x0060 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0060 }
            r5.close()     // Catch:{ all -> 0x0067 }
            r4.close()
            return r0
        L_0x0060:
            r0 = move-exception
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ all -> 0x0066 }
        L_0x0066:
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31901fD.A01(X.1dH):X.1fE");
    }
}
