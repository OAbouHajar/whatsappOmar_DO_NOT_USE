package z;

import java.io.IOException;
import java.io.InputStream;
import okio.Buffer;
import okio.BufferedSource;

/* compiled from: XFMFile */
public final class d extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2833a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BufferedSource f2834b;

    public /* synthetic */ d(BufferedSource bufferedSource, int i2) {
        this.f2833a = i2;
        this.f2834b = bufferedSource;
    }

    public final int available() {
        long min;
        int i2 = this.f2833a;
        BufferedSource bufferedSource = this.f2834b;
        switch (i2) {
            case 0:
                min = Math.min(((Buffer) bufferedSource).f2324b, 2147483647L);
                break;
            default:
                h hVar = (h) bufferedSource;
                if (!hVar.f2840c) {
                    min = Math.min(hVar.f2838a.f2324b, 2147483647L);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) min;
    }

    public final void close() {
        switch (this.f2833a) {
            case 0:
                return;
            default:
                ((h) this.f2834b).close();
                return;
        }
    }

    public final int read() {
        int i2 = this.f2833a;
        BufferedSource bufferedSource = this.f2834b;
        switch (i2) {
            case 0:
                Buffer buffer = (Buffer) bufferedSource;
                if (buffer.f2324b > 0) {
                    return buffer.readByte() & 255;
                }
                return -1;
            default:
                h hVar = (h) bufferedSource;
                if (!hVar.f2840c) {
                    Buffer buffer2 = hVar.f2838a;
                    if (buffer2.f2324b == 0 && hVar.f2839b.read(buffer2, 8192) == -1) {
                        return -1;
                    }
                    return buffer2.readByte() & 255;
                }
                throw new IOException("closed");
        }
    }

    public final int read(byte[] bArr, int i2, int i3) {
        int i4 = this.f2833a;
        BufferedSource bufferedSource = this.f2834b;
        switch (i4) {
            case 0:
                return ((Buffer) bufferedSource).read(bArr, i2, i3);
            default:
                h hVar = (h) bufferedSource;
                if (!hVar.f2840c) {
                    m.b((long) bArr.length, (long) i2, (long) i3);
                    Buffer buffer = hVar.f2838a;
                    if (buffer.f2324b == 0 && hVar.f2839b.read(buffer, 8192) == -1) {
                        return -1;
                    }
                    return buffer.read(bArr, i2, i3);
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        int i2 = this.f2833a;
        BufferedSource bufferedSource = this.f2834b;
        switch (i2) {
            case 0:
                return ((Buffer) bufferedSource) + ".inputStream()";
            default:
                return ((h) bufferedSource) + ".inputStream()";
        }
    }
}
