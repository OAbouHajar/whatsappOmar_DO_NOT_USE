package z;

import a.a;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* compiled from: XFMFile */
public final class h implements BufferedSource {

    /* renamed from: a  reason: collision with root package name */
    public final Buffer f2838a = new Buffer();

    /* renamed from: b  reason: collision with root package name */
    public final Source f2839b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2840c;

    public h(Source source) {
        if (source != null) {
            this.f2839b = source;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final Buffer buffer() {
        return this.f2838a;
    }

    public final void close() {
        if (!this.f2840c) {
            this.f2840c = true;
            this.f2839b.close();
            this.f2838a.clear();
        }
    }

    public final boolean exhausted() {
        if (!this.f2840c) {
            Buffer buffer = this.f2838a;
            return buffer.exhausted() && this.f2839b.read(buffer, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public final long indexOf(byte b2) {
        return indexOf(b2, 0, Long.MAX_VALUE);
    }

    public final long indexOf(byte b2, long j2) {
        return indexOf(b2, j2, Long.MAX_VALUE);
    }

    public final long indexOf(byte b2, long j2, long j3) {
        if (this.f2840c) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j2), Long.valueOf(j3)}));
        } else {
            while (j2 < j3) {
                long indexOf = this.f2838a.indexOf(b2, j2, j3);
                if (indexOf == -1) {
                    Buffer buffer = this.f2838a;
                    long j4 = buffer.f2324b;
                    if (j4 >= j3 || this.f2839b.read(buffer, 8192) == -1) {
                        break;
                    }
                    j2 = Math.max(j2, j4);
                } else {
                    return indexOf;
                }
            }
            return -1;
        }
    }

    public final long indexOf(ByteString byteString) {
        return indexOf(byteString, 0);
    }

    public final long indexOf(ByteString byteString, long j2) {
        if (!this.f2840c) {
            while (true) {
                Buffer buffer = this.f2838a;
                long indexOf = buffer.indexOf(byteString, j2);
                if (indexOf != -1) {
                    return indexOf;
                }
                long j3 = buffer.f2324b;
                if (this.f2839b.read(buffer, 8192) == -1) {
                    return -1;
                }
                j2 = Math.max(j2, (j3 - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final long indexOfElement(ByteString byteString) {
        return indexOfElement(byteString, 0);
    }

    public final long indexOfElement(ByteString byteString, long j2) {
        if (!this.f2840c) {
            while (true) {
                Buffer buffer = this.f2838a;
                long indexOfElement = buffer.indexOfElement(byteString, j2);
                if (indexOfElement != -1) {
                    return indexOfElement;
                }
                long j3 = buffer.f2324b;
                if (this.f2839b.read(buffer, 8192) == -1) {
                    return -1;
                }
                j2 = Math.max(j2, j3);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final InputStream inputStream() {
        return new d(this, 1);
    }

    public final boolean isOpen() {
        return !this.f2840c;
    }

    public final boolean rangeEquals(long j2, ByteString byteString) {
        return rangeEquals(j2, byteString, 0, byteString.size());
    }

    public final boolean rangeEquals(long j2, ByteString byteString, int i2, int i3) {
        if (this.f2840c) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0 || i2 < 0 || i3 < 0 || byteString.size() - i2 < i3) {
            return false;
        } else {
            for (int i4 = 0; i4 < i3; i4++) {
                long j3 = ((long) i4) + j2;
                if (!request(1 + j3) || this.f2838a.getByte(j3) != byteString.getByte(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        Buffer buffer = this.f2838a;
        if (buffer.f2324b == 0 && this.f2839b.read(buffer, 8192) == -1) {
            return -1;
        }
        return buffer.read(byteBuffer);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = (long) i3;
        m.b((long) bArr.length, (long) i2, j2);
        Buffer buffer = this.f2838a;
        if (buffer.f2324b == 0 && this.f2839b.read(buffer, 8192) == -1) {
            return -1;
        }
        return buffer.read(bArr, i2, (int) Math.min(j2, buffer.f2324b));
    }

    public final long read(Buffer buffer, long j2) {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 < 0) {
            throw new IllegalArgumentException(a.e("byteCount < 0: ", j2));
        } else if (!this.f2840c) {
            Buffer buffer2 = this.f2838a;
            if (buffer2.f2324b == 0 && this.f2839b.read(buffer2, 8192) == -1) {
                return -1;
            }
            return buffer2.read(buffer, Math.min(j2, buffer2.f2324b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final long readAll(Sink sink) {
        Buffer buffer;
        if (sink != null) {
            long j2 = 0;
            while (true) {
                Source source = this.f2839b;
                buffer = this.f2838a;
                if (source.read(buffer, 8192) == -1) {
                    break;
                }
                long completeSegmentByteCount = buffer.completeSegmentByteCount();
                if (completeSegmentByteCount > 0) {
                    j2 += completeSegmentByteCount;
                    sink.write(buffer, completeSegmentByteCount);
                }
            }
            if (buffer.size() <= 0) {
                return j2;
            }
            long size = j2 + buffer.size();
            sink.write(buffer, buffer.size());
            return size;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public final byte readByte() {
        require(1);
        return this.f2838a.readByte();
    }

    public final byte[] readByteArray() {
        Source source = this.f2839b;
        Buffer buffer = this.f2838a;
        buffer.writeAll(source);
        return buffer.readByteArray();
    }

    public final byte[] readByteArray(long j2) {
        require(j2);
        return this.f2838a.readByteArray(j2);
    }

    public final ByteString readByteString() {
        Source source = this.f2839b;
        Buffer buffer = this.f2838a;
        buffer.writeAll(source);
        return buffer.readByteString();
    }

    public final ByteString readByteString(long j2) {
        require(j2);
        return this.f2838a.readByteString(j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long readDecimalLong() {
        /*
            r7 = this;
            r0 = 1
            r7.require(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r7.request(r3)
            okio.Buffer r4 = r7.f2838a
            if (r3 == 0) goto L_0x0040
            long r5 = (long) r1
            byte r3 = r4.getByte(r5)
            r5 = 48
            if (r3 < r5) goto L_0x001f
            r5 = 57
            if (r3 <= r5) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r5 = 45
            if (r3 == r5) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            long r0 = r4.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.h.readDecimalLong():long");
    }

    public final void readFully(Buffer buffer, long j2) {
        Buffer buffer2 = this.f2838a;
        try {
            require(j2);
            buffer2.readFully(buffer, j2);
        } catch (EOFException e2) {
            buffer.writeAll(buffer2);
            throw e2;
        }
    }

    public final void readFully(byte[] bArr) {
        Buffer buffer = this.f2838a;
        try {
            require((long) bArr.length);
            buffer.readFully(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                long j2 = buffer.f2324b;
                if (j2 > 0) {
                    int read = buffer.read(bArr, i2, (int) j2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    public final long readHexadecimalUnsignedLong() {
        Buffer buffer;
        require(1);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            boolean request = request((long) i3);
            buffer = this.f2838a;
            if (!request) {
                break;
            }
            byte b2 = buffer.getByte((long) i2);
            if ((b2 >= 48 && b2 <= 57) || ((b2 >= 97 && b2 <= 102) || (b2 >= 65 && b2 <= 70))) {
                i2 = i3;
            } else if (i2 == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(b2)}));
            }
        }
        return buffer.readHexadecimalUnsignedLong();
    }

    public final int readInt() {
        require(4);
        return this.f2838a.readInt();
    }

    public final int readIntLe() {
        require(4);
        return this.f2838a.readIntLe();
    }

    public final long readLong() {
        require(8);
        return this.f2838a.readLong();
    }

    public final long readLongLe() {
        require(8);
        return this.f2838a.readLongLe();
    }

    public final short readShort() {
        require(2);
        return this.f2838a.readShort();
    }

    public final short readShortLe() {
        require(2);
        return this.f2838a.readShortLe();
    }

    public final String readString(long j2, Charset charset) {
        require(j2);
        if (charset != null) {
            return this.f2838a.readString(j2, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final String readString(Charset charset) {
        if (charset != null) {
            Source source = this.f2839b;
            Buffer buffer = this.f2838a;
            buffer.writeAll(source);
            return buffer.readString(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final String readUtf8() {
        Source source = this.f2839b;
        Buffer buffer = this.f2838a;
        buffer.writeAll(source);
        return buffer.readUtf8();
    }

    public final String readUtf8(long j2) {
        require(j2);
        return this.f2838a.readUtf8(j2);
    }

    public final int readUtf8CodePoint() {
        long j2;
        require(1);
        Buffer buffer = this.f2838a;
        byte b2 = buffer.getByte(0);
        if ((b2 & 224) == 192) {
            j2 = 2;
        } else if ((b2 & 240) == 224) {
            j2 = 3;
        } else {
            if ((b2 & 248) == 240) {
                j2 = 4;
            }
            return buffer.readUtf8CodePoint();
        }
        require(j2);
        return buffer.readUtf8CodePoint();
    }

    public final String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        Buffer buffer = this.f2838a;
        if (indexOf != -1) {
            return buffer.e(indexOf);
        }
        long j2 = buffer.f2324b;
        if (j2 != 0) {
            return readUtf8(j2);
        }
        return null;
    }

    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public final String readUtf8LineStrict(long j2) {
        long j3 = j2;
        if (j3 >= 0) {
            long j4 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
            long indexOf = indexOf((byte) 10, 0, j4);
            Buffer buffer = this.f2838a;
            if (indexOf != -1) {
                return buffer.e(indexOf);
            }
            if (j4 < Long.MAX_VALUE && request(j4) && buffer.getByte(j4 - 1) == 13 && request(1 + j4) && buffer.getByte(j4) == 10) {
                return buffer.e(j4);
            }
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0, Math.min(32, buffer.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j3) + " content=" + buffer2.readByteString().hex() + 8230);
        }
        throw new IllegalArgumentException(a.e("limit < 0: ", j3));
    }

    public final boolean request(long j2) {
        Buffer buffer;
        if (j2 < 0) {
            throw new IllegalArgumentException(a.e("byteCount < 0: ", j2));
        } else if (!this.f2840c) {
            do {
                buffer = this.f2838a;
                if (buffer.f2324b >= j2) {
                    return true;
                }
            } while (this.f2839b.read(buffer, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void require(long j2) {
        if (!request(j2)) {
            throw new EOFException();
        }
    }

    public final int select(Options options) {
        Buffer buffer;
        if (!this.f2840c) {
            do {
                buffer = this.f2838a;
                i iVar = buffer.f2323a;
                ByteString[] byteStringArr = options.f2355a;
                int length = byteStringArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    ByteString byteString = byteStringArr[i2];
                    int min = (int) Math.min(buffer.f2324b, (long) byteString.size());
                    if (min == 0 || Buffer.c(iVar, iVar.f2842b, byteString, 0, min)) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    return -1;
                }
                long size = (long) options.f2355a[i2].size();
                if (size <= buffer.f2324b) {
                    buffer.skip(size);
                    return i2;
                }
            } while (this.f2839b.read(buffer, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public final void skip(long j2) {
        if (!this.f2840c) {
            while (j2 > 0) {
                Buffer buffer = this.f2838a;
                if (buffer.f2324b == 0 && this.f2839b.read(buffer, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, buffer.size());
                buffer.skip(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final Timeout timeout() {
        return this.f2839b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f2839b + ")";
    }
}
