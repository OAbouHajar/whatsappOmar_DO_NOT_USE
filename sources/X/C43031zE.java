package X;

import java.io.InputStream;

/* renamed from: X.1zE  reason: invalid class name and case insensitive filesystem */
public final class C43031zE extends InputStream {
    public long A00 = 0;
    public InputStream A01;
    public byte[] A02 = new byte[1];

    public C43031zE(InputStream inputStream, long j2) {
        this.A01 = inputStream;
        this.A00 = j2;
    }

    public int available() {
        return this.A01.available();
    }

    public void close() {
        this.A01.close();
    }

    public void mark(int i2) {
        throw new IllegalStateException("Can't mark");
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        byte[] bArr = this.A02;
        int read = read(bArr, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return bArr[0] & 255;
        }
        StringBuilder sb = new StringBuilder("OIS unexpected return value: ");
        sb.append(read);
        throw new IllegalStateException(sb.toString());
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = this.A01.read(bArr, i2, i3);
        this.A00 += (long) read;
        return read;
    }

    public void reset() {
        throw new IllegalStateException("Can't reset");
    }

    public long skip(long j2) {
        long skip = this.A01.skip(j2);
        this.A00 += skip;
        return skip;
    }
}
