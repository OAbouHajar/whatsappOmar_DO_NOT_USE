package X;

/* renamed from: X.436  reason: invalid class name */
public enum AnonymousClass436 {
    A02(0),
    A03(1),
    A01(2),
    A06(3),
    A05(4),
    A04(5);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass436(int i2) {
        this.value = i2;
    }

    public static AnonymousClass436 A00(int i2) {
        if (i2 == 0) {
            return A02;
        }
        if (i2 == 1) {
            return A03;
        }
        if (i2 == 2) {
            return A01;
        }
        if (i2 == 3) {
            return A06;
        }
        if (i2 == 4) {
            return A05;
        }
        if (i2 != 5) {
            return null;
        }
        return A04;
    }
}
