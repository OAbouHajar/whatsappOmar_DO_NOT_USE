package X;

/* renamed from: X.1q9  reason: invalid class name and case insensitive filesystem */
public class C38041q9 extends C38051qA {
    public final int responseCode;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        if (r3 >= 500) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r4.contains("URL signature expired") != false) goto L_0x003f;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C38041q9(int r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L_0x0027
            r0 = 401(0x191, float:5.62E-43)
            r1 = 8
            if (r3 == r0) goto L_0x0029
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L_0x0035
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L_0x003f
            r0 = 408(0x198, float:5.72E-43)
            if (r3 == r0) goto L_0x0027
            r0 = 410(0x19a, float:5.75E-43)
            if (r3 == r0) goto L_0x003f
            r0 = 416(0x1a0, float:5.83E-43)
            if (r3 == r0) goto L_0x0033
            r0 = 507(0x1fb, float:7.1E-43)
            if (r3 == r0) goto L_0x0030
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = -1
            if (r3 < r0) goto L_0x0029
        L_0x0027:
            r1 = 16
        L_0x0029:
            r0 = 0
            r2.<init>(r0, r0, r1)
            r2.responseCode = r3
            return
        L_0x0030:
            r1 = 12
            goto L_0x0029
        L_0x0033:
            r1 = 6
            goto L_0x0029
        L_0x0035:
            if (r4 == 0) goto L_0x0029
            java.lang.String r0 = "URL signature expired"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0029
        L_0x003f:
            r1 = 5
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38041q9.<init>(int, java.lang.String):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("failed to download; code=");
        sb.append(this.responseCode);
        sb.append("; status=");
        sb.append(C31701et.A00(this.downloadStatus));
        return sb.toString();
    }
}
