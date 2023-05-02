package X;

/* renamed from: X.07f  reason: invalid class name */
public abstract class AnonymousClass07f extends C014707b {
    public int A00;
    public int A01 = 0;
    public String A02;
    public C015207h[] A03 = null;

    public AnonymousClass07f() {
    }

    public AnonymousClass07f(AnonymousClass07f r7) {
        C015207h[] r4;
        this.A02 = r7.A02;
        this.A00 = r7.A00;
        C015207h[] r5 = r7.A03;
        if (r5 == null) {
            r4 = null;
        } else {
            int length = r5.length;
            r4 = new C015207h[length];
            for (int i2 = 0; i2 < length; i2++) {
                r4[i2] = new C015207h(r5[i2]);
            }
        }
        this.A03 = r4;
    }

    public boolean A02() {
        return false;
    }

    public C015207h[] getPathData() {
        return this.A03;
    }

    public String getPathName() {
        return this.A02;
    }

    public void setPathData(C015207h[] r6) {
        C015207h[] r4;
        C015207h[] r42 = this.A03;
        if (!C015107g.A01(r42, r6)) {
            if (r6 == null) {
                r4 = null;
            } else {
                int length = r6.length;
                r4 = new C015207h[length];
                for (int i2 = 0; i2 < length; i2++) {
                    r4[i2] = new C015207h(r6[i2]);
                }
            }
            this.A03 = r4;
            return;
        }
        for (int i3 = 0; i3 < r6.length; i3++) {
            r42[i3].A00 = r6[i3].A00;
            for (int i4 = 0; i4 < r6[i3].A01.length; i4++) {
                r42[i3].A01[i4] = r6[i3].A01[i4];
            }
        }
    }
}
