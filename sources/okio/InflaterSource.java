package okio;

import a.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import z.i;
import z.j;

/* compiled from: XFMFile */
public final class InflaterSource implements Source {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSource f2350a;

    /* renamed from: b  reason: collision with root package name */
    public final Inflater f2351b;

    /* renamed from: c  reason: collision with root package name */
    public int f2352c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2353d;

    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
        if (bufferedSource == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f2350a = bufferedSource;
            this.f2351b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.buffer(source), inflater);
    }

    public void close() {
        if (!this.f2353d) {
            this.f2351b.end();
            this.f2353d = true;
            this.f2350a.close();
        }
    }

    public long read(Buffer buffer, long j2) {
        i f2;
        Inflater inflater = this.f2351b;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException(a.e("byteCount < 0: ", j2));
        } else if (this.f2353d) {
            throw new IllegalStateException("closed");
        } else if (i2 == 0) {
            return 0;
        } else {
            while (true) {
                boolean refill = refill();
                try {
                    f2 = buffer.f(1);
                    int inflate = inflater.inflate(f2.f2841a, f2.f2843c, (int) Math.min(j2, (long) (8192 - f2.f2843c)));
                    if (inflate > 0) {
                        f2.f2843c += inflate;
                        long j3 = (long) inflate;
                        buffer.f2324b += j3;
                        return j3;
                    } else if (inflater.finished()) {
                        break;
                    } else if (inflater.needsDictionary()) {
                        break;
                    } else if (refill) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            int i3 = this.f2352c;
            if (i3 != 0) {
                int remaining = i3 - inflater.getRemaining();
                this.f2352c -= remaining;
                this.f2350a.skip((long) remaining);
            }
            if (f2.f2842b != f2.f2843c) {
                return -1;
            }
            buffer.f2323a = f2.a();
            j.m(f2);
            return -1;
        }
    }

    public boolean refill() {
        Inflater inflater = this.f2351b;
        if (!inflater.needsInput()) {
            return false;
        }
        int i2 = this.f2352c;
        BufferedSource bufferedSource = this.f2350a;
        if (i2 != 0) {
            int remaining = i2 - inflater.getRemaining();
            this.f2352c -= remaining;
            bufferedSource.skip((long) remaining);
        }
        if (inflater.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (bufferedSource.exhausted()) {
            return true;
        } else {
            i iVar = bufferedSource.buffer().f2323a;
            int i3 = iVar.f2843c;
            int i4 = iVar.f2842b;
            int i5 = i3 - i4;
            this.f2352c = i5;
            inflater.setInput(iVar.f2841a, i4, i5);
            return false;
        }
    }

    public Timeout timeout() {
        return this.f2350a.timeout();
    }
}
