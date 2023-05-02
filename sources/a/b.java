package a;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: XFMFile */
public final class b extends InputStream implements DataInput {

    /* renamed from: e  reason: collision with root package name */
    public static final ByteOrder f156e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f  reason: collision with root package name */
    public static final ByteOrder f157f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a  reason: collision with root package name */
    public final DataInputStream f158a;

    /* renamed from: b  reason: collision with root package name */
    public ByteOrder f159b;

    /* renamed from: c  reason: collision with root package name */
    public final int f160c;

    /* renamed from: d  reason: collision with root package name */
    public int f161d;

    public b(InputStream inputStream) {
        this.f159b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f158a = dataInputStream;
        int available = dataInputStream.available();
        this.f160c = available;
        this.f161d = 0;
        dataInputStream.mark(available);
    }

    public b(byte[] bArr) {
        this((InputStream) new ByteArrayInputStream(bArr));
    }

    public final void a(long j2) {
        int i2 = this.f161d;
        if (((long) i2) > j2) {
            this.f161d = 0;
            DataInputStream dataInputStream = this.f158a;
            dataInputStream.reset();
            dataInputStream.mark(this.f160c);
        } else {
            j2 -= (long) i2;
        }
        int i3 = (int) j2;
        if (skipBytes(i3) != i3) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public final int available() {
        return this.f158a.available();
    }

    public final int read() {
        this.f161d++;
        return this.f158a.read();
    }

    public final int read(byte[] bArr, int i2, int i3) {
        int read = this.f158a.read(bArr, i2, i3);
        this.f161d += read;
        return read;
    }

    public final boolean readBoolean() {
        this.f161d++;
        return this.f158a.readBoolean();
    }

    public final byte readByte() {
        int i2 = this.f161d + 1;
        this.f161d = i2;
        if (i2 <= this.f160c) {
            int read = this.f158a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.f161d += 2;
        return this.f158a.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        int length = this.f161d + bArr.length;
        this.f161d = length;
        if (length > this.f160c) {
            throw new EOFException();
        } else if (this.f158a.read(bArr, 0, bArr.length) != bArr.length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final void readFully(byte[] bArr, int i2, int i3) {
        int i4 = this.f161d + i3;
        this.f161d = i4;
        if (i4 > this.f160c) {
            throw new EOFException();
        } else if (this.f158a.read(bArr, i2, i3) != i3) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final int readInt() {
        int i2 = this.f161d + 4;
        this.f161d = i2;
        if (i2 <= this.f160c) {
            DataInputStream dataInputStream = this.f158a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f159b;
                if (byteOrder == f156e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f157f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f159b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public final long readLong() {
        int i2 = this.f161d + 8;
        this.f161d = i2;
        if (i2 <= this.f160c) {
            DataInputStream dataInputStream = this.f158a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f159b;
                if (byteOrder == f156e) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i3 = read;
                if (byteOrder == f157f) {
                    return (((long) i3) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f159b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final short readShort() {
        int i2 = this.f161d + 2;
        this.f161d = i2;
        if (i2 <= this.f160c) {
            DataInputStream dataInputStream = this.f158a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f159b;
                if (byteOrder == f156e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f157f) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f159b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.f161d += 2;
        return this.f158a.readUTF();
    }

    public final int readUnsignedByte() {
        this.f161d++;
        return this.f158a.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        int i2 = this.f161d + 2;
        this.f161d = i2;
        if (i2 <= this.f160c) {
            DataInputStream dataInputStream = this.f158a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f159b;
                if (byteOrder == f156e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f157f) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f159b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final int skipBytes(int i2) {
        int min = Math.min(i2, this.f160c - this.f161d);
        int i3 = 0;
        while (i3 < min) {
            i3 += this.f158a.skipBytes(min - i3);
        }
        this.f161d += i3;
        return i3;
    }
}
