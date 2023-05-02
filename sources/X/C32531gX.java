package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1gX  reason: invalid class name and case insensitive filesystem */
public final class C32531gX extends C32541gY {
    public static final Logger A04 = Logger.getLogger(C32531gX.class.getName());
    public static final boolean A05 = C90914f4.A06;
    public int A00;
    public C98574sd A01;
    public final int A02;
    public final byte[] A03;

    public C32531gX(byte[] bArr, int i2) {
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.A03 = bArr;
            this.A00 = 0;
            this.A02 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    public static int A00(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) != 0) {
            return (i2 & -268435456) == 0 ? 4 : 5;
        }
        return 3;
    }

    public static int A01(int i2, long j2) {
        return A00(i2 << 3) + A02((j2 >> 63) ^ (j2 << 1));
    }

    public static int A02(long j2) {
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        int i2 = 2;
        if ((-34359738368L & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        }
        if ((-2097152 & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i2 + 1 : i2;
    }

    public static int A03(AnonymousClass557 r1, int i2) {
        int A002 = A00(i2 << 3);
        int A022 = r1.A02();
        return A002 + A00(A022) + A022;
    }

    @Deprecated
    public static int A04(C109905Uc r4, AnonymousClass5TK r5, int i2) {
        int A002 = A00(i2 << 3) << 1;
        C98484sU r42 = (C98484sU) r4;
        C67293bJ r2 = (C67293bJ) r42;
        int i3 = r2.zzc;
        if (i3 == -1) {
            i3 = r5.Aj1(r42);
            r2.zzc = i3;
        }
        return A002 + i3;
    }

    public final void A05(byte b2) {
        try {
            byte[] bArr = this.A03;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40N(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A02), 1}), e2);
        }
    }

    public final void A06(int i2) {
        long j2;
        byte b2;
        if (A05 && !C87864Yy.A00()) {
            int i3 = this.A02;
            int i4 = this.A00;
            if (i3 - i4 >= 5) {
                int i5 = i2 & -128;
                byte[] bArr = this.A03;
                this.A00 = i4 + 1;
                if (i5 == 0) {
                    j2 = (long) i4;
                    b2 = (byte) i2;
                } else {
                    C90914f4.A0A(bArr, (byte) (i2 | 128), (long) i4);
                    int i6 = i2 >>> 7;
                    if ((i6 & -128) != 0) {
                        int i7 = this.A00;
                        this.A00 = i7 + 1;
                        C90914f4.A0A(bArr, (byte) (i6 | 128), (long) i7);
                        i6 >>>= 7;
                        if ((i6 & -128) != 0) {
                            int i8 = this.A00;
                            this.A00 = i8 + 1;
                            C90914f4.A0A(bArr, (byte) (i6 | 128), (long) i8);
                            i6 >>>= 7;
                            if ((i6 & -128) != 0) {
                                int i9 = this.A00;
                                this.A00 = i9 + 1;
                                C90914f4.A0A(bArr, (byte) (i6 | 128), (long) i9);
                                i6 >>>= 7;
                            }
                        }
                    }
                    int i10 = this.A00;
                    this.A00 = i10 + 1;
                    j2 = (long) i10;
                    b2 = (byte) i6;
                }
                C90914f4.A0A(bArr, b2, j2);
                return;
            }
        }
        while ((i2 & -128) != 0) {
            try {
                byte[] bArr2 = this.A03;
                int i11 = this.A00;
                this.A00 = i11 + 1;
                bArr2[i11] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new AnonymousClass40N(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A02), 1}), e2);
            }
        }
        byte[] bArr3 = this.A03;
        int i12 = this.A00;
        this.A00 = i12 + 1;
        bArr3[i12] = (byte) i2;
    }

    public final void A07(int i2) {
        try {
            byte[] bArr = this.A03;
            int i3 = this.A00;
            int i4 = i3 + 1;
            this.A00 = i4;
            bArr[i3] = (byte) i2;
            int i5 = i4 + 1;
            this.A00 = i5;
            bArr[i4] = (byte) (i2 >> 8);
            int i6 = i5 + 1;
            this.A00 = i6;
            bArr[i5] = (byte) (i2 >> 16);
            this.A00 = i6 + 1;
            bArr[i6] = (byte) (i2 >>> 24);
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40N(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A02), 1}), e2);
        }
    }

    public final void A08(int i2, int i3) {
        A06(i2 << 3);
        if (i3 >= 0) {
            A06(i3);
        } else {
            A0A((long) i3);
        }
    }

    public final void A09(int i2, String str) {
        int A002;
        A06((i2 << 3) | 2);
        int i3 = this.A00;
        try {
            int length = str.length();
            int A003 = A00(length * 3);
            int A004 = A00(length);
            if (A004 == A003) {
                int i4 = i3 + A004;
                this.A00 = i4;
                A002 = AnonymousClass4YS.A00.A00(str, this.A03, i4, this.A02 - i4);
                this.A00 = i3;
                A06((A002 - i3) - A004);
            } else {
                A06(AnonymousClass4YS.A00(str));
                byte[] bArr = this.A03;
                int i5 = this.A00;
                A002 = AnonymousClass4YS.A00.A00(str, bArr, i5, this.A02 - i5);
            }
            this.A00 = A002;
        } catch (AnonymousClass443 e2) {
            this.A00 = i3;
            A04.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e2);
            byte[] bytes = str.getBytes(AnonymousClass4ZC.A02);
            try {
                int length2 = bytes.length;
                A06(length2);
                A0D(bytes, 0, length2);
            } catch (IndexOutOfBoundsException e3) {
                throw new AnonymousClass40N(e3);
            } catch (AnonymousClass40N e4) {
                throw e4;
            }
        } catch (IndexOutOfBoundsException e5) {
            throw new AnonymousClass40N(e5);
        }
    }

    public final void A0A(long j2) {
        if (!A05 || this.A02 - this.A00 < 10) {
            while ((j2 & -128) != 0) {
                try {
                    byte[] bArr = this.A03;
                    int i2 = this.A00;
                    this.A00 = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new AnonymousClass40N(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A02), 1}), e2);
                }
            }
            byte[] bArr2 = this.A03;
            int i3 = this.A00;
            this.A00 = i3 + 1;
            bArr2[i3] = (byte) ((int) j2);
            return;
        }
        while (true) {
            int i4 = ((j2 & -128) > 0 ? 1 : ((j2 & -128) == 0 ? 0 : -1));
            byte[] bArr3 = this.A03;
            int i5 = this.A00;
            this.A00 = i5 + 1;
            long j3 = (long) i5;
            int i6 = (int) j2;
            if (i4 == 0) {
                C90914f4.A0A(bArr3, (byte) i6, j3);
                return;
            } else {
                C90914f4.A0A(bArr3, (byte) ((i6 & 127) | 128), j3);
                j2 >>>= 7;
            }
        }
    }

    public final void A0B(long j2) {
        try {
            byte[] bArr = this.A03;
            int i2 = this.A00;
            int i3 = i2 + 1;
            this.A00 = i3;
            bArr[i2] = (byte) ((int) j2);
            int i4 = i3 + 1;
            this.A00 = i4;
            bArr[i3] = (byte) ((int) (j2 >> 8));
            int i5 = i4 + 1;
            this.A00 = i5;
            bArr[i4] = (byte) ((int) (j2 >> 16));
            int i6 = i5 + 1;
            this.A00 = i6;
            bArr[i5] = (byte) ((int) (j2 >> 24));
            int i7 = i6 + 1;
            this.A00 = i7;
            bArr[i6] = (byte) ((int) (j2 >> 32));
            int i8 = i7 + 1;
            this.A00 = i8;
            bArr[i7] = (byte) ((int) (j2 >> 40));
            int i9 = i8 + 1;
            this.A00 = i9;
            bArr[i8] = (byte) ((int) (j2 >> 48));
            this.A00 = i9 + 1;
            bArr[i9] = (byte) ((int) (j2 >> 56));
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40N(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A02), 1}), e2);
        }
    }

    public final void A0C(AnonymousClass557 r4, int i2) {
        A06((i2 << 3) | 2);
        A06(r4.A02());
        C66963am r42 = (C66963am) r4;
        A0D(r42.zzb, r42.A03(), r42.A02());
    }

    public final void A0D(byte[] bArr, int i2, int i3) {
        try {
            System.arraycopy(bArr, i2, this.A03, this.A00, i3);
            this.A00 += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40N(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A02), Integer.valueOf(i3)}), e2);
        }
    }
}
