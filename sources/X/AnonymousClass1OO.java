package X;

/* renamed from: X.1OO  reason: invalid class name */
public class AnonymousClass1OO implements C23541Cj {
    public final C26301Ne A00;
    public final C16180sb A01;

    public AnonymousClass1OO(C26301Ne r1, C16180sb r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APJ() {
        /*
            r23 = this;
            r4 = r23
            X.0sb r3 = r4.A01
            java.io.File r0 = r3.A07()
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            X.AnonymousClass1XI.A0E(r0, r1)
            java.io.File r0 = r3.A09()
            X.AnonymousClass1XI.A0E(r0, r1)
            X.1jH r0 = r3.A05()
            java.io.File r0 = r0.A06
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            X.AnonymousClass1XI.A0E(r0, r1)
            X.1jH r0 = r3.A05()
            java.io.File r0 = r0.A07
            X.AnonymousClass1XI.A0E(r0, r1)
            X.1Ne r2 = r4.A00
            X.0sC r0 = r2.A0B
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x01b2
            X.0sc r0 = r2.A03
            r17 = r0
            java.io.File r0 = r17.A05()
            if (r0 == 0) goto L_0x01b2
            int r0 = r2.A01()
            r5 = 5
            if (r0 == r5) goto L_0x01b2
            r7 = 1
            r6 = 0
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = "OBWhatsApp"
            java.io.File r9 = new java.io.File
            r9.<init>(r1, r0)
            java.io.File r8 = r17.A05()
            X.AnonymousClass00B.A06(r8)
            java.util.concurrent.atomic.AtomicBoolean r12 = r2.A0C
            boolean r0 = r12.compareAndSet(r6, r7)
            if (r0 == 0) goto L_0x01b2
            boolean r11 = r17.A0A()     // Catch:{ all -> 0x01ad }
            int r1 = r2.A01()     // Catch:{ all -> 0x01ad }
            if (r1 == r5) goto L_0x01a1
            X.0tH r0 = r2.A00     // Catch:{ all -> 0x01ad }
            boolean r0 = r0.A00     // Catch:{ all -> 0x01ad }
            r4 = 0
            if (r0 == 0) goto L_0x0078
            r2.A03(r4, r5)     // Catch:{ all -> 0x01ad }
            goto L_0x0084
        L_0x0078:
            X.0sj r0 = r2.A07     // Catch:{ all -> 0x01ad }
            boolean r0 = r0.A0B()     // Catch:{ all -> 0x01ad }
            if (r0 != 0) goto L_0x0087
            r0 = 7
            r2.A03(r4, r0)     // Catch:{ all -> 0x01ad }
        L_0x0084:
            r0 = 0
            goto L_0x01a2
        L_0x0087:
            boolean r0 = r9.exists()     // Catch:{ all -> 0x01ad }
            if (r0 != 0) goto L_0x009c
            if (r1 != 0) goto L_0x009c
            X.0rz r0 = r2.A08     // Catch:{ all -> 0x01ad }
            r0.A0g(r5)     // Catch:{ all -> 0x01ad }
            r2.A03(r4, r7)     // Catch:{ all -> 0x01ad }
            r0.A1E(r11)     // Catch:{ all -> 0x01ad }
            goto L_0x01a1
        L_0x009c:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x01ad }
            r10.<init>()     // Catch:{ all -> 0x01ad }
            r14 = 3
            if (r1 == 0) goto L_0x00b1
            r0 = 9
            if (r1 >= r14) goto L_0x00aa
            r0 = 8
        L_0x00aa:
            r2.A03(r4, r0)     // Catch:{ all -> 0x01ad }
            r0 = 2
            if (r1 <= r0) goto L_0x00d3
            goto L_0x00c8
        L_0x00b1:
            X.0rz r3 = r2.A08     // Catch:{ all -> 0x01ad }
            r3.A1E(r6)     // Catch:{ all -> 0x01ad }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01ad }
            android.content.SharedPreferences$Editor r15 = r3.A0K()     // Catch:{ all -> 0x01ad }
            java.lang.String r13 = "ext_dir_migration_start_time"
            android.content.SharedPreferences$Editor r0 = r15.putLong(r13, r0)     // Catch:{ all -> 0x01ad }
            r0.commit()     // Catch:{ all -> 0x01ad }
            goto L_0x00f3
        L_0x00c8:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x01ad }
            r0.<init>()     // Catch:{ all -> 0x01ad }
            r0.add(r8)     // Catch:{ all -> 0x01ad }
            r2.A04(r8, r10, r0)     // Catch:{ all -> 0x01ad }
        L_0x00d3:
            X.0rz r3 = r2.A08     // Catch:{ all -> 0x01ad }
            r0 = -1
            android.content.SharedPreferences$Editor r15 = r3.A0K()     // Catch:{ all -> 0x01ad }
            java.lang.String r13 = "ext_dir_migration_move_time"
            android.content.SharedPreferences$Editor r0 = r15.putLong(r13, r0)     // Catch:{ all -> 0x01ad }
            r0.commit()     // Catch:{ all -> 0x01ad }
            r0 = -1
            android.content.SharedPreferences$Editor r15 = r3.A0K()     // Catch:{ all -> 0x01ad }
            java.lang.String r13 = "ext_dir_migration_rescan_time"
            android.content.SharedPreferences$Editor r0 = r15.putLong(r13, r0)     // Catch:{ all -> 0x01ad }
            r0.commit()     // Catch:{ all -> 0x01ad }
        L_0x00f3:
            X.01D r0 = r3.A01     // Catch:{ all -> 0x01ad }
            java.lang.Object r15 = r0.get()     // Catch:{ all -> 0x01ad }
            android.content.SharedPreferences r15 = (android.content.SharedPreferences) r15     // Catch:{ all -> 0x01ad }
            java.lang.String r13 = "external_dir_migration_attempt_n"
            r0 = -1
            long r0 = r15.getLong(r13, r0)     // Catch:{ all -> 0x01ad }
            r15 = 1
            long r0 = r0 + r15
            android.content.SharedPreferences$Editor r15 = r3.A0K()     // Catch:{ all -> 0x01ad }
            android.content.SharedPreferences$Editor r0 = r15.putLong(r13, r0)     // Catch:{ all -> 0x01ad }
            r0.commit()     // Catch:{ all -> 0x01ad }
            r3.A0g(r7)     // Catch:{ all -> 0x01ad }
            r0 = r17
            X.01D r0 = r0.A03     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01ad }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x01ad }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x01ad }
            r1 = r0 ^ 1
            java.util.concurrent.atomic.AtomicBoolean r13 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x01ad }
            r13.<init>(r6)     // Catch:{ all -> 0x01ad }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ad }
            android.util.SparseIntArray r18 = new android.util.SparseIntArray     // Catch:{ all -> 0x01ad }
            r18.<init>()     // Catch:{ all -> 0x01ad }
            r22 = r11 ^ 1
            X.4Ll r0 = new X.4Ll     // Catch:{ all -> 0x01ad }
            r0.<init>(r2, r10, r13, r1)     // Catch:{ all -> 0x01ad }
            r19 = r0
            r20 = r9
            r21 = r8
            r17 = r2
            r17.A02(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01ad }
            r3.A0g(r14)     // Catch:{ all -> 0x01ad }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ad }
            long r0 = r0 - r15
            android.content.SharedPreferences$Editor r14 = r3.A0K()     // Catch:{ all -> 0x01ad }
            java.lang.String r8 = "ext_dir_migration_move_time"
            android.content.SharedPreferences$Editor r0 = r14.putLong(r8, r0)     // Catch:{ all -> 0x01ad }
            r0.commit()     // Catch:{ all -> 0x01ad }
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x01ad }
            if (r0 != 0) goto L_0x018b
            boolean r18 = r13.get()     // Catch:{ all -> 0x01ad }
            r0 = 4
            r3.A0g(r0)     // Catch:{ all -> 0x01ad }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ad }
            X.0tz r1 = r2.A06     // Catch:{ all -> 0x01ad }
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01ad }
            X.C26301Ne.A00(r0, r1, r9)     // Catch:{ all -> 0x01ad }
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01ad }
            X.C26301Ne.A00(r0, r1, r9)     // Catch:{ all -> 0x01ad }
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01ad }
            X.C26301Ne.A00(r0, r1, r9)     // Catch:{ all -> 0x01ad }
            X.55k r1 = new X.55k     // Catch:{ all -> 0x01ad }
            r17 = r11
            r13 = r1
            r14 = r2
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x01ad }
            X.0sb r0 = r2.A02     // Catch:{ all -> 0x01ad }
            r0.A0S(r1, r10)     // Catch:{ all -> 0x01ad }
            goto L_0x01a1
        L_0x018b:
            r3.A0g(r5)     // Catch:{ all -> 0x01ad }
            r2.A03(r4, r7)     // Catch:{ all -> 0x01ad }
            r3.A1E(r11)     // Catch:{ all -> 0x01ad }
            boolean r0 = r13.get()     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x01a1
            X.0zN r1 = r2.A09     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "ExternalDirMigration"
            r1.A05(r0)     // Catch:{ all -> 0x01ad }
        L_0x01a1:
            r0 = 1
        L_0x01a2:
            r12.set(r6)
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = "MessageIODailyCron/onDailyCronNoMessageStore: storage successfully migrated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01ad:
            r0 = move-exception
            r12.set(r6)
            throw r0
        L_0x01b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OO.APJ():void");
    }

    public /* synthetic */ void APK() {
    }
}
