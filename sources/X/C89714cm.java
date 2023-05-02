package X;

import java.security.AccessControlException;

/* renamed from: X.4cm  reason: invalid class name and case insensitive filesystem */
public class C89714cm {
    public static final ThreadLocal A00 = new ThreadLocal();

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = X.C13690nt.A0e(r2, (r0 = (java.util.Map) A00.get()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r2) {
        /*
            r1 = 0
            com.facebook.redex.IDxPActionShape4S1000000_2_I1 r0 = new com.facebook.redex.IDxPActionShape4S1000000_2_I1
            r0.<init>(r2, r1)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x001e
            java.lang.ThreadLocal r0 = A00
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = X.C13690nt.A0e(r2, r0)
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            return r0
        L_0x001f:
            r1 = 1
            com.facebook.redex.IDxPActionShape4S1000000_2_I1 r0 = new com.facebook.redex.IDxPActionShape4S1000000_2_I1
            r0.<init>(r2, r1)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89714cm.A00(java.lang.String):java.lang.String");
    }

    public static boolean A01(String str) {
        try {
            String A002 = A00(str);
            if (A002 == null || A002.length() != 4) {
                return false;
            }
            if (A002.charAt(0) != 't' && A002.charAt(0) != 'T') {
                return false;
            }
            if (A002.charAt(1) != 'r' && A002.charAt(1) != 'R') {
                return false;
            }
            if (A002.charAt(2) == 'u' || A002.charAt(2) == 'U') {
                return A002.charAt(3) == 'e' || A002.charAt(3) == 'E';
            }
            return false;
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
