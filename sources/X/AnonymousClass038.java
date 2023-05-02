package X;

/* renamed from: X.038  reason: invalid class name */
public class AnonymousClass038 extends AnonymousClass039 {
    public final int A00;
    public final int A01;

    public AnonymousClass038() {
        this(0, 0);
    }

    public AnonymousClass038(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (java.lang.Math.min(r4.width(), r4.height()) >= r2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r4.width() >= r1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.view.WindowMetrics r7) {
        /*
            r6 = this;
            r2 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r0 = 30
            if (r1 > r0) goto L_0x0009
            return r2
        L_0x0009:
            android.graphics.Rect r4 = X.AnonymousClass0MC.A00(r7)
            int r1 = r6.A01
            if (r1 == 0) goto L_0x0018
            int r0 = r4.width()
            r3 = 0
            if (r0 < r1) goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            int r2 = r6.A00
            if (r2 == 0) goto L_0x002c
            int r1 = r4.width()
            int r0 = r4.height()
            int r1 = java.lang.Math.min(r1, r0)
            r0 = 0
            if (r1 < r2) goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0032
            if (r0 == 0) goto L_0x0032
            r5 = 1
        L_0x0032:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass038.A00(android.view.WindowMetrics):boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass038) {
                AnonymousClass038 r5 = (AnonymousClass038) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A00) * 31) + Float.floatToIntBits(0.4f)) * 31) + 3;
    }
}
