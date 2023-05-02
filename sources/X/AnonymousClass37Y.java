package X;

/* renamed from: X.37Y  reason: invalid class name */
public class AnonymousClass37Y extends AnonymousClass1ZS {
    public final /* synthetic */ C38451qo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass37Y(C38451qo r2, String str) {
        super(C13680ns.A0h("PhotosNetwork-", str));
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r5v13, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r5v42, types: [android.graphics.Bitmap] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0195 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x0285 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x0286 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x008f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0189 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0190 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            r0 = r19
            X.1qo r1 = r0.A00     // Catch:{ InterruptedException -> 0x0301 }
            java.util.Stack r4 = r1.A0B     // Catch:{ InterruptedException -> 0x0301 }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x0301 }
            int r0 = r4.size()     // Catch:{ all -> 0x02f9 }
            if (r0 != 0) goto L_0x0015
            r4.wait()     // Catch:{ all -> 0x02f9 }
        L_0x0015:
            monitor-exit(r4)     // Catch:{ all -> 0x02f9 }
            int r0 = r4.size()     // Catch:{ InterruptedException -> 0x0301 }
            if (r0 == 0) goto L_0x02e8
            r3 = 0
            java.lang.Object r0 = r1.A05     // Catch:{ InterruptedException -> 0x0301 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0301 }
            int r2 = r4.size()     // Catch:{ all -> 0x02f5 }
            if (r2 == 0) goto L_0x002c
            java.lang.Object r3 = r4.pop()     // Catch:{ all -> 0x02f5 }
            X.4OS r3 = (X.AnonymousClass4OS) r3     // Catch:{ all -> 0x02f5 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x02f5 }
            if (r3 == 0) goto L_0x02e8
            java.util.concurrent.ConcurrentMap r4 = r3.A05     // Catch:{ InterruptedException -> 0x0301 }
            int r2 = r4.size()     // Catch:{ InterruptedException -> 0x0301 }
            if (r2 == 0) goto L_0x02e8
            java.util.concurrent.atomic.AtomicBoolean r6 = r3.A07     // Catch:{ InterruptedException -> 0x0301 }
            r2 = 0
            r5 = 1
            boolean r5 = r6.compareAndSet(r2, r5)     // Catch:{ InterruptedException -> 0x0301 }
            if (r5 == 0) goto L_0x02e8
            boolean r5 = r1 instanceof X.C59462yK     // Catch:{ InterruptedException -> 0x0301 }
            if (r5 == 0) goto L_0x00e4
            r6 = r1
            X.2yK r6 = (X.C59462yK) r6     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r2 = r3.A03     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r11 = X.C004101u.A02(r2)     // Catch:{ InterruptedException -> 0x0301 }
            X.AnonymousClass00B.A06(r11)     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r5 = "thumbloader/download "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0301 }
            r2.<init>(r5)     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r9 = r3.A04     // Catch:{ InterruptedException -> 0x0301 }
            r2.append(r9)     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r2 = r2.toString()     // Catch:{ InterruptedException -> 0x0301 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ InterruptedException -> 0x0301 }
            r2 = 11
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ InterruptedException -> 0x0301 }
            r7 = 0
            X.0zG r2 = r6.A01     // Catch:{ IOException -> 0x00c2 }
            X.1pl r10 = r2.AFY(r9)     // Catch:{ IOException -> 0x00c2 }
            X.0ua r5 = r6.A00     // Catch:{ IOException -> 0x008f }
            r2 = 30
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x008f }
            java.io.InputStream r5 = r10.A9k(r5, r7, r2)     // Catch:{ IOException -> 0x008f }
            X.1zV r2 = r6.A03     // Catch:{ all -> 0x0088 }
            r2.A02(r5, r11)     // Catch:{ all -> 0x0088 }
            if (r5 == 0) goto L_0x008f
            r5.close()     // Catch:{ IOException -> 0x008f }
            goto L_0x008f
        L_0x0088:
            r2 = move-exception
            if (r5 == 0) goto L_0x008e
            r5.close()     // Catch:{ all -> 0x008e }
        L_0x008e:
            throw r2     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            X.1zV r8 = r6.A03     // Catch:{ all -> 0x00bd }
            int r6 = r3.A01     // Catch:{ all -> 0x00bd }
            int r5 = r3.A00     // Catch:{ all -> 0x00bd }
            boolean r2 = r3.A06     // Catch:{ all -> 0x00bd }
            android.graphics.Bitmap r8 = r8.A00(r11, r6, r5, r2)     // Catch:{ all -> 0x00bd }
            if (r8 != 0) goto L_0x00b2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r5.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = "thumbloader/decode failed "
            r5.append(r2)     // Catch:{ all -> 0x00bd }
            r5.append(r9)     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x00bd }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x00bd }
        L_0x00b2:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00bd }
            android.util.Pair r6 = new android.util.Pair     // Catch:{ all -> 0x00bd }
            r6.<init>(r2, r8)     // Catch:{ all -> 0x00bd }
            r10.close()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x00df
        L_0x00bd:
            r2 = move-exception
            r10.close()     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            throw r2     // Catch:{ IOException -> 0x00c2 }
        L_0x00c2:
            r6 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fc }
            r5.<init>()     // Catch:{ all -> 0x02fc }
            java.lang.String r2 = "thumbloader/error downloading "
            r5.append(r2)     // Catch:{ all -> 0x02fc }
            r5.append(r9)     // Catch:{ all -> 0x02fc }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x02fc }
            com.whatsapp.util.Log.e(r2, r6)     // Catch:{ all -> 0x02fc }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x02fc }
            android.util.Pair r6 = new android.util.Pair     // Catch:{ all -> 0x02fc }
            r6.<init>(r2, r7)     // Catch:{ all -> 0x02fc }
        L_0x00df:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ InterruptedException -> 0x0301 }
            goto L_0x029b
        L_0x00e4:
            boolean r5 = r1 instanceof X.C38441qn     // Catch:{ InterruptedException -> 0x0301 }
            if (r5 == 0) goto L_0x01c0
            r9 = r1
            X.1qn r9 = (X.C38441qn) r9     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r5 = r3.A03     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r7 = X.C004101u.A02(r5)     // Catch:{ InterruptedException -> 0x0301 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r6 = "StickerThumbLoader/download "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0301 }
            r5.<init>(r6)     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r8 = r3.A04     // Catch:{ InterruptedException -> 0x0301 }
            r5.append(r8)     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r5 = r5.toString()     // Catch:{ InterruptedException -> 0x0301 }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ InterruptedException -> 0x0301 }
            r5 = 11
            android.net.TrafficStats.setThreadStatsTag(r5)     // Catch:{ InterruptedException -> 0x0301 }
            r5 = 0
            X.14b r13 = r9.A00     // Catch:{ IOException -> 0x01a9 }
            X.0t3 r12 = r13.A04     // Catch:{ IOException -> 0x01a9 }
            long r10 = r12.A00()     // Catch:{ IOException -> 0x01a9 }
            X.0zG r6 = r13.A0A     // Catch:{ IOException -> 0x0196 }
            X.1pl r6 = r6.AFY(r8)     // Catch:{ IOException -> 0x0196 }
            long r17 = r12.A00()     // Catch:{ all -> 0x0191 }
            long r17 = r17 - r10
            java.net.URL r14 = r6.AGi()     // Catch:{ all -> 0x0191 }
            int r10 = r6.A6O()     // Catch:{ all -> 0x0191 }
            long r15 = (long) r10     // Catch:{ all -> 0x0191 }
            r13.A02(r14, r15, r17)     // Catch:{ all -> 0x0191 }
            X.0ua r11 = r13.A03     // Catch:{ all -> 0x0191 }
            r10 = 26
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0191 }
            java.io.InputStream r12 = r6.A9k(r11, r5, r10)     // Catch:{ all -> 0x0191 }
            java.io.ByteArrayOutputStream r14 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x018a }
            r14.<init>()     // Catch:{ all -> 0x018a }
            r10 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r10]     // Catch:{ all -> 0x018a }
        L_0x0142:
            int r11 = r12.read(r13)     // Catch:{ all -> 0x018a }
            r10 = -1
            if (r11 != r10) goto L_0x0153
            byte[] r11 = r14.toByteArray()     // Catch:{ all -> 0x018a }
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x018a }
            r10.<init>(r11)     // Catch:{ all -> 0x018a }
            goto L_0x0157
        L_0x0153:
            r14.write(r13, r2, r11)     // Catch:{ all -> 0x018a }
            goto L_0x0142
        L_0x0157:
            r12.close()     // Catch:{ all -> 0x0191 }
            r6.close()     // Catch:{ IOException -> 0x0196 }
            X.1zV r11 = r9.A03     // Catch:{ all -> 0x0185 }
            r11.A02(r10, r7)     // Catch:{ all -> 0x0185 }
            int r9 = r3.A01     // Catch:{ all -> 0x0185 }
            int r6 = r3.A00     // Catch:{ all -> 0x0185 }
            android.graphics.Bitmap r5 = r11.A00(r7, r9, r6, r2)     // Catch:{ all -> 0x0185 }
            if (r5 != 0) goto L_0x0180
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0185 }
            r6.<init>()     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = "StickerThumbLoader/decode failed "
            r6.append(r2)     // Catch:{ all -> 0x0185 }
            r6.append(r8)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0185 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0185 }
        L_0x0180:
            r10.close()     // Catch:{ IOException -> 0x01a9 }
            goto L_0x0291
        L_0x0185:
            r2 = move-exception
            r10.close()     // Catch:{ all -> 0x0189 }
        L_0x0189:
            throw r2     // Catch:{ IOException -> 0x01a9 }
        L_0x018a:
            r2 = move-exception
            if (r12 == 0) goto L_0x0190
            r12.close()     // Catch:{ all -> 0x0190 }
        L_0x0190:
            throw r2     // Catch:{ all -> 0x0191 }
        L_0x0191:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0195 }
        L_0x0195:
            throw r2     // Catch:{ IOException -> 0x0196 }
        L_0x0196:
            r7 = move-exception
            java.lang.String r6 = "StickerPackNetworkProvider/preview thumbnail decode failed "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01a9 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x01a9 }
            r2.append(r8)     // Catch:{ IOException -> 0x01a9 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01a9 }
            com.whatsapp.util.Log.e(r2, r7)     // Catch:{ IOException -> 0x01a9 }
            throw r7     // Catch:{ IOException -> 0x01a9 }
        L_0x01a9:
            r7 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fc }
            r6.<init>()     // Catch:{ all -> 0x02fc }
            java.lang.String r2 = "StickerThumbLoader/error downloading "
            r6.append(r2)     // Catch:{ all -> 0x02fc }
            r6.append(r8)     // Catch:{ all -> 0x02fc }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x02fc }
            com.whatsapp.util.Log.e(r2, r7)     // Catch:{ all -> 0x02fc }
            goto L_0x0291
        L_0x01c0:
            r14 = r1
            X.2yL r14 = (X.C59472yL) r14     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r7 = r3.A04     // Catch:{ InterruptedException -> 0x0301 }
            android.net.Uri r5 = android.net.Uri.parse(r7)     // Catch:{ InterruptedException -> 0x0301 }
            if (r5 == 0) goto L_0x021f
            java.lang.String r6 = r5.getAuthority()     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r5 = "static.whatsapp.net"
            boolean r5 = r5.equals(r6)     // Catch:{ InterruptedException -> 0x0301 }
            if (r5 == 0) goto L_0x021f
            X.0pd r5 = r14.A01     // Catch:{ InterruptedException -> 0x0301 }
            X.1qG r6 = new X.1qG     // Catch:{ InterruptedException -> 0x0301 }
            r6.<init>(r5, r7)     // Catch:{ InterruptedException -> 0x0301 }
        L_0x01df:
            X.4zO r7 = new X.4zO     // Catch:{ InterruptedException -> 0x0301 }
            r7.<init>()     // Catch:{ InterruptedException -> 0x0301 }
            X.4ID r13 = new X.4ID     // Catch:{ InterruptedException -> 0x0301 }
            r13.<init>(r7, r6)     // Catch:{ InterruptedException -> 0x0301 }
            X.0pd r10 = r14.A01     // Catch:{ InterruptedException -> 0x0301 }
            X.0ua r9 = r14.A00     // Catch:{ InterruptedException -> 0x0301 }
            X.0xf r15 = r14.A04     // Catch:{ InterruptedException -> 0x0301 }
            X.0zs r11 = r14.A03     // Catch:{ InterruptedException -> 0x0301 }
            X.1cs r12 = r3.A02     // Catch:{ InterruptedException -> 0x0301 }
            X.3Ic r8 = new X.3Ic     // Catch:{ InterruptedException -> 0x0301 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x0301 }
            X.258 r5 = r8.A8D()     // Catch:{ InterruptedException -> 0x0301 }
            X.1et r9 = r5.A00     // Catch:{ InterruptedException -> 0x0301 }
            X.2e9 r10 = r9.A00     // Catch:{ InterruptedException -> 0x0301 }
            if (r10 == 0) goto L_0x024f
            java.util.Collection r5 = r4.values()     // Catch:{ InterruptedException -> 0x0301 }
            java.util.Iterator r6 = r5.iterator()     // Catch:{ InterruptedException -> 0x0301 }
        L_0x020a:
            boolean r5 = r6.hasNext()     // Catch:{ InterruptedException -> 0x0301 }
            if (r5 == 0) goto L_0x024f
            java.lang.Object r5 = r6.next()     // Catch:{ InterruptedException -> 0x0301 }
            X.5TC r5 = (X.AnonymousClass5TC) r5     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.Integer r8 = r5.AE5()     // Catch:{ InterruptedException -> 0x0301 }
            r10.A0F = r8     // Catch:{ InterruptedException -> 0x0301 }
            if (r8 == 0) goto L_0x020a
            goto L_0x0227
        L_0x021f:
            java.lang.String r5 = "image"
            X.1qK r6 = new X.1qK     // Catch:{ InterruptedException -> 0x0301 }
            r6.<init>(r7, r5)     // Catch:{ InterruptedException -> 0x0301 }
            goto L_0x01df
        L_0x0227:
            X.1cs r5 = r3.A02     // Catch:{ InterruptedException -> 0x0301 }
            X.1XK r5 = r5.A0Y     // Catch:{ InterruptedException -> 0x0301 }
            byte r6 = r5.A00     // Catch:{ InterruptedException -> 0x0301 }
            int r5 = r8.intValue()     // Catch:{ InterruptedException -> 0x0301 }
            int r5 = X.C42141xI.A00(r6, r5, r2)     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ InterruptedException -> 0x0301 }
            r10.A0H = r5     // Catch:{ InterruptedException -> 0x0301 }
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ InterruptedException -> 0x0301 }
            r10.A0E = r5     // Catch:{ InterruptedException -> 0x0301 }
            int r6 = r9.A01     // Catch:{ InterruptedException -> 0x0301 }
            r5 = 0
            if (r6 != 0) goto L_0x0248
            r5 = 1
        L_0x0248:
            X.0t9 r8 = r14.A02     // Catch:{ InterruptedException -> 0x0301 }
            if (r5 == 0) goto L_0x0269
            r8.A06(r10)     // Catch:{ InterruptedException -> 0x0301 }
        L_0x024f:
            r5 = 0
            int r6 = r9.A01     // Catch:{ InterruptedException -> 0x0301 }
            if (r6 != 0) goto L_0x0294
            java.io.ByteArrayOutputStream r6 = r7.A00     // Catch:{ InterruptedException -> 0x0301 }
            if (r6 == 0) goto L_0x025c
            byte[] r5 = r6.toByteArray()     // Catch:{ InterruptedException -> 0x0301 }
        L_0x025c:
            X.AnonymousClass00B.A06(r5)     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r6 = r3.A03     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.String r8 = X.C004101u.A02(r6)     // Catch:{ InterruptedException -> 0x0301 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ InterruptedException -> 0x0301 }
            goto L_0x0273
        L_0x0269:
            r6 = 1
            X.00F r5 = new X.00F     // Catch:{ InterruptedException -> 0x0301 }
            r5.<init>(r6, r6)     // Catch:{ InterruptedException -> 0x0301 }
            r8.A0B(r10, r5, r6)     // Catch:{ InterruptedException -> 0x0301 }
            goto L_0x024f
        L_0x0273:
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0286 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0286 }
            X.1zV r5 = r14.A03     // Catch:{ all -> 0x0281 }
            r5.A02(r6, r8)     // Catch:{ all -> 0x0281 }
            r6.close()     // Catch:{ IOException -> 0x0286 }
            goto L_0x0286
        L_0x0281:
            r5 = move-exception
            r6.close()     // Catch:{ all -> 0x0285 }
        L_0x0285:
            throw r5     // Catch:{ IOException -> 0x0286 }
        L_0x0286:
            X.1zV r7 = r14.A03     // Catch:{ InterruptedException -> 0x0301 }
            int r6 = r3.A01     // Catch:{ InterruptedException -> 0x0301 }
            int r5 = r3.A00     // Catch:{ InterruptedException -> 0x0301 }
            android.graphics.Bitmap r5 = r7.A00(r8, r6, r5, r2)     // Catch:{ InterruptedException -> 0x0301 }
            goto L_0x0294
        L_0x0291:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ InterruptedException -> 0x0301 }
        L_0x0294:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ InterruptedException -> 0x0301 }
            android.util.Pair r6 = new android.util.Pair     // Catch:{ InterruptedException -> 0x0301 }
            r6.<init>(r2, r5)     // Catch:{ InterruptedException -> 0x0301 }
        L_0x029b:
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0301 }
            java.lang.Object r2 = r6.first     // Catch:{ all -> 0x02f2 }
            boolean r2 = X.AnonymousClass000.A1X(r2)     // Catch:{ all -> 0x02f2 }
            if (r2 != 0) goto L_0x02b0
            r4.clear()     // Catch:{ all -> 0x02f2 }
            java.util.Map r2 = r1.A09     // Catch:{ all -> 0x02f2 }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x02f2 }
            r2.remove(r1)     // Catch:{ all -> 0x02f2 }
        L_0x02ae:
            monitor-exit(r0)     // Catch:{ all -> 0x02f2 }
            goto L_0x02e8
        L_0x02b0:
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x02f2 }
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch:{ all -> 0x02f2 }
            X.1zV r2 = r1.A03     // Catch:{ all -> 0x02f2 }
            java.lang.String r5 = r3.A03     // Catch:{ all -> 0x02f2 }
            if (r6 == 0) goto L_0x02bc
            r3 = r6
            goto L_0x02be
        L_0x02bc:
            android.graphics.Bitmap r3 = X.C43201zV.A07     // Catch:{ all -> 0x02f2 }
        L_0x02be:
            X.03L r2 = r2.A03     // Catch:{ all -> 0x02f2 }
            monitor-enter(r2)     // Catch:{ all -> 0x02f2 }
            r2.A06(r5, r3)     // Catch:{ all -> 0x02ef }
            monitor-exit(r2)     // Catch:{ all -> 0x02ef }
            java.util.Map r2 = r1.A09     // Catch:{ all -> 0x02f2 }
            r2.remove(r5)     // Catch:{ all -> 0x02f2 }
            int r2 = r4.size()     // Catch:{ all -> 0x02f2 }
            if (r2 == 0) goto L_0x02ae
            java.util.Collection r2 = r4.values()     // Catch:{ all -> 0x02f2 }
            java.util.ArrayList r5 = X.C13680ns.A0n(r2)     // Catch:{ all -> 0x02f2 }
            r4.clear()     // Catch:{ all -> 0x02f2 }
            r3 = 17
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0     // Catch:{ all -> 0x02f2 }
            r2.<init>(r6, r5, r1, r3)     // Catch:{ all -> 0x02f2 }
            X.0pt r1 = r1.A02     // Catch:{ all -> 0x02f2 }
            r1.A0K(r2)     // Catch:{ all -> 0x02f2 }
            goto L_0x02ae
        L_0x02e8:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ InterruptedException -> 0x0301 }
            if (r0 == 0) goto L_0x0005
            goto L_0x02f8
        L_0x02ef:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02ef }
            throw r1     // Catch:{ all -> 0x02f2 }
        L_0x02f2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02f2 }
            goto L_0x0300
        L_0x02f5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02f5 }
            goto L_0x0300
        L_0x02f8:
            return
        L_0x02f9:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02f9 }
            goto L_0x0300
        L_0x02fc:
            r1 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ InterruptedException -> 0x0301 }
        L_0x0300:
            throw r1     // Catch:{ InterruptedException -> 0x0301 }
        L_0x0301:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37Y.run():void");
    }
}
