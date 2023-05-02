package z;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* compiled from: XFMFile */
public final class g implements BufferedSink {

    /* renamed from: a  reason: collision with root package name */
    public final Buffer f2835a = new Buffer();

    /* renamed from: b  reason: collision with root package name */
    public final Sink f2836b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2837c;

    public g(Sink sink) {
        if (sink != null) {
            this.f2836b = sink;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public final Buffer buffer() {
        return this.f2835a;
    }

    public final void close() {
        Sink sink = this.f2836b;
        if (!this.f2837c) {
            try {
                Buffer buffer = this.f2835a;
                long j2 = buffer.f2324b;
                if (j2 > 0) {
                    sink.write(buffer, j2);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                sink.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f2837c = true;
            if (th != null) {
                Charset charset = m.f2858a;
                throw th;
            }
        }
    }

    public final BufferedSink emit() {
        if (!this.f2837c) {
            Buffer buffer = this.f2835a;
            long size = buffer.size();
            if (size > 0) {
                this.f2836b.write(buffer, size);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink emitCompleteSegments() {
        if (!this.f2837c) {
            Buffer buffer = this.f2835a;
            long completeSegmentByteCount = buffer.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                this.f2836b.write(buffer, completeSegmentByteCount);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.f2837c) {
            Buffer buffer = this.f2835a;
            long j2 = buffer.f2324b;
            Sink sink = this.f2836b;
            if (j2 > 0) {
                sink.write(buffer, j2);
            }
            sink.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f2837c;
    }

    public final OutputStream outputStream() {
        return new c(this, 1);
    }

    public final Timeout timeout() {
        return this.f2836b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f2836b + ")";
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.f2837c) {
            int write = this.f2835a.write(byteBuffer);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink write(ByteString byteString) {
        if (!this.f2837c) {
            this.f2835a.write(byteString);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink write(Source source, long j2) {
        while (j2 > 0) {
            long read = source.read(this.f2835a, j2);
            if (read != -1) {
                j2 -= read;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public final BufferedSink write(byte[] bArr) {
        if (!this.f2837c) {
            this.f2835a.write(bArr);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink write(byte[] bArr, int i2, int i3) {
        if (!this.f2837c) {
            this.f2835a.write(bArr, i2, i3);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void write(Buffer buffer, long j2) {
        if (!this.f2837c) {
            this.f2835a.write(buffer, j2);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final long writeAll(Source source) {
        if (source != null) {
            long j2 = 0;
            while (true) {
                long read = source.read(this.f2835a, 8192);
                if (read == -1) {
                    return j2;
                }
                j2 += read;
                emitCompleteSegments();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final BufferedSink writeByte(int i2) {
        if (!this.f2837c) {
            this.f2835a.writeByte(i2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeDecimalLong(long j2) {
        if (!this.f2837c) {
            this.f2835a.writeDecimalLong(j2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeHexadecimalUnsignedLong(long j2) {
        if (!this.f2837c) {
            this.f2835a.writeHexadecimalUnsignedLong(j2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeInt(int i2) {
        if (!this.f2837c) {
            this.f2835a.writeInt(i2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeIntLe(int i2) {
        if (!this.f2837c) {
            this.f2835a.writeIntLe(i2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeLong(long j2) {
        if (!this.f2837c) {
            this.f2835a.writeLong(j2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeLongLe(long j2) {
        if (!this.f2837c) {
            this.f2835a.writeLongLe(j2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeShort(int i2) {
        if (!this.f2837c) {
            this.f2835a.writeShort(i2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeShortLe(int i2) {
        if (!this.f2837c) {
            this.f2835a.writeShortLe(i2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeString(String str, int i2, int i3, Charset charset) {
        if (!this.f2837c) {
            this.f2835a.writeString(str, i2, i3, charset);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeString(String str, Charset charset) {
        if (!this.f2837c) {
            this.f2835a.writeString(str, charset);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeUtf8(String str) {
        if (!this.f2837c) {
            this.f2835a.writeUtf8(str);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeUtf8(String str, int i2, int i3) {
        if (!this.f2837c) {
            this.f2835a.writeUtf8(str, i2, i3);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final BufferedSink writeUtf8CodePoint(int i2) {
        if (!this.f2837c) {
            this.f2835a.writeUtf8CodePoint(i2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
