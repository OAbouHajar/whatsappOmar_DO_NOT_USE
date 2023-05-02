package X;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: X.59y  reason: invalid class name and case insensitive filesystem */
public class C1055259y implements AnonymousClass5VP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public AnonymousClass5T1 A07;
    public C83194Fs A08;
    public AnonymousClass4R3 A09;
    public boolean A0A;
    public boolean A0B;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E;
    public byte[] A0F;
    public byte[] A0G;
    public byte[] A0H;
    public byte[] A0I;
    public byte[] A0J;
    public byte[] A0K;
    public byte[] A0L;
    public byte[] A0M;
    public byte[] A0N;

    public C1055259y(AnonymousClass5T1 r3) {
        if (r3.AA7() == 16) {
            AnonymousClass4R3 r0 = new AnonymousClass4R3();
            this.A07 = r3;
            this.A09 = r0;
            return;
        }
        throw AnonymousClass000.A0T("cipher required with a block size of 16.");
    }

    public static long A00(int i2, long j2, long j3) {
        long j4 = j3 & ((j2 >>> i2) ^ j2);
        return j2 ^ (j4 ^ (j4 << i2));
    }

    public static long A01(long j2, long j3) {
        long j4 = j2 & 1229782938247303441L;
        long j5 = j2 & 2459565876494606882L;
        long j6 = j2 & 4919131752989213764L;
        long j7 = j2 & -8608480567731124088L;
        long j8 = j3 & 1229782938247303441L;
        long j9 = j3 & 2459565876494606882L;
        long j10 = j3 & 4919131752989213764L;
        long j11 = j3 & -8608480567731124088L;
        return (((((j4 * j8) ^ (j5 * j11)) ^ (j6 * j10)) ^ (j7 * j9)) & 1229782938247303441L) | (((((j4 * j9) ^ (j5 * j8)) ^ (j6 * j11)) ^ (j7 * j10)) & 2459565876494606882L) | (((((j4 * j10) ^ (j5 * j9)) ^ (j6 * j8)) ^ (j7 * j11)) & 4919131752989213764L) | (((((j4 * j11) ^ (j5 * j10)) ^ (j6 * j9)) ^ (j7 * j8)) & -8608480567731124088L);
    }

    public static void A02(byte[] bArr, byte[] bArr2, int i2) {
        int i3 = 0;
        do {
            AnonymousClass3K2.A1U(bArr2, bArr, i2 + i3, bArr[i3], i3);
            int i4 = i3 + 1;
            AnonymousClass3K2.A1U(bArr2, bArr, i2 + i4, bArr[i4], i4);
            int i5 = i4 + 1;
            AnonymousClass3K2.A1U(bArr2, bArr, i2 + i5, bArr[i5], i5);
            int i6 = i5 + 1;
            AnonymousClass3K2.A1U(bArr2, bArr, i2 + i6, bArr[i6], i6);
            i3 = i6 + 1;
        } while (i3 < 16);
    }

    public static void A03(byte[] bArr, long[] jArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            jArr[i3] = AnonymousClass3K3.A0Q(C31461eE.A00(bArr, i2), C31461eE.A00(bArr, i2 + 4));
            i2 += 8;
        }
    }

    public static void A04(long[] jArr, int i2, long j2) {
        long A002 = A00(1, A00(2, A00(4, A00(8, A00(16, j2, 4294901760L), 280375465148160L), 67555025218437360L), 868082074056920076L), 2459565876494606882L);
        jArr[i2] = A002 & -6148914691236517206L;
        jArr[i2 + 1] = (A002 << 1) & -6148914691236517206L;
    }

    public static void A05(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr2[0];
        long j5 = jArr2[1];
        long reverse = Long.reverse(j2);
        long reverse2 = Long.reverse(j3);
        long reverse3 = Long.reverse(j4);
        long reverse4 = Long.reverse(j5);
        long reverse5 = Long.reverse(A01(reverse, reverse3));
        long A012 = A01(j2, j4) << 1;
        long reverse6 = Long.reverse(A01(reverse2, reverse4));
        long A013 = A01(j3, j5) << 1;
        long reverse7 = (Long.reverse(A01(reverse ^ reverse2, reverse4 ^ reverse3)) ^ ((A012 ^ reverse5) ^ reverse6)) ^ (((A013 ^ (A013 >>> 1)) ^ (A013 >>> 2)) ^ (A013 >>> 7));
        long A014 = ((A01(j2 ^ j3, j4 ^ j5) << 1) ^ ((reverse6 ^ A012) ^ A013)) ^ ((A013 << 62) ^ (A013 << 57));
        long j6 = reverse5 ^ ((A014 >>> 7) ^ (((A014 >>> 1) ^ A014) ^ (A014 >>> 2)));
        jArr[0] = j6;
        jArr[1] = ((A014 << 57) ^ ((A014 << 63) ^ (A014 << 62))) ^ reverse7;
    }

    public final void A06() {
        if (!this.A0B) {
            throw AnonymousClass000.A0V(this.A0A ? "GCM cipher cannot be reused for encryption" : "GCM cipher needs to be initialised");
        }
    }

    public final void A07() {
        if (this.A04 > 0) {
            System.arraycopy(this.A0F, 0, this.A0G, 0, 16);
            this.A05 = this.A04;
        }
        int i2 = this.A00;
        if (i2 > 0) {
            A0A(this.A0G, this.A0H, 0, i2);
            this.A05 += (long) i2;
        }
        if (this.A05 > 0) {
            System.arraycopy(this.A0G, 0, this.A0E, 0, 16);
        }
    }

    public final void A08(boolean z2) {
        this.A07.reset();
        this.A0E = new byte[16];
        this.A0F = new byte[16];
        this.A0G = new byte[16];
        this.A0H = new byte[16];
        this.A00 = 0;
        this.A04 = 0;
        this.A05 = 0;
        this.A0J = C33111hx.A02(this.A0D);
        this.A01 = -2;
        this.A02 = 0;
        this.A06 = 0;
        byte[] bArr = this.A0I;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z2) {
            this.A0M = null;
        }
        if (this.A0A) {
            this.A0B = false;
            return;
        }
        byte[] bArr2 = this.A0K;
        if (bArr2 != null) {
            Aap(bArr2, 0, bArr2.length);
        }
    }

    public final void A09(byte[] bArr) {
        int i2 = this.A01;
        if (i2 != 0) {
            this.A01 = i2 - 1;
            byte[] bArr2 = this.A0J;
            int i3 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i3;
            int i4 = (i3 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i4;
            int i5 = (i4 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i5;
            bArr2[12] = (byte) ((i5 >>> 8) + (bArr2[12] & 255));
            this.A07.Aaq(bArr2, bArr, 0, 0);
            return;
        }
        throw AnonymousClass000.A0V("Attempt to process too many blocks");
    }

    public final void A0A(byte[] bArr, byte[] bArr2, int i2, int i3) {
        while (true) {
            i3--;
            if (i3 >= 0) {
                AnonymousClass3K2.A1U(bArr2, bArr, i2 + i3, bArr[i3], i3);
            } else {
                this.A09.A00(bArr);
                return;
            }
        }
    }

    public final void A0B(byte[] bArr, byte[] bArr2, int i2, int i3) {
        if (bArr2.length - i3 >= 16) {
            if (this.A06 == 0) {
                A07();
            }
            byte[] bArr3 = new byte[16];
            A09(bArr3);
            if (this.A0A) {
                A02(bArr3, bArr, i2);
                byte[] bArr4 = this.A0E;
                AnonymousClass48D.A00(bArr4, bArr3);
                this.A09.A00(bArr4);
                System.arraycopy(bArr3, 0, bArr2, i3, 16);
            } else {
                byte[] bArr5 = this.A0E;
                A02(bArr5, bArr, i2);
                this.A09.A00(bArr5);
                int i4 = 0;
                do {
                    AnonymousClass3K2.A1U(bArr, bArr2, i2 + i4, bArr3[i4], i3 + i4);
                    int i5 = i4 + 1;
                    AnonymousClass3K2.A1U(bArr, bArr2, i2 + i5, bArr3[i5], i3 + i5);
                    int i6 = i5 + 1;
                    AnonymousClass3K2.A1U(bArr, bArr2, i2 + i6, bArr3[i6], i3 + i6);
                    int i7 = i6 + 1;
                    AnonymousClass3K2.A1U(bArr, bArr2, i2 + i7, bArr3[i7], i3 + i7);
                    i4 = i7 + 1;
                } while (i4 < 16);
            }
            this.A06 += 16;
            return;
        }
        throw new AnonymousClass5JD("Output buffer too short");
    }

    public int A8A(byte[] bArr, int i2) {
        int i3 = i2;
        A06();
        if (this.A06 == 0) {
            A07();
        }
        int i4 = this.A02;
        byte[] bArr2 = bArr;
        if (!this.A0A) {
            int i5 = this.A03;
            if (i4 >= i5) {
                i4 -= i5;
                if (bArr2.length - i2 < i4) {
                    throw new AnonymousClass5JD("Output buffer too short");
                }
            } else {
                throw new AnonymousClass5JC("data too short");
            }
        } else if (bArr2.length - i2 < this.A03 + i4) {
            throw new AnonymousClass5JD("Output buffer too short");
        }
        if (i4 > 0) {
            byte[] bArr3 = this.A0I;
            byte[] bArr4 = new byte[16];
            A09(bArr4);
            if (!this.A0A) {
                A0A(this.A0E, bArr3, 0, i4);
                int i6 = i4;
                while (true) {
                    i6--;
                    if (i6 < 0) {
                        break;
                    }
                    bArr3[i6] = (byte) (bArr3[i6] ^ bArr4[i6]);
                }
            } else {
                int i7 = i4;
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    bArr3[i7] = (byte) (bArr3[i7] ^ bArr4[i7]);
                }
                A0A(this.A0E, bArr3, 0, i4);
            }
            System.arraycopy(bArr3, 0, bArr2, i3, i4);
            this.A06 += (long) i4;
        }
        long j2 = this.A04;
        int i8 = this.A00;
        long j3 = j2 + ((long) i8);
        this.A04 = j3;
        long j4 = this.A05;
        if (j3 > j4) {
            if (i8 > 0) {
                A0A(this.A0F, this.A0H, 0, i8);
            }
            if (j4 > 0) {
                AnonymousClass48D.A00(this.A0F, this.A0G);
            }
            long j5 = ((this.A06 * 8) + 127) >>> 7;
            byte[] bArr5 = new byte[16];
            C83194Fs r1 = this.A08;
            if (r1 == null) {
                r1 = new C83194Fs();
                this.A08 = r1;
                long[] jArr = new long[2];
                A03(this.A0C, jArr);
                r1.A00 = jArr;
            }
            long[] jArr2 = new long[2];
            jArr2[0] = Long.MIN_VALUE;
            if (j5 <= 0) {
                int i9 = 0;
                int i10 = 0;
            } else {
                long[] jArr3 = r1.A00;
                long[] jArr4 = jArr3 == null ? null : (long[]) jArr3.clone();
                do {
                    if ((1 & j5) != 0) {
                        A05(jArr2, jArr4);
                    }
                    long[] jArr5 = new long[4];
                    A04(jArr5, 0, jArr4[0]);
                    A04(jArr5, 2, jArr4[1]);
                    long j6 = jArr5[0];
                    long j7 = jArr5[1];
                    long j8 = jArr5[2];
                    long j9 = jArr5[3];
                    long j10 = j8 ^ ((j9 << 57) ^ ((j9 << 63) ^ (j9 << 62)));
                    jArr4[0] = j6 ^ ((((j10 >>> 1) ^ j10) ^ (j10 >>> 2)) ^ (j10 >>> 7));
                    jArr4[1] = (j7 ^ ((((j9 >>> 1) ^ j9) ^ (j9 >>> 2)) ^ (j9 >>> 7))) ^ ((j10 << 57) ^ ((j10 << 63) ^ (j10 << 62)));
                    j5 >>>= 1;
                } while (j5 > 0);
            }
            int i92 = 0;
            int i102 = 0;
            do {
                C31461eE.A04(bArr5, i92, jArr2[i102]);
                i92 += 8;
                i102++;
            } while (i102 < 2);
            byte[] bArr6 = this.A0F;
            long[] jArr6 = new long[2];
            A03(bArr6, jArr6);
            long[] jArr7 = new long[2];
            A03(bArr5, jArr7);
            A05(jArr6, jArr7);
            int i11 = 0;
            int i12 = 0;
            do {
                C31461eE.A04(bArr6, i11, jArr6[i12]);
                i11 += 8;
                i12++;
            } while (i12 < 2);
            AnonymousClass48D.A00(this.A0E, this.A0F);
        }
        byte[] bArr7 = new byte[16];
        C31461eE.A04(bArr7, 0, this.A04 * 8);
        C31461eE.A04(bArr7, 8, this.A06 * 8);
        byte[] bArr8 = this.A0E;
        AnonymousClass48D.A00(bArr8, bArr7);
        this.A09.A00(bArr8);
        byte[] bArr9 = new byte[16];
        this.A07.Aaq(this.A0D, bArr9, 0, 0);
        AnonymousClass48D.A00(bArr9, this.A0E);
        int i13 = this.A03;
        byte[] bArr10 = new byte[i13];
        this.A0M = bArr10;
        System.arraycopy(bArr9, 0, bArr10, 0, i13);
        if (this.A0A) {
            System.arraycopy(this.A0M, 0, bArr2, i2 + this.A02, this.A03);
            i4 += this.A03;
        } else {
            int i14 = this.A03;
            byte[] bArr11 = new byte[i14];
            System.arraycopy(this.A0I, i4, bArr11, 0, i14);
            if (!C33111hx.A01(this.A0M, bArr11)) {
                throw new AnonymousClass5JC("mac check in GCM failed");
            }
        }
        A08(false);
        return i4;
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A07);
        return AnonymousClass000.A0h("/GCM", A0o);
    }

    public byte[] ADG() {
        byte[] bArr = this.A0M;
        return bArr == null ? new byte[this.A03] : C33111hx.A02(bArr);
    }

    public int AE9(int i2) {
        int i3 = i2 + this.A02;
        boolean z2 = this.A0A;
        int i4 = this.A03;
        if (z2) {
            return i3 + i4;
        }
        int i5 = i3;
        int i6 = i3 - i4;
        if (i5 < i4) {
            return 0;
        }
        return i6;
    }

    public AnonymousClass5T1 AGk() {
        return this.A07;
    }

    public int AGm(int i2) {
        int i3 = i2 + this.A02;
        if (!this.A0A) {
            int i4 = this.A03;
            int i5 = i3;
            i3 -= i4;
            if (i5 < i4) {
                return 0;
            }
        }
        return i3 - (i3 % 16);
    }

    public void AI1(C46932Gv r22, boolean z2) {
        String str;
        byte[] bArr;
        int i2;
        C46922Gu r0;
        byte[] bArr2;
        byte[] bArr3;
        C46932Gv r3 = r22;
        this.A0A = z2;
        this.A0M = null;
        this.A0B = true;
        if (r3 instanceof C1053859h) {
            C1053859h r32 = (C1053859h) r3;
            bArr = C33111hx.A02(r32.A03);
            this.A0K = C33111hx.A02(r32.A02);
            int i3 = r32.A00;
            if (i3 < 32 || i3 > 128 || i3 % 8 != 0) {
                str = C13680ns.A0c(i3, "Invalid value for MAC size: ");
                throw AnonymousClass000.A0T(str);
            }
            i2 = i3 / 8;
            this.A03 = i2;
            r0 = r32.A01;
        } else if (r3 instanceof C1054259l) {
            C1054259l r33 = (C1054259l) r3;
            bArr = r33.A01;
            this.A0K = null;
            this.A03 = 16;
            i2 = 16;
            r0 = (C46922Gu) r33.A00;
        } else {
            str = "invalid parameters passed to GCM";
            throw AnonymousClass000.A0T(str);
        }
        int i4 = i2 + 16;
        if (z2) {
            i4 = 16;
        }
        this.A0I = new byte[i4];
        if (bArr == null || bArr.length < 1) {
            str = "IV must be at least 1 byte";
            throw AnonymousClass000.A0T(str);
        } else if (!z2 || (bArr2 = this.A0N) == null || !Arrays.equals(bArr2, bArr) || (r0 != null && ((bArr3 = this.A0L) == null || !Arrays.equals(bArr3, r0.A00)))) {
            this.A0N = bArr;
            if (r0 != null) {
                this.A0L = r0.A00;
            }
            if (r0 != null) {
                AnonymousClass5T1 r1 = this.A07;
                r1.AI1(r0, true);
                byte[] bArr4 = new byte[16];
                this.A0C = bArr4;
                r1.Aaq(bArr4, bArr4, 0, 0);
                AnonymousClass4R3 r34 = this.A09;
                byte[] bArr5 = this.A0C;
                int i5 = 2;
                if (r34.A01 == null) {
                    r34.A01 = (long[][]) Array.newInstance(long.class, new int[]{256, 2});
                } else if (Arrays.equals(r34.A00, bArr5)) {
                    this.A08 = null;
                }
                byte[] A022 = C33111hx.A02(bArr5);
                r34.A00 = A022;
                long[][] jArr = r34.A01;
                long[] jArr2 = jArr[1];
                A03(A022, jArr2);
                long j2 = jArr2[0];
                long j3 = jArr2[1];
                long j4 = j3 << 57;
                jArr2[0] = (j4 >>> 7) ^ ((((j2 >>> 7) ^ j4) ^ (j4 >>> 1)) ^ (j4 >>> 2));
                jArr2[1] = (j2 << 57) | (j3 >>> 7);
                do {
                    long[] jArr3 = jArr[i5 >> 1];
                    long[] jArr4 = jArr[i5];
                    long j5 = jArr3[0];
                    long j6 = jArr3[1];
                    long j7 = j5 >> 63;
                    jArr4[0] = ((j5 ^ (-2233785415175766016L & j7)) << 1) | (j6 >>> 63);
                    jArr4[1] = (j6 << 1) | (-j7);
                    long[] jArr5 = jArr[i5 + 1];
                    jArr5[0] = jArr4[0] ^ jArr2[0];
                    jArr5[1] = jArr2[1] ^ jArr4[1];
                    i5 += 2;
                } while (i5 < 256);
                this.A08 = null;
            } else if (this.A0C == null) {
                str = "Key must be specified in initial init";
                throw AnonymousClass000.A0T(str);
            }
            byte[] bArr6 = new byte[16];
            this.A0D = bArr6;
            byte[] bArr7 = this.A0N;
            int length = bArr7.length;
            if (length == 12) {
                System.arraycopy(bArr7, 0, bArr6, 0, length);
                bArr6 = this.A0D;
                bArr6[15] = 1;
            } else {
                for (int i6 = 0; i6 < length; i6 += 16) {
                    A0A(bArr6, bArr7, i6, Math.min(length - i6, 16));
                }
                byte[] bArr8 = new byte[16];
                C31461eE.A04(bArr8, 8, ((long) length) * 8);
                AnonymousClass48D.A00(bArr6, bArr8);
                this.A09.A00(bArr6);
            }
            this.A0E = new byte[16];
            this.A0F = new byte[16];
            this.A0G = new byte[16];
            this.A0H = new byte[16];
            this.A00 = 0;
            this.A04 = 0;
            this.A05 = 0;
            this.A0J = C33111hx.A02(bArr6);
            this.A01 = -2;
            this.A02 = 0;
            this.A06 = 0;
            byte[] bArr9 = this.A0K;
            if (bArr9 != null) {
                Aap(bArr9, 0, bArr9.length);
            }
        } else {
            throw AnonymousClass000.A0T("cannot reuse nonce for GCM encryption");
        }
    }

    public void Aap(byte[] bArr, int i2, int i3) {
        A06();
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.A0H;
            int i5 = this.A00;
            AnonymousClass3K4.A16(bArr, bArr2, i2 + i4, i5);
            int i6 = i5 + 1;
            this.A00 = i6;
            if (i6 == 16) {
                byte[] bArr3 = this.A0F;
                AnonymousClass48D.A00(bArr3, bArr2);
                this.A09.A00(bArr3);
                this.A00 = 0;
                this.A04 += 16;
            }
        }
    }

    public int Aar(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        int i5;
        A06();
        if (bArr.length - i2 >= i3) {
            if (this.A0A) {
                int i6 = this.A02;
                if (i6 != 0) {
                    while (true) {
                        if (i3 <= 0) {
                            break;
                        }
                        i3--;
                        byte[] bArr3 = this.A0I;
                        int i7 = i2 + 1;
                        AnonymousClass3K4.A16(bArr, bArr3, i2, i6);
                        i6++;
                        this.A02 = i6;
                        if (i6 == 16) {
                            A0B(bArr3, bArr2, 0, i4);
                            this.A02 = 0;
                            i2 = i7;
                            i5 = 16;
                            break;
                        }
                        i2 = i7;
                    }
                }
                i5 = 0;
                while (i3 >= 16) {
                    A0B(bArr, bArr2, i2, i4 + i5);
                    i2 += 16;
                    i3 -= 16;
                    i5 += 16;
                }
                if (i3 > 0) {
                    System.arraycopy(bArr, i2, this.A0I, 0, i3);
                    this.A02 = i3;
                }
            } else {
                i5 = 0;
                for (int i8 = 0; i8 < i3; i8++) {
                    byte[] bArr4 = this.A0I;
                    int i9 = this.A02;
                    AnonymousClass3K4.A16(bArr, bArr4, i2 + i8, i9);
                    int i10 = i9 + 1;
                    this.A02 = i10;
                    if (i10 == bArr4.length) {
                        A0B(bArr4, bArr2, 0, i4 + i5);
                        byte[] bArr5 = this.A0I;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.A03);
                        this.A02 = this.A03;
                        i5 += 16;
                    }
                }
            }
            return i5;
        }
        throw new AnonymousClass5JI("Input buffer too short");
    }
}
