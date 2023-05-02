package X;

/* renamed from: X.5Av  reason: invalid class name and case insensitive filesystem */
public class C105705Av extends Thread {
    public final /* synthetic */ C96364oD A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105705Av(C96364oD r2) {
        super("ExoPlayer:SimpleDecoder");
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (X.AnonymousClass4XM.A00(r5) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        r6.addFlag(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        if (X.AnonymousClass000.A1R(r5.flags & Integer.MIN_VALUE, Integer.MIN_VALUE) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        r6.addFlag(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4 = r3.A05(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r4 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        if (r3.A05 != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        if (X.AnonymousClass000.A1R(r6.flags & Integer.MIN_VALUE, Integer.MIN_VALUE) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        r3.A02++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006d, code lost:
        r6.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        r5.clear();
        r4 = r3.A0B;
        r1 = r3.A00;
        r3.A00 = r1 + 1;
        r4[r1] = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007f, code lost:
        r6.skippedOutputBufferCount = r3.A02;
        r3.A02 = 0;
        r3.A0A.addLast(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0092, code lost:
        if ((r3 instanceof X.C65323Ui) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0094, code lost:
        r4 = new X.C65283Ua("Unexpected decode error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        r4 = new X.AnonymousClass3UY("Unexpected decode error", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            X.4oD r3 = r8.A00
        L_0x0002:
            java.lang.Object r2 = r3.A07     // Catch:{ InterruptedException -> 0x00af }
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x00af }
        L_0x0005:
            boolean r0 = r3.A06     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x0015
            java.util.ArrayDeque r0 = r3.A09     // Catch:{ all -> 0x00ac }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x001c
            int r0 = r3.A01     // Catch:{ all -> 0x00ac }
            if (r0 <= 0) goto L_0x001c
        L_0x0015:
            boolean r0 = r3.A06     // Catch:{ all -> 0x00ac }
            r7 = 0
            if (r0 == 0) goto L_0x0020
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            goto L_0x008b
        L_0x001c:
            r2.wait()     // Catch:{ all -> 0x00ac }
            goto L_0x0005
        L_0x0020:
            java.util.ArrayDeque r0 = r3.A09     // Catch:{ all -> 0x00ac }
            java.lang.Object r5 = r0.removeFirst()     // Catch:{ all -> 0x00ac }
            X.3UX r5 = (X.AnonymousClass3UX) r5     // Catch:{ all -> 0x00ac }
            X.3Ug[] r4 = r3.A0C     // Catch:{ all -> 0x00ac }
            int r1 = r3.A01     // Catch:{ all -> 0x00ac }
            r0 = 1
            int r1 = r1 - r0
            r3.A01 = r1     // Catch:{ all -> 0x00ac }
            r6 = r4[r1]     // Catch:{ all -> 0x00ac }
            boolean r4 = r3.A05     // Catch:{ all -> 0x00ac }
            r3.A05 = r7     // Catch:{ all -> 0x00ac }
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            boolean r0 = X.AnonymousClass4XM.A00(r5)     // Catch:{ InterruptedException -> 0x00af }
            if (r0 == 0) goto L_0x0043
            r0 = 4
            r6.addFlag(r0)     // Catch:{ InterruptedException -> 0x00af }
        L_0x0041:
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x00af }
            goto L_0x0058
        L_0x0043:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r5.flags     // Catch:{ InterruptedException -> 0x00af }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1R(r0, r1)     // Catch:{ InterruptedException -> 0x00af }
            if (r0 == 0) goto L_0x0051
            r6.addFlag(r1)     // Catch:{ InterruptedException -> 0x00af }
        L_0x0051:
            X.43z r4 = r3.A05(r5, r6, r4)     // Catch:{ OutOfMemoryError | RuntimeException -> 0x008f }
            if (r4 == 0) goto L_0x0041
            goto L_0x009b
        L_0x0058:
            boolean r0 = r3.A05     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x006d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r6.flags     // Catch:{ all -> 0x008c }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1R(r0, r1)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x007f
            int r0 = r3.A02     // Catch:{ all -> 0x008c }
            int r0 = r0 + 1
            r3.A02 = r0     // Catch:{ all -> 0x008c }
        L_0x006d:
            r6.release()     // Catch:{ all -> 0x008c }
        L_0x0070:
            r5.clear()     // Catch:{ all -> 0x008c }
            X.3UX[] r4 = r3.A0B     // Catch:{ all -> 0x008c }
            int r1 = r3.A00     // Catch:{ all -> 0x008c }
            int r0 = r1 + 1
            r3.A00 = r0     // Catch:{ all -> 0x008c }
            r4[r1] = r5     // Catch:{ all -> 0x008c }
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            goto L_0x0002
        L_0x007f:
            int r0 = r3.A02     // Catch:{ all -> 0x008c }
            r6.skippedOutputBufferCount = r0     // Catch:{ all -> 0x008c }
            r3.A02 = r7     // Catch:{ all -> 0x008c }
            java.util.ArrayDeque r0 = r3.A0A     // Catch:{ all -> 0x008c }
            r0.addLast(r6)     // Catch:{ all -> 0x008c }
            goto L_0x0070
        L_0x008b:
            return
        L_0x008c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            goto L_0x00ae
        L_0x008f:
            r1 = move-exception
            boolean r0 = r3 instanceof X.C65323Ui     // Catch:{ InterruptedException -> 0x00af }
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = "Unexpected decode error"
            X.3Ua r4 = new X.3Ua     // Catch:{ InterruptedException -> 0x00af }
            r4.<init>(r0, r1)     // Catch:{ InterruptedException -> 0x00af }
        L_0x009b:
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x00af }
            goto L_0x00a5
        L_0x009d:
            java.lang.String r0 = "Unexpected decode error"
            X.3UY r4 = new X.3UY     // Catch:{ InterruptedException -> 0x00af }
            r4.<init>(r0, r1)     // Catch:{ InterruptedException -> 0x00af }
            goto L_0x009b
        L_0x00a5:
            r3.A03 = r4     // Catch:{ all -> 0x00a9 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
            goto L_0x00ae
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
        L_0x00ae:
            throw r0     // Catch:{ InterruptedException -> 0x00af }
        L_0x00af:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105705Av.run():void");
    }
}
