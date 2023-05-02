package X;

/* renamed from: X.435  reason: invalid class name */
public enum AnonymousClass435 {
    A05(0),
    A06(1),
    A03(2),
    A02(3),
    A01(4),
    A04(5);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass435(int i2) {
        this.value = i2;
    }

    public static AnonymousClass435 A00(int i2) {
        if (i2 == 0) {
            return A05;
        }
        if (i2 == 1) {
            return A06;
        }
        if (i2 == 2) {
            return A03;
        }
        if (i2 == 3) {
            return A02;
        }
        if (i2 == 4) {
            return A01;
        }
        if (i2 != 5) {
            return null;
        }
        return A04;
    }
}
