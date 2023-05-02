package X;

/* renamed from: X.4tb  reason: invalid class name and case insensitive filesystem */
public class C99174tb implements AnonymousClass5RK {
    public C31201dg A00;
    public final C14980q6 A01;
    public final String A02;

    public C99174tb(C14980q6 r1, String str) {
        this.A02 = str;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r7.A0I().equals(r5) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C31201dg A51(X.C31201dg r7) {
        /*
            r6 = this;
            java.lang.String r5 = r6.A02
            java.lang.String r0 = r7.A0I()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r7.A0I()
            boolean r1 = r0.equals(r5)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.String r4 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x001e
            X.1dg r0 = r6.A00
            if (r0 != 0) goto L_0x0053
            r6.A00 = r7
        L_0x001e:
            java.util.LinkedList r0 = r7.A04
            if (r0 == 0) goto L_0x0052
            java.util.Iterator r3 = r0.iterator()
        L_0x0026:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r3.next()
            X.4Lg r1 = (X.C84624Lg) r1
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0042
            X.1dg r0 = r6.A00
            if (r0 != 0) goto L_0x0053
            r6.A00 = r7
        L_0x0042:
            X.1dg r0 = r6.A00
            if (r0 == 0) goto L_0x0026
            X.0q1 r2 = r1.A01
            if (r2 == 0) goto L_0x0026
            X.0q6 r1 = r6.A01
            X.0q3 r0 = X.C14950q3.A01
            r1.A01(r0, r2)
            goto L_0x0026
        L_0x0052:
            return r7
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99174tb.A51(X.1dg):X.1dg");
    }

    public void AZQ(C31201dg r2) {
        if (this.A00 == r2) {
            this.A00 = null;
        }
    }
}
