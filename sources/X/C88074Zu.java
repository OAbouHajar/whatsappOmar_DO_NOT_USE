package X;

/* renamed from: X.4Zu  reason: invalid class name and case insensitive filesystem */
public class C88074Zu {
    public int[] A00;
    public int[] A01;
    public int[] A02;

    public C88074Zu() {
        this.A02 = new int[10];
        this.A01 = new int[10];
        this.A00 = new int[10];
    }

    public C88074Zu(int[] iArr, int[] iArr2, int[] iArr3) {
        this.A02 = iArr;
        this.A01 = iArr2;
        this.A00 = iArr3;
    }

    public static C88074Zu A00(int[] iArr, int[] iArr2, int[] iArr3) {
        return new C88074Zu(iArr, iArr2, iArr3);
    }

    public static void A01(int[] iArr, int[] iArr2, int[] iArr3, Object[] objArr, int i2) {
        objArr[i2] = new C88074Zu(iArr, iArr2, iArr3);
    }
}
