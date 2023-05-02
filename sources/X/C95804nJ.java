package X;

/* renamed from: X.4nJ  reason: invalid class name and case insensitive filesystem */
public class C95804nJ implements AnonymousClass5TP {
    public final AnonymousClass5TP A00;
    public final boolean A01;
    public final float[] A02;

    public C95804nJ(AnonymousClass5TP r1, float[] fArr, boolean z2) {
        this.A00 = r1;
        this.A02 = fArr;
        this.A01 = z2;
    }

    public AnonymousClass5TP AAY(int i2) {
        return this.A00.AAY(i2);
    }

    public int AAd() {
        return this.A00.AAd();
    }

    public int ACb() {
        return this.A00.ACb();
    }

    public Object AD4() {
        return this.A00.AD4();
    }

    public int AEB() {
        return this.A00.AEB();
    }

    public int AEC() {
        return this.A00.AEC();
    }

    public int AED() {
        return this.A00.AED();
    }

    public int AEE() {
        return this.A00.AEE();
    }

    public AnonymousClass3BJ AFR() {
        return this.A00.AFR();
    }

    public int AH7() {
        return this.A00.AH7();
    }

    public int AHD(int i2) {
        return this.A00.AHD(i2);
    }

    public int AHE(int i2) {
        return this.A00.AHE(i2);
    }

    public int getHeight() {
        int height = this.A00.getHeight();
        float[] fArr = this.A02;
        return height + Math.round(AnonymousClass3K3.A03(fArr, 0)) + Math.round(AnonymousClass3K3.A03(fArr, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getWidth() {
        /*
            r5 = this;
            X.5TP r0 = r5.A00
            int r4 = r0.getWidth()
            float[] r3 = r5.A02
            boolean r2 = r5.A01
            if (r2 != 0) goto L_0x0031
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0031
        L_0x0015:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            if (r2 == 0) goto L_0x002b
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x002b
        L_0x0025:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            return r4
        L_0x002b:
            r0 = 2
            float r1 = X.AnonymousClass3K3.A03(r3, r0)
            goto L_0x0025
        L_0x0031:
            r0 = 1
            float r1 = X.AnonymousClass3K3.A03(r3, r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95804nJ.getWidth():int");
    }
}
