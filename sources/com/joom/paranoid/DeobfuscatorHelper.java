package com.joom.paranoid;

/* compiled from: XFMFile */
public class DeobfuscatorHelper {
    public static final int MAX_CHUNK_LENGTH = 8191;

    public static String getString(long j2, String[] strArr) {
        long next = RandomHelper.next(RandomHelper.seed(4294967295L & j2));
        long next2 = RandomHelper.next(next);
        int i2 = (int) (((j2 >>> 32) ^ ((next >>> 32) & 65535)) ^ ((next2 >>> 16) & -65536));
        long next3 = RandomHelper.next(next2) ^ (((long) strArr[i2 / MAX_CHUNK_LENGTH].charAt(i2 % MAX_CHUNK_LENGTH)) << 32);
        int i3 = (int) ((next3 >>> 32) & 65535);
        char[] cArr = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + i4 + 1;
            next3 = RandomHelper.next(next3) ^ (((long) strArr[i5 / MAX_CHUNK_LENGTH].charAt(i5 % MAX_CHUNK_LENGTH)) << 32);
            cArr[i4] = (char) ((int) ((next3 >>> 32) & 65535));
        }
        return new String(cArr);
    }
}
