package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* renamed from: X.59H  reason: invalid class name */
public final class AnonymousClass59H implements C109945Uk {
    public final InputStream A00;
    public final C85634Pf A01;

    public AnonymousClass59H(InputStream inputStream, C85634Pf r2) {
        this.A00 = inputStream;
        this.A01 = r2;
    }

    public long AbQ(C11050i7 r6, long j2) {
        String message;
        if (j2 == 0) {
            return 0;
        }
        if (j2 >= 0) {
            try {
                if (!Thread.interrupted()) {
                    C89434cA A09 = r6.A09(1);
                    int i2 = A09.A00;
                    int read = this.A00.read(A09.A06, i2, (int) Math.min(j2, (long) (8192 - i2)));
                    if (read == -1) {
                        return -1;
                    }
                    A09.A00 += read;
                    long j3 = (long) read;
                    r6.A00 += j3;
                    return j3;
                }
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            } catch (AssertionError e2) {
                if (e2.getCause() == null || (message = e2.getMessage()) == null || !C008603x.A0F(message, "getsockname failed")) {
                    throw e2;
                }
                throw new IOException(e2);
            }
        } else {
            throw AnonymousClass000.A0T(C13680ns.A0j(AnonymousClass000.A0r("byteCount < 0: "), j2));
        }
    }

    public void close() {
        this.A00.close();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.A00, AnonymousClass000.A0r("source("));
    }
}
