package X;

/* renamed from: X.36d  reason: invalid class name and case insensitive filesystem */
public class C607936d extends C16690tT {
    public boolean A00 = false;
    public final C17130ua A01;
    public final C440622p A02;
    public final C19970zI A03;
    public final C19950zG A04;
    public final C17670vS A05;
    public final C34531kQ A06 = new C34531kQ(1, 1000);
    public final Integer A07;
    public final Object A08;
    public final String A09;
    public final String A0A;

    public C607936d(C17130ua r6, C440622p r7, C19970zI r8, C19950zG r9, C17670vS r10, Integer num, Object obj, String str, String str2) {
        this.A01 = r6;
        this.A05 = r10;
        this.A03 = r8;
        this.A04 = r9;
        this.A0A = str;
        this.A09 = str2;
        this.A08 = obj;
        this.A02 = r7;
        this.A07 = num;
        if (r8 instanceof AnonymousClass1N0) {
            AnonymousClass1N0 r82 = (AnonymousClass1N0) r8;
            r82.A00 = r82.A0A();
            r82.A01 = Long.valueOf(r82.A06.A00());
            r82.A0B.A06(r82.A00);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:45|46|47|48|49) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a9, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r0 = X.AnonymousClass000.A0q("FetchAssetAsyncTask: ");
        r0.append(r11);
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0e(r2, " Exception: ", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0140, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0143, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00a8 */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00c1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r16) {
        /*
            r15 = this;
            java.lang.String r11 = r15.A0A
            X.1kQ r6 = r15.A06
            r6.A02()
            X.0zI r4 = r15.A03
            r13 = 0
            java.lang.String r1 = r4.A01(r13)
            boolean r0 = r4.A08(r13)
            if (r0 == 0) goto L_0x0015
            r13 = r1
        L_0x0015:
            r5 = 0
        L_0x0016:
            int r0 = r4.A00
            if (r5 >= r0) goto L_0x00f8
            java.lang.String r12 = r15.A09
            java.lang.String r8 = "FetchAssetAsyncTask: "
            r0 = 14
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.0zG r9 = r15.A04     // Catch:{ Exception -> 0x00a9 }
            X.0vS r10 = r15.A05     // Catch:{ Exception -> 0x00a9 }
            r14 = 0
            X.1pl r2 = r9.A7K(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00a9 }
            int r1 = r2.A6O()     // Catch:{ all -> 0x00a4 }
            r0 = 304(0x130, float:4.26E-43)
            if (r1 != r0) goto L_0x0038
            r4.A02()     // Catch:{ all -> 0x00a4 }
            goto L_0x008c
        L_0x0038:
            int r1 = r2.A6O()     // Catch:{ all -> 0x00a4 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0044
            r2.A6O()     // Catch:{ all -> 0x00a4 }
            goto L_0x0099
        L_0x0044:
            X.0ua r1 = r15.A01     // Catch:{ all -> 0x00a4 }
            java.lang.Integer r0 = r15.A07     // Catch:{ all -> 0x00a4 }
            java.io.InputStream r7 = r2.A9k(r1, r14, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "signature"
            java.lang.String r0 = r2.AHk(r0)     // Catch:{ all -> 0x009d }
            byte[] r3 = X.C30311c8.A08(r7)     // Catch:{ all -> 0x009d }
            boolean r0 = r4.A09(r0, r3)     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "Is-Encrypted"
            r2.AHk(r0)     // Catch:{ all -> 0x009d }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x009d }
            r1.<init>(r3)     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = r15.A08     // Catch:{ all -> 0x009d }
            boolean r0 = r4.A07(r1, r0)     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0094
            boolean r0 = r4.A05()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0087
            r4.A02()     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "etag"
            java.lang.String r1 = r2.AHk(r0)     // Catch:{ all -> 0x009d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0087
            r4.A04(r14, r1)     // Catch:{ all -> 0x009d }
        L_0x0087:
            if (r7 == 0) goto L_0x008c
            r7.close()     // Catch:{ all -> 0x00a4 }
        L_0x008c:
            r2.close()     // Catch:{ Exception -> 0x00a9 }
            android.net.TrafficStats.clearThreadStatsTag()
            r0 = 1
            goto L_0x00be
        L_0x0094:
            if (r7 == 0) goto L_0x0099
            r7.close()     // Catch:{ all -> 0x00a4 }
        L_0x0099:
            r2.close()     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00ba
        L_0x009d:
            r0 = move-exception
            if (r7 == 0) goto L_0x00a3
            r7.close()     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            throw r0     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            r2 = move-exception
            java.lang.String r1 = " Exception: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r8)     // Catch:{ all -> 0x013f }
            r0.append(r11)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = X.AnonymousClass000.A0e(r2, r1, r0)     // Catch:{ all -> 0x013f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x013f }
        L_0x00ba:
            android.net.TrafficStats.clearThreadStatsTag()
            r0 = 0
        L_0x00be:
            r2 = 1
            if (r0 == 0) goto L_0x0123
            boolean r0 = r4 instanceof X.AnonymousClass1N0
            if (r0 == 0) goto L_0x00f3
            r3 = r4
            X.1N0 r3 = (X.AnonymousClass1N0) r3
            X.3sE r7 = r3.A0A()
            r3.A00 = r7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.A00 = r0
            long r0 = (long) r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A03 = r0
            X.0t3 r0 = r3.A06
            long r5 = r0.A00()
            java.lang.Long r0 = r3.A01
            long r0 = r0.longValue()
            long r5 = r5 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r7.A04 = r0
            X.0t9 r1 = r3.A0B
            X.3sE r0 = r3.A00
            r1.A06(r0)
        L_0x00f3:
            r4.A08 = r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00f8:
            boolean r0 = r4 instanceof X.AnonymousClass1N0
            if (r0 == 0) goto L_0x0129
            X.1N0 r4 = (X.AnonymousClass1N0) r4
            X.3sE r5 = r4.A0A()
            r4.A00 = r5
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.A00 = r0
            X.0t3 r0 = r4.A06
            long r2 = r0.A00()
            java.lang.Long r0 = r4.A01
            long r0 = r0.longValue()
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A04 = r0
            X.0t9 r1 = r4.A0B
            X.3sE r0 = r4.A00
            r1.A06(r0)
            goto L_0x0129
        L_0x0123:
            int r0 = r4.A01
            if (r5 != r0) goto L_0x012c
            r15.A00 = r2
        L_0x0129:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x012c:
            int r0 = r4.A00
            int r0 = r0 - r2
            if (r5 >= r0) goto L_0x013b
            long r2 = r6.A01()     // Catch:{ InterruptedException -> 0x013b }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x013b }
        L_0x013b:
            int r5 = r5 + 1
            goto L_0x0016
        L_0x013f:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C607936d.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Boolean bool = (Boolean) obj;
        this.A03.A09 = false;
        C440622p r1 = this.A02;
        if (r1 == null) {
            return;
        }
        if (bool.booleanValue()) {
            r1.onSuccess();
        } else if (this.A00) {
            r1.AYu();
        } else {
            r1.AQQ();
        }
    }
}
