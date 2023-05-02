package X;

/* renamed from: X.4c3  reason: invalid class name and case insensitive filesystem */
public final class C89374c3 {
    public static final C89374c3 A06 = new C89374c3(1033, 1024);
    public static final C89374c3 A07 = new C89374c3(4201, 4096);
    public static final C89374c3 A08;
    public static final C89374c3 A09;
    public static final C89374c3 A0A = new C89374c3(19, 16);
    public static final C89374c3 A0B;
    public static final C89374c3 A0C;
    public static final C89374c3 A0D = new C89374c3(285, 256);
    public final int A00;
    public final int A01;
    public final AnonymousClass4XD A02;
    public final AnonymousClass4XD A03;
    public final int[] A04;
    public final int[] A05;

    static {
        C89374c3 r3 = new C89374c3(67, 64);
        A08 = r3;
        C89374c3 r0 = new C89374c3(301, 256);
        A0B = r0;
        A09 = r0;
        A0C = r3;
    }

    public C89374c3(int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        int[] iArr = new int[i3];
        this.A04 = iArr;
        int[] iArr2 = new int[i3];
        this.A05 = iArr2;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i5] = i4;
            i4 <<= 1;
            if (i4 >= i3) {
                i4 = (i4 ^ i2) & (i3 - 1);
            }
        }
        for (int i6 = 0; i6 < i3 - 1; i6++) {
            iArr2[iArr[i6]] = i6;
        }
        this.A03 = new AnonymousClass4XD(this, new int[]{0});
        this.A02 = new AnonymousClass4XD(this, new int[]{1});
    }

    public int A00(int i2) {
        if (i2 != 0) {
            return this.A04[(this.A01 - this.A05[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    public int A01(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.A04;
        int[] iArr2 = this.A05;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.A01 - 1)];
    }

    public AnonymousClass4XD A02(int i2, int i3) {
        if (i2 < 0) {
            throw AnonymousClass3K3.A0f();
        } else if (i3 == 0) {
            return this.A03;
        } else {
            int[] iArr = new int[(i2 + 1)];
            iArr[0] = i3;
            return new AnonymousClass4XD(this, iArr);
        }
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("GF(0x");
        A0r.append(Integer.toHexString(this.A00));
        A0r.append(',');
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
