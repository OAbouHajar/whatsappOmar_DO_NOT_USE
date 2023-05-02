package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.403  reason: invalid class name */
public final class AnonymousClass403 extends FilterInputStream {
    public long A00 = 1048577;
    public long A01 = -1;

    public AnonymousClass403(InputStream inputStream) {
        super(inputStream);
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.A00);
    }

    public final synchronized void mark(int i2) {
        this.in.mark(i2);
        this.A01 = this.A00;
    }

    public final int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.A00--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.A00;
        if (j2 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i2, (int) Math.min((long) i3, j2));
        if (read != -1) {
            this.A00 -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        IOException iOException;
        if (!this.in.markSupported()) {
            iOException = AnonymousClass3K3.A0e("Mark not supported");
        } else if (this.A01 != -1) {
            this.in.reset();
            this.A00 = this.A01;
        } else {
            iOException = AnonymousClass3K3.A0e("Mark not set");
        }
        throw iOException;
    }

    public final long skip(long j2) {
        long skip = this.in.skip(Math.min(j2, this.A00));
        this.A00 -= skip;
        return skip;
    }
}
