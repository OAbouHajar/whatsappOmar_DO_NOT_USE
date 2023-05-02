package X;

/* renamed from: X.43a  reason: invalid class name and case insensitive filesystem */
public final class C802243a extends Exception {
    public final int zza;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = r1.equals(r0);
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r0 != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C802243a(java.lang.String r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            r2 = 4
            if (r4 == 0) goto L_0x0013
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r4.toLowerCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1743242157: goto L_0x0017;
                case -1290953729: goto L_0x001f;
                case -920906446: goto L_0x0026;
                case -617027085: goto L_0x0029;
                case -95047692: goto L_0x0031;
                default: goto L_0x0013;
            }
        L_0x0013:
            r2 = 0
        L_0x0014:
            r3.zza = r2
            return
        L_0x0017:
            java.lang.String r0 = "service_not_available"
            boolean r0 = r1.equals(r0)
            r2 = 3
            goto L_0x0038
        L_0x001f:
            java.lang.String r0 = "toomanymessages"
            boolean r0 = r1.equals(r0)
            goto L_0x0038
        L_0x0026:
            java.lang.String r0 = "invalid_parameters"
            goto L_0x0033
        L_0x0029:
            java.lang.String r0 = "messagetoobig"
            boolean r0 = r1.equals(r0)
            r2 = 2
            goto L_0x0038
        L_0x0031:
            java.lang.String r0 = "missing_to"
        L_0x0033:
            boolean r0 = r1.equals(r0)
            r2 = 1
        L_0x0038:
            if (r0 != 0) goto L_0x0014
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802243a.<init>(java.lang.String):void");
    }
}
