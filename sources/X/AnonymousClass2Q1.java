package X;

/* renamed from: X.2Q1  reason: invalid class name */
public class AnonymousClass2Q1 {
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    public AnonymousClass2Q1(String str, String str2, String str3, int i2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i2;
        this.A03 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0047
            r2 = 0
            if (r5 == 0) goto L_0x001a
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001a
            X.2Q1 r5 = (X.AnonymousClass2Q1) r5
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 != 0) goto L_0x001b
            if (r0 == 0) goto L_0x0022
        L_0x001a:
            return r2
        L_0x001b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
            return r2
        L_0x0022:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 != 0) goto L_0x002b
            if (r0 == 0) goto L_0x0032
            return r2
        L_0x002b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0032
            return r2
        L_0x0032:
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x001a
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            if (r1 != 0) goto L_0x0042
            if (r0 == 0) goto L_0x0047
            r3 = 0
            return r3
        L_0x0042:
            boolean r0 = r1.equals(r0)
            return r0
        L_0x0047:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Q1.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.A01;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.A02;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A00) * 31;
        String str3 = this.A03;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }
}
