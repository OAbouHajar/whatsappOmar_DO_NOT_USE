package X;

/* renamed from: X.0Pp  reason: invalid class name and case insensitive filesystem */
public class C05180Pp {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    public boolean A00() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.A00;
        if ((i6 & 7) != 0) {
            int i7 = this.A02;
            int i8 = this.A04;
            if (i7 > i8) {
                i5 = 1;
            } else {
                i5 = 4;
                if (i7 == i8) {
                    i5 = 2;
                }
            }
            if (((i5 << 0) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 112) != 0) {
            int i9 = this.A02;
            int i10 = this.A03;
            if (i9 > i10) {
                i4 = 1;
            } else {
                i4 = 4;
                if (i9 == i10) {
                    i4 = 2;
                }
            }
            if (((i4 << 4) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 1792) != 0) {
            int i11 = this.A01;
            int i12 = this.A04;
            if (i11 > i12) {
                i3 = 1;
            } else {
                i3 = 4;
                if (i11 == i12) {
                    i3 = 2;
                }
            }
            if (((i3 << 8) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 28672) == 0) {
            return true;
        }
        int i13 = this.A01;
        int i14 = this.A03;
        if (i13 > i14) {
            i2 = 1;
        } else {
            i2 = 4;
            if (i13 == i14) {
                i2 = 2;
            }
        }
        return (i6 & (i2 << 12)) != 0;
    }
}
