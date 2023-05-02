package X;

/* renamed from: X.4tc  reason: invalid class name and case insensitive filesystem */
public class C99184tc implements AnonymousClass5RK {
    public C31201dg A00;
    public final C14980q6 A01;
    public final String A02;

    public C99184tc(C14980q6 r1, String str) {
        this.A02 = str;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5.A0I().equals(r3) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C31201dg A51(X.C31201dg r5) {
        /*
            r4 = this;
            java.lang.String r3 = r4.A02
            java.lang.String r0 = r5.A0I()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r5.A0I()
            boolean r1 = r0.equals(r3)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.String r2 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x001e
            X.1dg r0 = r4.A00
            if (r0 != 0) goto L_0x0058
            r4.A00 = r5
        L_0x001e:
            java.util.LinkedList r0 = r5.A04
            if (r0 == 0) goto L_0x0042
            java.util.Iterator r1 = r0.iterator()
        L_0x0026:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r1.next()
            X.4Lg r0 = (X.C84624Lg) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0026
            X.1dg r0 = r4.A00
            if (r0 != 0) goto L_0x0058
            r4.A00 = r5
        L_0x0042:
            X.1dg r0 = r4.A00
            if (r0 == 0) goto L_0x0057
            r0 = 134(0x86, float:1.88E-43)
            X.0q1 r2 = r5.A0H(r0)
            if (r2 == 0) goto L_0x0057
            X.0q3 r1 = X.AnonymousClass3K3.A0Z(r5)
            X.0q6 r0 = r4.A01
            r0.A01(r1, r2)
        L_0x0057:
            return r5
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99184tc.A51(X.1dg):X.1dg");
    }

    public void AZQ(C31201dg r2) {
        if (this.A00 == r2) {
            this.A00 = null;
        }
    }
}
