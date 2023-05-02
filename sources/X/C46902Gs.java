package X;

/* renamed from: X.2Gs  reason: invalid class name and case insensitive filesystem */
public class C46902Gs implements C46912Gt {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public final AnonymousClass5T1 A0J;
    public final byte[] A0K;
    public final byte[] A0L;

    public C46902Gs() {
        this.A0L = new byte[1];
        this.A0K = new byte[16];
        this.A00 = 0;
        this.A0J = null;
    }

    public C46902Gs(AnonymousClass5T1 r3) {
        this.A0L = new byte[1];
        this.A0K = new byte[16];
        this.A00 = 0;
        if (r3.AA7() == 16) {
            this.A0J = r3;
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
    }

    public static final long A00(int i2, int i3) {
        return (((long) i2) & 4294967295L) * ((long) i3);
    }

    public final void A01() {
        int i2 = this.A00;
        int i3 = i2;
        if (i2 < 16) {
            byte[] bArr = this.A0K;
            bArr[i2] = 1;
            while (true) {
                i2++;
                if (i2 >= 16) {
                    break;
                }
                bArr[i2] = 0;
            }
        }
        byte[] bArr2 = this.A0K;
        long A012 = ((long) C31461eE.A01(bArr2, 0)) & 4294967295L;
        long A013 = ((long) C31461eE.A01(bArr2, 4)) & 4294967295L;
        long A014 = ((long) C31461eE.A01(bArr2, 8)) & 4294967295L;
        long A015 = 4294967295L & ((long) C31461eE.A01(bArr2, 12));
        int i4 = (int) (((long) this.A01) + (A012 & 67108863));
        this.A01 = i4;
        int i5 = (int) (((long) this.A02) + ((((A013 << 32) | A012) >>> 26) & 67108863));
        int i6 = i5;
        this.A02 = i5;
        int i7 = (int) (((long) this.A03) + (((A013 | (A014 << 32)) >>> 20) & 67108863));
        int i8 = i7;
        this.A03 = i7;
        int i9 = (int) (((long) this.A04) + ((((A015 << 32) | A014) >>> 14) & 67108863));
        int i10 = i9;
        this.A04 = i9;
        int i11 = (int) (((long) this.A05) + (A015 >>> 8));
        this.A05 = i11;
        if (i3 == 16) {
            i11 += 16777216;
            this.A05 = i11;
        }
        int i12 = this.A0A;
        long A002 = A00(i4, i12);
        int i13 = this.A0I;
        int i14 = this.A0H;
        long A003 = A002 + A00(i6, i13) + A00(i8, i14);
        int i15 = this.A0G;
        long A004 = A003 + A00(i10, i15) + A00(i11, this.A0F);
        int i16 = this.A0B;
        long A005 = A00(i4, i16) + A00(i6, i12) + A00(i8, i13) + A00(i10, i14) + A00(i11, i15);
        int i17 = this.A0C;
        int i18 = i17;
        long A006 = A00(i4, i17) + A00(i6, i16) + A00(i8, i12) + A00(i10, i13) + A00(i11, i14);
        int i19 = this.A0D;
        int i20 = i19;
        long A007 = A00(i4, i19) + A00(i6, i18) + A00(i8, i16) + A00(i10, i12) + A00(i11, i13);
        long A008 = A00(i4, this.A0E) + A00(i6, i20) + A00(i8, i18) + A00(i10, i16) + A00(i11, i12);
        int i21 = ((int) A004) & 67108863;
        this.A01 = i21;
        long j2 = A005 + (A004 >>> 26);
        int i22 = ((int) j2) & 67108863;
        this.A02 = i22;
        long j3 = A006 + (j2 >>> 26);
        this.A03 = ((int) j3) & 67108863;
        long j4 = A007 + (j3 >>> 26);
        this.A04 = ((int) j4) & 67108863;
        long j5 = A008 + (j4 >>> 26);
        this.A05 = ((int) j5) & 67108863;
        int i23 = i21 + (((int) (j5 >>> 26)) * 5);
        this.A01 = i23;
        this.A02 = i22 + (i23 >>> 26);
        this.A01 = i23 & 67108863;
    }

    public int A8A(byte[] bArr, int i2) {
        if (i2 + 16 <= bArr.length) {
            if (this.A00 > 0) {
                A01();
            }
            int i3 = this.A02;
            int i4 = this.A01;
            int i5 = i3 + (i4 >>> 26);
            this.A02 = i5;
            int i6 = i4 & 67108863;
            this.A01 = i6;
            int i7 = this.A03 + (i5 >>> 26);
            this.A03 = i7;
            int i8 = i5 & 67108863;
            this.A02 = i8;
            int i9 = this.A04 + (i7 >>> 26);
            this.A04 = i9;
            int i10 = i7 & 67108863;
            this.A03 = i10;
            int i11 = this.A05 + (i9 >>> 26);
            this.A05 = i11;
            int i12 = i9 & 67108863;
            this.A04 = i12;
            int i13 = i6 + ((i11 >>> 26) * 5);
            this.A01 = i13;
            int i14 = i11 & 67108863;
            this.A05 = i14;
            int i15 = i8 + (i13 >>> 26);
            this.A02 = i15;
            int i16 = i13 & 67108863;
            this.A01 = i16;
            int i17 = i16 + 5;
            int i18 = (i17 >>> 26) + i15;
            int i19 = (i18 >>> 26) + i10;
            int i20 = (i19 >>> 26) + i12;
            int i21 = 67108863 & i20;
            int i22 = ((i20 >>> 26) + i14) - 67108864;
            int i23 = (i22 >>> 31) - 1;
            int i24 = i23 ^ -1;
            int i25 = (i16 & i24) | (i17 & 67108863 & i23);
            this.A01 = i25;
            int i26 = (i15 & i24) | (i18 & 67108863 & i23);
            this.A02 = i26;
            int i27 = (i10 & i24) | (i19 & 67108863 & i23);
            this.A03 = i27;
            int i28 = (i21 & i23) | (i12 & i24);
            this.A04 = i28;
            int i29 = (i14 & i24) | (i22 & i23);
            this.A05 = i29;
            long j2 = (((long) (i25 | (i26 << 26))) & 4294967295L) + (((long) this.A06) & 4294967295L);
            long j3 = (((long) ((i26 >>> 6) | (i27 << 20))) & 4294967295L) + (((long) this.A07) & 4294967295L);
            long j4 = (((long) ((i27 >>> 12) | (i28 << 14))) & 4294967295L) + (((long) this.A08) & 4294967295L);
            C31461eE.A03(bArr, (int) j2, i2);
            long j5 = j3 + (j2 >>> 32);
            C31461eE.A03(bArr, (int) j5, i2 + 4);
            long j6 = j4 + (j5 >>> 32);
            C31461eE.A03(bArr, (int) j6, i2 + 8);
            C31461eE.A03(bArr, (int) ((((long) ((i28 >>> 18) | (i29 << 8))) & 4294967295L) + (4294967295L & ((long) this.A09)) + (j6 >>> 32)), i2 + 12);
            reset();
            return 16;
        }
        throw new AnonymousClass5JD("Output buffer is too short.");
    }

    public int ADH() {
        return 16;
    }

    public void AHz(C46932Gv r8) {
        if (r8 instanceof C46922Gu) {
            byte[] bArr = ((C46922Gu) r8).A00;
            if (bArr.length == 32) {
                int A012 = C31461eE.A01(bArr, 0);
                int A013 = C31461eE.A01(bArr, 4);
                int A014 = C31461eE.A01(bArr, 8);
                int A015 = C31461eE.A01(bArr, 12);
                this.A0A = 67108863 & A012;
                int i2 = ((A012 >>> 26) | (A013 << 6)) & 67108611;
                this.A0B = i2;
                int i3 = ((A013 >>> 20) | (A014 << 12)) & 67092735;
                this.A0C = i3;
                int i4 = ((A014 >>> 14) | (A015 << 18)) & 66076671;
                this.A0D = i4;
                int i5 = (A015 >>> 8) & 1048575;
                this.A0E = i5;
                this.A0F = i2 * 5;
                this.A0G = i3 * 5;
                this.A0H = i4 * 5;
                this.A0I = i5 * 5;
                this.A06 = C31461eE.A01(bArr, 16);
                this.A07 = C31461eE.A01(bArr, 20);
                this.A08 = C31461eE.A01(bArr, 24);
                this.A09 = C31461eE.A01(bArr, 28);
                reset();
                return;
            }
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        throw new IllegalArgumentException("Poly1305 requires a key.");
    }

    public void AhH(byte b2) {
        byte[] bArr = this.A0L;
        bArr[0] = b2;
        update(bArr, 0, 1);
    }

    public void reset() {
        this.A00 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public void update(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i3 > i4) {
            int i5 = this.A00;
            if (i5 == 16) {
                A01();
                this.A00 = 0;
                i5 = 0;
            }
            int min = Math.min(i3 - i4, 16 - i5);
            System.arraycopy(bArr, i4 + i2, this.A0K, i5, min);
            i4 += min;
            this.A00 += min;
        }
    }
}
