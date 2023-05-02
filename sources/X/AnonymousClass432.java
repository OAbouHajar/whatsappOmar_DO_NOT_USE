package X;

/* renamed from: X.432  reason: invalid class name */
public enum AnonymousClass432 {
    A03(0),
    A01(1),
    A02(2),
    A04(3);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass432(int i2) {
        this.value = i2;
    }

    public static AnonymousClass432 A00(int i2) {
        if (i2 == 0) {
            return A03;
        }
        if (i2 == 1) {
            return A01;
        }
        if (i2 == 2) {
            return A02;
        }
        if (i2 != 3) {
            return null;
        }
        return A04;
    }
}
