package X;

/* renamed from: X.3b3  reason: invalid class name and case insensitive filesystem */
public class C67133b3 extends C98524sY {
    public C67293bJ A00;
    public boolean A01 = false;
    public final C67293bJ A02;

    public C67133b3(C67293bJ r3) {
        this.A02 = r3;
        this.A00 = (C67293bJ) r3.A08(4);
    }

    public static void A00(C67133b3 r1) {
        if (r1.A01) {
            r1.A02();
            r1.A01 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        if (r1 != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ X.C109905Uc A01() {
        /*
            r4 = this;
            X.5Uc r3 = r4.AjK()
            X.3bJ r3 = (X.C67293bJ) r3
            r0 = 1
            java.lang.Object r0 = r3.A08(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            r0 = 1
            if (r1 == r0) goto L_0x0024
            if (r1 == 0) goto L_0x0025
            X.5TK r0 = X.AnonymousClass3K4.A0Q(r3)
            boolean r1 = r0.AjI(r3)
            r0 = 2
            r3.A08(r0)
            if (r1 == 0) goto L_0x0025
        L_0x0024:
            return r3
        L_0x0025:
            X.5Ah r0 = new X.5Ah
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67133b3.A01():X.5Uc");
    }

    public void A02() {
        C67293bJ r2 = (C67293bJ) this.A00.A08(4);
        AnonymousClass3K4.A0Q(r2).Aj9(r2, this.A00);
        this.A00 = r2;
    }

    public /* synthetic */ C109905Uc AjK() {
        if (!this.A01) {
            C67293bJ r1 = this.A00;
            AnonymousClass3K4.A0Q(r1).AjE(r1);
            this.A01 = true;
        }
        return this.A00;
    }

    public final /* synthetic */ C109905Uc AjR() {
        return this.A02;
    }

    public /* synthetic */ Object clone() {
        C67133b3 A002 = C67293bJ.A00(this.A02);
        A00(A002);
        C67293bJ r1 = A002.A00;
        AnonymousClass3K4.A0Q(r1).Aj9(r1, (C67293bJ) AjK());
        return A002;
    }
}
