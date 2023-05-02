package com.joom.paranoid;

/* compiled from: XFMFile */
public class RandomHelper {
    public static long next(long j2) {
        short s2 = (short) ((int) (j2 & 65535));
        short s3 = (short) ((int) ((j2 >>> 16) & 65535));
        short s4 = (short) (s2 + s3);
        short s5 = (short) (s3 ^ s2);
        return ((((long) ((short) ((s5 >>> 22) | (s5 << 10)))) | (((long) ((short) (((short) ((s4 >>> 23) | (s4 << 9))) + s2))) << 16)) << 16) | ((long) ((short) (((short) (((short) ((s2 << 13) | (s2 >>> 19))) ^ s5)) ^ (s5 << 5))));
    }

    public static long seed(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * 7109453100751455733L;
        return ((j3 ^ (j3 >>> 28)) * -3808689974395783757L) >>> 32;
    }
}
