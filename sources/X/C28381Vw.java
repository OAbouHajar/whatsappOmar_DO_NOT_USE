package X;

/* renamed from: X.1Vw  reason: invalid class name and case insensitive filesystem */
public class C28381Vw {
    public final C15830rv A00;
    public final String A01;
    public final boolean A02;

    public C28381Vw(C15830rv r1, String str, boolean z2) {
        this.A02 = z2;
        this.A01 = str;
        this.A00 = r1;
    }

    public C28381Vw(C28381Vw r2) {
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0038
            r2 = 0
            if (r5 == 0) goto L_0x0020
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0020
            X.1Vw r5 = (X.C28381Vw) r5
            boolean r1 = r4.A02
            boolean r0 = r5.A02
            if (r1 != r0) goto L_0x0020
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 != 0) goto L_0x0021
            if (r0 == 0) goto L_0x0028
        L_0x0020:
            return r2
        L_0x0021:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0028
            return r2
        L_0x0028:
            X.0rv r1 = r4.A00
            X.0rv r0 = r5.A00
            if (r1 != 0) goto L_0x0031
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0031:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0038
            return r2
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28381Vw.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2 = 1237;
        if (this.A02) {
            i2 = 1231;
        }
        int i3 = (i2 + 31) * 31;
        String str = this.A01;
        int i4 = 0;
        int hashCode = (i3 + (str == null ? 0 : str.hashCode())) * 31;
        C15830rv r0 = this.A00;
        if (r0 != null) {
            i4 = r0.hashCode();
        }
        return hashCode + i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Key[id=");
        sb.append(this.A01);
        sb.append(", from_me=");
        sb.append(this.A02);
        sb.append(", remote_jid=");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }
}
