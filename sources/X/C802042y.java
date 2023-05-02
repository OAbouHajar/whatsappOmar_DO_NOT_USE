package X;

/* renamed from: X.42y  reason: invalid class name and case insensitive filesystem */
public enum C802042y {
    A03(0),
    A01(1),
    A02(2);
    
    public final int value;

    /* access modifiers changed from: public */
    C802042y(int i2) {
        this.value = i2;
    }

    public static C802042y A00(int i2) {
        if (i2 == 0) {
            return A03;
        }
        if (i2 == 1) {
            return A01;
        }
        if (i2 != 2) {
            return null;
        }
        return A02;
    }
}
