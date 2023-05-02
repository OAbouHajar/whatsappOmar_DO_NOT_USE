package X;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.0JA  reason: invalid class name */
public class AnonymousClass0JA extends InputStream implements DataInput {
    public static final ByteOrder A04 = ByteOrder.BIG_ENDIAN;
    public static final ByteOrder A05 = ByteOrder.LITTLE_ENDIAN;
    public int A00;
    public ByteOrder A01;
    public byte[] A02;
    public final DataInputStream A03;

    public AnonymousClass0JA(InputStream inputStream, ByteOrder byteOrder) {
        this.A01 = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A03 = dataInputStream;
        dataInputStream.mark(0);
        this.A00 = 0;
        this.A01 = byteOrder;
    }

    public AnonymousClass0JA(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public void A00(int i2) {
        int i3 = 0;
        while (i3 < i2) {
            DataInputStream dataInputStream = this.A03;
            int i4 = i2 - i3;
            int skip = (int) dataInputStream.skip((long) i4);
            if (skip <= 0) {
                byte[] bArr = this.A02;
                if (bArr == null) {
                    bArr = new byte[8192];
                    this.A02 = bArr;
                }
                skip = dataInputStream.read(bArr, 0, Math.min(8192, i4));
                if (skip == -1) {
                    StringBuilder A0r = AnonymousClass000.A0r("Reached EOF while skipping ");
                    A0r.append(i2);
                    throw new EOFException(AnonymousClass000.A0h(" bytes.", A0r));
                }
            }
            i3 += skip;
        }
        this.A00 += i3;
    }

    public int available() {
        return this.A03.available();
    }

    public void mark(int i2) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    public int read() {
        this.A00++;
        return this.A03.read();
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = this.A03.read(bArr, i2, i3);
        this.A00 += read;
        return read;
    }

    public boolean readBoolean() {
        this.A00++;
        return this.A03.readBoolean();
    }

    public byte readByte() {
        this.A00++;
        int read = this.A03.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public char readChar() {
        this.A00 += 2;
        return this.A03.readChar();
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public void readFully(byte[] bArr) {
        this.A00 += bArr.length;
        this.A03.readFully(bArr);
    }

    public void readFully(byte[] bArr, int i2, int i3) {
        this.A00 += i3;
        this.A03.readFully(bArr, i2, i3);
    }

    public int readInt() {
        this.A00 += 4;
        DataInputStream dataInputStream = this.A03;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.A01;
            if (byteOrder == A05) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == A04) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException(AnonymousClass000.A0g("Invalid byte order: ", byteOrder));
        }
        throw new EOFException();
    }

    public String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public long readLong() {
        long j2;
        long j3;
        this.A00 += 8;
        DataInputStream dataInputStream = this.A03;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.A01;
            if (byteOrder == A05) {
                j2 = (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8);
                j3 = (long) read;
            } else if (byteOrder == A04) {
                j2 = (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8);
                j3 = (long) read8;
            } else {
                throw new IOException(AnonymousClass000.A0g("Invalid byte order: ", byteOrder));
            }
            return j2 + j3;
        }
        throw new EOFException();
    }

    public short readShort() {
        int i2;
        this.A00 += 2;
        DataInputStream dataInputStream = this.A03;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.A01;
            if (byteOrder == A05) {
                i2 = (read2 << 8) + read;
            } else if (byteOrder == A04) {
                i2 = (read << 8) + read2;
            } else {
                throw new IOException(AnonymousClass000.A0g("Invalid byte order: ", byteOrder));
            }
            return (short) i2;
        }
        throw new EOFException();
    }

    public String readUTF() {
        this.A00 += 2;
        return this.A03.readUTF();
    }

    public int readUnsignedByte() {
        this.A00++;
        return this.A03.readUnsignedByte();
    }

    public int readUnsignedShort() {
        this.A00 += 2;
        DataInputStream dataInputStream = this.A03;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.A01;
            if (byteOrder == A05) {
                return (read2 << 8) + read;
            }
            if (byteOrder == A04) {
                return (read << 8) + read2;
            }
            throw new IOException(AnonymousClass000.A0g("Invalid byte order: ", byteOrder));
        }
        throw new EOFException();
    }

    public void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public int skipBytes(int i2) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }
}
