package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.044  reason: invalid class name */
public class AnonymousClass044 extends FilterInputStream {
    public int A00;
    public int A01;
    public final byte[] A02;

    public AnonymousClass044(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.A02 = bArr;
    }

    public void mark(int i2) {
        if (this.in.markSupported()) {
            super.mark(i2);
            this.A00 = this.A01;
        }
    }

    public int read() {
        int read = this.in.read();
        if (read != -1) {
            return read;
        }
        int i2 = this.A01;
        byte[] bArr = this.A02;
        if (i2 >= bArr.length) {
            return -1;
        }
        this.A01 = i2 + 1;
        return bArr[i2] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = this.in.read(bArr, i2, i3);
        if (read == -1) {
            read = 0;
            if (i3 != 0) {
                while (read < i3) {
                    int i4 = this.A01;
                    byte[] bArr2 = this.A02;
                    if (i4 >= bArr2.length) {
                        break;
                    }
                    this.A01 = i4 + 1;
                    byte b2 = bArr2[i4] & 255;
                    if (b2 == -1) {
                        break;
                    }
                    bArr[i2 + read] = (byte) b2;
                    read++;
                }
                if (read > 0) {
                    return read;
                }
                return -1;
            }
        }
        return read;
    }

    public void reset() {
        if (this.in.markSupported()) {
            this.in.reset();
            this.A01 = this.A00;
            return;
        }
        throw new IOException("mark is not supported");
    }
}
