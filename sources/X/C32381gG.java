package X;

/* renamed from: X.1gG  reason: invalid class name and case insensitive filesystem */
public abstract class C32381gG {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.String) r7) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zzd(java.lang.Object r7, int r8) {
        /*
            r0 = 10
            if (r8 <= r0) goto L_0x0007
            java.lang.String r0 = "ERROR: Recursive toString calls"
            return r0
        L_0x0007:
            java.lang.String r5 = ""
            if (r7 == 0) goto L_0x0018
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L_0x0019
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00fe
        L_0x0018:
            return r5
        L_0x0019:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0027
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
        L_0x0024:
            if (r4 != 0) goto L_0x00fe
            return r5
        L_0x0027:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0037
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x0024
        L_0x0037:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0047
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            double r2 = r0.doubleValue()
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x0024
        L_0x0047:
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0053
            r0 = r7
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
            goto L_0x0024
        L_0x0053:
            boolean r0 = r7 instanceof java.util.List
            java.lang.String r6 = ", "
            if (r0 == 0) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r8 <= 0) goto L_0x0065
            java.lang.String r0 = "["
            r5.append(r0)
        L_0x0065:
            java.util.List r7 = (java.util.List) r7
            int r3 = r5.length()
            java.util.Iterator r2 = r7.iterator()
        L_0x006f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r1 = r2.next()
            int r0 = r5.length()
            if (r0 <= r3) goto L_0x0082
            r5.append(r6)
        L_0x0082:
            int r0 = r8 + 1
            java.lang.String r0 = zzd(r1, r0)
            r5.append(r0)
            goto L_0x006f
        L_0x008c:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L_0x00fe
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Map r7 = (java.util.Map) r7
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r7)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
            r4 = 0
            r3 = 0
        L_0x00a6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getValue()
            int r0 = r8 + 1
            java.lang.String r1 = zzd(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a6
            if (r8 <= 0) goto L_0x00d1
            if (r4 != 0) goto L_0x00d1
            java.lang.String r0 = "{"
            r5.append(r0)
            int r3 = r5.length()
            r4 = 1
        L_0x00d1:
            int r0 = r5.length()
            if (r0 <= r3) goto L_0x00da
            r5.append(r6)
        L_0x00da:
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r5.append(r0)
            r0 = 61
            r5.append(r0)
            r5.append(r1)
            goto L_0x00a6
        L_0x00ec:
            if (r4 == 0) goto L_0x00f9
            java.lang.String r0 = "}"
            goto L_0x00f6
        L_0x00f2:
            if (r8 <= 0) goto L_0x00f9
            java.lang.String r0 = "]"
        L_0x00f6:
            r5.append(r0)
        L_0x00f9:
            java.lang.String r0 = r5.toString()
            return r0
        L_0x00fe:
            java.lang.String r0 = r7.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32381gG.zzd(java.lang.Object, int):java.lang.String");
    }

    public abstract void zzc(C32381gG r1);
}
