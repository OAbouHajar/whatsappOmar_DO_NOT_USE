package X;

/* renamed from: X.4Xg  reason: invalid class name and case insensitive filesystem */
public final class C87524Xg {
    public static void A00(char[] cArr, byte b2, byte b3, byte b4, byte b5, int i2) {
        if (b3 > -65 || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || b4 > -65 || b5 > -65) {
            throw new AnonymousClass40H("Protocol message had invalid UTF-8.");
        }
        byte b6 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i2] = (char) ((b6 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((b6 & 1023) + 56320);
    }

    public static void A01(char[] cArr, byte b2, byte b3, byte b4, int i2) {
        if (b3 > -65 || (b2 != -32 ? !(b2 != -19 || b3 < -96) : b3 < -96) || b4 > -65) {
            throw new AnonymousClass40H("Protocol message had invalid UTF-8.");
        }
        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }
}
