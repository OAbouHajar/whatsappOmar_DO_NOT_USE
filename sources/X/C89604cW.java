package X;

/* renamed from: X.4cW  reason: invalid class name and case insensitive filesystem */
public class C89604cW {
    public static void A00(byte[] bArr, int[] iArr) {
        byte[] bArr2 = bArr;
        long A0L = AnonymousClass3K2.A0L(bArr2, 0);
        long A0J = AnonymousClass3K2.A0J(bArr2, 4) << 6;
        long A0J2 = AnonymousClass3K2.A0J(bArr2, 10) << 3;
        long A0L2 = AnonymousClass3K2.A0L(bArr2, 16);
        long A0J3 = AnonymousClass3K2.A0J(bArr2, 23) << 5;
        long A0J4 = (AnonymousClass3K2.A0J(bArr2, 29) & 8388607) << 2;
        long j2 = (A0J4 + 16777216) >> 25;
        long j3 = A0L + (19 * j2);
        long j4 = (A0J + 16777216) >> 25;
        long A0J5 = (AnonymousClass3K2.A0J(bArr2, 7) << 5) + j4;
        long j5 = A0J - (j4 << 25);
        long j6 = (A0J2 + 16777216) >> 25;
        long A0J6 = (AnonymousClass3K2.A0J(bArr2, 13) << 2) + j6;
        long j7 = A0J2 - (j6 << 25);
        long j8 = (A0L2 + 16777216) >> 25;
        long A0J7 = (AnonymousClass3K2.A0J(bArr2, 20) << 7) + j8;
        long j9 = A0L2 - (j8 << 25);
        long j10 = (A0J3 + 16777216) >> 25;
        long A0J8 = (AnonymousClass3K2.A0J(bArr2, 26) << 4) + j10;
        long j11 = A0J3 - (j10 << 25);
        long j12 = (j3 + 33554432) >> 26;
        long j13 = j5 + j12;
        long j14 = j3 - (j12 << 26);
        long j15 = (A0J5 + 33554432) >> 26;
        long j16 = j7 + j15;
        long j17 = A0J5 - (j15 << 26);
        long j18 = (A0J6 + 33554432) >> 26;
        long j19 = j9 + j18;
        long j20 = A0J6 - (j18 << 26);
        long j21 = (A0J7 + 33554432) >> 26;
        long j22 = j11 + j21;
        long j23 = A0J7 - (j21 << 26);
        long j24 = (A0J8 + 33554432) >> 26;
        iArr[0] = (int) j14;
        iArr[1] = (int) j13;
        iArr[2] = (int) j17;
        iArr[3] = (int) j16;
        iArr[4] = (int) j20;
        iArr[5] = (int) j19;
        iArr[6] = (int) j23;
        iArr[7] = (int) j22;
        iArr[8] = (int) (A0J8 - (j24 << 26));
        iArr[9] = (int) ((A0J4 - (j2 << 25)) + j24);
    }
}
