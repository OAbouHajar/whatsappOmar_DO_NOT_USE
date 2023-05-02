package X;

import android.content.Context;

/* renamed from: X.0Ii  reason: invalid class name and case insensitive filesystem */
public class C03390Ii extends C10670hV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C03440In A01;

    public C03390Ii(Context context, C03440In r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:82|83|84|85|(4:88|(2:90|122)(2:91|123)|120|86)|121|92) */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r3 = r7.A0B;
        r7.A00 = r4 - r3.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        X.C09100eu.A01(r0);
        X.C09100eu.A03(r7.A0A);
        r12 = r3.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ae, code lost:
        if (r12.hasNext() != false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b0, code lost:
        r4 = (X.AnonymousClass0QY) r12.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b9, code lost:
        if (r4.A01 == null) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01bb, code lost:
        r7.A03 += r4.A04[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c5, code lost:
        r4.A01 = null;
        X.C09100eu.A03(r4.A00());
        X.C09100eu.A03(r4.A01());
        r12.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01da, code lost:
        r7.A04 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r10, true), r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x0191 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:82:0x0191=Splitter:B:82:0x0191, B:93:0x01ec=Splitter:B:93:0x01ec} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r0 = r18
            android.content.Context r0 = r0.A00
            java.io.File r5 = r0.getCacheDir()
            long r3 = r5.getFreeSpace()
            r1 = 30
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x026d
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 2097152(0x200000, float:2.938736E-39)
            if (r0 < 0) goto L_0x001c
            r1 = 5242880(0x500000, float:7.34684E-39)
        L_0x001c:
            java.lang.String r0 = ".facebook_cache"
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r0)
            long r1 = (long) r1
            r14 = 2
            r11 = 1
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0261
            java.lang.String r0 = "journal.bkp"
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x0268 }
            r4.<init>(r6, r0)     // Catch:{ IOException -> 0x0268 }
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x0268 }
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "journal"
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0268 }
            r3.<init>(r6, r0)     // Catch:{ IOException -> 0x0268 }
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x0268 }
            if (r0 == 0) goto L_0x0057
            r4.delete()     // Catch:{ IOException -> 0x0268 }
        L_0x0049:
            X.0eu r7 = new X.0eu     // Catch:{ IOException -> 0x0268 }
            r7.<init>(r6, r1)     // Catch:{ IOException -> 0x0268 }
            java.io.File r10 = r7.A08     // Catch:{ IOException -> 0x0268 }
            boolean r0 = r10.exists()     // Catch:{ IOException -> 0x0268 }
            if (r0 == 0) goto L_0x0244
            goto L_0x0063
        L_0x0057:
            boolean r0 = r4.renameTo(r3)     // Catch:{ IOException -> 0x0268 }
            if (r0 != 0) goto L_0x0049
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0268 }
            r0.<init>()     // Catch:{ IOException -> 0x0268 }
            throw r0     // Catch:{ IOException -> 0x0268 }
        L_0x0063:
            java.lang.String r12 = ", "
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x021b }
            r3.<init>(r10)     // Catch:{ IOException -> 0x021b }
            java.nio.charset.Charset r5 = X.C09100eu.A0F     // Catch:{ IOException -> 0x021b }
            X.0er r17 = new X.0er     // Catch:{ IOException -> 0x021b }
            r0 = r17
            r0.<init>(r7, r3, r5)     // Catch:{ IOException -> 0x021b }
            java.lang.String r13 = r17.A00()     // Catch:{ all -> 0x0216 }
            java.lang.String r9 = r17.A00()     // Catch:{ all -> 0x0216 }
            java.lang.String r3 = r17.A00()     // Catch:{ all -> 0x0216 }
            java.lang.String r8 = r17.A00()     // Catch:{ all -> 0x0216 }
            java.lang.String r4 = r17.A00()     // Catch:{ all -> 0x0216 }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = java.lang.Integer.toString(r14)     // Catch:{ all -> 0x0216 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = java.lang.Integer.toString(r11)     // Catch:{ all -> 0x0216 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x01ec
            r4 = 0
        L_0x00b4:
            java.lang.String r3 = r17.A00()     // Catch:{ EOFException -> 0x0191 }
            r8 = 32
            int r14 = r3.indexOf(r8)     // Catch:{ EOFException -> 0x0191 }
            java.lang.String r16 = "unexpected journal line: "
            r15 = -1
            if (r14 == r15) goto L_0x0171
            int r0 = r14 + 1
            int r13 = r3.indexOf(r8, r0)     // Catch:{ EOFException -> 0x0191 }
            if (r13 != r15) goto L_0x00e0
            java.lang.String r9 = r3.substring(r0)     // Catch:{ EOFException -> 0x0191 }
            r0 = 6
            if (r14 != r0) goto L_0x00e4
            java.lang.String r0 = "REMOVE"
            boolean r0 = r3.startsWith(r0)     // Catch:{ EOFException -> 0x0191 }
            if (r0 == 0) goto L_0x00e4
            java.util.LinkedHashMap r0 = r7.A0B     // Catch:{ EOFException -> 0x0191 }
            r0.remove(r9)     // Catch:{ EOFException -> 0x0191 }
            goto L_0x014d
        L_0x00e0:
            java.lang.String r9 = r3.substring(r0, r13)     // Catch:{ EOFException -> 0x0191 }
        L_0x00e4:
            java.util.LinkedHashMap r0 = r7.A0B     // Catch:{ EOFException -> 0x0191 }
            java.lang.Object r12 = r0.get(r9)     // Catch:{ EOFException -> 0x0191 }
            X.0QY r12 = (X.AnonymousClass0QY) r12     // Catch:{ EOFException -> 0x0191 }
            r8 = 0
            if (r12 != 0) goto L_0x00f7
            X.0QY r12 = new X.0QY     // Catch:{ EOFException -> 0x0191 }
            r12.<init>(r7, r9)     // Catch:{ EOFException -> 0x0191 }
            r0.put(r9, r12)     // Catch:{ EOFException -> 0x0191 }
        L_0x00f7:
            r9 = 5
            if (r13 == r15) goto L_0x012a
            if (r14 != r9) goto L_0x012d
            java.lang.String r0 = "CLEAN"
            boolean r0 = r3.startsWith(r0)     // Catch:{ EOFException -> 0x0191 }
            if (r0 == 0) goto L_0x012d
            int r0 = r13 + 1
            java.lang.String r3 = r3.substring(r0)     // Catch:{ EOFException -> 0x0191 }
            java.lang.String r0 = " "
            java.lang.String[] r13 = r3.split(r0)     // Catch:{ EOFException -> 0x0191 }
            r12.A02 = r11     // Catch:{ EOFException -> 0x0191 }
            r12.A01 = r8     // Catch:{ EOFException -> 0x0191 }
            int r15 = r13.length     // Catch:{ EOFException -> 0x0191 }
            X.0eu r0 = r12.A05     // Catch:{ EOFException -> 0x0191 }
            int r0 = r0.A06     // Catch:{ EOFException -> 0x0191 }
            if (r15 != r0) goto L_0x017f
            r14 = 0
        L_0x011c:
            if (r14 >= r15) goto L_0x014d
            long[] r3 = r12.A04     // Catch:{ NumberFormatException -> 0x0151 }
            r0 = r13[r14]     // Catch:{ NumberFormatException -> 0x0151 }
            long r8 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0151 }
            r3[r14] = r8     // Catch:{ NumberFormatException -> 0x0151 }
            r14 = 1
            goto L_0x011c
        L_0x012a:
            if (r14 != r9) goto L_0x0131
            goto L_0x0135
        L_0x012d:
            if (r13 == r15) goto L_0x012a
            if (r13 != r15) goto L_0x0163
        L_0x0131:
            r0 = 4
            if (r14 != r0) goto L_0x0163
            goto L_0x0145
        L_0x0135:
            java.lang.String r0 = "DIRTY"
            boolean r0 = r3.startsWith(r0)     // Catch:{ EOFException -> 0x0191 }
            if (r0 == 0) goto L_0x0163
            X.0Pt r0 = new X.0Pt     // Catch:{ EOFException -> 0x0191 }
            r0.<init>(r12, r7)     // Catch:{ EOFException -> 0x0191 }
            r12.A01 = r0     // Catch:{ EOFException -> 0x0191 }
            goto L_0x014d
        L_0x0145:
            java.lang.String r0 = "READ"
            boolean r0 = r3.startsWith(r0)     // Catch:{ EOFException -> 0x0191 }
            if (r0 == 0) goto L_0x0163
        L_0x014d:
            int r4 = r4 + 1
            goto L_0x00b4
        L_0x0151:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r16)     // Catch:{ EOFException -> 0x0191 }
            java.lang.String r0 = java.util.Arrays.toString(r13)     // Catch:{ EOFException -> 0x0191 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r3)     // Catch:{ EOFException -> 0x0191 }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x0191 }
            r3.<init>(r0)     // Catch:{ EOFException -> 0x0191 }
            goto L_0x0190
        L_0x0163:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r16)     // Catch:{ EOFException -> 0x0191 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ EOFException -> 0x0191 }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x0191 }
            r3.<init>(r0)     // Catch:{ EOFException -> 0x0191 }
            goto L_0x0190
        L_0x0171:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r16)     // Catch:{ EOFException -> 0x0191 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ EOFException -> 0x0191 }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x0191 }
            r3.<init>(r0)     // Catch:{ EOFException -> 0x0191 }
            goto L_0x0190
        L_0x017f:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r16)     // Catch:{ EOFException -> 0x0191 }
            java.lang.String r0 = java.util.Arrays.toString(r13)     // Catch:{ EOFException -> 0x0191 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r3)     // Catch:{ EOFException -> 0x0191 }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x0191 }
            r3.<init>(r0)     // Catch:{ EOFException -> 0x0191 }
        L_0x0190:
            throw r3     // Catch:{ EOFException -> 0x0191 }
        L_0x0191:
            java.util.LinkedHashMap r3 = r7.A0B     // Catch:{ all -> 0x0216 }
            int r0 = r3.size()     // Catch:{ all -> 0x0216 }
            int r4 = r4 - r0
            r7.A00 = r4     // Catch:{ all -> 0x0216 }
            X.C09100eu.A01(r17)     // Catch:{ IOException -> 0x021b }
            java.io.File r0 = r7.A0A     // Catch:{ IOException -> 0x021b }
            X.C09100eu.A03(r0)     // Catch:{ IOException -> 0x021b }
            java.util.Collection r0 = r3.values()     // Catch:{ IOException -> 0x021b }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ IOException -> 0x021b }
        L_0x01aa:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x021b }
            if (r0 == 0) goto L_0x01da
            java.lang.Object r4 = r12.next()     // Catch:{ IOException -> 0x021b }
            X.0QY r4 = (X.AnonymousClass0QY) r4     // Catch:{ IOException -> 0x021b }
            X.0Pt r0 = r4.A01     // Catch:{ IOException -> 0x021b }
            r3 = 0
            if (r0 != 0) goto L_0x01c5
            long r8 = r7.A03     // Catch:{ IOException -> 0x021b }
            long[] r0 = r4.A04     // Catch:{ IOException -> 0x021b }
            r3 = r0[r3]     // Catch:{ IOException -> 0x021b }
            long r8 = r8 + r3
            r7.A03 = r8     // Catch:{ IOException -> 0x021b }
            goto L_0x01aa
        L_0x01c5:
            r0 = 0
            r4.A01 = r0     // Catch:{ IOException -> 0x021b }
            java.io.File r0 = r4.A00()     // Catch:{ IOException -> 0x021b }
            X.C09100eu.A03(r0)     // Catch:{ IOException -> 0x021b }
            java.io.File r0 = r4.A01()     // Catch:{ IOException -> 0x021b }
            X.C09100eu.A03(r0)     // Catch:{ IOException -> 0x021b }
            r12.remove()     // Catch:{ IOException -> 0x021b }
            goto L_0x01aa
        L_0x01da:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x021b }
            r0.<init>(r10, r11)     // Catch:{ IOException -> 0x021b }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x021b }
            r3.<init>(r0, r5)     // Catch:{ IOException -> 0x021b }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x021b }
            r0.<init>(r3)     // Catch:{ IOException -> 0x021b }
            r7.A04 = r0     // Catch:{ IOException -> 0x021b }
            goto L_0x024f
        L_0x01ec:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0216 }
            java.lang.String r0 = "unexpected journal header: ["
            r3.append(r0)     // Catch:{ all -> 0x0216 }
            r3.append(r13)     // Catch:{ all -> 0x0216 }
            r3.append(r12)     // Catch:{ all -> 0x0216 }
            r3.append(r9)     // Catch:{ all -> 0x0216 }
            r3.append(r12)     // Catch:{ all -> 0x0216 }
            r3.append(r8)     // Catch:{ all -> 0x0216 }
            r3.append(r12)     // Catch:{ all -> 0x0216 }
            r3.append(r4)     // Catch:{ all -> 0x0216 }
            java.lang.String r0 = "]"
            java.lang.String r3 = X.AnonymousClass000.A0h(r0, r3)     // Catch:{ all -> 0x0216 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0216 }
            r0.<init>(r3)     // Catch:{ all -> 0x0216 }
            throw r0     // Catch:{ all -> 0x0216 }
        L_0x0216:
            r0 = move-exception
            X.C09100eu.A01(r17)     // Catch:{ IOException -> 0x021b }
            throw r0     // Catch:{ IOException -> 0x021b }
        L_0x021b:
            r5 = move-exception
            java.io.PrintStream r4 = java.lang.System.out     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = "DiskLruCache "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x0268 }
            r3.append(r6)     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = " is corrupt: "
            r3.append(r0)     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = r5.getMessage()     // Catch:{ IOException -> 0x0268 }
            r3.append(r0)     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = ", removing"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r3)     // Catch:{ IOException -> 0x0268 }
            r4.println(r0)     // Catch:{ IOException -> 0x0268 }
            r7.close()     // Catch:{ IOException -> 0x0268 }
            java.io.File r0 = r7.A07     // Catch:{ IOException -> 0x0268 }
            X.C09100eu.A02(r0)     // Catch:{ IOException -> 0x0268 }
        L_0x0244:
            r6.mkdirs()     // Catch:{ IOException -> 0x0268 }
            X.0eu r7 = new X.0eu     // Catch:{ IOException -> 0x0268 }
            r7.<init>(r6, r1)     // Catch:{ IOException -> 0x0268 }
            r7.A06()     // Catch:{ IOException -> 0x0268 }
        L_0x024f:
            X.C03440In.A05 = r7     // Catch:{ IOException -> 0x0268 }
            X.0f8 r1 = new X.0f8     // Catch:{ IOException -> 0x0268 }
            r1.<init>()     // Catch:{ IOException -> 0x0268 }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ IOException -> 0x0268 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0268 }
            X.C03440In.A02 = r0     // Catch:{ IOException -> 0x0268 }
            r0.start()     // Catch:{ IOException -> 0x0268 }
            return
        L_0x0261:
            java.lang.String r0 = "maxSize <= 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ IOException -> 0x0268 }
            throw r0     // Catch:{ IOException -> 0x0268 }
        L_0x0268:
            X.0V3 r0 = X.AnonymousClass0V3.A08
            r0.A02()
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03390Ii.run():void");
    }
}
