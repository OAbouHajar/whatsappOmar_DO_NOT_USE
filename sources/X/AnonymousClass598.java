package X;

/* renamed from: X.598  reason: invalid class name */
public class AnonymousClass598 implements C109165Qy {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r1 == '-') goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0069, code lost:
        if (r1 == '.') goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006b, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        if (r2 >= r6) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006f, code lost:
        r1 = r10.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (r1 < '0') goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0075, code lost:
        if (r1 <= '9') goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0077, code lost:
        if (r2 == r6) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007b, code lost:
        if (r1 == 'E') goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007f, code lost:
        if (r1 != 'e') goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0081, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0083, code lost:
        if (r2 == r6) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0085, code lost:
        r1 = r10.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008b, code lost:
        if (r1 == '+') goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008d, code lost:
        if (r1 != '-') goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008f, code lost:
        r2 = r2 + 1;
        r10.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0094, code lost:
        if (r2 != r6) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0096, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0097, code lost:
        if (r2 >= r6) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0099, code lost:
        r0 = r10.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x009d, code lost:
        if (r0 < '0') goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009f, code lost:
        if (r0 > '9') goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a1, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a4, code lost:
        if (r2 != r6) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ALc(java.lang.String r10) {
        /*
            r9 = this;
            r7 = 0
            if (r10 == 0) goto L_0x00a7
            int r6 = r10.length()
            r8 = 1
            if (r6 == 0) goto L_0x00a6
            java.lang.String r0 = r10.trim()
            if (r0 != r10) goto L_0x00a6
            char r1 = r10.charAt(r7)
            boolean r0 = X.C90424e7.A00(r1)
            if (r0 != 0) goto L_0x00a6
            boolean r0 = X.C90424e7.A01(r1)
            if (r0 != 0) goto L_0x00a6
            r2 = 1
        L_0x0021:
            if (r2 >= r6) goto L_0x0040
            char r1 = r10.charAt(r2)
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L_0x00a6
            r0 = 93
            if (r1 == r0) goto L_0x00a6
            r0 = 44
            if (r1 == r0) goto L_0x00a6
            r0 = 58
            if (r1 == r0) goto L_0x00a6
            boolean r0 = X.C90424e7.A01(r1)
            if (r0 != 0) goto L_0x00a6
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0040:
            boolean r0 = X.C90424e7.A02(r10)
            if (r0 != 0) goto L_0x00a6
            char r1 = r10.charAt(r7)
            r5 = 45
            r4 = 57
            r3 = 48
            if (r1 < r3) goto L_0x0055
            if (r1 <= r4) goto L_0x0057
            return r7
        L_0x0055:
            if (r1 != r5) goto L_0x00a7
        L_0x0057:
            r2 = 1
        L_0x0058:
            if (r2 >= r6) goto L_0x0065
            char r1 = r10.charAt(r2)
            if (r1 < r3) goto L_0x0065
            if (r1 > r4) goto L_0x0065
            int r2 = r2 + 1
            goto L_0x0058
        L_0x0065:
            if (r2 == r6) goto L_0x00a6
            r0 = 46
            if (r1 != r0) goto L_0x006d
        L_0x006b:
            int r2 = r2 + 1
        L_0x006d:
            if (r2 >= r6) goto L_0x0077
            char r1 = r10.charAt(r2)
            if (r1 < r3) goto L_0x0077
            if (r1 <= r4) goto L_0x006b
        L_0x0077:
            if (r2 == r6) goto L_0x00a6
            r0 = 69
            if (r1 == r0) goto L_0x0081
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L_0x0094
        L_0x0081:
            int r2 = r2 + 1
            if (r2 == r6) goto L_0x00a7
            char r1 = r10.charAt(r2)
            r0 = 43
            if (r1 == r0) goto L_0x008f
            if (r1 != r5) goto L_0x0094
        L_0x008f:
            int r2 = r2 + 1
            r10.charAt(r2)
        L_0x0094:
            if (r2 != r6) goto L_0x0097
            return r7
        L_0x0097:
            if (r2 >= r6) goto L_0x00a4
            char r0 = r10.charAt(r2)
            if (r0 < r3) goto L_0x00a4
            if (r0 > r4) goto L_0x00a4
            int r2 = r2 + 1
            goto L_0x0097
        L_0x00a4:
            if (r2 != r6) goto L_0x00a7
        L_0x00a6:
            return r8
        L_0x00a7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass598.ALc(java.lang.String):boolean");
    }
}
