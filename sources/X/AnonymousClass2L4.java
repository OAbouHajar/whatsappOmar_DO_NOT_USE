package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.2L4  reason: invalid class name */
public final class AnonymousClass2L4 extends FilterInputStream {
    public int A00;

    public AnonymousClass2L4(InputStream inputStream, int i2) {
        super(inputStream);
        this.A00 = i2;
    }

    public int available() {
        return Math.min(super.available(), this.A00);
    }

    public int read() {
        if (this.A00 <= 0) {
            return -1;
        }
        int read = super.read();
        if (read < 0) {
            return read;
        }
        this.A00--;
        return read;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int i4 = this.A00;
        if (i4 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i2, Math.min(i3, i4));
        if (read < 0) {
            return read;
        }
        this.A00 -= read;
        return read;
    }

    public long skip(long j2) {
        long skip = super.skip(Math.min(j2, (long) this.A00));
        if (skip >= 0) {
            this.A00 = (int) (((long) this.A00) - skip);
        }
        return skip;
    }
}
