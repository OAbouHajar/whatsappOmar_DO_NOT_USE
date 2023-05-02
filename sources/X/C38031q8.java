package X;

/* renamed from: X.1q8  reason: invalid class name and case insensitive filesystem */
public class C38031q8 {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r2 = r5.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.net.URL r6) {
        /*
            if (r6 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            java.lang.String r5 = r6.getPath()
            if (r5 == 0) goto L_0x0062
            int r2 = r5.length()
            r1 = 25
            if (r2 <= r1) goto L_0x0062
            r0 = 0
            int r2 = r2 - r1
            java.lang.String r4 = r5.substring(r0, r2)
        L_0x0018:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r0 = r6.getProtocol()
            android.net.Uri$Builder r1 = r3.scheme(r0)
            java.lang.String r0 = r6.getHost()
            android.net.Uri$Builder r2 = r1.authority(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "***"
            r1.append(r0)
            X.AnonymousClass00B.A06(r5)
            int r0 = r5.length()
            int r0 = r0 + -4
            java.lang.String r0 = r5.substring(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri$Builder r1 = r2.path(r0)
            java.lang.String r0 = r6.getQuery()
            r1.encodedQuery(r0)
            android.net.Uri r0 = r3.build()
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0062:
            java.lang.String r4 = ""
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38031q8.A00(java.net.URL):java.lang.String");
    }
}
