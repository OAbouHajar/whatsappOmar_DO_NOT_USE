package X;

import java.util.LinkedList;

/* renamed from: X.1mv  reason: invalid class name and case insensitive filesystem */
public class C36051mv {
    public final C36041mu A00;

    public C36051mv(C36041mu r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        throw new java.lang.AssertionError(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e A[ExcHandler: 1nI | 1nJ (r1v0 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C36081my A00(X.C36061mw r11) {
        /*
            r10 = this;
            X.1mu r3 = r10.A00     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.1fF r2 = r3.A00(r11)     // Catch:{ 1nI | 1nJ -> 0x008e }
            java.util.LinkedList r1 = r2.A00     // Catch:{ 1nI | 1nJ -> 0x008e }
            boolean r0 = r1.isEmpty()     // Catch:{ 1nI | 1nJ -> 0x008e }
            if (r0 == 0) goto L_0x0051
            java.lang.String r5 = "SHA1PRNG"
            java.security.SecureRandom r4 = java.security.SecureRandom.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x002e, 1nI | 1nJ -> 0x008e }
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r4.nextInt(r0)     // Catch:{ NoSuchAlgorithmException -> 0x002e, 1nI | 1nJ -> 0x008e }
            r0 = 32
            byte[] r7 = new byte[r0]     // Catch:{ NoSuchAlgorithmException -> 0x0027, 1nI | 1nJ -> 0x008e }
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0027, 1nI | 1nJ -> 0x008e }
            r0.nextBytes(r7)     // Catch:{ NoSuchAlgorithmException -> 0x0027, 1nI | 1nJ -> 0x008e }
            goto L_0x0035
        L_0x0027:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ 1nI | 1nJ -> 0x008e }
            r0.<init>(r1)     // Catch:{ 1nI | 1nJ -> 0x008e }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x008e }
        L_0x002e:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ 1nI | 1nJ -> 0x008e }
            r0.<init>(r1)     // Catch:{ 1nI | 1nJ -> 0x008e }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x008e }
        L_0x0035:
            X.1nd r0 = X.C36241nE.A01()     // Catch:{ 1nI | 1nJ -> 0x008e }
            r1.clear()     // Catch:{ 1nI | 1nJ -> 0x008e }
            r9 = 0
            X.1nF r5 = r0.A01     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.1nV r0 = r0.A00     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.1ng r6 = new X.1ng     // Catch:{ 1nI | 1nJ -> 0x008e }
            r6.<init>(r0)     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.1o0 r4 = new X.1o0     // Catch:{ 1nI | 1nJ -> 0x008e }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ 1nI | 1nJ -> 0x008e }
            r1.add(r4)     // Catch:{ 1nI | 1nJ -> 0x008e }
            r3.A01(r11, r2)     // Catch:{ 1nI | 1nJ -> 0x008e }
        L_0x0051:
            boolean r0 = r1.isEmpty()     // Catch:{ 1nI | 1nJ -> 0x008e }
            if (r0 != 0) goto L_0x0086
            r0 = 0
            java.lang.Object r1 = r1.get(r0)     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.1o0 r1 = (X.C36721o0) r1     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.1o1 r0 = r1.A00     // Catch:{ 1nI | 1nJ -> 0x008e }
            int r4 = r0.A01     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.4bH r0 = r1.A00()     // Catch:{ 1nI | 1nJ -> 0x008e }
            int r3 = r0.A00     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.4bH r0 = r1.A00()     // Catch:{ 1nI | 1nJ -> 0x008e }
            byte[] r2 = r0.A01     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.1o1 r0 = r1.A00     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.1nD r0 = r0.A04     // Catch:{ 1nI | 1nJ -> 0x008e }
            if (r0 != 0) goto L_0x0076
            X.1nD r0 = X.C36231nD.A03     // Catch:{ 1nI | 1nJ -> 0x008e }
        L_0x0076:
            X.1Ww r0 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x008e }
            byte[] r0 = r0.A04()     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.1nF r1 = X.C36241nE.A00(r0)     // Catch:{ 1nI | 1nJ -> 0x008e }
            X.1my r0 = new X.1my     // Catch:{ 1nI | 1nJ -> 0x008e }
            r0.<init>(r1, r2, r4, r3)     // Catch:{ 1nI | 1nJ -> 0x008e }
            return r0
        L_0x0086:
            java.lang.String r1 = "No key state in record!"
            X.1nI r0 = new X.1nI     // Catch:{ 1nI | 1nJ -> 0x008e }
            r0.<init>((java.lang.String) r1)     // Catch:{ 1nI | 1nJ -> 0x008e }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x008e }
        L_0x008e:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36051mv.A00(X.1mw):X.1my");
    }

    public void A01(C36061mw r12, C36081my r13) {
        C36041mu r4 = this.A00;
        C31921fF A002 = r4.A00(r12);
        int i2 = r13.A00;
        int i3 = r13.A01;
        byte[] bArr = r13.A03;
        C36251nF r6 = r13.A02;
        LinkedList linkedList = A002.A00;
        linkedList.addFirst(new C36721o0(r6, C36501ne.A00, bArr, i2, i3));
        if (linkedList.size() > 5) {
            linkedList.removeLast();
        }
        r4.A01(r12, A002);
    }
}
