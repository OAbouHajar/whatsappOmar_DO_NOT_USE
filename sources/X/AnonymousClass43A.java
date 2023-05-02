package X;

/* renamed from: X.43A  reason: invalid class name */
public enum AnonymousClass43A {
    A0C(0),
    A04(3),
    A05(4),
    A06(5),
    A03(6),
    A02(7),
    A09(8),
    A07(9),
    A01(10),
    A0D(11),
    A08(14),
    A0A(16),
    A0B(17);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass43A(int i2) {
        this.value = i2;
    }

    public static AnonymousClass43A A00(int i2) {
        if (i2 == 0) {
            return A0C;
        }
        if (i2 == 14) {
            return A08;
        }
        if (i2 == 16) {
            return A0A;
        }
        if (i2 == 17) {
            return A0B;
        }
        switch (i2) {
            case 3:
                return A04;
            case 4:
                return A05;
            case 5:
                return A06;
            case 6:
                return A03;
            case 7:
                return A02;
            case 8:
                return A09;
            case 9:
                return A07;
            case 10:
                return A01;
            case 11:
                return A0D;
            default:
                return null;
        }
    }
}
