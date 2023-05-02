package X;

/* renamed from: X.474  reason: invalid class name */
public class AnonymousClass474 {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.security.cert.Certificate r6) {
        /*
            X.54n r2 = X.AnonymousClass493.A00
            byte[] r6 = r6.getEncoded()
            int r5 = r6.length
            r4 = 0
            X.C29031Zu.A03(r4, r5, r5)
            boolean r0 = r2.supportsClone
            if (r0 == 0) goto L_0x001f
            java.security.MessageDigest r0 = r2.prototype     // Catch:{ CloneNotSupportedException -> 0x001f }
            java.lang.Object r1 = r0.clone()     // Catch:{ CloneNotSupportedException -> 0x001f }
            java.security.MessageDigest r1 = (java.security.MessageDigest) r1     // Catch:{ CloneNotSupportedException -> 0x001f }
            int r0 = r2.bytes     // Catch:{ CloneNotSupportedException -> 0x001f }
            X.3d0 r3 = new X.3d0     // Catch:{ CloneNotSupportedException -> 0x001f }
            r3.<init>(r1, r0)     // Catch:{ CloneNotSupportedException -> 0x001f }
            goto L_0x0030
        L_0x001f:
            java.security.MessageDigest r0 = r2.prototype
            java.lang.String r0 = r0.getAlgorithm()
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0065 }
            int r0 = r2.bytes
            X.3d0 r3 = new X.3d0
            r3.<init>(r1, r0)
        L_0x0030:
            X.C29031Zu.A03(r4, r5, r5)
            boolean r0 = r3.A00
            r0 = r0 ^ 1
            java.lang.String r2 = "Cannot re-use a Hasher after calling hash() on it"
            X.C29031Zu.A04(r2, r0)
            java.security.MessageDigest r1 = r3.A03
            r1.update(r6, r4, r5)
            boolean r0 = r3.A00
            r0 = r0 ^ 1
            X.C29031Zu.A04(r2, r0)
            r0 = 1
            r3.A00 = r0
            int r2 = r3.A01
            int r0 = r1.getDigestLength()
            byte[] r1 = r1.digest()
            if (r2 == r0) goto L_0x005b
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
        L_0x005b:
            X.3d1 r0 = new X.3d1
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0065:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass3K4.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass474.A00(java.security.cert.Certificate):java.lang.String");
    }
}
