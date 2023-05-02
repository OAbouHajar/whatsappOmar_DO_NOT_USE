package okio;

import java.nio.charset.Charset;
import java.util.zip.Deflater;
import z.i;
import z.j;
import z.m;

/* compiled from: XFMFile */
public final class DeflaterSink implements Sink {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSink f2330a;

    /* renamed from: b  reason: collision with root package name */
    public final Deflater f2331b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2332c;

    public DeflaterSink(BufferedSink bufferedSink, Deflater deflater) {
        if (bufferedSink == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.f2330a = bufferedSink;
            this.f2331b = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public DeflaterSink(Sink sink, Deflater deflater) {
        this(Okio.buffer(sink), deflater);
    }

    public final void a(boolean z2) {
        i f2;
        BufferedSink bufferedSink = this.f2330a;
        Buffer buffer = bufferedSink.buffer();
        while (true) {
            f2 = buffer.f(1);
            Deflater deflater = this.f2331b;
            byte[] bArr = f2.f2841a;
            int i2 = f2.f2843c;
            int i3 = 8192 - i2;
            int deflate = z2 ? deflater.deflate(bArr, i2, i3, 2) : deflater.deflate(bArr, i2, i3);
            if (deflate > 0) {
                f2.f2843c += deflate;
                buffer.f2324b += (long) deflate;
                bufferedSink.emitCompleteSegments();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (f2.f2842b == f2.f2843c) {
            buffer.f2323a = f2.a();
            j.m(f2);
        }
    }

    public void close() {
        Deflater deflater = this.f2331b;
        if (!this.f2332c) {
            try {
                deflater.finish();
                a(false);
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
                this.f2330a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f2332c = true;
            if (th != null) {
                Charset charset = m.f2858a;
                throw th;
            }
        }
    }

    public void flush() {
        a(true);
        this.f2330a.flush();
    }

    public Timeout timeout() {
        return this.f2330a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f2330a + ")";
    }

    public void write(Buffer buffer, long j2) {
        m.b(buffer.f2324b, 0, j2);
        while (j2 > 0) {
            i iVar = buffer.f2323a;
            int min = (int) Math.min(j2, (long) (iVar.f2843c - iVar.f2842b));
            this.f2331b.setInput(iVar.f2841a, iVar.f2842b, min);
            a(false);
            long j3 = (long) min;
            buffer.f2324b -= j3;
            int i2 = iVar.f2842b + min;
            iVar.f2842b = i2;
            if (i2 == iVar.f2843c) {
                buffer.f2323a = iVar.a();
                j.m(iVar);
            }
            j2 -= j3;
        }
    }
}
