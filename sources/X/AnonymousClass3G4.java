package X;

import android.os.SystemClock;

/* renamed from: X.3G4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G4 implements AnonymousClass2A2 {
    public final /* synthetic */ C43061zH A00;
    public final /* synthetic */ C43121zN A01;
    public final /* synthetic */ C38141qJ A02;
    public final /* synthetic */ C31681er A03;
    public final /* synthetic */ C85374Oe A04;
    public final /* synthetic */ AnonymousClass2A0 A05;

    public /* synthetic */ AnonymousClass3G4(C43061zH r1, C43121zN r2, C38141qJ r3, C31681er r4, C85374Oe r5, AnonymousClass2A0 r6) {
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
    }

    public static void A00(C29551ao r2, AnonymousClass21E r3) {
        r3.A0C = Long.valueOf(SystemClock.uptimeMillis());
        r3.A09 = Long.valueOf(r2.A00);
        r3.A02 = r2.A02;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.1zP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.1zP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: X.1zI} */
    /* JADX WARNING: type inference failed for: r8v8, types: [X.3pV] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0130, code lost:
        if (r2 >= 500) goto L_0x0132;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0297 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023a A[Catch:{ all -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0265 A[Catch:{ all -> 0x0293 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:109:0x0297=Splitter:B:109:0x0297, B:103:0x028f=Splitter:B:103:0x028f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C90774em Acg(X.C29561ap r30) {
        /*
            r29 = this;
            r0 = r29
            X.1er r4 = r0.A03
            X.1zN r3 = r0.A01
            X.2A0 r6 = r0.A05
            X.1zH r8 = r0.A00
            X.4Oe r10 = r0.A04
            X.1qJ r5 = r0.A02
            r28 = r30
            X.1QX r1 = r4.A0Z     // Catch:{ NoSuchAlgorithmException -> 0x0298, IOException -> 0x02a4 }
            boolean r2 = r4 instanceof X.C43361zs     // Catch:{ NoSuchAlgorithmException -> 0x0298, IOException -> 0x02a4 }
            X.1f0 r0 = r4.A0U     // Catch:{ NoSuchAlgorithmException -> 0x0298, IOException -> 0x02a4 }
            X.1qS r9 = r0.A02     // Catch:{ NoSuchAlgorithmException -> 0x0298, IOException -> 0x02a4 }
            java.io.File r7 = r9.A06     // Catch:{ NoSuchAlgorithmException -> 0x0298, IOException -> 0x02a4 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ NoSuchAlgorithmException -> 0x0298, IOException -> 0x02a4 }
            X.1zO r18 = r1.A01(r3, r0, r7)     // Catch:{ NoSuchAlgorithmException -> 0x0298, IOException -> 0x02a4 }
            r3 = 1
            r0 = r28
            java.lang.String r11 = r6.A9R(r0, r3)     // Catch:{ all -> 0x0293 }
            X.21E r0 = r4.A0X     // Catch:{ all -> 0x0293 }
            r0.A0J = r11     // Catch:{ all -> 0x0293 }
            long r0 = r4.A00     // Catch:{ all -> 0x0293 }
            boolean r25 = r4.A0C()     // Catch:{ all -> 0x0293 }
            if (r2 == 0) goto L_0x0037
            r26 = 1
            goto L_0x0039
        L_0x0037:
            r26 = 0
        L_0x0039:
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x0293 }
            boolean r2 = r9.A0A     // Catch:{ all -> 0x0293 }
            X.1XK r14 = r9.A05     // Catch:{ all -> 0x0293 }
            X.4OX r9 = new X.4OX     // Catch:{ all -> 0x0293 }
            r17 = r8
            r19 = r14
            r20 = r28
            r21 = r7
            r22 = r11
            r23 = r0
            r27 = r2
            r16 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r26, r27)     // Catch:{ all -> 0x0293 }
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x0293 }
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x0293 }
            X.1zO r12 = r9.A03     // Catch:{ all -> 0x0293 }
            r22 = 0
            X.3Fw r2 = new X.3Fw     // Catch:{ all -> 0x0293 }
            r2.<init>(r9, r10)     // Catch:{ all -> 0x0293 }
            boolean r0 = r9.A06     // Catch:{ all -> 0x0293 }
            if (r0 == 0) goto L_0x00c2
            int[] r1 = r10.A08     // Catch:{ all -> 0x0293 }
            if (r1 == 0) goto L_0x00b6
            int r0 = r1.length     // Catch:{ all -> 0x0293 }
            if (r0 <= 0) goto L_0x00b6
            X.1zP r11 = r12.A00     // Catch:{ all -> 0x0293 }
            X.1zH r0 = r9.A02     // Catch:{ all -> 0x0293 }
            X.3pV r8 = new X.3pV     // Catch:{ all -> 0x0293 }
            r8.<init>(r0, r11, r1)     // Catch:{ all -> 0x0293 }
        L_0x0078:
            X.1zK r13 = r8.A04     // Catch:{ all -> 0x0293 }
        L_0x007a:
            X.0vU r1 = r10.A02     // Catch:{ all -> 0x0293 }
            java.lang.String r7 = r9.A05     // Catch:{ all -> 0x0293 }
            r0 = 0
            X.1ao r2 = r1.A00(r2, r7, r0)     // Catch:{ all -> 0x0293 }
            long r0 = r9.A00     // Catch:{ all -> 0x0293 }
            r15 = r0
            long r0 = r9.A01     // Catch:{ all -> 0x0293 }
            java.lang.String r21 = "file"
            r19 = r2
            r20 = r8
            r23 = r15
            r25 = r0
            r19.A05(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0293 }
            r1 = 6
            com.facebook.redex.IDxCallableShape149S0100000_2_I1 r0 = new com.facebook.redex.IDxCallableShape149S0100000_2_I1     // Catch:{ all -> 0x0293 }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x0293 }
            java.lang.String r8 = "hash"
            java.util.List r1 = r2.A0B     // Catch:{ all -> 0x0293 }
            android.util.Pair r0 = android.util.Pair.create(r8, r0)     // Catch:{ all -> 0x0293 }
            r1.add(r0)     // Catch:{ all -> 0x0293 }
            X.4Kq r1 = new X.4Kq     // Catch:{ all -> 0x0293 }
            r1.<init>(r13, r2, r12)     // Catch:{ all -> 0x0293 }
            java.util.concurrent.atomic.AtomicReference r0 = r10.A07     // Catch:{ all -> 0x0293 }
            X.1ao r11 = r1.A01     // Catch:{ all -> 0x0293 }
            X.AnonymousClass00B.A06(r11)     // Catch:{ all -> 0x0293 }
            r0.set(r11)     // Catch:{ all -> 0x0293 }
            goto L_0x00c8
        L_0x00b6:
            X.1zP r11 = r12.A00     // Catch:{ all -> 0x0293 }
            X.1zH r1 = r9.A02     // Catch:{ all -> 0x0293 }
            r0 = 65536(0x10000, float:9.18355E-41)
            X.1zI r8 = new X.1zI     // Catch:{ all -> 0x0293 }
            r8.<init>(r1, r11, r0)     // Catch:{ all -> 0x0293 }
            goto L_0x0078
        L_0x00c2:
            X.1zP r11 = r12.A00     // Catch:{ all -> 0x0293 }
            r8 = r11
            r13 = r22
            goto L_0x007a
        L_0x00c8:
            X.1ap r8 = r9.A04     // Catch:{ IOException -> 0x01e3 }
            java.lang.String r12 = r10.A06     // Catch:{ IOException -> 0x01e3 }
            r17 = 0
            X.21E r0 = r10.A05     // Catch:{ 40C -> 0x019f, IOException -> 0x0197 }
            int r2 = r8.A00     // Catch:{ 40C -> 0x019f, IOException -> 0x0197 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ 40C -> 0x019f, IOException -> 0x0197 }
            r0.A06 = r2     // Catch:{ 40C -> 0x019f, IOException -> 0x0197 }
            java.lang.String r2 = r8.A04     // Catch:{ 40C -> 0x019f, IOException -> 0x0197 }
            r0.A0G = r2     // Catch:{ 40C -> 0x019f, IOException -> 0x0197 }
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch:{ 40C -> 0x019f, IOException -> 0x0197 }
            java.lang.Long r2 = java.lang.Long.valueOf(r15)     // Catch:{ 40C -> 0x019f, IOException -> 0x0197 }
            r0.A0D = r2     // Catch:{ 40C -> 0x019f, IOException -> 0x0197 }
            int r2 = r11.A02(r8)     // Catch:{ 40C -> 0x019f, IOException -> 0x0197 }
            A00(r11, r0)     // Catch:{ IOException -> 0x01e3 }
            java.lang.Long r11 = X.C13690nt.A0W(r2)     // Catch:{ IOException -> 0x01e3 }
            r0.A0A = r11     // Catch:{ IOException -> 0x01e3 }
            r0 = 400(0x190, float:5.6E-43)
            if (r2 != r0) goto L_0x00f8
            goto L_0x0170
        L_0x00f8:
            java.lang.String r11 = " "
            java.lang.String r13 = "mediaupload/upload-error/response-code="
            if (r2 < r0) goto L_0x013c
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r13)     // Catch:{ IOException -> 0x01e3 }
            r0.append(r2)     // Catch:{ IOException -> 0x01e3 }
            r0.append(r11)     // Catch:{ IOException -> 0x01e3 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r12, r0)     // Catch:{ IOException -> 0x01e3 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x01e3 }
            r0 = 507(0x1fb, float:7.1E-43)
            if (r2 == r0) goto L_0x0135
            r0 = 429(0x1ad, float:6.01E-43)
            if (r2 == r0) goto L_0x0135
            r0 = 401(0x191, float:5.62E-43)
            r11 = 13
            if (r2 == r0) goto L_0x0137
            r0 = 415(0x19f, float:5.82E-43)
            r11 = 5
            if (r2 == r0) goto L_0x0137
            r0 = 413(0x19d, float:5.79E-43)
            r11 = 24
            if (r2 == r0) goto L_0x0137
            r0 = 408(0x198, float:5.72E-43)
            if (r2 == r0) goto L_0x0132
            r0 = 500(0x1f4, float:7.0E-43)
            r11 = 9
            if (r2 < r0) goto L_0x0137
        L_0x0132:
            r11 = 8
            goto L_0x0137
        L_0x0135:
            r11 = 15
        L_0x0137:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x016b
        L_0x013c:
            if (r2 >= 0) goto L_0x0167
            X.1er r0 = r10.A04     // Catch:{ IOException -> 0x01e3 }
            java.util.concurrent.FutureTask r0 = r0.A02     // Catch:{ IOException -> 0x01e3 }
            boolean r0 = r0.isCancelled()     // Catch:{ IOException -> 0x01e3 }
            if (r0 == 0) goto L_0x014f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x01e3 }
            java.lang.String r0 = "mediaupload/upload-error/cancelled "
            goto L_0x0180
        L_0x014f:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r13)     // Catch:{ IOException -> 0x01e3 }
            r0.append(r2)     // Catch:{ IOException -> 0x01e3 }
            r0.append(r11)     // Catch:{ IOException -> 0x01e3 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r12, r0)     // Catch:{ IOException -> 0x01e3 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x01e3 }
            r0 = 17
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x018e
        L_0x0167:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)     // Catch:{ IOException -> 0x01e3 }
        L_0x016b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x0192
        L_0x0170:
            X.1er r11 = r10.A04     // Catch:{ IOException -> 0x01e3 }
            java.util.concurrent.FutureTask r11 = r11.A02     // Catch:{ IOException -> 0x01e3 }
            boolean r11 = r11.isCancelled()     // Catch:{ IOException -> 0x01e3 }
            if (r11 == 0) goto L_0x00f8
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x01e3 }
            java.lang.String r0 = "mediaupload/upload-error/cancelled/400 "
        L_0x0180:
            r2.append(r0)     // Catch:{ IOException -> 0x01e3 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r12, r2)     // Catch:{ IOException -> 0x01e3 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x01e3 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x01e3 }
        L_0x018e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ IOException -> 0x01e3 }
        L_0x0192:
            android.util.Pair r12 = android.util.Pair.create(r11, r0)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x01b2
        L_0x0197:
            r2 = move-exception
            X.21E r1 = r10.A05     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = r11.A03     // Catch:{ all -> 0x01dc }
            r1.A0I = r0     // Catch:{ all -> 0x01dc }
            throw r2     // Catch:{ all -> 0x01dc }
        L_0x019f:
            r0 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x01dc }
            android.util.Pair r12 = android.util.Pair.create(r2, r0)     // Catch:{ all -> 0x01dc }
            X.21E r0 = r10.A05     // Catch:{ IOException -> 0x01e3 }
            A00(r11, r0)     // Catch:{ IOException -> 0x01e3 }
        L_0x01b2:
            java.lang.Object r0 = r12.first     // Catch:{ IOException -> 0x01e3 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IOException -> 0x01e3 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x01e3 }
            X.4OE r2 = new X.4OE     // Catch:{ IOException -> 0x01e3 }
            r2.<init>(r8, r0)     // Catch:{ IOException -> 0x01e3 }
            java.lang.Object r0 = r12.second     // Catch:{ IOException -> 0x01e3 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IOException -> 0x01e3 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x01e3 }
            r2.A00 = r0     // Catch:{ IOException -> 0x01e3 }
            r2.A01 = r1     // Catch:{ IOException -> 0x01e3 }
            X.1zO r0 = r1.A02     // Catch:{ IOException -> 0x01e3 }
            X.4MR r0 = r0.A00()     // Catch:{ IOException -> 0x01e3 }
            r2.A02 = r0     // Catch:{ IOException -> 0x01e3 }
            X.4Ns r0 = r10.A00     // Catch:{ IOException -> 0x01e3 }
            r2.A03 = r0     // Catch:{ IOException -> 0x01e3 }
            boolean r0 = r10.A01     // Catch:{ IOException -> 0x01e3 }
            r2.A04 = r0     // Catch:{ IOException -> 0x01e3 }
            goto L_0x0225
        L_0x01dc:
            r1 = move-exception
            X.21E r0 = r10.A05     // Catch:{ IOException -> 0x01e3 }
            A00(r11, r0)     // Catch:{ IOException -> 0x01e3 }
            throw r1     // Catch:{ IOException -> 0x01e3 }
        L_0x01e3:
            r2 = move-exception
            java.lang.String r0 = "mediaupload/io-error/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0293 }
            android.net.Uri r0 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = r0.getHost()     // Catch:{ all -> 0x0293 }
            r1.append(r0)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = r10.A06     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0293 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0293 }
            X.21E r1 = r10.A05     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = X.AnonymousClass000.A0c(r2)     // Catch:{ all -> 0x0293 }
            r1.A0H = r0     // Catch:{ all -> 0x0293 }
            boolean r0 = r2 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x0293 }
            if (r0 == 0) goto L_0x0212
            r1 = 22
            goto L_0x021e
        L_0x0212:
            X.0vT r0 = r10.A03     // Catch:{ all -> 0x0293 }
            boolean r0 = r0.A02(r2)     // Catch:{ all -> 0x0293 }
            r1 = 17
            if (r0 == 0) goto L_0x021e
            r1 = 18
        L_0x021e:
            X.1ap r0 = r9.A04     // Catch:{ all -> 0x0293 }
            X.4OE r2 = new X.4OE     // Catch:{ all -> 0x0293 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0293 }
        L_0x0225:
            long r0 = r4.A0h     // Catch:{ all -> 0x0293 }
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0234
            long r0 = r4.A00     // Catch:{ all -> 0x0293 }
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0234
            r3 = 0
        L_0x0234:
            int r1 = r2.A05     // Catch:{ all -> 0x0293 }
            r0 = 26
            if (r1 != r0) goto L_0x0265
            java.lang.String r0 = r4.A04     // Catch:{ all -> 0x0293 }
            X.4Nm r1 = r4.A08(r5, r6, r0)     // Catch:{ all -> 0x0293 }
            int r0 = r1.A01     // Catch:{ all -> 0x0293 }
            if (r0 != 0) goto L_0x0249
            int r0 = r1.A00     // Catch:{ all -> 0x0293 }
            long r0 = (long) r0     // Catch:{ all -> 0x0293 }
            r4.A00 = r0     // Catch:{ all -> 0x0293 }
        L_0x0249:
            X.0xf r2 = r4.A0e     // Catch:{ all -> 0x0293 }
            java.lang.String r1 = r14.A02     // Catch:{ all -> 0x0293 }
            r24 = 0
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A01     // Catch:{ all -> 0x0293 }
            int r25 = r0.get()     // Catch:{ all -> 0x0293 }
            r20 = r2
            r21 = r1
            r23 = r22
            X.1qI r1 = r20.A06(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0293 }
            X.4em r0 = new X.4em     // Catch:{ all -> 0x0293 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0293 }
            goto L_0x028f
        L_0x0265:
            if (r1 == 0) goto L_0x028b
            java.util.concurrent.FutureTask r0 = r4.A02     // Catch:{ all -> 0x0293 }
            boolean r0 = r0.isCancelled()     // Catch:{ all -> 0x0293 }
            if (r0 != 0) goto L_0x028b
            long r0 = r4.A0h     // Catch:{ all -> 0x0293 }
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0284
            java.lang.String r0 = r4.A04     // Catch:{ all -> 0x0293 }
            X.4Nm r1 = r4.A08(r5, r6, r0)     // Catch:{ all -> 0x0293 }
            int r0 = r1.A01     // Catch:{ all -> 0x0293 }
            if (r0 != 0) goto L_0x0284
            int r0 = r1.A00     // Catch:{ all -> 0x0293 }
            long r0 = (long) r0     // Catch:{ all -> 0x0293 }
            r4.A00 = r0     // Catch:{ all -> 0x0293 }
        L_0x0284:
            int r0 = r2.A00     // Catch:{ all -> 0x0293 }
            X.4em r0 = X.C90774em.A04(r2, r0, r3)     // Catch:{ all -> 0x0293 }
            goto L_0x028f
        L_0x028b:
            X.4em r0 = X.C90774em.A02(r2)     // Catch:{ all -> 0x0293 }
        L_0x028f:
            r18.close()     // Catch:{ NoSuchAlgorithmException -> 0x0298, IOException -> 0x02a4 }
            return r0
        L_0x0293:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x0297 }
        L_0x0297:
            throw r0     // Catch:{ NoSuchAlgorithmException -> 0x0298, IOException -> 0x02a4 }
        L_0x0298:
            r0 = move-exception
            X.21E r1 = r4.A0X
            java.lang.String r0 = X.AnonymousClass000.A0c(r0)
            r1.A0H = r0
            r2 = 16
            goto L_0x02ae
        L_0x02a4:
            r0 = move-exception
            X.21E r1 = r4.A0X
            java.lang.String r0 = X.AnonymousClass000.A0c(r0)
            r1.A0H = r0
            r2 = 3
        L_0x02ae:
            X.4OE r1 = new X.4OE
            r0 = r28
            r1.<init>(r0, r2)
            X.4em r0 = X.C90774em.A01(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3G4.Acg(X.1ap):X.4em");
    }
}
