package X;

import java.io.OutputStream;

/* renamed from: X.20F  reason: invalid class name */
public class AnonymousClass20F extends OutputStream {
    public long A00;
    public final int A01;
    public final OutputStream A02;

    public AnonymousClass20F(OutputStream outputStream, int i2) {
        this.A02 = outputStream;
        this.A01 = i2;
    }

    public void write(int i2) {
        if (this.A00 < ((long) this.A01)) {
            this.A02.write(i2);
            this.A00++;
        }
    }
}
