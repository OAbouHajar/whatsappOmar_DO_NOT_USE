package X;

/* renamed from: X.17k  reason: invalid class name and case insensitive filesystem */
public class C223017k {
    public final C16040sK A00;
    public final C15810rt A01;

    public C223017k(C16040sK r1, C15810rt r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r2.A00 != 1) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(X.C16740tZ r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C39291sE     // Catch:{ NullPointerException -> 0x0074 }
            r5 = 0
            if (r0 == 0) goto L_0x0073
            r2 = r7
            X.1sE r2 = (X.C39291sE) r2     // Catch:{ NullPointerException -> 0x0074 }
            X.1ci r0 = r2.A04     // Catch:{ NullPointerException -> 0x0074 }
            r4 = 1
            if (r0 == 0) goto L_0x0020
            X.0rt r1 = r6.A01     // Catch:{ NullPointerException -> 0x0074 }
            com.whatsapp.jid.Jid r0 = r0.A01     // Catch:{ NullPointerException -> 0x0074 }
            X.0rv r0 = X.C16030sJ.A00(r0)     // Catch:{ NullPointerException -> 0x0074 }
            com.whatsapp.jid.GroupJid r0 = com.whatsapp.jid.GroupJid.of(r0)     // Catch:{ NullPointerException -> 0x0074 }
            int r0 = r1.A02(r0)     // Catch:{ NullPointerException -> 0x0074 }
            if (r0 != r4) goto L_0x0020
            return r5
        L_0x0020:
            int r3 = r2.A00     // Catch:{ NullPointerException -> 0x0074 }
            r0 = 4
            if (r3 != r0) goto L_0x003a
            int r0 = r2.A00     // Catch:{ NullPointerException -> 0x0074 }
            if (r0 == r4) goto L_0x0072
        L_0x0029:
            boolean r0 = r2 instanceof X.C39431sT     // Catch:{ NullPointerException -> 0x0074 }
            if (r0 == 0) goto L_0x0055
            r0 = r2
            X.1sT r0 = (X.C39431sT) r0     // Catch:{ NullPointerException -> 0x0074 }
            int r1 = r0.A00     // Catch:{ NullPointerException -> 0x0074 }
            r0 = 2
            if (r1 != r0) goto L_0x0055
            int r0 = r2.A00     // Catch:{ NullPointerException -> 0x0074 }
            if (r0 == r4) goto L_0x0055
            goto L_0x0072
        L_0x003a:
            r0 = 12
            if (r3 != r0) goto L_0x0043
            int r0 = r2.A00     // Catch:{ NullPointerException -> 0x0074 }
            if (r0 == r4) goto L_0x0072
            goto L_0x0029
        L_0x0043:
            r0 = 90
            if (r3 != r0) goto L_0x004c
            int r0 = r2.A00     // Catch:{ NullPointerException -> 0x0074 }
            if (r0 == r4) goto L_0x0072
            goto L_0x0029
        L_0x004c:
            r0 = 106(0x6a, float:1.49E-43)
            if (r3 != r0) goto L_0x0029
            int r0 = r2.A00     // Catch:{ NullPointerException -> 0x0074 }
            if (r0 == r4) goto L_0x0072
            goto L_0x0029
        L_0x0055:
            X.0sK r1 = r6.A00     // Catch:{ NullPointerException -> 0x0074 }
            boolean r0 = r2 instanceof X.C39451sV     // Catch:{ NullPointerException -> 0x0074 }
            if (r0 == 0) goto L_0x0064
            r0 = 88
            if (r3 == r0) goto L_0x0073
            r0 = 89
            if (r3 == r0) goto L_0x0073
            goto L_0x0068
        L_0x0064:
            boolean r0 = r2 instanceof X.C40351ty     // Catch:{ NullPointerException -> 0x0074 }
            if (r0 == 0) goto L_0x0073
        L_0x0068:
            X.0rv r0 = r2.A0B()     // Catch:{ NullPointerException -> 0x0074 }
            boolean r0 = r1.A0I(r0)     // Catch:{ NullPointerException -> 0x0074 }
            if (r0 != 0) goto L_0x0073
        L_0x0072:
            r5 = 1
        L_0x0073:
            return r5
        L_0x0074:
            r2 = move-exception
            java.lang.String r0 = "GroupMessageUtils/importantmsg/null "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.C38621r6.A0J(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223017k.A00(X.0tZ):boolean");
    }

    public final boolean A01(C16740tZ r5, int i2) {
        if (r5 instanceof C39291sE) {
            C39291sE r52 = (C39291sE) r5;
            if (r52.A00 == i2) {
                for (C15830rv A0I : r52.A01) {
                    if (this.A00.A0I(A0I)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
