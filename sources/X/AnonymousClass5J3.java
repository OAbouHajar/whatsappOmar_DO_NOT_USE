package X;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.5J3  reason: invalid class name */
public class AnonymousClass5J3 extends AnonymousClass40U {
    public int A00;
    public int A01;
    public boolean A02 = true;
    public boolean A03 = false;

    public AnonymousClass5J3(InputStream inputStream, int i2) {
        super(inputStream, i2);
        this.A00 = inputStream.read();
        int read = inputStream.read();
        this.A01 = read;
        if (read >= 0) {
            A01();
            return;
        }
        throw new EOFException();
    }

    public final boolean A01() {
        if (!this.A03 && this.A02 && this.A00 == 0 && this.A01 == 0) {
            this.A03 = true;
            A00();
        }
        return this.A03;
    }

    public int read() {
        if (A01()) {
            return -1;
        }
        int read = this.A01.read();
        if (read >= 0) {
            int i2 = this.A00;
            this.A00 = this.A01;
            this.A01 = read;
            return i2;
        }
        throw new EOFException();
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (this.A02 || i3 < 3) {
            return super.read(bArr, i2, i3);
        }
        if (this.A03) {
            return -1;
        }
        InputStream inputStream = this.A01;
        int read = inputStream.read(bArr, i2 + 2, i3 - 2);
        if (read >= 0) {
            bArr[AnonymousClass3K4.A0C(bArr, this.A00, i2)] = (byte) this.A01;
            this.A00 = inputStream.read();
            int read2 = inputStream.read();
            this.A01 = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
