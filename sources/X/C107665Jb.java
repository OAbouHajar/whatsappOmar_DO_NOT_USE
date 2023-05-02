package X;

/* renamed from: X.5Jb  reason: invalid class name and case insensitive filesystem */
public class C107665Jb extends AnonymousClass5BZ {
    public C107655Ja A00;
    public final Object A01;
    public volatile int A02;
    public volatile boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C107665Jb(X.AnonymousClass5Hs r9, X.AnonymousClass5NQ r10) {
        /*
            r8 = this;
            r4 = r9
            X.5II r0 = r9.A02     // Catch:{ Exception -> 0x0055 }
            java.lang.String r3 = X.C90754ek.A01(r0)     // Catch:{ Exception -> 0x0055 }
            X.1fb r0 = r0.A00     // Catch:{ Exception -> 0x0048 }
            if (r0 != 0) goto L_0x000d
            r6 = 0
            goto L_0x0011
        L_0x000d:
            byte[] r6 = X.AnonymousClass3K4.A1E(r0)     // Catch:{ Exception -> 0x0048 }
        L_0x0011:
            X.1fY r0 = X.AnonymousClass5IH.A0K     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = r0.A01     // Catch:{ Exception -> 0x0041 }
            X.5Hl r0 = r9.A03     // Catch:{ Exception -> 0x0041 }
            X.5Hu r1 = r0.A04     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x0034
            X.1fY r0 = X.AnonymousClass3K3.A0w(r2)     // Catch:{ Exception -> 0x0041 }
            X.5IH r0 = X.C107335Hu.A00(r0, r1)     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0034
            X.5Ib r0 = r0.A01     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0034
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0034
            X.5IF r0 = X.AnonymousClass5IF.A00(r0)     // Catch:{ Exception -> 0x0041 }
            boolean r7 = r0.A03     // Catch:{ Exception -> 0x0041 }
            goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            r2 = r8
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r0 = X.C13690nt.A0Y()
            r8.A01 = r0
            return
        L_0x0041:
            r1 = move-exception
            X.5BL r0 = new X.5BL
            r0.<init>(r1)
            throw r0
        L_0x0048:
            r1 = move-exception
            java.lang.String r0 = "CRL contents invalid: "
            java.lang.String r1 = X.AnonymousClass000.A0g(r0, r1)
            java.security.cert.CRLException r0 = new java.security.cert.CRLException
            r0.<init>(r1)
            throw r0
        L_0x0055:
            r1 = move-exception
            java.lang.String r0 = "CRL contents invalid: "
            java.lang.String r1 = X.AnonymousClass000.A0g(r0, r1)
            java.security.cert.CRLException r0 = new java.security.cert.CRLException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107665Jb.<init>(X.5Hs, X.5NQ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r7 = getEncoded();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C107655Ja A04() {
        /*
            r9 = this;
            java.lang.Object r1 = r9.A01
            monitor-enter(r1)
            X.5Ja r0 = r9.A00     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            return r0
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            byte[] r7 = r9.getEncoded()     // Catch:{ CRLException -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r7 = 0
        L_0x0010:
            X.5NQ r5 = r9.A02
            X.5Hs r4 = r9.A01
            java.lang.String r3 = r9.A00
            byte[] r6 = r9.A04
            boolean r8 = r9.A03
            X.5Ja r2 = new X.5Ja
            r2.<init>(r3, r4, r5, r6, r7, r8)
            monitor-enter(r1)
            X.5Ja r0 = r9.A00     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            r9.A00 = r2     // Catch:{ all -> 0x0029 }
            r0 = r2
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x002c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107665Jb.A04():X.5Ja");
    }

    public boolean equals(Object obj) {
        AnonymousClass5HY r1;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C107665Jb) {
            C107665Jb r3 = (C107665Jb) obj;
            if (!this.A03 || !r3.A03) {
                if ((this.A00 == null || r3.A00 == null) && (r1 = this.A01.A01) != null && !r1.A04(r3.A01.A01)) {
                    return false;
                }
            } else if (this.A02 != r3.A02) {
                return false;
            }
        }
        return A04().equals(obj);
    }

    public int hashCode() {
        if (!this.A03) {
            this.A02 = A04().hashCode();
            this.A03 = true;
        }
        return this.A02;
    }
}
