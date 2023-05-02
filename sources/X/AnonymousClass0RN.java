package X;

/* renamed from: X.0RN  reason: invalid class name */
public class AnonymousClass0RN {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    public AnonymousClass0RN(Object obj, int i2, int i3, int i4) {
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A03 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1 == r6.A01) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r3 = 1
            if (r5 == r6) goto L_0x002e
            r4 = 0
            if (r6 == 0) goto L_0x004a
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r0 = r6.getClass()
            if (r1 != r0) goto L_0x004a
            X.0RN r6 = (X.AnonymousClass0RN) r6
            int r1 = r5.A00
            int r0 = r6.A00
            if (r1 != r0) goto L_0x004a
            r0 = 8
            if (r1 != r0) goto L_0x002f
            int r2 = r5.A01
            int r1 = r5.A02
            int r0 = X.AnonymousClass000.A09(r2, r1)
            if (r0 != r3) goto L_0x002f
            int r0 = r6.A02
            if (r2 != r0) goto L_0x002f
            int r0 = r6.A01
            if (r1 != r0) goto L_0x002f
        L_0x002e:
            return r3
        L_0x002f:
            int r1 = r5.A01
            int r0 = r6.A01
            if (r1 != r0) goto L_0x004a
            int r1 = r5.A02
            int r0 = r6.A02
            if (r1 != r0) goto L_0x004a
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            if (r1 == 0) goto L_0x0048
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002e
            return r4
        L_0x0048:
            if (r0 == 0) goto L_0x002e
        L_0x004a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RN.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1G(this, A0o);
        A0o.append("[");
        int i2 = this.A00;
        A0o.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        A0o.append(",s:");
        A0o.append(this.A02);
        A0o.append("c:");
        A0o.append(this.A01);
        A0o.append(",p:");
        A0o.append(this.A03);
        return AnonymousClass000.A0h("]", A0o);
    }
}
