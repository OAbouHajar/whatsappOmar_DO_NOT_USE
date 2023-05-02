package X;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.5J4  reason: invalid class name */
public class AnonymousClass5J4 extends AnonymousClass40U {
    public static final byte[] A02 = new byte[0];
    public int A00;
    public final int A01;

    public AnonymousClass5J4(InputStream inputStream, int i2, int i3) {
        super(inputStream, i3);
        this.A01 = i2;
        this.A00 = i2;
        if (i2 == 0) {
            A00();
        }
    }

    public byte[] A01() {
        int i2 = this.A00;
        if (i2 == 0) {
            return A02;
        }
        int i3 = this.A00;
        if (i2 < i3) {
            byte[] bArr = new byte[i2];
            InputStream inputStream = this.A01;
            int i4 = 0;
            while (i4 < i2) {
                int read = inputStream.read(bArr, i4, i2 - i4);
                if (read < 0) {
                    break;
                }
                i4 += read;
            }
            int i5 = i2 - i4;
            this.A00 = i5;
            if (i5 == 0) {
                A00();
                return bArr;
            }
            StringBuilder A0r = AnonymousClass000.A0r("DEF length ");
            A0r.append(this.A01);
            throw new EOFException(C13680ns.A0i(" object truncated by ", A0r, i5));
        }
        StringBuilder A0r2 = AnonymousClass000.A0r("corrupted stream - out of bounds length found: ");
        A0r2.append(i2);
        throw AnonymousClass3K3.A0e(C13680ns.A0i(" >= ", A0r2, i3));
    }

    public int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A01.read();
        if (read >= 0) {
            int i2 = this.A00 - 1;
            this.A00 = i2;
            if (i2 != 0) {
                return read;
            }
            A00();
            return read;
        }
        StringBuilder A0r = AnonymousClass000.A0r("DEF length ");
        A0r.append(this.A01);
        A0r.append(" object truncated by ");
        throw new EOFException(AnonymousClass000.A0l(A0r, this.A00));
    }

    public int read(byte[] bArr, int i2, int i3) {
        int i4 = this.A00;
        if (i4 == 0) {
            return -1;
        }
        int read = this.A01.read(bArr, i2, Math.min(i3, i4));
        if (read >= 0) {
            int i5 = this.A00 - read;
            this.A00 = i5;
            if (i5 != 0) {
                return read;
            }
            A00();
            return read;
        }
        StringBuilder A0r = AnonymousClass000.A0r("DEF length ");
        A0r.append(this.A01);
        A0r.append(" object truncated by ");
        throw new EOFException(AnonymousClass000.A0l(A0r, this.A00));
    }
}
