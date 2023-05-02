package X;

/* renamed from: X.0eD  reason: invalid class name and case insensitive filesystem */
public class C08730eD implements C13320lq {
    public int A00 = 0;
    public int A01 = 0;
    public byte[] A02 = new byte[8];
    public float[] A03 = new float[16];

    public static int A00(C08730eD r2, float[] fArr, float f2, float f3, float f4) {
        int i2 = r2.A01;
        int i3 = i2 + 1;
        r2.A01 = i3;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        r2.A01 = i4;
        fArr[i3] = f3;
        int i5 = i4 + 1;
        r2.A01 = i5;
        fArr[i4] = f4;
        return i5;
    }

    public final void A01(byte b2) {
        int i2 = this.A00;
        byte[] bArr = this.A02;
        int length = bArr.length;
        if (i2 == length) {
            byte[] bArr2 = new byte[(length << 1)];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            this.A02 = bArr2;
            bArr = bArr2;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        bArr[i3] = b2;
    }

    public final void A02(int i2) {
        float[] fArr = this.A03;
        int length = fArr.length;
        if (length < this.A01 + i2) {
            float[] fArr2 = new float[(length << 1)];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            this.A03 = fArr2;
        }
    }

    public void A03(C13320lq r16) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.A00; i3++) {
            byte b2 = this.A02[i3];
            C13320lq r7 = r16;
            if (b2 == 0) {
                float[] fArr = this.A03;
                int i4 = i2 + 1;
                float f2 = fArr[i2];
                i2 = i4 + 1;
                r7.ALb(f2, fArr[i4]);
            } else if (b2 == 1) {
                float[] fArr2 = this.A03;
                int i5 = i2 + 1;
                float f3 = fArr2[i2];
                i2 = i5 + 1;
                r7.AK9(f3, fArr2[i5]);
            } else if (b2 == 2) {
                float[] fArr3 = this.A03;
                int i6 = i2 + 1;
                float f4 = fArr3[i2];
                int i7 = i6 + 1;
                float f5 = fArr3[i6];
                int i8 = i7 + 1;
                float f6 = fArr3[i7];
                int i9 = i8 + 1;
                float f7 = fArr3[i8];
                int i10 = i9 + 1;
                i2 = i10 + 1;
                r7.A7g(f4, f5, f6, f7, fArr3[i9], fArr3[i10]);
            } else if (b2 == 3) {
                float[] fArr4 = this.A03;
                int i11 = i2 + 1;
                float f8 = fArr4[i2];
                int i12 = i11 + 1;
                float f9 = fArr4[i11];
                int i13 = i12 + 1;
                i2 = i13 + 1;
                r7.AbD(f8, f9, fArr4[i12], fArr4[i13]);
            } else if (b2 != 8) {
                boolean A1O = AnonymousClass000.A1O(b2 & 2);
                boolean A1O2 = AnonymousClass000.A1O(b2 & 1);
                float[] fArr5 = this.A03;
                int i14 = i2 + 1;
                float f10 = fArr5[i2];
                int i15 = i14 + 1;
                float f11 = fArr5[i14];
                int i16 = i15 + 1;
                float f12 = fArr5[i15];
                int i17 = i16 + 1;
                i2 = i17 + 1;
                r7.A58(f10, f11, f12, fArr5[i16], fArr5[i17], A1O, A1O2);
            } else {
                r7.close();
            }
        }
    }

    public void A58(float f2, float f3, float f4, float f5, float f6, boolean z2, boolean z3) {
        char c2 = 0;
        if (z2) {
            c2 = 2;
        }
        A01((c2 | true) | z3 ? (byte) 1 : 0);
        A02(5);
        float[] fArr = this.A03;
        int A002 = A00(this, fArr, f2, f3, f4);
        int i2 = A002 + 1;
        this.A01 = i2;
        fArr[A002] = f5;
        this.A01 = i2 + 1;
        fArr[i2] = f6;
    }

    public void A7g(float f2, float f3, float f4, float f5, float f6, float f7) {
        A01((byte) 2);
        A02(6);
        float[] fArr = this.A03;
        int A002 = A00(this, fArr, f2, f3, f4);
        int i2 = A002 + 1;
        this.A01 = i2;
        fArr[A002] = f5;
        int i3 = i2 + 1;
        this.A01 = i3;
        fArr[i2] = f6;
        this.A01 = i3 + 1;
        fArr[i3] = f7;
    }

    public void AK9(float f2, float f3) {
        A01((byte) 1);
        A02(2);
        float[] fArr = this.A03;
        int i2 = this.A01;
        int i3 = i2 + 1;
        this.A01 = i3;
        fArr[i2] = f2;
        this.A01 = i3 + 1;
        fArr[i3] = f3;
    }

    public void ALb(float f2, float f3) {
        A01((byte) 0);
        A02(2);
        float[] fArr = this.A03;
        int i2 = this.A01;
        int i3 = i2 + 1;
        this.A01 = i3;
        fArr[i2] = f2;
        this.A01 = i3 + 1;
        fArr[i3] = f3;
    }

    public void AbD(float f2, float f3, float f4, float f5) {
        A01((byte) 3);
        A02(4);
        float[] fArr = this.A03;
        int A002 = A00(this, fArr, f2, f3, f4);
        this.A01 = A002 + 1;
        fArr[A002] = f5;
    }

    public void close() {
        A01((byte) 8);
    }
}
