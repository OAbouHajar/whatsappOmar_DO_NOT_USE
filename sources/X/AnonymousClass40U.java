package X;

import java.io.InputStream;

/* renamed from: X.40U  reason: invalid class name */
public abstract class AnonymousClass40U extends InputStream {
    public int A00;
    public final InputStream A01;

    public AnonymousClass40U(InputStream inputStream, int i2) {
        this.A01 = inputStream;
        this.A00 = i2;
    }

    public void A00() {
        InputStream inputStream = this.A01;
        if (inputStream instanceof AnonymousClass5J3) {
            AnonymousClass5J3 r1 = (AnonymousClass5J3) inputStream;
            r1.A02 = true;
            r1.A01();
        }
    }
}
