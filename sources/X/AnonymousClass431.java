package X;

/* renamed from: X.431  reason: invalid class name */
public enum AnonymousClass431 {
    A01(0),
    A03(1),
    A04(2),
    A02(3);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass431(int i2) {
        this.value = i2;
    }

    public static AnonymousClass431 A00(int i2) {
        if (i2 == 0) {
            return A01;
        }
        if (i2 == 1) {
            return A03;
        }
        if (i2 == 2) {
            return A04;
        }
        if (i2 != 3) {
            return null;
        }
        return A02;
    }
}
