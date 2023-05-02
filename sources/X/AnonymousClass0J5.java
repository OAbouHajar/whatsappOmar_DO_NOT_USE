package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0J5  reason: invalid class name */
public class AnonymousClass0J5 extends FilterInputStream {
    public int A00;
    public int A01;

    public AnonymousClass0J5(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 >= 0) {
            this.A00 = i2;
            this.A01 = -1;
            return;
        }
        throw AnonymousClass000.A0T("limit must be >= 0");
    }

    public int available() {
        return Math.min(this.in.available(), this.A00);
    }

    public void mark(int i2) {
        if (this.in.markSupported()) {
            this.in.mark(i2);
            this.A01 = this.A00;
        }
    }

    public int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.A00--;
        }
        return read;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int i4 = this.A00;
        if (i4 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i2, Math.min(i3, i4));
        if (read <= 0) {
            return read;
        }
        this.A00 -= read;
        return read;
    }

    public void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.A01 != -1) {
            this.in.reset();
            this.A00 = this.A01;
        } else {
            throw new IOException("mark not set");
        }
    }

    public long skip(long j2) {
        long skip = this.in.skip(Math.min(j2, (long) this.A00));
        this.A00 = (int) (((long) this.A00) - skip);
        return skip;
    }
}
