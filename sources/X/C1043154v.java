package X;

/* renamed from: X.54v  reason: invalid class name and case insensitive filesystem */
public final class C1043154v implements Cloneable {
    public static final C1042854s A03 = new C1042854s();
    public int A00;
    public int[] A01;
    public C1042854s[] A02;

    public C1043154v() {
        this(10);
    }

    public C1043154v(int i2) {
        int i3 = i2 << 2;
        int i4 = 4;
        while (true) {
            int i5 = (1 << i4) - 12;
            if (i3 > i5) {
                i4++;
                if (i4 >= 32) {
                    break;
                }
            } else {
                i3 = i5;
                break;
            }
        }
        int i6 = i3 / 4;
        this.A01 = new int[i6];
        this.A02 = new C1042854s[i6];
        this.A00 = 0;
    }

    public final /* synthetic */ Object clone() {
        int i2 = this.A00;
        C1043154v r4 = new C1043154v(i2);
        System.arraycopy(this.A01, 0, r4.A01, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            C1042854s[] r2 = this.A02;
            if (r2[i3] != null) {
                r4.A02[i3] = r2[i3].clone();
            }
        }
        r4.A00 = i2;
        return r4;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1043154v) {
                C1043154v r9 = (C1043154v) obj;
                int i2 = this.A00;
                if (i2 == r9.A00) {
                    int[] iArr = this.A01;
                    int[] iArr2 = r9.A01;
                    int i3 = 0;
                    while (true) {
                        if (i3 < i2) {
                            if (iArr[i3] != iArr2[i3]) {
                                break;
                            }
                            i3++;
                        } else {
                            C1042854s[] r4 = this.A02;
                            C1042854s[] r3 = r9.A02;
                            int i4 = 0;
                            while (i4 < i2) {
                                if (r4[i4].equals(r3[i4])) {
                                    i4++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 17;
        for (int i3 = 0; i3 < this.A00; i3++) {
            i2 = AnonymousClass3K2.A06(this.A02[i3], ((i2 * 31) + this.A01[i3]) * 31);
        }
        return i2;
    }
}
