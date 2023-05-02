package y;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.WebSocketProtocol;
import okhttp3.internal.ws.WebSocketReader$FrameCallback;
import okio.Buffer;
import okio.BufferedSource;

/* compiled from: XFMFile */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2798a;

    /* renamed from: b  reason: collision with root package name */
    public final BufferedSource f2799b;

    /* renamed from: c  reason: collision with root package name */
    public final WebSocketReader$FrameCallback f2800c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2801d;

    /* renamed from: e  reason: collision with root package name */
    public int f2802e;

    /* renamed from: f  reason: collision with root package name */
    public long f2803f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2804g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2805h;

    /* renamed from: i  reason: collision with root package name */
    public final Buffer f2806i = new Buffer();

    /* renamed from: j  reason: collision with root package name */
    public final Buffer f2807j = new Buffer();

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f2808k;

    /* renamed from: l  reason: collision with root package name */
    public final Buffer.UnsafeCursor f2809l;

    public d(boolean z2, BufferedSource bufferedSource, WebSocketReader$FrameCallback webSocketReader$FrameCallback) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        } else if (webSocketReader$FrameCallback != null) {
            this.f2798a = z2;
            this.f2799b = bufferedSource;
            this.f2800c = webSocketReader$FrameCallback;
            Buffer.UnsafeCursor unsafeCursor = null;
            this.f2808k = z2 ? null : new byte[4];
            this.f2809l = !z2 ? new Buffer.UnsafeCursor() : unsafeCursor;
        } else {
            throw new NullPointerException("frameCallback == null");
        }
    }

    public final void a() {
        String str;
        short s2;
        long j2 = this.f2803f;
        Buffer buffer = this.f2806i;
        if (j2 > 0) {
            this.f2799b.readFully(buffer, j2);
            if (!this.f2798a) {
                Buffer.UnsafeCursor unsafeCursor = this.f2809l;
                buffer.readAndWriteUnsafe(unsafeCursor);
                unsafeCursor.seek(0);
                WebSocketProtocol.b(unsafeCursor, this.f2808k);
                unsafeCursor.close();
            }
        }
        int i2 = this.f2802e;
        WebSocketReader$FrameCallback webSocketReader$FrameCallback = this.f2800c;
        switch (i2) {
            case 8:
                long size = buffer.size();
                if (size != 1) {
                    if (size != 0) {
                        s2 = buffer.readShort();
                        str = buffer.readUtf8();
                        String a2 = WebSocketProtocol.a(s2);
                        if (a2 != null) {
                            throw new ProtocolException(a2);
                        }
                    } else {
                        s2 = 1005;
                        str = "";
                    }
                    webSocketReader$FrameCallback.onReadClose(s2, str);
                    this.f2801d = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                webSocketReader$FrameCallback.onReadPing(buffer.readByteString());
                return;
            case 10:
                webSocketReader$FrameCallback.onReadPong(buffer.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f2802e));
        }
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        if (!this.f2801d) {
            BufferedSource bufferedSource = this.f2799b;
            long timeoutNanos = bufferedSource.timeout().timeoutNanos();
            bufferedSource.timeout().clearTimeout();
            try {
                byte readByte = bufferedSource.readByte() & 255;
                bufferedSource.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.f2802e = readByte & 15;
                boolean z2 = true;
                boolean z3 = (readByte & 128) != 0;
                this.f2804g = z3;
                boolean z4 = (readByte & 8) != 0;
                this.f2805h = z4;
                if (!z4 || z3) {
                    boolean z5 = (readByte & 64) != 0;
                    boolean z6 = (readByte & 32) != 0;
                    boolean z7 = (readByte & 16) != 0;
                    if (z5 || z6 || z7) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    byte readByte2 = bufferedSource.readByte() & 255;
                    if ((readByte2 & 128) == 0) {
                        z2 = false;
                    }
                    boolean z8 = this.f2798a;
                    if (z2 == z8) {
                        throw new ProtocolException(z8 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    long j2 = (long) (readByte2 & Byte.MAX_VALUE);
                    this.f2803f = j2;
                    if (j2 == 126) {
                        this.f2803f = ((long) bufferedSource.readShort()) & 65535;
                    } else if (j2 == 127) {
                        long readLong = bufferedSource.readLong();
                        this.f2803f = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f2803f) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.f2805h && this.f2803f > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z2) {
                        bufferedSource.readFully(this.f2808k);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                bufferedSource.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }
}
