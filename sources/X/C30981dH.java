package X;

/* renamed from: X.1dH  reason: invalid class name and case insensitive filesystem */
public class C30981dH {
    public final C28861Yb A00;
    public final String A01;

    public C30981dH(C28861Yb r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String[] A00() {
        C28861Yb r2 = this.A00;
        return new String[]{this.A01, r2.A02, String.valueOf(r2.A01), String.valueOf(r2.A00)};
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C30981dH)) {
            return false;
        }
        C30981dH r4 = (C30981dH) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        if (r0 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.String r4 = r7.A01
            java.lang.String r5 = "@"
            boolean r0 = r4.contains(r5)
            r3 = 4
            if (r0 == 0) goto L_0x003c
            int r1 = r4.indexOf(r5)
            r0 = 0
            java.lang.String r6 = r4.substring(r0, r1)
            int r0 = r1 + 1
            java.lang.String r2 = r4.substring(r0)
            java.lang.String r0 = "g.us"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0057
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 15
            java.lang.String r0 = X.AnonymousClass1ZW.A03(r0, r6)
        L_0x002d:
            r1.append(r0)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            if (r0 != 0) goto L_0x0040
        L_0x003c:
            java.lang.String r0 = X.AnonymousClass1ZW.A03(r3, r4)
        L_0x0040:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "::"
            r1.append(r0)
            X.1Yb r0 = r7.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0057:
            java.lang.String r0 = "broadcast"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003c
            X.1kq r0 = X.C34771kq.A00
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0081
            X.1l7 r0 = X.C34941l7.A00
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0081
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.AnonymousClass1ZW.A03(r3, r6)
            goto L_0x002d
        L_0x0081:
            r0 = r4
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30981dH.toString():java.lang.String");
    }
}
