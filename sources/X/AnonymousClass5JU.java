package X;

/* renamed from: X.5JU  reason: invalid class name */
public class AnonymousClass5JU extends AnonymousClass5AC implements AnonymousClass5NN {
    public static final int[] A0A = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int[] A09 = new int[64];

    public AnonymousClass5JU() {
        reset();
    }

    public AnonymousClass5JU(AnonymousClass5JU r2) {
        super(r2);
        A0M(r2);
    }

    public static int A0D(int i2, int i3, int i4, int i5) {
        return i5 + (((i2 << 10) | (i2 >>> 22)) ^ (((i2 >>> 2) | (i2 << 30)) ^ ((i2 >>> 13) | (i2 << 19)))) + (((i2 ^ i3) & i4) | (i2 & i3));
    }

    public static int A0E(int[] iArr, int i2, int i3, int i4, int i5) {
        return (((i2 << 7) | (i2 >>> 25)) ^ (((i2 >>> 6) | (i2 << 26)) ^ ((i2 >>> 11) | (i2 << 21)))) + (((i2 ^ -1) & i4) ^ (i3 & i2)) + iArr[i5];
    }

    public void A0L() {
        int[] iArr;
        int i2 = 16;
        do {
            iArr = this.A09;
            i2 = AnonymousClass5AC.A0C(iArr, i2);
        } while (i2 <= 63);
        int i3 = this.A00;
        int i4 = i3;
        int i5 = this.A01;
        int i6 = i5;
        int i7 = this.A02;
        int i8 = i7;
        int i9 = this.A03;
        int i10 = i9;
        int i11 = this.A04;
        int i12 = i11;
        int i13 = this.A05;
        int i14 = i13;
        int i15 = this.A06;
        int i16 = i15;
        int i17 = this.A07;
        int i18 = i17;
        int i19 = 0;
        int i20 = 0;
        do {
            int i21 = (((i11 << 7) | (i11 >>> 25)) ^ (((i11 >>> 6) | (i11 << 26)) ^ ((i11 >>> 11) | (i11 << 21)))) + (((i11 ^ -1) & i15) ^ (i13 & i11));
            int[] iArr2 = A0A;
            int A0E = AnonymousClass3K4.A0E(iArr, i20, i21 + iArr2[i20], i17);
            int i22 = i9 + A0E;
            int A0D = A0D(i3, i5, i7, A0E);
            int i23 = i20 + 1;
            int A0E2 = AnonymousClass3K4.A0E(iArr, i23, A0E(iArr2, i22, i11, i13, i23), i15);
            int i24 = i7 + A0E2;
            int A0D2 = A0D(A0D, i3, i5, A0E2);
            int i25 = i23 + 1;
            int A0E3 = AnonymousClass3K4.A0E(iArr, i25, A0E(iArr2, i24, i22, i11, i25), i13);
            int i26 = i5 + A0E3;
            int A0D3 = A0D(A0D2, A0D, i3, A0E3);
            int i27 = i25 + 1;
            int A0E4 = AnonymousClass3K4.A0E(iArr, i27, A0E(iArr2, i26, i24, i22, i27), i11);
            int i28 = i3 + A0E4;
            int A0D4 = A0D(A0D3, A0D2, A0D, A0E4);
            int i29 = i27 + 1;
            int A0E5 = AnonymousClass3K4.A0E(iArr, i29, A0E(iArr2, i28, i26, i24, i29), i22);
            i17 = A0D + A0E5;
            i9 = A0D(A0D4, A0D3, A0D2, A0E5);
            int i30 = i29 + 1;
            int A0E6 = AnonymousClass3K4.A0E(iArr, i30, A0E(iArr2, i17, i28, i26, i30), i24);
            i15 = A0D2 + A0E6;
            i7 = A0D(i9, A0D4, A0D3, A0E6);
            int i31 = i30 + 1;
            int A0E7 = AnonymousClass3K4.A0E(iArr, i31, A0E(iArr2, i15, i17, i28, i31), i26);
            i13 = A0D3 + A0E7;
            i5 = A0D(i7, i9, A0D4, A0E7);
            int i32 = i31 + 1;
            int A0E8 = AnonymousClass3K4.A0E(iArr, i32, A0E(iArr2, i13, i15, i17, i32), i28);
            i11 = A0D4 + A0E8;
            i3 = A0D(i5, i7, i9, A0E8);
            i20 = i32 + 1;
            i19++;
        } while (i19 < 8);
        this.A00 = i4 + i3;
        this.A01 = i6 + i5;
        this.A02 = i8 + i7;
        this.A03 = i10 + i9;
        this.A04 = i12 + i11;
        this.A05 = i14 + i13;
        this.A06 = i16 + i15;
        this.A07 = i18 + i17;
        this.A08 = 0;
        int i33 = 0;
        do {
            iArr[i33] = 0;
            i33++;
        } while (i33 < 16);
    }

    public final void A0M(AnonymousClass5JU r5) {
        super.A0E(r5);
        this.A00 = r5.A00;
        this.A01 = r5.A01;
        this.A02 = r5.A02;
        this.A03 = r5.A03;
        this.A04 = r5.A04;
        this.A05 = r5.A05;
        this.A06 = r5.A06;
        this.A07 = r5.A07;
        int[] iArr = r5.A09;
        System.arraycopy(iArr, 0, this.A09, 0, iArr.length);
        this.A08 = r5.A08;
    }

    public AnonymousClass5SH A6m() {
        return new AnonymousClass5JU(this);
    }

    public int A8A(byte[] bArr, int i2) {
        A0D();
        C31461eE.A02(bArr, this.A00, i2);
        C31461eE.A02(bArr, this.A01, i2 + 4);
        C31461eE.A02(bArr, this.A02, i2 + 8);
        C31461eE.A02(bArr, this.A03, i2 + 12);
        C31461eE.A02(bArr, this.A04, i2 + 16);
        C31461eE.A02(bArr, this.A05, i2 + 20);
        C31461eE.A02(bArr, this.A06, i2 + 24);
        C31461eE.A02(bArr, this.A07, i2 + 28);
        reset();
        return 32;
    }

    public String A9q() {
        return "SHA-256";
    }

    public int ABn() {
        return 32;
    }

    public void AcP(AnonymousClass5SH r1) {
        A0M((AnonymousClass5JU) r1);
    }

    public void reset() {
        super.reset();
        this.A00 = 1779033703;
        this.A01 = -1150833019;
        this.A02 = 1013904242;
        this.A03 = -1521486534;
        this.A04 = 1359893119;
        this.A05 = -1694144372;
        this.A06 = 528734635;
        this.A07 = 1541459225;
        this.A08 = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.A09;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
