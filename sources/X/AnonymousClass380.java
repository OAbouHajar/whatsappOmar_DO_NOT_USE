package X;

/* renamed from: X.380  reason: invalid class name */
public final class AnonymousClass380 {
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        if (r6.equals("full") != false) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[SYNTHETIC, Splitter:B:8:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A00(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            java.lang.String r1 = "DatetimeTextProviderUtils"
            if (r6 == 0) goto L_0x000e
            int r3 = X.C62163Bx.A06(r6)     // Catch:{ 40K -> 0x0009 }
            goto L_0x000f
        L_0x0009:
            java.lang.String r0 = "Error while parsing DateTime format"
            X.C29691b2.A00(r1, r0)
        L_0x000e:
            r3 = 2
        L_0x000f:
            if (r7 == 0) goto L_0x001b
            int r4 = X.C62163Bx.A06(r7)     // Catch:{ 40K -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            java.lang.String r0 = "Error while parsing Time format"
            X.C29691b2.A00(r1, r0)
        L_0x001b:
            r4 = r3
        L_0x001c:
            if (r6 != 0) goto L_0x0020
            java.lang.String r6 = "medium"
        L_0x0020:
            int r0 = r5.hashCode()
            r2 = 2
            r1 = -1
            switch(r0) {
                case 3076014: goto L_0x004c;
                case 3560141: goto L_0x0041;
                case 1793702779: goto L_0x0037;
                default: goto L_0x0029;
            }
        L_0x0029:
            switch(r1) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0096;
                case 2: goto L_0x0056;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.String r0 = "Unknown dateformat type: "
            java.lang.String r0 = X.C13680ns.A0h(r0, r5)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0037:
            java.lang.String r0 = "datetime"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0029
            r1 = 2
            goto L_0x0029
        L_0x0041:
            java.lang.String r0 = "time"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0029
            r1 = 1
            goto L_0x0029
        L_0x004c:
            java.lang.String r0 = "date"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0029
            r1 = 0
            goto L_0x0029
        L_0x0056:
            java.text.DateFormat r2 = java.text.DateFormat.getDateTimeInstance(r3, r4)
            goto L_0x009a
        L_0x005b:
            java.lang.String r0 = "short"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "medium"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "long"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "full"
            boolean r1 = r6.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x007e
        L_0x007d:
            r0 = 1
        L_0x007e:
            if (r0 == 0) goto L_0x008e
            int r0 = X.C62163Bx.A06(r6)     // Catch:{ 40K -> 0x0089 }
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r0)     // Catch:{ 40K -> 0x0089 }
            goto L_0x009a
        L_0x0089:
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r2)
            goto L_0x009a
        L_0x008e:
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            r2.<init>(r6, r0)
            goto L_0x009a
        L_0x0096:
            java.text.DateFormat r2 = java.text.DateFormat.getTimeInstance(r4)
        L_0x009a:
            if (r8 != 0) goto L_0x00a8
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.TimeZone r0 = r0.getTimeZone()
            java.lang.String r8 = r0.getID()
        L_0x00a8:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r8)
            r2.setTimeZone(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = r2.format(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass380.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):java.lang.CharSequence");
    }
}
