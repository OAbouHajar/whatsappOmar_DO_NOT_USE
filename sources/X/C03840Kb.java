package X;

/* renamed from: X.0Kb  reason: invalid class name and case insensitive filesystem */
public enum C03840Kb {
    A02(0),
    A04(1),
    A03(2),
    A01(3);
    
    public final int mIntValue;

    /* access modifiers changed from: public */
    C03840Kb(int i2) {
        this.mIntValue = i2;
    }

    public static C03840Kb A00(int i2) {
        if (i2 == 0) {
            return A02;
        }
        if (i2 == 1) {
            return A04;
        }
        if (i2 == 2) {
            return A03;
        }
        if (i2 == 3) {
            return A01;
        }
        throw AnonymousClass000.A0U(AnonymousClass000.A0r("Unknown enum value: "), i2);
    }
}
