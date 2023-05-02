package X;

/* renamed from: X.5JR  reason: invalid class name */
public class AnonymousClass5JR extends AnonymousClass5AC implements AnonymousClass5NN {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int[] A06 = new int[80];

    public AnonymousClass5JR() {
        reset();
    }

    public AnonymousClass5JR(AnonymousClass5JR r2) {
        super(r2);
        A0M(r2);
    }

    public static int A0D(int i2) {
        return (i2 >>> 2) | (i2 << 30);
    }

    public static int A0E(int i2, int i3, int i4, int i5) {
        return ((i2 << 5) | (i2 >>> 27)) + ((i3 ^ i4) ^ i5);
    }

    public static int A0F(int i2, int i3, int i4, int i5) {
        return ((i2 << 5) | (i2 >>> 27)) + ((i3 & i5) | (i3 & i4) | (i4 & i5));
    }

    public static int A0G(int[] iArr, int i2, int i3, int i4, int i5) {
        return i5 + i3 + iArr[i2] + i4;
    }

    public void A0L() {
        int[] iArr;
        int i2 = 16;
        do {
            iArr = this.A06;
            int i3 = ((iArr[i2 - 3] ^ iArr[i2 - 8]) ^ iArr[i2 - 14]) ^ iArr[i2 - 16];
            iArr[i2] = (i3 >>> 31) | (i3 << 1);
            i2++;
        } while (i2 < 80);
        int i4 = this.A00;
        int i5 = i4;
        int i6 = this.A01;
        int i7 = i6;
        int i8 = this.A02;
        int i9 = i8;
        int i10 = this.A03;
        int i11 = i10;
        int i12 = this.A04;
        int i13 = i12;
        int i14 = 0;
        int i15 = 0;
        do {
            int i16 = i15 + 1;
            int A052 = i12 + AnonymousClass5AC.A05(i8, i6, i10, (i4 << 5) | (i4 >>> 27)) + iArr[i15] + 1518500249;
            int A0D = A0D(i6);
            int i17 = i16 + 1;
            int A0G = A0G(iArr, i16, AnonymousClass5AC.A05(A0D, i4, i8, (A052 << 5) | (A052 >>> 27)), 1518500249, i10);
            int A0D2 = A0D(i4);
            int i18 = i17 + 1;
            int A0G2 = A0G(iArr, i17, AnonymousClass5AC.A05(A0D2, A052, A0D, (A0G << 5) | (A0G >>> 27)), 1518500249, i8);
            i12 = A0D(A052);
            int i19 = i18 + 1;
            i6 = A0G(iArr, i18, AnonymousClass5AC.A05(i12, A0G, A0D2, (A0G2 << 5) | (A0G2 >>> 27)), 1518500249, A0D);
            i10 = A0D(A0G);
            i15 = i19 + 1;
            i4 = A0G(iArr, i19, AnonymousClass5AC.A05(i10, A0G2, i12, (i6 << 5) | (i6 >>> 27)), 1518500249, A0D2);
            i8 = A0D(A0G2);
            i14++;
        } while (i14 < 4);
        int i20 = 0;
        do {
            int i21 = i15 + 1;
            int A0E = i12 + A0E(i4, i6, i8, i10) + iArr[i15] + 1859775393;
            int A0D3 = A0D(i6);
            int i22 = i21 + 1;
            int A0G3 = A0G(iArr, i21, A0E(A0E, i4, A0D3, i8), 1859775393, i10);
            int A0D4 = A0D(i4);
            int i23 = i22 + 1;
            int A0G4 = A0G(iArr, i22, A0E(A0G3, A0E, A0D4, A0D3), 1859775393, i8);
            i12 = A0D(A0E);
            int i24 = i23 + 1;
            i6 = A0G(iArr, i23, A0E(A0G4, A0G3, i12, A0D4), 1859775393, A0D3);
            i10 = A0D(A0G3);
            i15 = i24 + 1;
            i4 = A0G(iArr, i24, A0E(i6, A0G4, i10, i12), 1859775393, A0D4);
            i8 = A0D(A0G4);
            i20++;
        } while (i20 < 4);
        int i25 = 0;
        do {
            int i26 = i15 + 1;
            int A0F = i12 + ((A0F(i4, i6, i8, i10) + iArr[i15]) - 1894007588);
            int A0D5 = A0D(i6);
            int i27 = i26 + 1;
            int A0G5 = A0G(iArr, i26, A0F(A0F, i4, A0D5, i8), -1894007588, i10);
            int A0D6 = A0D(i4);
            int i28 = i27 + 1;
            int A0G6 = A0G(iArr, i27, A0F(A0G5, A0F, A0D6, A0D5), -1894007588, i8);
            i12 = A0D(A0F);
            int i29 = i28 + 1;
            i6 = A0G(iArr, i28, A0F(A0G6, A0G5, i12, A0D6), -1894007588, A0D5);
            i10 = A0D(A0G5);
            i15 = i29 + 1;
            i4 = A0G(iArr, i29, A0F(i6, A0G6, i10, i12), -1894007588, A0D6);
            i8 = A0D(A0G6);
            i25++;
        } while (i25 < 4);
        int i30 = 0;
        do {
            int i31 = i15 + 1;
            int A0E2 = i12 + ((A0E(i4, i6, i8, i10) + iArr[i15]) - 899497514);
            int A0D7 = A0D(i6);
            int i32 = i31 + 1;
            int A0G7 = A0G(iArr, i31, A0E(A0E2, i4, A0D7, i8), -899497514, i10);
            int A0D8 = A0D(i4);
            int i33 = i32 + 1;
            int A0G8 = A0G(iArr, i32, A0E(A0G7, A0E2, A0D8, A0D7), -899497514, i8);
            i12 = A0D(A0E2);
            int i34 = i33 + 1;
            i6 = A0G(iArr, i33, A0E(A0G8, A0G7, i12, A0D8), -899497514, A0D7);
            i10 = A0D(A0G7);
            i15 = i34 + 1;
            i4 = A0G(iArr, i34, A0E(i6, A0G8, i10, i12), -899497514, A0D8);
            i8 = A0D(A0G8);
            i30++;
        } while (i30 <= 3);
        this.A00 = i5 + i4;
        this.A01 = i7 + i6;
        this.A02 = i9 + i8;
        this.A03 = i11 + i10;
        this.A04 = i13 + i12;
        this.A05 = 0;
        int i35 = 0;
        do {
            iArr[i35] = 0;
            i35++;
        } while (i35 < 16);
    }

    public final void A0M(AnonymousClass5JR r5) {
        this.A00 = r5.A00;
        this.A01 = r5.A01;
        this.A02 = r5.A02;
        this.A03 = r5.A03;
        this.A04 = r5.A04;
        int[] iArr = r5.A06;
        System.arraycopy(iArr, 0, this.A06, 0, iArr.length);
        this.A05 = r5.A05;
    }

    public AnonymousClass5SH A6m() {
        return new AnonymousClass5JR(this);
    }

    public int A8A(byte[] bArr, int i2) {
        A0D();
        C31461eE.A02(bArr, this.A00, i2);
        C31461eE.A02(bArr, this.A01, i2 + 4);
        C31461eE.A02(bArr, this.A02, i2 + 8);
        C31461eE.A02(bArr, this.A03, i2 + 12);
        C31461eE.A02(bArr, this.A04, i2 + 16);
        reset();
        return 20;
    }

    public String A9q() {
        return "SHA-1";
    }

    public int ABn() {
        return 20;
    }

    public void AcP(AnonymousClass5SH r1) {
        AnonymousClass5JR r12 = (AnonymousClass5JR) r1;
        super.A0E(r12);
        A0M(r12);
    }

    public void reset() {
        super.reset();
        this.A00 = 1732584193;
        this.A01 = -271733879;
        this.A02 = -1732584194;
        this.A03 = 271733878;
        this.A04 = -1009589776;
        this.A05 = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.A06;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
