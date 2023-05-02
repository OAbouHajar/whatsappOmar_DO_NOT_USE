package X;

/* renamed from: X.1xL  reason: invalid class name and case insensitive filesystem */
public class C42171xL {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C42171xL(String str, String str2, int i2, int i3, boolean z2) {
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z2;
        this.A01 = i2;
        this.A00 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C42171xL A00(X.C14710pd r9, X.C16740tZ r10) {
        /*
            X.1uH r2 = r10.A0N
            if (r2 == 0) goto L_0x0079
            int r1 = r2.A01
            r0 = 2
            if (r1 != r0) goto L_0x0029
            java.lang.String r3 = r2.A04
            int r4 = X.C42181xM.A01(r3)
            java.lang.String r2 = r2.A07
            r6 = 1
            if (r4 == 0) goto L_0x0021
            r0 = 4
            if (r4 != r0) goto L_0x0022
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 == r0) goto L_0x0021
            r0 = 22
            if (r1 != r0) goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            r5 = 0
            X.1xL r1 = new X.1xL
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0029:
            java.lang.String r6 = r2.A07
            java.lang.String r7 = r2.A08
            if (r6 == 0) goto L_0x0077
            java.lang.String[] r0 = X.C30931dC.A03
            java.lang.String r0 = X.C30931dC.A03(r6, r0)
            android.net.Uri r5 = android.net.Uri.parse(r0)
            java.lang.String[] r4 = X.AnonymousClass021.A0Q
            if (r5 == 0) goto L_0x005c
            java.lang.String r3 = r5.getHost()
            if (r3 == 0) goto L_0x005c
            int r2 = r4.length
            r1 = 0
        L_0x0045:
            if (r1 >= r2) goto L_0x005c
            r0 = r4[r1]
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0059
            r9 = 1
        L_0x0050:
            r8 = 0
            X.1xL r1 = new X.1xL
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return r1
        L_0x0059:
            int r1 = r1 + 1
            goto L_0x0045
        L_0x005c:
            java.lang.String[] r4 = X.AnonymousClass021.A0R
            if (r5 == 0) goto L_0x0077
            java.lang.String r3 = r5.getHost()
            if (r3 == 0) goto L_0x0077
            int r2 = r4.length
            r1 = 0
        L_0x0068:
            if (r1 >= r2) goto L_0x0077
            r0 = r4[r1]
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0074
            r9 = 2
            goto L_0x0050
        L_0x0074:
            int r1 = r1 + 1
            goto L_0x0068
        L_0x0077:
            r9 = 0
            goto L_0x0050
        L_0x0079:
            boolean r0 = r10 instanceof X.C30581cc
            if (r0 == 0) goto L_0x00fb
            X.1cc r10 = (X.C30581cc) r10
            java.lang.String r0 = r10.A06
            java.lang.String r1 = r10.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0090
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r0 = 0
            if (r1 != 0) goto L_0x0091
        L_0x0090:
            r0 = 1
        L_0x0091:
            r5 = 0
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r10.A0I()
            java.lang.String r4 = X.C30931dC.A01(r0)
            if (r4 == 0) goto L_0x00f9
            java.lang.String r0 = r10.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00f6
            r5 = r4
        L_0x00a7:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r3 = 0
            if (r0 != 0) goto L_0x00f3
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00f1
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00f1
            int r6 = X.C42181xM.A01(r5)
        L_0x00be:
            byte[] r0 = r10.A17()
            if (r0 == 0) goto L_0x00c5
            r3 = 1
        L_0x00c5:
            int r2 = r10.A01
            r8 = 1
            if (r6 == 0) goto L_0x00d7
            r0 = 4
            if (r6 != r0) goto L_0x00e0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 == r0) goto L_0x00d7
            r0 = 22
            if (r1 != r0) goto L_0x00e0
        L_0x00d7:
            r8 = 0
        L_0x00d8:
            r7 = 0
            X.1xL r1 = new X.1xL
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        L_0x00e0:
            if (r2 != r8) goto L_0x00d7
            if (r3 != 0) goto L_0x00d8
            if (r9 == 0) goto L_0x00d7
            r1 = 2060(0x80c, float:2.887E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r9.A0E(r0, r1)
            if (r0 == 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00f1:
            r6 = 0
            goto L_0x00be
        L_0x00f3:
            r8 = 0
            r6 = 0
            goto L_0x00d8
        L_0x00f6:
            java.lang.String r5 = r10.A07
            goto L_0x00a7
        L_0x00f9:
            r4 = r5
            goto L_0x00a7
        L_0x00fb:
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            X.1xL r1 = new X.1xL
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42171xL.A00(X.0pd, X.0tZ):X.1xL");
    }
}
