package X;

import java.io.InputStream;

/* renamed from: X.1zU  reason: invalid class name and case insensitive filesystem */
public class C43191zU extends InputStream {
    public boolean A00;
    public final InputStream A01;
    public final InputStream A02;

    public C43191zU(InputStream inputStream, InputStream inputStream2) {
        this.A01 = inputStream;
        this.A02 = inputStream2;
    }

    public int available() {
        return this.A00 ? this.A02.available() : this.A01.available() + this.A02.available();
    }

    public void close() {
        this.A01.close();
        this.A02.close();
    }

    public synchronized void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        if (!this.A00) {
            int read = this.A01.read();
            if (read >= 0) {
                return read;
            }
            this.A00 = true;
        }
        return this.A02.read();
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (!this.A00) {
            int read = this.A01.read(bArr, i2, i3);
            if (read >= 0) {
                return read;
            }
            this.A00 = true;
        }
        return this.A02.read(bArr, i2, i3);
    }

    public synchronized void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j2) {
        if (this.A00) {
            return this.A02.skip(j2);
        }
        long skip = this.A01.skip(j2);
        if (skip >= j2) {
            return skip;
        }
        this.A00 = true;
        return skip + this.A02.skip(j2 - skip);
    }
}
