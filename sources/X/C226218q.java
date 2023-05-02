package X;

/* renamed from: X.18q  reason: invalid class name and case insensitive filesystem */
public class C226218q implements Runnable {
    public final C16440t3 A00;
    public final C225118f A01;
    public final C225218g A02;
    public final C17420v3 A03;
    public final C226118p A04;
    public final C19500yX A05;
    public final C16320sq A06;

    public C226218q(C16440t3 r1, C225118f r2, C225218g r3, C17420v3 r4, C226118p r5, C19500yX r6, C16320sq r7) {
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01bd, code lost:
        if (r1.A03() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01bf, code lost:
        r2 = r8.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c5, code lost:
        if (r2.AHX() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c7, code lost:
        r8.A03.Ah0(r2.A9u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01d9, code lost:
        if (r4 == null) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r4.Ad4(r3, r0, 50);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (r8.length < r10) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r9 = new java.io.File(r12, r15);
        r6 = new java.io.PrintWriter(new java.io.FileWriter(r9, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r10 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r8 = new org.json.JSONObject();
        r8.put("app_version", "2.23.1.76");
        r8.put("app_build_number", 438774090);
        r0 = r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r10.A04.AK1(-1, r0.getMessage());
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0150, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0151, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r5.A04.A8g(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015b, code lost:
        if (r6 != null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r6.flush();
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0163, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0181, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0183, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0184, code lost:
        if (r6 != null) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r6.flush();
        r6.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015d A[SYNTHETIC, Splitter:B:75:0x015d] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016f A[Catch:{ Exception -> 0x0193 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x019f A[SYNTHETIC, Splitter:B:99:0x019f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r2 = 0
        L_0x0001:
            r8 = r21
            X.18f r1 = r8.A01
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x01b9
            X.0yX r7 = r8.A05
            boolean r0 = r7.AHX()
            if (r0 == 0) goto L_0x01b9
            int r20 = r2 + 1
            r0 = 20
            if (r2 >= r0) goto L_0x01b9
            java.lang.Integer r10 = r7.AaK()
            if (r10 == 0) goto L_0x005b
            X.18p r0 = r8.A04
            java.util.concurrent.ConcurrentHashMap r9 = r0.A08
            java.lang.Object r0 = r9.get(r10)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r3 = 0
            if (r0 == 0) goto L_0x0033
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x0033
            r3 = 1
        L_0x0033:
            r1 = 50
            if (r3 == 0) goto L_0x005c
            java.lang.Long r0 = r7.AaJ()
            if (r0 == 0) goto L_0x005b
            long r5 = java.lang.System.nanoTime()
            long r3 = r0.longValue()
            long r5 = r5 - r3
            r3 = 200000000(0xbebc200, double:9.8813129E-316)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x005c
            X.0sq r4 = r8.A06
            r0 = 8
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r3 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r3.<init>((java.lang.Object) r7, (int) r0)
            java.lang.String r0 = "QplFSWriter/write-closed-markers"
        L_0x0058:
            r4.Ad4(r3, r0, r1)
        L_0x005b:
            return
        L_0x005c:
            r9.remove(r10)
            X.18g r5 = r8.A02
            java.util.concurrent.Semaphore r3 = r5.A05
            boolean r0 = r3.tryAcquire()
            if (r0 == 0) goto L_0x01ac
            java.lang.String r7 = r7.Aad()     // Catch:{ all -> 0x01e2 }
            if (r7 != 0) goto L_0x0071
            goto L_0x01d1
        L_0x0071:
            java.lang.String r2 = "2.23.1.76"
            r19 = 0
            r4 = 0
            X.0tz r0 = r5.A01     // Catch:{ Exception -> 0x0193 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0193 }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ Exception -> 0x0193 }
            java.lang.String r0 = "qpl"
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x0193 }
            r12.<init>(r1, r0)     // Catch:{ Exception -> 0x0193 }
            r12.mkdirs()     // Catch:{ Exception -> 0x0193 }
            X.18f r0 = r5.A02     // Catch:{ Exception -> 0x0193 }
            X.0pd r6 = r0.A00     // Catch:{ Exception -> 0x0193 }
            r0 = 213(0xd5, float:2.98E-43)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ Exception -> 0x0193 }
            int r11 = r6.A03(r1, r0)     // Catch:{ Exception -> 0x0193 }
            r0 = 214(0xd6, float:3.0E-43)
            int r10 = r6.A03(r1, r0)     // Catch:{ Exception -> 0x0193 }
            java.io.File[] r8 = r12.listFiles()     // Catch:{ Exception -> 0x0193 }
            r6 = 1
            if (r8 == 0) goto L_0x00a6
            int r0 = r8.length     // Catch:{ Exception -> 0x0193 }
            r18 = 0
            if (r0 >= r10) goto L_0x00a8
        L_0x00a6:
            r18 = 1
        L_0x00a8:
            java.io.File r9 = r5.A06     // Catch:{ Exception -> 0x0193 }
            r16 = 1024(0x400, double:5.06E-321)
            if (r9 == 0) goto L_0x00cc
            boolean r0 = r9.exists()     // Catch:{ Exception -> 0x0193 }
            if (r0 == 0) goto L_0x00cc
            long r14 = r9.length()     // Catch:{ Exception -> 0x0193 }
            long r14 = r14 / r16
            long r0 = (long) r11     // Catch:{ Exception -> 0x0193 }
            int r13 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x00cc
        L_0x00bf:
            r1 = 1
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ Exception -> 0x0193 }
            r0.<init>(r9, r1)     // Catch:{ Exception -> 0x0193 }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0193 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0193 }
            goto L_0x0171
        L_0x00cc:
            r5.A06 = r4     // Catch:{ Exception -> 0x0193 }
            r13 = 0
        L_0x00cf:
            if (r13 >= r10) goto L_0x018d
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0193 }
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0193 }
            r1[r19] = r2     // Catch:{ Exception -> 0x0193 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0193 }
            r1[r6] = r0     // Catch:{ Exception -> 0x0193 }
            java.lang.String r0 = "qpl_%s_%d.txt"
            java.lang.String r15 = java.lang.String.format(r9, r0, r1)     // Catch:{ Exception -> 0x0193 }
            if (r8 == 0) goto L_0x0107
            int r14 = r8.length     // Catch:{ Exception -> 0x0193 }
            r1 = 0
        L_0x00e8:
            if (r1 >= r14) goto L_0x0107
            r9 = r8[r1]     // Catch:{ Exception -> 0x0193 }
            java.lang.String r0 = r9.getName()     // Catch:{ Exception -> 0x0193 }
            boolean r0 = r0.equals(r15)     // Catch:{ Exception -> 0x0193 }
            if (r0 == 0) goto L_0x0104
            long r14 = r9.length()     // Catch:{ Exception -> 0x0193 }
            long r14 = r14 / r16
            long r0 = (long) r11     // Catch:{ Exception -> 0x0193 }
            int r6 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0112
            r5.A06 = r9     // Catch:{ Exception -> 0x0193 }
            goto L_0x00bf
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x00e8
        L_0x0107:
            if (r18 == 0) goto L_0x010a
            goto L_0x0116
        L_0x010a:
            X.0v3 r0 = r5.A04     // Catch:{ Exception -> 0x0193 }
            r0.ALO()     // Catch:{ Exception -> 0x0193 }
            r5.A06 = r4     // Catch:{ Exception -> 0x0193 }
            goto L_0x0114
        L_0x0112:
            int r13 = r13 + 1
        L_0x0114:
            r6 = 1
            goto L_0x00cf
        L_0x0116:
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x0150, all -> 0x0181 }
            r9.<init>(r12, r15)     // Catch:{ Exception -> 0x0150, all -> 0x0181 }
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ Exception -> 0x0150, all -> 0x0181 }
            r0.<init>(r9, r6)     // Catch:{ Exception -> 0x0150, all -> 0x0181 }
            java.io.PrintWriter r6 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0150, all -> 0x0181 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0150, all -> 0x0181 }
            X.18i r10 = r5.A03     // Catch:{ Exception -> 0x014e }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x013e }
            r8.<init>()     // Catch:{ Exception -> 0x013e }
            java.lang.String r0 = "app_version"
            r8.put(r0, r2)     // Catch:{ Exception -> 0x013e }
            java.lang.String r2 = "app_build_number"
            r0 = 438774090(0x1a27294a, double:2.16783204E-315)
            r8.put(r2, r0)     // Catch:{ Exception -> 0x013e }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x013e }
            goto L_0x014a
        L_0x013e:
            r0 = move-exception
            X.0v3 r2 = r10.A04     // Catch:{ Exception -> 0x014e }
            r1 = -1
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x014e }
            r2.AK1(r1, r0)     // Catch:{ Exception -> 0x014e }
            r0 = 0
        L_0x014a:
            r6.println(r0)     // Catch:{ Exception -> 0x014e }
            goto L_0x0165
        L_0x014e:
            r0 = move-exception
            goto L_0x0152
        L_0x0150:
            r0 = move-exception
            r6 = r4
        L_0x0152:
            X.0v3 r1 = r5.A04     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0183 }
            r1.A8g(r0)     // Catch:{ all -> 0x0183 }
            if (r6 == 0) goto L_0x0163
            r6.flush()     // Catch:{ Exception -> 0x0193 }
            r6.close()     // Catch:{ Exception -> 0x0193 }
        L_0x0163:
            r9 = r4
            goto L_0x016b
        L_0x0165:
            r6.flush()     // Catch:{ Exception -> 0x0193 }
            r6.close()     // Catch:{ Exception -> 0x0193 }
        L_0x016b:
            r5.A06 = r9     // Catch:{ Exception -> 0x0193 }
            if (r9 == 0) goto L_0x01a5
            goto L_0x00bf
        L_0x0171:
            r1.println()     // Catch:{ Exception -> 0x017e, all -> 0x01d5 }
            r1.println(r7)     // Catch:{ Exception -> 0x017e, all -> 0x01d5 }
            r1.flush()     // Catch:{ all -> 0x01e2 }
            r1.close()     // Catch:{ all -> 0x01e2 }
            goto L_0x01a5
        L_0x017e:
            r0 = move-exception
            r4 = r1
            goto L_0x0194
        L_0x0181:
            r0 = move-exception
            goto L_0x018c
        L_0x0183:
            r0 = move-exception
            if (r6 == 0) goto L_0x018c
            r6.flush()     // Catch:{ Exception -> 0x0193 }
            r6.close()     // Catch:{ Exception -> 0x0193 }
        L_0x018c:
            throw r0     // Catch:{ Exception -> 0x0193 }
        L_0x018d:
            X.0v3 r0 = r5.A04     // Catch:{ Exception -> 0x0193 }
            r0.ALO()     // Catch:{ Exception -> 0x0193 }
            goto L_0x01a5
        L_0x0193:
            r0 = move-exception
        L_0x0194:
            X.0v3 r1 = r5.A04     // Catch:{ all -> 0x01d8 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01d8 }
            r1.A8g(r0)     // Catch:{ all -> 0x01d8 }
            if (r4 == 0) goto L_0x01a5
            r4.flush()     // Catch:{ all -> 0x01e2 }
            r4.close()     // Catch:{ all -> 0x01e2 }
        L_0x01a5:
            r3.release()
            r2 = r20
            goto L_0x0001
        L_0x01ac:
            X.0sq r4 = r8.A06
            r0 = 8
            com.facebook.redex.RunnableRunnableShape13S0100000_I0_12 r3 = new com.facebook.redex.RunnableRunnableShape13S0100000_I0_12
            r3.<init>((java.lang.Object) r7, (int) r0)
            java.lang.String r0 = "QplFSWriter/write-closed-markers-2"
            goto L_0x0058
        L_0x01b9:
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x005b
            X.0yX r2 = r8.A05
            boolean r0 = r2.AHX()
            if (r0 == 0) goto L_0x005b
            X.0v3 r1 = r8.A03
            java.util.Collection r0 = r2.A9u()
            r1.Ah0(r0)
            return
        L_0x01d1:
            r3.release()
            return
        L_0x01d5:
            r0 = move-exception
            r4 = r1
            goto L_0x01db
        L_0x01d8:
            r0 = move-exception
            if (r4 == 0) goto L_0x01e1
        L_0x01db:
            r4.flush()     // Catch:{ all -> 0x01e2 }
            r4.close()     // Catch:{ all -> 0x01e2 }
        L_0x01e1:
            throw r0     // Catch:{ all -> 0x01e2 }
        L_0x01e2:
            r0 = move-exception
            r3.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226218q.run():void");
    }
}
