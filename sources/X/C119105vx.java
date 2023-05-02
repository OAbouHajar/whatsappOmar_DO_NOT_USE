package X;

/* renamed from: X.5vx  reason: invalid class name and case insensitive filesystem */
public final class C119105vx {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        return r3.A0C(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.C14710pd r3, java.lang.String r4) {
        /*
            r0 = 0
            X.C18450wi.A0H(r3, r0)
            r2 = 0
            if (r4 == 0) goto L_0x0025
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0025
            r0 = 2617(0xa39, float:3.667E-42)
            boolean r0 = r3.A0C(r0)
            if (r0 == 0) goto L_0x0025
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r4.toLowerCase(r0)
            X.C18450wi.A0B(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case 113658: goto L_0x0026;
                case 3008417: goto L_0x0031;
                case 3197625: goto L_0x003c;
                case 100023093: goto L_0x0047;
                default: goto L_0x0025;
            }
        L_0x0025:
            return r2
        L_0x0026:
            java.lang.String r0 = "sbi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2740(0xab4, float:3.84E-42)
            goto L_0x0051
        L_0x0031:
            java.lang.String r0 = "axis"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2741(0xab5, float:3.841E-42)
            goto L_0x0051
        L_0x003c:
            java.lang.String r0 = "hdfc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2742(0xab6, float:3.842E-42)
            goto L_0x0051
        L_0x0047:
            java.lang.String r0 = "icici"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2739(0xab3, float:3.838E-42)
        L_0x0051:
            boolean r2 = r3.A0C(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119105vx.A00(X.0pd, java.lang.String):boolean");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C14710pd r6, java.lang.String r7) {
        /*
            r5 = 0
            boolean r4 = X.C110115dX.A19(r7, r6)
            r0 = 2944(0xb80, float:4.125E-42)
            java.lang.String r2 = r6.A05(r0)
            if (r2 == 0) goto L_0x003d
            int r0 = r2.length()
            if (r0 == 0) goto L_0x003d
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r0 = ","
            r1[r5] = r0
            r3 = 0
            java.util.List r1 = X.C008603x.A09(r2, r1, r5)
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r2 = r1.toArray(r0)
            if (r2 == 0) goto L_0x0036
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r1 = r2.length
        L_0x0029:
            if (r3 >= r1) goto L_0x003d
            r0 = r2[r3]
            int r3 = r3 + 1
            boolean r0 = X.C008703y.A0N(r7, r0)
            if (r0 == 0) goto L_0x0029
            return r4
        L_0x0036:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x003d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119105vx.A01(X.0pd, java.lang.String):boolean");
    }
}
