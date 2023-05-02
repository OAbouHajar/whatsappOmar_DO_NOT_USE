package X;

/* renamed from: X.186  reason: invalid class name */
public class AnonymousClass186 {
    public final C17030uP A00;
    public final AnonymousClass17G A01;
    public final C16900tq A02;

    public AnonymousClass186(C17030uP r1, AnonymousClass17G r2, C16900tq r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r8 != null) goto L_0x0060;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C40521uG A00(long r10) {
        /*
            r9 = this;
            X.0tq r0 = r9.A02
            X.0tf r7 = r0.get()
            X.0tg r4 = r7.A02     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = "SELECT host_storage, actual_actors, privacy_mode_ts, business_name FROM message_privacy_state WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0067 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ all -> 0x0067 }
            r2[r1] = r0     // Catch:{ all -> 0x0067 }
            android.database.Cursor r8 = r4.A08(r3, r2)     // Catch:{ all -> 0x0067 }
            if (r8 == 0) goto L_0x005d
            java.lang.String r0 = "host_storage"
            int r3 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "actual_actors"
            int r2 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "privacy_mode_ts"
            int r1 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "business_name"
            int r6 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0058 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x005d
            X.1uG r5 = new X.1uG     // Catch:{ all -> 0x0058 }
            r5.<init>(r9)     // Catch:{ all -> 0x0058 }
            int r4 = r8.getInt(r3)     // Catch:{ all -> 0x0058 }
            int r3 = r8.getInt(r2)     // Catch:{ all -> 0x0058 }
            int r0 = r8.getInt(r1)     // Catch:{ all -> 0x0058 }
            long r1 = (long) r0     // Catch:{ all -> 0x0058 }
            X.1ta r0 = new X.1ta     // Catch:{ all -> 0x0058 }
            r0.<init>((int) r4, (long) r1, (int) r3)     // Catch:{ all -> 0x0058 }
            r5.A00 = r0     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = r8.getString(r6)     // Catch:{ all -> 0x0058 }
            r5.A01 = r0     // Catch:{ all -> 0x0058 }
            goto L_0x0060
        L_0x0058:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x005d:
            r5 = 0
            if (r8 == 0) goto L_0x0063
        L_0x0060:
            r8.close()     // Catch:{ all -> 0x0067 }
        L_0x0063:
            r7.close()
            return r5
        L_0x0067:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass186.A00(long):X.1uG");
    }

    public void A01(long j2) {
        C16800tf A022 = this.A02.A02();
        try {
            A022.A02.A01("message_privacy_state", "message_row_id = ?", new String[]{String.valueOf(j2)});
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
