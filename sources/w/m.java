package w;

import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

/* compiled from: XFMFile */
public final class m implements Source {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSource f2734a;

    /* renamed from: b  reason: collision with root package name */
    public int f2735b;

    /* renamed from: c  reason: collision with root package name */
    public byte f2736c;

    /* renamed from: d  reason: collision with root package name */
    public int f2737d;

    /* renamed from: e  reason: collision with root package name */
    public int f2738e;

    /* renamed from: f  reason: collision with root package name */
    public short f2739f;

    public m(BufferedSource bufferedSource) {
        this.f2734a = bufferedSource;
    }

    public final void close() {
    }

    public final long read(Buffer buffer, long j2) {
        int i2;
        int readInt;
        do {
            int i3 = this.f2738e;
            BufferedSource bufferedSource = this.f2734a;
            if (i3 == 0) {
                bufferedSource.skip((long) this.f2739f);
                this.f2739f = 0;
                if ((this.f2736c & 4) != 0) {
                    return -1;
                }
                i2 = this.f2737d;
                byte readByte = ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8) | (bufferedSource.readByte() & 255);
                this.f2738e = readByte;
                this.f2735b = readByte;
                byte readByte2 = (byte) (bufferedSource.readByte() & 255);
                this.f2736c = (byte) (bufferedSource.readByte() & 255);
                Logger logger = n.f2740e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Http2.a(true, this.f2737d, this.f2735b, readByte2, this.f2736c));
                }
                readInt = bufferedSource.readInt() & Integer.MAX_VALUE;
                this.f2737d = readInt;
                if (readByte2 != 9) {
                    Http2.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte2));
                    throw null;
                }
            } else {
                long read = bufferedSource.read(buffer, Math.min(j2, (long) i3));
                if (read == -1) {
                    return -1;
                }
                this.f2738e = (int) (((long) this.f2738e) - read);
                return read;
            }
        } while (readInt == i2);
        Http2.b("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    public final Timeout timeout() {
        return this.f2734a.timeout();
    }
}
