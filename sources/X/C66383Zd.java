package X;

/* renamed from: X.3Zd  reason: invalid class name and case insensitive filesystem */
public class C66383Zd extends C90124dX {
    public C1043154v A00;

    public static int A00(int i2, int i3, int i4) {
        return i4 + i3 + C90704ef.A01(i2) + i2;
    }

    public int A03() {
        if (this.A00 != null) {
            int i2 = 0;
            while (true) {
                C1043154v r1 = this.A00;
                if (i2 >= r1.A00) {
                    break;
                }
                r1.A02[i2].A00();
                i2++;
            }
        }
        return 0;
    }

    public void A05(C90704ef r4) {
        if (this.A00 != null) {
            int i2 = 0;
            while (true) {
                C1043154v r1 = this.A00;
                if (i2 < r1.A00) {
                    r1.A02[i2].A01();
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public C66383Zd A06() {
        C66383Zd r1 = (C66383Zd) super.A04();
        C1043154v r0 = this.A00;
        if (r0 != null) {
            r1.A00 = (C1043154v) r0.clone();
        }
        return r1;
    }
}
