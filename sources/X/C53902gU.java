package X;

/* renamed from: X.2gU  reason: invalid class name and case insensitive filesystem */
public class C53902gU {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r0 != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C41421vl A00(X.C28371Vv r7) {
        /*
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r0 = "tos"
            X.1Vv r4 = r7.A0J(r0)
            r2 = 864000000(0x337f9800, double:4.26872718E-315)
            if (r4 == 0) goto L_0x0065
            java.lang.String r0 = "refresh"
            r7 = 0
            java.lang.String r1 = r4.A0N(r0, r7)
            boolean r0 = X.AnonymousClass1ZW.A0E(r1)
            if (r0 != 0) goto L_0x0025
            long r2 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0025 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
        L_0x0025:
            java.lang.String r0 = "notice"
            java.util.List r0 = r4.A0O(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x002f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r1 = r6.next()
            X.1Vv r1 = (X.C28371Vv) r1
            java.lang.String r0 = "id"
            java.lang.String r4 = r1.A0N(r0, r7)
            java.lang.String r0 = "state"
            java.lang.String r1 = r1.A0N(r0, r7)
            boolean r0 = X.AnonymousClass1ZW.A0E(r4)
            if (r0 != 0) goto L_0x002f
            boolean r0 = X.AnonymousClass1ZW.A0E(r1)
            if (r0 != 0) goto L_0x005b
            boolean r0 = java.lang.Boolean.parseBoolean(r1)
            r1 = 2
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            X.1vm r0 = new X.1vm
            r0.<init>(r4, r1)
            r5.add(r0)
            goto L_0x002f
        L_0x0065:
            X.1vl r0 = new X.1vl
            r0.<init>(r5, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53902gU.A00(X.1Vv):X.1vl");
    }
}
