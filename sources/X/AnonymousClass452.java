package X;

/* renamed from: X.452  reason: invalid class name */
public final class AnonymousClass452 {
    public static long A00(C90504eH r7, int i2, int i3) {
        r7.A0S(i2);
        int i4 = r7.A00;
        if (i4 - r7.A01 >= 5) {
            int A07 = r7.A07();
            if ((8388608 & A07) == 0 && ((2096896 & A07) >> 8) == i3 && (A07 & 32) != 0 && r7.A0C() >= 7 && i4 - r7.A01 >= 7 && (r7.A0C() & 16) == 16) {
                byte[] bArr = new byte[6];
                r7.A0V(bArr, 0, 6);
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}
