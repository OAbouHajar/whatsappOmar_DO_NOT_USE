package X;

/* renamed from: X.42z  reason: invalid class name and case insensitive filesystem */
public enum C802142z {
    A03(0),
    A02(1),
    A01(2);
    
    public final int value;

    /* access modifiers changed from: public */
    C802142z(int i2) {
        this.value = i2;
    }

    public static C802142z A00(int i2) {
        if (i2 == 0) {
            return A03;
        }
        if (i2 == 1) {
            return A02;
        }
        if (i2 != 2) {
            return null;
        }
        return A01;
    }
}
