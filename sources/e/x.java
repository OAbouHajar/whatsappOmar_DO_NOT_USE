package e;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: XFMFile */
public final class x extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f1724a;

    /* renamed from: b  reason: collision with root package name */
    public long f1725b;

    /* renamed from: c  reason: collision with root package name */
    public long f1726c;

    /* renamed from: d  reason: collision with root package name */
    public long f1727d;

    /* renamed from: e  reason: collision with root package name */
    public long f1728e = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1729f = true;

    /* renamed from: g  reason: collision with root package name */
    public final int f1730g = -1;

    public x(InputStream inputStream) {
        this.f1724a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, 4096) : inputStream;
        this.f1730g = 1024;
    }

    public final void a(long j2) {
        if (this.f1725b > this.f1727d || j2 < this.f1726c) {
            throw new IOException("Cannot reset");
        }
        this.f1724a.reset();
        c(this.f1726c, j2);
        this.f1725b = j2;
    }

    public final int available() {
        return this.f1724a.available();
    }

    public final void b(long j2) {
        try {
            long j3 = this.f1726c;
            long j4 = this.f1725b;
            InputStream inputStream = this.f1724a;
            if (j3 < j4) {
                if (j4 <= this.f1727d) {
                    inputStream.reset();
                    inputStream.mark((int) (j2 - this.f1726c));
                    c(this.f1726c, this.f1725b);
                    this.f1727d = j2;
                }
            }
            this.f1726c = j4;
            inputStream.mark((int) (j2 - j4));
            this.f1727d = j2;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: " + e2);
        }
    }

    public final void c(long j2, long j3) {
        while (j2 < j3) {
            long skip = this.f1724a.skip(j3 - j2);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j2 += skip;
        }
    }

    public final void close() {
        this.f1724a.close();
    }

    public final void mark(int i2) {
        long j2 = this.f1725b + ((long) i2);
        if (this.f1727d < j2) {
            b(j2);
        }
        this.f1728e = this.f1725b;
    }

    public final boolean markSupported() {
        return this.f1724a.markSupported();
    }

    public final int read() {
        if (!this.f1729f) {
            long j2 = this.f1727d;
            if (this.f1725b + 1 > j2) {
                b(j2 + ((long) this.f1730g));
            }
        }
        int read = this.f1724a.read();
        if (read != -1) {
            this.f1725b++;
        }
        return read;
    }

    public final int read(byte[] bArr) {
        if (!this.f1729f) {
            long j2 = this.f1725b;
            if (((long) bArr.length) + j2 > this.f1727d) {
                b(j2 + ((long) bArr.length) + ((long) this.f1730g));
            }
        }
        int read = this.f1724a.read(bArr);
        if (read != -1) {
            this.f1725b += (long) read;
        }
        return read;
    }

    public final int read(byte[] bArr, int i2, int i3) {
        if (!this.f1729f) {
            long j2 = this.f1725b;
            long j3 = (long) i3;
            if (j2 + j3 > this.f1727d) {
                b(j2 + j3 + ((long) this.f1730g));
            }
        }
        int read = this.f1724a.read(bArr, i2, i3);
        if (read != -1) {
            this.f1725b += (long) read;
        }
        return read;
    }

    public final void reset() {
        a(this.f1728e);
    }

    public final long skip(long j2) {
        if (!this.f1729f) {
            long j3 = this.f1725b;
            if (j3 + j2 > this.f1727d) {
                b(j3 + j2 + ((long) this.f1730g));
            }
        }
        long skip = this.f1724a.skip(j2);
        this.f1725b += skip;
        return skip;
    }
}
