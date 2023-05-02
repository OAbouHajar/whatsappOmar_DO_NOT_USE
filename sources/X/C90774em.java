package X;

/* renamed from: X.4em  reason: invalid class name and case insensitive filesystem */
public class C90774em {
    public final int A00;
    public final C38131qI A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C90774em(C38131qI r3, boolean z2) {
        this.A02 = null;
        this.A05 = false;
        this.A04 = z2;
        this.A00 = 1;
        this.A03 = true;
        this.A01 = r3;
    }

    public C90774em(Object obj, int i2, boolean z2, boolean z3, boolean z4) {
        this.A02 = obj;
        this.A05 = z2;
        this.A04 = z3;
        this.A00 = i2;
        this.A03 = z4;
        this.A01 = null;
    }

    public static C90774em A00(Object obj) {
        return new C90774em(obj, -1, false, false, true);
    }

    public static C90774em A01(Object obj) {
        return new C90774em(obj, -1, false, false, false);
    }

    public static C90774em A02(Object obj) {
        return new C90774em(obj, -1, true, true, false);
    }

    public static C90774em A03(Object obj, int i2) {
        return new C90774em(obj, i2, false, false, i2 < 400 || !(i2 < 500 || i2 == 505 || i2 == 507));
    }

    public static C90774em A04(Object obj, int i2, boolean z2) {
        return new C90774em(obj, i2, false, z2, i2 < 400 || !(i2 < 500 || i2 == 505 || i2 == 507));
    }
}
