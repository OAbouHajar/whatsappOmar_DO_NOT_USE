package X;

import java.io.InputStream;

/* renamed from: X.40T  reason: invalid class name */
public class AnonymousClass40T extends InputStream {
    public int A00;
    public InputStream A01;

    public AnonymousClass40T(InputStream inputStream, int i2) {
        this.A01 = inputStream;
        this.A00 = i2;
    }

    public int read() {
        int i2 = this.A00;
        if (i2 <= 0) {
            return -1;
        }
        this.A00 = i2 - 1;
        return this.A01.read();
    }
}
