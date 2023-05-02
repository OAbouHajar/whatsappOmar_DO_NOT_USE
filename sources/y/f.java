package y;

import java.io.IOException;
import java.util.Random;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: XFMFile */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2815a;

    /* renamed from: b  reason: collision with root package name */
    public final Random f2816b;

    /* renamed from: c  reason: collision with root package name */
    public final BufferedSink f2817c;

    /* renamed from: d  reason: collision with root package name */
    public final Buffer f2818d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2819e;

    /* renamed from: f  reason: collision with root package name */
    public final Buffer f2820f = new Buffer();

    /* renamed from: g  reason: collision with root package name */
    public final e f2821g = new e(this);

    /* renamed from: h  reason: collision with root package name */
    public boolean f2822h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f2823i;

    /* renamed from: j  reason: collision with root package name */
    public final Buffer.UnsafeCursor f2824j;

    public f(boolean z2, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f2815a = z2;
            this.f2817c = bufferedSink;
            this.f2818d = bufferedSink.buffer();
            this.f2816b = random;
            Buffer.UnsafeCursor unsafeCursor = null;
            this.f2823i = z2 ? new byte[4] : null;
            this.f2824j = z2 ? new Buffer.UnsafeCursor() : unsafeCursor;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    public final void a(ByteString byteString, int i2) {
        if (!this.f2819e) {
            int size = byteString.size();
            if (((long) size) <= 125) {
                Buffer buffer = this.f2818d;
                buffer.writeByte(i2 | 128);
                if (this.f2815a) {
                    buffer.writeByte(size | 128);
                    Random random = this.f2816b;
                    byte[] bArr = this.f2823i;
                    random.nextBytes(bArr);
                    buffer.write(bArr);
                    if (size > 0) {
                        long size2 = buffer.size();
                        buffer.write(byteString);
                        Buffer.UnsafeCursor unsafeCursor = this.f2824j;
                        buffer.readAndWriteUnsafe(unsafeCursor);
                        unsafeCursor.seek(size2);
                        WebSocketProtocol.b(unsafeCursor, bArr);
                        unsafeCursor.close();
                    }
                } else {
                    buffer.writeByte(size);
                    buffer.write(byteString);
                }
                this.f2817c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public final void b(int i2, long j2, boolean z2, boolean z3) {
        if (!this.f2819e) {
            int i3 = 0;
            if (!z2) {
                i2 = 0;
            }
            if (z3) {
                i2 |= 128;
            }
            Buffer buffer = this.f2818d;
            buffer.writeByte(i2);
            boolean z4 = this.f2815a;
            if (z4) {
                i3 = 128;
            }
            if (j2 <= 125) {
                buffer.writeByte(((int) j2) | i3);
            } else if (j2 <= 65535) {
                buffer.writeByte(i3 | 126);
                buffer.writeShort((int) j2);
            } else {
                buffer.writeByte(i3 | 127);
                buffer.writeLong(j2);
            }
            Buffer buffer2 = this.f2820f;
            if (z4) {
                Random random = this.f2816b;
                byte[] bArr = this.f2823i;
                random.nextBytes(bArr);
                buffer.write(bArr);
                if (j2 > 0) {
                    long size = buffer.size();
                    buffer.write(buffer2, j2);
                    Buffer.UnsafeCursor unsafeCursor = this.f2824j;
                    buffer.readAndWriteUnsafe(unsafeCursor);
                    unsafeCursor.seek(size);
                    WebSocketProtocol.b(unsafeCursor, bArr);
                    unsafeCursor.close();
                }
            } else {
                buffer.write(buffer2, j2);
            }
            this.f2817c.emit();
            return;
        }
        throw new IOException("closed");
    }
}
