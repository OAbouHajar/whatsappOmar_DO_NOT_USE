package X;

import java.io.InputStream;

/* renamed from: X.0J9  reason: invalid class name */
public class AnonymousClass0J9 extends InputStream {
    public int A00 = 0;
    public int A01 = 0;
    public final C13600me A02;

    public AnonymousClass0J9(C13600me r2) {
        AnonymousClass0T3.A00(!r2.isClosed());
        this.A02 = r2;
    }

    public int available() {
        return this.A02.size() - this.A01;
    }

    public void mark(int i2) {
        this.A00 = this.A01;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        if (available() <= 0) {
            return -1;
        }
        C13600me r2 = this.A02;
        int i2 = this.A01;
        this.A01 = i2 + 1;
        return r2.AbM(i2) & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (i2 < 0 || i3 < 0 || i2 + i3 > bArr.length) {
            StringBuilder A0r = AnonymousClass000.A0r("length=");
            A0r.append(bArr.length);
            A0r.append("; regionStart=");
            A0r.append(i2);
            A0r.append("; regionLength=");
            throw new ArrayIndexOutOfBoundsException(AnonymousClass000.A0l(A0r, i3));
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i3 <= 0) {
            return 0;
        }
        int min = Math.min(available, i3);
        this.A02.AbS(bArr, this.A01, i2, min);
        this.A01 += min;
        return min;
    }

    public void reset() {
        this.A01 = this.A00;
    }

    public long skip(long j2) {
        boolean z2 = false;
        if (j2 >= 0) {
            z2 = true;
        }
        AnonymousClass0T3.A00(z2);
        int min = Math.min((int) j2, available());
        this.A01 += min;
        return (long) min;
    }
}
