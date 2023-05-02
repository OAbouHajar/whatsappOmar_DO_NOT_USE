package org.apache.commons.io;

import android.support.v4.view.MotionEventCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EndianUtils {
    private static int read(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (-1 != read) {
            return read;
        }
        throw new EOFException("Unexpected EOF reached");
    }

    public static double readSwappedDouble(InputStream inputStream) throws IOException {
        return Double.longBitsToDouble(readSwappedLong(inputStream));
    }

    public static double readSwappedDouble(byte[] bArr, int i2) {
        return Double.longBitsToDouble(readSwappedLong(bArr, i2));
    }

    public static float readSwappedFloat(InputStream inputStream) throws IOException {
        return Float.intBitsToFloat(readSwappedInteger(inputStream));
    }

    public static float readSwappedFloat(byte[] bArr, int i2) {
        return Float.intBitsToFloat(readSwappedInteger(bArr, i2));
    }

    public static int readSwappedInteger(InputStream inputStream) throws IOException {
        return ((read(inputStream) & MotionEventCompat.ACTION_MASK) << 0) + ((read(inputStream) & MotionEventCompat.ACTION_MASK) << 8) + ((read(inputStream) & MotionEventCompat.ACTION_MASK) << 16) + ((read(inputStream) & MotionEventCompat.ACTION_MASK) << 24);
    }

    public static int readSwappedInteger(byte[] bArr, int i2) {
        return ((bArr[i2 + 0] & 255) << 0) + ((bArr[i2 + 1] & 255) << 8) + ((bArr[i2 + 2] & 255) << 16) + ((bArr[i2 + 3] & 255) << 24);
    }

    public static long readSwappedLong(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2] = (byte) read(inputStream);
        }
        return readSwappedLong(bArr, 0);
    }

    public static long readSwappedLong(byte[] bArr, int i2) {
        return (((long) (((((bArr[i2 + 4] & 255) << 0) + ((bArr[i2 + 5] & 255) << 8)) + ((bArr[i2 + 6] & 255) << 16)) + ((bArr[i2 + 7] & 255) << 24))) << 32) + (4294967295L & ((long) (((bArr[i2 + 0] & 255) << 0) + ((bArr[i2 + 1] & 255) << 8) + ((bArr[i2 + 2] & 255) << 16) + ((bArr[i2 + 3] & 255) << 24))));
    }

    public static short readSwappedShort(InputStream inputStream) throws IOException {
        return (short) (((read(inputStream) & MotionEventCompat.ACTION_MASK) << 0) + ((read(inputStream) & MotionEventCompat.ACTION_MASK) << 8));
    }

    public static short readSwappedShort(byte[] bArr, int i2) {
        return (short) (((bArr[i2 + 0] & 255) << 0) + ((bArr[i2 + 1] & 255) << 8));
    }

    public static long readSwappedUnsignedInteger(InputStream inputStream) throws IOException {
        int read = read(inputStream);
        int read2 = read(inputStream);
        int read3 = read(inputStream);
        return (((long) (read(inputStream) & MotionEventCompat.ACTION_MASK)) << 24) + (4294967295L & ((long) (((read & MotionEventCompat.ACTION_MASK) << 0) + ((read2 & MotionEventCompat.ACTION_MASK) << 8) + ((read3 & MotionEventCompat.ACTION_MASK) << 16))));
    }

    public static long readSwappedUnsignedInteger(byte[] bArr, int i2) {
        return (((long) (bArr[i2 + 3] & 255)) << 24) + (4294967295L & ((long) (((bArr[i2 + 0] & 255) << 0) + ((bArr[i2 + 1] & 255) << 8) + ((bArr[i2 + 2] & 255) << 16))));
    }

    public static int readSwappedUnsignedShort(InputStream inputStream) throws IOException {
        return ((read(inputStream) & MotionEventCompat.ACTION_MASK) << 0) + ((read(inputStream) & MotionEventCompat.ACTION_MASK) << 8);
    }

    public static int readSwappedUnsignedShort(byte[] bArr, int i2) {
        return ((bArr[i2 + 0] & 255) << 0) + ((bArr[i2 + 1] & 255) << 8);
    }

    public static double swapDouble(double d2) {
        return Double.longBitsToDouble(swapLong(Double.doubleToLongBits(d2)));
    }

    public static float swapFloat(float f2) {
        return Float.intBitsToFloat(swapInteger(Float.floatToIntBits(f2)));
    }

    public static int swapInteger(int i2) {
        return (((i2 >> 0) & MotionEventCompat.ACTION_MASK) << 24) + (((i2 >> 8) & MotionEventCompat.ACTION_MASK) << 16) + (((i2 >> 16) & MotionEventCompat.ACTION_MASK) << 8) + (((i2 >> 24) & MotionEventCompat.ACTION_MASK) << 0);
    }

    public static long swapLong(long j2) {
        return (((j2 >> 0) & 255) << 56) + (((j2 >> 8) & 255) << 48) + (((j2 >> 16) & 255) << 40) + (((j2 >> 24) & 255) << 32) + (((j2 >> 32) & 255) << 24) + (((j2 >> 40) & 255) << 16) + (((j2 >> 48) & 255) << 8) + ((255 & (j2 >> 56)) << 0);
    }

    public static short swapShort(short s2) {
        return (short) ((((s2 >> 0) & MotionEventCompat.ACTION_MASK) << 8) + (((s2 >> 8) & MotionEventCompat.ACTION_MASK) << 0));
    }

    public static void writeSwappedDouble(OutputStream outputStream, double d2) throws IOException {
        writeSwappedLong(outputStream, Double.doubleToLongBits(d2));
    }

    public static void writeSwappedDouble(byte[] bArr, int i2, double d2) {
        writeSwappedLong(bArr, i2, Double.doubleToLongBits(d2));
    }

    public static void writeSwappedFloat(OutputStream outputStream, float f2) throws IOException {
        writeSwappedInteger(outputStream, Float.floatToIntBits(f2));
    }

    public static void writeSwappedFloat(byte[] bArr, int i2, float f2) {
        writeSwappedInteger(bArr, i2, Float.floatToIntBits(f2));
    }

    public static void writeSwappedInteger(OutputStream outputStream, int i2) throws IOException {
        outputStream.write((byte) ((i2 >> 0) & MotionEventCompat.ACTION_MASK));
        outputStream.write((byte) ((i2 >> 8) & MotionEventCompat.ACTION_MASK));
        outputStream.write((byte) ((i2 >> 16) & MotionEventCompat.ACTION_MASK));
        outputStream.write((byte) ((i2 >> 24) & MotionEventCompat.ACTION_MASK));
    }

    public static void writeSwappedInteger(byte[] bArr, int i2, int i3) {
        bArr[i2 + 0] = (byte) ((i3 >> 0) & MotionEventCompat.ACTION_MASK);
        bArr[i2 + 1] = (byte) ((i3 >> 8) & MotionEventCompat.ACTION_MASK);
        bArr[i2 + 2] = (byte) ((i3 >> 16) & MotionEventCompat.ACTION_MASK);
        bArr[i2 + 3] = (byte) ((i3 >> 24) & MotionEventCompat.ACTION_MASK);
    }

    public static void writeSwappedLong(OutputStream outputStream, long j2) throws IOException {
        outputStream.write((byte) ((int) ((j2 >> 0) & 255)));
        outputStream.write((byte) ((int) ((j2 >> 8) & 255)));
        outputStream.write((byte) ((int) ((j2 >> 16) & 255)));
        outputStream.write((byte) ((int) ((j2 >> 24) & 255)));
        outputStream.write((byte) ((int) ((j2 >> 32) & 255)));
        outputStream.write((byte) ((int) ((j2 >> 40) & 255)));
        outputStream.write((byte) ((int) ((j2 >> 48) & 255)));
        outputStream.write((byte) ((int) ((j2 >> 56) & 255)));
    }

    public static void writeSwappedLong(byte[] bArr, int i2, long j2) {
        bArr[i2 + 0] = (byte) ((int) ((j2 >> 0) & 255));
        bArr[i2 + 1] = (byte) ((int) ((j2 >> 8) & 255));
        bArr[i2 + 2] = (byte) ((int) ((j2 >> 16) & 255));
        bArr[i2 + 3] = (byte) ((int) ((j2 >> 24) & 255));
        bArr[i2 + 4] = (byte) ((int) ((j2 >> 32) & 255));
        bArr[i2 + 5] = (byte) ((int) ((j2 >> 40) & 255));
        bArr[i2 + 6] = (byte) ((int) ((j2 >> 48) & 255));
        bArr[i2 + 7] = (byte) ((int) ((j2 >> 56) & 255));
    }

    public static void writeSwappedShort(OutputStream outputStream, short s2) throws IOException {
        outputStream.write((byte) ((s2 >> 0) & MotionEventCompat.ACTION_MASK));
        outputStream.write((byte) ((s2 >> 8) & MotionEventCompat.ACTION_MASK));
    }

    public static void writeSwappedShort(byte[] bArr, int i2, short s2) {
        bArr[i2 + 0] = (byte) ((s2 >> 0) & MotionEventCompat.ACTION_MASK);
        bArr[i2 + 1] = (byte) ((s2 >> 8) & MotionEventCompat.ACTION_MASK);
    }
}
