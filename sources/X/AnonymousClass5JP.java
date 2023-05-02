package X;

/* renamed from: X.5JP  reason: invalid class name */
public class AnonymousClass5JP extends AnonymousClass5AC {
    public static final int[] A04;
    public int A00;
    public int[] A01;
    public int[] A02;
    public int[] A03;

    static {
        int i2;
        int[] iArr = new int[64];
        A04 = iArr;
        int i3 = 0;
        do {
            iArr[i3] = (2043430169 >>> (32 - i3)) | (2043430169 << i3);
            i3++;
            i2 = 16;
        } while (i3 < 16);
        do {
            int i4 = i2 % 32;
            iArr[i2] = (2055708042 >>> (32 - i4)) | (2055708042 << i4);
            i2++;
        } while (i2 < 64);
    }

    public AnonymousClass5JP() {
        this.A01 = new int[8];
        this.A03 = new int[16];
        this.A02 = new int[68];
        reset();
    }

    public AnonymousClass5JP(AnonymousClass5JP r5) {
        super(r5);
        int[] iArr = new int[8];
        this.A01 = iArr;
        this.A03 = new int[16];
        this.A02 = new int[68];
        System.arraycopy(r5.A01, 0, iArr, 0, 8);
        int[] iArr2 = r5.A03;
        int[] iArr3 = this.A03;
        System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        this.A00 = r5.A00;
    }

    public AnonymousClass5SH A6m() {
        return new AnonymousClass5JP(this);
    }

    public int A8A(byte[] bArr, int i2) {
        A0D();
        int[] iArr = this.A01;
        for (int A022 : iArr) {
            C31461eE.A02(bArr, A022, i2);
            i2 += 4;
        }
        reset();
        return 32;
    }

    public String A9q() {
        return "SM3";
    }

    public int ABn() {
        return 32;
    }

    public void AcP(AnonymousClass5SH r5) {
        AnonymousClass5JP r52 = (AnonymousClass5JP) r5;
        super.A0E(r52);
        int[] iArr = r52.A01;
        int[] iArr2 = this.A01;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = r52.A03;
        int[] iArr4 = this.A03;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.A00 = r52.A00;
    }

    public void reset() {
        super.reset();
        int[] iArr = this.A01;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.A00 = 0;
    }
}
