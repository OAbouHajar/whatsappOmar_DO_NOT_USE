package X;

/* renamed from: X.43v  reason: invalid class name and case insensitive filesystem */
public class C804343v extends Exception {
    public static final long serialVersionUID = 8879024178584091857L;
    public int errorType;
    public int position;
    public Object unexpectedObject;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C804343v(java.lang.Object r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            java.lang.String r3 = "."
            if (r7 != 0) goto L_0x0029
            java.lang.String r0 = "Unexpected character ("
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = ") at position "
        L_0x0012:
            r2.append(r0)
        L_0x0015:
            r2.append(r6)
            r2.append(r3)
        L_0x001b:
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
            r4.position = r6
            r4.errorType = r7
            r4.unexpectedObject = r5
            return
        L_0x0029:
            r0 = 1
            java.lang.String r1 = " at position "
            if (r7 != r0) goto L_0x003a
            java.lang.String r0 = "Unexpected token "
        L_0x0030:
            r2.append(r0)
            r2.append(r5)
            r2.append(r1)
            goto L_0x0015
        L_0x003a:
            r0 = 2
            if (r7 != r0) goto L_0x0048
            java.lang.String r0 = "Unexpected exception "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " occur at position "
            goto L_0x0012
        L_0x0048:
            r0 = 3
            if (r7 != r0) goto L_0x005c
            java.lang.String r0 = "Unexpected End Of File position "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r5)
            goto L_0x001b
        L_0x005c:
            r0 = 4
            if (r7 != r0) goto L_0x0062
            java.lang.String r0 = "Unexpected unicode escape sequence "
            goto L_0x0030
        L_0x0062:
            r0 = 5
            if (r7 != r0) goto L_0x0068
            java.lang.String r0 = "Unexpected duplicate key:"
            goto L_0x0030
        L_0x0068:
            java.lang.String r0 = "Unexpected leading 0 in digit for token:"
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C804343v.<init>(java.lang.Object, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C804343v(java.lang.Throwable r5, int r6) {
        /*
            r4 = this;
            r3 = 2
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            java.lang.String r1 = "."
            java.lang.String r0 = "Unexpected exception "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " occur at position "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r2)
            r4.<init>(r0, r5)
            r4.position = r6
            r4.errorType = r3
            r4.unexpectedObject = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C804343v.<init>(java.lang.Throwable, int):void");
    }
}
