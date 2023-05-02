package X;

/* renamed from: X.45L  reason: invalid class name */
public final class AnonymousClass45L {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r4 <= 126) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.AnonymousClass557 r5) {
        /*
            int r0 = r5.A02()
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            r2 = 0
        L_0x0009:
            int r0 = r5.A02()
            if (r2 >= r0) goto L_0x00b6
            r4 = r5
            X.3am r4 = (X.C66963am) r4
            boolean r0 = r4 instanceof X.C66953al
            if (r0 == 0) goto L_0x003d
            X.3al r4 = (X.C66953al) r4
            int r3 = r4.zzd
            int r0 = r2 + 1
            int r0 = r3 - r0
            r0 = r0 | r2
            if (r0 >= 0) goto L_0x0035
            if (r2 >= 0) goto L_0x009c
            r0 = 22
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Index < 0: "
            java.lang.String r1 = X.C13680ns.A0i(r0, r1, r2)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0035:
            byte[] r3 = r4.zzb
            int r0 = r4.zzc
            int r0 = r0 + r2
            byte r4 = r3[r0]
            goto L_0x0041
        L_0x003d:
            byte[] r0 = r4.zzb
            byte r4 = r0[r2]
        L_0x0041:
            r0 = 34
            if (r4 == r0) goto L_0x0093
            r0 = 39
            if (r4 == r0) goto L_0x0090
            r3 = 92
            if (r4 == r3) goto L_0x008d
            switch(r4) {
                case 7: goto L_0x0096;
                case 8: goto L_0x007b;
                case 9: goto L_0x007e;
                case 10: goto L_0x0081;
                case 11: goto L_0x0084;
                case 12: goto L_0x0087;
                case 13: goto L_0x008a;
                default: goto L_0x0050;
            }
        L_0x0050:
            r0 = 32
            if (r4 < r0) goto L_0x005f
            r0 = 126(0x7e, float:1.77E-43)
            if (r4 > r0) goto L_0x005f
        L_0x0058:
            char r0 = (char) r4
            r1.append(r0)
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x005f:
            r1.append(r3)
            int r0 = r4 >>> 6
            r0 = r0 & 3
            int r0 = r0 + 48
            char r0 = (char) r0
            r1.append(r0)
            int r0 = r4 >>> 3
            r0 = r0 & 7
            int r0 = r0 + 48
            char r0 = (char) r0
            r1.append(r0)
            r0 = r4 & 7
            int r4 = r0 + 48
            goto L_0x0058
        L_0x007b:
            java.lang.String r0 = "\\b"
            goto L_0x0098
        L_0x007e:
            java.lang.String r0 = "\\t"
            goto L_0x0098
        L_0x0081:
            java.lang.String r0 = "\\n"
            goto L_0x0098
        L_0x0084:
            java.lang.String r0 = "\\v"
            goto L_0x0098
        L_0x0087:
            java.lang.String r0 = "\\f"
            goto L_0x0098
        L_0x008a:
            java.lang.String r0 = "\\r"
            goto L_0x0098
        L_0x008d:
            java.lang.String r0 = "\\\\"
            goto L_0x0098
        L_0x0090:
            java.lang.String r0 = "\\'"
            goto L_0x0098
        L_0x0093:
            java.lang.String r0 = "\\\""
            goto L_0x0098
        L_0x0096:
            java.lang.String r0 = "\\a"
        L_0x0098:
            r1.append(r0)
            goto L_0x005c
        L_0x009c:
            r0 = 40
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Index > length: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            java.lang.String r1 = X.C13680ns.A0i(r0, r1, r3)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass45L.A00(X.557):java.lang.String");
    }
}
