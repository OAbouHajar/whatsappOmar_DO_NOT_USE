package X;

/* renamed from: X.1pH  reason: invalid class name and case insensitive filesystem */
public enum C37511pH {
    A02(0),
    A04(1),
    A03(2),
    A01(3);
    
    public final int value;

    /* access modifiers changed from: public */
    C37511pH(int i2) {
        this.value = i2;
    }

    public static C37511pH A00(int i2) {
        if (i2 == 0) {
            return A02;
        }
        if (i2 == 1) {
            return A04;
        }
        if (i2 == 2) {
            return A03;
        }
        if (i2 != 3) {
            return null;
        }
        return A01;
    }
}
