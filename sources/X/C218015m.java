package X;

import android.content.ContentValues;

/* renamed from: X.15m  reason: invalid class name and case insensitive filesystem */
public class C218015m {
    public final C16920ts A00;
    public final C16900tq A01;

    public C218015m(C16920ts r1, C16900tq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(C15840rx r14) {
        ContentValues contentValues;
        Throwable th;
        synchronized (r14) {
            contentValues = new ContentValues();
            contentValues.put("last_activity_ts", Long.valueOf(r14.A0I));
            contentValues.put("last_activity_seen_ts", Long.valueOf(r14.A0H));
            contentValues.put("join_ts", Long.valueOf(r14.A0G));
            contentValues.put("closed", Boolean.valueOf(r14.A0g));
        }
        C15830rv r10 = r14.A0i;
        C16900tq r7 = this.A01;
        C16800tf A02 = r7.A02();
        try {
            C16920ts r8 = this.A00;
            long A022 = r8.A02(r10);
            int A002 = A02.A02.A00("community_chat", contentValues, "chat_row_id = ?", new String[]{String.valueOf(A022)});
            A02.close();
            if (A002 == 0) {
                contentValues.put("chat_row_id", Long.valueOf(r8.A02(r10)));
                C16800tf A023 = r7.A02();
                try {
                    long A024 = A023.A02.A02(contentValues, "community_chat");
                    A023.close();
                    r14.A0U = A024;
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            A02.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c3, code lost:
        if (r6 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00c8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.Map r19) {
        /*
            r18 = this;
            java.lang.String r0 = "CommunityChatStore/loadData"
            X.1Zf r7 = new X.1Zf
            r7.<init>((java.lang.String) r0)
            r13 = r18
            X.0tq r0 = r13.A01
            X.0tf r12 = r0.get()
            X.0tg r2 = r12.A02     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = "SELECT chat_row_id, last_activity_ts, last_activity_seen_ts, join_ts, closed FROM community_chat"
            r0 = 0
            android.database.Cursor r6 = r2.A08(r1, r0)     // Catch:{ all -> 0x00c9 }
            if (r6 != 0) goto L_0x0024
            java.lang.String r0 = "null"
            r7.A02(r0)     // Catch:{ all -> 0x00c2 }
            r7.A01()     // Catch:{ all -> 0x00c2 }
            goto L_0x00be
        L_0x0024:
            java.lang.String r0 = "chat_row_id"
            int r5 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "last_activity_ts"
            int r8 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "last_activity_seen_ts"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "join_ts"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "closed"
            int r2 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c2 }
        L_0x0042:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00b8
            X.0ts r9 = r13.A00     // Catch:{ all -> 0x00c2 }
            long r0 = r6.getLong(r5)     // Catch:{ all -> 0x00c2 }
            X.0rv r10 = r9.A05(r0)     // Catch:{ all -> 0x00c2 }
            if (r10 != 0) goto L_0x006d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "CommunityChatStore/failed to find chatJid by row id: "
            r9.append(r0)     // Catch:{ all -> 0x00c2 }
            long r0 = r6.getLong(r5)     // Catch:{ all -> 0x00c2 }
            r9.append(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x00c2 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x0042
        L_0x006d:
            r11 = r19
            java.lang.Object r14 = r11.get(r10)     // Catch:{ all -> 0x00c2 }
            r9 = r14
            X.0rx r9 = (X.C15840rx) r9     // Catch:{ all -> 0x00c2 }
            if (r9 != 0) goto L_0x008d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r1.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "CommunityChatStore/missing chat in map: "
            r1.append(r0)     // Catch:{ all -> 0x00c2 }
            r1.append(r10)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c2 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x0042
        L_0x008d:
            long r0 = r6.getLong(r8)     // Catch:{ all -> 0x00c2 }
            monitor-enter(r14)     // Catch:{ all -> 0x00c2 }
            r9.A0I = r0     // Catch:{ all -> 0x00b5 }
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            long r0 = r6.getLong(r4)     // Catch:{ all -> 0x00c2 }
            monitor-enter(r14)     // Catch:{ all -> 0x00c2 }
            r9.A0H = r0     // Catch:{ all -> 0x00b5 }
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            long r0 = r6.getLong(r3)     // Catch:{ all -> 0x00c2 }
            r9.A0G = r0     // Catch:{ all -> 0x00c2 }
            long r16 = r6.getLong(r2)     // Catch:{ all -> 0x00c2 }
            r14 = 1
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x00af
            r0 = 1
        L_0x00af:
            r9.A0g = r0     // Catch:{ all -> 0x00c2 }
            r11.put(r10, r9)     // Catch:{ all -> 0x00c2 }
            goto L_0x0042
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00b8:
            r7.A01()     // Catch:{ all -> 0x00c2 }
            r6.close()     // Catch:{ all -> 0x00c9 }
        L_0x00be:
            r12.close()
            return
        L_0x00c2:
            r0 = move-exception
            if (r6 == 0) goto L_0x00c8
            r6.close()     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218015m.A01(java.util.Map):void");
    }
}
