package X;

/* renamed from: X.1nT  reason: invalid class name and case insensitive filesystem */
public class C36391nT {
    public final C36181n8 A00;

    public C36391nT(C36181n8 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        r1 = new java.lang.AssertionError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        throw new java.lang.AssertionError(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4 A[ExcHandler: 1nI | 1nJ (r1v1 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:3:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C36401nU A00(X.C36061mw r15) {
        /*
            r14 = this;
            java.lang.Object r7 = X.C36191n9.A00
            monitor-enter(r7)
            r1 = 3
            X.1n8 r5 = r14.A00     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1fB r4 = r5.A00(r15)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            java.util.LinkedList r3 = r4.A00     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            boolean r0 = r3.isEmpty()     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            if (r0 != 0) goto L_0x0026
            X.1nB r0 = r4.A00()     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r2 = 1
            int r2 = r2 << r1
            X.1nC r0 = r0.A00     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1XE r1 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nG r0 = new X.1nG     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r0.<init>((java.util.List) r1)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            byte[][] r0 = r0.A01     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            int r0 = r0.length     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            if (r2 == r0) goto L_0x0061
        L_0x0026:
            r0 = 32
            byte[] r6 = new byte[r0]     // Catch:{ NoSuchAlgorithmException -> 0x0096, 1nI | 1nJ -> 0x00a4 }
            java.lang.String r1 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0096, 1nI | 1nJ -> 0x00a4 }
            r0.nextBytes(r6)     // Catch:{ NoSuchAlgorithmException -> 0x0096, 1nI | 1nJ -> 0x00a4 }
            X.1nG r2 = new X.1nG     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r2.<init>((byte[]) r6)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x009d, 1nI | 1nJ -> 0x00a4 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r12 = r1.nextInt(r0)     // Catch:{ NoSuchAlgorithmException -> 0x009d, 1nI | 1nJ -> 0x00a4 }
            byte[][] r11 = r2.A01     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nd r0 = X.C36241nE.A01()     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r3.clear()     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r13 = 0
            X.1nF r9 = r0.A01     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nV r0 = r0.A00     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1ng r10 = new X.1ng     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r10.<init>(r0)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nB r8 = new X.1nB     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r3.add(r8)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r5.A01(r15, r4)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
        L_0x0061:
            X.1nB r5 = r4.A00()     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nC r0 = r5.A00     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            int r4 = r0.A01     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1XE r1 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nG r0 = new X.1nG     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r0.<init>((java.util.List) r1)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            int r3 = r0.A00     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nC r0 = r5.A00     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1XE r1 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nG r0 = new X.1nG     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r0.<init>((java.util.List) r1)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            byte[][] r2 = r0.A01     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nC r0 = r5.A00     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nD r0 = r0.A03     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            if (r0 != 0) goto L_0x0085
            X.1nD r0 = X.C36231nD.A03     // Catch:{ 1nI | 1nJ -> 0x00a4 }
        L_0x0085:
            X.1Ww r0 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            byte[] r0 = r0.A04()     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nF r1 = X.C36241nE.A00(r0)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            X.1nU r0 = new X.1nU     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r0.<init>(r1, r2, r4, r3)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            monitor-exit(r7)     // Catch:{ all -> 0x00ab }
            return r0
        L_0x0096:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r1.<init>(r0)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            goto L_0x00a3
        L_0x009d:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ 1nI | 1nJ -> 0x00a4 }
            r1.<init>(r0)     // Catch:{ 1nI | 1nJ -> 0x00a4 }
        L_0x00a3:
            throw r1     // Catch:{ 1nI | 1nJ -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00ab }
            r0.<init>(r1)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00ab }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36391nT.A00(X.1mw):X.1nU");
    }
}
