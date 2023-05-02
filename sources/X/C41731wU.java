package X;

/* renamed from: X.1wU  reason: invalid class name and case insensitive filesystem */
public class C41731wU {
    public final C16460t6 A00;
    public final AnonymousClass17I A01;
    public final C16480t8 A02;
    public final C16900tq A03;
    public final C41721wT A04;
    public final C25791Ld A05;

    public C41731wU(C16460t6 r1, AnonymousClass17I r2, C16480t8 r3, C16900tq r4, C41721wT r5, C25791Ld r6) {
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00de */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1YK A00(X.AnonymousClass024 r16, int r17, int r18) {
        /*
            r15 = this;
            r16.A02()
            r4 = 0
            X.0tq r0 = r15.A03     // Catch:{ 057 -> 0x00e6, RuntimeException -> 0x00df }
            X.0tf r14 = r0.get()     // Catch:{ 057 -> 0x00e6, RuntimeException -> 0x00df }
            X.0t8 r0 = r15.A02     // Catch:{ all -> 0x00da }
            r11 = 2
            r12 = r18
            android.database.Cursor r7 = X.C14740pg.A02(r0, r4, r12, r11)     // Catch:{ all -> 0x00da }
            r16.A02()     // Catch:{ all -> 0x00d3 }
            X.0t6 r0 = r15.A00     // Catch:{ all -> 0x00d3 }
            X.0tt r10 = new X.0tt     // Catch:{ all -> 0x00d3 }
            r10.<init>(r7, r0, r4, r4)     // Catch:{ all -> 0x00d3 }
            r1 = 0
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00d3 }
            r8.<init>()     // Catch:{ all -> 0x00d3 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00d3 }
            r9.<init>()     // Catch:{ all -> 0x00d3 }
            X.17I r0 = r15.A01     // Catch:{ all -> 0x00d3 }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "file_size"
        L_0x0033:
            int r13 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d3 }
            r3 = 0
            boolean r0 = r10.moveToFirst()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x006d
        L_0x003e:
            r16.A02()     // Catch:{ all -> 0x00d3 }
            long r5 = r7.getLong(r13)     // Catch:{ all -> 0x00d3 }
            long r1 = r1 + r5
            r0 = r17
            if (r3 >= r0) goto L_0x0065
            X.0tY r5 = r10.A00()     // Catch:{ all -> 0x00d3 }
            X.AnonymousClass00B.A06(r5)     // Catch:{ all -> 0x00d3 }
            X.1Ld r0 = r15.A05     // Catch:{ all -> 0x00d3 }
            X.2BE r0 = X.AnonymousClass3A5.A00(r5, r0)     // Catch:{ all -> 0x00d3 }
            r8.add(r0)     // Catch:{ all -> 0x00d3 }
            X.0tY r0 = r0.A03     // Catch:{ all -> 0x00d3 }
            long r5 = r0.A13     // Catch:{ all -> 0x00d3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00d3 }
            r9.add(r0)     // Catch:{ all -> 0x00d3 }
        L_0x0065:
            int r3 = r3 + 1
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x003e
        L_0x006d:
            int r6 = r10.getCount()     // Catch:{ all -> 0x00d3 }
            r10.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x0078
        L_0x0075:
            java.lang.String r0 = "media_size"
            goto L_0x0033
        L_0x0078:
            if (r12 != r11) goto L_0x00a1
            X.1wT r5 = r15.A04     // Catch:{ all -> 0x00d3 }
            X.1CW r10 = r5.A01     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = "STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE"
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d3 }
            r10.A05(r3, r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = "STORAGE_USAGE_LARGE_FILES_COUNT"
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00d3 }
            r10.A05(r3, r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = "STORAGE_USAGE_LARGE_FILES_ROW_IDS"
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r9)     // Catch:{ all -> 0x00d3 }
            r10.A05(r3, r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_CACHE_TIME"
            r5.A01(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x00c7
        L_0x00a1:
            X.1wT r5 = r15.A04     // Catch:{ all -> 0x00d3 }
            X.1CW r10 = r5.A01     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = "STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE"
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d3 }
            r10.A05(r3, r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = "STORAGE_USAGE_FORWARDED_FILES_COUNT"
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00d3 }
            r10.A05(r3, r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = "STORAGE_USAGE_FORWARDED_FILES_ROW_IDS"
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r9)     // Catch:{ all -> 0x00d3 }
            r10.A05(r3, r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME"
            r5.A01(r0)     // Catch:{ all -> 0x00d3 }
        L_0x00c7:
            X.1YK r0 = new X.1YK     // Catch:{ all -> 0x00d3 }
            r0.<init>(r8, r6, r1)     // Catch:{ all -> 0x00d3 }
            r7.close()     // Catch:{ all -> 0x00da }
            r14.close()     // Catch:{ 057 -> 0x00e6, RuntimeException -> 0x00df }
            return r0
        L_0x00d3:
            r0 = move-exception
            if (r7 == 0) goto L_0x00d9
            r7.close()     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x00de }
        L_0x00de:
            throw r0     // Catch:{ 057 -> 0x00e6, RuntimeException -> 0x00df }
        L_0x00df:
            r1 = move-exception
            java.lang.String r0 = "StorageUsageDbFetcher/fetchMediaFilesSummary"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x00e6:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41731wU.A00(X.024, int, int):X.1YK");
    }
}
