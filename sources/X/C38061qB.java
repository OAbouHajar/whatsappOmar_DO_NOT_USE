package X;

/* renamed from: X.1qB  reason: invalid class name and case insensitive filesystem */
public class C38061qB extends C38051qA {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C38061qB(java.lang.String r3, java.lang.Exception r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L_0x0009
            r1 = 2
        L_0x0005:
            r2.<init>(r4, r3, r1)
            return
        L_0x0009:
            boolean r0 = r4 instanceof java.net.SocketTimeoutException
            r1 = 19
            if (r0 == 0) goto L_0x0005
            r1 = 3
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38061qB.<init>(java.lang.String, java.lang.Exception):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectionFailureException: ");
        sb.append(getMessage());
        return sb.toString();
    }
}
