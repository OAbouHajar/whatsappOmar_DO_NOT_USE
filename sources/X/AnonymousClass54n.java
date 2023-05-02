package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.54n  reason: invalid class name */
public final class AnonymousClass54n implements Serializable {
    public final int bytes;
    public final MessageDigest prototype;
    public final boolean supportsClone;
    public final String toString;

    public AnonymousClass54n() {
    }

    public AnonymousClass54n(String str, String str2) {
        boolean z2;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            this.prototype = instance;
            this.bytes = instance.getDigestLength();
            this.toString = "Hashing.sha256()";
            try {
                instance.clone();
                z2 = true;
            } catch (CloneNotSupportedException unused) {
                z2 = false;
            }
            this.supportsClone = z2;
        } catch (NoSuchAlgorithmException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r7 > r3) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass54n(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.toString = r6
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x003b }
            r4.prototype = r1
            int r3 = r1.getDigestLength()
            r0 = 4
            if (r7 < r0) goto L_0x0015
            r0 = 1
            if (r7 <= r3) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            java.lang.String r2 = "bytes (%s) must be >= 4 and < %s"
            if (r0 == 0) goto L_0x0026
            r4.bytes = r7
            r1.clone()     // Catch:{ CloneNotSupportedException -> 0x0020 }
            goto L_0x0022
        L_0x0020:
            r0 = 0
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            r4.supportsClone = r0
            return
        L_0x0026:
            java.lang.Object[] r1 = X.C13690nt.A1Z()
            r0 = 0
            X.AnonymousClass000.A1M(r1, r7, r0)
            r0 = 1
            X.AnonymousClass000.A1M(r1, r3, r0)
            java.lang.String r0 = com.google.common.base.Strings.A00(r2, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x003b:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass3K4.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54n.<init>(java.lang.String, java.lang.String, int):void");
    }

    public String toString() {
        return this.toString;
    }

    public Object writeReplace() {
        return new C1042354l(this.prototype.getAlgorithm(), this.toString, this.bytes);
    }
}
