package X;

/* renamed from: X.5AG  reason: invalid class name */
public abstract class AnonymousClass5AG implements AnonymousClass5SH, AnonymousClass5VO, AnonymousClass5NN {
    public static final long[] A0E = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public byte[] A0C;
    public long[] A0D;

    public AnonymousClass5AG() {
        this.A0C = new byte[8];
        this.A0D = new long[80];
        this.A01 = 0;
        reset();
    }

    public AnonymousClass5AG(AnonymousClass5AG r2) {
        this.A0C = new byte[8];
        this.A0D = new long[80];
        A05(r2);
    }

    public static final long A00(long j2) {
        return ((j2 >>> 39) | (j2 << 25)) ^ (((j2 << 36) | (j2 >>> 28)) ^ ((j2 << 30) | (j2 >>> 34)));
    }

    public static final long A01(long j2) {
        return ((j2 >>> 41) | (j2 << 23)) ^ (((j2 << 50) | (j2 >>> 14)) ^ ((j2 << 46) | (j2 >>> 18)));
    }

    public static long A02(long j2, long j3) {
        return (j2 ^ -1) & j3;
    }

    public static void A03(AnonymousClass5AG r8, byte[] bArr, int i2) {
        long j2 = r8.A0A;
        if (j2 > 2305843009213693951L) {
            r8.A0B += j2 >>> 61;
            j2 &= 2305843009213693951L;
            r8.A0A = j2;
        }
        long j3 = j2 << 3;
        long j4 = r8.A0B;
        byte b2 = Byte.MIN_VALUE;
        while (true) {
            r8.AhH(b2);
            if (r8.A01 == 0) {
                break;
            }
            b2 = 0;
        }
        if (r8.A00 > 14) {
            r8.A04();
        }
        long[] jArr = r8.A0D;
        jArr[14] = j4;
        jArr[15] = j3;
        r8.A04();
        C31461eE.A04(bArr, i2, r8.A02);
        C31461eE.A04(bArr, i2 + 8, r8.A03);
        C31461eE.A04(bArr, i2 + 16, r8.A04);
        C31461eE.A04(bArr, i2 + 24, r8.A05);
        C31461eE.A04(bArr, i2 + 32, r8.A06);
        C31461eE.A04(bArr, i2 + 40, r8.A07);
    }

    public void A04() {
        long[] jArr;
        long j2 = this.A0A;
        if (j2 > 2305843009213693951L) {
            this.A0B = this.A0B + (j2 >>> 61);
            this.A0A = j2 & 2305843009213693951L;
        }
        int i2 = 16;
        do {
            jArr = this.A0D;
            long j3 = jArr[i2 - 2];
            long j4 = ((j3 >>> 6) ^ (((j3 << 45) | (j3 >>> 19)) ^ ((j3 << 3) | (j3 >>> 61)))) + jArr[i2 - 7];
            long j5 = jArr[i2 - 15];
            jArr[i2] = j4 + ((j5 >>> 7) ^ (((j5 << 63) | (j5 >>> 1)) ^ ((j5 << 56) | (j5 >>> 8)))) + jArr[i2 - 16];
            i2++;
        } while (i2 <= 79);
        long j6 = this.A02;
        long j7 = this.A03;
        long j8 = this.A04;
        long j9 = this.A05;
        long j10 = this.A06;
        long j11 = this.A07;
        long j12 = j9;
        long j13 = this.A08;
        long j14 = this.A09;
        long j15 = j14;
        long j16 = j11;
        int i3 = 0;
        long j17 = j7;
        long j18 = j8;
        long j19 = j10;
        int i4 = 0;
        long j20 = j14;
        long j21 = j6;
        long j22 = j13;
        do {
            long A012 = A01(j19);
            long A022 = A02(j19, j22);
            long[] jArr2 = A0E;
            int i5 = i3 + 1;
            long j23 = j20 + A012 + (A022 ^ (j16 & j19)) + jArr2[i3] + jArr[i3];
            long j24 = j12 + j23;
            long j25 = j21 & j17;
            long A002 = j23 + A00(j21) + (((j21 & j18) ^ j25) ^ (j17 & j18));
            int i6 = i5 + 1;
            long A013 = j22 + A01(j24) + (A02(j24, j16) ^ (j19 & j24)) + jArr2[i5] + jArr[i5];
            long j26 = j18 + A013;
            long j27 = A002 & j21;
            long A003 = A013 + A00(A002) + (((A002 & j17) ^ j27) ^ j25);
            int i7 = i6 + 1;
            long A014 = j16 + A01(j26) + (A02(j26, j19) ^ (j24 & j26)) + jArr2[i6] + jArr[i6];
            long j28 = j17 + A014;
            long j29 = A003 & A002;
            long A004 = A014 + A00(A003) + (((A003 & j21) ^ j29) ^ j27);
            int i8 = i7 + 1;
            long A015 = j19 + A01(j28) + (A02(j28, j24) ^ (j26 & j28)) + jArr2[i7] + jArr[i7];
            long j30 = j21 + A015;
            long j31 = A004 & A003;
            long A005 = A015 + A00(A004) + (((A004 & A002) ^ j31) ^ j29);
            int i9 = i8 + 1;
            long A016 = j24 + A01(j30) + (A02(j30, j26) ^ (j28 & j30)) + jArr2[i8] + jArr[i8];
            j20 = A002 + A016;
            long j32 = A005 & A004;
            j12 = A016 + A00(A005) + (((A005 & A003) ^ j32) ^ j31);
            int i10 = i9 + 1;
            long A017 = j26 + A01(j20) + (A02(j20, j28) ^ (j30 & j20)) + jArr2[i9] + jArr[i9];
            j22 = A003 + A017;
            long j33 = j12 & A005;
            j18 = A017 + A00(j12) + (((j12 & A004) ^ j33) ^ j32);
            int i11 = i10 + 1;
            long A018 = j28 + A01(j22) + (A02(j22, j30) ^ (j20 & j22)) + jArr2[i10] + jArr[i10];
            j16 = A004 + A018;
            long j34 = j18 & j12;
            j17 = A018 + A00(j18) + (((j18 & A005) ^ j34) ^ j33);
            i3 = i11 + 1;
            long A019 = j30 + A01(j16) + (A02(j16, j20) ^ (j22 & j16)) + jArr2[i11] + jArr[i11];
            j19 = A005 + A019;
            j21 = A019 + A00(j17) + (((j17 & j12) ^ (j17 & j18)) ^ j34);
            i4++;
        } while (i4 < 10);
        this.A02 = j6 + j21;
        this.A03 = j7 + j17;
        this.A04 = j8 + j18;
        this.A05 = j9 + j12;
        this.A06 = j10 + j19;
        this.A07 = j11 + j16;
        this.A08 = j13 + j22;
        this.A09 = j15 + j20;
        this.A00 = 0;
        int i12 = 0;
        do {
            jArr[i12] = 0;
            i12++;
        } while (i12 < 16);
    }

    public void A05(AnonymousClass5AG r5) {
        byte[] bArr = r5.A0C;
        System.arraycopy(bArr, 0, this.A0C, 0, bArr.length);
        this.A01 = r5.A01;
        this.A0A = r5.A0A;
        this.A0B = r5.A0B;
        this.A02 = r5.A02;
        this.A03 = r5.A03;
        this.A04 = r5.A04;
        this.A05 = r5.A05;
        this.A06 = r5.A06;
        this.A07 = r5.A07;
        this.A08 = r5.A08;
        this.A09 = r5.A09;
        long[] jArr = r5.A0D;
        System.arraycopy(jArr, 0, this.A0D, 0, jArr.length);
        this.A00 = r5.A00;
    }

    public void A06(byte[] bArr, int i2) {
        long[] jArr = this.A0D;
        int i3 = this.A00;
        jArr[i3] = AnonymousClass3K3.A0Q(C31461eE.A00(bArr, i2), C31461eE.A00(bArr, i2 + 4));
        int i4 = i3 + 1;
        this.A00 = i4;
        if (i4 == 16) {
            A04();
        }
    }

    public int AAI() {
        return 128;
    }

    public void AhH(byte b2) {
        byte[] bArr = this.A0C;
        int i2 = this.A01;
        int i3 = i2 + 1;
        this.A01 = i3;
        bArr[i2] = b2;
        if (i3 == bArr.length) {
            A06(bArr, 0);
            this.A01 = 0;
        }
        this.A0A++;
    }

    public void reset() {
        this.A0A = 0;
        this.A0B = 0;
        int i2 = 0;
        this.A01 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.A0C;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = 0;
            i3++;
        }
        this.A00 = 0;
        while (true) {
            long[] jArr = this.A0D;
            if (i2 != jArr.length) {
                jArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }

    public void update(byte[] bArr, int i2, int i3) {
        while (this.A01 != 0 && i3 > 0) {
            AhH(bArr[i2]);
            i2++;
            i3--;
        }
        while (true) {
            int length = this.A0C.length;
            if (i3 <= length) {
                break;
            }
            A06(bArr, i2);
            i2 += length;
            i3 -= length;
            this.A0A += (long) length;
        }
        while (i3 > 0) {
            AhH(bArr[i2]);
            i2++;
            i3--;
        }
    }
}
