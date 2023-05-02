package z;

import java.io.IOException;
import java.io.OutputStream;
import okio.Buffer;
import okio.BufferedSink;

/* compiled from: XFMFile */
public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2831a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BufferedSink f2832b;

    public /* synthetic */ c(BufferedSink bufferedSink, int i2) {
        this.f2831a = i2;
        this.f2832b = bufferedSink;
    }

    public final void close() {
        switch (this.f2831a) {
            case 0:
                return;
            default:
                ((g) this.f2832b).close();
                return;
        }
    }

    public final void flush() {
        switch (this.f2831a) {
            case 0:
                return;
            default:
                g gVar = (g) this.f2832b;
                if (!gVar.f2837c) {
                    gVar.flush();
                    return;
                }
                return;
        }
    }

    public final String toString() {
        int i2 = this.f2831a;
        BufferedSink bufferedSink = this.f2832b;
        switch (i2) {
            case 0:
                return ((Buffer) bufferedSink) + ".outputStream()";
            default:
                return ((g) bufferedSink) + ".outputStream()";
        }
    }

    public final void write(int i2) {
        int i3 = this.f2831a;
        BufferedSink bufferedSink = this.f2832b;
        switch (i3) {
            case 0:
                ((Buffer) bufferedSink).writeByte((int) (byte) i2);
                return;
            default:
                g gVar = (g) bufferedSink;
                if (!gVar.f2837c) {
                    gVar.f2835a.writeByte((int) (byte) i2);
                    gVar.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
        }
    }

    public final void write(byte[] bArr, int i2, int i3) {
        int i4 = this.f2831a;
        BufferedSink bufferedSink = this.f2832b;
        switch (i4) {
            case 0:
                ((Buffer) bufferedSink).write(bArr, i2, i3);
                return;
            default:
                g gVar = (g) bufferedSink;
                if (!gVar.f2837c) {
                    gVar.f2835a.write(bArr, i2, i3);
                    gVar.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
        }
    }
}
