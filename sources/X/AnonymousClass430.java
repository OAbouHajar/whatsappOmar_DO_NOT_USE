package X;

/* renamed from: X.430  reason: invalid class name */
public enum AnonymousClass430 {
    A01(0),
    A02(1),
    A03(2);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass430(int i2) {
        this.value = i2;
    }

    public static AnonymousClass430 A00(int i2) {
        if (i2 == 0) {
            return A01;
        }
        if (i2 == 1) {
            return A02;
        }
        if (i2 != 2) {
            return null;
        }
        return A03;
    }
}
