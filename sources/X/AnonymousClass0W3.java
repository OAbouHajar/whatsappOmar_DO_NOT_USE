package X;

/* renamed from: X.0W3  reason: invalid class name */
public final class AnonymousClass0W3 {
    public static final AnonymousClass0W3 A00 = new AnonymousClass0W3();

    public static final boolean A00(String str, String str2) {
        if (!C008603x.A0F(str2, "*")) {
            return false;
        }
        if (str2.equals("*")) {
            return true;
        }
        if (C008603x.A03(str2, "*", 0) != C008603x.A01(str2) || !C008703y.A0M(str2, "*")) {
            throw AnonymousClass000.A0T("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String substring = str2.substring(0, str2.length() - 1);
        C18450wi.A0B(substring);
        return C008703y.A0N(str, substring);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (A00(r1, r0) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (r0 != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.content.ComponentName r5, android.content.ComponentName r6) {
        /*
            r4 = this;
            java.lang.String r1 = "*"
            r3 = 1
            if (r5 != 0) goto L_0x001a
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = X.C18450wi.A0R(r0, r1)
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r6.getClassName()
            boolean r1 = X.C18450wi.A0R(r0, r1)
        L_0x0017:
            if (r1 == 0) goto L_0x0074
            return r3
        L_0x001a:
            java.lang.String r0 = r5.toString()
            X.C18450wi.A0B(r0)
            boolean r0 = X.C008603x.A0F(r0, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0076
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 != 0) goto L_0x004c
            java.lang.String r1 = r5.getPackageName()
            X.C18450wi.A0B(r1)
            java.lang.String r0 = r6.getPackageName()
            X.C18450wi.A0B(r0)
            boolean r0 = A00(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x004d
        L_0x004c:
            r2 = 1
        L_0x004d:
            java.lang.String r1 = r5.getClassName()
            java.lang.String r0 = r6.getClassName()
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 != 0) goto L_0x0070
            java.lang.String r1 = r5.getClassName()
            X.C18450wi.A0B(r1)
            java.lang.String r0 = r6.getClassName()
            X.C18450wi.A0B(r0)
            boolean r0 = A00(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0071
        L_0x0070:
            r1 = 1
        L_0x0071:
            if (r2 == 0) goto L_0x0074
            goto L_0x0017
        L_0x0074:
            r3 = 0
            return r3
        L_0x0076:
            java.lang.String r0 = "Wildcard can only be part of the rule."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W3.A01(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
