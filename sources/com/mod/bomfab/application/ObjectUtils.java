package com.mod.bomfab.application;

import java.util.Arrays;

public final class ObjectUtils {
    ObjectUtils() {
    }

    public static byte[] asArray(byte... bArr) {
        return bArr;
    }

    public static char[] asArray(char... cArr) {
        return cArr;
    }

    public static double[] asArray(double... dArr) {
        return dArr;
    }

    public static float[] asArray(float... fArr) {
        return fArr;
    }

    public static int[] asArray(int... iArr) {
        return iArr;
    }

    public static long[] asArray(long... jArr) {
        return jArr;
    }

    public static short[] asArray(short... sArr) {
        return sArr;
    }

    public static boolean[] asArray(boolean... zArr) {
        return zArr;
    }

    @SafeVarargs
    public static <T> T[] asArrayOf(T... tArr) {
        return tArr;
    }

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object obj) {
        return obj;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static boolean isEmpty(char[] cArr) {
        return cArr == null || cArr.length == 0;
    }

    public static boolean isEmpty(double[] dArr) {
        return dArr == null || dArr.length == 0;
    }

    public static boolean isEmpty(float[] fArr) {
        return fArr == null || fArr.length == 0;
    }

    public static boolean isEmpty(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    public static boolean isEmpty(long[] jArr) {
        return jArr == null || jArr.length == 0;
    }

    public static <T> boolean isEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static boolean isEmpty(short[] sArr) {
        return sArr == null || sArr.length == 0;
    }

    public static boolean isEmpty(boolean[] zArr) {
        return zArr == null || zArr.length == 0;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String notEmpty(String str) {
        if (!isEmpty(str)) {
            return str.trim();
        }
        throw new IllegalArgumentException();
    }

    public static byte[] notEmpty(byte[] bArr) {
        if (!isEmpty(bArr)) {
            return bArr;
        }
        throw new IllegalArgumentException(Arrays.toString(bArr));
    }

    public static char[] notEmpty(char[] cArr) {
        if (!isEmpty(cArr)) {
            return cArr;
        }
        throw new IllegalArgumentException(Arrays.toString(cArr));
    }

    public static double[] notEmpty(double[] dArr) {
        if (!isEmpty(dArr)) {
            return dArr;
        }
        throw new IllegalArgumentException(Arrays.toString(dArr));
    }

    public static float[] notEmpty(float[] fArr) {
        if (!isEmpty(fArr)) {
            return fArr;
        }
        throw new IllegalArgumentException(Arrays.toString(fArr));
    }

    public static int[] notEmpty(int[] iArr) {
        if (!isEmpty(iArr)) {
            return iArr;
        }
        throw new IllegalArgumentException(Arrays.toString(iArr));
    }

    public static long[] notEmpty(long[] jArr) {
        if (!isEmpty(jArr)) {
            return jArr;
        }
        throw new IllegalArgumentException(Arrays.toString(jArr));
    }

    public static <T> T[] notEmpty(T[] tArr) {
        if (!isEmpty(tArr)) {
            return tArr;
        }
        throw new IllegalArgumentException(Arrays.toString(tArr));
    }

    public static short[] notEmpty(short[] sArr) {
        if (!isEmpty(sArr)) {
            return sArr;
        }
        throw new IllegalArgumentException(Arrays.toString(sArr));
    }

    public static boolean[] notEmpty(boolean[] zArr) {
        if (!isEmpty(zArr)) {
            return zArr;
        }
        throw new IllegalArgumentException(Arrays.toString(zArr));
    }

    public static <T> T notNull(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException();
    }
}
