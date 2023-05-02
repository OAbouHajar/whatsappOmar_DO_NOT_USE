package X;

import java.io.OutputStream;

/* renamed from: X.00K  reason: invalid class name */
public final class AnonymousClass00K extends OutputStream {
    public final OutputStream A00;
    public final OutputStream A01;

    public AnonymousClass00K(OutputStream outputStream, OutputStream outputStream2) {
        this.A00 = outputStream;
        this.A01 = outputStream2;
    }

    public void close() {
        try {
            this.A00.close();
        } finally {
            this.A01.close();
        }
    }

    public void flush() {
        this.A00.flush();
        this.A01.flush();
    }

    public void write(int i2) {
        this.A00.write(i2);
        this.A01.write(i2);
    }

    public void write(byte[] bArr) {
        this.A00.write(bArr);
        this.A01.write(bArr);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.A00.write(bArr, i2, i3);
        this.A01.write(bArr, i2, i3);
    }
}
