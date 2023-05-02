package X;

/* renamed from: X.0yH  reason: invalid class name and case insensitive filesystem */
public class C19340yH implements C19140xp {
    public final C17130ua A00;
    public final C18260wP A01;
    public final C16440t3 A02;
    public final C16450t5 A03;
    public final C16420t0 A04;
    public final C17670vS A05;
    public final C17660vR A06;

    public C19340yH(C17130ua r1, C18260wP r2, C16440t3 r3, C16450t5 r4, C16420t0 r5, C17670vS r6, C17660vR r7) {
        this.A02 = r3;
        this.A06 = r7;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:199|200|201|202|203) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        if ((r8 - r2.A05.A05[r2.A02].A04) > 600) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0508, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0509, code lost:
        com.whatsapp.util.Log.e("PrivateStatsUploader/doUpload error", r1);
        r2 = android.util.Pair.create(6, 0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x0430 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:202:0x0507 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0302 A[SYNTHETIC, Splitter:B:114:0x0302] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x051f A[LOOP:0: B:25:0x008a->B:208:0x051f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0251 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C29171a9 r40, int r41, boolean r42, boolean r43, boolean r44) {
        /*
            r39 = this;
            r7 = r39
            X.0wP r0 = r7.A01
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x006c
            X.0t0 r0 = r7.A04
            r27 = r0
            int r1 = r27.A00()
            r0 = 2
            r4 = 0
            r3 = 1
            r38 = r40
            r35 = r42
            if (r1 == r0) goto L_0x005d
            r0 = 13
            if (r1 == r0) goto L_0x005d
            r0 = 15
            if (r1 == r0) goto L_0x005d
            if (r44 != 0) goto L_0x005d
            r0 = r38
            X.1aA r10 = r0.A04
            boolean r0 = r10.AHV()
            if (r0 != 0) goto L_0x005d
            X.1aB r0 = r10.A7h()
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x005d
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r8 = r2.toSeconds(r0)
            r5 = 600(0x258, double:2.964E-321)
            if (r42 != 0) goto L_0x005a
            X.1aB r2 = r10.A7h()
            X.2I6 r0 = r2.A05
            X.2I7[] r1 = r0.A05
            int r0 = r2.A02
            r0 = r1[r0]
            long r0 = r0.A04
            long r8 = r8 - r0
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x005d
        L_0x005a:
            r38.A02()
        L_0x005d:
            r0 = r38
            X.1aA r0 = r0.A04
            r37 = r0
            boolean r0 = r37.AHV()
            if (r0 != 0) goto L_0x006d
            r27.A01()
        L_0x006c:
            return
        L_0x006d:
            r0 = r38
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0076
            r38.A01()
        L_0x0076:
            android.util.SparseArray r26 = r37.ABd()
            int r1 = r26.size()
            java.util.ArrayList r24 = new java.util.ArrayList
            r0 = r24
            r0.<init>(r1)
            r26.size()
            r25 = 0
        L_0x008a:
            int r1 = r26.size()
            r32 = r41
            r36 = r43
            r0 = r25
            if (r0 >= r1) goto L_0x0255
            r1 = r26
            int r31 = r1.keyAt(r0)
            long r16 = android.os.SystemClock.elapsedRealtime()
            r0 = r31
            java.lang.Object r30 = r1.get(r0)
            r0 = r30
            byte[] r0 = (byte[]) r0
            r30 = r0
            java.lang.String r9 = "\r\n"
            r0 = 5
            java.lang.Integer r29 = java.lang.Integer.valueOf(r0)
            r28 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r0 = r29
            android.util.Pair r2 = android.util.Pair.create(r0, r8)
            monitor-enter(r27)
            boolean r0 = r27.A07()     // Catch:{ all -> 0x0523 }
            r5 = 0
            if (r0 != 0) goto L_0x0131
            r0 = r27
            X.0t1 r6 = r0.A05     // Catch:{ all -> 0x0523 }
            android.content.SharedPreferences r1 = r6.A00()     // Catch:{ all -> 0x0523 }
            java.lang.String r0 = "original_token"
            java.lang.String r11 = r1.getString(r0, r5)     // Catch:{ all -> 0x0523 }
            if (r11 == 0) goto L_0x0112
            android.content.SharedPreferences r10 = r6.A00()     // Catch:{ all -> 0x0523 }
            java.lang.String r1 = "redeem_count"
            r0 = -1
            int r12 = r10.getInt(r1, r0)     // Catch:{ all -> 0x0523 }
            r0 = r27
            X.0t3 r0 = r0.A03     // Catch:{ all -> 0x0523 }
            long r18 = r0.A00()     // Catch:{ all -> 0x0523 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 / r0
            android.content.SharedPreferences r13 = r6.A00()     // Catch:{ all -> 0x0523 }
            java.lang.String r10 = "base_timestamp"
            r0 = 0
            long r13 = r13.getLong(r10, r0)     // Catch:{ all -> 0x0523 }
            long r18 = r18 - r13
            if (r12 < 0) goto L_0x0112
            r10 = 512(0x200, float:7.175E-43)
            if (r12 >= r10) goto L_0x0112
            android.content.SharedPreferences r12 = r6.A00()     // Catch:{ all -> 0x0523 }
            java.lang.String r10 = "time_to_live"
            long r12 = r12.getLong(r10, r0)     // Catch:{ all -> 0x0523 }
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0112
            goto L_0x0134
        L_0x0112:
            r0 = r27
            boolean r0 = r0.A0D     // Catch:{ all -> 0x0523 }
            if (r0 != 0) goto L_0x011f
            r0 = r27
            r0.A0D = r3     // Catch:{ all -> 0x0523 }
            r0.A05(r4)     // Catch:{ all -> 0x0523 }
        L_0x011f:
            android.content.SharedPreferences r1 = r6.A00()     // Catch:{ all -> 0x0523 }
            java.lang.String r0 = "token_not_ready_reason"
            int r0 = r1.getInt(r0, r4)     // Catch:{ all -> 0x0523 }
            if (r0 != 0) goto L_0x0131
            r0 = 13
            r6.A03(r0)     // Catch:{ all -> 0x0523 }
        L_0x0131:
            monitor-exit(r27)
            r11 = r5
            goto L_0x0135
        L_0x0134:
            monitor-exit(r27)
        L_0x0135:
            r23 = 0
            if (r11 == 0) goto L_0x051b
            monitor-enter(r27)
            r0 = r27
            X.0t1 r13 = r0.A05     // Catch:{ all -> 0x0523 }
            android.content.SharedPreferences r1 = r13.A00()     // Catch:{ all -> 0x0523 }
            java.lang.String r0 = "shared_secret"
            java.lang.String r1 = r1.getString(r0, r5)     // Catch:{ all -> 0x0523 }
            if (r1 == 0) goto L_0x01db
            r0 = 8
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x0523 }
            if (r1 == 0) goto L_0x01db
            r0 = r30
            byte[] r12 = X.C40481uC.A00(r0, r1)     // Catch:{ Exception -> 0x01d0 }
            if (r12 == 0) goto L_0x01e4
            android.content.SharedPreferences r1 = r13.A00()     // Catch:{ all -> 0x0523 }
            java.lang.String r5 = "redeem_count"
            r0 = -1
            int r0 = r1.getInt(r5, r0)     // Catch:{ all -> 0x0523 }
            int r0 = r0 + 1
            r13.A02(r0)     // Catch:{ all -> 0x0523 }
            android.content.SharedPreferences r1 = r13.A00()     // Catch:{ all -> 0x0523 }
            r0 = -1
            int r22 = r1.getInt(r5, r0)     // Catch:{ all -> 0x0523 }
            r0 = r27
            X.0s5 r1 = r0.A01     // Catch:{ all -> 0x0523 }
            X.0tC r0 = X.C15910s6.A09     // Catch:{ all -> 0x0523 }
            int r15 = r1.A02(r0)     // Catch:{ all -> 0x0523 }
            X.0tC r0 = X.C15910s6.A08     // Catch:{ all -> 0x0523 }
            int r0 = r1.A02(r0)     // Catch:{ all -> 0x0523 }
            long r5 = (long) r0     // Catch:{ all -> 0x0523 }
            r0 = r27
            X.0t3 r0 = r0.A03     // Catch:{ all -> 0x0523 }
            long r20 = r0.A00()     // Catch:{ all -> 0x0523 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 / r0
            android.content.SharedPreferences r14 = r13.A00()     // Catch:{ all -> 0x0523 }
            java.lang.String r10 = "base_timestamp"
            r0 = 0
            long r18 = r14.getLong(r10, r0)     // Catch:{ all -> 0x0523 }
            long r20 = r20 - r18
            r10 = r27
            boolean r10 = r10.A0D     // Catch:{ all -> 0x0523 }
            if (r10 != 0) goto L_0x01c9
            r10 = r22
            if (r10 >= r15) goto L_0x01b9
            android.content.SharedPreferences r13 = r13.A00()     // Catch:{ all -> 0x0523 }
            java.lang.String r10 = "time_to_live"
            long r13 = r13.getLong(r10, r0)     // Catch:{ all -> 0x0523 }
            long r13 = r13 - r5
            int r0 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c9
        L_0x01b9:
            r0 = r27
            r0.A0D = r3     // Catch:{ all -> 0x0523 }
            X.0sq r6 = r0.A07     // Catch:{ all -> 0x0523 }
            r5 = 11
            com.facebook.redex.RunnableRunnableShape9S0100000_I0_8 r1 = new com.facebook.redex.RunnableRunnableShape9S0100000_I0_8     // Catch:{ all -> 0x0523 }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x0523 }
            r6.Acl(r1)     // Catch:{ all -> 0x0523 }
        L_0x01c9:
            r0 = 10
            java.lang.String r5 = android.util.Base64.encodeToString(r12, r0)     // Catch:{ all -> 0x0523 }
            goto L_0x01e4
        L_0x01d0:
            r1 = move-exception
            r0 = 6
            r13.A03(r0)     // Catch:{ all -> 0x0523 }
            java.lang.String r0 = "PrivateStatsToken/computeHMAC failed to compute hmac"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0523 }
            goto L_0x01e4
        L_0x01db:
            r0 = 3
            r13.A03(r0)     // Catch:{ all -> 0x0523 }
            java.lang.String r0 = "PrivateStatsToken/computeHMAC sharedSecret is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0523 }
        L_0x01e4:
            monitor-exit(r27)
            if (r5 == 0) goto L_0x051b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r0 = "+"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
        L_0x01fb:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0288
            java.lang.String r0 = "PrivateStatsUploader/doUpload no valid auth token, abort uploading"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r27.A00()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x0213:
            android.util.Pair r2 = android.util.Pair.create(r1, r8)
        L_0x0217:
            long r33 = android.os.SystemClock.elapsedRealtime()
            long r33 = r33 - r16
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            if (r6 != r3) goto L_0x0230
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0 = r24
            r0.add(r1)
        L_0x0230:
            r5 = 7
            X.0t5 r1 = r7.A03
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r30 = r0.intValue()
            if (r6 != r5) goto L_0x0277
            r29 = 7
            r31 = 0
            r28 = r1
            r28.A00(r29, r30, r31, r32, r33, r35, r36)
        L_0x0246:
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 4
            if (r1 != r0) goto L_0x051f
            r27.A01()
            r4 = 1
        L_0x0255:
            int r0 = r24.size()
            if (r0 <= 0) goto L_0x0265
            r1 = r37
            r0 = r24
            r1.A8I(r0)
            r38.A01()
        L_0x0265:
            if (r44 != 0) goto L_0x006c
            if (r4 != 0) goto L_0x006c
            r5 = 1
            r0 = r7
            r1 = r38
            r2 = r32
            r3 = r35
            r4 = r36
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x0277:
            r10 = 0
            r12 = r32
            r16 = r36
            r8 = r1
            r9 = r6
            r11 = r30
            r13 = r33
            r15 = r35
            r8.A00(r9, r10, r11, r12, r13, r15, r16)
            goto L_0x0246
        L_0x0288:
            if (r30 != 0) goto L_0x0290
            java.lang.String r0 = "PrivateStatsUploader/doUpload--->dataToSend is null, why?!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0217
        L_0x0290:
            java.lang.String r2 = X.AnonymousClass021.A0L     // Catch:{ Exception -> 0x02ee }
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x02ee }
            r0.<init>(r2)     // Catch:{ Exception -> 0x02ee }
            java.net.URLConnection r10 = r0.openConnection()     // Catch:{ Exception -> 0x02ee }
            javax.net.ssl.HttpsURLConnection r10 = (javax.net.ssl.HttpsURLConnection) r10     // Catch:{ Exception -> 0x02ee }
            X.0vS r0 = r7.A05     // Catch:{ Exception -> 0x02f2 }
            X.1aa r0 = r0.A00()     // Catch:{ Exception -> 0x02f2 }
            r10.setSSLSocketFactory(r0)     // Catch:{ Exception -> 0x02f2 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r10.setConnectTimeout(r0)     // Catch:{ Exception -> 0x02f2 }
            r0 = 60000(0xea60, float:8.4078E-41)
            r10.setReadTimeout(r0)     // Catch:{ Exception -> 0x02f2 }
            r10.setDoInput(r3)     // Catch:{ Exception -> 0x02f2 }
            r10.setDoOutput(r3)     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r0 = "POST"
            r10.setRequestMethod(r0)     // Catch:{ Exception -> 0x02f2 }
            r10.setChunkedStreamingMode(r4)     // Catch:{ Exception -> 0x02f2 }
            r10.setUseCaches(r4)     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r2 = "User-Agent"
            X.0vR r0 = r7.A06     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r0 = r0.A00()     // Catch:{ Exception -> 0x02f2 }
            r10.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r2 = "Connection"
            java.lang.String r0 = "Keep-Alive"
            r10.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r0 = "multipart/form-data; boundary=boundaryWAMpsAAL123xyz"
            r10.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r2 = "Accept"
            java.lang.String r0 = "text/plain"
            r10.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r2 = "Accept-Charset"
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ Exception -> 0x02f2 }
            r10.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x02f2 }
            r10.connect()     // Catch:{ Exception -> 0x02f2 }
            goto L_0x02f8
        L_0x02ee:
            r2 = move-exception
            r10 = r23
            goto L_0x02f3
        L_0x02f2:
            r2 = move-exception
        L_0x02f3:
            java.lang.String r0 = "PrivateStatsUploader/makeConnection error"
            com.whatsapp.util.Log.e(r0, r2)
        L_0x02f8:
            r20 = 6
            if (r10 != 0) goto L_0x0302
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            goto L_0x0213
        L_0x0302:
            X.0ua r14 = r7.A00     // Catch:{ Exception -> 0x0508 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0508 }
            r0 = 9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0508 }
            java.io.OutputStream r0 = r10.getOutputStream()     // Catch:{ Exception -> 0x0508 }
            X.1pm r2 = new X.1pm     // Catch:{ Exception -> 0x0508 }
            r2.<init>(r14, r0, r11, r6)     // Catch:{ Exception -> 0x0508 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0508 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0508 }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0508 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0508 }
            java.lang.String r2 = "--boundaryWAMpsAAL123xyz\r\n"
            r5.writeBytes(r2)     // Catch:{ all -> 0x0503 }
            java.lang.String r12 = "Content-Type: text/plain\r\n"
            r5.writeBytes(r12)     // Catch:{ all -> 0x0503 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"access_token\"\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r9)     // Catch:{ all -> 0x0503 }
            java.lang.String r0 = X.AnonymousClass021.A0M     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r0)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r9)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r2)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r12)     // Catch:{ all -> 0x0503 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"credential\"\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r9)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r1)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r9)     // Catch:{ all -> 0x0503 }
            r5.size()     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r2)     // Catch:{ all -> 0x0503 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"message\"; filename=\"WAMEventBuffer.dat\"\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x0503 }
            java.lang.String r0 = "Content-Type: application/octet-stream\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x0503 }
            java.lang.String r0 = "Content-Transfer-Encoding: binary\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r9)     // Catch:{ all -> 0x0503 }
            r0 = r30
            int r13 = r0.length     // Catch:{ all -> 0x0503 }
            r12 = 2048(0x800, float:2.87E-42)
            int r15 = r13 / r12
            int r13 = r13 % r12
            r1 = 0
        L_0x0370:
            r0 = r28
            if (r0 >= r15) goto L_0x037e
            r0 = r30
            r5.write(r0, r1, r12)     // Catch:{ all -> 0x0503 }
            int r1 = r1 + 2048
            int r28 = r28 + 1
            goto L_0x0370
        L_0x037e:
            if (r13 <= 0) goto L_0x0385
            r0 = r30
            r5.write(r0, r1, r13)     // Catch:{ all -> 0x0503 }
        L_0x0385:
            r5.writeBytes(r9)     // Catch:{ all -> 0x0503 }
            r5.size()     // Catch:{ all -> 0x0503 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03a3 }
            r13.<init>()     // Catch:{ JSONException -> 0x03a3 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x03a3 }
            r18 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r18
            java.lang.String r12 = "t"
            r13.put(r12, r0)     // Catch:{ JSONException -> 0x03a3 }
            java.lang.String r12 = r13.toString()     // Catch:{ JSONException -> 0x03a3 }
            goto L_0x03aa
        L_0x03a3:
            r1 = move-exception
            r12 = 0
            java.lang.String r0 = "PrivateStatsUploader/writeMetadataPart"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0503 }
        L_0x03aa:
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0503 }
            if (r0 != 0) goto L_0x03c9
            r5.writeBytes(r2)     // Catch:{ all -> 0x0503 }
            java.lang.String r0 = "Content-Type: application/json\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x0503 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"meta_data\"\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r9)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r12)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r9)     // Catch:{ all -> 0x0503 }
            r5.size()     // Catch:{ all -> 0x0503 }
        L_0x03c9:
            java.lang.String r0 = "--boundaryWAMpsAAL123xyz--\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x0503 }
            r5.writeBytes(r9)     // Catch:{ all -> 0x0503 }
            r5.flush()     // Catch:{ all -> 0x0503 }
            int r9 = r10.getResponseCode()     // Catch:{ IOException -> 0x04e0 }
            r10.getResponseMessage()     // Catch:{ IOException -> 0x04de }
            r0 = 200(0xc8, float:2.8E-43)
            if (r9 != r0) goto L_0x03e9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x04de }
            android.util.Pair r2 = android.util.Pair.create(r11, r0)     // Catch:{ IOException -> 0x04de }
            goto L_0x04ff
        L_0x03e9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04de }
            r1.<init>()     // Catch:{ IOException -> 0x04de }
            java.lang.String r0 = "PrivateStatsUploader/handleResponse --- upload failed --- code = "
            r1.append(r0)     // Catch:{ IOException -> 0x04de }
            r1.append(r9)     // Catch:{ IOException -> 0x04de }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x04de }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x04de }
            r2 = 400(0x190, float:5.6E-43)
            if (r9 != r2) goto L_0x04bc
            java.io.InputStream r1 = r10.getErrorStream()     // Catch:{ Exception -> 0x049c }
            X.1qW r0 = new X.1qW     // Catch:{ Exception -> 0x049c }
            r0.<init>(r14, r1, r11, r6)     // Catch:{ Exception -> 0x049c }
            r6 = 0
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0431 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0431 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0431 }
            r1.<init>(r11)     // Catch:{ Exception -> 0x0431 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x042c }
            r11.<init>()     // Catch:{ all -> 0x042c }
        L_0x041a:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x042c }
            if (r0 == 0) goto L_0x0424
            r11.append(r0)     // Catch:{ all -> 0x042c }
            goto L_0x041a
        L_0x0424:
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x042c }
            r1.close()     // Catch:{ Exception -> 0x0431 }
            goto L_0x0443
        L_0x042c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0430 }
        L_0x0430:
            throw r0     // Catch:{ Exception -> 0x0431 }
        L_0x0431:
            r11 = move-exception
            java.lang.String r1 = "PrivateStatsUploader/readresponsemsg "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x049c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x049c }
            r0.append(r11)     // Catch:{ Exception -> 0x049c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x049c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x049c }
        L_0x0443:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x049c }
            r11 = 5
            if (r0 != 0) goto L_0x048f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x047d }
            r1.<init>(r6)     // Catch:{ JSONException -> 0x047d }
            java.lang.String r0 = "error"
            org.json.JSONObject r6 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x047d }
            java.lang.String r0 = "error_subcode"
            int r1 = r6.getInt(r0)     // Catch:{ JSONException -> 0x047d }
            java.lang.String r0 = "code"
            int r6 = r6.getInt(r0)     // Catch:{ JSONException -> 0x047d }
            r0 = 9
            if (r6 != r0) goto L_0x0468
            r11 = 8
            goto L_0x048f
        L_0x0468:
            r0 = 3067002(0x2ecc7a, float:4.297785E-39)
            if (r1 != r0) goto L_0x046f
            r11 = 2
            goto L_0x048f
        L_0x046f:
            r0 = 3067003(0x2ecc7b, float:4.297787E-39)
            if (r1 != r0) goto L_0x0476
            r11 = 3
            goto L_0x048f
        L_0x0476:
            r0 = 3067004(0x2ecc7c, float:4.297788E-39)
            if (r1 != r0) goto L_0x048f
            r11 = 4
            goto L_0x048f
        L_0x047d:
            r6 = move-exception
            java.lang.String r1 = "PrivateStatsUploader/parseErrorResponse "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x049c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x049c }
            r0.append(r6)     // Catch:{ Exception -> 0x049c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x049c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x049c }
        L_0x048f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x049c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x049c }
            android.util.Pair r2 = android.util.Pair.create(r1, r0)     // Catch:{ Exception -> 0x049c }
            goto L_0x04ff
        L_0x049c:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04de }
            r1.<init>()     // Catch:{ IOException -> 0x04de }
            java.lang.String r0 = "PrivateStatsUploader processing response err "
            r1.append(r0)     // Catch:{ IOException -> 0x04de }
            r1.append(r6)     // Catch:{ IOException -> 0x04de }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x04de }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x04de }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x04de }
            r0 = r29
            android.util.Pair r2 = android.util.Pair.create(r0, r1)     // Catch:{ IOException -> 0x04de }
            goto L_0x04ff
        L_0x04bc:
            r2 = 401(0x191, float:5.62E-43)
            if (r9 != r2) goto L_0x04cf
            r0 = 11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x04de }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x04de }
            android.util.Pair r2 = android.util.Pair.create(r1, r0)     // Catch:{ IOException -> 0x04de }
            goto L_0x04ff
        L_0x04cf:
            r0 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x04de }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x04de }
            android.util.Pair r2 = android.util.Pair.create(r1, r0)     // Catch:{ IOException -> 0x04de }
            goto L_0x04ff
        L_0x04de:
            r2 = move-exception
            goto L_0x04e2
        L_0x04e0:
            r2 = move-exception
            r9 = 0
        L_0x04e2:
            java.lang.String r1 = "PrivateStatsUploader response error "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0503 }
            r0.<init>(r1)     // Catch:{ all -> 0x0503 }
            r0.append(r2)     // Catch:{ all -> 0x0503 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0503 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0503 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0503 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0503 }
            android.util.Pair r2 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x0503 }
        L_0x04ff:
            r5.close()     // Catch:{ Exception -> 0x0508 }
            goto L_0x0516
        L_0x0503:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0507 }
        L_0x0507:
            throw r0     // Catch:{ Exception -> 0x0508 }
        L_0x0508:
            r1 = move-exception
            java.lang.String r0 = "PrivateStatsUploader/doUpload error"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            android.util.Pair r2 = android.util.Pair.create(r0, r8)
        L_0x0516:
            r10.disconnect()
            goto L_0x0217
        L_0x051b:
            r1 = r23
            goto L_0x01fb
        L_0x051f:
            int r25 = r25 + 1
            goto L_0x008a
        L_0x0523:
            r0 = move-exception
            monitor-exit(r27)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19340yH.A00(X.1a9, int, boolean, boolean, boolean):void");
    }

    public void AdM(C29171a9 r2, boolean z2) {
        AdN(r2, 0, z2, false);
    }

    public void AdN(C29171a9 r7, int i2, boolean z2, boolean z3) {
        A00(r7, i2, z2, z3, false);
    }
}
