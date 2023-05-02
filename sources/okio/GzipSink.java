package okio;

import a.a;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import z.i;
import z.m;

/* compiled from: XFMFile */
public final class GzipSink implements Sink {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSink f2336a;

    /* renamed from: b  reason: collision with root package name */
    public final Deflater f2337b;

    /* renamed from: c  reason: collision with root package name */
    public final DeflaterSink f2338c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2339d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f2340e = new CRC32();

    public GzipSink(Sink sink) {
        if (sink != null) {
            Deflater deflater = new Deflater(-1, true);
            this.f2337b = deflater;
            BufferedSink buffer = Okio.buffer(sink);
            this.f2336a = buffer;
            this.f2338c = new DeflaterSink(buffer, deflater);
            Buffer buffer2 = buffer.buffer();
            buffer2.writeShort(8075);
            buffer2.writeByte(8);
            buffer2.writeByte(0);
            buffer2.writeInt(0);
            buffer2.writeByte(0);
            buffer2.writeByte(0);
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public void close() {
        Deflater deflater = this.f2337b;
        BufferedSink bufferedSink = this.f2336a;
        if (!this.f2339d) {
            try {
                DeflaterSink deflaterSink = this.f2338c;
                deflaterSink.f2331b.finish();
                deflaterSink.a(false);
                bufferedSink.writeIntLe((int) this.f2340e.getValue());
                bufferedSink.writeIntLe((int) deflater.getBytesRead());
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                deflater.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                bufferedSink.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f2339d = true;
            if (th != null) {
                Charset charset = m.f2858a;
                throw th;
            }
        }
    }

    public Deflater deflater() {
        return this.f2337b;
    }

    public void flush() {
        this.f2338c.flush();
    }

    public Timeout timeout() {
        return this.f2336a.timeout();
    }

    public void write(Buffer buffer, long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException(a.e("byteCount < 0: ", j2));
        } else if (i2 != 0) {
            i iVar = buffer.f2323a;
            long j3 = j2;
            while (j3 > 0) {
                int min = (int) Math.min(j3, (long) (iVar.f2843c - iVar.f2842b));
                this.f2340e.update(iVar.f2841a, iVar.f2842b, min);
                j3 -= (long) min;
                iVar = iVar.f2846f;
            }
            this.f2338c.write(buffer, j2);
        }
    }
}
