package X;

/* renamed from: X.433  reason: invalid class name */
public enum AnonymousClass433 {
    A04(0),
    A02(1),
    A01(2),
    A05(3),
    A03(4);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass433(int i2) {
        this.value = i2;
    }

    public static AnonymousClass433 A00(int i2) {
        if (i2 == 0) {
            return A04;
        }
        if (i2 == 1) {
            return A02;
        }
        if (i2 == 2) {
            return A01;
        }
        if (i2 == 3) {
            return A05;
        }
        if (i2 != 4) {
            return null;
        }
        return A03;
    }
}
