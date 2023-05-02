package X;

/* renamed from: X.1bR  reason: invalid class name and case insensitive filesystem */
public enum C29921bR {
    A02(0),
    A03(1),
    A01(2),
    A06(3),
    A05(4),
    A04(5);
    
    public final int value;

    /* access modifiers changed from: public */
    C29921bR(int i2) {
        this.value = i2;
    }

    public static C29921bR A00(int i2) {
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
