package X;

/* renamed from: X.4Ut  reason: invalid class name and case insensitive filesystem */
public final class C86944Ut {
    public final int A00;
    public final int A01;
    public final C32491gT A02;
    public final C32491gT A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r6 == 0) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C86944Ut(X.C32491gT r2, X.C32491gT r3, java.lang.String r4, int r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            if (r5 == 0) goto L_0x0008
            r0 = 0
            if (r6 != 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.C90524eJ.A03(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x001d
            r1.A04 = r4
            r1.A03 = r2
            r1.A02 = r3
            r1.A01 = r5
            r1.A00 = r6
            return
        L_0x001d:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass3K3.A0f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86944Ut.<init>(X.1gT, X.1gT, java.lang.String, int, int):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C86944Ut.class != obj.getClass()) {
                return false;
            }
            C86944Ut r5 = (C86944Ut) obj;
            if (this.A01 != r5.A01 || this.A00 != r5.A00 || !this.A04.equals(r5.A04) || !this.A03.equals(r5.A03) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A02, AnonymousClass000.A0E(this.A03, AnonymousClass3K2.A09(this.A04, (AnonymousClass3K3.A07(this.A01) + this.A00) * 31)));
    }
}
