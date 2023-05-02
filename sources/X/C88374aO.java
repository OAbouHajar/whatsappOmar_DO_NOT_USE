package X;

/* renamed from: X.4aO  reason: invalid class name and case insensitive filesystem */
public final class C88374aO {
    public long A00 = -9223372036854775807L;
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C90504eH A06 = new C90504eH();
    public final AnonymousClass4X5 A07 = new AnonymousClass4X5(0);

    public static long A00(C90504eH r15) {
        int i2 = r15.A01;
        if (r15.A00 - i2 >= 9) {
            byte[] bArr = new byte[9];
            r15.A0V(bArr, 0, 9);
            r15.A0S(i2);
            byte b2 = bArr[0];
            if ((b2 & 196) == 68) {
                byte b3 = bArr[2];
                if ((b3 & 4) == 4) {
                    byte b4 = bArr[4];
                    if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j2 = (long) b2;
                        long j3 = (long) b3;
                        return (((j2 & 56) >> 3) << 30) | ((j2 & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
                    }
                }
            }
        }
        return -9223372036854775807L;
    }
}
